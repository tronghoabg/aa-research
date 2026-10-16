package com.bytedance.adsdk.uef.oa.yo.uef;

import com.bytedance.adsdk.uef.oa.oa.uef.wk;
import java.util.Deque;

/* loaded from: classes.dex */
public class xs extends ivm {
    private boolean uef(String str, int i5, Deque<com.bytedance.adsdk.uef.oa.oa.uef> deque) {
        if ('-' != uef(i5, str)) {
            return com.bytedance.adsdk.uef.oa.lw.uef.yo(uef(i5, str));
        }
        if (deque.peek() != null && !com.bytedance.adsdk.uef.oa.moa.yo.uef(deque.peek().uef())) {
            return false;
        }
        if (com.bytedance.adsdk.uef.oa.lw.uef.yo(uef(i5 + 1, str))) {
            return true;
        }
        throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i5));
    }

    @Override // com.bytedance.adsdk.uef.oa.yo.uef.ivm
    public int uef(String str, int i5, Deque<com.bytedance.adsdk.uef.oa.oa.uef> deque, com.bytedance.adsdk.uef.oa.yo.uef uefVar) {
        char cUef;
        if (!uef(str, i5, deque)) {
            return uefVar.uef(str, i5, deque);
        }
        int i10 = uef(i5, str) == '-' ? i5 + 1 : i5;
        boolean z2 = false;
        while (true) {
            cUef = uef(i10, str);
            if (!com.bytedance.adsdk.uef.oa.lw.uef.yo(cUef) && (z2 || cUef != '.')) {
                break;
            }
            i10++;
            if (cUef == '.') {
                z2 = true;
            }
        }
        if (cUef != '.') {
            deque.push(new wk(str.substring(i5, i10)));
            return i10;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i5, i10));
    }
}
