package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzehm implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzehm(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
    }

    public static zzehm zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzehm(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehl zzb() {
        return new zzehl(zzfoi.zzc(), ((zzegr) this.zza).zzb(), zzimy.zzc(this.zzb));
    }
}
