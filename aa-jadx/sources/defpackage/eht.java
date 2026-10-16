package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eht extends java.io.OutputStream {
    private final java.io.FileOutputStream a;

    public eht(java.io.FileOutputStream fileOutputStream) {
        this.a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws java.io.IOException {
        bArr.getClass();
        this.a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        this.a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        bArr.getClass();
        this.a.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
