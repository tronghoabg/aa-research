package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
final class ajvn extends OutputStream {
    public byte[] a;
    private final MessageDigest b;
    private boolean c;

    public ajvn(MessageDigest messageDigest) {
        this.b = messageDigest;
        messageDigest.reset();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a = this.b.digest();
        super.close();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (this.c) {
            throw new IOException("Stream has been already closed");
        }
        this.b.update((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.c) {
            this.b.update(bArr, i, i2);
            return;
        }
        throw new IOException("Stream has been already closed");
    }
}
