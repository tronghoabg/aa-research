package W9;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: W9.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1233d extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f15329a;

    /* renamed from: b, reason: collision with root package name */
    public long f15330b;

    public C1233d(InputStream inputStream) {
        super(inputStream);
        this.f15330b = -1L;
        this.f15329a = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f15329a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i5) {
        ((FilterInputStream) this).in.mark(i5);
        this.f15330b = this.f15329a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f15329a == 0) {
            return -1;
        }
        int i5 = ((FilterInputStream) this).in.read();
        if (i5 != -1) {
            this.f15329a--;
        }
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f15330b == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f15329a = this.f15330b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j8) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j8, this.f15329a));
        this.f15329a -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        long j8 = this.f15329a;
        if (j8 == 0) {
            return -1;
        }
        int i11 = ((FilterInputStream) this).in.read(bArr, i5, (int) Math.min(i10, j8));
        if (i11 != -1) {
            this.f15329a -= i11;
        }
        return i11;
    }
}
