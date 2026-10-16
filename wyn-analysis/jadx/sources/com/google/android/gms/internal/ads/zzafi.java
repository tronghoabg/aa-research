package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzafi {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzafi(long j8, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.zza = j8;
        this.zzb = j10;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = j14;
        this.zzc = j15;
        this.zzh = zza(j10, 0L, j12, j13, j14, j15);
    }

    public static long zza(long j8, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 >= j13 || 1 + j10 >= j11) {
            return j12;
        }
        long j15 = (long) (((j13 - j12) / (j11 - j10)) * (j8 - j10));
        String str = zzfm.zza;
        return Math.max(j12, Math.min(((j12 + j15) - j14) - (j15 / 20), j13 - 1));
    }

    private final void zzi() {
        this.zzh = zza(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }

    public final /* synthetic */ long zzb() {
        return this.zzf;
    }

    public final /* synthetic */ long zzc() {
        return this.zzg;
    }

    public final /* synthetic */ long zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zza;
    }

    public final /* synthetic */ void zzf(long j8, long j10) {
        this.zzd = j8;
        this.zzf = j10;
        zzi();
    }

    public final /* synthetic */ void zzg(long j8, long j10) {
        this.zze = j8;
        this.zzg = j10;
        zzi();
    }

    public final /* synthetic */ long zzh() {
        return this.zzh;
    }
}
