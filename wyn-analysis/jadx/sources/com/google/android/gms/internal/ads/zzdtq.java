package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdtq implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdtq(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
    }

    public static zzdtq zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzdtq(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdtp zzb() {
        return new zzdtp(zzfoi.zzc(), ((zzdtl) this.zza).zzb(), (zzdzo) this.zzb.zzb());
    }
}
