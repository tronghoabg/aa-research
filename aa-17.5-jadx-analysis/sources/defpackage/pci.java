package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class pci implements pbz {
    public final ConnectivityManager a;
    public final yph b;
    public final pce c;
    private final Handler d;

    public pci(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
        Handler handler = new Handler(Looper.getMainLooper());
        this.d = handler;
        yph yphVarC = yph.c("GH.FICM");
        this.b = yphVarC;
        this.c = new pce(handler, yphVarC, connectivityManager);
    }

    private final void e(final NetworkRequest networkRequest, final ConnectivityManager.NetworkCallback networkCallback, final long j) throws Throwable {
        final affv affvVar = new affv();
        koo.m().c(par.WIFI_NETWORK_REQUEST, new rkz() { // from class: pcb
            @Override // defpackage.rkz
            public final Object a(pat patVar) {
                pci pciVar = this.a;
                ConnectivityManager.NetworkCallback networkCallback2 = networkCallback;
                if (patVar == pat.WIFI_NETWORK_UNAVAILABLE) {
                    affv affvVar2 = affvVar;
                    pce pceVar = pciVar.c;
                    pceVar.b(new pcf(networkCallback2));
                    affvVar2.a = pceVar.d;
                    pciVar.b.l().u("Network Request dropped.");
                } else {
                    NetworkRequest networkRequest2 = networkRequest;
                    long j2 = j;
                    if (a.j(j2, aisq.a)) {
                        pciVar.a.requestNetwork(networkRequest2, pciVar.c);
                    } else {
                        pciVar.a.requestNetwork(networkRequest2, pciVar.c, (int) aisq.e(j2));
                    }
                    pciVar.c.b(new pcg(networkCallback2));
                }
                return afak.a;
            }
        }, this.d, new pcd(affvVar, this, networkCallback, 1));
    }

    @Override // defpackage.pbz
    public final NetworkCapabilities a(Network network) {
        network.getClass();
        return this.a.getNetworkCapabilities(network);
    }

    @Override // defpackage.pbz
    public final void b(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback) throws Throwable {
        networkRequest.getClass();
        networkCallback.getClass();
        e(networkRequest, networkCallback, aisq.a);
    }

    @Override // defpackage.pbz
    public final void c(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, int i) throws Throwable {
        networkRequest.getClass();
        networkCallback.getClass();
        e(networkRequest, networkCallback, afzc.c(i, aiss.c));
    }

    @Override // defpackage.pbz
    public final void d(ConnectivityManager.NetworkCallback networkCallback) {
        networkCallback.getClass();
        pce pceVar = this.c;
        pch pchVar = pceVar.d;
        if (!affa.f(pchVar != null ? pchVar.a : null, networkCallback)) {
            throw new IllegalStateException("Try to unregister a network request that is not dropped or registered.");
        }
        if (affa.f(pceVar.a(), networkCallback)) {
            this.a.unregisterNetworkCallback(pceVar);
        }
        pceVar.b(null);
    }
}
