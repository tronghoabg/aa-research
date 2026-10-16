package defpackage;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class tdd extends Semaphore {
    private static final yph a = yph.c("GH.BoundedSemaphore");
    private final int b;
    private final Lock c;

    public tdd(int i) {
        super(i);
        this.b = i;
        this.c = new ReentrantLock();
    }

    @Override // java.util.concurrent.Semaphore
    public final void release(int i) {
        this.c.lock();
        try {
            int iMin = Math.min(i, this.b - availablePermits());
            super.release(iMin);
            if (iMin < i) {
                ((ype) a.l().ai(8988)).w("Discarded %d releases", i - iMin);
            }
        } finally {
            this.c.unlock();
        }
    }

    @Override // java.util.concurrent.Semaphore
    public final void release() {
        this.c.lock();
        try {
            if (availablePermits() < this.b) {
                super.release();
            } else {
                ((ype) a.l().ai(8987)).u("Discarded release");
            }
        } finally {
            this.c.unlock();
        }
    }
}
