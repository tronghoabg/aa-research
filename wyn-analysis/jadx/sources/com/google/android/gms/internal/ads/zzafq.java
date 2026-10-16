package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public class zzafq implements zzahd {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;
    private final boolean zzg;

    public zzafq(long j8, long j10, int i5, int i10, boolean z2, boolean z10) {
        long jZzf;
        this.zza = j8;
        this.zzb = j10;
        this.zzc = i10 == -1 ? 1 : i10;
        this.zze = i5;
        this.zzg = z10;
        if (j8 == -1) {
            this.zzd = -1L;
            jZzf = -9223372036854775807L;
        } else {
            this.zzd = j8 - j10;
            jZzf = zzf(j8, j10, i5);
        }
        this.zzf = jZzf;
    }

    private static long zzf(long j8, long j10, int i5) {
        return (Math.max(0L, j8 - j10) * 8000000) / i5;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return this.zzd != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j8) {
        long j10 = this.zzd;
        if (j10 == -1) {
            zzahe zzaheVar = new zzahe(0L, this.zzb);
            return new zzahb(zzaheVar, zzaheVar);
        }
        long j11 = this.zzc;
        long jMin = (((this.zze * j8) / 8000000) / j11) * j11;
        if (j10 != -1) {
            jMin = Math.min(jMin, j10 - j11);
        }
        long jMax = this.zzb + Math.max(jMin, 0L);
        long jZze = zze(jMax);
        zzahe zzaheVar2 = new zzahe(jZze, jMax);
        if (j10 != -1 && jZze < j8) {
            long j12 = jMax + j11;
            if (j12 < this.zza) {
                return new zzahb(zzaheVar2, new zzahe(zze(j12), j12));
            }
        }
        return new zzahb(zzaheVar2, zzaheVar2);
    }

    public final long zze(long j8) {
        return zzf(j8, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzj() {
        return this.zzg;
    }
}
