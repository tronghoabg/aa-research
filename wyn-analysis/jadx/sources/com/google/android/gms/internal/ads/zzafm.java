package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
public class zzafm {
    protected final zzafg zza;
    protected final zzafl zzb;
    protected zzafi zzc;
    private final int zzd;

    public zzafm(zzafj zzafjVar, zzafl zzaflVar, long j8, long j10, long j11, long j12, long j13, long j14, int i5) {
        this.zzb = zzaflVar;
        this.zzd = i5;
        this.zza = new zzafg(zzafjVar, j8, 0L, j11, j12, j13, j14);
    }

    public static final int zzf(zzagb zzagbVar, long j8, zzaha zzahaVar) {
        if (j8 == zzagbVar.zzn()) {
            return 0;
        }
        zzahaVar.zza = j8;
        return 1;
    }

    public static final boolean zzg(zzagb zzagbVar, long j8) throws IOException {
        long jZzn = j8 - zzagbVar.zzn();
        if (jZzn < 0 || jZzn > 262144) {
            return false;
        }
        zzagbVar.zzf((int) jZzn);
        return true;
    }

    public final zzahd zza() {
        return this.zza;
    }

    public final void zzb(long j8) {
        zzafi zzafiVar = this.zzc;
        if (zzafiVar == null || zzafiVar.zze() != j8) {
            zzafg zzafgVar = this.zza;
            this.zzc = new zzafi(j8, zzafgVar.zzd(j8), 0L, zzafgVar.zze(), zzafgVar.zzf(), zzafgVar.zzg(), zzafgVar.zzh());
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        while (true) {
            zzafi zzafiVar = this.zzc;
            zzafiVar.getClass();
            long jZzb = zzafiVar.zzb();
            long jZzc = zzafiVar.zzc();
            long jZzh = zzafiVar.zzh();
            if (jZzc - jZzb <= this.zzd) {
                zze(false, jZzb);
                return zzf(zzagbVar, jZzb, zzahaVar);
            }
            if (!zzg(zzagbVar, jZzh)) {
                return zzf(zzagbVar, jZzh, zzahaVar);
            }
            zzagbVar.zzl();
            zzafk zzafkVarZza = this.zzb.zza(zzagbVar, zzafiVar.zzd());
            int iZzd = zzafkVarZza.zzd();
            if (iZzd == -3) {
                zze(false, jZzh);
                return zzf(zzagbVar, jZzh, zzahaVar);
            }
            if (iZzd == -2) {
                zzafiVar.zzf(zzafkVarZza.zze(), zzafkVarZza.zzf());
            } else {
                if (iZzd != -1) {
                    zzg(zzagbVar, zzafkVarZza.zzf());
                    zze(true, zzafkVarZza.zzf());
                    return zzf(zzagbVar, zzafkVarZza.zzf(), zzahaVar);
                }
                zzafiVar.zzg(zzafkVarZza.zze(), zzafkVarZza.zzf());
            }
        }
    }

    public final void zze(boolean z2, long j8) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
