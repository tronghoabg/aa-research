package com.waze.gw;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.waze.gw.HlpProtocol;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
final class HudConnectionManager implements HudSessionListener {
    private static final String PREFS = "waze_hud_gw";
    private static final String TAG = "WazeHudLink";
    private volatile HudTransport activeTransport;
    private final Context context;
    private final HudDeviceRepository devices;
    private volatile long generation;
    private final Listener listener;
    private final SharedPreferences prefs;
    private volatile ScheduledFuture<?> retryFuture;
    private volatile HudProtocolSession session;
    private volatile boolean stopped;
    private volatile ScheduledFuture<?> tickFuture;
    private final ReconnectPolicy reconnect = new ReconnectPolicy();
    private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
    private final Object lifecycleLock = new Object();
    private volatile State state = State.IDLE;

    interface Listener {
        void onStateChanged(State state, String str);
    }

    enum State {
        DISABLED,
        PERMISSION_REQUIRED,
        BLUETOOTH_OFF,
        IDLE,
        CONNECTING,
        HANDSHAKING,
        CONNECTED,
        RETRY_WAIT,
        DISCONNECTING,
        ERROR
    }

    HudConnectionManager(Context context, Listener listener) {
        this.context = context.getApplicationContext();
        this.prefs = this.context.getSharedPreferences(PREFS, 0);
        this.devices = new HudDeviceRepository(this.context);
        this.listener = listener;
    }

    void start() {
        synchronized (this.lifecycleLock) {
            if (this.stopped) {
                return;
            }
            this.stopped = false;
            this.executor.execute(new Runnable() { // from class: com.waze.gw.HudConnectionManager.1
                @Override // java.lang.Runnable
                public void run() {
                    HudConnectionManager.this.connectIfNeeded();
                }
            });
        }
    }

    void retryNow() {
        this.executor.execute(new Runnable() { // from class: com.waze.gw.HudConnectionManager.2
            @Override // java.lang.Runnable
            public void run() {
                HudConnectionManager.this.cancelRetry();
                HudConnectionManager.this.reconnect.reset();
                HudConnectionManager.this.connectIfNeeded();
            }
        });
    }

    void reconfigure() {
        this.executor.execute(new Runnable() { // from class: com.waze.gw.HudConnectionManager.3
            @Override // java.lang.Runnable
            public void run() {
                if (HudConnectionManager.this.stopped) {
                    return;
                }
                HudConnectionManager.this.generation++;
                HudConnectionManager.this.cancelRetry();
                HudConnectionManager.this.reconnect.reset();
                HudConnectionManager.this.closeActive();
                HudConnectionManager.this.updateState(State.IDLE, "configuration changed");
                HudConnectionManager.this.connectIfNeeded();
            }
        });
    }

    void onBluetoothEnvironmentChanged() {
        this.executor.execute(new Runnable() { // from class: com.waze.gw.HudConnectionManager.4
            @Override // java.lang.Runnable
            public void run() {
                if (HudConnectionManager.this.stopped || !HudConnectionManager.this.enabled()) {
                    return;
                }
                if (HudConnectionManager.this.state == State.BLUETOOTH_OFF || HudConnectionManager.this.state == State.RETRY_WAIT || HudConnectionManager.this.state == State.ERROR || HudConnectionManager.this.state == State.IDLE) {
                    HudConnectionManager.this.cancelRetry();
                    HudConnectionManager.this.connectIfNeeded();
                }
            }
        });
    }

