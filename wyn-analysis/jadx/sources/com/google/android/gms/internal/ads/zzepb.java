package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzepb extends zzepa {
    private final zzcnq zza;
    private final zzdci zzb;
    private final zzdiz zzc;
    private final zzepl zzd;
    private final zzemf zze;

    public zzepb(zzcnq zzcnqVar, zzdci zzdciVar, zzdiz zzdizVar, zzepl zzeplVar, zzemf zzemfVar) {
        this.zza = zzcnqVar;
        this.zzb = zzdciVar;
        this.zzc = zzdizVar;
        this.zzd = zzeplVar;
        this.zze = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepa
    public final p8.p zzc(zzflg zzflgVar, Bundle bundle, zzfkn zzfknVar, zzfky zzfkyVar) {
        zzdci zzdciVar = this.zzb;
        zzdciVar.zzb(zzflgVar);
        zzdciVar.zzc(bundle);
        zzdciVar.zzd(new zzdcc(zzfkyVar, zzfknVar, this.zzd));
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeE)).booleanValue()) {
            zzdciVar.zzg(this.zze);
        }
        zzcvf zzcvfVarZzk = this.zza.zzk();
        zzcvfVarZzk.zzd(zzdciVar.zze());
        zzcvfVarZzk.zze(this.zzc);
        zzcze zzczeVarZza = zzcvfVarZzk.zza().zza();
        return zzczeVarZza.zzc(zzczeVarZza.zzb());
    }
}
