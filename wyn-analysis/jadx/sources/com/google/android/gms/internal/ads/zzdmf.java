package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdmf implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdmf(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdmf zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdmf(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdme((zzdxc) this.zza.zzb(), ((zzcyt) this.zzb).zza());
    }
}
