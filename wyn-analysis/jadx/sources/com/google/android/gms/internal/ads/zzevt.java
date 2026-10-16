package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzevt implements zzimz {
    private final zzini zza;

    private zzevt(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar2;
    }

    public static zzevt zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzevt(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzevr zzb() {
        return new zzevr(zzfoi.zzc(), ((zzcnz) this.zza).zza());
    }
}
