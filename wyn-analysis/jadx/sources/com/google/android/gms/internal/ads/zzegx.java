package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzegx implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzegx(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar3;
    }

    public static zzegx zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzegx(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzegw zzb() {
        return new zzegw(((zzing) this.zza).zzd(), zzfoi.zzc(), ((zzdge) this.zzb).zzb());
    }
}
