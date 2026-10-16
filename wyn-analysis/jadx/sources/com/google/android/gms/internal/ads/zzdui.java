package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdui implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzdui(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzdui zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdui(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzduh((zzdpw) this.zza.zzb(), ((zzdqt) this.zzb).zza());
    }
}
