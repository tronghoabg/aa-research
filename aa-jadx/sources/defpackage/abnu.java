package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abnu extends java.io.OutputStream {
    private static final byte[] a = new byte[0];
    private int d;
    private int f;
    private final int b = 128;
    private final java.util.ArrayList c = new java.util.ArrayList();
    private byte[] e = new byte[128];

    private final void c(int i) {
        this.c.add(new defpackage.abnt(this.e));
        int length = this.d + this.e.length;
        this.d = length;
        this.e = new byte[java.lang.Math.max(this.b, java.lang.Math.max(i, length >>> 1))];
        this.f = 0;
    }

    public final synchronized int a() {
        return this.d + this.f;
    }

    public final synchronized defpackage.abnv b() {
        int i = this.f;
        byte[] bArr = this.e;
        if (i >= bArr.length) {
            this.c.add(new defpackage.abnt(this.e));
            this.e = a;
        } else if (i > 0) {
            this.c.add(new defpackage.abnt(java.util.Arrays.copyOf(bArr, i)));
        }
        this.d += this.f;
        this.f = 0;
        return defpackage.abnv.t(this.c);
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "<ByteString.Output@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(a()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.e;
        int length = bArr2.length;
        int i3 = this.f;
        int i4 = length - i3;
        if (i2 <= i4) {
            java.lang.System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f += i2;
            return;
        }
        java.lang.System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        c(i5);
        java.lang.System.arraycopy(bArr, i + i4, this.e, 0, i5);
        this.f = i5;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        if (this.f == this.e.length) {
            c(1);
        }
        byte[] bArr = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        bArr[i2] = (byte) i;
    }
}
