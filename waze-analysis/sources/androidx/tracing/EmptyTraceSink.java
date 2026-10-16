package androidx.tracing;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EmptyTraceSink extends AbstractTraceSink {
    public static final EmptyTraceSink INSTANCE = new EmptyTraceSink();
    private static final AtomicInteger enqueues = new AtomicInteger(0);

    private EmptyTraceSink() {
    }

    @Override // androidx.tracing.AbstractTraceSink, java.lang.AutoCloseable
    public void close() {
        enqueues.set(0);
    }

    @Override // androidx.tracing.AbstractTraceSink
    public void enqueue(PooledTracePacketArray pooledTracePacketArray) {
        enqueues.incrementAndGet();
        pooledTracePacketArray.recycle();
    }

    @Override // androidx.tracing.AbstractTraceSink
    public void flush() {
    }

    public final AtomicInteger getEnqueues$tracing() {
        return enqueues;
    }

    @Override // androidx.tracing.AbstractTraceSink
    public void onDroppedTraceEvent() {
    }
}
