package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.Bundle;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class zzepd extends zzepa {
    private final zzcnq zza;
    private final zzdci zzb;
    private final zzerq zzc;
    private final zzdiz zzd;
    private final zzdof zze;
    private final zzdga zzf;
    private final ViewGroup zzg;
    private final zzdif zzh;
    private final zzepl zzi;
    private final zzemf zzj;

    public zzepd(zzcnq zzcnqVar, zzdci zzdciVar, zzerq zzerqVar, zzdiz zzdizVar, zzdof zzdofVar, zzdga zzdgaVar, ViewGroup viewGroup, zzdif zzdifVar, zzepl zzeplVar, zzemf zzemfVar) {
        this.zza = zzcnqVar;
        this.zzb = zzdciVar;
        this.zzc = zzerqVar;
        this.zzd = zzdizVar;
        this.zze = zzdofVar;
        this.zzf = zzdgaVar;
        this.zzg = viewGroup;
        this.zzh = zzdifVar;
        this.zzi = zzeplVar;
        this.zzj = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepa
    public final p8.p zzc(zzflg zzflgVar, Bundle bundle, zzfkn zzfknVar, zzfky zzfkyVar) {
        zzdci zzdciVar = this.zzb;
        zzdciVar.zzb(zzflgVar);
        zzdciVar.zzc(bundle);
        zzdciVar.zzd(new zzdcc(zzfkyVar, zzfknVar, this.zzi));
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeE)).booleanValue()) {
            zzdciVar.zzg(this.zzj);
        }
        zzcww zzcwwVarZzi = this.zza.zzi();
        zzcwwVarZzi.zzl(zzdciVar.zze());
        zzcwwVarZzi.zzm(this.zzd);
        zzcwwVarZzi.zzk(this.zzc);
        zzcwwVarZzi.zzd(this.zze);
        zzcwwVarZzi.zzg(new zzcxs(this.zzf, this.zzh));
        zzcwwVarZzi.zze(new zzcvp(this.zzg));
        zzcze zzczeVarZzc = zzcwwVarZzi.zza().zzc();
        return zzczeVarZzc.zzc(zzczeVarZzc.zzb());
    }
}
