package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;

/* loaded from: classes2.dex */
public final class pby implements pbz {
    private final ConnectivityManager a;

    public pby(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.pbz
    public final NetworkCapabilities a(Network network) {
        network.getClass();
        return this.a.getNetworkCapabilities(network);
    }

    @Override // defpackage.pbz
    public final void b(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback) {
        networkRequest.getClass();
        networkCallback.getClass();
        this.a.requestNetwork(networkRequest, networkCallback);
    }

    @Override // defpackage.pbz
    public final void c(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, int i) {
        networkRequest.getClass();
        networkCallback.getClass();
        this.a.requestNetwork(networkRequest, networkCallback, i);
    }

    @Override // defpackage.pbz
    public final void d(ConnectivityManager.NetworkCallback networkCallback) {
        networkCallback.getClass();
        this.a.unregisterNetworkCallback(networkCallback);
    }
}
