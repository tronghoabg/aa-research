package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akal extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    public static final defpackage.akal a = new defpackage.akal();

    @Override // java.io.InputStream
    public final int available() {
        return 0;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        return -1;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return 0L;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return -1;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final void reset() {
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
    }
}
