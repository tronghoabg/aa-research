package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzchc implements Runnable {
    final /* synthetic */ zzchi zza;

    public zzchc(zzchi zzchiVar) {
        Objects.requireNonNull(zzchiVar);
        this.zza = zzchiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceCreated", new String[0]);
    }
}
