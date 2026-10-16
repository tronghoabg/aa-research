package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdyx implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdyx(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdyx zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzdyx(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdyw zzb() {
        return new zzdyw((zzbhw) this.zza.zzb(), ((zzind) this.zzb).zzb());
    }
}
