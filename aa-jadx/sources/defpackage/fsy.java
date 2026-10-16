package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fsy extends android.net.ConnectivityManager.NetworkCallback {
    final /* synthetic */ defpackage.fsz a;

    public fsy(defpackage.fsz fszVar) {
        this.a = fszVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        network.getClass();
        this.a.c(network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        network.getClass();
        this.a.c(network, false);
    }
}
