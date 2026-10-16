package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdxb implements zzimz {
    private final zzini zza;

    private zzdxb(zzdxa zzdxaVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdxb zza(zzdxa zzdxaVar, zzini zziniVar) {
        return new zzdxb(zzdxaVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky(((zzdwz) this.zza).zzb(), zzcfy.zzf);
    }
}
