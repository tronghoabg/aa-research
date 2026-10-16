package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdfp implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzdfp(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzdfp zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzdfp(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdfo(((zzinl) this.zza).zzb(), ((zzcyr) this.zzb).zza(), ((zzcyu) this.zzc).zza());
    }
}
