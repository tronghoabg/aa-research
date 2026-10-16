package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ntz extends android.net.ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ defpackage.nua a;

    public ntz(defpackage.nua nuaVar) {
        this.a = nuaVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        ((defpackage.yqj) defpackage.nua.a.l().ai((char) 5436)).y("onAvailable(%s)", network);
        defpackage.wfp.e(new defpackage.mta(this.a, 14));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(android.net.Network network, boolean z) {
        ((defpackage.yqj) defpackage.nua.a.l().ai(5437)).N("onBlockedStatusChanged(%s, %b)", network, z);
        defpackage.wfp.e(new defpackage.mta(this.a, 14));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(0) && networkCapabilities.hasCapability(12)) {
            defpackage.wfp.e(new nty(this, network, networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(18), networkCapabilities));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(android.net.Network network, int i) {
        ((defpackage.yqj) defpackage.nua.a.l().ai(5438)).K("onLosing(%s, %d)", network, i);
        defpackage.wfp.e(new defpackage.mta(this.a, 14));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        ((defpackage.yqj) defpackage.nua.a.l().ai((char) 5439)).y("onLost(%s)", network);
        defpackage.wfp.e(new defpackage.mta(this, 13));
    }
}
