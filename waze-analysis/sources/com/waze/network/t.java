package com.waze.network;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class t extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y f32410a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f32411b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.a.ad f32412c;

    t(y yVar, h.g.b.aq aqVar, kotlinx.coroutines.a.ad adVar) {
        this.f32410a = yVar;
        this.f32411b = aqVar;
        this.f32412c = adVar;
    }

    private final void a() {
        this.f32412c.i(this.f32411b.f48105a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        h.g.b.x.f(network, "network");
        y yVar = this.f32410a;
        LinkProperties linkProperties = yVar.a().getLinkProperties(network);
        NetworkCapabilities networkCapabilities = yVar.a().getNetworkCapabilities(network);
        yVar.b().a("onAvailable network=" + network + ", capabilities=" + networkCapabilities);
        h.g.b.aq aqVar = this.f32411b;
        if (networkCapabilities != null) {
            aqVar.f48105a = new s(networkCapabilities, linkProperties);
        } else {
            aqVar.f48105a = null;
        }
        a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        h.g.b.x.f(network, "network");
        h.g.b.x.f(networkCapabilities, "networkCapabilities");
        y yVar = this.f32410a;
        yVar.b().a("onCapabilitiesChanged network=" + network + ", capabilities=" + networkCapabilities);
        this.f32411b.f48105a = new s(networkCapabilities, yVar.a().getLinkProperties(network));
        a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        h.g.b.x.f(network, "network");
        com.waze.shared_infra.i.e eVarB = this.f32410a.b();
        Objects.toString(network);
        eVarB.a("onLost network=".concat(String.valueOf(network)));
        this.f32411b.f48105a = null;
        a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        this.f32411b.f48105a = null;
        this.f32410a.b().a("onUnavailable clearing all networks");
        a();
    }
}
