package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class ajag extends CancellationException {
    public final transient Object a;

    public ajag(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.a = obj;
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
