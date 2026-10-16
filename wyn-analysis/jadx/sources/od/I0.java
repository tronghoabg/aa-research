package od;

import A7.C0237b0;
import A7.RunnableC0299w0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import md.AbstractC3537e;
import md.AbstractC3538f;
import md.AbstractC3541i;
import md.C3535c;
import md.C3549q;

/* loaded from: classes5.dex */
public final class I0 extends AbstractC3538f {

    /* renamed from: o, reason: collision with root package name */
    public static final C f41588o;

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f41589a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f41590b;

    /* renamed from: c, reason: collision with root package name */
    public final C3549q f41591c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f41592d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC3537e f41593e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC3538f f41594f;

    /* renamed from: g, reason: collision with root package name */
    public md.k0 f41595g;

    /* renamed from: h, reason: collision with root package name */
    public List f41596h;

    /* renamed from: i, reason: collision with root package name */
    public E f41597i;

    /* renamed from: j, reason: collision with root package name */
    public final C3549q f41598j;
    public final F6.r k;

    /* renamed from: l, reason: collision with root package name */
    public final C3535c f41599l;

    /* renamed from: m, reason: collision with root package name */
    public final long f41600m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J0 f41601n;

    static {
        Logger.getLogger(I0.class.getName());
        f41588o = new C(0);
    }

    public I0(J0 j02, C3549q c3549q, F6.r rVar, C3535c c3535c) {
        ScheduledFuture<?> scheduledFutureSchedule;
        int i5 = 0;
        this.f41601n = j02;
        M0 m02 = j02.f41613d;
        Logger logger = M0.f41645d0;
        m02.getClass();
        Executor executor = c3535c.f40621b;
        executor = executor == null ? m02.f41688h : executor;
        M0 m03 = j02.f41613d;
        K0 k02 = m03.f41687g;
        this.f41596h = new ArrayList();
        Fe.e.t(executor, "callExecutor");
        this.f41590b = executor;
        Fe.e.t(k02, "scheduler");
        C3549q c3549qB = C3549q.b();
        this.f41591c = c3549qB;
        c3549qB.getClass();
        md.r rVar2 = c3535c.f40620a;
        if (rVar2 == null) {
            scheduledFutureSchedule = null;
        } else {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jB = rVar2.b();
            long jAbs = Math.abs(jB);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit2.toNanos(1L);
            long jAbs2 = Math.abs(jB) % timeUnit2.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            if (jB < 0) {
                sb2.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb2.append("Deadline CallOptions will be exceeded in ");
            }
            sb2.append(nanos);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb2.append("s. ");
            scheduledFutureSchedule = k02.f41618a.schedule(new RunnableC3666A(i5, this, sb2), jB, timeUnit);
        }
        this.f41589a = scheduledFutureSchedule;
        this.f41598j = c3549q;
        this.k = rVar;
        this.f41599l = c3535c;
        m03.f41676Y.getClass();
        this.f41600m = System.nanoTime();
    }

    @Override // md.AbstractC3538f
    public final void a(String str, Throwable th) {
        md.k0 k0Var = md.k0.f40675f;
        md.k0 k0VarH = str != null ? k0Var.h(str) : k0Var.h("Call cancelled without message");
        if (th != null) {
            k0VarH = k0VarH.g(th);
        }
        f(k0VarH, false);
    }

    @Override // md.AbstractC3538f
    public final void b() {
        g(new RunnableC3667B(this, 0));
    }

    @Override // md.AbstractC3538f
    public final void c(int i5) {
        if (this.f41592d) {
            this.f41594f.c(i5);
        } else {
            g(new R3.c(this, i5, 6));
        }
    }

    @Override // md.AbstractC3538f
    public final void d(Object obj) {
        if (this.f41592d) {
            this.f41594f.d(obj);
        } else {
            g(new RunnableC3666A(2, this, obj));
        }
    }

    @Override // md.AbstractC3538f
    public final void e(AbstractC3537e abstractC3537e, md.b0 b0Var) {
        md.k0 k0Var;
        boolean z2;
        Fe.e.w("already started", this.f41593e == null);
        synchronized (this) {
            try {
                this.f41593e = abstractC3537e;
                k0Var = this.f41595g;
                z2 = this.f41592d;
                if (!z2) {
                    E e7 = new E(abstractC3537e);
                    this.f41597i = e7;
                    abstractC3537e = e7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (k0Var != null) {
            this.f41590b.execute(new D(this, abstractC3537e, k0Var));
        } else if (z2) {
            this.f41594f.e(abstractC3537e, b0Var);
        } else {
            g(new RunnableC0299w0(this, abstractC3537e, b0Var, 26));
        }
    }

    public final void f(md.k0 k0Var, boolean z2) {
        AbstractC3537e abstractC3537e;
        synchronized (this) {
            try {
                AbstractC3538f abstractC3538f = this.f41594f;
                boolean z10 = true;
                if (abstractC3538f == null) {
                    C c10 = f41588o;
                    if (abstractC3538f != null) {
                        z10 = false;
                    }
                    Fe.e.y(z10, "realCall already set to %s", abstractC3538f);
                    ScheduledFuture scheduledFuture = this.f41589a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f41594f = c10;
                    abstractC3537e = this.f41593e;
                    this.f41595g = k0Var;
                    z10 = false;
                } else if (z2) {
                    return;
                } else {
                    abstractC3537e = null;
                }
                if (z10) {
                    g(new RunnableC3666A(1, this, k0Var));
                } else {
                    if (abstractC3537e != null) {
                        this.f41590b.execute(new D(this, abstractC3537e, k0Var));
                    }
                    h();
                }
                this.f41601n.f41613d.f41692m.execute(new RunnableC3667B(this, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f41592d) {
                    runnable.run();
                } else {
                    this.f41596h.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f41596h     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.f41596h = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.f41592d = r0     // Catch: java.lang.Throwable -> L24
            od.E r0 = r3.f41597i     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f41590b
            od.p r2 = new od.p
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.f41596h     // Catch: java.lang.Throwable -> L24
            r3.f41596h = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: od.I0.h():void");
    }

    public final void i() {
        C3713p c3713p;
        C3549q c3549qA = this.f41598j.a();
        try {
            C3535c c3535c = this.f41599l;
            B8.e eVar = AbstractC3541i.f40650a;
            this.f41601n.f41613d.f41676Y.getClass();
            AbstractC3538f abstractC3538fI = this.f41601n.i(this.k, c3535c.c(eVar, Long.valueOf(System.nanoTime() - this.f41600m)));
            synchronized (this) {
                try {
                    AbstractC3538f abstractC3538f = this.f41594f;
                    if (abstractC3538f != null) {
                        c3713p = null;
                    } else {
                        Fe.e.y(abstractC3538f == null, "realCall already set to %s", abstractC3538f);
                        ScheduledFuture scheduledFuture = this.f41589a;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.f41594f = abstractC3538fI;
                        c3713p = new C3713p(this, this.f41591c);
                    }
                } finally {
                }
            }
            if (c3713p == null) {
                this.f41601n.f41613d.f41692m.execute(new RunnableC3667B(this, 1));
                return;
            }
            M0 m02 = this.f41601n.f41613d;
            C3535c c3535c2 = this.f41599l;
            m02.getClass();
            Executor executor = c3535c2.f40621b;
            if (executor == null) {
                executor = m02.f41688h;
            }
            executor.execute(new RunnableC3666A(19, this, c3713p));
        } finally {
            this.f41598j.c(c3549qA);
        }
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f41594f, "realCall");
        return c0237b0S.toString();
    }
}
