package com.waze.gw;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import com.waze.gw.HudConnectionManager;
import com.waze.strings.DisplayStrings;
import java.util.Map;

/* loaded from: classes10.dex */
public final class HudLinkService extends Service implements HudConnectionManager.Listener {
    static final String ACTION_RECONFIGURE = "com.waze.gw.HUD_LINK_RECONFIGURE";
    static final String ACTION_RETRY = "com.waze.gw.HUD_LINK_RETRY";
    static final String ACTION_STATUS_CHANGED = "com.waze.gw.HUD_LINK_STATUS_CHANGED";
    private static final String CHANNEL = "waze_hud_link";
    private static final int NOTIFICATION_ID = 4740420;
    private static final String TAG = "WazeHudLink";
    private static volatile HudLinkService activeInstance;
    private static volatile boolean running;
    private HudConnectionManager manager;
    private final BroadcastReceiver stateReceiver = new BroadcastReceiver() { // from class: com.waze.gw.HudLinkService.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (HudLinkService.this.manager == null) {
                return;
            }
            String action = intent == null ? "" : intent.getAction();
            if (BluetoothAdapterActions.isEnvironmentAction(action)) {
                HudLinkService.this.manager.onBluetoothEnvironmentChanged();
            } else if (HudLinkService.ACTION_RETRY.equals(action)) {
                HudLinkService.this.manager.retryNow();
            }
        }
    };

    public static void startFromUser(Context context) {
        startWithAction(context, null);
    }

    static void startFromRuntime(Context context) {
        startWithAction(context, null);
    }

    static boolean isRunning() {
        return running;
    }

    static boolean applyDeviceConfig(long j2, Map<String, Object> map) {
        HudLinkService hudLinkService = activeInstance;
        if (hudLinkService == null || hudLinkService.manager == null) {
            return false;
        }
        hudLinkService.manager.applyDeviceConfig(j2, map);
        return true;
    }

    public static void reconfigure(Context context) {
        startWithAction(context, ACTION_RECONFIGURE);
    }

    private static void startWithAction(Context context, String str) {
        if (context == null || Gateway.isExplicitShutdownRequested()) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) HudLinkService.class);
        if (str != null) {
            intent.setAction(str);
        }
        try {
            if (Build.VERSION.SDK_INT < 26) {
                applicationContext.startService(intent);
            } else {
                applicationContext.startForegroundService(intent);
            }
        } catch (Throwable th) {
            Log.w(TAG, "Unable to start HUD Link service", th);
            try {
                applicationContext.getSharedPreferences("waze_hud_gw", 0).edit().putString("hud_link_status", "START_BLOCKED").putString("hud_link_error", th.getClass().getSimpleName()).apply();
            } catch (Throwable th2) {
            }
        }
    }

    public static void stop(Context context) {
        if (context == null) {
            return;
        }
        try {
            context.getApplicationContext().stopService(new Intent(context.getApplicationContext(), (Class<?>) HudLinkService.class));
        } catch (Throwable th) {
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        running = true;
        activeInstance = this;
        Log.i(TAG, "HUD Link service created");
        createChannel();
        this.manager = new HudConnectionManager(this, this);
        registerStateReceiver();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        if (Gateway.isExplicitShutdownRequested()) {
            stopSelf();
            return 2;
        }
        if (!new HudDeviceRepository(this).isActiveEnabled()) {
            stopSelf();
            return 2;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                startForeground(NOTIFICATION_ID, notification("Starting HUD Link"), 16);
            } else {
                startForeground(NOTIFICATION_ID, notification("Starting HUD Link"));
            }
            if (intent == null || !ACTION_RETRY.equals(intent.getAction())) {
                if (intent != null && ACTION_RECONFIGURE.equals(intent.getAction())) {
                    this.manager.reconfigure();
                    return 1;
                }
                this.manager.start();
                return 1;
            }
            this.manager.retryNow();
            return 1;
        } catch (Throwable th) {
            getSharedPreferences("waze_hud_gw", 0).edit().putString("hud_link_status", "ERROR").putString("hud_link_error", String.valueOf(th.getMessage())).apply();
            stopSelf();
            return 2;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        running = false;
        if (activeInstance == this) {
            activeInstance = null;
        }
        Log.i(TAG, "HUD Link service destroyed");
        try {
            unregisterReceiver(this.stateReceiver);
        } catch (Throwable th) {
        }
        if (this.manager != null) {
            this.manager.stop();
        }
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        Log.i(TAG, "Waze task removed; stopping HUD Link and Waze process");
        Gateway.onTaskRemoved();
        super.onTaskRemoved(intent);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.waze.gw.HudConnectionManager.Listener
    public void onStateChanged(HudConnectionManager.State state, String str) {
        try {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (notificationManager != null) {
                String strLocalizedDetail = localizedDetail(str);
                String strLocalizedState = localizedState(state.name());
                if (strLocalizedDetail.length() > 0) {
                    strLocalizedState = strLocalizedState + ": " + strLocalizedDetail;
                }
                notificationManager.notify(NOTIFICATION_ID, notification(strLocalizedState));
            }
            sendBroadcast(new Intent(ACTION_STATUS_CHANGED).setPackage(getPackageName()));
        } catch (Throwable th) {
        }
    }

    static String localizedState(String str) {
        return "DISABLED".equals(str) ? "Đã tắt" : "PERMISSION_REQUIRED".equals(str) ? "Cần cấp quyền Bluetooth" : "BLUETOOTH_OFF".equals(str) ? "Bluetooth đang tắt" : "IDLE".equals(str) ? "Đang chờ" : "CONNECTING".equals(str) ? "Đang kết nối" : "HANDSHAKING".equals(str) ? "Đang thiết lập liên lạc" : "CONNECTED".equals(str) ? "Đã kết nối" : "RETRY_WAIT".equals(str) ? "Đang chờ kết nối lại" : "DISCONNECTING".equals(str) ? "Đang ngắt kết nối" : "START_BLOCKED".equals(str) ? "Chưa thể khởi động kết nối" : "ERROR".equals(str) ? "Có lỗi" : "Không xác định";
    }

    static String localizedDetail(String str) {
        int iIndexOf;
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return "";
        }
        String strReplace = strTrim.replace("Nearby Devices permission required", "cần quyền Thiết bị lân cận").replace("Bluetooth is off", "Bluetooth đang tắt").replace("No device selected", "chưa chọn thiết bị").replace("No WebSocket endpoint configured", "chưa nhập địa chỉ Wi-Fi HUD").replace("WebSocket HUD must use a private LAN address", "HUD Wi-Fi phải dùng địa chỉ mạng nội bộ").replace("invalid WebSocket host", "địa chỉ Wi-Fi HUD không hợp lệ").replace("invalid WebSocket path", "đường dẫn WebSocket không hợp lệ").replace("configuration changed", "cấu hình đã thay đổi").replace("local shutdown", "đã tắt từ ứng dụng").replace("peer requested disconnect", "thiết bị yêu cầu ngắt kết nối").replace("transport disconnected during handshake", "mất kết nối khi thiết lập liên lạc").replace("one-way/legacy", "một chiều / chế độ cũ").replace("duplex", "hai chiều").replace("RX pong", "đã nhận phản hồi").replace("RX frame", "đã nhận dữ liệu").replace("CONNECTION_FAILED", "kết nối thất bại").replace("REMOTE_DISCONNECT", "thiết bị đã ngắt kết nối").replace("WRITE_FAILED", "gửi dữ liệu thất bại").replace("HANDSHAKE_TIMEOUT", "quá thời gian thiết lập liên lạc").replace("PROTOCOL_ERROR", "lỗi giao thức").replace("MALFORMED_JSON", "dữ liệu phản hồi không hợp lệ").replace("MALFORMED_UTF8", "mã hóa phản hồi không hợp lệ").replace("FRAME_TOO_LARGE", "gói phản hồi quá lớn");
        int iIndexOf2 = strReplace.indexOf(" (retry in ");
        if (iIndexOf2 >= 0 && (iIndexOf = strReplace.indexOf(" ms)", iIndexOf2)) > iIndexOf2) {
            try {
                strReplace = strReplace.substring(0, iIndexOf2) + " (thử lại sau " + Math.max(1L, (Long.parseLong(strReplace.substring(iIndexOf2 + 11, iIndexOf)) + 999) / 1000) + " giây)" + strReplace.substring(iIndexOf + 4);
            } catch (NumberFormatException e2) {
            }
        }
        if ("ble".equalsIgnoreCase(strReplace)) {
            return "Bluetooth LE";
        }
        if ("spp".equalsIgnoreCase(strReplace)) {
            return "Bluetooth Classic";
        }
        if ("ws".equalsIgnoreCase(strReplace)) {
            return "Wi-Fi WebSocket";
        }
        if (strReplace.startsWith("ble ")) {
            strReplace = "Bluetooth LE" + strReplace.substring(3);
        }
        if (strReplace.startsWith("spp ")) {
            strReplace = "Bluetooth Classic" + strReplace.substring(3);
        }
        return strReplace.startsWith("ws ") ? "Wi-Fi WebSocket" + strReplace.substring(2) : strReplace;
    }

    private void registerStateReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction(ACTION_RETRY);
        intentFilter.addAction(ACTION_RECONFIGURE);
        if (Build.VERSION.SDK_INT < 33) {
            registerReceiver(this.stateReceiver, intentFilter);
        } else {
            registerReceiver(this.stateReceiver, intentFilter, 4);
        }
    }

    private Notification notification(String str) {
        PendingIntent activity = PendingIntent.getActivity(this, DisplayStrings.DS_SELECT_COUNTRY, new Intent(this, (Class<?>) ModSettingsActivity.class), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        Notification.Builder contentTitle = (Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(this, CHANNEL) : new Notification.Builder(this)).setContentTitle("Waze HUD Link");
        if (str == null) {
            str = "Kết nối HUD";
        }
        return contentTitle.setContentText(str).setSmallIcon(R.drawable.stat_sys_data_bluetooth).setContentIntent(activity).setOngoing(true).setOnlyAlertOnce(true).build();
    }

    private void createChannel() {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) getSystemService("notification")) != null) {
            notificationManager.createNotificationChannel(new NotificationChannel(CHANNEL, "Waze HUD Link", 2));
        }
    }

    private static final class BluetoothAdapterActions {
        private BluetoothAdapterActions() {
        }

        static boolean isEnvironmentAction(String str) {
            return "android.bluetooth.adapter.action.STATE_CHANGED".equals(str) || "android.bluetooth.device.action.BOND_STATE_CHANGED".equals(str) || "android.bluetooth.device.action.ACL_DISCONNECTED".equals(str);
        }
    }
}
