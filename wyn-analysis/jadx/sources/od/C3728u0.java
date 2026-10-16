package od;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: od.u0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3728u0 {
    public static final long k = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f42098a;

    /* renamed from: b, reason: collision with root package name */
    public final j.E f42099b;

    /* renamed from: c, reason: collision with root package name */
    public final ad.L f42100c;

    /* renamed from: d, reason: collision with root package name */
    public int f42101d;

    /* renamed from: e, reason: collision with root package name */
    public ScheduledFuture f42102e;

    /* renamed from: f, reason: collision with root package name */
    public ScheduledFuture f42103f;

    /* renamed from: g, reason: collision with root package name */
    public final RunnableC3731v0 f42104g;

    /* renamed from: h, reason: collision with root package name */
    public final RunnableC3731v0 f42105h;

    /* renamed from: i, reason: collision with root package name */
    public final long f42106i;

    /* renamed from: j, reason: collision with root package name */
    public final long f42107j;

    static {
        TimeUnit.MILLISECONDS.toNanos(10L);
    }

    public C3728u0(ad.L l10, ScheduledExecutorService scheduledExecutorService, long j8, long j10) {
        j.E e7 = new j.E(1);
        this.f42101d = 1;
        this.f42104g = new RunnableC3731v0(new RunnableC3722s0(this, 0));
        this.f42105h = new RunnableC3731v0(new RunnableC3722s0(this, 1));
        this.f42100c = l10;
        Fe.e.t(scheduledExecutorService, "scheduler");
        this.f42098a = scheduledExecutorService;
        this.f42099b = e7;
        this.f42106i = j8;
        this.f42107j = j10;
        e7.f38375b = false;
        e7.b();
    }

    public final synchronized void a() {
        try {
            j.E e7 = this.f42099b;
            e7.f38375b = false;
            e7.b();
            int i5 = this.f42101d;
            if (i5 == 2) {
                this.f42101d = 3;
            } else if (i5 == 4 || i5 == 5) {
                ScheduledFuture scheduledFuture = this.f42102e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f42101d == 5) {
                    this.f42101d = 1;
                } else {
                    this.f42101d = 2;
                    Fe.e.w("There should be no outstanding pingFuture", this.f42103f == null);
                    this.f42103f = this.f42098a.schedule(this.f42105h, this.f42106i, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            int i5 = this.f42101d;
            if (i5 == 1) {
                this.f42101d = 2;
                if (this.f42103f == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f42098a;
                    RunnableC3731v0 runnableC3731v0 = this.f42105h;
                    long j8 = this.f42106i;
                    j.E e7 = this.f42099b;
                    this.f42103f = scheduledExecutorService.schedule(runnableC3731v0, j8 - e7.a(), TimeUnit.NANOSECONDS);
                }
            } else if (i5 == 5) {
                this.f42101d = 4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
    }
}
