package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
final class zzcqb implements zzehr {
    final zzini zza;
    final zzini zzb;
    private final zzcpe zzc;
    private final zzcqb zzd = this;

    public zzcqb(zzcpe zzcpeVar, Context context) {
        this.zzc = zzcpeVar;
        zzeiz zzeizVarZzc = zzeiz.zzc(zzcpeVar.zzaG);
        this.zza = zzeizVarZzc;
        this.zzb = zzeir.zza(zzcpeVar.zzf, zzfoi.zza(), zzcoy.zza, zzcpeVar.zzaF, zzeizVarZzc, zzcpeVar.zzaH, zzcov.zza, zzcpeVar.zzG);
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final zzehv zza() {
        zzcpe zzcpeVar = this.zzc;
        zzini zziniVar = zzcpeVar.zzp;
        zzcns zzcnsVarZzI = zzcpeVar.zzI();
        return zzehw.zza(zzcnz.zzd(zzcpeVar.zzI()), zzfoo.zzc(), zzfoi.zzc(), zzimy.zzc(this.zzb), zzcop.zzd(zzcnsVarZzI), this, (zzdzt) zziniVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzehr
    public final zzehx zzb() {
        return new zzcqc(this.zzc, this.zzd, null);
    }
}
