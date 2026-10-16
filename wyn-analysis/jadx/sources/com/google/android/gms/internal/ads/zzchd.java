package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzchd implements Runnable {
    final /* synthetic */ zzchi zza;

    public zzchd(zzchi zzchiVar) {
        Objects.requireNonNull(zzchiVar);
        this.zza = zzchiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceDestroyed", new String[0]);
    }
}
