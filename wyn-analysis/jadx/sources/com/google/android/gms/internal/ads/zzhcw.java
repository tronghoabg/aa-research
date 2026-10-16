package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzhcw {
    public static Executor zza() {
        return zzhbu.INSTANCE;
    }

    public static zzhcp zzb(ExecutorService executorService) {
        return executorService instanceof zzhcp ? (zzhcp) executorService : executorService instanceof ScheduledExecutorService ? new zzhcv((ScheduledExecutorService) executorService) : new zzhcr(executorService);
    }

    public static zzhcq zzc(ScheduledExecutorService scheduledExecutorService) {
        return new zzhcv(scheduledExecutorService);
    }

    public static Executor zzd(final Executor executor, final zzhay zzhayVar) {
        executor.getClass();
        return executor == zzhbu.INSTANCE ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.zzhcs
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzhcw.zzf(executor, zzhayVar, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzf(Executor executor, zzhay zzhayVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e7) {
            zzhayVar.zzb(e7);
        }
    }
}
