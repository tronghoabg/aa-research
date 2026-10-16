package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adyl extends java.io.InputStream implements j$.io.InputStreamRetargetInterface, defpackage.adlv {
    private final defpackage.adyk a;

    public adyl(defpackage.adyk adykVar) {
        adykVar.getClass();
        this.a = adykVar;
    }

    @Override // java.io.InputStream
    public final int available() throws java.io.IOException {
        return ((defpackage.adts) this.a).a;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
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
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        defpackage.adyk adykVar = this.a;
        int i3 = ((defpackage.adts) adykVar).a;
        if (i3 == 0) {
            return -1;
        }
        int iMin = java.lang.Math.min(i3, i2);
        adykVar.j(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final void reset() throws java.io.IOException {
        this.a.c();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        defpackage.adyk adykVar = this.a;
        int iMin = (int) java.lang.Math.min(((defpackage.adts) adykVar).a, j);
        adykVar.k(iMin);
        return iMin;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        defpackage.adyk adykVar = this.a;
        if (((defpackage.adts) adykVar).a == 0) {
            return -1;
        }
        return adykVar.e();
    }
}
