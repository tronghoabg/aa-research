package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes2.dex */
public final /* synthetic */ class pcd implements rky {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ pcd(affv affvVar, pci pciVar, ConnectivityManager.NetworkCallback networkCallback, int i) {
        this.d = i;
        this.b = affvVar;
        this.a = pciVar;
        this.c = networkCallback;
    }

    @Override // defpackage.rky
    public final void a(kon konVar) throws Throwable {
        pat patVarB;
        ConnectivityManager.NetworkCallback networkCallbackA;
        pat patVarB2;
        pat patVarB3;
        ConnectivityManager.NetworkCallback networkCallbackA2;
        int i = this.d;
        if (i == 0) {
            pba pbaVar = konVar.g;
            pav pavVar = pbaVar.c == 11 ? (pav) pbaVar.d : pav.a;
            if (pavVar.b != 2 || (patVarB = pat.b(((Integer) pavVar.c).intValue())) == null) {
                patVarB = pat.NOT_INJECTED;
            }
            if (patVarB == pat.WIFI_NETWORK_DELAY_AVAILABLE) {
                Object obj = this.b;
                pce pceVar = (pce) this.a;
                if (affa.f(pceVar.d, obj) && (networkCallbackA = pceVar.a()) != null) {
                    networkCallbackA.onAvailable((Network) this.c);
                }
                aitm aitmVar = (aitm) pceVar.c.get();
                if (aitmVar != null) {
                    aitmVar.O(Boolean.valueOf(affa.f(pceVar.d, obj)));
                    return;
                }
                return;
            }
            return;
        }
        if (i != 1) {
            pba pbaVar2 = konVar.g;
            pav pavVar2 = pbaVar2.c == 11 ? (pav) pbaVar2.d : pav.a;
            if (pavVar2.b != 2 || (patVarB3 = pat.b(((Integer) pavVar2.c).intValue())) == null) {
                patVarB3 = pat.NOT_INJECTED;
            }
            if (patVarB3 == pat.WIFI_NETWORK_LOST && konVar.h.containsValue(konVar)) {
                Object obj2 = this.b;
                pce pceVar2 = (pce) this.a;
                if (!affa.f(pceVar2.d, obj2) || (networkCallbackA2 = pceVar2.a()) == null) {
                    return;
                }
                Object obj3 = this.c;
                pceVar2.a.l().u("invoke unregisterNetworkCallback and onLost callback.");
                pceVar2.b.unregisterNetworkCallback(networkCallbackA2);
                networkCallbackA2.onLost((Network) obj3);
                return;
            }
            return;
        }
        pba pbaVar3 = konVar.g;
        pav pavVar3 = pbaVar3.c == 11 ? (pav) pbaVar3.d : pav.a;
        if (pavVar3.b != 2 || (patVarB2 = pat.b(((Integer) pavVar3.c).intValue())) == null) {
            patVarB2 = pat.NOT_INJECTED;
        }
        if (patVarB2 == pat.WIFI_NETWORK_UNAVAILABLE) {
            Object obj4 = this.a;
            Object obj5 = this.b;
            pci pciVar = (pci) obj4;
            pce pceVar3 = pciVar.c;
            if (affa.f(((affv) obj5).a, pceVar3.d)) {
                pch pchVar = pceVar3.d;
                pcf pcfVar = pchVar instanceof pcf ? (pcf) pchVar : null;
                if ((pcfVar != null ? pcfVar.a : null) != null) {
                    Object obj6 = this.c;
                    pciVar.b.l().u("invoke onUnavailable callback.");
                    ((ConnectivityManager.NetworkCallback) obj6).onUnavailable();
                }
            }
        }
    }

    public /* synthetic */ pcd(pce pceVar, pch pchVar, Network network, int i) {
        this.d = i;
        this.a = pceVar;
        this.b = pchVar;
        this.c = network;
    }
}
