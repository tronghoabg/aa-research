package defpackage;

import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class kik implements AutoCloseable {
    private final Lock a;

    public kik(Lock lock) {
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
