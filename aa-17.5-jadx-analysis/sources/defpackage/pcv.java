package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class pcv {
    public static final yph a = yph.c("GH.WIRELESS.WIFI");
    public int d;
    public final Context e;
    public xpv f;
    public String g;
    public String h;
    public int i;
    public boolean j;
    public volatile int k;
    public WifiManager.WifiLock l;
    public final Handler n;
    public final pgr o;
    public final ohe r;
    public final ajdr s;
    private final Looper t;
    public final Object b = new Object();
    private boolean u = false;
    public final Runnable p = new pct(this, 1);
    public final BroadcastReceiver q = new pcu(this);
    public final Handler m = new Handler(Looper.getMainLooper());
    public pag c = pag.IDLE;

    public pcv(Context context, Looper looper, ohe oheVar, pgr pgrVar, ajdr ajdrVar) {
        this.e = context;
        this.t = looper;
        this.n = new Handler(looper);
        this.r = oheVar;
        this.o = pgrVar;
        this.s = ajdrVar;
    }

    public final void a() {
        ((ype) ((ype) a.g()).ai((char) 6319)).u("Failed to connect with provided wifi credentials");
        this.r.c(this.f, 103);
        pag pagVar = pag.ABORTED_WIFI;
        this.c = pagVar;
        b(pagVar);
    }

    public final void b(pag pagVar) {
        pgr pgrVar = this.o;
        pgrVar.y(pagVar);
        if (this.j) {
            boolean zAS = aczv.aS();
            String strK = this.g;
            if (zAS) {
                int i = jlp.a;
                strK = roc.k(strK);
            }
            Bundle bundle = new Bundle();
            if (!aczv.aS()) {
                int i2 = jlp.a;
                strK = roc.k(strK);
            }
            bundle.putString("PARAM_ACCESS_POINT_NAME", strK);
            pgrVar.K(pag.START_WIFI_REQUEST_FAILED_INVALID_CREDENTIALS, bundle);
            this.j = false;
        }
    }

    public final void c() {
        synchronized (this.b) {
            pag pagVar = pag.IDLE;
            if (!pagVar.equals(this.c) && !pag.SHUTDOWN.equals(this.c)) {
                ((ype) ((ype) a.g()).ai(6322)).y("Not the right mostRecentSetupEvent to start: %s", this.c);
                return;
            }
            this.u = true;
            this.c = pagVar;
            Context context = this.e;
            WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).createWifiLock(3, "Car wifi lock");
            wifiLockCreateWifiLock.setReferenceCounted(false);
            this.l = wifiLockCreateWifiLock;
            IntentFilter intentFilter = new IntentFilter("android.net.wifi.supplicant.STATE_CHANGE");
            intentFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            dup.e(context, this.q, intentFilter, null, 2);
        }
    }

    public final void d() {
        synchronized (this.b) {
            if (this.u) {
                this.u = false;
                pag pagVar = pag.SHUTDOWN;
                if (pagVar.equals(this.c)) {
                    return;
                }
                this.c = pagVar;
                WifiManager.WifiLock wifiLock = this.l;
                if (wifiLock != null && wifiLock.isHeld()) {
                    this.l.release();
                }
                this.e.unregisterReceiver(this.q);
            }
        }
    }
}
