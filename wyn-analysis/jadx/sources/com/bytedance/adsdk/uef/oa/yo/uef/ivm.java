package com.bytedance.adsdk.uef.oa.yo.uef;

import java.util.Deque;

/* loaded from: classes.dex */
public abstract class ivm {
    public int oa(int i5, String str) {
        while (com.bytedance.adsdk.uef.oa.lw.uef.uef(uef(i5, str))) {
            i5++;
        }
        return i5;
    }

    public char uef(int i5, String str) {
        if (i5 >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i5);
    }

    public abstract int uef(String str, int i5, Deque<com.bytedance.adsdk.uef.oa.oa.uef> deque, com.bytedance.adsdk.uef.oa.yo.uef uefVar);
}
