package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
abstract class zzang {
    private zzahm zzb;
    private zzagd zzc;
    private zzanc zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzana zza = new zzana();
    private zzane zzj = new zzane();

    public void zza(boolean z2) {
        int i5;
        if (z2) {
            this.zzj = new zzane();
            this.zzf = 0L;
            i5 = 0;
        } else {
            i5 = 1;
        }
        this.zzh = i5;
        this.zze = -1L;
        this.zzg = 0L;
    }

    public abstract long zzb(zzeu zzeuVar);

    public abstract boolean zzc(zzeu zzeuVar, long j8, zzane zzaneVar) throws IOException;

    public final void zze(zzagd zzagdVar, zzahm zzahmVar) {
        this.zzc = zzagdVar;
        this.zzb = zzahmVar;
        zza(true);
    }

    public final void zzf(long j8, long j10) {
        this.zza.zza();
        if (j8 == 0) {
            zza(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long jZzi = zzi(j10);
            this.zze = jZzi;
            zzanc zzancVar = this.zzd;
            String str = zzfm.zza;
            zzancVar.zzb(jZzi);
            this.zzh = 2;
        }
    }

    public final int zzg(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        this.zzb.getClass();
        String str = zzfm.zza;
        int i5 = this.zzh;
        if (i5 != 0) {
            if (i5 == 1) {
                zzagbVar.zzf((int) this.zzf);
                this.zzh = 2;
                return 0;
            }
            if (i5 != 2) {
                return -1;
            }
            long jZza = this.zzd.zza(zzagbVar);
            if (jZza >= 0) {
                zzahaVar.zza = jZza;
                return 1;
            }
            if (jZza < -1) {
                zzj(-(jZza + 2));
            }
            if (!this.zzl) {
                zzahd zzahdVarZzc = this.zzd.zzc();
                zzahdVarZzc.getClass();
                this.zzc.zzw(zzahdVarZzc);
                this.zzb.zzP(zzahdVarZzc.zza());
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zzb(zzagbVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzeu zzeuVarZzd = this.zza.zzd();
            long jZzb = zzb(zzeuVarZzd);
            if (jZzb >= 0) {
                long j8 = this.zzg;
                if (j8 + jZzb >= this.zze) {
                    long jZzh = zzh(j8);
                    this.zzb.zzc(zzeuVarZzd, zzeuVarZzd.zze());
                    this.zzb.zze(jZzh, 1, zzeuVarZzd.zze(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += jZzb;
            return 0;
        }
        while (true) {
            zzana zzanaVar = this.zza;
            if (!zzanaVar.zzb(zzagbVar)) {
                this.zzh = 3;
                return -1;
            }
            long jZzn = zzagbVar.zzn();
            long j10 = this.zzf;
            this.zzk = jZzn - j10;
            if (!zzc(zzanaVar.zzd(), j10, this.zzj)) {
                zzv zzvVar = this.zzj.zza;
                this.zzi = zzvVar.zzJ;
                if (!this.zzm) {
                    this.zzb.zzA(zzvVar);
                    this.zzm = true;
                }
                zzanc zzancVar = this.zzj.zzb;
                if (zzancVar != null) {
                    this.zzd = zzancVar;
                } else if (zzagbVar.zzo() == -1) {
                    this.zzd = new zzanf(null);
                } else {
                    zzanb zzanbVarZzc = zzanaVar.zzc();
                    this.zzd = new zzamv(this, this.zzf, zzagbVar.zzo(), zzanbVarZzc.zzd + zzanbVarZzc.zze, zzanbVarZzc.zzb, (zzanbVarZzc.zza & 4) != 0);
                }
                this.zzh = 2;
                zzanaVar.zze();
                return 0;
            }
            this.zzf = zzagbVar.zzn();
        }
    }

    public final long zzh(long j8) {
        return (j8 * 1000000) / this.zzi;
    }

    public final long zzi(long j8) {
        return (this.zzi * j8) / 1000000;
    }

    public void zzj(long j8) {
        this.zzg = j8;
    }
}
