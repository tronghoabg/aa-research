package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdck implements zzimz {
    private final zzdcj zza;
    private final zzini zzb;

    private zzdck(zzdcj zzdcjVar, zzini zziniVar) {
        this.zza = zzdcjVar;
        this.zzb = zziniVar;
    }

    public static zzdck zza(zzdcj zzdcjVar, zzini zziniVar) {
        return new zzdck(zzdcjVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return this.zza.zzg((String) this.zzb.zzb());
    }
}
