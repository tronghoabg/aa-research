package com.google.android.gms.internal.ads;

import D6.x1;
import android.content.Context;

/* loaded from: classes3.dex */
final class zzcpz implements zzfit {
    final zzini zza;
    final zzini zzb;
    final zzini zzc;
    final zzini zzd;
    final zzini zze;
    final zzini zzf;
    final zzini zzg;
    private final zzcpe zzh;

    public zzcpz(zzcpe zzcpeVar, Context context, String str, x1 x1Var) {
        this.zzh = zzcpeVar;
        zzimz zzimzVarZza = zzina.zza(context);
        this.zza = zzimzVarZza;
        zzimz zzimzVarZza2 = zzina.zza(x1Var);
        this.zzb = zzimzVarZza2;
        zzimz zzimzVarZza3 = zzina.zza(str);
        this.zzc = zzimzVarZza3;
        zzini zziniVar = zzcpeVar.zzp;
        zzini zziniVarZza = zzimy.zza(zzetl.zza(zziniVar));
        this.zzd = zziniVarZza;
        zzini zziniVarZza2 = zzimy.zza(zzfjs.zza(zzcpeVar.zzby));
        this.zze = zziniVarZza2;
        zzini zziniVarZza3 = zzimy.zza(zzfir.zza(zzimzVarZza, zzcpeVar.zza, zzcpeVar.zzaf, zziniVarZza, zziniVarZza2, zzfli.zza()));
        this.zzf = zziniVarZza3;
        this.zzg = zzimy.zza(zzett.zza(zzimzVarZza, zzimzVarZza2, zzimzVarZza3, zziniVarZza3, zziniVarZza, zziniVarZza2, zzcpeVar.zzi, zzcpeVar.zzai, zziniVar));
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public final zzets zza() {
        return (zzets) this.zzg.zzb();
    }
}
