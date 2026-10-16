package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public class cru extends CancellationException {
    public cru(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(crv.a);
        return this;
    }
}
