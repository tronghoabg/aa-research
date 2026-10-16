package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zziau {
    public static byte[] zza(String str) {
        if ((str.length() & 1) != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            int i10 = i5 + i5;
            int iDigit = Character.digit(str.charAt(i10), 16);
            int iDigit2 = Character.digit(str.charAt(i10 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i5] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }
}
