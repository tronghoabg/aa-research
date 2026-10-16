package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdll implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdll(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdll zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdll(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlk(((zzcyr) this.zza).zza(), (zzfsm) this.zzb.zzb());
    }
}
