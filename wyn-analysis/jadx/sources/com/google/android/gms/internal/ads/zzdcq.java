package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdcq implements zzimz {
    private final zzdcj zza;

    private zzdcq(zzdcj zzdcjVar) {
        this.zza = zzdcjVar;
    }

    public static zzdcq zzc(zzdcj zzdcjVar) {
        return new zzdcq(zzdcjVar);
    }

    public static zzflg zzd(zzdcj zzdcjVar) {
        zzflg zzflgVarZzb = zzdcjVar.zzb();
        zzinh.zzb(zzflgVarZzb);
        return zzflgVarZzb;
    }

    public final zzflg zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
