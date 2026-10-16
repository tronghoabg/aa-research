package defpackage;

import android.net.wifi.WifiManager$LocalOnlyConnectionFailureListener;
import android.net.wifi.WifiNetworkSpecifier;
import j$.util.OptionalInt;

/* loaded from: classes2.dex */
final class pde implements WifiManager$LocalOnlyConnectionFailureListener {
    public boolean a = false;
    final /* synthetic */ pdh b;

    public pde(pdh pdhVar) {
        this.b = pdhVar;
    }

    public final void onConnectionFailed(WifiNetworkSpecifier wifiNetworkSpecifier, int i) {
        String strBp;
        yph yphVar = pdh.a;
        ype ypeVar = (ype) ((ype) yphVar.f()).ai(6333);
        switch (i) {
            case 0:
                strBp = "STATUS_LOCAL_ONLY_CONNECTION_FAILURE_UNKNOWN";
                break;
            case 1:
                strBp = "STATUS_LOCAL_ONLY_CONNECTION_FAILURE_ASSOCIATION";
                break;
            case 2:
                strBp = "STATUS_LOCAL_ONLY_CONNECTION_FAILURE_AUTHENTICATION";
                break;
            case 3:
                strBp = "STATUS_LOCAL_ONLY_CONNECTION_FAILURE_PROVISIONING";
                break;
            case 4:
                strBp = "STATUS_LOCAL_ONLY_CONNECTION_FAILURE_NOT_FOUND";
                break;
            case 5:
                strBp = "STATUS_LOCAL_ONLY_CONNECTION_FAILURE_NO_RESPONSE";
                break;
            case 6:
                strBp = "STATUS_LOCAL_ONLY_CONNECTION_FAILURE_USER_REJECT";
                break;
            default:
                strBp = a.bp(i, "Unknown code ");
                break;
        }
        ypeVar.M("Failed to connect to network %s with reason %s", wifiNetworkSpecifier, strBp);
        if (this.a) {
            ((ype) ((ype) yphVar.h()).ai((char) 6334)).u("Ignoring out-of-lifecycle connection failure callback");
            return;
        }
        yxi yxiVar = (yxi) pdh.f.get(Integer.valueOf(i));
        if (yxiVar != null) {
            this.b.a(yxiVar);
        }
        pdh pdhVar = this.b;
        pdhVar.m.c(pdhVar.s);
        pdhVar.d(OptionalInt.of(i));
    }
}
