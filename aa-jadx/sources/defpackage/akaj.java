package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akaj extends java.io.OutputStream {
    private final defpackage.akav a;
    private final long b;
    private long c;
    private boolean d;

    public akaj(defpackage.akav akavVar, long j) {
        defpackage.aguw.e(akavVar, "Session output buffer");
        this.a = akavVar;
        this.b = j;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.a();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws java.io.IOException {
        this.a.a();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.d) {
            throw new java.io.IOException("Attempted write to closed stream.");
        }
        long j = this.c;
        long j2 = this.b;
        if (j < j2) {
            long j3 = j2 - j;
            if (i2 > j3) {
                i2 = (int) j3;
            }
            this.a.c(bArr, i, i2);
            this.c += (long) i2;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws java.io.IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws java.io.IOException {
        if (this.d) {
            throw new java.io.IOException("Attempted write to closed stream.");
        }
        if (this.c < this.b) {
            this.a.b(i);
            this.c++;
        }
    }
}
