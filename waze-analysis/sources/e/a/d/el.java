package e.a.d;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class el {

    /* renamed from: a, reason: collision with root package name */
    private static final long f46880a;

    /* renamed from: b, reason: collision with root package name */
    private static final long f46881b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f46882c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.d.b.ai f46883d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f46884e;

    /* renamed from: f, reason: collision with root package name */
    private ScheduledFuture f46885f;

    /* renamed from: g, reason: collision with root package name */
    private ScheduledFuture f46886g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f46887h;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f46888i;

    /* renamed from: j, reason: collision with root package name */
    private final long f46889j;

    /* renamed from: k, reason: collision with root package name */
    private final long f46890k;

    /* renamed from: l, reason: collision with root package name */
    private int f46891l;
    private final ka m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f46880a = 10000000000L;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        f46881b = 10000000L;
    }

    public el(ka kaVar, ScheduledExecutorService scheduledExecutorService, long j2, long j3, boolean z) {
        com.google.d.b.ai aiVarC = com.google.d.b.ai.c();
        this.f46891l = 1;
        this.f46887h = new em(new bi(this, 6));
        this.f46888i = new em(new bi(this, 7, (byte[]) null));
        this.m = kaVar;
        com.google.d.b.an.C(scheduledExecutorService, "scheduler");
        this.f46882c = scheduledExecutorService;
        this.f46883d = aiVarC;
        this.f46889j = j2;
        this.f46890k = j3;
        this.f46884e = z;
        aiVarC.d();
        aiVarC.e();
    }

    public static long c(long j2) {
        return Math.max(j2, f46880a);
    }

    public static long d(long j2) {
        return Math.max(j2, f46881b);
    }

    public final synchronized void k() {
        com.google.d.b.ai aiVar = this.f46883d;
        aiVar.d();
        aiVar.e();
        int i2 = this.f46891l;
        if (i2 == 2) {
            this.f46891l = 3;
            return;
        }
        if (i2 == 4 || i2 == 5) {
            ScheduledFuture scheduledFuture = this.f46885f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (this.f46891l == 5) {
                this.f46891l = 1;
                return;
            }
            this.f46891l = 2;
            com.google.d.b.an.v(this.f46886g == null, "There should be no outstanding pingFuture");
            this.f46886g = this.f46882c.schedule(this.f46888i, this.f46889j, TimeUnit.NANOSECONDS);
        }
    }

    public final synchronized void l() {
        int i2 = this.f46891l;
        if (i2 == 1) {
            this.f46891l = 2;
            if (this.f46886g == null) {
                this.f46886g = this.f46882c.schedule(this.f46888i, this.f46889j - this.f46883d.a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
            }
        } else if (i2 == 5) {
            this.f46891l = 4;
        }
    }

    public final synchronized void m() {
        if (!this.f46884e) {
            int i2 = this.f46891l;
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    this.f46891l = 5;
                    return;
                }
            }
            this.f46891l = 1;
        }
    }

    public final synchronized void n() {
        if (this.f46884e) {
            l();
        }
    }

    public final synchronized void o() {
        if (this.f46891l != 6) {
            this.f46891l = 6;
            ScheduledFuture scheduledFuture = this.f46885f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture scheduledFuture2 = this.f46886g;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.f46886g = null;
            }
        }
    }
}
