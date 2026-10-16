package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
final class zzcqf implements zzfkh {
    final zzini zza;
    final zzini zzb;
    final zzini zzc;
    final zzini zzd;
    final zzini zze;
    final zzini zzf;
    final zzini zzg;
    final zzini zzh;
    private final zzcpe zzi;

    public zzcqf(zzcpe zzcpeVar, Context context, String str) {
        this.zzi = zzcpeVar;
        zzimz zzimzVarZza = zzina.zza(context);
        this.zza = zzimzVarZza;
        zzini zziniVar = zzcpeVar.zzby;
        zzfih zzfihVarZzc = zzfih.zzc(zzimzVarZza, zziniVar, zzcpeVar.zzbz);
        this.zzb = zzfihVarZzc;
        zzini zziniVarZza = zzimy.zza(zzfjs.zza(zziniVar));
        this.zzc = zziniVarZza;
        zzini zziniVarZza2 = zzimy.zza(zzfle.zza());
        this.zzd = zziniVarZza2;
        zzini zziniVarZza3 = zzimy.zza(zzfkb.zza(zzimzVarZza, zzcpeVar.zza, zzcpeVar.zzaf, zzfihVarZzc, zziniVarZza, zzfli.zza(), zziniVarZza2));
        this.zze = zziniVarZza3;
        this.zzf = zzimy.zza(zzfkl.zza(zziniVarZza3, zziniVarZza, zziniVarZza2));
        zzimz zzimzVarZzc = zzina.zzc(str);
        this.zzg = zzimzVarZzc;
        this.zzh = zzimy.zza(zzfkf.zza(zzimzVarZzc, zziniVarZza3, zzimzVarZza, zziniVarZza, zziniVarZza2, zzcpeVar.zzi, zzcpeVar.zzai, zzcpeVar.zzp));
    }

    @Override // com.google.android.gms.internal.ads.zzfkh
    public final zzfkk zza() {
        return (zzfkk) this.zzf.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfkh
    public final zzfke zzb() {
        return (zzfke) this.zzh.zzb();
    }
}
