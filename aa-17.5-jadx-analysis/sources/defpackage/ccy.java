package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public class ccy extends CancellationException {
    public ccy() {
        super("The coroutine was canceled because it left the composition");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(ccz.a);
        return this;
    }
}
