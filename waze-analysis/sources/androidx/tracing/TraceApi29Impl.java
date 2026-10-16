package androidx.tracing;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class TraceApi29Impl {
    public static final TraceApi29Impl INSTANCE = new TraceApi29Impl();

    private TraceApi29Impl() {
    }

    public final void beginAsyncSection(String str, int i2) {
        android.os.Trace.beginAsyncSection(str, i2);
    }

    public final void endAsyncSection(String str, int i2) {
        android.os.Trace.endAsyncSection(str, i2);
    }

    public final boolean isEnabled() {
        return android.os.Trace.isEnabled();
    }

    public final void setCounter(String str, int i2) {
        android.os.Trace.setCounter(str, i2);
    }

    public final void setCounter(String str, long j2) {
        android.os.Trace.setCounter(str, j2);
    }
}
