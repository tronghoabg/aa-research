package com.bytedance.adsdk.uef.oa.yo.uef;

import com.bytedance.adsdk.uef.oa.oa.uef.dhk;
import java.util.Deque;

/* loaded from: classes.dex */
public class oa extends ivm {
    @Override // com.bytedance.adsdk.uef.oa.yo.uef.ivm
    public int uef(String str, int i5, Deque<com.bytedance.adsdk.uef.oa.oa.uef> deque, com.bytedance.adsdk.uef.oa.yo.uef uefVar) {
        if ('\'' != uef(i5, str)) {
            return uefVar.uef(str, i5, deque);
        }
        int i10 = i5 + 1;
        int length = str.length();
        int i11 = i10;
        while (i11 < length && uef(i11, str) != '\'') {
            i11++;
        }
        if (uef(i11, str) != '\'') {
            throw new com.bytedance.adsdk.uef.uef.uef("String expression not surrounded by '", str.substring(i5));
        }
        deque.push(new dhk(str.substring(i10, i11)));
        return i11 + 1;
    }
}
