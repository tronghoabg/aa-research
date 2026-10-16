package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcrz implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcrz(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzcrz zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzcrz(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcry zzb() {
        return new zzcry(((zzind) this.zza).zzb(), ((zzind) this.zzb).zzb());
    }
}
