package com.waze.gw;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.car.app.CarContext;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.webkit.ProxyConfig;
import com.waze.gw.HlpFrameCodec;
import com.waze.gw.HudDeviceConfig;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
final class HlpProtocol {
    static final int BLE_MAX_RATE = 4;
    static final int DEFAULT_RATE = 8;
    static final int MAX_RATE = 10;
    private static final long PING_INTERVAL_MS = 5000;
    static final Set<String> SUPPORTED_FIELDS = Collections.unmodifiableSet(new LinkedHashSet(Arrays.asList("nav", "spd", "lim", "over", "trn", "trn2", "dst", "exit", "lan", CmcdConfiguration.KEY_STREAM_TYPE, "st2", "eta", "rmin", "rm", "rkm", "avg", "avgL", "avgR", "avgP", "alr", "alrD", "alrV", "alrS", "alrM", "alrs")));
    static final int VERSION = 1;

    interface SessionListener extends HudSessionListener {
    }

    HlpProtocol() {
    }

    static final class DevRequest {
        final boolean allFields;
        final LinkedHashSet<String> fields;
        final int rate;
        final boolean speaksV1;

        DevRequest(int i2, boolean z, LinkedHashSet<String> linkedHashSet, boolean z2) {
            this.rate = Math.max(1, Math.min(10, i2));
            this.allFields = z;
            this.fields = linkedHashSet;
            this.speaksV1 = z2;
        }
    }

