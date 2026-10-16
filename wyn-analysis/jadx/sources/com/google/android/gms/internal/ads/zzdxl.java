package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdxl implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdxl(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdxl zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdxl(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdxk(((zzcrj) this.zza).zzb(), (zzdxh) this.zzb.zzb());
    }
}
