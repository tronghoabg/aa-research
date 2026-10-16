package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzche implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzchi zzb;

    public zzche(zzchi zzchiVar, boolean z2) {
        this.zza = z2;
        Objects.requireNonNull(zzchiVar);
        this.zzb = zzchiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new String[]{"isVisible", String.valueOf(this.zza)});
    }
}
