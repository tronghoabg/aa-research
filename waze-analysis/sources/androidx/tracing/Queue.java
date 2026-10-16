package androidx.tracing;

import h.a.u;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Queue<T> {
    private boolean droppedTraceEvent;
    private final u<T> queue;

    public Queue(int i2) {
        this.queue = new u<>(i2);
    }

    public final void addLast(T t) {
        synchronized (this.queue) {
            this.queue.addLast(t);
        }
    }

    public final T firstOrNull() {
        T t;
        synchronized (this.queue) {
            t = (T) this.queue.b();
        }
        return t;
    }

    public final T get(int i2) {
        T t;
        synchronized (this.queue) {
            t = this.queue.get(i2);
        }
        return t;
    }

    public final int getSize() {
        int size;
        synchronized (this.queue) {
            size = this.queue.size();
        }
        return size;
    }

    public final boolean isDroppedTraceEvent() {
        boolean z;
        synchronized (this.queue) {
            z = this.droppedTraceEvent;
        }
        return z;
    }

    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.queue) {
            zIsEmpty = this.queue.isEmpty();
        }
        return zIsEmpty;
    }

    public final boolean isNotEmpty() {
        boolean z;
        synchronized (this.queue) {
            z = !this.queue.isEmpty();
        }
        return z;
    }

    public final void removeFirst() {
        synchronized (this.queue) {
            this.queue.removeFirst();
        }
    }

    public final void setDroppedTraceEvent(boolean z) {
        synchronized (this.queue) {
            this.droppedTraceEvent = z;
        }
    }

    public Queue() {
        this(0, 1, null);
    }

    public /* synthetic */ Queue(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 64 : i2);
    }
}
