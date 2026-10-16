package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ajwn extends java.io.OutputStream {
    public byte[] a;
    private final java.security.MessageDigest b;
    private boolean c;

    public ajwn(java.security.MessageDigest messageDigest) {
        this.b = messageDigest;
        messageDigest.reset();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a = this.b.digest();
        super.close();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        if (this.c) {
            throw new java.io.IOException("Stream has been already closed");
        }
        this.b.update((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (!this.c) {
            this.b.update(bArr, i, i2);
            return;
        }
        throw new java.io.IOException("Stream has been already closed");
    }
}
