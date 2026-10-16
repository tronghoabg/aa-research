package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class icb implements java.util.concurrent.locks.Lock {
    @Override // java.util.concurrent.locks.Lock
    public final java.util.concurrent.locks.Condition newCondition() {
        throw new java.lang.UnsupportedOperationException("Should not be called");
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock() {
        return true;
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        return true;
    }

    @Override // java.util.concurrent.locks.Lock
    public final void lock() {
    }

    @Override // java.util.concurrent.locks.Lock
    public final void lockInterruptibly() throws java.lang.InterruptedException {
    }

    @Override // java.util.concurrent.locks.Lock
    public final void unlock() {
    }
}
