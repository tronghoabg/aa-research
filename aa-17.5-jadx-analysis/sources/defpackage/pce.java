package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class pce extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int e = 0;
    public final yph a;
    public final ConnectivityManager b;
    public final AtomicReference c = new AtomicReference();
    public pch d;
    private final Handler f;
    private final aitx g;

    public pce(Handler handler, yph yphVar, ConnectivityManager connectivityManager) {
        this.f = handler;
        this.a = yphVar;
        this.b = connectivityManager;
        this.g = ahni.b(aiji.b(new fpe(handler, 5)));
    }

    public final ConnectivityManager.NetworkCallback a() {
        pch pchVar = this.d;
        pcg pcgVar = pchVar instanceof pcg ? (pcg) pchVar : null;
        if (pcgVar != null) {
            return pcgVar.a;
        }
        return null;
    }

    public final void b(pch pchVar) {
        if ((pchVar != null && this.d == null) || (pchVar == null && this.d != null)) {
            this.d = pchVar;
            return;
        }
        throw new IllegalStateException("Try to have multiple network callbacks in-flight (current callback: " + this.d + ").");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) throws Throwable {
        ConnectivityManager.NetworkCallback networkCallbackA;
        network.getClass();
        pch pchVar = this.d;
        rla rlaVarM = koo.m();
        par parVar = par.WIFI_NETWORK_AVAILABLE;
        pcc pccVar = new pcc(this, 0);
        pcd pcdVar = new pcd(this, pchVar, network, 0);
        Handler handler = this.f;
        Object objC = rlaVarM.c(parVar, pccVar, handler, pcdVar);
        objC.getClass();
        if (((Boolean) objC).booleanValue() || (networkCallbackA = a()) == null) {
            return;
        }
        networkCallbackA.onAvailable(network);
        koo.m().c(parVar, new pcc(this, 2), handler, new pcd(this, this.d, network, 2));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        network.getClass();
        linkProperties.getClass();
        this.a.l().u("onLinkPropertiesChanged called.");
        ahnc.d(this.g, null, 0, new bqi(this, network, linkProperties, (afck) null, 16), 3);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        ConnectivityManager.NetworkCallback networkCallbackA = a();
        if (networkCallbackA != null) {
            networkCallbackA.onLost(network);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        ConnectivityManager.NetworkCallback networkCallbackA = a();
        if (networkCallbackA != null) {
            networkCallbackA.onUnavailable();
        }
    }
}
