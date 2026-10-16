package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes2.dex */
public final class idr extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ scz a;

    public idr(scz sczVar) {
        this.a = sczVar;
    }

    private final void a(boolean z) {
        ify.g(new jgv(this, z, 1, null));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        a(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        a(false);
    }
}
