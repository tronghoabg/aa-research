package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fsz implements defpackage.fsx {
    private final android.net.ConnectivityManager a;
    private final defpackage.fsy b;
    private final defpackage.fuj c;

    public fsz(android.net.ConnectivityManager connectivityManager, defpackage.fuj fujVar) {
        this.a = connectivityManager;
        this.c = fujVar;
        defpackage.fsy fsyVar = new defpackage.fsy(this);
        this.b = fsyVar;
        connectivityManager.registerNetworkCallback(new android.net.NetworkRequest.Builder().addCapability(12).build(), fsyVar);
    }

    private final boolean d(android.net.Network network) {
        android.net.NetworkCapabilities networkCapabilities = this.a.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    @Override // defpackage.fsx
    public final void a() {
        this.a.unregisterNetworkCallback(this.b);
    }

    @Override // defpackage.fsx
    public final boolean b() {
        android.net.Network[] allNetworks = this.a.getAllNetworks();
        allNetworks.getClass();
        for (android.net.Network network : allNetworks) {
            network.getClass();
            if (d(network)) {
                return true;
            }
        }
        return false;
    }

    public final void c(android.net.Network network, boolean z) {
        boolean zD;
        android.net.Network[] allNetworks = this.a.getAllNetworks();
        allNetworks.getClass();
        boolean z2 = false;
        for (android.net.Network network2 : allNetworks) {
            if (defpackage.afga.f(network2, network)) {
                zD = z;
            } else {
                network2.getClass();
                zD = d(network2);
            }
            if (zD) {
                z2 = true;
                break;
            }
        }
        defpackage.fuj fujVar = this.c;
        if (((defpackage.uhj) fujVar.a.get()) != null) {
            fujVar.b = z2;
        } else {
            fujVar.a();
        }
    }
}
