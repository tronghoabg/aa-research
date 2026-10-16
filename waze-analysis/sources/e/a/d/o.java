package e.a.d;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o implements ja {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f47285a = Logger.getLogger(o.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f47286b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a.el f47287c;

    /* renamed from: d, reason: collision with root package name */
    private e.a.ek f47288d;

    /* renamed from: e, reason: collision with root package name */
    private cq f47289e;

    o(ScheduledExecutorService scheduledExecutorService, e.a.el elVar) {
        this.f47286b = scheduledExecutorService;
        this.f47287c = elVar;
    }

    public static /* synthetic */ void a(o oVar) {
        e.a.ek ekVar = oVar.f47288d;
        if (ekVar != null && ekVar.b()) {
            ekVar.a();
        }
        oVar.f47289e = null;
    }

    @Override // e.a.d.ja
    public final void b() {
        e.a.el elVar = this.f47287c;
        elVar.d();
        elVar.execute(new Runnable() { // from class: e.a.d.n
            @Override // java.lang.Runnable
            public final void run() {
                o.a(this.f47284a);
            }
        });
    }

    @Override // e.a.d.ja
    public final void c(Runnable runnable) {
        e.a.el elVar = this.f47287c;
        elVar.d();
        if (this.f47289e == null) {
            this.f47289e = new cq();
        }
        e.a.ek ekVar = this.f47288d;
        if (ekVar == null || !ekVar.b()) {
            long jA = this.f47289e.a();
            this.f47288d = elVar.a(runnable, jA, TimeUnit.NANOSECONDS, this.f47286b);
            f47285a.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
        }
    }
}
