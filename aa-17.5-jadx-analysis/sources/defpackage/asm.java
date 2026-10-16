package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public class asm extends CancellationException {
    public asm(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(asn.a);
        return this;
    }
}
