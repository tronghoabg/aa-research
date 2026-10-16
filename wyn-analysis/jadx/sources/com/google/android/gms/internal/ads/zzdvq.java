package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdvq implements zzimz {
    private final zzini zza;

    private zzdvq(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdvq zzc(zzini zziniVar) {
        return new zzdvq(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdvp zzb() {
        return new zzdvp(((zzdqt) this.zza).zza());
    }
}
