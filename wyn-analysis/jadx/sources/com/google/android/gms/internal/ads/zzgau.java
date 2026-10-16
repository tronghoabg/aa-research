package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zzgau implements zzgat {
    private zzgau() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgat
    public final ExecutorService zza(int i5) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzgav(null)));
    }

    @Override // com.google.android.gms.internal.ads.zzgat
    public final ExecutorService zzb(int i5, ThreadFactory threadFactory, int i10) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i5, i5, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.zzgat
    public final ExecutorService zzc(int i5) {
        return zzb(1, new zzgav(null), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzgat
    public final ExecutorService zzd(ThreadFactory threadFactory, int i5) {
        return zzb(1, threadFactory, 1);
    }

    public /* synthetic */ zzgau(byte[] bArr) {
    }
}
