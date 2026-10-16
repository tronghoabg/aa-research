package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wgh implements java.io.Closeable {
    public java.io.Closeable a;

    public wgh(java.io.Closeable closeable) {
        this.a = closeable;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final java.io.Closeable a() {
        java.io.Closeable closeable = this.a;
        this.a = null;
        return closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        java.io.Closeable closeable = this.a;
        if (closeable != null) {
            closeable.close();
        }
    }
}
