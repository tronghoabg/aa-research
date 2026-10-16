package com.waze.gw;

import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes10.dex */
final class HudProtocolSelector {
    static final String HLP_SERVICE_UUID = "8a7e0001-4d6e-4c48-9a9d-484c504c0001";
    static final int TRANSPORT_AUTO = 0;
    static final int TRANSPORT_BLE = 2;
    static final int TRANSPORT_SPP = 1;
    static final String VIETMAP_H1_SERVICE_UUID = "0000fff0-0000-1000-8000-00805f9b34fb";
    static final String VIETMAP_H50_SERVICE_UUID = "0000ffff-0000-1000-8000-00805f9b34fb";

    private HudProtocolSelector() {
    }

    static HudProtocolFamily select(HudProtocolFamily hudProtocolFamily, Iterable<String> iterable, int i2) {
        boolean z;
        boolean z2;
        if (hudProtocolFamily == null) {
            hudProtocolFamily = HudProtocolFamily.AUTO;
        }
        if (hudProtocolFamily != HudProtocolFamily.AUTO) {
            return hudProtocolFamily;
        }
        if (i2 == 1) {
            return HudProtocolFamily.HLP1;
        }
        boolean z3 = false;
        if (iterable == null) {
            z = false;
            z2 = false;
        } else {
            Iterator<String> it = iterable.iterator();
            z = false;
            z2 = false;
            while (it.hasNext()) {
                String strNormalizeUuid = normalizeUuid(it.next());
                if (HLP_SERVICE_UUID.equals(strNormalizeUuid)) {
                    z3 = true;
                } else if (VIETMAP_H50_SERVICE_UUID.equals(strNormalizeUuid)) {
                    z = true;
                } else if (VIETMAP_H1_SERVICE_UUID.equals(strNormalizeUuid)) {
                    z2 = true;
                }
            }
        }
        return z3 ? HudProtocolFamily.HLP1 : z ? HudProtocolFamily.VIETMAP_H50 : z2 ? HudProtocolFamily.VIETMAP_H1 : HudProtocolFamily.AUTO;
    }

    static HudProtocolFamily select(String str, Iterable<String> iterable, int i2) {
        return select(HudProtocolFamily.fromPreference(str), iterable, i2);
    }

    static String normalizeUuid(String str) {
        if (str == null) {
            return "";
        }
        String lowerCase = str.trim().toLowerCase(Locale.US);
        if (lowerCase.startsWith("{") && lowerCase.endsWith("}")) {
            lowerCase = lowerCase.substring(1, lowerCase.length() - 1).trim();
        }
        return lowerCase.length() == 4 ? "0000" + lowerCase + "-0000-1000-8000-00805f9b34fb" : lowerCase;
    }

    static String detectedService(Iterable<String> iterable, int i2) {
        HudProtocolFamily hudProtocolFamilySelect = select(HudProtocolFamily.AUTO, iterable, i2);
        return hudProtocolFamilySelect == HudProtocolFamily.HLP1 ? HLP_SERVICE_UUID : hudProtocolFamilySelect == HudProtocolFamily.VIETMAP_H50 ? VIETMAP_H50_SERVICE_UUID : hudProtocolFamilySelect == HudProtocolFamily.VIETMAP_H1 ? VIETMAP_H1_SERVICE_UUID : "";
    }
}
