package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzams {
    public final zzamp zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final int[] zzh;
    public final long zzi;
    public final boolean zzj;

    public zzams(zzamp zzampVar, long[] jArr, int[] iArr, int i5, long[] jArr2, int[] iArr2, int[] iArr3, boolean z2, long j8, int i10) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzgtr.zza(length == length2);
        zzgtr.zza(jArr.length == length2);
        int length3 = iArr2.length;
        zzgtr.zza(length3 == length2);
        this.zza = zzampVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i5;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = iArr3;
        this.zzj = z2;
        this.zzi = j8;
        this.zzb = i10;
        if (length3 > 0) {
            int i11 = length3 - 1;
            iArr2[i11] = iArr2[i11] | 536870912;
        }
    }

    public final int zza(long j8) {
        int i5 = 0;
        if (this.zzj) {
            return zzfm.zzo(this.zzf, j8, true, false);
        }
        int[] iArr = this.zzh;
        int length = iArr.length - 1;
        int i10 = -1;
        while (i5 <= length) {
            int i11 = ((length - i5) / 2) + i5;
            if (this.zzf[iArr[i11]] <= j8) {
                i5 = i11 + 1;
                i10 = i11;
            } else {
                length = i11 - 1;
            }
        }
        if (i10 == -1) {
            return -1;
        }
        long[] jArr = this.zzf;
        long j10 = jArr[iArr[i10]];
        if (j10 == j8) {
            while (i10 > 0) {
                int i12 = i10 - 1;
                if (jArr[iArr[i12]] != j10) {
                    break;
                }
                i10 = i12;
            }
        }
        return iArr[i10];
    }

    public final int zzb(long j8) {
        int i5 = 0;
        if (this.zzj) {
            return zzfm.zzq(this.zzf, j8, true, false);
        }
        int[] iArr = this.zzh;
        int length = iArr.length - 1;
        int i10 = -1;
        while (i5 <= length) {
            int i11 = ((length - i5) / 2) + i5;
            if (this.zzf[iArr[i11]] >= j8) {
                length = i11 - 1;
                i10 = i11;
            } else {
                i5 = i11 + 1;
            }
        }
        if (i10 == -1) {
            return -1;
        }
        long[] jArr = this.zzf;
        long j10 = jArr[iArr[i10]];
        if (j10 == j8) {
            while (i10 < iArr.length - 1) {
                int i12 = i10 + 1;
                if (jArr[iArr[i12]] != j10) {
                    break;
                }
                i10 = i12;
            }
        }
        return iArr[i10];
    }
}
