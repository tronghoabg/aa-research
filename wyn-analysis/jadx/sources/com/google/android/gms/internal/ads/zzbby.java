package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbby implements Runnable {
    final /* synthetic */ zzbbz zza;

    public zzbby(zzbbz zzbbzVar) {
        Objects.requireNonNull(zzbbzVar);
        this.zza = zzbbzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbix.zza(this.zza.zza);
    }
}
