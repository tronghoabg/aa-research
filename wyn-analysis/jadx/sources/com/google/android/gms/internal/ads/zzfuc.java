package com.google.android.gms.internal.ads;

import D6.K0;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfuc implements Runnable {
    final /* synthetic */ K0 zza;
    final /* synthetic */ zzful zzb;

    public zzfuc(zzful zzfulVar, K0 k02) {
        this.zza = k02;
        Objects.requireNonNull(zzfulVar);
        this.zzb = zzfulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzJ(this.zza);
    }
}
