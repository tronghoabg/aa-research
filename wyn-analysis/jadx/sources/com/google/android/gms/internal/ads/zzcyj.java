package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzcyj implements zzhcc {
    final /* synthetic */ zzhcc zza;
    final /* synthetic */ zzcyp zzb;

    public zzcyj(zzcyp zzcypVar, zzhcc zzhccVar) {
        this.zza = zzhccVar;
        Objects.requireNonNull(zzcypVar);
        this.zzb = zzcypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        this.zza.zza(th);
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zze(((zzcyi) obj).zza, this.zza);
    }
}
