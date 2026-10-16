package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdyw implements zzfpt {
    private final Map zza;
    private final zzbhw zzb;

    public zzdyw(zzbhw zzbhwVar, Map map) {
        this.zza = map;
        this.zzb = zzbhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdL(zzfpm zzfpmVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdM(zzfpm zzfpmVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfpmVar)) {
            this.zzb.zzc(((zzdyv) map.get(zzfpmVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdN(zzfpm zzfpmVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfpmVar)) {
            this.zzb.zzc(((zzdyv) map.get(zzfpmVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdO(zzfpm zzfpmVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfpmVar)) {
            this.zzb.zzc(((zzdyv) map.get(zzfpmVar)).zzb);
        }
    }
}
