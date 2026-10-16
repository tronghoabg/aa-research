package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class cqn extends CancellationException {
    public cqn(long j) {
        super(a.bI(j, "Timed out waiting for ", " ms"));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(cri.a);
        return this;
    }
}
