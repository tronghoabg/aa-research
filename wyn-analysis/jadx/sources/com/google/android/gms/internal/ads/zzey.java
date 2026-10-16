package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzey {
    final /* synthetic */ zzfd zza;
    private final int zzb;
    private Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;

    public zzey(zzfd zzfdVar, int i5) {
        Objects.requireNonNull(zzfdVar);
        this.zza = zzfdVar;
        this.zzb = i5;
    }

    public final void zza() {
        zzfd zzfdVar = this.zza;
        if (zzfdVar.zzd().zzh() != 2 || !zzfdVar.zzd().zzk() || zzfdVar.zzd().zzi() != 0) {
            if (this.zzh) {
                zzfdVar.zzg().zzk(1);
            }
            this.zzh = false;
            return;
        }
        zzbf zzbfVarZzq = zzfdVar.zzd().zzq();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(zzfdVar.zzd().zzr());
        zzbb zzbbVarZzd = zzfdVar.zzd();
        zzbb zzbbVarZzd2 = zzfdVar.zzd();
        zzbb zzbbVarZzd3 = zzfdVar.zzd();
        zzbb zzbbVarZzd4 = zzfdVar.zzd();
        int iZzy = zzbbVarZzd.zzy();
        int iZzz = zzbbVarZzd2.zzz();
        long jZzv = zzbbVarZzd3.zzv();
        long jMax = Math.max(0L, zzfdVar.zzd().zzw() - Math.max(0L, jZzv - zzbbVarZzd4.zzu()));
        if (objZzf != null && iZzy == -1) {
            zzbfVarZzq.zzo(objZzf, zzfdVar.zzf());
            jZzv -= zzfm.zzs(0L);
            iZzy = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzh && Objects.equals(objZzf, this.zzc) && iZzy == this.zzd && iZzz == this.zze && jZzv == this.zzf && jMax == this.zzg) {
            long j8 = jElapsedRealtime - this.zzi;
            int i5 = this.zzb;
            if (j8 >= i5) {
                zzfdVar.zze().zza(new zzfe(1, i5));
                return;
            }
            return;
        }
        this.zzh = true;
        this.zzi = jElapsedRealtime;
        this.zzc = objZzf;
        this.zzd = iZzy;
        this.zze = iZzz;
        this.zzf = jZzv;
        this.zzg = jMax;
        zzfdVar.zzg().zzk(1);
        zzfdVar.zzg().zzi(1, this.zzb);
    }
}
