package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hvd extends java.io.OutputStream {
    private final java.io.OutputStream a;
    private byte[] b;
    private int c;
    private final defpackage.hxu d;

    public hvd(java.io.OutputStream outputStream, defpackage.hxu hxuVar) {
        this.a = outputStream;
        this.d = hxuVar;
        this.b = (byte[]) hxuVar.a(65536, byte[].class);
    }

    private final void a() throws java.io.IOException {
        int i = this.c;
        if (i > 0) {
            this.a.write(this.b, 0, i);
            this.c = 0;
        }
    }

    private final void b() throws java.io.IOException {
        if (this.c == this.b.length) {
            a();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        try {
            flush();
            this.a.close();
            byte[] bArr = this.b;
            if (bArr != null) {
                this.d.c(bArr);
                this.b = null;
            }
        } catch (java.lang.Throwable th) {
            this.a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws java.io.IOException {
        a();
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.c;
            if (i6 == 0) {
                if (i4 >= this.b.length) {
                    this.a.write(bArr, i5, i4);
                    return;
                }
                i6 = 0;
            }
            int iMin = java.lang.Math.min(i4, this.b.length - i6);
            java.lang.System.arraycopy(bArr, i5, this.b, this.c, iMin);
            this.c += iMin;
            i3 += iMin;
            b();
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws java.io.IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        byte[] bArr = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr[i2] = (byte) i;
        b();
    }
}