    static DevRequest parseDev(JSONObject jSONObject) throws JSONException {
        boolean z;
        boolean zEquals = true;
        if (jSONObject.optInt("v", -1) != 1) {
            throw new JSONException("unsupported v");
        }
        if (!"dev".equals(jSONObject.optString("t", ""))) {
            throw new JSONException("not dev");
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("proto");
        if (jSONArrayOptJSONArray == null) {
            z = true;
        } else {
            z = false;
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                if (jSONArrayOptJSONArray.optInt(i2, -1) == 1) {
                    z = true;
                }
            }
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("want");
        int iOptInt = jSONObjectOptJSONObject == null ? 8 : jSONObjectOptJSONObject.optInt("rate", 8);
        int i3 = iOptInt > 0 ? iOptInt : 8;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (jSONObjectOptJSONObject != null) {
            Object objOpt = jSONObjectOptJSONObject.opt("fields");
            if (objOpt instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) objOpt;
                boolean z2 = false;
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    String strOptString = jSONArray.optString(i4, "");
                    if (ProxyConfig.MATCH_ALL_SCHEMES.equals(strOptString)) {
                        z2 = true;
                    } else if (SUPPORTED_FIELDS.contains(strOptString)) {
                        linkedHashSet.add(strOptString);
                    }
                }
                zEquals = z2;
            } else if ((objOpt instanceof String) && !(zEquals = ProxyConfig.MATCH_ALL_SCHEMES.equals(objOpt)) && SUPPORTED_FIELDS.contains(objOpt)) {
                linkedHashSet.add((String) objOpt);
            }
        }
        return new DevRequest(i3, zEquals, linkedHashSet, z);
    }

    static String error(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("v", 1).put("t", "error").put("code", str);
            if (str2 != null && str2.length() > 0) {
                jSONObject.put("detail", str2);
            }
        } catch (JSONException e2) {
        }
        return jSONObject.toString();
    }

    static final class OutboundWriter implements AutoCloseable {
        private volatile long droppedStates;
        private final Failure failure;
        private volatile boolean running;
        private Thread thread;
        private final HudTransport transport;
        private final ArrayBlockingQueue<byte[]> control = new ArrayBlockingQueue<>(64);
        private final AtomicReference<byte[]> importantState = new AtomicReference<>();
        private final AtomicReference<byte[]> latestState = new AtomicReference<>();

        interface Failure {
            void onWriteFailure(IOException iOException);
        }

        OutboundWriter(HudTransport hudTransport, Failure failure) {
            this.transport = hudTransport;
            this.failure = failure;
        }

        synchronized void start() {
            if (this.running) {
                return;
            }
            this.running = true;
            this.thread = new Thread(new Runnable() { // from class: com.waze.gw.HlpProtocol.OutboundWriter.1
                @Override // java.lang.Runnable
                public void run() {
                    OutboundWriter.this.loop();
                }
            }, "hud-hlp-writer");
            this.thread.setDaemon(true);
            this.thread.start();
        }

        synchronized boolean offerControl(String str) {
            try {
            } catch (IOException e2) {
                if (this.failure == null) {
                    return false;
                }
                this.failure.onWriteFailure(e2);
                return false;
            }
            return this.control.offer(HlpFrameCodec.encode(str));
        }

        synchronized boolean offerControls(List<String> list) {
            if (this.running && list != null && !list.isEmpty() && list.size() <= this.control.remainingCapacity()) {
                ArrayList arrayList = new ArrayList(list.size());
                try {
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(HlpFrameCodec.encode(it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (!this.control.offer((byte[]) it2.next())) {
                            return false;
                        }
                    }
                    return true;
                } catch (IOException e2) {
                    if (this.failure != null) {
                        this.failure.onWriteFailure(e2);
                    }
                    return false;
                }
            }
            return false;
        }

        boolean offerState(byte[] bArr, boolean z) {
            if (!this.running || bArr == null) {
                return false;
            }
            if (z) {
                if (this.importantState.getAndSet(bArr) != null) {
                    this.droppedStates++;
                }
                return true;
            }
            if (this.latestState.getAndSet(bArr) != null) {
                this.droppedStates++;
            }
            return true;
        }

        long droppedStates() {
            return this.droppedStates;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loop() {
            while (true) {
                try {
                    try {
                        if (!this.running) {
                            break;
                        }
                        byte[] bArrPoll = this.control.poll(100L, TimeUnit.MILLISECONDS);
                        if (bArrPoll == null) {
                            bArrPoll = this.importantState.getAndSet(null);
                        }
                        if (bArrPoll == null) {
                            bArrPoll = this.latestState.getAndSet(null);
                        }
                        if (bArrPoll != null) {
                            this.transport.sendFrame(bArrPoll);
                        }
                    } catch (IOException e2) {
                        if (this.running && this.failure != null) {
                            this.failure.onWriteFailure(e2);
                        }
                    } catch (InterruptedException e3) {
                        Thread.currentThread().interrupt();
                    }
                } finally {
                    this.running = false;
                }
            }
        }

        @Override // java.lang.AutoCloseable
        public synchronized void close() {
            this.running = false;
            if (this.thread != null) {
                this.thread.interrupt();
            }
            this.control.clear();
            this.importantState.set(null);
            this.latestState.set(null);
        }
    }

    static final class Session implements HudConfigurableSession, HlpFrameCodec.Listener, OutboundWriter.Failure {
        private final Context context;
        private volatile boolean hiSent;
        private volatile long lastPeerActivity;
        private volatile long lastPingSent;
        private volatile long lastPongAt;
        private volatile long lastSent;
        private volatile boolean legacy;
        private final HudSessionListener listener;
        private long pendingConfigAt;
        private long pendingConfigTransaction;
        private LinkedHashMap<String, Object> pendingConfigValues;
        private volatile int rate;
        private volatile boolean stopped;
        private final HudTransport transport;
        private OutboundWriter writer;
        private final HlpFrameCodec codec = new HlpFrameCodec();
        private final CountDownLatch devReceived = new CountDownLatch(1);
        private final long sessionId = (SystemClock.elapsedRealtime() ^ System.identityHashCode(this)) & Long.MAX_VALUE;
        private final HudDeviceConfig.Assembler configAssembler = new HudDeviceConfig.Assembler(this.sessionId);
        private volatile String lastSignature = "";
        private volatile LinkedHashSet<String> acceptedFields = defaultFields();
        private long nextConfigTransaction = 1;
        private long pendingConfigRevision = -1;
        private volatile String lastAlertSignature = "";

        Session(Context context, HudTransport hudTransport, HudSessionListener hudSessionListener) {
            this.context = context.getApplicationContext();
            this.transport = hudTransport;
            this.listener = hudSessionListener;
            this.rate = "ble".equals(hudTransport.transportName()) ? 4 : 8;
        }

        @Override // com.waze.gw.HudProtocolSession
        public void prepare() {
            if (this.writer == null) {
                HudDeviceConfig.beginSession(this.sessionId);
                this.writer = new OutboundWriter(this.transport, this);
                this.writer.start();
            }
        }

        @Override // com.waze.gw.HudProtocolSession
        public void startHandshake() throws JSONException, InterruptedException {
            prepare();
            try {
                this.devReceived.await(500L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
            }
            if (!this.hiSent) {
                this.legacy = true;
                sendHi();
            }
            if (this.listener != null) {
                this.listener.onSessionConnected(this.transport.transportName(), this.rate);
            }
        }

        @Override // com.waze.gw.HudProtocolSession
        public void accept(byte[] bArr, int i2) {
            this.codec.accept(bArr, i2, this);
        }

        void tick() {
            tickAt(SystemClock.elapsedRealtime(), HudCanonicalState.capture(this.context));
        }

        private void sendHi() throws JSONException {
            if (this.writer == null || this.stopped) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                jSONObject.put("v", 1).put("t", "hi").put(CarContext.APP_SERVICE, "waze").put(HintConstants.AUTOFILL_HINT_NAME, "WazeHUD").put("appv", appVersion()).put("sess", this.sessionId).put("proto", 1).put("unix", jCurrentTimeMillis / 1000).put("tz", TimeZone.getDefault().getOffset(jCurrentTimeMillis) / 60000).put("rate", this.rate);
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = this.acceptedFields.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                if (this.legacy) {
                    jSONObject.put("fields", ProxyConfig.MATCH_ALL_SCHEMES);
                } else {
                    jSONObject.put("fields", jSONArray);
                }
                JSONArray jSONArray2 = new JSONArray();
                if (this.acceptedFields.contains("spd")) {
                    jSONArray2.put("speed");
                }
                if (this.acceptedFields.contains("lim")) {
                    jSONArray2.put("limit");
                }
                if (this.acceptedFields.contains("trn")) {
                    jSONArray2.put("turn");
                }
                if (this.acceptedFields.contains("lan")) {
                    jSONArray2.put("lanes");
                }
                if (this.acceptedFields.contains(CmcdConfiguration.KEY_STREAM_TYPE)) {
                    jSONArray2.put("street");
                }
                if (this.acceptedFields.contains("eta")) {
                    jSONArray2.put("eta");
                }
                if (this.acceptedFields.contains("avg")) {
                    jSONArray2.put("avgzone");
                }
                if (this.acceptedFields.contains("alr") || this.acceptedFields.contains("alrs")) {
                    jSONArray2.put("alerts");
                }
                jSONArray2.put("device_config");
                jSONObject.put("caps", jSONArray2).put(NotificationCompat.CATEGORY_TRANSPORT, this.transport.transportName()).put("maxFrame", 512);
                String string = jSONObject.toString();
                this.hiSent = this.writer.offerControl(string);
                if (this.hiSent) {
                    logPayload("TX", string);
                }
            } catch (JSONException e2) {
            }
        }

        @Override // com.waze.gw.HlpFrameCodec.Listener
        public void onFrame(String str) {
            logPayload("RX", str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strType = HlpMessageParser.type(jSONObject);
                if ("dev".equals(strType)) {
                    DevRequest dev = HlpMessageParser.parseDev(jSONObject);
                    if (!dev.speaksV1) {
                        this.writer.offerControl(HlpProtocol.error("UNSUPPORTED_VERSION", "HLP/1 required"));
                        onSessionError("PROTOCOL_ERROR", "consumer does not support HLP/1");
                        return;
                    }
                    this.rate = "ble".equals(this.transport.transportName()) ? Math.min(dev.rate, 4) : dev.rate;
                    this.acceptedFields = new LinkedHashSet<>(dev.allFields ? HlpProtocol.SUPPORTED_FIELDS : dev.fields);
                    if (!dev.fields.contains("alrs")) {
                        this.acceptedFields.remove("alrs");
                    }
                    if (!dev.fields.contains("lan")) {
                        this.acceptedFields.remove("lan");
                    }
                    this.legacy = false;
                    this.devReceived.countDown();
                    sendHi();
                } else if ("cfg_begin".equals(strType)) {
                    this.configAssembler.begin(jSONObject);
                } else if ("cfg_item".equals(strType)) {
                    this.configAssembler.item(jSONObject);
                } else if ("cfg_end".equals(strType)) {
                    this.configAssembler.end(jSONObject);
                } else if ("cfg_ack".equals(strType)) {
                    acceptConfigAck(jSONObject);
                } else if ("ping".equals(strType)) {
                    if (this.writer.offerControl("{\"v\":1,\"t\":\"pong\"}")) {
                        logPayload("TX", "{\"v\":1,\"t\":\"pong\"}");
                    }
                } else if ("bye".equals(strType)) {
                    if (this.listener != null) {
                        this.listener.onSessionWantsDisconnect();
                    }
                } else if (!"pong".equals(strType) && !"hi".equals(strType) && !CmcdData.STREAMING_FORMAT_SS.equals(strType)) {
                    "error".equals(strType);
                }
                this.lastPeerActivity = SystemClock.elapsedRealtime();
                if ("pong".equals(strType)) {
                    this.lastPongAt = this.lastPeerActivity;
                }
                if (this.listener != null) {
                    this.listener.onSessionPeerActivity(strType, this.lastPeerActivity);
                }
            } catch (RuntimeException e2) {
                onSessionError("PROTOCOL_ERROR", e2.getMessage());
            } catch (JSONException e3) {
                onSessionError("MALFORMED_JSON", e3.getMessage());
            }
        }

        @Override // com.waze.gw.HlpFrameCodec.Listener
        public void onMalformedUtf8() {
            onSessionError("MALFORMED_UTF8", "peer sent invalid UTF-8");
        }

        @Override // com.waze.gw.HlpFrameCodec.Listener
        public void onOversizedFrame() {
            onSessionError("FRAME_TOO_LARGE", "peer frame exceeds 512 bytes");
        }

        @Override // com.waze.gw.HlpProtocol.OutboundWriter.Failure
        public void onWriteFailure(IOException iOException) {
            if (this.listener != null) {
                this.listener.onSessionError("WRITE_FAILED", iOException == null ? "write failed" : iOException.getMessage());
            }
        }

        @Override // com.waze.gw.HudProtocolSession
        public void stop() {
            this.stopped = true;
            synchronized (this) {
                clearPendingConfig();
            }
            if (this.writer != null) {
                this.writer.close();
            }
            HudDeviceConfig.endSession(this.sessionId);
        }

        @Override // com.waze.gw.HudConfigurableSession
        public synchronized boolean applyDeviceConfig(long j2, Map<String, Object> map) {
            if (!this.stopped && this.writer != null && this.transport.isConnected() && this.pendingConfigTransaction == 0) {
                HudDeviceConfig.Snapshot snapshot = HudDeviceConfig.snapshot();
                if (snapshot.schema == null || snapshot.schema.revision != j2) {
                    return false;
                }
                try {
                    LinkedHashMap<String, Object> linkedHashMapValidatedValues = HudDeviceConfig.validatedValues(snapshot.schema, map);
                    long j3 = this.nextConfigTransaction;
                    this.nextConfigTransaction = 1 + j3;
                    ArrayList arrayList = new ArrayList(linkedHashMapValidatedValues.size() + 2);
                    try {
                        arrayList.add(new JSONObject().put("v", 1).put("t", "cfg_set_begin").put("tx", j3).put("rev", j2).put("count", linkedHashMapValidatedValues.size()).toString());
                        for (Map.Entry<String, Object> entry : linkedHashMapValidatedValues.entrySet()) {
                            arrayList.add(new JSONObject().put("v", 1).put("t", "cfg_set").put("tx", j3).put(TtmlNode.ATTR_ID, entry.getKey()).put("value", entry.getValue()).toString());
                        }
                        arrayList.add(new JSONObject().put("v", 1).put("t", "cfg_set_commit").put("tx", j3).toString());
                        if (!this.writer.offerControls(arrayList)) {
                            HudDeviceConfig.applyFailed(this.sessionId, "Hàng đợi gửi dữ liệu đang bận");
                            return false;
                        }
                        this.pendingConfigTransaction = j3;
                        this.pendingConfigRevision = j2;
                        this.pendingConfigValues = linkedHashMapValidatedValues;
                        this.pendingConfigAt = SystemClock.elapsedRealtime();
                        HudDeviceConfig.applying(this.sessionId);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            logPayload("TX", (String) it.next());
                        }
                        return true;
                    } catch (JSONException e2) {
                        HudDeviceConfig.applyFailed(this.sessionId, "Không thể tạo gói cấu hình");
                        return false;
                    }
                } catch (IllegalArgumentException e3) {
                    HudDeviceConfig.applyFailed(this.sessionId, e3.getMessage());
                    return false;
                }
            }
            return false;
        }

        private synchronized void acceptConfigAck(JSONObject jSONObject) throws JSONException {
            long j2 = jSONObject.getLong("tx");
            if (this.pendingConfigTransaction != 0 && j2 == this.pendingConfigTransaction) {
                if (jSONObject.optBoolean("ok", false)) {
                    long jOptLong = jSONObject.optLong("rev", this.pendingConfigRevision);
                    LinkedHashMap<String, Object> linkedHashMap = this.pendingConfigValues;
                    clearPendingConfig();
                    HudDeviceConfig.applied(this.sessionId, jOptLong, linkedHashMap);
                } else {
                    String strOptString = jSONObject.optString("field", "");
                    String strOptString2 = jSONObject.optString("error", "Thiết bị từ chối cấu hình");
                    clearPendingConfig();
                    long j3 = this.sessionId;
                    if (strOptString.length() != 0) {
                        strOptString2 = strOptString + ": " + strOptString2;
                    }
                    HudDeviceConfig.applyFailed(j3, strOptString2);
                }
            }
        }

        private void clearPendingConfig() {
            this.pendingConfigTransaction = 0L;
            this.pendingConfigAt = 0L;
            this.pendingConfigRevision = -1L;
            this.pendingConfigValues = null;
        }

        boolean hasPeerActivity() {
            return this.lastPeerActivity > 0;
        }

        long lastPongAt() {
            return this.lastPongAt;
        }

        @Override // com.waze.gw.HudProtocolSession
        public boolean isReady() {
            return (this.stopped || !this.hiSent || this.writer == null) ? false : true;
        }

        @Override // com.waze.gw.HudProtocolSession
        public String protocolName() {
            return "hlp1";
        }

        @Override // com.waze.gw.HudProtocolSession
        public void tick(long j2, HudCanonicalState hudCanonicalState) {
            if (hudCanonicalState == null) {
                hudCanonicalState = HudCanonicalState.capture(this.context);
            }
            tickAt(j2, hudCanonicalState);
        }

        private void tickAt(long j2, HudCanonicalState hudCanonicalState) {
            if (this.stopped || this.writer == null || !this.transport.isConnected()) {
                return;
            }
            if (j2 - this.lastPingSent >= 5000) {
                String str = "{\"v\":1,\"t\":\"ping\",\"ts\":" + j2 + "}";
                if (this.writer.offerControl(str)) {
                    this.lastPingSent = j2;
                    logPayload("TX", str);
                }
            }
            synchronized (this) {
                if (this.pendingConfigTransaction != 0 && j2 - this.pendingConfigAt >= 10000) {
                    clearPendingConfig();
                    HudDeviceConfig.applyFailed(this.sessionId, "Thiết bị không phản hồi cấu hình");
                }
            }
            String strSignature = HlpStateEncoder.signature(hudCanonicalState, this.acceptedFields);
            boolean z = true;
            if (j2 - this.lastSent >= Math.max(100L, 1000 / ((long) Math.max(1, this.rate)))) {
                if (!strSignature.equals(this.lastSignature) || j2 - this.lastSent >= 1000) {
                    try {
                        byte[] bArrEncode = HlpStateEncoder.encode(hudCanonicalState, this.acceptedFields, j2);
                        if (hudCanonicalState.alertSignature().equals(this.lastAlertSignature)) {
                            z = false;
                        }
                        if (this.writer.offerState(bArrEncode, z)) {
                            logFrame("TX", bArrEncode);
                        }
                        this.lastSignature = strSignature;
                        this.lastAlertSignature = hudCanonicalState.alertSignature();
                        this.lastSent = j2;
                    } catch (IOException e2) {
                        onWriteFailure(e2);
                    }
                }
            }
        }

        private void onSessionError(String str, String str2) {
            if (this.listener != null) {
                HudSessionListener hudSessionListener = this.listener;
                if (str2 == null) {
                    str2 = str;
                }
                hudSessionListener.onSessionError(str, str2);
            }
        }

        private static LinkedHashSet<String> defaultFields() {
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(HlpProtocol.SUPPORTED_FIELDS);
            linkedHashSet.remove("alrs");
            linkedHashSet.remove("lan");
            return linkedHashSet;
        }

        private String appVersion() {
            try {
                PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0);
                if (packageInfo != null && packageInfo.versionName != null) {
                    return packageInfo.versionName;
                }
                return "";
            } catch (Throwable th) {
                return "";
            }
        }

        private void logFrame(String str, byte[] bArr) {
            if (bArr == null) {
                return;
            }
            int length = bArr.length;
            if (length > 0 && bArr[length - 1] == 10) {
                length--;
            }
            logPayload(str, new String(bArr, 0, length, StandardCharsets.UTF_8));
        }

        private void logPayload(String str, String str2) {
            if (this.context.getSharedPreferences("waze_hud_gw", 0).getBoolean("hud_link_log", false)) {
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.length() > 768) {
                    str2 = str2.substring(0, 768) + "…";
                }
                Log.d("WazeHudLink", str + " " + str2);
            }
        }
    }
}
