package com.bytedance.adsdk.uef.oa.yo.uef;

import java.util.Deque;

/* loaded from: classes.dex */
public class lw extends ivm {
    @Override // com.bytedance.adsdk.uef.oa.yo.uef.ivm
    public int uef(String str, int i5, Deque<com.bytedance.adsdk.uef.oa.oa.uef> deque, com.bytedance.adsdk.uef.oa.yo.uef uefVar) {
        char cUef;
        int i10 = i5;
        while (true) {
            cUef = uef(i10, str);
            if (!com.bytedance.adsdk.uef.oa.lw.uef.oa(cUef) && !com.bytedance.adsdk.uef.oa.lw.uef.yo(cUef)) {
                break;
            }
            i10++;
        }
        if (cUef != '(') {
            return uefVar.uef(str, i5, deque);
        }
        deque.push(new com.bytedance.adsdk.uef.oa.oa.uef.zjm(str.substring(i5, i10)));
        return i10 + 1;
    }
}
