package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzduw implements zzhcc {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbpx zzb;

    public zzduw(zzdvf zzdvfVar, String str, zzbpx zzbpxVar) {
        this.zza = str;
        this.zzb = zzbpxVar;
        Objects.requireNonNull(zzdvfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzclb) obj).zzac(this.zza, this.zzb);
    }
}
