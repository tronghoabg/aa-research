package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzgec implements zzggu {
    final zzini zza;
    final zzini zzb;
    final zzini zzc;
    final zzini zzd;
    final zzini zze;
    private final zzgdw zzf;
    private final zzgec zzg = this;

    public zzgec(zzgdw zzgdwVar) {
        this.zzf = zzgdwVar;
        zzini zziniVarZza = zzimy.zza(zzggx.zza());
        this.zza = zziniVarZza;
        zzini zziniVarZza2 = zzimy.zza(zzgih.zza(zzgdwVar.zza, zzgdwVar.zzc, zzgdwVar.zzG, zziniVarZza, zzgdwVar.zzJ, zzgdwVar.zzu, zzgdwVar.zzj, zzgik.zza()));
        this.zzb = zziniVarZza2;
        zzini zziniVarZza3 = zzimy.zza(zzghc.zza());
        this.zzc = zziniVarZza3;
        zzgeb zzgebVar = new zzgeb(this);
        this.zzd = zzgebVar;
        this.zze = zzimy.zza(zzggv.zza(zzgdwVar.zzc, zziniVarZza2, zzgdwVar.zzG, zzgdwVar.zzF, zziniVarZza3, zzgebVar, zzgdwVar.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final zzggc zza() {
        return (zzggc) this.zze.zzb();
    }

    public final /* synthetic */ zzgdw zzb() {
        return this.zzf;
    }

    public final /* synthetic */ zzgec zzc() {
        return this.zzg;
    }
}
