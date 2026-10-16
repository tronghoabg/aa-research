package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfbo implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzfbo(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar;
        this.zzb = zziniVar3;
        this.zzc = zziniVar4;
    }

    public static zzfbo zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzfbo(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfbm zzb() {
        return new zzfbm(((zzcnz) this.zza).zza(), zzfoi.zzc(), ((zzdcq) this.zzb).zza(), ((zzcop) this.zzc).zza());
    }
}
