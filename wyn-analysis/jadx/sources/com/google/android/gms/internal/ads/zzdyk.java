package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdyk implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdyk(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdyk zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdyk(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdyj((zzbhw) this.zza.zzb(), (zzfii) this.zzb.zzb());
    }
}
