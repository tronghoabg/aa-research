package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajnx extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    final /* synthetic */ defpackage.ajny a;

    public ajnx(defpackage.ajny ajnyVar) {
        this.a = ajnyVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) java.lang.Math.min(this.a.b, 2147483647L);
    }

    @Override // java.io.InputStream
    public final int read() {
        defpackage.ajny ajnyVar = this.a;
        if (ajnyVar.b > 0) {
            return ajnyVar.d() & 255;
        }
        return -1;
    }

    public final java.lang.String toString() {
        defpackage.ajny ajnyVar = this.a;
        java.util.Objects.toString(ajnyVar);
        return ajnyVar.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        return this.a.e(bArr, i, i2);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
