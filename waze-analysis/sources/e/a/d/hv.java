package e.a.d;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hv {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f47119a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f47120b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f47121c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.d.b.ai f47122d;

    /* renamed from: e, reason: collision with root package name */
    private long f47123e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f47124f;

    /* renamed from: g, reason: collision with root package name */
    private ScheduledFuture f47125g;

    hv(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, com.google.d.b.ai aiVar) {
        this.f47121c = runnable;
        this.f47120b = executor;
        this.f47119a = scheduledExecutorService;
        this.f47122d = aiVar;
        aiVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long k() {
        return this.f47122d.a(TimeUnit.NANOSECONDS);
    }

    final void g(boolean z) {
        ScheduledFuture scheduledFuture;
        this.f47124f = false;
        if (!z || (scheduledFuture = this.f47125g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f47125g = null;
    }

    final void h(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        long jK = k() + nanos;
        this.f47124f = true;
        if (jK - this.f47123e < 0 || this.f47125g == null) {
            ScheduledFuture scheduledFuture = this.f47125g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f47125g = this.f47119a.schedule(new hu(this), nanos, TimeUnit.NANOSECONDS);
        }
        this.f47123e = jK;
    }
}
