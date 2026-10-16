package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzacy {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final boolean[] zzg = new boolean[15];
    private int zzh;

    public final void zza() {
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzh = 0;
        Arrays.fill(this.zzg, false);
    }

    public final boolean zzb() {
        return this.zzd > 15 && this.zzh == 0;
    }

    public final boolean zzc() {
        long j8 = this.zzd;
        if (j8 == 0) {
            return false;
        }
        return this.zzg[(int) ((j8 - 1) % 15)];
    }

    public final long zzd() {
        return this.zzf;
    }

    public final long zze() {
        long j8 = this.zze;
        if (j8 == 0) {
            return 0L;
        }
        return this.zzf / j8;
    }

    public final void zzf(long j8) {
        long j10 = this.zzd;
        if (j10 == 0) {
            this.zza = j8;
        } else if (j10 == 1) {
            long j11 = j8 - this.zza;
            this.zzb = j11;
            this.zzf = j11;
            this.zze = 1L;
        } else {
            long j12 = j8 - this.zzc;
            int i5 = (int) (j10 % 15);
            if (Math.abs(j12 - this.zzb) <= 1000000) {
                this.zze++;
                this.zzf += j12;
                boolean[] zArr = this.zzg;
                if (zArr[i5]) {
                    zArr[i5] = false;
                    this.zzh--;
                }
            } else {
                boolean[] zArr2 = this.zzg;
                if (!zArr2[i5]) {
                    zArr2[i5] = true;
                    this.zzh++;
                }
            }
        }
        this.zzd++;
        this.zzc = j8;
    }
}
