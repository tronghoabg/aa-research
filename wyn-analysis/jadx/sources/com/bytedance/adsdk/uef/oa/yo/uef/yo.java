package com.bytedance.adsdk.uef.oa.yo.uef;

import com.bytedance.adsdk.uef.oa.oa.uef.orq;
import java.util.Deque;

/* loaded from: classes.dex */
public class yo extends ivm {
    @Override // com.bytedance.adsdk.uef.oa.yo.uef.ivm
    public int uef(String str, int i5, Deque<com.bytedance.adsdk.uef.oa.oa.uef> deque, com.bytedance.adsdk.uef.oa.yo.uef uefVar) {
        char cUef = uef(i5, str);
        return (com.bytedance.adsdk.uef.oa.lw.uef.oa(cUef) || cUef == '$') ? uef(str, i5, deque) : uefVar.uef(str, i5, deque);
    }

    private int uef(String str, int i5, Deque<com.bytedance.adsdk.uef.oa.oa.uef> deque) {
        int i10;
        int i11 = 0;
        while (true) {
            i10 = i11 + i5;
            char cUef = uef(i10, str);
            if (!com.bytedance.adsdk.uef.oa.lw.uef.oa(cUef) && !com.bytedance.adsdk.uef.oa.lw.uef.yo(cUef) && '.' != cUef && '[' != cUef && ']' != cUef && '_' != cUef && '$' != cUef) {
                break;
            }
            i11++;
        }
        String strSubstring = str.substring(i5, i10);
        if (com.bytedance.adsdk.uef.oa.moa.uef.uef(strSubstring) != null) {
            deque.push(new com.bytedance.adsdk.uef.oa.oa.uef.xs(strSubstring));
            return i10;
        }
        deque.push(new orq(strSubstring));
        return i10;
    }
}
