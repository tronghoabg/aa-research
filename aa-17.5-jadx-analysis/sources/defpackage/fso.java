package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes2.dex */
public final class fso extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ fsp a;

    public fso(fsp fspVar) {
        this.a = fspVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        this.a.c(network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        this.a.c(network, false);
    }
}
