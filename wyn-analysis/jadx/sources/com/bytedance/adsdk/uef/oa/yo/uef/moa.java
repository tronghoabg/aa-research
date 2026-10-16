package com.bytedance.adsdk.uef.oa.yo.uef;

import com.bytedance.adsdk.uef.oa.oa.uef.tpx;
import java.util.Deque;

/* loaded from: classes.dex */
public class moa extends ivm {
    @Override // com.bytedance.adsdk.uef.oa.yo.uef.ivm
    public int uef(String str, int i5, Deque<com.bytedance.adsdk.uef.oa.oa.uef> deque, com.bytedance.adsdk.uef.oa.yo.uef uefVar) {
        if ('(' != uef(i5, str)) {
            return uefVar.uef(str, i5, deque);
        }
        deque.push(new tpx(com.bytedance.adsdk.uef.oa.moa.moa.LEFT_PAREN));
        return i5 + 1;
    }
}
