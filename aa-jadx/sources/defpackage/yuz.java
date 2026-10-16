package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yuz implements java.io.Closeable {
    public final java.util.Deque a = new java.util.ArrayDeque(4);
    public java.lang.Throwable b;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.lang.Throwable {
        java.lang.Throwable th = this.b;
        while (true) {
            java.util.Deque deque = this.a;
            if (deque.isEmpty()) {
                break;
            }
            java.io.Closeable closeable = (java.io.Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (java.lang.Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (java.lang.Throwable unused) {
                        defpackage.yuy.a.logp(java.util.logging.Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(java.lang.String.valueOf(java.lang.String.valueOf(closeable))), th2);
                    }
                }
            }
        }
        if (this.b != null || th == null) {
            return;
        }
        defpackage.xzm.b(th, java.io.IOException.class);
        defpackage.xzm.c(th);
        throw new java.lang.AssertionError(th);
    }
}
