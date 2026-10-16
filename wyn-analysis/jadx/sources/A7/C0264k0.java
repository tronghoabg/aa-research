package A7;

import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: A7.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0264k0 extends D0 {
    public static final AtomicLong k = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public C0276o0 f930c;

    /* renamed from: d, reason: collision with root package name */
    public C0276o0 f931d;

    /* renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f932e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f933f;

    /* renamed from: g, reason: collision with root package name */
    public final C0270m0 f934g;

    /* renamed from: h, reason: collision with root package name */
    public final C0270m0 f935h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f936i;

    /* renamed from: j, reason: collision with root package name */
    public final Semaphore f937j;

    public C0264k0(C0273n0 c0273n0) {
        super(c0273n0);
        this.f936i = new Object();
        this.f937j = new Semaphore(2);
        this.f932e = new PriorityBlockingQueue();
        this.f933f = new LinkedBlockingQueue();
        this.f934g = new C0270m0(this, "Thread death: Uncaught exception on worker thread");
        this.f935h = new C0270m0(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // A7.B0
    public final void c0() {
        if (Thread.currentThread() != this.f930c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // A7.D0
    public final boolean g0() {
        return false;
    }

    public final C0267l0 h0(Callable callable) {
        e0();
        C0267l0 c0267l0 = new C0267l0(this, callable, false);
        if (Thread.currentThread() != this.f930c) {
            j0(c0267l0);
            return c0267l0;
        }
        if (!this.f932e.isEmpty()) {
            zzj().f608i.c("Callable skipped the worker queue.");
        }
        c0267l0.run();
        return c0267l0;
    }

    public final Object i0(AtomicReference atomicReference, long j8, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzl().m0(runnable);
            try {
                atomicReference.wait(j8);
            } catch (InterruptedException unused) {
                zzj().f608i.c("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            zzj().f608i.c("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void j0(C0267l0 c0267l0) {
        synchronized (this.f936i) {
            try {
                this.f932e.add(c0267l0);
                C0276o0 c0276o0 = this.f930c;
                if (c0276o0 == null) {
                    C0276o0 c0276o02 = new C0276o0(this, "Measurement Worker", this.f932e);
                    this.f930c = c0276o02;
                    c0276o02.setUncaughtExceptionHandler(this.f934g);
                    this.f930c.start();
                } else {
                    c0276o0.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k0(Runnable runnable) {
        e0();
        C0267l0 c0267l0 = new C0267l0(this, runnable, false, "Task exception on network thread");
        synchronized (this.f936i) {
            try {
                this.f933f.add(c0267l0);
                C0276o0 c0276o0 = this.f931d;
                if (c0276o0 == null) {
                    C0276o0 c0276o02 = new C0276o0(this, "Measurement Network", this.f933f);
                    this.f931d = c0276o02;
                    c0276o02.setUncaughtExceptionHandler(this.f935h);
                    this.f931d.start();
                } else {
                    c0276o0.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0267l0 l0(Callable callable) {
        e0();
        C0267l0 c0267l0 = new C0267l0(this, callable, true);
        if (Thread.currentThread() == this.f930c) {
            c0267l0.run();
            return c0267l0;
        }
        j0(c0267l0);
        return c0267l0;
    }

    public final void m0(Runnable runnable) {
        e0();
        AbstractC1732v.i(runnable);
        j0(new C0267l0(this, runnable, false, "Task exception on worker thread"));
    }

    public final void n0(Runnable runnable) {
        e0();
        j0(new C0267l0(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean o0() {
        return Thread.currentThread() == this.f930c;
    }

    public final void p0() {
        if (Thread.currentThread() != this.f931d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }
}
