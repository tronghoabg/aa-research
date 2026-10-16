package od;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: od.p1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3715p1 extends InputStream implements md.I {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC3674c f42057a;

    @Override // java.io.InputStream
    public final int available() {
        return this.f42057a.z();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f42057a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i5) {
        this.f42057a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f42057a.d();
    }

    @Override // java.io.InputStream
    public final int read() {
        AbstractC3674c abstractC3674c = this.f42057a;
        if (abstractC3674c.z() == 0) {
            return -1;
        }
        return abstractC3674c.y();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f42057a.B();
    }

    @Override // java.io.InputStream
    public final long skip(long j8) {
        AbstractC3674c abstractC3674c = this.f42057a;
        int iMin = (int) Math.min(abstractC3674c.z(), j8);
        abstractC3674c.D(iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) {
        AbstractC3674c abstractC3674c = this.f42057a;
        if (abstractC3674c.z() == 0) {
            return -1;
        }
        int iMin = Math.min(abstractC3674c.z(), i10);
        abstractC3674c.i(i5, iMin, bArr);
        return iMin;
    }
}
