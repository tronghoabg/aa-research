package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfay implements zzimz {
    private final zzini zza;

    private zzfay(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar2;
    }

    public static zzfay zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzfay(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfaw zzb() {
        return new zzfaw(zzfoi.zzc(), ((zzcnz) this.zza).zza());
    }
}
