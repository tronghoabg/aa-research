package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzctt implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzctt(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzctt zza(zzini zziniVar, zzini zziniVar2) {
        return new zzctt(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcts(((zzcyr) this.zza).zza(), ((zzcos) this.zzb).zzb());
    }
}
