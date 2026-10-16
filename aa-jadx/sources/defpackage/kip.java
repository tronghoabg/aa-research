package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kip implements java.lang.AutoCloseable {
    private final java.util.concurrent.locks.Lock a;

    public kip(java.util.concurrent.locks.Lock lock) {
        this.a = lock;
    }

    public final void a() {
        this.a.lock();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.unlock();
    }
}
