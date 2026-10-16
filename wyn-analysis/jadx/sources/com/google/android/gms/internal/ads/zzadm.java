package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zzadm implements zzaew {
    final /* synthetic */ zzads zza;
    private zzgwt zzb;
    private zzv zzc;
    private long zzd;
    private long zze;
    private int zzf;

    public zzadm(zzads zzadsVar, Context context, int i5) {
        Objects.requireNonNull(zzadsVar);
        this.zza = zzadsVar;
        zzfm.zzW(context);
        this.zzb = zzgwt.zzi();
        this.zze = -9223372036854775807L;
        zzaet zzaetVar = zzaet.zzb;
    }

    private static final void zzy(zzv zzvVar) {
        zzt zztVarZza = zzvVar.zza();
        zztVarZza.zzE(zzads.zzC(zzvVar.zzF));
        zztVarZza.zzP();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zza() {
        zzads zzadsVar = this.zza;
        if (zzadsVar.zzt()) {
            zzadsVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzb() {
        zzads zzadsVar = this.zza;
        if (zzadsVar.zzt()) {
            zzadsVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzc(zzaet zzaetVar, Executor executor) {
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzd(zzv zzvVar) throws zzaev {
        return this.zza.zzi(zzvVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzg(boolean z2) {
        this.zze = -9223372036854775807L;
        this.zza.zzm(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzh(boolean z2) {
        return this.zza.zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzi() {
        zzads zzadsVar = this.zza;
        zzadsVar.zzA(this.zze);
        if (zzadsVar.zzy() >= zzadsVar.zzz()) {
            zzadsVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzj() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final Surface zzk() {
        zzgtr.zzi(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzl(zzadt zzadtVar) {
        this.zza.zzp(zzadtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzm(float f10) {
        this.zza.zzq(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzn(List list) {
        if (this.zzb.equals(list)) {
            return;
        }
        this.zzb = zzgwt.zzq(list);
        zzv zzvVar = this.zzc;
        if (zzvVar != null) {
            zzy(zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzo(long j8) {
        this.zzd = j8;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzp(Surface surface, zzev zzevVar) {
        this.zza.zzc(surface, zzevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzq() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzr(int i5) {
        this.zza.zzr(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzs(int i5, zzv zzvVar, long j8, int i10, List list) {
        zzgtr.zzi(false);
        this.zzb = zzgwt.zzq(list);
        this.zzc = zzvVar;
        zzads zzadsVar = this.zza;
        zzadsVar.zzA(-9223372036854775807L);
        zzy(zzvVar);
        long j10 = this.zze;
        long j11 = -4611686018427387904L;
        if (zzadsVar.zzt()) {
            if (j10 != -9223372036854775807L) {
                j11 = j10 + 1;
            }
        } else if (j10 != -9223372036854775807L) {
            return;
        }
        long j12 = j11;
        zzadsVar.zzw().zza(j12, new zzadr(j8 + this.zzd, i10, j12));
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzt() {
        zzads zzadsVar = this.zza;
        if (zzadsVar.zzw().zzc() == 0) {
            zzadsVar.zzo();
            return;
        }
        zzfi zzfiVar = new zzfi(10);
        boolean z2 = true;
        while (zzadsVar.zzw().zzc() > 0) {
            zzadr zzadrVar = (zzadr) zzadsVar.zzw().zzd();
            zzadrVar.getClass();
            if (z2) {
                int i5 = zzadrVar.zzb;
                if (i5 == 0 || i5 == 1) {
                    zzadrVar = new zzadr(zzadrVar.zza, 0, zzadrVar.zzc);
                } else {
                    zzadsVar.zzo();
                }
            }
            zzfiVar.zza(zzadrVar.zzc, zzadrVar);
            z2 = false;
        }
        zzadsVar.zzx(zzfiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final boolean zzu(long j8, zzaeu zzaeuVar) {
        int i5;
        zzgtr.zzi(false);
        long j10 = j8 + this.zzd;
        zzads zzadsVar = this.zza;
        long jZzb = zzadsVar.zzv().zzb(j10);
        if (jZzb == -9223372036854775807L || jZzb >= zzadsVar.zzu() || (i5 = this.zzf) >= 2) {
            if (zzadsVar.zzs()) {
                throw null;
            }
            return false;
        }
        this.zzf = i5 + 1;
        zzaeuVar.zzb();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzv(long j8, long j10) throws zzaev {
        this.zza.zzl(j8 + this.zzd, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzw(boolean z2) {
        zzads zzadsVar = this.zza;
        if (zzadsVar.zzt()) {
            zzadsVar.zzn(z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zzx() {
        this.zza.zzg();
    }
}
