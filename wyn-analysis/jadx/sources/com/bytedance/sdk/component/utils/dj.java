package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class dj {
    private static final byte[] uef = uef("VP8X");

    private static byte[] uef(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    public static boolean uef(byte[] bArr, int i5) {
        boolean zUef;
        int i10;
        try {
            zUef = uef(bArr, i5 + 12, uef);
            i10 = i5 + 20;
        } catch (Throwable unused) {
        }
        if (bArr.length <= i10) {
            return false;
        }
        return zUef && ((bArr[i10] & 2) == 2);
    }

    private static boolean uef(byte[] bArr, int i5, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i5 > bArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i10 + i5] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }
}
