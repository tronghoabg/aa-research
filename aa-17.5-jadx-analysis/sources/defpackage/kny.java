package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.OptionalInt;

/* loaded from: classes.dex */
public final class kny implements pah {
    public static final /* synthetic */ int d = 0;
    private static final yph e = yph.c("GH.WCTB");
    private static final yfy f;
    public final Context a;
    public long b;
    public long c;
    private long g = 0;

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e(pag.CONNECTING_RFCOMM, yxi.WIRELESS_CONNECTING_RFCOMM);
        yfuVar.e(pag.CONNECTED_RFCOMM, yxi.WIRELESS_CONNECTED_RFCOMM);
        yfuVar.e(pag.CONNECTED_WIFI, yxi.WIRELESS_CONNECTED_WIFI);
        yfuVar.e(pag.VERSION_CHECK_COMPLETE, yxi.WIRELESS_RFCOMM_VERSION_CHECK_COMPLETE);
        yfuVar.e(pag.NO_COMPATIBLE_WIFI_VERSION_FOUND, yxi.WIRELESS_WPP_VERSION_RESPONSE_NO_COMPATIBLE_VERSION);
        yfuVar.e(pag.NO_COMPATIBLE_WIFI_CHANNEL_FOUND, yxi.WIRELESS_WPP_VERSION_RESPONSE_NO_COMPATIBLE_CHANNELS);
        yfuVar.e(pag.FOUND_COMPATIBLE_WIFI_NETWORK, yxi.WIRELESS_WPP_VERSION_RESPONSE_SUCCESS);
        yfuVar.e(pag.WIFI_CONNECT_TIMED_OUT, yxi.WIRELESS_WIFI_CONNECT_TIMED_OUT);
        yfuVar.e(pag.PROJECTION_INITIATED, yxi.WIRELESS_WIFI_PROJECTION_INITIATED);
        yfuVar.e(pag.WIFI_FAILED_TO_AUTOMATICALLY_ENABLE, yxi.WIRELESS_WIFI_FAILED_TO_AUTOMATICALLY_ENABLE_ADAPTER);
        yfuVar.e(pag.WIFI_PROJECTION_START_REQUESTED, yxi.WIRELESS_WIFI_PROJECTION_REQUESTED);
        yfuVar.e(pag.WIFI_PROJECTION_RESTART_REQUESTED, yxi.WIRELESS_WIFI_REATTEMPT_PROJECTION_REQUESTED);
        yfuVar.e(pag.WIFI_SECURITY_NOT_SUPPORTED, yxi.WIRELESS_WIFI_SECURITY_NOT_SUPPORTED);
        yfuVar.e(pag.WIFI_AUTOMATICALLY_ENABLED, yxi.WIRELESS_WIFI_AUTOMATICALLY_ENABLED);
        yfuVar.e(pag.START_WIFI_REQUEST_SUCCESS, yxi.WIRELESS_WIFI_START_REQUEST_FROM_MD_SUCCESS_RESPONSE);
        yfuVar.e(pag.START_WIFI_REQUEST_FAILED_ALREADY_STARTED, yxi.WIRELESS_WIFI_REQUEST_FAILED_ALREADY_STARTED);
        yfuVar.e(pag.START_WIFI_REQUEST_FAILED_WIFI_DISABLED, yxi.WIRELESS_WIFI_REQUEST_FAILED_HU_WIFI_TURNED_OFF);
        yfuVar.e(pag.START_WIFI_REQUEST_FAILED_WIFI_NOT_YET_STARTED, yxi.WIRELESS_WIFI_REQUEST_FAILED_HU_WIFI_NOT_YET_STARTED);
        yfuVar.e(pag.START_WIFI_REQUEST_FAILED_INVALID_CREDENTIALS, yxi.WIRELESS_WIFI_REQUEST_FAILED_UNABLE_TO_CONNECT);
        yfuVar.e(pag.WIFI_INVALID_WPP_ENDPOINT, yxi.WIRELESS_WIFI_INVALID_WPP_ENDPOINT);
        yfuVar.e(pag.WIFI_INVALID_PROJECTION_ENDPOINT, yxi.WIRELESS_WIFI_INVALID_PROJECTION_ENDPOINT);
        yfuVar.e(pag.WIFI_INVALID_SSID, yxi.WIRELESS_WIFI_INVALID_SSID);
        yfuVar.e(pag.WIFI_INVALID_BSSID, yxi.WIRELESS_WIFI_INVALID_BSSID);
        yfuVar.e(pag.WIFI_INVALID_PASSWORD, yxi.WIRELESS_WIFI_INVALID_PASSWORD);
        yfuVar.e(pag.RECONNECTION_PREVENTED, yxi.WIRELESS_RFCOMM_RECONNECTION_PREVENTED);
        f = yfuVar.d(true);
    }

    public kny(Context context) {
        this.a = context;
    }

    @Override // defpackage.pah
    @ResultIgnorabilityUnspecified
    public final void c(pag pagVar, Bundle bundle) {
        yxi yxiVar = (yxi) f.get(pagVar);
        if (yxiVar != null) {
            d(yxiVar);
        }
        if (pagVar == pag.PROJECTION_CONNECTED) {
            this.g = 0L;
        }
    }

    public final void d(yxi yxiVar) {
        e(yxiVar, OptionalInt.empty());
    }

    public final void e(yxi yxiVar, OptionalInt optionalInt) {
        Intent intent = new Intent();
        intent.setAction("com.google.android.apps.auto.components.connectivity.ACTION_LOG_WIRELESS_EVENT");
        intent.putExtra("event_type", yxiVar.pC);
        intent.setPackage("com.google.android.projection.gearhead");
        intent.putExtra("time_since_boot_millis", SystemClock.elapsedRealtime());
        optionalInt.ifPresent(new oyh(intent, 1));
        this.a.sendBroadcast(intent);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.g;
        int iOrdinal = yxiVar.ordinal();
        if (iOrdinal == 308) {
            this.g = SystemClock.elapsedRealtime();
            if (jElapsedRealtime < this.b) {
                d(yxi.WIRELESS_WIFI_PROJECTION_REQUEST_CANCELED);
            }
        } else if ((iOrdinal == 505 || iOrdinal == 506) && jElapsedRealtime < this.c) {
            d(yxi.WIRELESS_WIFI_PROJECTION_REQUEST_CANCELED);
        }
        if (koo.n()) {
            koo.m().k(yxiVar);
            if (yxiVar == yxi.WIRELESS_SETUP_SHARED_SERVICE_STARTED) {
                ((ype) ((ype) e.f()).ai(3266)).x("FI_ONLY: ReleaseChannel__gearhead_channel=%d", acvz.b());
            }
        }
    }

    @Override // defpackage.pah
    public final void b() {
    }

    @Override // defpackage.pah
    public final void a(String str, int i, WifiInfo wifiInfo, int i2, int i3) {
    }
}
