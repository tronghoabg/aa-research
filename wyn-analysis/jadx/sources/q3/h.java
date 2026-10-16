package Q3;

import T3.r;
import Va.Y7;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.AbstractC3340k;
import nd.C3616b;

/* loaded from: classes.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9836b;

    public /* synthetic */ h(Object obj, int i5) {
        this.f9835a = i5;
        this.f9836b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f9835a) {
            case 1:
                Wb.a aVar = (Wb.a) this.f9836b;
                aVar.f15453d.post(new r(19, aVar, xa.d.m(((ConnectivityManager) aVar.f15451b.f47873b).getNetworkCapabilities(network))));
                break;
            case 2:
                Dd.c.y((Dd.c) this.f9836b, network, true);
                break;
            case 3:
                ((C3616b) this.f9836b).f41013a.j();
                break;
            case 4:
                ((Y7) this.f9836b).i(true);
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z2) {
        switch (this.f9835a) {
            case 3:
                if (!z2) {
                    ((C3616b) this.f9836b).f41013a.j();
                    break;
                }
                break;
            default:
                super.onBlockedStatusChanged(network, z2);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        switch (this.f9835a) {
            case 0:
                AbstractC3340k.e(network, "network");
                AbstractC3340k.e(capabilities, "capabilities");
                J3.r.d().a(j.f9839a, "Network capabilities changed: " + capabilities);
                i iVar = (i) this.f9836b;
                iVar.c(j.a(iVar.f9837f));
                break;
            case 1:
                Wb.a aVar = (Wb.a) this.f9836b;
                aVar.f15451b.getClass();
                aVar.f15453d.post(new r(19, aVar, xa.d.m(capabilities)));
                break;
            default:
                super.onCapabilitiesChanged(network, capabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        switch (this.f9835a) {
            case 0:
                AbstractC3340k.e(network, "network");
                J3.r.d().a(j.f9839a, "Network connection lost");
                i iVar = (i) this.f9836b;
                iVar.c(j.a(iVar.f9837f));
                break;
            case 1:
                Wb.a aVar = (Wb.a) this.f9836b;
                aVar.getClass();
                aVar.f15453d.postDelayed(new C8.g(aVar, 22), 500L);
                break;
            case 2:
                Dd.c.y((Dd.c) this.f9836b, network, false);
                break;
            case 3:
            default:
                super.onLost(network);
                break;
            case 4:
                ((Y7) this.f9836b).i(false);
                break;
        }
    }
}
