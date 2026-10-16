package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzelz implements zzimz {
    private final zzini zza;

    private zzelz(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzelz zzc(zzini zziniVar) {
        return new zzelz(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzely zzb() {
        return new zzely(((zzcnz) this.zza).zza());
    }
}
