package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdmz implements zzimz {
    private final zzdml zza;
    private final zzini zzb;

    private zzdmz(zzdml zzdmlVar, zzini zziniVar) {
        this.zza = zzdmlVar;
        this.zzb = zziniVar;
    }

    public static zzdmz zza(zzdml zzdmlVar, zzini zziniVar) {
        return new zzdmz(zzdmlVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZze = this.zza.zze((zzdbs) this.zzb.zzb());
        zzinh.zzb(setZze);
        return setZze;
    }
}
