package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.x1;
import android.content.Context;

/* loaded from: classes3.dex */
public final class zzdwq {
    private final Context zza;
    private final zzbaw zzb;
    private final zzbke zzc;
    private final H6.a zzd;
    private final C6.a zze;
    private final zzbhw zzf;
    private final zzdga zzg;
    private final zzekz zzh;
    private final zzflk zzi;
    private final zzdzt zzj;
    private final zzcna zzk;

    public zzdwq(zzclr zzclrVar, Context context, zzbaw zzbawVar, zzbke zzbkeVar, H6.a aVar, C6.a aVar2, zzbhw zzbhwVar, zzdga zzdgaVar, zzekz zzekzVar, zzflk zzflkVar, zzdzt zzdztVar, zzcna zzcnaVar) {
        this.zza = context;
        this.zzb = zzbawVar;
        this.zzc = zzbkeVar;
        this.zzd = aVar;
        this.zze = aVar2;
        this.zzf = zzbhwVar;
        this.zzg = zzdgaVar;
        this.zzh = zzekzVar;
        this.zzi = zzflkVar;
        this.zzj = zzdztVar;
        this.zzk = zzcnaVar;
    }

    public final zzclb zza(x1 x1Var, zzfkn zzfknVar, zzfkq zzfkqVar) throws zzclq {
        zzcnl zzcnlVarZza = zzcnl.zza(x1Var);
        String str = x1Var.f2530a;
        zzdwf zzdwfVar = new zzdwf(this);
        zzbaw zzbawVar = this.zzb;
        zzekz zzekzVar = this.zzh;
        zzclb zzclbVarZza = zzclr.zza(this.zza, zzcnlVarZza, str, false, false, zzbawVar, this.zzc, this.zzd, null, zzdwfVar, this.zze, this.zzf, zzfknVar, zzfkqVar, zzekzVar, this.zzi, this.zzj);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpK)).booleanValue()) {
            this.zzk.zza(zzclbVarZza.zzD());
        }
        return zzclbVarZza;
    }

    public final /* synthetic */ zzdga zzb() {
        return this.zzg;
    }
}
