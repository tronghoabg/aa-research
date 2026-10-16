package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class koj implements defpackage.thq {
    final /* synthetic */ java.io.Closeable a;
    final /* synthetic */ defpackage.kok b;
    final /* synthetic */ defpackage.kon c;

    public koj(java.io.Closeable closeable, defpackage.kok kokVar, defpackage.kon konVar) {
        this.a = closeable;
        this.b = kokVar;
        this.c = konVar;
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
