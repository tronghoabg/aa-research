package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfls implements zzhcc {
    final /* synthetic */ zzflt zza;
    final /* synthetic */ int zzb;

    public zzfls(zzflt zzfltVar, int i5) {
        this.zzb = i5;
        Objects.requireNonNull(zzfltVar);
        this.zza = zzfltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        C6.n.f1857D.f1868h.zzh(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzc((String) obj, this.zzb, null);
    }
}
