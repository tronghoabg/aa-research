package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzdss implements zzhcc {
    final /* synthetic */ zzdzc zza;
    final /* synthetic */ zzdsv zzb;

    public zzdss(zzdsv zzdsvVar, zzdzc zzdzcVar) {
        this.zza = zzdzcVar;
        Objects.requireNonNull(zzdsvVar);
        this.zzb = zzdsvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        String strZza = this.zza.zza();
        C6.n.f1857D.k.getClass();
        this.zzb.zzd().zzf(strZza, System.currentTimeMillis());
    }
}
