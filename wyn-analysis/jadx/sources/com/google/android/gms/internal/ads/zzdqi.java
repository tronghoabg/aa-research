package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdqi implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdqi(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdqi zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdqi(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdqf(((zzcyr) this.zza).zza(), ((zzdoz) this.zzb).zza());
    }
}
