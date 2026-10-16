package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzasw implements Runnable {
    final /* synthetic */ zzatl zza;
    final /* synthetic */ zzasx zzb;

    public zzasw(zzasx zzasxVar, zzatl zzatlVar) {
        this.zza = zzatlVar;
        Objects.requireNonNull(zzasxVar);
        this.zzb = zzasxVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.zzb.zzb().put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
