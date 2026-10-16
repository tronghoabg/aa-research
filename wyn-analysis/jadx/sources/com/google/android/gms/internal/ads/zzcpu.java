package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
final class zzcpu implements zzebl {
    final zzini zza;
    final zzini zzb;
    final zzini zzc;
    final zzini zzd;
    private final Context zze;
    private final zzbqx zzf;
    private final zzcpe zzg;
    private final zzcpu zzh = this;

    public zzcpu(zzcpe zzcpeVar, Context context, zzbqx zzbqxVar) {
        this.zzg = zzcpeVar;
        this.zze = context;
        this.zzf = zzbqxVar;
        zzimz zzimzVarZza = zzina.zza(this);
        this.zza = zzimzVarZza;
        zzimz zzimzVarZza2 = zzina.zza(zzbqxVar);
        this.zzb = zzimzVarZza2;
        zzebh zzebhVarZzc = zzebh.zzc(zzimzVarZza2);
        this.zzc = zzebhVarZzc;
        this.zzd = zzimy.zza(zzebj.zza(zzimzVarZza, zzebhVarZzc));
    }

    public final zzebg zza() {
        return zzebh.zzd(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzebl
    public final zzebi zzb() {
        return (zzebi) this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzebl
    public final zzebd zzc() {
        return new zzcpr(this.zzg, this.zzh, null);
    }

    public final /* synthetic */ Context zzd() {
        return this.zze;
    }
}
