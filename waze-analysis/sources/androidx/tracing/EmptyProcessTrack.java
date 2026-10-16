package androidx.tracing;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EmptyProcessTrack extends ProcessTrack {
    private final EmptyTraceContext emptyContext;

    public EmptyProcessTrack(EmptyTraceContext emptyTraceContext) {
        super(emptyTraceContext, -1, "Empty Process");
        this.emptyContext = emptyTraceContext;
    }

    @Override // androidx.tracing.ProcessTrack
    public CounterTrack getOrCreateCounterTrack(String str) {
        return this.emptyContext.getCounter$tracing();
    }

    @Override // androidx.tracing.ProcessTrack
    public ThreadTrack getOrCreateThreadTrack(long j2, String str) {
        return this.emptyContext.getThread$tracing();
    }
}
