package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zzack implements zzacl {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzdu zzb;

    public zzack(Executor executor, zzdu zzduVar) {
        this.zza = executor;
        this.zzb = zzduVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
