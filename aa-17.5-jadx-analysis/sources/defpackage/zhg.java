package defpackage;

import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
final class zhg extends TimeoutException {
    public zhg(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
