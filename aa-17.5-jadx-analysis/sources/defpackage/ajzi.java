package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class ajzi extends InputStream implements InputStreamRetargetInterface {
    private final long a;
    private long b = 0;
    private boolean c = false;
    private ajzu d;

    public ajzi(ajzu ajzuVar, long j) {
        this.d = null;
        ahgm.e(ajzuVar, "Session input buffer");
        this.d = ajzuVar;
        this.a = j;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        ajzu ajzuVar = this.d;
        if (ajzuVar instanceof ajzr) {
            return Math.min(((ajzr) ajzuVar).g(), (int) (this.a - this.b));
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
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
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.c) {
            throw new IOException("Attempted read from closed stream.");
        }
        long j = this.b;
        long j2 = this.a;
        int i3 = -1;
        if (j >= j2) {
            return -1;
        }
        if (i2 + j > j2) {
            i2 = (int) (j2 - j);
        }
        int iB = this.d.b(bArr, i, i2);
        if (iB != -1) {
            i3 = iB;
        } else if (this.b < j2) {
            throw new ajov(Long.valueOf(j2), Long.valueOf(this.b));
        }
        if (i3 > 0) {
            this.b += i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        int i;
        if (j <= 0) {
            return 0L;
        }
        byte[] bArr = new byte[2048];
        long jMin = Math.min(j, this.a - this.b);
        long j2 = 0;
        while (jMin > 0 && (i = read(bArr, 0, (int) Math.min(2048L, jMin))) != -1) {
            long j3 = i;
            j2 += j3;
            jMin -= j3;
        }
        return j2;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.c) {
            throw new IOException("Attempted read from closed stream.");
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
        throw new ajov(Long.valueOf(j2), Long.valueOf(this.b));
    }
}
