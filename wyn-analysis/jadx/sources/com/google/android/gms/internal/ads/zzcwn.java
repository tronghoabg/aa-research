package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcwn implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcwn(zzcvz zzcvzVar, zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzcwn zzc(zzcvz zzcvzVar, zzini zziniVar, zzini zziniVar2) {
        return new zzcwn(zzcvzVar, zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzced zzb() {
        return new zzced(((zzcnz) this.zza).zza(), ((zzdcq) this.zzb).zza().zzg);
    }
}
