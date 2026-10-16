package N;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class O extends CancellationException {
    public O() {
        super("The coroutine scope left the composition");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
