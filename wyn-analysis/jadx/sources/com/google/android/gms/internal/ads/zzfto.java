package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfto implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzfto(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzfto zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzfto(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzftn zzb() {
        return new zzftn((zzdzt) this.zza.zzb(), ((zzcnz) this.zzb).zza());
    }
}
