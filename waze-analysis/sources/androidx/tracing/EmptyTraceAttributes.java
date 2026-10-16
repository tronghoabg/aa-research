package androidx.tracing;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EmptyTraceAttributes extends TraceAttributes {
    public static final EmptyTraceAttributes INSTANCE = new EmptyTraceAttributes();

    private EmptyTraceAttributes() {
    }

    @Override // androidx.tracing.TraceAttributes
    public void addAttribute(String str, long j2) {
    }

    @Override // androidx.tracing.TraceAttributes
    @DelicateTracingApi
    public void dispatchToTraceSink() {
    }

    @Override // androidx.tracing.TraceAttributes
    public void addAttribute(String str, String str2) {
    }
}
