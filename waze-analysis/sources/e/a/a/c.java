package e.a.a;

import android.net.ConnectivityManager;
import android.net.Network;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f46225a;

    /* synthetic */ c(e eVar) {
        Objects.requireNonNull(eVar);
        this.f46225a = eVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f46225a.f46227a.d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (z) {
            return;
        }
        this.f46225a.f46227a.d();
    }
}
