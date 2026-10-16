package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes3.dex */
final class uxk extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ uxm a;

    public uxk(uxm uxmVar) {
        this.a = uxmVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a.a(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a.f(network);
    }
}
