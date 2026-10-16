package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aieg implements defpackage.aiff {
    private final java.util.concurrent.locks.Lock lock;

    public /* synthetic */ aieg(java.util.concurrent.locks.Lock lock, int i, defpackage.affu affuVar) {
        this((i & 1) != 0 ? new java.util.concurrent.locks.ReentrantLock() : lock);
    }

    protected final java.util.concurrent.locks.Lock getLock() {
        return this.lock;
    }

    @Override // defpackage.aiff
    public void lock() {
        this.lock.lock();
    }

    @Override // defpackage.aiff
    public void unlock() {
        this.lock.unlock();
    }

    public aieg(java.util.concurrent.locks.Lock lock) {
        lock.getClass();
        this.lock = lock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public aieg() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
