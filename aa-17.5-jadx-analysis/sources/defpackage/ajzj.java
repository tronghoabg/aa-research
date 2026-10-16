package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class ajzj extends OutputStream {
    private final ajzv a;
    private final long b;
    private long c;
    private boolean d;

    public ajzj(ajzv ajzvVar, long j) {
        ahgm.e(ajzvVar, "Session output buffer");
        this.a = ajzvVar;
        this.b = j;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.a();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.a.a();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.d) {
            throw new IOException("Attempted write to closed stream.");
        }
        long j = this.c;
        long j2 = this.b;
        if (j < j2) {
            long j3 = j2 - j;
            if (i2 > j3) {
                i2 = (int) j3;
            }
            this.a.c(bArr, i, i2);
            this.c += i2;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (this.d) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (this.c < this.b) {
            this.a.b(i);
            this.c++;
        }
    }
}
