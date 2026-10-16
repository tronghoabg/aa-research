package e.a.h;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p extends ConcurrentLinkedQueue implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Lock f47792a;

    /* renamed from: b, reason: collision with root package name */
    private final Condition f47793b;

    static {
        Logger.getLogger(p.class.getName());
    }

    p() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f47792a = reentrantLock;
        this.f47793b = reentrantLock.newCondition();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f47792a.lock();
        try {
            add(runnable);
            this.f47793b.signalAll();
        } finally {
            this.f47792a.unlock();
        }
    }
}
