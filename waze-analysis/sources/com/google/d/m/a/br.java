package com.google.d.m.a;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class br extends t implements AutoCloseable, bo {

    /* renamed from: a, reason: collision with root package name */
    final ScheduledExecutorService f8034a;

    br(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        com.google.d.b.an.B(scheduledExecutorService);
        this.f8034a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final aw schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.f8034a;
        cd cdVarF = cd.f(runnable, null);
        return new aw(cdVarF, scheduledExecutorService.schedule(cdVarF, j2, timeUnit));
    }

    @Override // com.google.d.m.a.t, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.a.f(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aw schedule(Callable callable, long j2, TimeUnit timeUnit) {
        cd cdVar = new cd(callable);
        return new aw(cdVar, this.f8034a.schedule(cdVar, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        bq bqVar = new bq(runnable);
        return new aw(bqVar, this.f8034a.scheduleAtFixedRate(bqVar, j2, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        bq bqVar = new bq(runnable);
        return new aw(bqVar, this.f8034a.scheduleWithFixedDelay(bqVar, j2, j3, timeUnit));
    }
}
