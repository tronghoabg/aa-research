package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class zzej {
    private int zza;
    private int zzb;
    private int zzc;
    private long[] zzd;
    private int zze;

    public zzej() {
        throw null;
    }

    public final void zza(long j8) {
        int i5 = this.zzc;
        long[] jArr = this.zzd;
        int length = jArr.length;
        if (i5 == length) {
            int i10 = length + length;
            if (i10 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i10];
            int i11 = this.zza;
            int i12 = length - i11;
            System.arraycopy(jArr, i11, jArr2, 0, i12);
            System.arraycopy(this.zzd, 0, jArr2, i12, i11);
            this.zza = 0;
            this.zzb = this.zzc - 1;
            this.zzd = jArr2;
            this.zze = jArr2.length - 1;
            jArr = jArr2;
        }
        int i13 = (this.zzb + 1) & this.zze;
        this.zzb = i13;
        jArr[i13] = j8;
        this.zzc++;
    }

    public final long zzb() {
        int i5 = this.zzc;
        if (i5 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.zzd;
        int i10 = this.zza;
        long j8 = jArr[i10];
        this.zza = this.zze & (i10 + 1);
        this.zzc = i5 - 1;
        return j8;
    }

    public final long zzc() {
        if (this.zzc != 0) {
            return this.zzd[this.zza];
        }
        throw new NoSuchElementException();
    }

    public final boolean zzd() {
        return this.zzc == 0;
    }

    public final void zze() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
    }

    public zzej(int i5) {
        int i10 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i10 = iHighestOneBit + iHighestOneBit;
        }
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
        this.zzd = new long[i10];
        this.zze = r3.length - 1;
    }
}
