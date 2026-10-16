package androidx.tracing;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class AbstractTraceDriver implements AutoCloseable {
    private final AbstractTraceSink sink;

    /* compiled from: WazeSource */
    public interface Factory {
        AbstractTraceDriver create();
    }

    protected AbstractTraceDriver(AbstractTraceSink abstractTraceSink) {
        this.sink = abstractTraceSink;
    }

    @Override // java.lang.AutoCloseable
    public abstract void close();

    public abstract void flush();

    public final AbstractTraceSink getSink() {
        return this.sink;
    }

    public abstract Tracer getTracer();
}
