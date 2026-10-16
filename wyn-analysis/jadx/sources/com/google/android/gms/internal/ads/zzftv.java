package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzftv {
    public static int zza(int i5) {
        int[] iArr = {1, 2, 3};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i5) {
                return i11;
            }
        }
        return 2;
    }
}
