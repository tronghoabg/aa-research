package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.InvalidMarkException;

/* loaded from: classes3.dex */
final class adxk extends adri {
    int a;
    final int b;
    final byte[] c;
    int d = -1;

    public adxk(byte[] bArr, int i, int i2) {
        woy.O(i >= 0, "offset must be >= 0");
        woy.O(i2 >= 0, "length must be >= 0");
        int i3 = i2 + i;
        woy.O(i3 <= bArr.length, "offset + length exceeds array boundary");
        this.c = bArr;
        this.a = i;
        this.b = i3;
    }

    @Override // defpackage.adri, defpackage.adxi
    public final void b() {
        this.d = this.a;
    }

    @Override // defpackage.adri, defpackage.adxi
    public final void c() {
        int i = this.d;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.a = i;
    }

    @Override // defpackage.adri, defpackage.adxi
    public final boolean d() {
        return true;
    }

    @Override // defpackage.adxi
    public final int e() {
        a(1);
        int i = this.a;
        this.a = i + 1;
        return this.c[i] & 255;
    }

    @Override // defpackage.adxi
    public final int f() {
        return this.b - this.a;
    }

    @Override // defpackage.adxi
    public final /* bridge */ /* synthetic */ adxi g(int i) {
        a(i);
        int i2 = this.a;
        this.a = i2 + i;
        return new adxk(this.c, i2, i);
    }

    @Override // defpackage.adxi
    public final void i(OutputStream outputStream, int i) throws IOException {
        a(i);
        outputStream.write(this.c, this.a, i);
        this.a += i;
    }

    @Override // defpackage.adxi
    public final void j(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    @Override // defpackage.adxi
    public final void k(int i) {
        a(i);
        this.a += i;
    }
}
