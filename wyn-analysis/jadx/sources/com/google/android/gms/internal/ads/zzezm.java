package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzezm implements zzimz {
    private final zzini zza;

    private zzezm(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzezm zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzezm(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzezl zzb() {
        return new zzezl(((zzcnz) this.zza).zza(), zzfoi.zzc());
    }
}
