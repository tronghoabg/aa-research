package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzhal {
    private int[] zza;
    private int zzb = 0;

    public zzhal(int i5) {
        this.zza = new int[i5];
    }

    public final zzhal zza(int i5) {
        int i10 = this.zzb;
        int i11 = i10 + 1;
        int[] iArr = this.zza;
        int length = iArr.length;
        if (i11 > length) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int iHighestOneBit = Integer.highestOneBit(i10);
                i12 = iHighestOneBit + iHighestOneBit;
            }
            if (i12 < 0) {
                i12 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            }
            this.zza = Arrays.copyOf(iArr, i12);
        }
        int[] iArr2 = this.zza;
        int i13 = this.zzb;
        iArr2[i13] = i5;
        this.zzb = i13 + 1;
        return this;
    }

    public final zzham zzb() {
        int i5 = this.zzb;
        return i5 == 0 ? zzham.zza : new zzham(this.zza, 0, i5, null);
    }
}
