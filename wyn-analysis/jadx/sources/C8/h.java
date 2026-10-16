package C8;

import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final f f1933a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f1934b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f1935c;

    /* renamed from: d, reason: collision with root package name */
    public volatile ScheduledFuture f1936d;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f1937e;

    public h(f fVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        AbstractC1732v.i(fVar);
        this.f1933a = fVar;
        this.f1934b = executor;
        this.f1935c = scheduledExecutorService;
        this.f1937e = -1L;
    }

    public final void a() {
        if (this.f1936d == null || this.f1936d.isDone()) {
            return;
        }
        this.f1936d.cancel(false);
    }

    public final void b(long j8) {
        a();
        this.f1937e = -1L;
        this.f1936d = this.f1935c.schedule(new g(this, 0), Math.max(0L, j8), TimeUnit.MILLISECONDS);
    }
}
