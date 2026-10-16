package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akao extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    private final defpackage.akau a;
    private boolean b = false;

    public akao(defpackage.akau akauVar) {
        defpackage.aguw.e(akauVar, "Session input buffer");
        this.a = akauVar;
    }

    @Override // java.io.InputStream
    public final int available() throws java.io.IOException {
        defpackage.akau akauVar = this.a;
        if (akauVar instanceof defpackage.akar) {
            return ((defpackage.akar) akauVar).g();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.b = true;
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        if (this.b) {
            return -1;
        }
        return this.a.a();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.b) {
            return -1;
        }
        return this.a.b(bArr, i, i2);
    }
}
