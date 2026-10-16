package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
final class zzcpj implements zzffp {
    final zzini zza;
    final zzini zzb;
    final zzini zzc;
    final zzini zzd;
    final zzini zze;
    final zzini zzf;
    private final zzcpe zzg;

    public zzcpj(zzcpe zzcpeVar, Context context, String str) {
        this.zzg = zzcpeVar;
        zzimz zzimzVarZza = zzina.zza(context);
        this.zza = zzimzVarZza;
        zzimz zzimzVarZza2 = zzina.zza(str);
        this.zzb = zzimzVarZza2;
        zzini zziniVar = zzcpeVar.zzby;
        zzfig zzfigVarZzc = zzfig.zzc(zzimzVarZza, zziniVar, zzcpeVar.zzbz);
        this.zzc = zzfigVarZzc;
        zzini zziniVarZza = zzimy.zza(zzfgn.zza(zziniVar));
        this.zzd = zziniVarZza;
        zzini zziniVar2 = zzcpeVar.zza;
        zzini zziniVar3 = zzcpeVar.zzaf;
        zzfli zzfliVarZza = zzfli.zza();
        zzini zziniVar4 = zzcpeVar.zzi;
        zzini zziniVarZza2 = zzimy.zza(zzfgp.zza(zzimzVarZza, zziniVar2, zziniVar3, zzfigVarZzc, zziniVarZza, zzfliVarZza, zziniVar4));
        this.zze = zziniVarZza2;
        this.zzf = zzimy.zza(zzfgv.zza(zziniVar3, zzimzVarZza, zzimzVarZza2, zziniVarZza2, zziniVarZza, zziniVar4, zzcpeVar.zzp));
    }

    @Override // com.google.android.gms.internal.ads.zzffp
    public final zzfgu zza() {
        return (zzfgu) this.zzf.zzb();
    }
}
