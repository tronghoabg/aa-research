package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzeqw implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeqw(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzeqw zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzeqw(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeqv zzb() {
        return new zzeqv((zzerz) this.zza.zzb(), (zzdxk) this.zzb.zzb());
    }
}
