package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
abstract class zzhbs extends zzhcm {
    private final Executor zza;
    final /* synthetic */ zzhbt zzb;

    public zzhbs(zzhbt zzhbtVar, Executor executor) {
        Objects.requireNonNull(zzhbtVar);
        this.zzb = zzhbtVar;
        executor.getClass();
        this.zza = executor;
    }

    public abstract void zzb(Object obj);

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final boolean zzd() {
        return this.zzb.isDone();
    }

    public final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e7) {
            this.zzb.zzb(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final void zzf(Object obj) {
        this.zzb.zzD(null);
        zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final void zzg(Throwable th) {
        zzhbt zzhbtVar = this.zzb;
        zzhbtVar.zzD(null);
        if (th instanceof ExecutionException) {
            zzhbtVar.zzb(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            zzhbtVar.cancel(false);
        } else {
            zzhbtVar.zzb(th);
        }
    }
}
