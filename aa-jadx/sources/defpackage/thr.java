package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class thr implements defpackage.thq {
    final /* synthetic */ java.io.Closeable a;
    final /* synthetic */ java.io.InputStream b;
    final /* synthetic */ java.io.OutputStream c;

    public thr(java.io.Closeable closeable, java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        this.a = closeable;
        this.b = inputStream;
        this.c = outputStream;
    }

    @Override // defpackage.thq
    public final java.io.InputStream a() {
        return this.b;
    }

    @Override // defpackage.thq
    public final java.io.OutputStream b() {
        return this.c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.a.close();
    }
}
