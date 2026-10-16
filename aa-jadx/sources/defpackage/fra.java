package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fra extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    private final java.io.InputStream a;
    private int b = 1073741824;

    public fra(java.io.InputStream inputStream) {
        this.a = inputStream;
    }

    private final void a(int i) {
        if (i == -1) {
            this.b = 0;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws java.io.IOException {
        bArr.getClass();
        int i = this.a.read(bArr);
        a(i);
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.a.skip(j);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        int i = this.a.read();
        a(i);
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        bArr.getClass();
        int i3 = this.a.read(bArr, i, i2);
        a(i3);
        return i3;
    }
}
