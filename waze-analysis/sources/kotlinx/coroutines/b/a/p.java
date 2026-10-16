package kotlinx.coroutines.b.a;

import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends CancellationException {
    public p() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (kotlinx.coroutines.ai.b()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
