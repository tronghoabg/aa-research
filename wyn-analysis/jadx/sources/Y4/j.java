package Y4;

import java.io.FilterInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f16695a;

    public j(f fVar) {
        super(fVar);
        this.f16695a = Integer.MIN_VALUE;
    }

    public final long a(long j8) {
        int i5 = this.f16695a;
        if (i5 == 0) {
            return -1L;
        }
        return (i5 == Integer.MIN_VALUE || j8 <= ((long) i5)) ? j8 : i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i5 = this.f16695a;
        return i5 == Integer.MIN_VALUE ? super.available() : Math.min(i5, super.available());
    }

    public final void b(long j8) {
        int i5 = this.f16695a;
        if (i5 == Integer.MIN_VALUE || j8 == -1) {
            return;
        }
        this.f16695a = (int) (i5 - j8);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i5) {
        super.mark(i5);
        this.f16695a = i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int i5 = super.read();
        b(1L);
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f16695a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j8) throws IOException {
        long jA = a(j8);
        if (jA == -1) {
            return 0L;
        }
        long jSkip = super.skip(jA);
        b(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        int iA = (int) a(i10);
        if (iA == -1) {
            return -1;
        }
        int i11 = super.read(bArr, i5, iA);
        b(i11);
        return i11;
    }
}
