package com.bytedance.sdk.openadsdk.core;

import android.util.Base64;

/* loaded from: classes3.dex */
public final class uef {
    private static final String uef = yo();

    /* renamed from: oa, reason: collision with root package name */
    private static final String f25753oa = sy.moa().moa();

    public static String oa() {
        return new String(Base64.decode(f25753oa, 0)).substring(2);
    }

    public static String uef() {
        return new String(Base64.decode(uef, 0)).substring(2);
    }

    private static String yo() {
        char[] cArr = {203, 182, 168, 176, 207, 148, 149, 178, 205, 182, 149, 166, 134, 178, 184, 176, 206, 174, 187, 178, 150, 185, 167, 166};
        char[] cArr2 = new char[24];
        for (int i5 = 23; i5 >= 0; i5--) {
            cArr2[23 - i5] = (char) (cArr[i5] ^ 255);
        }
        return new String(cArr2);
    }
}
