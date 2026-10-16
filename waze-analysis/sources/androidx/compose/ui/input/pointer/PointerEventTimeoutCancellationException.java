package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public static final int $stable = 8;

    public PointerEventTimeoutCancellationException(long j2) {
        super("Timed out waiting for " + j2 + " ms");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(SuspendingPointerInputFilter_jvmAndAndroidKt.EmptyStackTraceElements);
        return this;
    }
}
