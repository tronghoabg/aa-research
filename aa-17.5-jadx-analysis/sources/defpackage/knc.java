package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes2.dex */
public final class knc {
    public static final yph a = yph.c("GH.Bsit.SetupSource");
    public static final yfy b;
    public final Handler c;
    public final HandlerThread d;
    public final knq e;
    public boolean f;

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e(pag.CONNECTING_RFCOMM, yxk.RFCOMM_CONNECTING);
        yfuVar.e(pag.CONNECTED_RFCOMM, yxk.BT_CONNECTED);
        yfuVar.e(pag.DISCONNECTED_BT, yxk.BT_DISCONNECTED);
        yfuVar.e(pag.BT_HFP_A2DP_CONNECTED, yxk.BT_HFP_A2DP_CONNECTED);
        yfuVar.e(pag.BT_HFP_A2DP_DISCONNECTED, yxk.BT_HFP_A2DP_DISCONNECTED);
        yfuVar.e(pag.RECONNECTION_PREVENTED, yxk.RECONNECTION_PREVENTED);
        yfuVar.e(pag.RFCOMM_READ_WRITE_FAILURE, yxk.RFCOMM_READ_WRITE_FAILURE);
        yfuVar.e(pag.FOUND_COMPATIBLE_WIFI_NETWORK, yxk.FOUND_COMPATIBLE_WIFI_NETWORK);
        yfuVar.e(pag.NO_COMPATIBLE_WIFI_CHANNEL_FOUND, yxk.NO_COMPATIBLE_WIFI_CHANNEL_FOUND);
        yfuVar.e(pag.NO_COMPATIBLE_WIFI_VERSION_FOUND, yxk.NO_COMPATIBLE_WIFI_VERSION_FOUND);
        yfuVar.e(pag.WIFI_PROJECTION_START_REQUESTED, yxk.WIFI_START_REQUEST_RECEIVED);
        yfuVar.e(pag.WIFI_PROJECTION_RESTART_REQUESTED, yxk.WIFI_START_REQUEST_RECEIVED);
        yfuVar.e(pag.CONNECTING_WIFI, yxk.WIFI_CONNECTING);
        yfuVar.e(pag.CONNECTED_WIFI, yxk.WIFI_CONNECTED);
        yfuVar.e(pag.WIFI_FAILED_TO_AUTOMATICALLY_ENABLE, yxk.WIFI_DISABLED);
        yfuVar.e(pag.ABORTED_WIFI, yxk.WIFI_ABORTED);
        yfuVar.e(pag.WIFI_CONNECT_TIMED_OUT, yxk.WIFI_CONNECT_TIMED_OUT);
        yfuVar.e(pag.PROJECTION_INITIATED, yxk.PROJECTION_INITIATED);
        yfuVar.e(pag.PROJECTION_CONNECTED, yxk.PROJECTION_CONNECTED);
        yfuVar.e(pag.PROJECTION_IN_PROGRESS, yxk.PROJECTION_IN_PROGRESS);
        yfuVar.e(pag.PROJECTION_DISCONNECTED, yxk.PROJECTION_DISCONNECTED);
        yfuVar.e(pag.PROJECTION_ENDED, yxk.PROJECTION_ENDED);
        yfuVar.e(pag.IDLE, yxk.IDLE_STATE_ENTERED);
        yfuVar.e(pag.SHUTDOWN, yxk.WIRELESS_SERVICE_SHUT_DOWN);
        b = yfuVar.d(true);
    }

    public knc(eqa eqaVar, knq knqVar) {
        this.e = knqVar;
        HandlerThread handlerThread = new HandlerThread("SetupDataSource thread");
        this.d = handlerThread;
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
        ((ype) a.l().ai((char) 3246)).u("Starting");
        eqaVar.getLifecycle().c(new mjk(this, 1));
    }
}
