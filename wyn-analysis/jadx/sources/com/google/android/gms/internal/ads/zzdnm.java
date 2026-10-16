package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdnm implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdnm(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdnm zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdnm(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdnl((zzdfk) this.zza.zzb(), (zzdks) this.zzb.zzb());
    }
}
