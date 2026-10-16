package androidx.tracing;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class EventMetadata {
    public abstract void addCallStackEntry(String str, String str2, int i2);

    public abstract void addCategory(String str);

    public abstract void addCorrelationId(long j2);

    public abstract void addCorrelationId(String str);

    public abstract void addMetadataEntry(String str, double d2);

    public abstract void addMetadataEntry(String str, long j2);

    public abstract void addMetadataEntry(String str, String str2);

    public abstract void addMetadataEntry(String str, boolean z);

    @DelicateTracingApi
    public abstract void dispatchToTraceSink();
}
