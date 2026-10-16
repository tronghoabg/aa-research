package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzewo implements zzimz {
    private final zzini zza;

    private zzewo(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzewo zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzewo(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzewm zzb() {
        return new zzewm(((zzcop) this.zza).zza(), zzfoi.zzc());
    }
}
