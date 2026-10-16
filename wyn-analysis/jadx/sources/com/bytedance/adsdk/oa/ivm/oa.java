package com.bytedance.adsdk.oa.ivm;

import N0.a;

/* loaded from: classes.dex */
public class oa {
    private static float oa(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float uef(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int uef(float f10, int i5, int i10) {
        if (i5 == i10) {
            return i5;
        }
        float f11 = ((i5 >> 24) & 255) / 255.0f;
        float f12 = ((i10 >> 24) & 255) / 255.0f;
        float fOa = oa(((i5 >> 16) & 255) / 255.0f);
        float fOa2 = oa(((i5 >> 8) & 255) / 255.0f);
        float fOa3 = oa((i5 & 255) / 255.0f);
        float fOa4 = oa(((i10 >> 16) & 255) / 255.0f);
        float fOa5 = oa(((i10 >> 8) & 255) / 255.0f);
        float fOa6 = oa((i10 & 255) / 255.0f);
        float fB = a.b(f12, f11, f10, f11);
        float fB2 = a.b(fOa4, fOa, f10, fOa);
        float fB3 = a.b(fOa5, fOa2, f10, fOa2);
        float fB4 = a.b(fOa6, fOa3, f10, fOa3);
        float fUef = uef(fB2) * 255.0f;
        float fUef2 = uef(fB3) * 255.0f;
        return Math.round(uef(fB4) * 255.0f) | (Math.round(fUef) << 16) | (Math.round(fB * 255.0f) << 24) | (Math.round(fUef2) << 8);
    }
}
