package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class ajas extends CancellationException {
    public ajas() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (aitz.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
