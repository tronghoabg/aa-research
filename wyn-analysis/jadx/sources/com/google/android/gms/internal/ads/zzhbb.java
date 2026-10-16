package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes3.dex */
public abstract class zzhbb extends AbstractExecutorService implements zzhcp {
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzhde.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzhcp
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (p8.p) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzhcp
    public final p8.p zza(Runnable runnable) {
        return (p8.p) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzhcp
    public final p8.p zzb(Runnable runnable, Object obj) {
        return (p8.p) super.submit(runnable, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcp
    public final p8.p zzc(Callable callable) {
        return (p8.p) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzhde(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzhcp
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (p8.p) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzhcp
    public final /* synthetic */ Future submit(Callable callable) {
        return (p8.p) super.submit(callable);
    }
}
