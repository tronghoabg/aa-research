package C4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import ka.AbstractC3256n;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class j extends FilterInputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f1794c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final int f1795d = 31;

    /* renamed from: a, reason: collision with root package name */
    public final byte f1796a;

    /* renamed from: b, reason: collision with root package name */
    public int f1797b;

    public j(InputStream inputStream, int i5) {
        super(inputStream);
        if (i5 < -1 || i5 > 8) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "Cannot add invalid orientation: "));
        }
        this.f1796a = (byte) i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i5;
        int i10 = this.f1797b;
        int i11 = (i10 < 2 || i10 > (i5 = f1795d)) ? super.read() : i10 == i5 ? this.f1796a : f1794c[i10 - 2] & ForkServer.ERROR;
        if (i11 != -1) {
            this.f1797b++;
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j8) throws IOException {
        long jSkip = super.skip(j8);
        if (jSkip > 0) {
            this.f1797b = (int) (this.f1797b + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        int i11;
        int i12 = this.f1797b;
        int i13 = f1795d;
        if (i12 > i13) {
            i11 = super.read(bArr, i5, i10);
        } else if (i12 == i13) {
            bArr[i5] = this.f1796a;
            i11 = 1;
        } else if (i12 < 2) {
            i11 = super.read(bArr, i5, 2 - i12);
        } else {
            int iMin = Math.min(i13 - i12, i10);
            System.arraycopy(f1794c, this.f1797b - 2, bArr, i5, iMin);
            i11 = iMin;
        }
        if (i11 > 0) {
            this.f1797b += i11;
        }
        return i11;
    }
}
