package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public final class zzjf {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    public /* synthetic */ zzjf(float f10, float f11, long j8, float f12, long j10, long j11, float f13, byte[] bArr) {
        this.zza = j10;
        this.zzb = j11;
    }

    private final void zzf() {
        long j8;
        long j10 = this.zzc;
        if (j10 != -9223372036854775807L) {
            j8 = this.zzd;
            if (j8 == -9223372036854775807L) {
                long j11 = this.zzf;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j8 = this.zzg;
                if (j8 == -9223372036854775807L || j10 <= j8) {
                    j8 = j10;
                }
            }
        } else {
            j8 = -9223372036854775807L;
        }
        if (this.zze == j8) {
            return;
        }
        this.zze = j8;
        this.zzh = j8;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    private static long zzg(long j8, long j10, float f10) {
        return (long) ((j10 * 9.999871E-4f) + (j8 * 0.999f));
    }

    public final void zza(zzaf zzafVar) {
        long j8 = zzafVar.zza;
        this.zzc = zzfm.zzt(-9223372036854775807L);
        this.zzf = zzfm.zzt(-9223372036854775807L);
        this.zzg = zzfm.zzt(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzf();
    }

    public final void zzb(long j8) {
        this.zzd = j8;
        zzf();
    }

    public final void zzc() {
        long j8 = this.zzh;
        if (j8 == -9223372036854775807L) {
            return;
        }
        long j10 = j8 + this.zzb;
        this.zzh = j10;
        long j11 = this.zzg;
        if (j11 != -9223372036854775807L && j10 > j11) {
            this.zzh = j11;
        }
        this.zzl = -9223372036854775807L;
    }

    public final float zzd(long j8, long j10) {
        float f10;
        long jMax;
        if (this.zzc == -9223372036854775807L) {
            return 1.0f;
        }
        long j11 = j8 - j10;
        long j12 = this.zzm;
        if (j12 == -9223372036854775807L) {
            this.zzm = j11;
            this.zzn = 0L;
        } else {
            long jMax2 = Math.max(j11, zzg(j12, j11, 0.999f));
            this.zzm = jMax2;
            this.zzn = zzg(this.zzn, Math.abs(j11 - jMax2), 0.999f);
        }
        if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long j13 = (this.zzn * 3) + this.zzm;
        if (this.zzh > j13) {
            float fZzt = zzfm.zzt(1000L);
            f10 = 1.0E-7f;
            long[] jArr = {j13, this.zze, this.zzh - (((long) (fZzt * (this.zzk - 1.0f))) + ((long) ((this.zzi - 1.0f) * fZzt)))};
            jMax = jArr[0];
            for (int i5 = 1; i5 < 3; i5++) {
                long j14 = jArr[i5];
                if (j14 > jMax) {
                    jMax = j14;
                }
            }
            this.zzh = jMax;
        } else {
            f10 = 1.0E-7f;
            long jMax3 = j8 - ((long) (Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.zzk - 1.0f) / 1.0E-7f));
            long j15 = this.zzh;
            String str = zzfm.zza;
            jMax = Math.max(j15, Math.min(jMax3, j13));
            this.zzh = jMax;
            long j16 = this.zzg;
            if (j16 != -9223372036854775807L && jMax > j16) {
                this.zzh = j16;
                jMax = j16;
            }
        }
        long j17 = j8 - jMax;
        if (Math.abs(j17) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.zzj, Math.min((j17 * f10) + 1.0f, this.zzi));
        this.zzk = fMax;
        return fMax;
    }

    public final long zze() {
        return this.zzh;
    }
}
