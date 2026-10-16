package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class rzn {
    public static final ypf a = ols.R("CAR.PeriodicTask");
    private final Runnable b;
    private final ScheduledExecutorService c;
    private final long d;
    private final long e;
    private final TimeUnit f;
    private Future g = wub.X();

    public rzn(rzl rzlVar) {
        this.b = new rnq(rzlVar, 16);
        ScheduledExecutorService scheduledExecutorService = rzlVar.b;
        scheduledExecutorService.getClass();
        this.c = scheduledExecutorService;
        this.d = rzlVar.c;
        this.e = rzlVar.d;
        TimeUnit timeUnit = rzlVar.e;
        timeUnit.getClass();
        this.f = timeUnit;
    }

    public final synchronized void a() {
        woy.aa(this.g.isCancelled(), "Periodic task is already running");
        ScheduledExecutorService scheduledExecutorService = this.c;
        woy.aa(!scheduledExecutorService.isShutdown(), "Can't schedule periodic task: ExecutorService is shut down");
        this.g = scheduledExecutorService.scheduleAtFixedRate(this.b, this.d, this.e, this.f);
    }

    public final synchronized void b() {
        if (!this.c.isShutdown()) {
            woy.aa(this.g.cancel(false), "Failed to cancel the periodic task");
        } else {
            a.h().ai(8580).u("ExecutorService is shutdown.");
            this.g.cancel(false);
        }
    }
}
