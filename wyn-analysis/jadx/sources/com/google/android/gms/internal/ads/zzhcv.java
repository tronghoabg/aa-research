package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zzhcv extends zzhcr implements zzhcq {
    final ScheduledExecutorService zza;

    public zzhcv(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzhcq, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzhco schedule(Runnable runnable, long j8, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzhde zzhdeVarZze = zzhde.zze(runnable, null);
        return new zzhct(zzhdeVarZze, scheduledExecutorService.schedule(zzhdeVarZze, j8, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhcq, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzhco schedule(Callable callable, long j8, TimeUnit timeUnit) {
        zzhde zzhdeVar = new zzhde(callable);
        return new zzhct(zzhdeVar, this.zza.schedule(zzhdeVar, j8, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhcq, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzhco scheduleAtFixedRate(Runnable runnable, long j8, long j10, TimeUnit timeUnit) {
        zzhcu zzhcuVar = new zzhcu(runnable);
        return new zzhct(zzhcuVar, this.zza.scheduleAtFixedRate(zzhcuVar, j8, j10, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhcq, java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzhco scheduleWithFixedDelay(Runnable runnable, long j8, long j10, TimeUnit timeUnit) {
        zzhcu zzhcuVar = new zzhcu(runnable);
        return new zzhct(zzhcuVar, this.zza.scheduleWithFixedDelay(zzhcuVar, j8, j10, timeUnit));
    }
}
