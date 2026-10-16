package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzedr implements zzhcc {
    final /* synthetic */ zzedw zza;

    public zzedr(zzedw zzedwVar) {
        Objects.requireNonNull(zzedwVar);
        this.zza = zzedwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzecn) obj).zze();
        this.zza.zzi().zzn();
    }
}
