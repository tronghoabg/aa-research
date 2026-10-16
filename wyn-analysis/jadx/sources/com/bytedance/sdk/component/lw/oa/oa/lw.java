package com.bytedance.sdk.component.lw.oa.oa;

import com.bytedance.sdk.component.lw.oib;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class lw implements ivm {
    @Override // com.bytedance.sdk.component.lw.oa.oa.ivm
    public boolean uef(com.bytedance.sdk.component.lw.oa.yo.yo yoVar, oib oibVar, com.bytedance.sdk.component.lw.oa.yo.uef uefVar) {
        List<com.bytedance.sdk.component.lw.oa.yo.yo> copyOnWriteArrayList;
        String strOib = yoVar.oib();
        Map<String, List<com.bytedance.sdk.component.lw.oa.yo.yo>> mapCz = yoVar.ab().cz();
        yoVar.dj();
        yoVar.uef();
        synchronized (mapCz) {
            try {
                copyOnWriteArrayList = mapCz.get(strOib);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                    mapCz.put(strOib, copyOnWriteArrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(yoVar);
            if (copyOnWriteArrayList.size() <= 1) {
                return true;
            }
            yoVar.dj();
            yoVar.uef();
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.lw.oa.oa.ivm
    public String uef() {
        return "check_duplicate";
    }
}
