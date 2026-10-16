package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzeeo implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeeo(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzeeo zza(zzini zziniVar, zzini zziniVar2) {
        return new zzeeo(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeen(((zzcnz) this.zza).zza(), (zzdzt) this.zzb.zzb());
    }
}
