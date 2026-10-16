package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzezy implements zzimz {
    private final zzini zza;

    private zzezy(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar2;
    }

    public static zzezy zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzezy(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzezw zzb() {
        return new zzezw(zzfoi.zzc(), ((zzdcq) this.zza).zza());
    }
}
