package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
final class adxj extends InputStream implements InputStreamRetargetInterface, adku {
    private final adxi a;

    public adxj(adxi adxiVar) {
        adxiVar.getClass();
        this.a = adxiVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return ((adsr) this.a).a;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.d();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        adxi adxiVar = this.a;
        int i3 = ((adsr) adxiVar).a;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i2);
        adxiVar.j(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        this.a.c();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        adxi adxiVar = this.a;
        int iMin = (int) Math.min(((adsr) adxiVar).a, j);
        adxiVar.k(iMin);
        return iMin;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        adxi adxiVar = this.a;
        if (((adsr) adxiVar).a == 0) {
            return -1;
        }
        return adxiVar.e();
    }
}
