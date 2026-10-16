package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgkj implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;
    private final zzini zzf;

    private zzgkj(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
        this.zzf = zziniVar6;
    }

    public static zzgkj zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6) {
        return new zzgkj(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgpe zzgpeVar = (zzgpe) this.zza.zzb();
        zzgmp zzgmpVar = (zzgmp) this.zzb.zzb();
        zzgng zzgngVar = (zzgng) this.zzc.zzb();
        zzgqo zzgqoVar = (zzgqo) this.zzd.zzb();
        zzgew zzgewVar = (zzgew) this.zze.zzb();
        zzgdq zzgdqVar = (zzgdq) this.zzf.zzb();
        return new zzgkz(zzgpeVar, zzgmpVar, zzgngVar, zzgqoVar, zzgewVar, zzgdqVar.zzk().zze(), zzgdqVar.zzk().zzg(), zzgdqVar.zzk().zzh());
    }
}
