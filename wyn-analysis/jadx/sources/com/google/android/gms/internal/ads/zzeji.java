package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzeji implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeji(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzeji zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzeji(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzejh zzb() {
        return new zzejh(((zzeje) this.zza).zzb(), (zzhcp) this.zzb.zzb());
    }
}
