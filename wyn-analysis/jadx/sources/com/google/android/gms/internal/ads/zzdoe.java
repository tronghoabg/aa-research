package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdoe implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;

    private zzdoe(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
    }

    public static zzdoe zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        return new zzdoe(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdod(((zzind) this.zza).zzb(), ((zzind) this.zzb).zzb(), ((zzind) this.zzc).zzb(), this.zzd, ((zzdoi) this.zze).zza());
    }
}
