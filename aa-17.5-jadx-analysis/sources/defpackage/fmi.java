package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes2.dex */
final class fmi extends ConnectivityManager.NetworkCallback {
    private final afec a;

    public fmi(afec afecVar) {
        this.a = afecVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        fjo.a().c(fmp.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.a.invoke(fmg.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        fjo.a().c(fmp.a, "NetworkRequestConstraintController onLost callback");
        this.a.invoke(new fmh(7));
    }
}
