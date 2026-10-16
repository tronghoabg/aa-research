package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
final class wxt extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ wxz a;

    public wxt(wxz wxzVar) {
        this.a = wxzVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.c.getSystemService(ConnectivityManager.class);
        Network activeNetwork = connectivityManager.getActiveNetwork();
        ((ype) ((ype) wxz.m.f()).ai(9896)).M("New available network %s, binding :projection to the current active network: %s", network, activeNetwork);
        connectivityManager.bindProcessToNetwork(activeNetwork);
    }
}
