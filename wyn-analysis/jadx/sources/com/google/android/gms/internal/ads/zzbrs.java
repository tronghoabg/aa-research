package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbrs implements Runnable {
    final /* synthetic */ zzbrv zza;

    public zzbrs(zzbrv zzbrvVar) {
        Objects.requireNonNull(zzbrvVar);
        this.zza = zzbrvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
