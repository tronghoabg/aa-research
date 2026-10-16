package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes3.dex */
final class zzakr implements zzaky {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzakr(long[] jArr, long[] jArr2, long j8) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j8 == -9223372036854775807L ? zzfm.zzt(jArr2[jArr2.length - 1]) : j8;
    }

    public static zzakr zze(long j8, zzajv zzajvVar, long j10) {
        int length = zzajvVar.zzd.length;
        int i5 = length + 1;
        long[] jArr = new long[i5];
        long[] jArr2 = new long[i5];
        jArr[0] = j8;
        long j11 = 0;
        jArr2[0] = 0;
        for (int i10 = 1; i10 <= length; i10++) {
            int i11 = i10 - 1;
            j8 += zzajvVar.zzb + r0[i11];
            j11 += zzajvVar.zzc + zzajvVar.zze[i11];
            jArr[i10] = j8;
            jArr2[i10] = j11;
        }
        return new zzakr(jArr, jArr2, j10);
    }

    private static Pair zzi(long j8, long[] jArr, long[] jArr2) {
        int iZzo = zzfm.zzo(jArr, j8, true, true);
        long j10 = jArr[iZzo];
        long j11 = jArr2[iZzo];
        int i5 = iZzo + 1;
        if (i5 == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        return Pair.create(Long.valueOf(j8), Long.valueOf(((long) ((jArr[i5] == j10 ? 0.0d : (j8 - j10) / (r6 - j10)) * (jArr2[i5] - j11))) + j11));
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
        String str = zzfm.zza;
        Pair pairZzi = zzi(zzfm.zzs(Math.max(0L, Math.min(j8, this.zzc))), this.zzb, this.zza);
        zzahe zzaheVar = new zzahe(zzfm.zzt(((Long) pairZzi.first).longValue()), ((Long) pairZzi.second).longValue());
        return new zzahb(zzaheVar, zzaheVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final long zzf(long j8) {
        return zzfm.zzt(((Long) zzi(j8, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final long zzg() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final int zzh() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final /* synthetic */ boolean zzj() {
        return AbstractC1744h.a(this);
    }
}
