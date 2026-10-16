package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzdve implements zzbpx {
    final /* synthetic */ zzdvf zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbpx zzd;

    public /* synthetic */ zzdve(zzdvf zzdvfVar, WeakReference weakReference, String str, zzbpx zzbpxVar, byte[] bArr) {
        Objects.requireNonNull(zzdvfVar);
        this.zza = zzdvfVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zze(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
