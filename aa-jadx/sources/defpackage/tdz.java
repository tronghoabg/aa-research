package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tdz extends java.util.concurrent.Semaphore {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.BoundedSemaphore");
    private final int b;
    private final java.util.concurrent.locks.Lock c;

    public tdz(int i) {
        super(i);
        this.b = i;
        this.c = new java.util.concurrent.locks.ReentrantLock();
    }

    @Override // java.util.concurrent.Semaphore
    public final void release(int i) {
        this.c.lock();
        try {
            int iMin = java.lang.Math.min(i, this.b - availablePermits());
            super.release(iMin);
            if (iMin < i) {
                ((defpackage.yqj) a.l().ai(9013)).w("Discarded %d releases", i - iMin);
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
                ((defpackage.yqj) a.l().ai(9012)).u("Discarded release");
            }
        } finally {
            this.c.unlock();
        }
    }
}
