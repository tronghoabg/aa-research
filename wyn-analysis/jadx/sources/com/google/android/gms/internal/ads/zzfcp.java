package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfcp implements zzimz {
    private final zzini zza;

    private zzfcp(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar2;
    }

    public static zzfcp zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzfcp(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfco zzb() {
        return new zzfco(zzfoi.zzc(), ((zzcnz) this.zza).zza());
    }
}
