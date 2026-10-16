package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbhm extends zzcgd {
    final /* synthetic */ zzbhs zza;

    public zzbhm(zzbhs zzbhsVar) {
        Objects.requireNonNull(zzbhsVar);
        this.zza = zzbhsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgd, java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        this.zza.zzb();
        return super.cancel(z2);
    }
}
