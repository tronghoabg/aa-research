package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfbc implements zzimz {
    private final zzini zza;

    private zzfbc(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar2;
    }

    public static zzfbc zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzfbc(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfba zzb() {
        return new zzfba(zzfoi.zzc(), (zzeaw) this.zza.zzb());
    }
}
