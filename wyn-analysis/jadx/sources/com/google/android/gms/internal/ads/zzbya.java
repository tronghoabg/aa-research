package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbya implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbyb zzb;

    public zzbya(zzbyb zzbybVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        Objects.requireNonNull(zzbybVar);
        this.zzb = zzbybVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Xd.c cVar = C6.n.f1857D.f1862b;
        Xd.c.t(this.zzb.zza(), this.zza, true, null);
    }
}
