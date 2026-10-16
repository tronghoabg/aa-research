package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jfp {
    public static final yph a = yph.c("CAR.PeriodicTask");
    private final Runnable b;
    private final ScheduledExecutorService c;
    private final long d;
    private final long e;
    private final TimeUnit f;
    private Future g;

    public jfp(jfn jfnVar) {
        zgk zgkVar = zgk.a;
        this.g = zgkVar == null ? new zgk() : zgkVar;
        this.b = new imt(jfnVar, 19, null);
        ScheduledExecutorService scheduledExecutorService = jfnVar.b;
        scheduledExecutorService.getClass();
        this.c = scheduledExecutorService;
        this.d = jfnVar.c;
        this.e = jfnVar.d;
        TimeUnit timeUnit = jfnVar.e;
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
            ((ype) ((ype) a.h()).ai((char) 2001)).u("ExecutorService is shutdown.");
            this.g.cancel(false);
        }
    }
}
