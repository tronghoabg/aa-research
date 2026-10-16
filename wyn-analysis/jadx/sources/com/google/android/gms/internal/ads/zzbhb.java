package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbhb implements zzbfr {
    final /* synthetic */ zzbhe zza;

    public zzbhb(zzbhe zzbheVar) {
        Objects.requireNonNull(zzbheVar);
        this.zza = zzbheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final void zza(boolean z2) {
        if (z2) {
            this.zza.zzf();
        } else {
            this.zza.zzg();
        }
    }
}
