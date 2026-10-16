package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;

/* loaded from: classes2.dex */
public final class pcs implements ozt {
    public static final yph a = yph.c("GH.WirelessNetRequest");
    public Network c;
    public boolean d;
    public String e;
    public int f;
    public WifiInfo g;
    public boolean h;
    public boolean i;
    public final pgf k;
    private final ConnectivityManager l;
    private final boolean n;
    private final ConnectivityManager.NetworkCallback m = new pcr(this);
    public final Handler b = new Handler(Looper.getMainLooper());
    public final boolean j = aczv.aw();

    public pcs(gkj gkjVar) {
        this.l = (ConnectivityManager) ((Context) gkjVar.c).getSystemService("connectivity");
        this.k = (pgf) gkjVar.b;
        this.n = gkjVar.a;
    }

    @Override // defpackage.ozt
    public final void a(ozy ozyVar, ozs ozsVar) {
        throw new UnsupportedOperationException("Not supported on the Legacy Manager.");
    }

    @Override // defpackage.ozt
    public final void b() {
        c();
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 6310)).u("WirelessNetworkRequestManager: unregisterRequest");
        c();
        f();
        ((ype) yphVar.l().ai((char) 6308)).u("WirelessNetworkRequestManager stopped.");
    }

    public final void c() {
        woy.Z(Looper.myLooper() == Looper.getMainLooper());
    }

    public final void d() {
        c();
        if (this.i) {
            return;
        }
        ((ype) a.l().ai((char) 6306)).w("Requesting network. PID=%d", Process.myPid());
        this.c = null;
        this.l.requestNetwork(new NetworkRequest.Builder().addTransportType(1).build(), this.m);
        this.i = true;
    }

    public final void e(boolean z) {
        c();
        Network network = this.c;
        boolean z2 = this.d;
        if (network == null) {
            this.d = z | z2;
            return;
        }
        if (z2 || z) {
            this.d = false;
            ojl ojlVar = new ojl(this, network, 11);
            if (this.n) {
                ojlVar.run();
            } else {
                this.b.post(ojlVar);
            }
        }
    }

    public final void f() {
        c();
        if (this.i) {
            this.c = null;
            ((ype) a.l().ai((char) 6309)).w("Unregistering network callback. PID=%d", Process.myPid());
            this.l.unregisterNetworkCallback(this.m);
            this.i = false;
        }
    }

    public final String toString() {
        return "LegacyNetworkRequestManager{network=" + String.valueOf(this.c) + ", projectionIpAddress=" + this.e + ", projectionPort=" + this.f + ", projectionInitiated=" + this.h + ", networkRequested=" + this.i + ", projectionWifiInfo=" + String.valueOf(this.g) + "}";
    }
}
