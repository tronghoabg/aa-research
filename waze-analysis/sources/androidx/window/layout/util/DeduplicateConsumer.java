package androidx.window.layout.util;

import androidx.core.util.Consumer;
import h.g.b.x;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class DeduplicateConsumer<T> implements Consumer<T> {
    private final Consumer<T> callback;
    private T lastValue;
    private final ReentrantLock lock;

    public DeduplicateConsumer(Consumer<T> consumer) {
        x.f(consumer, "callback");
        this.callback = consumer;
        this.lock = new ReentrantLock();
    }

    @Override // androidx.core.util.Consumer
    public void accept(T t) {
        boolean z;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (x.n(this.lastValue, t)) {
                z = false;
            } else {
                this.lastValue = t;
                z = true;
            }
            if (z) {
                this.callback.accept(t);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
