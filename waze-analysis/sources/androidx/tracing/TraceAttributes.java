package androidx.tracing;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class TraceAttributes {
    public abstract void addAttribute(String str, long j2);

    public abstract void addAttribute(String str, String str2);

    @DelicateTracingApi
    public abstract void dispatchToTraceSink();
}
