package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdco implements zzimz {
    private final zzini zza;

    private zzdco(zzdcj zzdcjVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdco zzc(zzdcj zzdcjVar, zzini zziniVar) {
        return new zzdco(zzdcjVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String strZzp = ((zzczq) this.zza.zzb()).zzp();
        zzinh.zzb(strZzp);
        return strZzp;
    }
}
