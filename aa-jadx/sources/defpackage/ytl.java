package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ytl implements java.io.Closeable {
    public static final java.lang.ThreadLocal a = new defpackage.ytk();
    public int b = 0;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i <= 0) {
            throw new java.lang.AssertionError("Mismatched calls to RecursionDepth (possible error in core library)");
        }
        this.b = i - 1;
    }
}
