package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pcw implements defpackage.pcx {
    private final android.net.ConnectivityManager a;

    public pcw(android.net.ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.pcx
    public final android.net.NetworkCapabilities a(android.net.Network network) {
        network.getClass();
        return this.a.getNetworkCapabilities(network);
    }

    @Override // defpackage.pcx
    public final void b(android.net.NetworkRequest networkRequest, android.net.ConnectivityManager.NetworkCallback networkCallback) {
        networkRequest.getClass();
        networkCallback.getClass();
        this.a.requestNetwork(networkRequest, networkCallback);
    }

    @Override // defpackage.pcx
    public final void c(android.net.NetworkRequest networkRequest, android.net.ConnectivityManager.NetworkCallback networkCallback, int i) {
        networkRequest.getClass();
        networkCallback.getClass();
        this.a.requestNetwork(networkRequest, networkCallback, i);
    }

    @Override // defpackage.pcx
    public final void d(android.net.ConnectivityManager.NetworkCallback networkCallback) {
        networkCallback.getClass();
        this.a.unregisterNetworkCallback(networkCallback);
    }
}
