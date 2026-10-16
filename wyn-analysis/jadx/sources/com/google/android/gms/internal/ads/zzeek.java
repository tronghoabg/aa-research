package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzeek implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeek(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzeek zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzeek(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeej(((zzcnz) this.zza).zza(), ((zzcop) this.zzb).zza(), zzfoi.zzc());
    }
}
