package com.google.android.gms.internal.p002firebaseauthapi;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class zzyt {
    public static String zza(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b5 : bArr) {
            int i5 = b5 & ForkServer.ERROR;
            sb2.append("0123456789abcdef".charAt(i5 / 16));
            sb2.append("0123456789abcdef".charAt(i5 % 16));
        }
        return sb2.toString();
    }

    public static byte[] zza(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i5 = 0; i5 < length; i5++) {
                int i10 = i5 * 2;
                int iDigit = Character.digit(str.charAt(i10), 16);
                int iDigit2 = Character.digit(str.charAt(i10 + 1), 16);
                if (iDigit != -1 && iDigit2 != -1) {
                    bArr[i5] = (byte) ((iDigit << 4) + iDigit2);
                } else {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }
}
