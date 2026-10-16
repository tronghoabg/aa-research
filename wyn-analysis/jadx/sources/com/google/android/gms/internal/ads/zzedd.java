package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzedd implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzedd(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzedd zza(zzini zziniVar, zzini zziniVar2) {
        return new zzedd(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzedk(((zzcnz) this.zza).zza(), ((zzcop) this.zzb).zza());
    }
}
