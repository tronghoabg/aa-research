package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzeuk implements zzimz {
    private final zzini zza;

    private zzeuk(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzeuk zzc(zzini zziniVar) {
        return new zzeuk(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeui zzb() {
        return new zzeui(((zzcnz) this.zza).zza());
    }
}
