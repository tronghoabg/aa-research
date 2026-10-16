package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adym extends defpackage.adsj {
    int a;
    final int b;
    final byte[] c;
    int d = -1;

    public adym(byte[] bArr, int i, int i2) {
        defpackage.ysr.aY(i >= 0, "offset must be >= 0");
        defpackage.ysr.aY(i2 >= 0, "length must be >= 0");
        int i3 = i2 + i;
        defpackage.ysr.aY(i3 <= bArr.length, "offset + length exceeds array boundary");
        this.c = bArr;
        this.a = i;
        this.b = i3;
    }

    @Override // defpackage.adsj, defpackage.adyk
    public final void b() {
        this.d = this.a;
    }

    @Override // defpackage.adsj, defpackage.adyk
    public final void c() {
        int i = this.d;
        if (i == -1) {
            throw new java.nio.InvalidMarkException();
        }
        this.a = i;
    }

    @Override // defpackage.adsj, defpackage.adyk
    public final boolean d() {
        return true;
    }

    @Override // defpackage.adyk
    public final int e() {
        a(1);
        int i = this.a;
        this.a = i + 1;
        return this.c[i] & 255;
    }

    @Override // defpackage.adyk
    public final int f() {
        return this.b - this.a;
    }

    @Override // defpackage.adyk
    public final /* bridge */ /* synthetic */ defpackage.adyk g(int i) {
        a(i);
        int i2 = this.a;
        this.a = i2 + i;
        return new defpackage.adym(this.c, i2, i);
    }

    @Override // defpackage.adyk
    public final void i(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        a(i);
        outputStream.write(this.c, this.a, i);
        this.a += i;
    }

    @Override // defpackage.adyk
    public final void j(byte[] bArr, int i, int i2) {
        java.lang.System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    @Override // defpackage.adyk
    public final void k(int i) {
        a(i);
        this.a += i;
    }
}
