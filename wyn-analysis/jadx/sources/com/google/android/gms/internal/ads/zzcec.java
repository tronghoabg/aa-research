package com.google.android.gms.internal.ads;

import android.content.Context;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
final class zzcec extends zzceh {
    final zzini zza;
    final zzini zzb;
    final zzini zzc;
    final zzini zzd;
    final zzini zze;
    final zzini zzf;
    final zzini zzg;
    final zzini zzh;
    private final InterfaceC3596a zzj;

    public zzcec(Context context, InterfaceC3596a interfaceC3596a, G6.N n10, zzceg zzcegVar) {
        this.zzj = interfaceC3596a;
        zzimz zzimzVarZza = zzina.zza(context);
        this.zza = zzimzVarZza;
        zzimz zzimzVarZza2 = zzina.zza(n10);
        this.zzb = zzimzVarZza2;
        this.zzc = zzimy.zza(zzcdw.zza(zzimzVarZza, zzimzVarZza2));
        zzimz zzimzVarZza3 = zzina.zza(interfaceC3596a);
        this.zzd = zzimzVarZza3;
        zzimz zzimzVarZza4 = zzina.zza(zzcegVar);
        this.zze = zzimzVarZza4;
        zzini zziniVarZza = zzimy.zza(zzcdy.zza(zzimzVarZza3, zzimzVarZza2, zzimzVarZza4));
        this.zzf = zziniVarZza;
        zzcea zzceaVarZzc = zzcea.zzc(zzimzVarZza3, zziniVarZza);
        this.zzg = zzceaVarZzc;
        this.zzh = zzimy.zza(zzcen.zza(zzimzVarZza, zzceaVarZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzceh
    public final zzcdz zza() {
        return new zzcdz(this.zzj, (zzcdx) this.zzf.zzb());
    }
}
