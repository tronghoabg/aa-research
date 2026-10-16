package androidx.tracing;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Throwables {
    public static final void addThrowable(EventMetadata eventMetadata, Throwable th) {
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            eventMetadata.addCallStackEntry(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        }
    }

    public static final Void recordExceptionAndThrow(Tracer tracer, String str, String str2, Throwable th) throws Throwable {
        EventMetadataCloseable eventMetadataCloseableInstant = tracer.instant(str, str2);
        EventMetadata eventMetadata = eventMetadataCloseableInstant.metadata;
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            eventMetadata.addCallStackEntry(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        }
        eventMetadataCloseableInstant.metadata.dispatchToTraceSink();
        throw th;
    }
}
