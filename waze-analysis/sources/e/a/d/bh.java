package e.a.d;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class bh extends e.a.k {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f46656a = Logger.getLogger(bh.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final e.a.k f46657b = new ba();

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledFuture f46658c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f46659d;

    /* renamed from: e, reason: collision with root package name */
    private final e.a.ac f46660e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f46661f;

    /* renamed from: g, reason: collision with root package name */
    private e.a.cm f46662g;

    /* renamed from: h, reason: collision with root package name */
    private e.a.k f46663h;

    /* renamed from: i, reason: collision with root package name */
    private e.a.ee f46664i;

    /* renamed from: j, reason: collision with root package name */
    private List f46665j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private bg f46666k;

    /* renamed from: l, reason: collision with root package name */
    private com.waze.uid.f f46667l;

    protected bh(Executor executor, ScheduledExecutorService scheduledExecutorService, e.a.ad adVar) {
        ScheduledFuture<?> scheduledFutureSchedule;
        com.google.d.b.an.C(executor, "callExecutor");
        this.f46659d = executor;
        com.google.d.b.an.C(scheduledExecutorService, "scheduler");
        e.a.ac acVarG = e.a.ac.g();
        this.f46660e = acVarG;
        acVarG.d();
        if (adVar != null) {
            long jB = adVar.b(TimeUnit.NANOSECONDS);
            scheduledFutureSchedule = scheduledExecutorService.schedule(new aw(this, jB), jB, TimeUnit.NANOSECONDS);
        } else {
            scheduledFutureSchedule = null;
        }
        this.f46658c = scheduledFutureSchedule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(e.a.ee eeVar, boolean z) {
        com.waze.uid.f fVar;
        boolean z2;
        synchronized (this) {
            if (this.f46663h == null) {
                r(f46657b);
                fVar = this.f46667l;
                this.f46664i = eeVar;
                z2 = false;
            } else {
                if (z) {
                    return;
                }
                fVar = null;
                z2 = true;
            }
            if (z2) {
                p(new ay(this, eeVar, 1));
            } else {
                if (fVar != null) {
                    this.f46659d.execute(new bb(this, fVar, eeVar));
                }
                s(fVar);
                q();
            }
            l();
        }
    }

    private final void p(Runnable runnable) {
        synchronized (this) {
            if (this.f46661f) {
                runnable.run();
            } else {
                this.f46665j.add(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f46665j     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.f46665j = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.f46661f = r0     // Catch: java.lang.Throwable -> L42
            e.a.d.bg r0 = r3.f46666k     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f46659d
            e.a.d.ax r2 = new e.a.d.ax
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List r1 = r3.f46665j     // Catch: java.lang.Throwable -> L42
            r3.f46665j = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.d.bh.q():void");
    }

    private final void r(e.a.k kVar) {
        e.a.k kVar2 = this.f46663h;
        com.google.d.b.an.y(kVar2 == null, "realCall already set to %s", kVar2);
        ScheduledFuture scheduledFuture = this.f46658c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f46663h = kVar;
    }

    private final void s(com.waze.uid.f fVar) {
        e.a.cm cmVar = this.f46662g;
        this.f46662g = null;
        android.support.v4.app.n nVar = new android.support.v4.app.n(this, fVar, cmVar, 16);
        e.a.ac acVar = this.f46660e;
        e.a.ac acVarA = acVar.a();
        try {
            nVar.run();
        } finally {
            acVar.b(acVarA);
        }
    }

    @Override // e.a.k
    public final void a(String str, Throwable th) {
        e.a.ee eeVar = e.a.ee.f47402b;
        e.a.ee eeVarG = str != null ? eeVar.g(str) : eeVar.g("Call cancelled without message");
        if (th != null) {
            eeVarG = eeVarG.f(th);
        }
        o(eeVarG, false);
    }

    @Override // e.a.k
    public final void b() {
        p(new bi(this, 1));
    }

    @Override // e.a.k
    public final void c(int i2) {
        if (this.f46661f) {
            this.f46663h.c(i2);
        } else {
            p(new az(this, i2, 0));
        }
    }

    @Override // e.a.k
    public final void d(Object obj) {
        if (this.f46661f) {
            this.f46663h.d(obj);
        } else {
            p(new ay(this, obj, 0));
        }
    }

    @Override // e.a.k
    public final void e(com.waze.uid.f fVar, e.a.cm cmVar) {
        e.a.ee eeVar;
        boolean z;
        com.google.d.b.an.C(cmVar, "headers");
        com.google.d.b.an.v(this.f46667l == null, "already started");
        synchronized (this) {
            com.google.d.b.an.C(fVar, "listener");
            this.f46667l = fVar;
            eeVar = this.f46664i;
            z = this.f46661f;
            if (!z) {
                bg bgVar = new bg(this, fVar);
                this.f46666k = bgVar;
                this.f46662g = cmVar;
                fVar = bgVar;
            }
        }
        if (eeVar != null) {
            this.f46659d.execute(new bb(this, fVar, eeVar));
        } else if (z) {
            this.f46663h.e(fVar, cmVar);
        }
    }

    public final Runnable h(e.a.k kVar) {
        synchronized (this) {
            if (this.f46663h == null) {
                r(kVar);
                bg bgVar = this.f46666k;
                if (bgVar != null) {
                    s(bgVar);
                    return new av(this, this.f46660e);
                }
                this.f46665j = null;
                this.f46661f = true;
            }
            return null;
        }
    }

    @Override // e.a.k
    public final boolean i() {
        if (this.f46661f) {
            return this.f46663h.i();
        }
        return false;
    }

    protected void l() {
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("realCall", this.f46663h);
        return zVarH.toString();
    }
}
