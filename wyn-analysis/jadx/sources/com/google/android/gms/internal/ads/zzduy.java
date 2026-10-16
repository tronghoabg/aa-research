package com.google.android.gms.internal.ads;

import D6.C0395s;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzduy implements zzhcc {
    final /* synthetic */ zzfkn zza;
    final /* synthetic */ zzfkq zzb;
    final /* synthetic */ zzctq zzc;
    final /* synthetic */ zzdvf zzd;

    public zzduy(zzdvf zzdvfVar, zzfkn zzfknVar, zzfkq zzfkqVar, zzctq zzctqVar) {
        this.zza = zzfknVar;
        this.zzb = zzfkqVar;
        this.zzc = zzctqVar;
        Objects.requireNonNull(zzdvfVar);
        this.zzd = zzdvfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        zzclb zzclbVar = (zzclb) obj;
        zzfkn zzfknVar = this.zza;
        zzclbVar.zzaD(zzfknVar, this.zzb);
        zzcmz zzcmzVarZzP = zzclbVar.zzP();
        zzbio zzbioVar = zzbix.zzlL;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && zzcmzVarZzP != null) {
            zzctq zzctqVar = this.zzc;
            zzdvf zzdvfVar = this.zzd;
            zzcmzVarZzP.zzd(zzctqVar, zzdvfVar.zzm(), zzdvfVar.zzn());
            zzcmzVarZzP.zze(zzctqVar, zzdvfVar.zzm(), zzdvfVar.zzl());
        }
        if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzoK)).booleanValue() || zzcmzVarZzP == null) {
            return;
        }
        zzcmzVarZzP.zzb(zzfknVar);
    }
}
