package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzaee {
    private final zzadw zza;
    private final zzadx zzf;
    private long zzk;
    private final zzacw zzl;
    private final zzadu zzb = new zzadu();
    private final zzfi zzc = new zzfi(10);
    private final zzfi zzd = new zzfi(10);
    private final zzej zze = new zzej(16);
    private long zzg = -9223372036854775807L;
    private zzbv zzj = zzbv.zza;
    private long zzh = -9223372036854775807L;
    private long zzi = -9223372036854775807L;

    public zzaee(zzacw zzacwVar, zzadw zzadwVar, zzadx zzadxVar) {
        this.zzl = zzacwVar;
        this.zza = zzadwVar;
        this.zzf = zzadxVar;
    }

    private static Object zzh(zzfi zzfiVar) {
        zzgtr.zza(zzfiVar.zzc() > 0);
        while (zzfiVar.zzc() > 1) {
            zzfiVar.zzd();
        }
        Object objZzd = zzfiVar.zzd();
        objZzd.getClass();
        return objZzd;
    }

    public final void zza() {
        this.zze.zze();
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        this.zzi = -9223372036854775807L;
        zzfi zzfiVar = this.zzd;
        if (zzfiVar.zzc() > 0) {
            this.zzk = ((Long) zzh(zzfiVar)).longValue();
        }
        zzfi zzfiVar2 = this.zzc;
        if (zzfiVar2.zzc() > 0) {
            zzfiVar2.zza(0L, (zzbv) zzh(zzfiVar2));
        }
    }

    public final void zzb(long j8, long j10) throws zzjm {
        while (true) {
            zzej zzejVar = this.zze;
            if (zzejVar.zzd()) {
                return;
            }
            zzfi zzfiVar = this.zzd;
            long jZzc = zzejVar.zzc();
            Long l10 = (Long) zzfiVar.zze(jZzc);
            if (l10 != null && l10.longValue() != this.zzk) {
                this.zzk = l10.longValue();
                this.zza.zza(2);
            }
            zzadw zzadwVar = this.zza;
            long j11 = this.zzk;
            zzadu zzaduVar = this.zzb;
            int iZzk = zzadwVar.zzk(jZzc, j8, j10, j11, false, false, zzaduVar);
            if (iZzk != 5 && iZzk != 4) {
                this.zzf.zza(jZzc, zzaduVar.zza());
            }
            if (iZzk == 0 || iZzk == 1) {
                this.zzh = jZzc;
                long jZzb = zzejVar.zzb();
                zzbv zzbvVar = (zzbv) this.zzc.zze(jZzb);
                if (zzbvVar != null && !zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzj)) {
                    this.zzj = zzbvVar;
                    this.zzl.zza(zzbvVar);
                }
                this.zzl.zzb(iZzk == 0 ? System.nanoTime() : zzaduVar.zzb(), jZzb, zzadwVar.zzf());
            } else if (iZzk == 2 || iZzk == 3) {
                this.zzh = jZzc;
                zzejVar.zzb();
                final zzacw zzacwVar = this.zzl;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzacu
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzacwVar.zza.zzB().zzc();
                    }
                };
                zzacx zzacxVar = zzacwVar.zza;
                zzacxVar.zzC().execute(runnable);
                ((zzaeu) zzacxVar.zzz().remove()).zzb();
            } else if (iZzk != 4) {
                return;
            } else {
                this.zzh = jZzc;
            }
        }
    }

    public final void zzc(int i5, int i10) {
        long j8 = this.zzg;
        this.zzc.zza(j8 == -9223372036854775807L ? 0L : j8 + 1, new zzbv(i5, i10, 1.0f));
    }

    public final void zzd(int i5, long j8) {
        if (this.zze.zzd()) {
            this.zza.zza(i5);
            this.zzk = j8;
        } else {
            zzfi zzfiVar = this.zzd;
            long j10 = this.zzg;
            zzfiVar.zza(j10 == -9223372036854775807L ? -4611686018427387904L : j10 + 1, Long.valueOf(j8));
        }
    }

    public final void zze(long j8) {
        this.zze.zza(j8);
        this.zzg = j8;
        this.zzi = -9223372036854775807L;
    }

    public final void zzf() {
        long j8 = this.zzg;
        if (j8 == -9223372036854775807L) {
            j8 = Long.MIN_VALUE;
            this.zzg = Long.MIN_VALUE;
            this.zzh = Long.MIN_VALUE;
        }
        this.zzi = j8;
    }

    public final boolean zzg() {
        long j8 = this.zzi;
        return j8 != -9223372036854775807L && this.zzh == j8;
    }
}
