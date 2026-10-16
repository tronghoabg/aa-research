package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzejq implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzejq(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzejq zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzejq(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzejp zzb() {
        return new zzejp(((zzeji) this.zza).zzb(), ((zzcnt) this.zzb).zzb());
    }
}
