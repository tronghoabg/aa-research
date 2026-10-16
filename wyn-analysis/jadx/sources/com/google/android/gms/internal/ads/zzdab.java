package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdab implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdab(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdab zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdab(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdaa((zzdae) this.zza.zzb(), ((zzdcq) this.zzb).zza());
    }
}
