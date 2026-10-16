package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hrv extends java.io.ByteArrayOutputStream {
    private final defpackage.hrp a;

    public hrv(defpackage.hrp hrpVar, int i) {
        this.a = hrpVar;
        this.buf = hrpVar.b(java.lang.Math.max(i, 256));
    }

    private final void a(int i) {
        if (this.count + i <= this.buf.length) {
            return;
        }
        defpackage.hrp hrpVar = this.a;
        int i2 = this.count + i;
        byte[] bArrB = hrpVar.b(i2 + i2);
        java.lang.System.arraycopy(this.buf, 0, bArrB, 0, this.count);
        hrpVar.a(this.buf);
        this.buf = bArrB;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.a.a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.a.a(this.buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }
}
