package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public abstract class zzgwo {
    public static int zze(int i5, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i10 <= i5) {
            return i5;
        }
        int i11 = i5 + (i5 >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        return i11 < 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i11;
    }

    public abstract zzgwo zzd(Object obj);
}
