package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzepo implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzepo(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzepo zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzepo(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzepn zzb() {
        return new zzepn((zzflz) this.zza.zzb(), (zzdxh) this.zzb.zzb(), (zzdzt) this.zzc.zzb());
    }
}
