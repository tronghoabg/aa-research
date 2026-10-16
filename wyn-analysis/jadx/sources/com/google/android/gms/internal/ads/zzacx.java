package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zzacx implements zzaew {
    private final zzadw zza;
    private final zzadx zzb;
    private final zzaee zzc;
    private final Queue zzd;
    private Surface zze;
    private zzv zzf;
    private long zzg;
    private zzaet zzh;
    private Executor zzi;
    private zzadt zzj;

    public zzacx(zzadw zzadwVar, zzadx zzadxVar, zzdp zzdpVar) {
        this.zza = zzadwVar;
        this.zzb = zzadxVar;
        zzadwVar.zzg(zzdpVar);
        this.zzc = new zzaee(new zzacw(this, null), zzadwVar, zzadxVar);
        this.zzd = new ArrayDeque();
        this.zzf = new zzt().zzP();
        this.zzg = -9223372036854775807L;
        this.zzh = zzaet.zzb;
        this.zzi = zzacs.zza;
        this.zzj = zzacq.zza;
    }

    public final /* synthetic */ Surface zzA() {
        return this.zze;
    }

    public final /* synthetic */ zzaet zzB() {
        return this.zzh;
    }

    public final /* synthetic */ Executor zzC() {
        return this.zzi;
    }

    public final /* synthetic */ zzadt zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zza() {
        this.zzb.zzd();
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzb() {
        this.zzb.zzd();
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzc(zzaet zzaetVar, Executor executor) {
        this.zzh = zzaetVar;
        this.zzi = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzd(zzv zzvVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzf() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzg(boolean z2) {
        if (z2) {
            this.zza.zzl();
        }
        this.zzb.zzd();
        this.zzc.zza();
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzh(boolean z2) {
        return this.zza.zzi(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzi() {
        this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzj() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final Surface zzk() {
        Surface surface = this.zze;
        surface.getClass();
        return surface;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzl(zzadt zzadtVar) {
        this.zzj = zzadtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzm(float f10) {
        this.zza.zzn(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzn(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzo(long j8) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzp(Surface surface, zzev zzevVar) {
        this.zze = surface;
        this.zza.zzd(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzq() {
        this.zze = null;
        this.zza.zzd(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzr(int i5) {
        this.zza.zzm(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzs(int i5, zzv zzvVar, long j8, int i10, List list) {
        zzgtr.zzi(list.isEmpty());
        int i11 = zzvVar.zzw;
        zzv zzvVar2 = this.zzf;
        if (i11 != zzvVar2.zzw || zzvVar.zzx != zzvVar2.zzx) {
            this.zzc.zzc(i11, zzvVar.zzx);
        }
        float f10 = zzvVar.zzA;
        if (f10 != this.zzf.zzA) {
            this.zza.zze(f10);
        }
        this.zzf = zzvVar;
        if (j8 != this.zzg) {
            this.zzc.zzd(i10, j8);
            this.zzg = j8;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzt() {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzu(long j8, zzaeu zzaeuVar) {
        this.zzd.add(zzaeuVar);
        this.zzc.zze(j8);
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzy();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzv(long j8, long j10) throws zzaev {
        try {
            this.zzc.zzb(j8, j10);
        } catch (zzjm e7) {
            throw new zzaev(e7, this.zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzw(boolean z2) {
        this.zza.zzj(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzx() {
    }

    public final /* synthetic */ void zzy() {
        this.zzh.zza();
    }

    public final /* synthetic */ Queue zzz() {
        return this.zzd;
    }
}
