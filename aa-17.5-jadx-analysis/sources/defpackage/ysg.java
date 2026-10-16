package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class ysg implements Closeable {
    public static final ThreadLocal a = new ysf();
    public int b = 0;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i <= 0) {
            throw new AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.b = i - 1;
    }
}
