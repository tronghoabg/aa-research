package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdoi implements zzimz {
    private final zzdof zza;

    private zzdoi(zzdof zzdofVar) {
        this.zza = zzdofVar;
    }

    public static zzdoi zzc(zzdof zzdofVar) {
        return new zzdoi(zzdofVar);
    }

    public static zzdql zzd(zzdof zzdofVar) {
        zzdql zzdqlVarZza = zzdofVar.zza();
        zzinh.zzb(zzdqlVarZza);
        return zzdqlVarZza;
    }

    public final zzdql zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
