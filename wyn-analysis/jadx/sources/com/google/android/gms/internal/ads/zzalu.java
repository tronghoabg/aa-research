package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes3.dex */
final class zzalu implements zzahd {
    private final SparseArray zza;
    private final SparseArray zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    public /* synthetic */ zzalu(SparseArray sparseArray, SparseArray sparseArray2, long j8, long j10, int i5, byte[] bArr) {
        this.zza = sparseArray;
        this.zzb = sparseArray2;
        this.zzc = j8;
        this.zzd = j10;
        this.zze = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j8) {
        SparseArray sparseArray = this.zza;
        int i5 = this.zze;
        long[] jArr = (long[]) sparseArray.get(i5);
        SparseArray sparseArray2 = this.zzb;
        long[] jArr2 = (long[]) sparseArray2.get(i5);
        if (jArr == null || jArr2 == null) {
            jArr = (long[]) sparseArray.get(i5);
            jArr2 = (long[]) sparseArray2.get(i5);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j8 < jArr[0]) {
            zzahe zzaheVar = new zzahe(0L, this.zzd);
            return new zzahb(zzaheVar, zzaheVar);
        }
        int iZzo = zzfm.zzo(jArr, j8, true, true);
        zzahe zzaheVar2 = new zzahe(jArr[iZzo], jArr2[iZzo]);
        return new zzahb(zzaheVar2, zzaheVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final /* synthetic */ boolean zzj() {
        return AbstractC1744h.a(this);
    }
}
