package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbbw implements Runnable {
    final /* synthetic */ zzbbz zza;

    public zzbbw(zzbbz zzbbzVar) {
        Objects.requireNonNull(zzbbzVar);
        this.zza = zzbbzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzr();
    }
}
