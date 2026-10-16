package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdpc implements zzimz {
    private final zzdox zza;

    private zzdpc(zzdox zzdoxVar) {
        this.zza = zzdoxVar;
    }

    public static zzdpc zzc(zzdox zzdoxVar) {
        return new zzdpc(zzdoxVar);
    }

    public static zzdvf zzd(zzdox zzdoxVar) {
        zzdvf zzdvfVarZzd = zzdoxVar.zzd();
        zzinh.zzb(zzdvfVarZzd);
        return zzdvfVarZzd;
    }

    public final zzdvf zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
