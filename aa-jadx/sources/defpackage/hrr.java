package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hrr extends java.io.FilterInputStream implements j$.io.InputStreamRetargetInterface {
    private final long a;
    private long b;

    public hrr(java.io.InputStream inputStream, long j) {
        super(inputStream);
        this.a = j;
    }

    public final long a() {
        return this.a - this.b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        int i = super.read();
        if (i != -1) {
            this.b++;
        }
        return i;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += (long) i3;
        }
        return i3;
    }
}
