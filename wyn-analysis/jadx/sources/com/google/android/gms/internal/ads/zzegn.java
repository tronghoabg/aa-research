package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzegn implements zzimz {
    private final zzini zza;

    private zzegn(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzegn zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzegn(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzegm zzb() {
        return new zzegm(((zzcnz) this.zza).zza(), zzfoi.zzc());
    }
}
