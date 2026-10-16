package com.google.android.gms.internal.p002firebaseauthapi;

import J8.F;
import a.AbstractC1304a;

/* loaded from: classes.dex */
final class zzabd implements zzael<zzagl> {
    private final /* synthetic */ F zza;
    private final /* synthetic */ zzade zzb;
    private final /* synthetic */ zzzk zzc;

    public zzabd(zzzk zzzkVar, F f10, zzade zzadeVar) {
        this.zza = f10;
        this.zzb = zzadeVar;
        this.zzc = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzb.zza(AbstractC1304a.i0(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final void zza(zzagl zzaglVar) {
        zzagl zzaglVar2 = zzaglVar;
        zzahb zzahbVar = new zzahb();
        zzahbVar.zzd(zzaglVar2.zzc());
        F f10 = this.zza;
        if (f10.f5742c || f10.f5740a != null) {
            zzahbVar.zzb(f10.f5740a);
        }
        F f11 = this.zza;
        if (f11.f5743d || f11.f5744e != null) {
            zzahbVar.zzg(f11.f5741b);
        }
        zzzk.zza(this.zzc, this.zzb, zzaglVar2, zzahbVar, this);
    }
}
