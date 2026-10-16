package com.google.android.gms.internal.ads;

import Va.M6;

/* loaded from: classes3.dex */
final class zzalb implements zzaky {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzalb(long j8, int i5, long j10, int i10, long j11, long[] jArr) {
        this.zza = j8;
        this.zzb = i5;
        this.zzc = j10;
        this.zzd = i10;
        this.zze = j11;
        this.zzg = jArr;
        this.zzf = j11 != -1 ? j8 + j11 : -1L;
    }

    public static zzalb zze(zzala zzalaVar, long j8, long j10) {
        long jZzb = zzalaVar.zzb();
        if (jZzb == -9223372036854775807L) {
            return null;
        }
        long jMin = zzalaVar.zzc;
        if (jMin != -1 && j10 != -1 && j8 + jMin != j10) {
            long j11 = j10 - j8;
            int length = String.valueOf(j11).length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(jMin).length() + length + 53 + 23);
            M6.A(sb2, "Data size mismatch between stream (", j11, ") and Xing frame (");
            sb2.append(jMin);
            sb2.append("), using smaller value.");
            zzeh.zzb("XingSeeker", sb2.toString());
            jMin = Math.min(jMin, j11);
        }
        zzagx zzagxVar = zzalaVar.zza;
        long[] jArr = zzalaVar.zzg;
        return new zzalb(j8, zzagxVar.zzc, jZzb, zzagxVar.zzf, jMin, jArr);
    }

    private final long zzi(int i5) {
        return (this.zzc * i5) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return this.zzg != null;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j8) {
        if (!zzb()) {
            zzahe zzaheVar = new zzahe(0L, this.zza + this.zzb);
            return new zzahb(zzaheVar, zzaheVar);
        }
        long j10 = this.zzc;
        String str = zzfm.zza;
        long jMax = Math.max(0L, Math.min(j8, j10));
        double d3 = (jMax * 100.0d) / j10;
        double d5 = 0.0d;
        if (d3 > 0.0d) {
            if (d3 >= 100.0d) {
                d5 = 256.0d;
            } else {
                int i5 = (int) d3;
                long[] jArr = this.zzg;
                jArr.getClass();
                double d10 = jArr[i5];
                d5 = (((i5 == 99 ? 256.0d : jArr[i5 + 1]) - d10) * (d3 - i5)) + d10;
            }
        }
        long j11 = this.zze;
        zzahe zzaheVar2 = new zzahe(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((d5 / 256.0d) * j11), j11 - 1)));
        return new zzahb(zzaheVar2, zzaheVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final long zzf(long j8) {
        if (!zzb()) {
            return 0L;
        }
        long j10 = j8 - this.zza;
        if (j10 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        jArr.getClass();
        double d3 = (j10 * 256.0d) / this.zze;
        int iZzo = zzfm.zzo(jArr, (long) d3, true, true);
        long jZzi = zzi(iZzo);
        long j11 = jArr[iZzo];
        int i5 = iZzo + 1;
        long jZzi2 = zzi(i5);
        return Math.round((j11 == (iZzo == 99 ? 256L : jArr[i5]) ? 0.0d : (d3 - j11) / (r0 - j11)) * (jZzi2 - jZzi)) + jZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final long zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final int zzh() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final /* synthetic */ boolean zzj() {
        return AbstractC1744h.a(this);
    }
}
