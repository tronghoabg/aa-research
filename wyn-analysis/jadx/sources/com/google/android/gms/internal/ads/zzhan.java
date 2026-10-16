package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzhan {
    private long[] zza;
    private int zzb = 0;

    public zzhan(int i5) {
        this.zza = new long[i5];
    }

    public final zzhan zza(long j8) {
        int i5 = this.zzb;
        int i10 = i5 + 1;
        long[] jArr = this.zza;
        int length = jArr.length;
        if (i10 > length) {
            int i11 = length + (length >> 1) + 1;
            if (i11 < i10) {
                int iHighestOneBit = Integer.highestOneBit(i5);
                i11 = iHighestOneBit + iHighestOneBit;
            }
            if (i11 < 0) {
                i11 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            }
            this.zza = Arrays.copyOf(jArr, i11);
        }
        long[] jArr2 = this.zza;
        int i12 = this.zzb;
        jArr2[i12] = j8;
        this.zzb = i12 + 1;
        return this;
    }

    public final zzhao zzb() {
        int i5 = this.zzb;
        return i5 == 0 ? zzhao.zza : new zzhao(this.zza, 0, i5, null);
    }
}
