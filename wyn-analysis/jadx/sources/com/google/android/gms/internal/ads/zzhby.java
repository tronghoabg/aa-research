package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
final class zzhby extends zzhbx {
    private final p8.p zza;

    public zzhby(p8.p pVar) {
        pVar.getClass();
        this.zza = pVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhay, com.google.android.gms.internal.ads.zzhaz, p8.p
    public final void addListener(Runnable runnable, Executor executor) {
        this.zza.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhay, java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        return this.zza.cancel(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzhay, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzhay, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzhay, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhay, java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zza.get(j8, timeUnit);
    }
}
