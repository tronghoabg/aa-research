package defpackage;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class pyx {
    public static final yob a = yob.c("com/google/android/apps/gmm/systems/startupscheduler/StartupScheduler");
    public static final long b;
    public final zgt e;
    public final prr f;
    public final prr g;
    public final prr h;
    public final prr i;
    public volatile CountDownLatch k;
    public final Executor l;
    public final AtomicReference m;
    public final boolean n;
    public final boolean o;
    final prc p;
    public final psj q;
    public final qsb r;
    public final aacq s;
    private volatile CountDownLatch v;
    private volatile CountDownLatch w;
    public final AtomicInteger c = new AtomicInteger();
    public final AtomicInteger d = new AtomicInteger();
    private final AtomicInteger t = new AtomicInteger();
    private final AtomicInteger u = new AtomicInteger();
    public final pyt j = new pyt();

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b = 10000L;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        ygr.p(accm.EIT_TIMELINE_PUBLIC_URL, accm.EIT_TIMELINE_NOTIFICATION);
    }

    public pyx(Context context, zgt zgtVar, psj psjVar, xxh xxhVar) {
        zfq zfqVar = zfq.a;
        this.l = zfqVar;
        zgq zgqVar = new zgq(new oyx(3));
        zgqVar.run();
        this.m = new AtomicReference(zgqVar);
        this.s = new aacq((char[]) null);
        this.p = new prc(new pru(this, 17, null));
        vaq.d();
        this.e = zgtVar;
        this.q = psjVar;
        this.r = (qsb) ((xxm) xxhVar).a;
        boolean zA = pyn.a(context, pyo.OPTIMIZE_LOCKING_IN_PAUSABLE_EXECUTOR);
        this.f = new prr(zfqVar, false, zA);
        this.g = new prr(zfqVar, false, zA);
        this.h = new prr(zfqVar, false, zA);
        this.i = new prr(zfqVar, false, zA);
        this.k = new CountDownLatch(0);
        this.v = new CountDownLatch(0);
        this.w = new CountDownLatch(0);
        this.n = pyn.a(context, pyo.DEFER_STARTUP_SCHEDULER_TASKS_FOR_CSL_RECEIVER);
        this.o = pyn.a(context, pyo.SERIALIZE_AND_LIMIT_CONCURRENT_POST_STARTUP_TASKS);
    }

    public final void a() {
        psb.UI_THREAD.h();
        vaq.d();
        this.j.a();
    }

    public final void b(final Runnable runnable, final pyw pywVar) {
        vaq.b(new vap() { // from class: pys
            @Override // defpackage.vap
            public final void a() {
                yob yobVar = pyx.a;
                vky.a(vky.c("Running post-startup task ", runnable.getClass()), vky.d(" on ", pywVar));
            }
        });
        fdi.a("StartupScheduler.pending", this.d.decrementAndGet());
        AtomicInteger atomicInteger = this.t;
        fdi.a("StartupScheduler.running", atomicInteger.incrementAndGet());
        runnable.run();
        fdi.a("StartupScheduler.running", atomicInteger.decrementAndGet());
        fdi.a("StartupScheduler.completed", this.u.incrementAndGet());
    }

    public final void c() {
        CountDownLatch countDownLatch;
        d();
        e();
        a();
        vaq.d();
        psb.UI_THREAD.h();
        try {
            this.h.b();
            countDownLatch = this.w;
        } catch (IllegalStateException unused) {
            countDownLatch = this.w;
        } catch (Throwable th) {
            this.w.countDown();
            this.p.a();
            throw th;
        }
        countDownLatch.countDown();
        this.p.a();
        this.q.c(new pyr());
        ((ynz) ((ynz) a.f()).ai((char) 6954)).u("All post-startup tasks are unleashed.");
    }

    public final void d() {
        CountDownLatch countDownLatch;
        vaq.d();
        try {
            this.f.b();
            countDownLatch = this.k;
        } catch (IllegalStateException unused) {
            countDownLatch = this.k;
        } catch (Throwable th) {
            this.k.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public final void e() {
        CountDownLatch countDownLatch;
        vaq.d();
        psb.UI_THREAD.h();
        try {
            this.g.b();
            countDownLatch = this.v;
        } catch (IllegalStateException unused) {
            countDownLatch = this.v;
        } catch (Throwable th) {
            this.v.countDown();
            a();
            throw th;
        }
        countDownLatch.countDown();
        a();
    }
}
