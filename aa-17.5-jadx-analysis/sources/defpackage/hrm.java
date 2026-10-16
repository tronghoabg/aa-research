package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class hrm extends ByteArrayOutputStream {
    private final hrg a;

    public hrm(hrg hrgVar, int i) {
        this.a = hrgVar;
        this.buf = hrgVar.b(Math.max(i, 256));
    }

    private final void a(int i) {
        if (this.count + i <= this.buf.length) {
            return;
        }
        hrg hrgVar = this.a;
        int i2 = this.count + i;
        byte[] bArrB = hrgVar.b(i2 + i2);
        System.arraycopy(this.buf, 0, bArrB, 0, this.count);
        hrgVar.a(this.buf);
        this.buf = bArrB;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
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
