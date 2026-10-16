package androidx.window.layout.util;

import androidx.core.util.Consumer;
import h.g.a.p;
import h.g.b.x;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class CombineLatestConsumerAdapter<T, U, W> {
    private final Consumer<W> consumer;
    private final Consumer<T> consumerT;
    private final Consumer<U> consumerU;
    private T lastT;
    private U lastU;
    private final ReentrantLock lock;
    private final p<T, U, W> transform;

    /* JADX WARN: Multi-variable type inference failed */
    public CombineLatestConsumerAdapter(p<? super T, ? super U, ? extends W> pVar, Consumer<W> consumer) {
        x.f(pVar, "transform");
        x.f(consumer, "consumer");
        this.transform = pVar;
        this.consumer = consumer;
        this.lock = new ReentrantLock();
        this.consumerT = new Consumer() { // from class: androidx.window.layout.util.CombineLatestConsumerAdapter$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f$0.updateT(obj);
            }
        };
        this.consumerU = new Consumer() { // from class: androidx.window.layout.util.CombineLatestConsumerAdapter$$ExternalSyntheticLambda1
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f$0.updateU(obj);
            }
        };
    }

    private final void notifyConsumer() {
        U u;
        T t = this.lastT;
        if (t == null || (u = this.lastU) == null) {
            return;
        }
        this.consumer.accept(this.transform.invoke(t, u));
    }

    public final Consumer<T> getConsumerT() {
        return this.consumerT;
    }

    public final Consumer<U> getConsumerU() {
        return this.consumerU;
    }

    public final void updateT(T t) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.lastT = t;
            notifyConsumer();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void updateU(U u) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.lastU = u;
            notifyConsumer();
        } finally {
            reentrantLock.unlock();
        }
    }
}
