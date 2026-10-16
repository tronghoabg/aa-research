package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzevx implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzevx(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
    }

    public static zzevx zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzevx(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevv(zzfoi.zzc(), ((zzdcq) this.zza).zza(), ((zzcos) this.zzb).zzb());
    }
}
