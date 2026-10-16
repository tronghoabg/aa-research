package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kpf extends android.net.ConnectivityManager.NetworkCallback {
    int a = 1;

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        if (this.a != 2) {
            this.a = 2;
            ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl.a.f()).ai((char) 3298)).u("Internet connected");
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        if (this.a != 3) {
            this.a = 3;
            ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl.a.f()).ai((char) 3299)).u("Internet disconnected");
        }
    }
}
