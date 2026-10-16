package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzeuv implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeuv(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
    }

    public static zzeuv zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzeuv(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeut zzb() {
        return new zzeut(zzfoi.zzc(), ((zzdcq) this.zza).zza(), (zzflw) this.zzb.zzb());
    }
}
