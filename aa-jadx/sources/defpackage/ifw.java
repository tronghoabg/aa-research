package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ifw extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    public static final java.util.Queue a;
    public java.io.InputStream b;
    public java.io.IOException c;

    static {
        char[] cArr = defpackage.igg.a;
        a = new java.util.ArrayDeque(0);
    }

    public final void a() {
        this.c = null;
        this.b = null;
        java.util.Queue queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final int available() throws java.io.IOException {
        return this.b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.b.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.b.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        try {
            return this.b.read();
        } catch (java.io.IOException e) {
            this.c = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws java.io.IOException {
        this.b.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        try {
            return this.b.skip(j);
        } catch (java.io.IOException e) {
            this.c = e;
            throw e;
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws java.io.IOException {
        try {
            return this.b.read(bArr);
        } catch (java.io.IOException e) {
            this.c = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            return this.b.read(bArr, i, i2);
        } catch (java.io.IOException e) {
            this.c = e;
            throw e;
        }
    }
}
