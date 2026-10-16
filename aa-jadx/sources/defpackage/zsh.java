package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zsh extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    private int a;
    private final byte[] b;
    private int c;
    private int d;
    private final java.io.InputStream e;

    public zsh(java.io.InputStream inputStream, int i) {
        this.e = inputStream;
        this.a = i;
        this.b = new byte[java.lang.Math.min(i, 4096)];
    }

    private final boolean a() throws java.io.IOException {
        int i = this.a;
        if (i <= 0) {
            return false;
        }
        if (this.c < this.d) {
            return true;
        }
        java.io.InputStream inputStream = this.e;
        byte[] bArr = this.b;
        int i2 = inputStream.read(bArr, 0, java.lang.Math.min(i, bArr.length));
        this.d = i2;
        if (i2 <= 0) {
            this.a = 0;
            return false;
        }
        this.c = 0;
        return true;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.d - this.c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (!a()) {
            return -1;
        }
        int iMin = java.lang.Math.min(i2, this.d - this.c);
        java.lang.System.arraycopy(this.b, this.c, bArr, i, iMin);
        this.c += iMin;
        this.a -= iMin;
        return iMin;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        if (!a()) {
            return -1;
        }
        this.a--;
        byte[] bArr = this.b;
        int i = this.c;
        this.c = i + 1;
        return bArr[i] & 255;
    }
}
