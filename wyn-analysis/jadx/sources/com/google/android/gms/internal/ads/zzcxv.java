package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcxv implements zzimz {
    private final zzcxs zza;

    private zzcxv(zzcxs zzcxsVar) {
        this.zza = zzcxsVar;
    }

    public static zzcxv zzc(zzcxs zzcxsVar) {
        return new zzcxv(zzcxsVar);
    }

    public static zzdga zzd(zzcxs zzcxsVar) {
        return zzcxsVar.zza();
    }

    public final zzdga zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
