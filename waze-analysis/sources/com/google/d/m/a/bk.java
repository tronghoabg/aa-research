package com.google.d.m.a;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class bk extends AtomicReference implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final Runnable f8026a = new bj();

    /* renamed from: b, reason: collision with root package name */
    private static final Runnable f8027b = new bj();

    bk() {
    }

    private final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        bi biVar = null;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (!(runnable instanceof bi)) {
                if (runnable != f8027b) {
                    break;
                }
            } else {
                biVar = (bi) runnable;
            }
            i2++;
            if (i2 > 1000) {
                Runnable runnable2 = f8027b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(biVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    abstract Object a();

    abstract String b();

    abstract void d(Throwable th);

    abstract void e(Object obj);

    abstract boolean g();

    final void h() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            bi biVar = new bi(this);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, biVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f8026a)) == f8027b) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f8026a)) == f8027b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zG = g();
            if (!zG) {
                try {
                    objA = a();
                } catch (Throwable th) {
                    try {
                        cf.u(th);
                        if (!compareAndSet(threadCurrentThread, f8026a)) {
                            c(threadCurrentThread);
                        }
                        d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, f8026a)) {
                            c(threadCurrentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f8026a)) {
                c(threadCurrentThread);
            }
            if (zG) {
                return;
            }
            e(objA);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f8026a) {
            str = "running=[DONE]";
        } else if (runnable instanceof bi) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
