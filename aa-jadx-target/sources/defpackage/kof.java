package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kof implements defpackage.pbe {
    public static final /* synthetic */ int d = 0;
    private static final defpackage.yqm e = defpackage.yqm.c("GH.WCTB");
    private static final defpackage.yhe f;
    public final android.content.Context a;
    public long b;
    public long c;
    private long g = 0;

    static {
        defpackage.yha yhaVar = new defpackage.yha(4);
        yhaVar.f(defpackage.pbd.CONNECTING_RFCOMM, defpackage.yyn.WIRELESS_CONNECTING_RFCOMM);
        yhaVar.f(defpackage.pbd.CONNECTED_RFCOMM, defpackage.yyn.WIRELESS_CONNECTED_RFCOMM);
        yhaVar.f(defpackage.pbd.CONNECTED_WIFI, defpackage.yyn.WIRELESS_CONNECTED_WIFI);
        yhaVar.f(defpackage.pbd.VERSION_CHECK_COMPLETE, defpackage.yyn.WIRELESS_RFCOMM_VERSION_CHECK_COMPLETE);
        yhaVar.f(defpackage.pbd.NO_COMPATIBLE_WIFI_VERSION_FOUND, defpackage.yyn.WIRELESS_WPP_VERSION_RESPONSE_NO_COMPATIBLE_VERSION);
        yhaVar.f(defpackage.pbd.NO_COMPATIBLE_WIFI_CHANNEL_FOUND, defpackage.yyn.WIRELESS_WPP_VERSION_RESPONSE_NO_COMPATIBLE_CHANNELS);
        yhaVar.f(defpackage.pbd.FOUND_COMPATIBLE_WIFI_NETWORK, defpackage.yyn.WIRELESS_WPP_VERSION_RESPONSE_SUCCESS);
        yhaVar.f(defpackage.pbd.WIFI_CONNECT_TIMED_OUT, defpackage.yyn.WIRELESS_WIFI_CONNECT_TIMED_OUT);
        yhaVar.f(defpackage.pbd.PROJECTION_INITIATED, defpackage.yyn.WIRELESS_WIFI_PROJECTION_INITIATED);
        yhaVar.f(defpackage.pbd.WIFI_FAILED_TO_AUTOMATICALLY_ENABLE, defpackage.yyn.WIRELESS_WIFI_FAILED_TO_AUTOMATICALLY_ENABLE_ADAPTER);
        yhaVar.f(defpackage.pbd.WIFI_PROJECTION_START_REQUESTED, defpackage.yyn.WIRELESS_WIFI_PROJECTION_REQUESTED);
        yhaVar.f(defpackage.pbd.WIFI_PROJECTION_RESTART_REQUESTED, defpackage.yyn.WIRELESS_WIFI_REATTEMPT_PROJECTION_REQUESTED);
        yhaVar.f(defpackage.pbd.WIFI_SECURITY_NOT_SUPPORTED, defpackage.yyn.WIRELESS_WIFI_SECURITY_NOT_SUPPORTED);
        yhaVar.f(defpackage.pbd.WIFI_AUTOMATICALLY_ENABLED, defpackage.yyn.WIRELESS_WIFI_AUTOMATICALLY_ENABLED);
        yhaVar.f(defpackage.pbd.START_WIFI_REQUEST_SUCCESS, defpackage.yyn.WIRELESS_WIFI_START_REQUEST_FROM_MD_SUCCESS_RESPONSE);
        yhaVar.f(defpackage.pbd.START_WIFI_REQUEST_FAILED_ALREADY_STARTED, defpackage.yyn.WIRELESS_WIFI_REQUEST_FAILED_ALREADY_STARTED);
        yhaVar.f(defpackage.pbd.START_WIFI_REQUEST_FAILED_WIFI_DISABLED, defpackage.yyn.WIRELESS_WIFI_REQUEST_FAILED_HU_WIFI_TURNED_OFF);
        yhaVar.f(defpackage.pbd.START_WIFI_REQUEST_FAILED_WIFI_NOT_YET_STARTED, defpackage.yyn.WIRELESS_WIFI_REQUEST_FAILED_HU_WIFI_NOT_YET_STARTED);
        yhaVar.f(defpackage.pbd.START_WIFI_REQUEST_FAILED_INVALID_CREDENTIALS, defpackage.yyn.WIRELESS_WIFI_REQUEST_FAILED_UNABLE_TO_CONNECT);
        yhaVar.f(defpackage.pbd.WIFI_INVALID_WPP_ENDPOINT, defpackage.yyn.WIRELESS_WIFI_INVALID_WPP_ENDPOINT);
        yhaVar.f(defpackage.pbd.WIFI_INVALID_PROJECTION_ENDPOINT, defpackage.yyn.WIRELESS_WIFI_INVALID_PROJECTION_ENDPOINT);
        yhaVar.f(defpackage.pbd.WIFI_INVALID_SSID, defpackage.yyn.WIRELESS_WIFI_INVALID_SSID);
        yhaVar.f(defpackage.pbd.WIFI_INVALID_BSSID, defpackage.yyn.WIRELESS_WIFI_INVALID_BSSID);
        yhaVar.f(defpackage.pbd.WIFI_INVALID_PASSWORD, defpackage.yyn.WIRELESS_WIFI_INVALID_PASSWORD);
        yhaVar.f(defpackage.pbd.RECONNECTION_PREVENTED, defpackage.yyn.WIRELESS_RFCOMM_RECONNECTION_PREVENTED);
        f = yhaVar.d(true);
    }

    public kof(android.content.Context context) {
        this.a = context;
    }

    @Override // defpackage.pbe
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void c(defpackage.pbd pbdVar, android.os.Bundle bundle) {
        defpackage.yyn yynVar = (defpackage.yyn) f.get(pbdVar);
        if (yynVar != null) {
            d(yynVar);
        }
        if (pbdVar == defpackage.pbd.PROJECTION_CONNECTED) {
            this.g = 0L;
        }
    }

    public final void d(defpackage.yyn yynVar) {
        e(yynVar, j$.util.OptionalInt.empty());
    }

    public final void e(defpackage.yyn yynVar, j$.util.OptionalInt optionalInt) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.google.android.apps.auto.components.connectivity.ACTION_LOG_WIRELESS_EVENT");
        intent.putExtra("event_type", yynVar.pE);
        intent.setPackage("com.google.android.projection.gearhead");
        intent.putExtra("time_since_boot_millis", android.os.SystemClock.elapsedRealtime());
        optionalInt.ifPresent(new ozf(intent, 1));
        this.a.sendBroadcast(intent);
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.g;
        int iOrdinal = yynVar.ordinal();
        if (iOrdinal == 308) {
            this.g = android.os.SystemClock.elapsedRealtime();
            if (jElapsedRealtime < this.b) {
                d(defpackage.yyn.WIRELESS_WIFI_PROJECTION_REQUEST_CANCELED);
            }
        } else if ((iOrdinal == 505 || iOrdinal == 506) && jElapsedRealtime < this.c) {
            d(defpackage.yyn.WIRELESS_WIFI_PROJECTION_REQUEST_CANCELED);
        }
        if (defpackage.kou.n()) {
            defpackage.kou.m().k(yynVar);
            if (yynVar == defpackage.yyn.WIRELESS_SETUP_SHARED_SERVICE_STARTED) {
                ((defpackage.yqj) ((defpackage.yqj) e.f()).ai(3269)).x("FI_ONLY: ReleaseChannel__gearhead_channel=%d", defpackage.acxb.b());
            }
        }
    }

    @Override // defpackage.pbe
    public final void b() {
    }

    @Override // defpackage.pbe
    public final void a(java.lang.String str, int i, android.net.wifi.WifiInfo wifiInfo, int i2, int i3) {
    }
}
