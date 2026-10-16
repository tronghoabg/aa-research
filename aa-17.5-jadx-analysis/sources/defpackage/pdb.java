package defpackage;

import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;

/* loaded from: classes2.dex */
final class pdb implements WifiManager.LocalOnlyDisconnectionStatusListener {
    final /* synthetic */ pdh a;

    public pdb(pdh pdhVar) {
        this.a = pdhVar;
    }

    public final void onDisconnectionStatus(WifiNetworkSpecifier wifiNetworkSpecifier, boolean z, int i) {
        ((ype) ((ype) pdh.a.f()).ai(6332)).R("Disconnection status for network %s, triggered by user: %b, reason: %s", wifiNetworkSpecifier, Boolean.valueOf(z), i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? a.bn(i, "Unknown code [", "]") : "STATUS_LOCAL_ONLY_DISCONNECTION_AIRPLANE_MODE_ON" : "STATUS_LOCAL_ONLY_DISCONNECTION_DISABLE_WIFI" : "STATUS_LOCAL_ONLY_DISCONNECTION_NEW_CONNECTION" : "STATUS_LOCAL_ONLY_DISCONNECTION_DISCONNECT_API" : "STATUS_LOCAL_ONLY_DISCONNECTION_UNKNOWN");
        pdh pdhVar = this.a;
        Integer numValueOf = Integer.valueOf(i);
        yxi yxiVar = (yxi) pdhVar.i.get(numValueOf);
        if (yxiVar != null) {
            pdhVar.a(yxiVar);
        }
        ozr ozrVar = (ozr) pdhVar.h.get(numValueOf);
        if (ozrVar == null) {
            throw new IllegalArgumentException(a.bp(i, "Invalid local disconnection reason: "));
        }
        pdhVar.c(ozrVar);
    }
}
