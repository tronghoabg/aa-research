package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdnc implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdnc(zzdml zzdmlVar, zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdnc zzc(zzdml zzdmlVar, zzini zziniVar, zzini zziniVar2) {
        return new zzdnc(zzdmlVar, zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzced zzb() {
        return new zzced(((zzcnz) this.zza).zza(), ((zzdcq) this.zzb).zza().zzg);
    }
}
