package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class fdd extends fcy {
    public static final fdd a = new fdd();
    private static final AtomicInteger b = new AtomicInteger(0);

    @Override // defpackage.fcy, java.lang.AutoCloseable
    public final void close() {
        b.set(0);
    }
}
