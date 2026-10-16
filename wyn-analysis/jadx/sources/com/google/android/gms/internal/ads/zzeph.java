package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzeph extends zzepa {
    private final zzcnq zza;
    private final zzdci zzb;
    private final zzdiz zzc;
    private final zzepl zzd;
    private final zzfkz zze;
    private final zzemf zzf;

    public zzeph(zzcnq zzcnqVar, zzdci zzdciVar, zzdiz zzdizVar, zzfkz zzfkzVar, zzepl zzeplVar, zzemf zzemfVar) {
        this.zza = zzcnqVar;
        this.zzb = zzdciVar;
        this.zzc = zzdizVar;
        this.zze = zzfkzVar;
        this.zzd = zzeplVar;
        this.zzf = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepa
    public final p8.p zzc(zzflg zzflgVar, Bundle bundle, zzfkn zzfknVar, zzfky zzfkyVar) {
        zzfkz zzfkzVar;
        zzdci zzdciVar = this.zzb;
        zzdciVar.zzb(zzflgVar);
        zzdciVar.zzc(bundle);
        zzdciVar.zzd(new zzdcc(zzfkyVar, zzfknVar, this.zzd));
        zzbio zzbioVar = zzbix.zzeD;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && (zzfkzVar = this.zze) != null) {
            zzdciVar.zzf(zzfkzVar);
        }
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzeE)).booleanValue()) {
            zzdciVar.zzg(this.zzf);
        }
        zzdvy zzdvyVarZzp = this.zza.zzp();
        zzdvyVarZzp.zzd(zzdciVar.zze());
        zzdvyVarZzp.zze(this.zzc);
        zzcze zzczeVarZza = zzdvyVarZzp.zza().zza();
        return zzczeVarZza.zzc(zzczeVarZza.zzb());
    }
}
