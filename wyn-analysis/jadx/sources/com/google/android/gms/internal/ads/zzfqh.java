package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfqh implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;

    private zzfqh(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar6;
    }

    public static zzfqh zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6) {
        return new zzfqh(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfqt(((zzcnz) this.zza).zza(), ((zzcop) this.zzb).zza(), (zzdxh) this.zzc.zzb(), zzcow.zza(), zzcoz.zza(), (zzcnn) this.zzd.zzb());
    }
}
