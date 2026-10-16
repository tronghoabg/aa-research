package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdsw implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzdsw(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
        this.zzc = zziniVar4;
    }

    public static zzdsw zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzdsw(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdsv zzb() {
        return new zzdsv(zzfoi.zzc(), ((zzdtl) this.zza).zzb(), ((zzdtq) this.zzb).zzb(), (zzdzo) this.zzc.zzb());
    }
}
