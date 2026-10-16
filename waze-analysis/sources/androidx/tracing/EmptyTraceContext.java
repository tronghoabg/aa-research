package androidx.tracing;

import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EmptyTraceContext extends TraceContext {
    public static final EmptyTraceContext INSTANCE;
    private static final EmptyCounterTrack counter;
    private static ProcessTrack process;
    private static final EmptyThreadTrack thread;
    private static final EmptyProcessTrack track;

    static {
        EmptyTraceContext emptyTraceContext = new EmptyTraceContext();
        INSTANCE = emptyTraceContext;
        EmptyProcessTrack emptyProcessTrack = new EmptyProcessTrack(emptyTraceContext);
        track = emptyProcessTrack;
        process = emptyProcessTrack;
        thread = new EmptyThreadTrack(emptyProcessTrack);
        counter = new EmptyCounterTrack(emptyProcessTrack);
    }

    private EmptyTraceContext() {
        super(EmptyTraceSink.INSTANCE, false, new l() { // from class: androidx.tracing.EmptyTraceContext$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                EmptyTraceContext emptyTraceContext = EmptyTraceContext.INSTANCE;
                return false;
            }
        }, false);
    }

    static final boolean _init_$lambda$0(String str) {
        return false;
    }

    public final EmptyCounterTrack getCounter$tracing() {
        return counter;
    }

    @Override // androidx.tracing.TraceContext
    public ProcessTrack getProcess() {
        return process;
    }

    public final EmptyThreadTrack getThread$tracing() {
        return thread;
    }

    public final EmptyProcessTrack getTrack$tracing() {
        return track;
    }

    @Override // androidx.tracing.TraceContext
    public void setProcess(ProcessTrack processTrack) {
        process = processTrack;
    }
}
