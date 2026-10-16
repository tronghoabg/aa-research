package com.bytedance.sdk.component.adexpress.dynamic.lw;

import com.bytedance.sdk.component.adexpress.dynamic.lw.oa;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class zjm {
    public static float uef(float f10) {
        return (float) Math.ceil((f10 * 16.0f) / 16.0f);
    }

    public static List<oa.uef> uef(float f10, List<oa.uef> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<oa.uef> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((oa.uef) it.next().clone());
        }
        Iterator it2 = arrayList.iterator();
        boolean z2 = true;
        int i5 = 0;
        int i10 = 0;
        while (it2.hasNext()) {
            oa.uef uefVar = (oa.uef) it2.next();
            if (uefVar.f24845oa) {
                i5 = (int) (i5 + uefVar.uef);
            } else {
                i10 = (int) (i10 + uefVar.uef);
                z2 = false;
            }
        }
        if (!z2 || f10 <= i5) {
            float f11 = i5;
            float f12 = f10 < f11 ? f10 / f11 : 1.0f;
            float f13 = f10 > f11 ? (f10 - f11) / i10 : 0.0f;
            if (f13 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                boolean z10 = false;
                while (it3.hasNext()) {
                    oa.uef uefVar2 = (oa.uef) it3.next();
                    if (!uefVar2.f24845oa) {
                        float f14 = uefVar2.yo;
                        if (f14 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && uefVar2.uef * f13 > f14) {
                            uefVar2.uef = f14;
                            uefVar2.f24845oa = true;
                            z10 = true;
                        }
                    }
                    arrayList2.add(uefVar2);
                }
                if (z10) {
                    return uef(f10, arrayList2);
                }
            }
            Iterator it4 = arrayList.iterator();
            int i11 = 0;
            while (it4.hasNext()) {
                oa.uef uefVar3 = (oa.uef) it4.next();
                if (uefVar3.f24845oa) {
                    uefVar3.uef = uef(uefVar3.uef * f12);
                } else {
                    uefVar3.uef = uef(uefVar3.uef * f13);
                }
                i11 = (int) (i11 + uefVar3.uef);
            }
            float f15 = i11;
            if (f15 < f10) {
                float f16 = f10 - f15;
                for (int size = 0; size < arrayList.size() && f16 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT; size = (size + 1) % arrayList.size()) {
                    oa.uef uefVar4 = (oa.uef) arrayList.get(size);
                    if ((f10 < f11 && uefVar4.f24845oa) || (f10 > f11 && !uefVar4.f24845oa)) {
                        uefVar4.uef += 0.0625f;
                        f16 -= 0.0625f;
                    }
                }
            }
        }
        return arrayList;
    }
}
