package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfaj implements zzimz {
    private final zzini zza;

    private zzfaj(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar2;
    }

    public static zzfaj zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzfaj(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfah zzb() {
        return new zzfah(zzfoi.zzc(), (zzecz) this.zza.zzb());
    }
}
