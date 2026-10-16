package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzewb implements zzimz {
    private final zzini zza;

    private zzewb(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar2;
    }

    public static zzewb zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzewb(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzevz zzb() {
        return new zzevz(zzfoi.zzc(), (zzcfk) this.zza.zzb());
    }
}
