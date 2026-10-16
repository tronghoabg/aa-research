package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class ajzp extends OutputStream {
    private final ajzv a;
    private boolean b = false;

    public ajzp(ajzv ajzvVar) {
        ahgm.e(ajzvVar, "Session output buffer");
        this.a = ajzvVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.a.a();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (this.b) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.a.b(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.b) {
            this.a.c(bArr, i, i2);
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}
