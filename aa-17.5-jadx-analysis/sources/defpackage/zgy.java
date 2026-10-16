package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zgy extends zgv implements AutoCloseable, zgt {
    final ScheduledExecutorService a;

    public zgy(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.zey, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.l(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: f */
    public final zgr schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zhk zhkVar = new zhk(Executors.callable(runnable, null));
        return new zgw(zhkVar, this.a.schedule(zhkVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: g */
    public final zgr schedule(Callable callable, long j, TimeUnit timeUnit) {
        zhk zhkVar = new zhk(callable);
        return new zgw(zhkVar, this.a.schedule(zhkVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: h */
    public final zgr scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zgx zgxVar = new zgx(runnable);
        return new zgw(zgxVar, this.a.scheduleAtFixedRate(zgxVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: i */
    public final zgr scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zgx zgxVar = new zgx(runnable);
        return new zgw(zgxVar, this.a.scheduleWithFixedDelay(zgxVar, j, j2, timeUnit));
    }
}
