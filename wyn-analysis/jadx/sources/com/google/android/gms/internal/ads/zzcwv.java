package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcwv implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzcwv(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzcwv zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzcwv(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcwu zzb() {
        return new zzcwu(((zzcwq) this.zza).zza(), (zzdzt) this.zzb.zzb(), ((zzcyr) this.zzc).zza());
    }
}
