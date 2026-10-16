package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfdi implements zzimz {
    private final zzini zza;

    private zzfdi(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar2;
    }

    public static zzfdi zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzfdi(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfdh zzb() {
        return new zzfdh(zzfoi.zzc(), ((zzcnz) this.zza).zza());
    }
}
