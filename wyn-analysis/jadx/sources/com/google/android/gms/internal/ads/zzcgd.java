package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class zzcgd implements p8.p {
    private final zzhcy zza = zzhcy.zze();

    @Override // p8.p
    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        return this.zza.cancel(z2);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.zza.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    public void zza(Object obj) {
        zzc(obj);
    }

    public final boolean zzc(Object obj) {
        boolean zZza = this.zza.zza(obj);
        zza(zZza);
        return zZza;
    }

    public final boolean zzd(Throwable th) {
        boolean zZzb = this.zza.zzb(th);
        zza(zZzb);
        return zZzb;
    }

    private static final boolean zza(boolean z2) {
        if (!z2) {
            C6.n.f1857D.f1868h.zzi(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z2;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zza.get(j8, timeUnit);
    }
}
