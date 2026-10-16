package androidx.tracing;

import h.a.u;
import h.g.a.l;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Pool<T> {
    private AtomicLong counter;
    private final l<Pool<T>, T> factory;
    private final boolean isDebug;
    private final u<T> scrapPool;
    private final int size;

    /* JADX WARN: Multi-variable type inference failed */
    public Pool(int i2, boolean z, l<? super Pool<T>, ? extends T> lVar) {
        this.size = i2;
        this.isDebug = z;
        this.factory = lVar;
        if (z) {
            this.counter = new AtomicLong(0L);
        }
        this.scrapPool = new u<>(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.scrapPool.addLast(this.factory.invoke(this));
        }
    }

    public final long count$tracing() {
        AtomicLong atomicLong = this.counter;
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0L;
    }

    public final T obtain$tracing() {
        AtomicLong atomicLong;
        T tInvoke = (T) this.scrapPool.e();
        if (tInvoke == null) {
            tInvoke = this.factory.invoke(this);
        }
        if (this.isDebug && tInvoke != null && (atomicLong = this.counter) != null) {
            atomicLong.incrementAndGet();
        }
        return tInvoke;
    }

    public final void release$tracing(T t) {
        AtomicLong atomicLong;
        if (this.isDebug && (atomicLong = this.counter) != null) {
            long j2 = atomicLong.get();
            atomicLong.compareAndSet(j2, (-1) + j2);
        }
        if (this.scrapPool.size() < this.size) {
            this.scrapPool.addFirst(t);
        }
    }
}
