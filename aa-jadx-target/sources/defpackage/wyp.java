package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class wyp extends android.net.ConnectivityManager.NetworkCallback {
    final /* synthetic */ defpackage.wyv a;

    public wyp(defpackage.wyv wyvVar) {
        this.a = wyvVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) this.a.c.getSystemService(android.net.ConnectivityManager.class);
        android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
        ((defpackage.yqj) ((defpackage.yqj) defpackage.wyv.m.f()).ai(9924)).M("New available network %s, binding :projection to the current active network: %s", network, activeNetwork);
        connectivityManager.bindProcessToNetwork(activeNetwork);
    }
}
