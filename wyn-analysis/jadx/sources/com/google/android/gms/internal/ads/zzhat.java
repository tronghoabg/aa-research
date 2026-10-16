package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhat {
    public static long[] zza(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += jArr2.length;
        }
        int i5 = (int) length;
        zzgtr.zze(length == ((long) i5), "the total number of elements (%s) in the arrays must fit in an int", length);
        long[] jArr3 = new long[i5];
        int i10 = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i10, length2);
            i10 += length2;
        }
        return jArr3;
    }
}
