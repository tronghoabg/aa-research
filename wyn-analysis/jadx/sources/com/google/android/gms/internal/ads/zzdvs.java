package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdvs implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdvs(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdvs zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdvs(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdvr((zzdeg) this.zza.zzb(), ((zzcyr) this.zzb).zza());
    }
}
