package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes3.dex */
public final class zzyv extends zzwm implements zzyj {
    private final zzhq zza;
    private final zzyd zzb;
    private final zzuq zzc;
    private final int zzd;
    private boolean zze = true;
    private long zzf = -9223372036854775807L;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private zzip zzj;
    private zzak zzk;
    private final zzabw zzl;

    public /* synthetic */ zzyv(zzak zzakVar, zzhq zzhqVar, zzyd zzydVar, zzuq zzuqVar, zzabw zzabwVar, int i5, boolean z2, int i10, zzv zzvVar, zzguj zzgujVar, byte[] bArr) {
        this.zzk = zzakVar;
        this.zza = zzhqVar;
        this.zzb = zzydVar;
        this.zzc = zzuqVar;
        this.zzl = zzabwVar;
        this.zzd = i5;
    }

    private final void zzv() {
        long j8 = this.zzf;
        boolean z2 = this.zzg;
        boolean z10 = this.zzh;
        zzak zzakVarZzK = zzK();
        zzbf zzzhVar = new zzzh(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j8, j8, 0L, 0L, z2, false, false, null, zzakVarZzK, z10 ? zzakVarZzK.zzc : null);
        if (this.zze) {
            zzzhVar = new zzys(this, zzzhVar);
        }
        zze(zzzhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwm, com.google.android.gms.internal.ads.zzxn
    public final synchronized void zzB(zzak zzakVar) {
        this.zzk = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzE(zzxj zzxjVar) {
        ((zzyr) zzxjVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final zzxj zzH(zzxl zzxlVar, zzabm zzabmVar, long j8) {
        zzhr zzhrVarZza = this.zza.zza();
        zzip zzipVar = this.zzj;
        if (zzipVar != null) {
            zzhrVarZza.zze(zzipVar);
        }
        zzag zzagVar = zzK().zzb;
        zzagVar.getClass();
        return new zzyr(zzagVar.zza, zzhrVarZza, this.zzb.zza(zzk()), this.zzc, zzh(zzxlVar), this.zzl, zzf(zzxlVar), this, zzabmVar, null, this.zzd, false, 0, null, zzfm.zzt(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final synchronized zzak zzK() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zza(zzip zzipVar) {
        this.zzj = zzipVar;
        Looper.myLooper().getClass();
        zzk();
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final void zzb(long j8, zzahd zzahdVar, boolean z2) {
        if (this.zzi && zzahdVar.zzj()) {
            return;
        }
        this.zzi = !zzahdVar.zzj();
        if (j8 == -9223372036854775807L) {
            j8 = this.zzf;
        }
        boolean zZzb = zzahdVar.zzb();
        if (!this.zze && this.zzf == j8 && this.zzg == zZzb && this.zzh == z2) {
            return;
        }
        this.zzf = j8;
        this.zzg = zZzb;
        this.zzh = z2;
        this.zze = false;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzu() {
    }
}
