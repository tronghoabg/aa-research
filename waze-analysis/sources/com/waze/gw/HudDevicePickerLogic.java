package com.waze.gw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
final class HudDevicePickerLogic {
    private HudDevicePickerLogic() {
    }

    static HudProtocolFamily classifyVietMap(Iterable<String> iterable, int i2) {
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            Iterator<String> it = iterable.iterator();
            while (it.hasNext()) {
                String strNormalizeUuid = HudProtocolSelector.normalizeUuid(it.next());
                if ("0000ffff-0000-1000-8000-00805f9b34fb".equals(strNormalizeUuid) || "0000fff0-0000-1000-8000-00805f9b34fb".equals(strNormalizeUuid)) {
                    arrayList.add(strNormalizeUuid);
                }
            }
        }
        return HudProtocolSelector.select(HudProtocolFamily.AUTO, arrayList, i2);
    }

    static boolean acceptsVietMapBle(Iterable<String> iterable) {
        HudProtocolFamily hudProtocolFamilyClassifyVietMap = classifyVietMap(iterable, 2);
        return hudProtocolFamilyClassifyVietMap == HudProtocolFamily.VIETMAP_H50 || hudProtocolFamilyClassifyVietMap == HudProtocolFamily.VIETMAP_H1;
    }

    static List<String> manualServices(HudProtocolFamily hudProtocolFamily) {
        if (hudProtocolFamily == HudProtocolFamily.VIETMAP_H50) {
            return Collections.singletonList("0000ffff-0000-1000-8000-00805f9b34fb");
        }
        if (hudProtocolFamily == HudProtocolFamily.VIETMAP_H1) {
            return Collections.singletonList("0000fff0-0000-1000-8000-00805f9b34fb");
        }
        return Collections.emptyList();
    }
}
