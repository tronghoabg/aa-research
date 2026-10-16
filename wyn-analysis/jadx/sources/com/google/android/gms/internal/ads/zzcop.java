package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcop implements zzimz {
    private final zzcns zza;

    private zzcop(zzcns zzcnsVar) {
        this.zza = zzcnsVar;
    }

    public static zzcop zzc(zzcns zzcnsVar) {
        return new zzcop(zzcnsVar);
    }

    public static H6.a zzd(zzcns zzcnsVar) {
        H6.a aVarZzd = zzcnsVar.zzd();
        zzinh.zzb(aVarZzd);
        return aVarZzd;
    }

    public final H6.a zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
