package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class uyg extends android.net.ConnectivityManager.NetworkCallback {
    final /* synthetic */ defpackage.uyi a;

    public uyg(defpackage.uyi uyiVar) {
        this.a = uyiVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        this.a.a(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        this.a.f(network);
    }
}
