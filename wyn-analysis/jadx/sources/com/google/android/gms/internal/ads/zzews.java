package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzews implements zzimz {
    private final zzini zza;

    private zzews(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar2;
    }

    public static zzews zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzews(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzewq zzb() {
        return new zzewq(zzfoi.zzc(), ((zzcnz) this.zza).zza());
    }
}
