package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.TransportInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.os.Build;
import j$.util.Optional;

/* loaded from: classes2.dex */
public final class pcz extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ pdh a;

    public pcz(pdh pdhVar) {
        this.a = pdhVar;
    }

    private final void c(Runnable runnable) {
        pdh pdhVar = this.a;
        pdhVar.m.f(runnable, pdhVar.F, 0L);
    }

    public final void a(Network network, LinkProperties linkProperties) {
        pdh pdhVar = this.a;
        pdhVar.A = network;
        pdhVar.B = linkProperties;
        if (Build.VERSION.SDK_INT < 31) {
            pdhVar.C = pdhVar.k.getConnectionInfo();
            return;
        }
        Optional optionalOfNullable = Optional.ofNullable(pdhVar.j.a(network));
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((NetworkCapabilities) optionalOfNullable.get()).getTransportInfo());
        }
        if (true == optionalOfNullable.isPresent()) {
            TransportInfo transportInfoM282m = ep$$ExternalSyntheticApiModelOutline0.m282m(optionalOfNullable.get());
            optionalOfNullable = Optional.ofNullable(transportInfoM282m instanceof WifiInfo ? (WifiInfo) transportInfoM282m : null);
        }
        pdhVar.C = (WifiInfo) optionalOfNullable.orElse(null);
    }

    public final /* synthetic */ void b(ScanResult scanResult) {
        this.a.b(yxi.WIRELESS_WIFI_CHANNEL_WIDTH_USED, scanResult.channelWidth);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        c(new oey(this, linkProperties, network, 12, (char[]) null));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        c(new ojl(this, network, 14));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        c(new pct(this, 7));
    }
}
