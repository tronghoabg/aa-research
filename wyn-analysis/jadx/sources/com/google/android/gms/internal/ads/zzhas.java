package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzhas {
    private static final byte[] zza;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i5 = 0; i5 < 10; i5++) {
            bArr[i5 + 48] = (byte) i5;
        }
        for (int i10 = 0; i10 < 26; i10++) {
            byte b5 = (byte) (i10 + 10);
            bArr[i10 + 65] = b5;
            bArr[i10 + 97] = b5;
        }
        zza = bArr;
    }

    public static int zza(char c10) {
        if (c10 < 128) {
            return zza[c10];
        }
        return -1;
    }
}
