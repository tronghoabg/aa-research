package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzejy implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzejy(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzejy zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzejy(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzejx zzb() {
        return new zzejx((zzejl) this.zza.zzb(), ((zzejq) this.zzb).zzb());
    }
}
