package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes3.dex */
public final class zzfj {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzfj(long j8) {
        zzd(0L);
    }

    public static long zzi(long j8) {
        return zzfm.zzw(j8, 1000000L, 90000L, RoundingMode.DOWN);
    }

    public static long zzj(long j8) {
        return zzfm.zzw(j8, 90000L, 1000000L, RoundingMode.DOWN);
    }

    public final synchronized long zza() {
        long j8 = this.zza;
        if (j8 == Long.MAX_VALUE || j8 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j8;
    }

    public final synchronized long zzb() {
        long j8;
        try {
            j8 = this.zzc;
        } catch (Throwable th) {
            throw th;
        }
        return j8 != -9223372036854775807L ? j8 + this.zzb : zza();
    }

    public final synchronized long zzc() {
        return this.zzb;
    }

    public final synchronized void zzd(long j8) {
        this.zza = j8;
        this.zzb = j8 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }

    public final synchronized long zze(long j8) {
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.zzc;
            if (j10 != -9223372036854775807L) {
                long jZzj = zzj(j10);
                long j11 = (4294967296L + jZzj) / 8589934592L;
                long j12 = (((-1) + j11) * 8589934592L) + j8;
                long j13 = (j11 * 8589934592L) + j8;
                j8 = Math.abs(j12 - jZzj) < Math.abs(j13 - jZzj) ? j12 : j13;
            }
            return zzg(zzi(j8));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzf(long j8) {
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.zzc;
        if (j10 != -9223372036854775807L) {
            long jZzj = zzj(j10);
            long j11 = jZzj / 8589934592L;
            Long.signum(j11);
            long j12 = (j11 * 8589934592L) + j8;
            j8 = j12 >= jZzj ? j12 : ((j11 + 1) * 8589934592L) + j8;
        }
        return zzg(zzi(j8));
    }

    public final synchronized long zzg(long j8) {
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!zzh()) {
                long jLongValue = this.zza;
                if (jLongValue == 9223372036854775806L) {
                    Long l10 = (Long) this.zzd.get();
                    if (l10 == null) {
                        throw null;
                    }
                    jLongValue = l10.longValue();
                }
                this.zzb = jLongValue - j8;
                notifyAll();
            }
            this.zzc = j8;
            return j8 + this.zzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzh() {
        return this.zzb != -9223372036854775807L;
    }
}
