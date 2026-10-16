package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class pdg extends mdd {
    private final WeakReference a;

    public pdg(pdh pdhVar) {
        this.a = new WeakReference(pdhVar);
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("WifiScanResultsReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        ScanResult next;
        boolean z;
        pdh pdhVar = (pdh) this.a.get();
        if (pdhVar == null || pdhVar.u == null) {
            return;
        }
        String action = intent.getAction();
        if (!"android.net.wifi.SCAN_RESULTS".equals(action)) {
            ((ype) ((ype) pdh.a.h()).ai((char) 6337)).y("Unexpected action: %s", action);
            return;
        }
        pdhVar.j();
        boolean booleanExtra = intent.getBooleanExtra("resultsUpdated", true);
        yph yphVar = pdh.a;
        ((ype) yphVar.l().ai(6335)).N("Received broadcast %s, successful scan: %b", intent.getAction(), booleanExtra);
        pdhVar.a(booleanExtra ? yxi.WIRELESS_WIFI_SCAN_RESULTS_RECEIVED : yxi.WIRELESS_WIFI_SCAN_FAILED);
        Iterator<ScanResult> it = pdhVar.k.getScanResults().iterator();
        int i = Integer.MIN_VALUE;
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                next = null;
                z = false;
                break;
            }
            next = it.next();
            if (next != null && next.SSID != null && next.SSID.equals(pdhVar.u.a)) {
                i = next.level;
                if (woy.at(next.BSSID, pdhVar.u.b)) {
                    z = true;
                    z2 = true;
                    break;
                }
                z2 = true;
            }
        }
        ((ype) yphVar.l().ai(6336)).R("Requested network found: %b, BSSID mismatch: %b, network: %s", Boolean.valueOf(z), Boolean.valueOf(!z && z2), next);
        if (!z) {
            if (z2) {
                pdhVar.b(yxi.WIRELESS_WIFI_SCAN_RESULTS_BSSID_MISMATCH, i);
                return;
            } else {
                pdhVar.a(yxi.WIRELESS_WIFI_SCAN_RESULTS_NETWORK_NOT_FOUND);
                return;
            }
        }
        pdhVar.b(yxi.WIRELESS_WIFI_SCAN_RESULTS_NETWORK_FOUND, i);
        next.getClass();
        String strAl = woy.al(next.capabilities);
        boolean zContains = strAl.contains("SAE");
        boolean zContains2 = strAl.contains("RSN-PSK");
        if (zContains2 && zContains) {
            pdhVar.a(yxi.WIRELESS_WIFI_SCAN_RESULTS_TARGET_NETWORK_SUPPORTS_WPA3_WPA2);
            return;
        }
        if (zContains) {
            pdhVar.a(yxi.WIRELESS_WIFI_SCAN_RESULTS_TARGET_NETWORK_SUPPORTS_WPA3);
        } else if (zContains2) {
            pdhVar.a(yxi.WIRELESS_WIFI_SCAN_RESULTS_TARGET_NETWORK_SUPPORTS_WPA2);
        } else {
            pdhVar.a(yxi.WIRELESS_WIFI_SCAN_RESULTS_TARGET_NETWORK_UNKNOWN_SECURITY);
        }
    }
}
