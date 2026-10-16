package androidx.tracing;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EmptyEventMetadata extends EventMetadata {
    public static final EmptyEventMetadata INSTANCE = new EmptyEventMetadata();

    private EmptyEventMetadata() {
    }

    @Override // androidx.tracing.EventMetadata
    public void addCallStackEntry(String str, String str2, int i2) {
    }

    @Override // androidx.tracing.EventMetadata
    public void addCategory(String str) {
    }

    @Override // androidx.tracing.EventMetadata
    public void addCorrelationId(long j2) {
    }

    @Override // androidx.tracing.EventMetadata
    public void addMetadataEntry(String str, double d2) {
    }

    @Override // androidx.tracing.EventMetadata
    @DelicateTracingApi
    public void dispatchToTraceSink() {
    }

    @Override // androidx.tracing.EventMetadata
    public void addCorrelationId(String str) {
    }

    @Override // androidx.tracing.EventMetadata
    public void addMetadataEntry(String str, long j2) {
    }

    @Override // androidx.tracing.EventMetadata
    public void addMetadataEntry(String str, String str2) {
    }

    @Override // androidx.tracing.EventMetadata
    public void addMetadataEntry(String str, boolean z) {
    }
}