    void applyDeviceConfig(final long j2, Map<String, Object> map) {
        final LinkedHashMap linkedHashMap;
        if (map == null) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = new LinkedHashMap(map);
        }
        this.executor.execute(new Runnable(this) { // from class: com.waze.gw.HudConnectionManager.5
            final /* synthetic */ HudConnectionManager this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                HudProtocolSession hudProtocolSession = this.this$0.session;
                if ((this.this$0.stopped || hudProtocolSession == null || this.this$0.state != State.CONNECTED || !(hudProtocolSession instanceof HudConfigurableSession) || !((HudConfigurableSession) hudProtocolSession).applyDeviceConfig(j2, linkedHashMap)) && !"applying".equals(HudDeviceConfig.snapshot().applyState)) {
                    HudDeviceConfig.applyFailedCurrent("HUD chưa kết nối hoặc cấu hình đã thay đổi");
                }
            }
        });
    }

    void stop() {
        synchronized (this.lifecycleLock) {
            this.stopped = true;
            this.generation++;
        }
        cancelRetry();
        ScheduledFuture<?> scheduledFuture = this.tickFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        HudTransport hudTransport = this.activeTransport;
        if (hudTransport != null) {
            hudTransport.disconnect();
        }
        HudProtocolSession hudProtocolSession = this.session;
        if (hudProtocolSession != null) {
            hudProtocolSession.stop();
        }
        this.activeTransport = null;
        this.session = null;
        updateState(State.DISABLED, "local shutdown");
        this.executor.shutdownNow();
    }

    State state() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean enabled() {
        return this.devices.isActiveEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectIfNeeded() {
        String str;
        if (this.stopped || !enabled()) {
            updateState(State.DISABLED, "disabled");
            return;
        }
        HudTransport hudTransport = this.activeTransport;
        if (hudTransport == null || !(this.state == State.CONNECTING || this.state == State.HANDSHAKING || hudTransport.isConnected())) {
            HudProtocolFamily hudProtocolFamilyActiveFamily = this.devices.activeFamily();
            int iEffectiveTransport = this.devices.effectiveTransport(hudProtocolFamilyActiveFamily);
            if (!hasRequiredPermissions(iEffectiveTransport)) {
                updateState(State.PERMISSION_REQUIRED, "Nearby Devices permission required");
                return;
            }
            if (iEffectiveTransport != 3 && !isBluetoothEnabled()) {
                updateState(State.BLUETOOTH_OFF, "Bluetooth is off");
                return;
            }
            if (!HudFeatureFlags.isRuntimeEnabled(hudProtocolFamilyActiveFamily)) {
                updateState(State.IDLE, hudProtocolFamilyActiveFamily.preferenceValue() + " runtime is not enabled");
                return;
            }
            if (!HudProtocolSessionFactory.hasRuntimeSession(hudProtocolFamilyActiveFamily)) {
                updateState(State.IDLE, hudProtocolFamilyActiveFamily.preferenceValue() + " protocol is pending validation");
                return;
            }
            if (!this.devices.hasSelection(hudProtocolFamilyActiveFamily)) {
                updateState(State.IDLE, iEffectiveTransport == 3 ? "No WebSocket endpoint configured" : "No device selected");
                return;
            }
            final long j2 = this.generation + 1;
            this.generation = j2;
            try {
                final HudTransport hudTransportCreateTransport = createTransport(hudProtocolFamilyActiveFamily);
                this.activeTransport = hudTransportCreateTransport;
                final HudProtocolSession hudProtocolSessionCreate = HudProtocolSessionFactory.create(this.context, hudProtocolFamilyActiveFamily, hudTransportCreateTransport, this);
                this.session = hudProtocolSessionCreate;
                hudProtocolSessionCreate.prepare();
                hudTransportCreateTransport.setListener(listenerFor(hudTransportCreateTransport, j2));
                updateState(State.CONNECTING, hudTransportCreateTransport.transportName());
                try {
                    hudTransportCreateTransport.connect();
                } catch (SecurityException e2) {
                    e = e2;
                } catch (Exception e3) {
                    e = e3;
                }
                try {
                    if (this.stopped || j2 != this.generation || !enabled()) {
                        hudTransportCreateTransport.disconnect();
                        return;
                    }
                    updateState(State.HANDSHAKING, hudTransportCreateTransport.transportName());
                    hudProtocolSessionCreate.startHandshake();
                    if (!hudTransportCreateTransport.isConnected()) {
                        fail("REMOTE_DISCONNECT", "transport disconnected during handshake");
                        return;
                    }
                    String strTransportName = hudTransportCreateTransport.transportName();
                    if (hudProtocolFamilyActiveFamily == HudProtocolFamily.HLP1 && (hudProtocolSessionCreate instanceof HlpProtocol.Session)) {
                        str = strTransportName + (((HlpProtocol.Session) hudProtocolSessionCreate).hasPeerActivity() ? " • duplex" : " • one-way/legacy");
                    } else {
                        str = strTransportName + " • " + hudProtocolSessionCreate.protocolName();
                    }
                    updateState(State.CONNECTED, str);
                    scheduleTicker(hudProtocolSessionCreate, j2);
                    this.executor.schedule(new Runnable(this) { // from class: com.waze.gw.HudConnectionManager.6
                        final /* synthetic */ HudConnectionManager this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            if (!this.this$0.stopped && j2 == this.this$0.generation && this.this$0.session == hudProtocolSessionCreate && this.this$0.activeTransport == hudTransportCreateTransport && hudTransportCreateTransport.isConnected()) {
                                this.this$0.reconnect.reset();
                            }
                        }
                    }, 30L, TimeUnit.SECONDS);
                } catch (SecurityException e4) {
                    e = e4;
                    fail("PERMISSION", e.getMessage());
                } catch (Exception e5) {
                    e = e5;
                    fail("CONNECTION_FAILED", e.getMessage());
                }
            } catch (Throwable th) {
                fail("DEVICE_NOT_FOUND", th.getMessage());
            }
        }
    }

    private void scheduleTicker(final HudProtocolSession hudProtocolSession, final long j2) {
        ScheduledFuture<?> scheduledFuture = this.tickFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.tickFuture = this.executor.scheduleAtFixedRate(new Runnable(this) { // from class: com.waze.gw.HudConnectionManager.7
            final /* synthetic */ HudConnectionManager this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.stopped || j2 != this.this$0.generation || hudProtocolSession != this.this$0.session) {
                    return;
                }
                hudProtocolSession.tick(SystemClock.elapsedRealtime(), HudCanonicalState.capture(this.this$0.context));
            }
        }, 0L, 50L, TimeUnit.MILLISECONDS);
    }

    private HudTransport createTransport(HudProtocolFamily hudProtocolFamily) throws IOException {
        int iEffectiveTransport = this.devices.effectiveTransport(hudProtocolFamily);
        if (iEffectiveTransport == 3) {
            if (hudProtocolFamily != HudProtocolFamily.HLP1) {
                throw new IOException("Wi-Fi WebSocket currently supports HLP/1 only");
            }
            return new WebSocketHudTransport(this.context, this.devices);
        }
        if (iEffectiveTransport == 2 || (iEffectiveTransport == 0 && hudProtocolFamily != HudProtocolFamily.HLP1)) {
            return new BleGattHudTransport(this.context, this.devices, HudProtocolSessionFactory.gattProfile(hudProtocolFamily), hudProtocolFamily);
        }
        if (hudProtocolFamily == HudProtocolFamily.VIETMAP_H50) {
            throw new IOException("VietMap H50 requires its BLE transport");
        }
        return new RfcommHudTransport(this.context, this.devices, hudProtocolFamily);
    }

    private boolean hasRequiredPermissions(int i2) {
        if (i2 != 3 && Build.VERSION.SDK_INT >= 31) {
            return this.context.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0 && this.context.checkSelfPermission("android.permission.BLUETOOTH_SCAN") == 0;
        }
        return true;
    }

    private boolean isBluetoothEnabled() {
        try {
            BluetoothManager bluetoothManager = (BluetoothManager) this.context.getSystemService("bluetooth");
            BluetoothAdapter adapter = bluetoothManager == null ? null : bluetoothManager.getAdapter();
            if (adapter != null) {
                return adapter.isEnabled();
            }
            return false;
        } catch (SecurityException e2) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fail(String str, String str2) {
        Log.w(TAG, "fail " + str + ": " + (str2 == null ? "" : str2));
        this.generation++;
        closeActive();
        if ("PERMISSION".equals(str)) {
            updateState(State.PERMISSION_REQUIRED, str2);
            return;
        }
        if ("BLUETOOTH_OFF".equals(str)) {
            updateState(State.BLUETOOTH_OFF, str2);
            return;
        }
        if (this.stopped || !enabled()) {
            updateState(State.DISABLED, str2);
        } else if ("DEVICE_NOT_FOUND".equals(str) || "DEVICE_NOT_BONDED".equals(str)) {
            updateState(State.IDLE, str2);
        } else {
            scheduleRetry(str + (str2 != null ? ": " + str2 : ""));
        }
    }

    private void scheduleRetry(String str) {
        cancelRetry();
        long jNextDelayMs = this.reconnect.nextDelayMs();
        Log.i(TAG, "retry in " + jNextDelayMs + " ms: " + str);
        updateState(State.RETRY_WAIT, str + " (retry in " + jNextDelayMs + " ms)");
        this.retryFuture = this.executor.schedule(new Runnable() { // from class: com.waze.gw.HudConnectionManager.8
            @Override // java.lang.Runnable
            public void run() {
                HudConnectionManager.this.connectIfNeeded();
            }
        }, jNextDelayMs, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeActive() {
        ScheduledFuture<?> scheduledFuture = this.tickFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.tickFuture = null;
        HudProtocolSession hudProtocolSession = this.session;
        this.session = null;
        if (hudProtocolSession != null) {
            hudProtocolSession.stop();
        }
        HudTransport hudTransport = this.activeTransport;
        this.activeTransport = null;
        if (hudTransport != null) {
            hudTransport.disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelRetry() {
        ScheduledFuture<?> scheduledFuture = this.retryFuture;
        this.retryFuture = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateState(State state, String str) {
        Log.i(TAG, "state=" + String.valueOf(state) + " detail=" + (str == null ? "" : str));
        this.state = state;
        this.prefs.edit().putString("hud_link_status", state.name()).putString("hud_link_error", str == null ? "" : str).putLong("hud_link_status_at", SystemClock.elapsedRealtime()).apply();
        if (this.listener != null) {
            Listener listener = this.listener;
            if (str == null) {
                str = "";
            }
            listener.onStateChanged(state, str);
        }
    }

    private HudTransportListener listenerFor(final HudTransport hudTransport, final long j2) {
        return new HudTransportListener(this) { // from class: com.waze.gw.HudConnectionManager.9
            final /* synthetic */ HudConnectionManager this$0;

            {
                this.this$0 = this;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean isCurrent() {
                return !this.this$0.stopped && this.this$0.activeTransport == hudTransport && this.this$0.generation == j2;
            }

            @Override // com.waze.gw.HudTransportListener
            public void onTransportBytes(byte[] bArr, int i2) {
                HudProtocolSession hudProtocolSession;
                if (isCurrent() && (hudProtocolSession = this.this$0.session) != null) {
                    hudProtocolSession.accept(bArr, i2);
                }
            }

            @Override // com.waze.gw.HudTransportListener
            public void onTransportConnected() {
            }

            @Override // com.waze.gw.HudTransportListener
            public void onTransportDisconnected(final String str) {
                this.this$0.executor.execute(new Runnable(this) { // from class: com.waze.gw.HudConnectionManager.9.1
                    final /* synthetic */ AnonymousClass9 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (isCurrent()) {
                            this.this$1.this$0.fail("REMOTE_DISCONNECT", str);
                        }
                    }
                });
            }

            @Override // com.waze.gw.HudTransportListener
            public void onTransportError(final String str, final Throwable th) {
                this.this$0.executor.execute(new Runnable(this) { // from class: com.waze.gw.HudConnectionManager.9.2
                    final /* synthetic */ AnonymousClass9 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        if (isCurrent()) {
                            this.this$1.this$0.fail(str, th == null ? "" : th.getMessage());
                        }
                    }
                });
            }
        };
    }

    @Override // com.waze.gw.HudSessionListener
    public void onSessionConnected(String str, int i2) {
        if (this.stopped || this.session == null) {
            return;
        }
        this.prefs.edit().putInt("hud_link_negotiated_rate", i2).putString("hud_link_active_transport", str).apply();
    }

    @Override // com.waze.gw.HudSessionListener
    public void onSessionDisconnected(final String str) {
        final HudProtocolSession hudProtocolSession = this.session;
        this.executor.execute(new Runnable(this) { // from class: com.waze.gw.HudConnectionManager.10
            final /* synthetic */ HudConnectionManager this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.this$0.stopped && hudProtocolSession != null && hudProtocolSession == this.this$0.session) {
                    this.this$0.fail("REMOTE_DISCONNECT", str);
                }
            }
        });
    }

    @Override // com.waze.gw.HudSessionListener
    public void onSessionError(final String str, final String str2) {
        final HudProtocolSession hudProtocolSession = this.session;
        this.executor.execute(new Runnable(this) { // from class: com.waze.gw.HudConnectionManager.11
            final /* synthetic */ HudConnectionManager this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!this.this$0.stopped && hudProtocolSession != null && hudProtocolSession == this.this$0.session) {
                    this.this$0.fail(str, str2);
                }
            }
        });
    }

    @Override // com.waze.gw.HudSessionListener
    public void onSessionWantsDisconnect() {
        final HudProtocolSession hudProtocolSession = this.session;
        this.executor.execute(new Runnable(this) { // from class: com.waze.gw.HudConnectionManager.12
            final /* synthetic */ HudConnectionManager this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.stopped || hudProtocolSession == null || hudProtocolSession != this.this$0.session) {
                    return;
                }
                this.this$0.generation++;
                this.this$0.closeActive();
                this.this$0.updateState(State.IDLE, "peer requested disconnect");
            }
        });
    }

    @Override // com.waze.gw.HudSessionListener
    public void onSessionPeerActivity(final String str, final long j2) {
        final HudProtocolSession hudProtocolSession = this.session;
        this.executor.execute(new Runnable(this) { // from class: com.waze.gw.HudConnectionManager.13
            final /* synthetic */ HudConnectionManager this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.stopped || hudProtocolSession == null || hudProtocolSession != this.this$0.session) {
                    return;
                }
                this.this$0.prefs.edit().putBoolean("hud_link_peer_seen", true).putLong("hud_link_peer_last_at", j2).putString("hud_link_peer_last_type", str == null ? "" : str).apply();
                if (this.this$0.state == State.CONNECTED && this.this$0.activeTransport != null) {
                    this.this$0.updateState(State.CONNECTED, this.this$0.activeTransport.transportName() + " • duplex • RX " + (str == null ? TypedValues.AttributesType.S_FRAME : str));
                }
            }
        });
    }
}
