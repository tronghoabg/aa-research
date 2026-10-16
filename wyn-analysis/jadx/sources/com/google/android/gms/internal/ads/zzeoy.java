package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzeoy extends zzepa {
    private final zzcnq zza;
    private final zzdof zzb;
    private final zzdci zzc;
    private final zzdiz zzd;
    private final zzepl zze;
    private final zzemf zzf;

    public zzeoy(zzcnq zzcnqVar, zzdof zzdofVar, zzdci zzdciVar, zzdiz zzdizVar, zzepl zzeplVar, zzemf zzemfVar) {
        this.zza = zzcnqVar;
        this.zzb = zzdofVar;
        this.zzc = zzdciVar;
        this.zzd = zzdizVar;
        this.zze = zzeplVar;
        this.zzf = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepa
    public final p8.p zzc(zzflg zzflgVar, Bundle bundle, zzfkn zzfknVar, zzfky zzfkyVar) {
        zzdci zzdciVar = this.zzc;
        zzdciVar.zzb(zzflgVar);
        zzdciVar.zzc(bundle);
        zzdciVar.zzd(new zzdcc(zzfkyVar, zzfknVar, this.zze));
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeE)).booleanValue()) {
            zzdciVar.zzg(this.zzf);
        }
        zzdoj zzdojVarZzo = this.zza.zzo();
        zzdojVarZzo.zzf(zzdciVar.zze());
        zzdojVarZzo.zzg(this.zzd);
        zzdojVarZzo.zze(this.zzb);
        zzdojVarZzo.zzd(new zzcvp(null));
        zzcze zzczeVarZza = zzdojVarZzo.zza().zza();
        return zzczeVarZza.zzc(zzczeVarZza.zzb());
    }
}
