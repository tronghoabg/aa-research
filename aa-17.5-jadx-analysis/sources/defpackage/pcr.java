package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes2.dex */
public final class pcr extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ pcs a;

    public pcr(pcs pcsVar) {
        this.a = pcsVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a.b.post(new ojl(this, network, 12));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.a.b.post(new oyy(this, 20));
    }
}
