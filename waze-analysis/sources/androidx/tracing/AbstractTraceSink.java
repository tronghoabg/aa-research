package androidx.tracing;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class AbstractTraceSink implements AutoCloseable {
    @Override // java.lang.AutoCloseable
    public abstract void close();

    public abstract void enqueue(PooledTracePacketArray pooledTracePacketArray);

    public abstract void flush();

    public abstract void onDroppedTraceEvent();
}
