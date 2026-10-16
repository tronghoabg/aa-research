package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzei {
    private int zza;
    private long[] zzb;

    public zzei() {
        this(32);
    }

    public final void zza(long j8) {
        int i5 = this.zza;
        long[] jArr = this.zzb;
        if (i5 == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i5 + i5);
        }
        long[] jArr2 = this.zzb;
        int i10 = this.zza;
        this.zza = i10 + 1;
        jArr2[i10] = 0;
    }

    public final void zzb(long[] jArr) {
        int i5 = this.zza;
        int length = jArr.length;
        int i10 = i5 + length;
        long[] jArr2 = this.zzb;
        int length2 = jArr2.length;
        if (i10 > length2) {
            this.zzb = Arrays.copyOf(jArr2, Math.max(length2 + length2, i10));
        }
        System.arraycopy(jArr, 0, this.zzb, this.zza, length);
        this.zza = i10;
    }

    public final long zzc(int i5) {
        if (i5 >= 0 && i5 < this.zza) {
            return this.zzb[i5];
        }
        int i10 = this.zza;
        throw new IndexOutOfBoundsException(com.google.android.gms.internal.consent_sdk.a.u(i5, i10, "Invalid index ", ", size is ", new StringBuilder(String.valueOf(i5).length() + 24 + String.valueOf(i10).length())));
    }

    public final int zzd() {
        return this.zza;
    }

    public zzei(int i5) {
        this.zzb = new long[i5];
    }
}
