package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfvm implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzfvn zzb;

    public zzfvm(zzfvn zzfvnVar, float f10) {
        this.zza = f10;
        Objects.requireNonNull(zzfvnVar);
        this.zzb = zzfvnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
