package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzepf extends zzepa {
    private final zzcnq zza;
    private final zzdci zzb;
    private final zzerq zzc;
    private final zzdiz zzd;
    private final zzepl zze;
    private final zzemf zzf;

    public zzepf(zzcnq zzcnqVar, zzdci zzdciVar, zzerq zzerqVar, zzdiz zzdizVar, zzepl zzeplVar, zzemf zzemfVar) {
        this.zza = zzcnqVar;
        this.zzb = zzdciVar;
        this.zzc = zzerqVar;
        this.zzd = zzdizVar;
        this.zze = zzeplVar;
        this.zzf = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepa
    public final p8.p zzc(zzflg zzflgVar, Bundle bundle, zzfkn zzfknVar, zzfky zzfkyVar) {
        zzdci zzdciVar = this.zzb;
        zzdciVar.zzb(zzflgVar);
        zzdciVar.zzc(bundle);
        zzdciVar.zzd(new zzdcc(zzfkyVar, zzfknVar, this.zze));
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeE)).booleanValue()) {
            zzdciVar.zzg(this.zzf);
        }
        zzdnn zzdnnVarZzm = this.zza.zzm();
        zzdnnVarZzm.zze(zzdciVar.zze());
        zzdnnVarZzm.zzf(this.zzd);
        zzdnnVarZzm.zzd(this.zzc);
        zzcze zzczeVarZzb = zzdnnVarZzm.zza().zzb();
        return zzczeVarZzb.zzc(zzczeVarZzb.zzb());
    }
}
