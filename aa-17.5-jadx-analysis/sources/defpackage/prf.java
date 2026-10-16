package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class prf extends prb {
    private static final yob h = yob.c("com/google/android/apps/gmm/systems/concurrent/ConcurrencyLimitingExecutor");
    public final psb e;
    final Queue f;
    final ThreadLocal g;
    private final Executor i;
    private final AtomicReference j;
    private final AtomicReference k;

    public prf(String str, int i, Executor executor, tmb tmbVar, ScheduledExecutorService scheduledExecutorService, psb psbVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        super(str, i, tmbVar, scheduledExecutorService);
        this.g = new pre();
        this.j = new AtomicReference(null);
        this.k = new AtomicReference(null);
        this.i = executor;
        this.e = psbVar;
        this.f = concurrentLinkedQueue;
        woy.N(i > 0);
        woy.N(i <= 255);
    }

    private final void s(final pqz pqzVar) {
        try {
            this.i.execute(new Runnable() { // from class: prd
                @Override // java.lang.Runnable
                public final void run() {
                    prf prfVar = this.a;
                    pqz pqzVar2 = pqzVar;
                    try {
                        ((List) psb.K.get()).add(prfVar);
                        pqzVar2.run();
                    } finally {
                        prfVar.c.getAndAdd(-65536);
                        prfVar.r();
                        psb.g(prfVar);
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            ((ynz) ((ynz) ((ynz) h.h()).p(e)).ai(6849)).M("Delegation rejected:  %s  -->  %s", this, this.i);
            this.c.getAndAdd(-65536);
            r();
        }
    }

    private final void t() {
        if (this.c.get() == 33554432) {
            k();
        }
    }

    @Override // defpackage.prb
    protected final pra a() {
        int i = this.c.get();
        return new pra((i >>> 16) & 255, 0, this.a, (char) i);
    }

    @Override // defpackage.prb
    protected final void j(pqz pqzVar) {
        int i;
        do {
            int i2 = this.c.get();
            i = (-16777216) & i2;
            if (i >= 33554432) {
                throw new RejectedExecutionException("Delegator shut down:  ".concat(toString()));
            }
            if (((char) i2) == 65535) {
                throw new RejectedExecutionException("Too many tasks:  ".concat(toString()));
            }
        } while (!p(i, 1));
        this.f.offer(pqzVar);
        r();
    }

    @Override // defpackage.prb
    protected final void l() {
        t();
    }

    final void r() {
        ThreadLocal threadLocal = this.g;
        Thread threadCurrentThread = Thread.currentThread();
        boolean zBooleanValue = ((Boolean) threadLocal.get()).booleanValue();
        threadLocal.set(true);
        if (zBooleanValue) {
            return;
        }
        try {
            xul xulVarO = ysi.o();
            try {
                AtomicReference atomicReference = this.j;
                atomicReference.set(threadCurrentThread);
                while (threadCurrentThread == atomicReference.get()) {
                    AtomicReference atomicReference2 = this.k;
                    if (a.h(atomicReference2, null, threadCurrentThread)) {
                        try {
                            AtomicInteger atomicInteger = this.c;
                            int i = atomicInteger.get();
                            char c = (char) i;
                            int i2 = i >>> 16;
                            if (c != 0 && (i2 & 255) < this.a) {
                                pqz pqzVar = (pqz) this.f.poll();
                                if (pqzVar != null) {
                                    if (pqzVar.isDone()) {
                                        atomicInteger.addAndGet(-1);
                                    } else {
                                        atomicInteger.addAndGet(65535);
                                        s(pqzVar);
                                    }
                                }
                                atomicReference2.set(null);
                            }
                            this.k.set(null);
                            break;
                        } catch (Throwable th) {
                            this.k.set(null);
                            throw th;
                        }
                    }
                }
                xulVarO.close();
                this.g.set(false);
                a.h(this.j, threadCurrentThread, null);
                t();
            } finally {
            }
        } catch (Throwable th2) {
            this.g.set(false);
            a.h(this.j, threadCurrentThread, null);
            throw th2;
        }
    }

    @Override // defpackage.prb, java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        List listShutdownNow = super.shutdownNow();
        yfl yflVar = new yfl(4);
        yflVar.k(listShutdownNow);
        while (true) {
            AtomicInteger atomicInteger = this.c;
            if (((char) atomicInteger.get()) <= 0) {
                t();
                return yflVar.g();
            }
            pqz pqzVar = (pqz) this.f.poll();
            if (pqzVar != null) {
                atomicInteger.getAndAdd(-1);
                if (!pqzVar.isDone()) {
                    yflVar.i(pqzVar);
                }
            }
        }
    }
}
