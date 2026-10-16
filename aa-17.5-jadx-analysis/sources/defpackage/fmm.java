package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class fmm extends ConnectivityManager.NetworkCallback {
    public static final fmm a = new fmm();
    public static final Object b = new Object();
    public static final Map c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    private static final void b() {
        ArrayList<aezu> arrayList = new ArrayList();
        synchronized (b) {
            if (e && f != null) {
                for (Map.Entry entry : c.entrySet()) {
                    arrayList.add(new aezu((afec) entry.getKey(), a.a((NetworkRequest) entry.getValue(), d) ? fmg.a : new fmh(7)));
                }
                for (aezu aezuVar : arrayList) {
                    ((afec) aezuVar.a).invoke((flq) aezuVar.b);
                }
                return;
            }
            fjo.a().c(fmp.a, "Not dispatching constraint state yet: isBlocked=" + f + ", capabilitiesInitialized=" + e);
        }
    }

    public final boolean a(NetworkRequest networkRequest, NetworkCapabilities networkCapabilities) {
        Boolean bool = f;
        bool.getClass();
        return !bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        fjo.a().c(fmp.a, a.bR(z, "NetworkRequestConstraintController onBlockedStatusChanged callback "));
        synchronized (b) {
            Boolean bool = f;
            Boolean boolValueOf = Boolean.valueOf(z);
            if (affa.f(bool, boolValueOf)) {
                return;
            }
            f = boolValueOf;
            b();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        fjo.a().c(fmp.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        fjo.a().c(fmp.a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            d = null;
            Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                ((afec) it.next()).invoke(new fmh(7));
            }
        }
    }
}
