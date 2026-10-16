package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbsx implements zzbpx {
    final /* synthetic */ zzbte zza;
    private final zzbpx zzb;

    public zzbsx(zzbte zzbteVar, zzbpx zzbpxVar) {
        Objects.requireNonNull(zzbteVar);
        this.zza = zzbteVar;
        this.zzb = zzbpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        this.zzb.zza(this.zza, map);
    }

    public final /* synthetic */ zzbpx zzb() {
        return this.zzb;
    }
}
