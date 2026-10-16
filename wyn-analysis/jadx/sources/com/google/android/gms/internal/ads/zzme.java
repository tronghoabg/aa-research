package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzme {
    public final zzxj zza;
    public final Object zzb;
    public final zzzd[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzmf zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzne[] zzj;
    private final zzabi zzk;
    private final zzmt zzl;
    private zzme zzm;
    private zzzo zzn;
    private zzabj zzo;
    private long zzp;

    public zzme(zzne[] zzneVarArr, long j8, zzabi zzabiVar, zzabm zzabmVar, zzmt zzmtVar, zzmf zzmfVar, zzabj zzabjVar, long j10) {
        this.zzj = zzneVarArr;
        this.zzp = j8;
        this.zzk = zzabiVar;
        this.zzl = zzmtVar;
        zzxl zzxlVar = zzmfVar.zza;
        this.zzb = zzxlVar.zza;
        this.zzg = zzmfVar;
        this.zzn = zzzo.zza;
        this.zzo = zzabjVar;
        this.zzc = new zzzd[2];
        this.zzi = new boolean[2];
        this.zza = zzmtVar.zze(zzxlVar, zzabmVar, zzmfVar.zzb);
    }

    private final void zzt() {
        if (!zzv()) {
            return;
        }
        int i5 = 0;
        while (true) {
            zzabj zzabjVar = this.zzo;
            if (i5 >= zzabjVar.zza) {
                return;
            }
            zzabjVar.zza(i5);
            zzabb zzabbVar = this.zzo.zzc[i5];
            i5++;
        }
    }

    private final void zzu() {
        if (!zzv()) {
            return;
        }
        int i5 = 0;
        while (true) {
            zzabj zzabjVar = this.zzo;
            if (i5 >= zzabjVar.zza) {
                return;
            }
            zzabjVar.zza(i5);
            zzabb zzabbVar = this.zzo.zzc[i5];
            i5++;
        }
    }

    private final boolean zzv() {
        return this.zzm == null;
    }

    public final long zza() {
        return this.zzp;
    }

    public final void zzb(long j8) {
        this.zzp = j8;
    }

    public final long zzc() {
        return this.zzg.zzb + this.zzp;
    }

    public final boolean zzd() {
        if (this.zze) {
            return !this.zzf || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zze() {
        if (this.zze) {
            return zzd() || zzf() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }

    public final long zzf() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long jZzb = this.zzf ? this.zza.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.zzg.zze : jZzb;
    }

    public final long zzg() {
        if (this.zze) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final void zzh(float f10, zzbf zzbfVar, boolean z2) throws zzjm {
        this.zze = true;
        this.zzn = this.zza.zzn();
        zzabj zzabjVarZzk = zzk(f10, zzbfVar, z2);
        zzmf zzmfVar = this.zzg;
        long jMax = zzmfVar.zzb;
        long j8 = zzmfVar.zze;
        if (j8 != -9223372036854775807L && jMax >= j8) {
            jMax = Math.max(0L, j8 - 1);
        }
        long jZzl = zzl(zzabjVarZzk, jMax, false);
        long j10 = this.zzp;
        zzmf zzmfVar2 = this.zzg;
        this.zzp = (zzmfVar2.zzb - jZzl) + j10;
        this.zzg = zzmfVar2.zza(jZzl, zzmfVar2.zzc);
    }

    public final void zzi(long j8) {
        zzgtr.zzi(zzv());
        if (this.zze) {
            this.zza.zzf(j8 - this.zzp);
        }
    }

    public final void zzj(zzmc zzmcVar) {
        zzgtr.zzi(zzv());
        this.zza.zzd(zzmcVar);
    }

    public final zzabj zzk(float f10, zzbf zzbfVar, boolean z2) throws zzjm {
        zzzo zzzoVar = this.zzn;
        zzxl zzxlVar = this.zzg.zza;
        zzabi zzabiVar = this.zzk;
        zzne[] zzneVarArr = this.zzj;
        zzabj zzabjVarZzr = zzabiVar.zzr(zzneVarArr, zzzoVar, zzxlVar, zzbfVar);
        for (int i5 = 0; i5 < zzabjVarZzr.zza; i5++) {
            if (zzabjVarZzr.zza(i5)) {
                if (zzabjVarZzr.zzc[i5] == null) {
                    zzneVarArr[i5].zza();
                    z = false;
                }
                zzgtr.zzi(z);
            } else {
                zzgtr.zzi(zzabjVarZzr.zzc[i5] == null);
            }
        }
        for (zzabb zzabbVar : zzabjVarZzr.zzc) {
        }
        return zzabjVarZzr;
    }

    public final long zzl(zzabj zzabjVar, long j8, boolean z2) {
        return zzm(zzabjVar, j8, false, new boolean[2]);
    }

    public final long zzm(zzabj zzabjVar, long j8, boolean z2, boolean[] zArr) {
        zzne[] zzneVarArr;
        int i5 = 0;
        while (true) {
            boolean z10 = true;
            if (i5 >= zzabjVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z2 || !zzabjVar.zzb(this.zzo, i5)) {
                z10 = false;
            }
            zArr2[i5] = z10;
            i5++;
        }
        int i10 = 0;
        while (true) {
            zzneVarArr = this.zzj;
            if (i10 >= 2) {
                break;
            }
            zzneVarArr[i10].zza();
            i10++;
        }
        zzu();
        this.zzo = zzabjVar;
        zzt();
        zzxj zzxjVar = this.zza;
        zzabb[] zzabbVarArr = zzabjVar.zzc;
        boolean[] zArr3 = this.zzi;
        zzzd[] zzzdVarArr = this.zzc;
        long jZzo = zzxjVar.zzo(zzabbVarArr, zArr3, zzzdVarArr, zArr, j8);
        for (int i11 = 0; i11 < 2; i11++) {
            zzneVarArr[i11].zza();
        }
        this.zzf = false;
        for (int i12 = 0; i12 < 2; i12++) {
            if (zzzdVarArr[i12] != null) {
                zzgtr.zzi(zzabjVar.zza(i12));
                zzneVarArr[i12].zza();
                this.zzf = true;
            } else {
                zzgtr.zzi(zzabbVarArr[i12] == null);
            }
        }
        return jZzo;
    }

    public final void zzn() {
        zzu();
        try {
            this.zzl.zzf(this.zza);
        } catch (RuntimeException e7) {
            zzeh.zzf("MediaPeriodHolder", "Period release failed.", e7);
        }
    }

    public final void zzo(zzme zzmeVar) {
        if (zzmeVar == this.zzm) {
            return;
        }
        zzu();
        this.zzm = zzmeVar;
        zzt();
    }

    public final zzme zzp() {
        return this.zzm;
    }

    public final zzzo zzq() {
        return this.zzn;
    }

    public final zzabj zzr() {
        return this.zzo;
    }

    public final void zzs(zzxi zzxiVar, long j8) {
        this.zzd = true;
        this.zza.zzl(zzxiVar, j8);
    }
}
