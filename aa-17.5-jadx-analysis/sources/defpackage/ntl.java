package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class ntl extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ ntm a;

    public ntl(ntm ntmVar) {
        this.a = ntmVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        ((ype) ntm.a.l().ai((char) 5433)).y("onAvailable(%s)", network);
        wer.e(new nqw(this.a, 5));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        ((ype) ntm.a.l().ai(5434)).N("onBlockedStatusChanged(%s, %b)", network, z);
        wer.e(new nqw(this.a, 5));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(final Network network, final NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(0) && networkCapabilities.hasCapability(12)) {
            final boolean zHasCapability = networkCapabilities.hasCapability(16);
            final boolean z = !networkCapabilities.hasCapability(18);
            wer.e(new Runnable() { // from class: ntk
                @Override // java.lang.Runnable
                public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    ntm ntmVar = this.a.a;
                    Network network2 = ntmVar.i;
                    Network network3 = network;
                    boolean zEquals = Objects.equals(network2, network3);
                    boolean z2 = zHasCapability;
                    boolean z3 = z;
                    if (!zEquals || ntmVar.j != z2 || ntmVar.k != z3) {
                        ((ype) ntm.a.l().ai(5432)).M("onCapabilitiesChanged(%s, %s)", network3, networkCapabilities);
                    }
                    ntmVar.i = network3;
                    ntmVar.j = z2;
                    ntmVar.k = z3;
                    ntmVar.a();
                }
            });
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        ((ype) ntm.a.l().ai(5435)).K("onLosing(%s, %d)", network, i);
        wer.e(new nqw(this.a, 5));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        ((ype) ntm.a.l().ai((char) 5436)).y("onLost(%s)", network);
        wer.e(new nqw(this, 4));
    }
}
