package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdpk implements zzimz {
    private final zzini zza;

    private zzdpk(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdpk zzc(zzini zziniVar) {
        return new zzdpk(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdpj zzb() {
        return new zzdpj(((zzdqt) this.zza).zza());
    }
}
