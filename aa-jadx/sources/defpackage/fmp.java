package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fmp extends android.net.ConnectivityManager.NetworkCallback {
    private final defpackage.affc a;

    public fmp(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        defpackage.fjv.a().c(defpackage.fmw.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.a.invoke(defpackage.fmn.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        network.getClass();
        defpackage.fjv.a().c(defpackage.fmw.a, "NetworkRequestConstraintController onLost callback");
        this.a.invoke(new defpackage.fmo(7));
    }
}
