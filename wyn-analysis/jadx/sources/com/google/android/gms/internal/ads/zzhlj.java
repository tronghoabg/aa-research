package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhlj {
    public static void zza(long[] jArr, long[] jArr2, int i5) {
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = (int) jArr[i10];
            jArr[i10] = ((-i5) & (((int) jArr2[i10]) ^ i11)) ^ i11;
        }
    }
}
