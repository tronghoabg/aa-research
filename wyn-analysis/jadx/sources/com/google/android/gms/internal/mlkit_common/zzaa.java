package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.api.f;

/* loaded from: classes4.dex */
public class zzaa {
    public static int zza(int i5, int i10) {
        if (i10 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i11 = i5 + (i5 >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        return i11 < 0 ? f.API_PRIORITY_OTHER : i11;
    }
}
