package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes3.dex */
final class zzmu {
    private static final zzxl zzu = new zzxl(new Object(), -1);
    public final zzbf zza;
    public final zzxl zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzjm zzf;
    public final boolean zzg;
    public final zzzo zzh;
    public final zzabj zzi;
    public final List zzj;
    public final zzxl zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzav zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzmu(zzbf zzbfVar, zzxl zzxlVar, long j8, long j10, int i5, zzjm zzjmVar, boolean z2, zzzo zzzoVar, zzabj zzabjVar, List list, zzxl zzxlVar2, boolean z10, int i10, int i11, zzav zzavVar, long j11, long j12, long j13, long j14, boolean z11) {
        this.zza = zzbfVar;
        this.zzb = zzxlVar;
        this.zzc = j8;
        this.zzd = j10;
        this.zze = i5;
        this.zzf = zzjmVar;
        this.zzg = z2;
        this.zzh = zzzoVar;
        this.zzi = zzabjVar;
        this.zzj = list;
        this.zzk = zzxlVar2;
        this.zzl = z10;
        this.zzm = i10;
        this.zzn = i11;
        this.zzo = zzavVar;
        this.zzq = j11;
        this.zzr = j12;
        this.zzs = j13;
        this.zzt = j14;
    }

    public static zzmu zza(zzabj zzabjVar) {
        zzbf zzbfVar = zzbf.zza;
        zzxl zzxlVar = zzu;
        return new zzmu(zzbfVar, zzxlVar, -9223372036854775807L, 0L, 1, null, false, zzzo.zza, zzabjVar, zzgwt.zzi(), zzxlVar, false, 1, 0, zzav.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzxl zzb() {
        return zzu;
    }

    public final zzmu zzc(zzxl zzxlVar, long j8, long j10, long j11, long j12, zzzo zzzoVar, zzabj zzabjVar, List list) {
        zzxl zzxlVar2 = this.zzk;
        boolean z2 = this.zzl;
        int i5 = this.zzm;
        int i10 = this.zzn;
        zzav zzavVar = this.zzo;
        long j13 = this.zzq;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzmu(this.zza, zzxlVar, j10, j11, this.zze, this.zzf, this.zzg, zzzoVar, zzabjVar, list, zzxlVar2, z2, i5, i10, zzavVar, j13, j12, j8, jElapsedRealtime, false);
    }

    public final zzmu zzd(zzbf zzbfVar) {
        return new zzmu(zzbfVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmu zze(int i5) {
        return new zzmu(this.zza, this.zzb, this.zzc, this.zzd, i5, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmu zzf(zzjm zzjmVar) {
        return new zzmu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzjmVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmu zzg(boolean z2) {
        return new zzmu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z2, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmu zzh(zzxl zzxlVar) {
        return new zzmu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzxlVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzmu zzi(boolean z2, int i5, int i10) {
        return new zzmu(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z2, i5, i10, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
