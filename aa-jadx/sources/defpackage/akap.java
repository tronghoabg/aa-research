package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akap extends java.io.OutputStream {
    private final defpackage.akav a;
    private boolean b = false;

    public akap(defpackage.akav akavVar) {
        defpackage.aguw.e(akavVar, "Session output buffer");
        this.a = akavVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws java.io.IOException {
        this.a.a();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        if (this.b) {
            throw new java.io.IOException("Attempted write to closed stream.");
        }
        this.a.b(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws java.io.IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (!this.b) {
            this.a.c(bArr, i, i2);
            return;
        }
        throw new java.io.IOException("Attempted write to closed stream.");
    }
}
