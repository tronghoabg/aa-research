package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcqn implements zzimz {
    private final zzcqm zza;

    private zzcqn(zzcqm zzcqmVar) {
        this.zza = zzcqmVar;
    }

    public static zzcqn zzc(zzcqm zzcqmVar) {
        return new zzcqn(zzcqmVar);
    }

    public static C6.a zzd(zzcqm zzcqmVar) {
        return new C6.a(new zzcir(), new zzchm());
    }

    public final C6.a zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
