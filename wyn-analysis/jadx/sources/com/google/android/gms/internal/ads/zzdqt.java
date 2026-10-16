package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdqt implements zzimz {
    private final zzdqm zza;

    private zzdqt(zzdqm zzdqmVar) {
        this.zza = zzdqmVar;
    }

    public static zzdqt zzc(zzdqm zzdqmVar) {
        return new zzdqt(zzdqmVar);
    }

    public static zzdqb zzd(zzdqm zzdqmVar) {
        zzdqb zzdqbVarZza = zzdqmVar.zza();
        zzinh.zzb(zzdqbVarZza);
        return zzdqbVarZza;
    }

    public final zzdqb zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
