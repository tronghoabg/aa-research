package defpackage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public class aidg implements aief {
    private final Lock lock;

    public /* synthetic */ aidg(Lock lock, int i, afeu afeuVar) {
        this((i & 1) != 0 ? new ReentrantLock() : lock);
    }

    protected final Lock getLock() {
        return this.lock;
    }

    @Override // defpackage.aief
    public void lock() {
        this.lock.lock();
    }

    @Override // defpackage.aief
    public void unlock() {
        this.lock.unlock();
    }

    public aidg(Lock lock) {
        lock.getClass();
        this.lock = lock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public aidg() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
