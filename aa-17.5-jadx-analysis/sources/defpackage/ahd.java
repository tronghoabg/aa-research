package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public class ahd extends CancellationException {
    public ahd() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(ahe.a);
        return this;
    }
}
