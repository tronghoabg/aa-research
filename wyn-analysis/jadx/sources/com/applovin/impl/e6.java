package com.applovin.impl;

import A7.AbstractC0279p0;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class e6 {

    /* renamed from: r, reason: collision with root package name */
    private static final ExecutorService f21475r = Executors.newFixedThreadPool(4);

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21476a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f21477b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f21478c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f21479d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f21480e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f21481f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f21482g;

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f21483h;

    /* renamed from: i, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f21484i;
    private ExecutorService k;

    /* renamed from: l, reason: collision with root package name */
    private ExecutorService f21486l;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21489o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f21490p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f21491q;

    /* renamed from: j, reason: collision with root package name */
    private final Map f21485j = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    private final List f21487m = new ArrayList(5);

    /* renamed from: n, reason: collision with root package name */
    private final Object f21488n = new Object();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21492a;

        static {
            int[] iArr = new int[b.values().length];
            f21492a = iArr;
            try {
                iArr[b.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21492a[b.CACHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21492a[b.MEDIATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21492a[b.TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        CORE,
        CACHING,
        MEDIATION,
        TIMEOUT,
        OTHER
    }

    public static class c extends e {

        /* renamed from: f, reason: collision with root package name */
        private final long f21499f;

        public c(com.applovin.impl.sdk.k kVar, j5 j5Var, b bVar, long j8) {
            super(kVar, j5Var, bVar);
            this.f21499f = j8;
        }
    }

    public class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final String f21500a;

        public class a implements Thread.UncaughtExceptionHandler {
            public a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                com.applovin.impl.sdk.o unused = e6.this.f21477b;
                if (com.applovin.impl.sdk.o.a()) {
                    e6.this.f21477b.a("TaskManager", "Caught unhandled exception", th);
                }
            }
        }

        public d(String str) {
            this.f21500a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f21500a);
            thread.setDaemon(true);
            thread.setPriority(((Integer) e6.this.f21476a.a(y4.f23672Q)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    public static class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f21503a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21504b;

        /* renamed from: c, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f21505c;

        /* renamed from: d, reason: collision with root package name */
        protected final j5 f21506d;

        /* renamed from: e, reason: collision with root package name */
        protected final b f21507e;

        public e(com.applovin.impl.sdk.k kVar, j5 j5Var, b bVar) {
            this.f21503a = kVar;
            this.f21505c = kVar.O();
            this.f21504b = j5Var.c();
            this.f21506d = j5Var;
            this.f21507e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AbstractC1654o0.a();
                if (!this.f21503a.F0() || this.f21506d.d()) {
                    ScheduledFuture scheduledFutureB = this.f21506d.b(Thread.currentThread(), ((Long) this.f21503a.a(y4.f23927w)).longValue());
                    this.f21506d.run();
                    if (scheduledFutureB != null) {
                        scheduledFutureB.cancel(false);
                    }
                } else {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21505c.d(this.f21504b, "Task re-scheduled...");
                    }
                    this.f21503a.r0().a(this.f21506d, this.f21507e, 2000L);
                }
            } catch (Throwable th) {
                try {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21505c.a(this.f21504b, "Task failed execution", th);
                    }
                    this.f21506d.a(th);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21505c.d(this.f21504b, this.f21507e + " queue finished task " + this.f21506d.c());
                    }
                } finally {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21505c.d(this.f21504b, this.f21507e + " queue finished task " + this.f21506d.c());
                    }
                }
            }
        }
    }

    public e6(com.applovin.impl.sdk.k kVar) {
        this.f21476a = kVar;
        this.f21477b = kVar.O();
        this.f21490p = ((Boolean) kVar.a(y4.f23695T)).booleanValue();
        this.f21491q = ((Boolean) kVar.a(y4.f23702T6)).booleanValue();
        this.f21478c = b("auxiliary_operations", ((Integer) kVar.a(y4.f23657O)).intValue());
        this.f21479d = b("shared_thread_pool", ((Integer) kVar.a(y4.f23649N)).intValue());
        this.f21480e = b("core", ((Integer) kVar.a(y4.f23703U)).intValue());
        this.f21482g = b("caching", ((Integer) kVar.a(y4.f23711V)).intValue());
        this.f21483h = b("mediation", ((Integer) kVar.a(y4.f23719W)).intValue());
        this.f21481f = b("timeout", ((Integer) kVar.a(y4.f23727X)).intValue());
        this.f21484i = b("other", ((Integer) kVar.a(y4.f23735Y)).intValue());
        if (((Boolean) kVar.a(y4.f23650N0)).booleanValue() && ((Boolean) kVar.a(y4.f23658O0)).booleanValue()) {
            this.k = Executors.newFixedThreadPool(((Integer) kVar.a(y4.f23665P0)).intValue(), new d("com.applovin.sdk.caching.shared"));
            this.f21486l = Executors.newFixedThreadPool(((Integer) kVar.a(y4.f23673Q0)).intValue(), new d("com.applovin.sdk.caching.html.shared"));
        }
    }

    public ExecutorService c() {
        return this.f21490p ? this.f21482g : f21475r;
    }

    public Executor d() {
        return this.f21490p ? this.f21480e : this.f21479d;
    }

    public ExecutorService e() {
        return this.f21486l;
    }

    public boolean f() {
        return (a() == null || e() == null) ? false : true;
    }

    public boolean g() {
        return this.f21489o;
    }

    public void h() {
        synchronized (this.f21488n) {
            try {
                this.f21489o = true;
                for (e eVar : this.f21487m) {
                    if (this.f21491q) {
                        c cVar = (c) eVar;
                        a(cVar.f21506d, cVar.f21507e, cVar.f21499f);
                    } else {
                        a(eVar.f21506d, eVar.f21507e);
                    }
                }
                this.f21487m.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i() {
        synchronized (this.f21488n) {
            this.f21489o = false;
        }
    }

    public ExecutorService a() {
        return this.k;
    }

    public ScheduledFuture b(j5 j5Var, b bVar, long j8) {
        if (this.f21490p) {
            return a(new e(this.f21476a, j5Var, bVar)).schedule(j5Var, j8, TimeUnit.MILLISECONDS);
        }
        return this.f21478c.schedule(j5Var, j8, TimeUnit.MILLISECONDS);
    }

    public void a(j5 j5Var, b bVar) {
        a(j5Var, bVar, 0L);
    }

    public void a(j5 j5Var, b bVar, long j8) {
        a(j5Var, bVar, j8, false);
    }

    public void a(j5 j5Var, b bVar, long j8, boolean z2) {
        j5 j5Var2;
        long j10;
        e eVar;
        if (j5Var == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j8 >= 0) {
            if (this.f21491q) {
                j5Var2 = j5Var;
                j10 = j8;
                eVar = new c(this.f21476a, j5Var2, bVar, j10);
            } else {
                j5Var2 = j5Var;
                j10 = j8;
                eVar = new e(this.f21476a, j5Var2, bVar);
            }
            if (!b(eVar)) {
                a(eVar, j10, z2);
                return;
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21477b.d(j5Var2.c(), "Task execution delayed until after init");
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException(AbstractC0279p0.k(j8, "Invalid delay (millis) specified: "));
    }

    public ExecutorService b() {
        return this.f21490p ? this.f21484i : this.f21478c;
    }

    private boolean b(e eVar) {
        if (eVar.f21506d.d()) {
            return false;
        }
        synchronized (this.f21488n) {
            try {
                if (this.f21489o) {
                    return false;
                }
                this.f21487m.add(eVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ScheduledThreadPoolExecutor b(String str, int i5) {
        return new ScheduledThreadPoolExecutor(i5, new d(str));
    }

    public void a(Runnable runnable, b bVar) {
        if (this.f21490p) {
            com.applovin.impl.sdk.k kVar = this.f21476a;
            e eVar = new e(kVar, new s6(kVar, "auxiliaryOperation", runnable), bVar);
            a(eVar).submit(eVar);
            return;
        }
        this.f21478c.submit(runnable);
    }

    public Executor a(final String str) {
        return new Executor() { // from class: com.applovin.impl.L
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f20797a.a(str, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        a(new s6(this.f21476a, str, runnable));
    }

    public void a(j5 j5Var) {
        if (j5Var != null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f21490p ? this.f21480e : this.f21479d;
            try {
                if (o7.h()) {
                    scheduledThreadPoolExecutor.submit(new e(this.f21476a, j5Var, b.CORE));
                    return;
                }
                ScheduledFuture scheduledFutureB = j5Var.b(Thread.currentThread(), ((Long) this.f21476a.a(y4.f23927w)).longValue());
                j5Var.run();
                if (scheduledFutureB != null) {
                    scheduledFutureB.cancel(false);
                    return;
                }
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21477b.a(j5Var.c(), "Task failed execution", th);
                }
                j5Var.a(th);
                return;
            }
        }
        throw new IllegalArgumentException("No task specified");
    }

    public void a(j5 j5Var, k3 k3Var) {
        String strB = k3Var.b();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = (ScheduledThreadPoolExecutor) this.f21485j.get(strB);
        if (scheduledThreadPoolExecutorB == null) {
            scheduledThreadPoolExecutorB = b(strB, 1);
            this.f21485j.put(strB, scheduledThreadPoolExecutorB);
        }
        scheduledThreadPoolExecutorB.submit(new e(this.f21476a, j5Var, b.MEDIATION));
    }

    private void a(e eVar, long j8, boolean z2) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = this.f21490p ? a(eVar) : this.f21479d;
        if (j8 <= 0) {
            scheduledThreadPoolExecutorA.submit(eVar);
        } else if (z2) {
            C1638g0.a(j8, this.f21476a, new F(1, scheduledThreadPoolExecutorA, eVar));
        } else {
            scheduledThreadPoolExecutorA.schedule(eVar, j8, TimeUnit.MILLISECONDS);
        }
    }

    private ScheduledThreadPoolExecutor a(e eVar) {
        int i5 = a.f21492a[eVar.f21507e.ordinal()];
        if (i5 == 1) {
            return this.f21480e;
        }
        if (i5 == 2) {
            return this.f21482g;
        }
        if (i5 == 3) {
            return this.f21483h;
        }
        if (i5 != 4) {
            return this.f21484i;
        }
        return this.f21481f;
    }

    public ExecutorService a(String str, int i5) {
        return Executors.newFixedThreadPool(i5, new d(str));
    }

    public List a(List list, ExecutorService executorService) {
        try {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21477b.a("TaskManager", "Awaiting " + list.size() + " tasks...");
            }
            return executorService.invokeAll(list);
        } catch (Throwable th) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f21477b.a("TaskManager", "Awaiting tasks were interrupted", th);
            return null;
        }
    }
}
