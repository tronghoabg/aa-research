package Jf;

import A7.RunnableC0278p;
import Ef.A;
import Ef.C0502n;
import Ef.J;
import Ef.M;
import Ef.M0;
import Ef.U;
import Va.M6;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public final class g extends A implements M {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6113g = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f6114b;

    /* renamed from: c, reason: collision with root package name */
    public final A f6115c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6116d;

    /* renamed from: e, reason: collision with root package name */
    public final k f6117e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6118f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(A a5, int i5) {
        M m10 = a5 instanceof M ? (M) a5 : null;
        this.f6114b = m10 == null ? J.f3680a : m10;
        this.f6115c = a5;
        this.f6116d = i5;
        this.f6117e = new k();
        this.f6118f = new Object();
    }

    public final boolean B() {
        synchronized (this.f6118f) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6113g;
            if (atomicIntegerFieldUpdater.get(this) >= this.f6116d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // Ef.M
    public final U b(long j8, M0 m02, InterfaceC3108h interfaceC3108h) {
        return this.f6114b.b(j8, m02, interfaceC3108h);
    }

    @Override // Ef.M
    public final void h(long j8, C0502n c0502n) {
        this.f6114b.h(j8, c0502n);
    }

    @Override // Ef.A
    public final void i(InterfaceC3108h interfaceC3108h, Runnable runnable) {
        Runnable runnableZ;
        this.f6117e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6113g;
        if (atomicIntegerFieldUpdater.get(this) >= this.f6116d || !B() || (runnableZ = z()) == null) {
            return;
        }
        try {
            b.i(this.f6115c, this, new RunnableC0278p(24, this, runnableZ));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // Ef.A
    public final void o(InterfaceC3108h interfaceC3108h, Runnable runnable) {
        Runnable runnableZ;
        this.f6117e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6113g;
        if (atomicIntegerFieldUpdater.get(this) >= this.f6116d || !B() || (runnableZ = z()) == null) {
            return;
        }
        try {
            this.f6115c.o(this, new RunnableC0278p(24, this, runnableZ));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // Ef.A
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6115c);
        sb2.append(".limitedParallelism(");
        return M6.r(sb2, this.f6116d, ')');
    }

    public final Runnable z() {
        while (true) {
            Runnable runnable = (Runnable) this.f6117e.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f6118f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6113g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f6117e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
