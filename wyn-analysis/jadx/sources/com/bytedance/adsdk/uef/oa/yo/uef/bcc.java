package com.bytedance.adsdk.uef.oa.yo.uef;

import com.bytedance.adsdk.uef.oa.oa.uef.ab;
import com.google.android.gms.internal.consent_sdk.a;
import java.util.Deque;

/* loaded from: classes.dex */
public class bcc extends ivm {
    @Override // com.bytedance.adsdk.uef.oa.yo.uef.ivm
    public int uef(String str, int i5, Deque<com.bytedance.adsdk.uef.oa.oa.uef> deque, com.bytedance.adsdk.uef.oa.yo.uef uefVar) {
        if (!com.bytedance.adsdk.uef.oa.lw.uef.moa(uef(i5, str))) {
            return uefVar.uef(str, i5, deque);
        }
        int i10 = i5 + 1;
        String str2 = new String(new char[]{uef(i5, str), uef(i10, str)});
        if (com.bytedance.adsdk.uef.oa.moa.yo.uef(str2) != null) {
            deque.push(new ab(com.bytedance.adsdk.uef.oa.moa.yo.uef(str2)));
            return i5 + 2;
        }
        String strValueOf = String.valueOf(uef(i5, str));
        if (com.bytedance.adsdk.uef.oa.moa.yo.uef(strValueOf) != null) {
            deque.push(new ab(com.bytedance.adsdk.uef.oa.moa.yo.uef(strValueOf)));
            return i10;
        }
        StringBuilder sbW = a.w("Unrecognized:", strValueOf, "examine:");
        sbW.append(str.substring(0, i5));
        throw new IllegalArgumentException(sbW.toString());
    }
}
