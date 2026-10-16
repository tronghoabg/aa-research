package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahor extends java.io.FilterInputStream implements j$.io.InputStreamRetargetInterface {
    private int limit;

    public ahor(java.io.InputStream inputStream, int i) {
        super(inputStream);
        this.limit = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
        return java.lang.Math.min(super.available(), this.limit);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.limit;
        if (i3 <= 0) {
            return -1;
        }
        int i4 = super.read(bArr, i, java.lang.Math.min(i2, i3));
        if (i4 >= 0) {
            this.limit -= i4;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws java.io.IOException {
        long jSkip = super.skip(java.lang.Math.min(j, this.limit));
        if (jSkip >= 0) {
            this.limit = (int) (((long) this.limit) - jSkip);
        }
        return jSkip;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        if (this.limit <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.limit--;
        }
        return i;
    }
}
