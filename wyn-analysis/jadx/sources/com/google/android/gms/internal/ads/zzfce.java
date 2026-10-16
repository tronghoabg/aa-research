package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfce implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzfce(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar3;
    }

    public static zzfce zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzfce(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfcc zzb() {
        return new zzfcc((zzceg) this.zza.zzb(), zzfoi.zzc(), ((zzcnz) this.zzb).zza());
    }
}
