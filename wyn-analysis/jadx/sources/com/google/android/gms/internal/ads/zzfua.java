package com.google.android.gms.internal.ads;

import D6.H0;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfua implements Runnable {
    final /* synthetic */ H0 zza;
    final /* synthetic */ zzful zzb;

    public zzfua(zzful zzfulVar, H0 h02) {
        this.zza = h02;
        Objects.requireNonNull(zzfulVar);
        this.zzb = zzfulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK(this.zza);
    }
}
