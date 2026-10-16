package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akai extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    private final long a;
    private long b = 0;
    private boolean c = false;
    private defpackage.akau d;

    public akai(defpackage.akau akauVar, long j) {
        this.d = null;
        defpackage.aguw.e(akauVar, "Session input buffer");
        this.d = akauVar;
        this.a = j;
    }

    @Override // java.io.InputStream
    public final int available() throws java.io.IOException {
        defpackage.akau akauVar = this.d;
        if (akauVar instanceof defpackage.akar) {
            return java.lang.Math.min(((defpackage.akar) akauVar).g(), (int) (this.a - this.b));
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.c) {
            return;
        }
        try {
            if (this.b < this.a) {
                do {
                } while (read(new byte[2048]) >= 0);
            }
        } finally {
            this.c = true;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.c) {
            throw new java.io.IOException("Attempted read from closed stream.");
        }
        long j = this.b;
        long j2 = this.a;
        int i3 = -1;
        if (j >= j2) {
            return -1;
        }
        if (((long) i2) + j > j2) {
            i2 = (int) (j2 - j);
        }
        int iB = this.d.b(bArr, i, i2);
        if (iB != -1) {
            i3 = iB;
        } else if (this.b < j2) {
            throw new defpackage.ajpv(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(this.b));
        }
        if (i3 > 0) {
            this.b += (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        int i;
        if (j <= 0) {
            return 0L;
        }
        byte[] bArr = new byte[2048];
        long jMin = java.lang.Math.min(j, this.a - this.b);
        long j2 = 0;
        while (jMin > 0 && (i = read(bArr, 0, (int) java.lang.Math.min(2048L, jMin))) != -1) {
            long j3 = i;
            j2 += j3;
            jMin -= j3;
        }
        return j2;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws java.io.IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        if (this.c) {
            throw new java.io.IOException("Attempted read from closed stream.");
        }
        long j = this.b;
        long j2 = this.a;
        if (j >= j2) {
            return -1;
        }
        int iA = this.d.a();
        long j3 = this.b;
        if (iA != -1) {
            this.b = j3 + 1;
            return iA;
        }
        if (j3 >= j2) {
            return iA;
        }
        throw new defpackage.ajpv(java.lang.Long.valueOf(j2), java.lang.Long.valueOf(this.b));
    }
}
