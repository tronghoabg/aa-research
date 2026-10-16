package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;

/* loaded from: classes2.dex */
public final class fsp implements fsn {
    private final ConnectivityManager a;
    private final fso b;
    private final ftz c;

    public fsp(ConnectivityManager connectivityManager, ftz ftzVar) {
        this.a = connectivityManager;
        this.c = ftzVar;
        fso fsoVar = new fso(this);
        this.b = fsoVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), fsoVar);
    }

    private final boolean d(Network network) {
        NetworkCapabilities networkCapabilities = this.a.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    @Override // defpackage.fsn
    public final void a() {
        this.a.unregisterNetworkCallback(this.b);
    }

    @Override // defpackage.fsn
    public final boolean b() {
        Network[] allNetworks = this.a.getAllNetworks();
        allNetworks.getClass();
        for (Network network : allNetworks) {
            network.getClass();
            if (d(network)) {
                return true;
            }
        }
        return false;
    }

    public final void c(Network network, boolean z) {
        boolean zD;
        Network[] allNetworks = this.a.getAllNetworks();
        allNetworks.getClass();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= allNetworks.length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (affa.f(network2, network)) {
                zD = z;
            } else {
                network2.getClass();
                zD = d(network2);
            }
            if (zD) {
                z2 = true;
                break;
            }
            i++;
        }
        ftz ftzVar = this.c;
        if (((ugn) ftzVar.a.get()) != null) {
            ftzVar.b = z2;
        } else {
            ftzVar.a();
        }
    }
}
