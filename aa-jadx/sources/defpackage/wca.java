package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wca implements java.io.Closeable {
    public final java.util.zip.Inflater a = new java.util.zip.Inflater(true);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.end();
    }
}
