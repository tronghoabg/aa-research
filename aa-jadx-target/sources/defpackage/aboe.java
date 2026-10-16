package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aboe extends defpackage.abof {
    private final byte[] b;
    private final int c;
    private int d;
    private int e;
    private final java.io.OutputStream f;

    public aboe(java.io.OutputStream outputStream, int i) {
        if (outputStream == null) {
            throw new java.lang.NullPointerException("out");
        }
        this.f = outputStream;
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[java.lang.Math.max(i, 20)];
        this.b = bArr;
        this.c = bArr.length;
    }

    private final void O() throws java.io.IOException {
        this.f.write(this.b, 0, this.d);
        this.d = 0;
    }

    private final void P(int i) throws java.io.IOException {
        if (this.c - this.d < i) {
            O();
        }
    }

    final void A(long j) {
        int i = this.d;
        byte[] bArr = this.b;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.d = i + 8;
        this.e += 8;
    }

    final void B(int i) {
        int i2 = this.d;
        int i3 = i2 + 1;
        int i4 = i & (-128);
        int i5 = this.e;
        byte[] bArr = this.b;
        if (i4 == 0) {
            bArr[i2] = (byte) i;
            this.d = i3;
            this.e = i5 + 1;
            return;
        }
        int i6 = i2 + 2;
        bArr[i2] = (byte) (i | 128);
        int i7 = i >>> 7;
        if ((i7 & (-128)) == 0) {
            bArr[i3] = (byte) i7;
            this.d = i6;
            this.e = i5 + 2;
            return;
        }
        int i8 = i2 + 3;
        bArr[i3] = (byte) (i7 | 128);
        int i9 = i >>> 14;
        if ((i9 & (-128)) == 0) {
            bArr[i6] = (byte) i9;
            this.d = i8;
            this.e = i5 + 3;
            return;
        }
        int i10 = i2 + 4;
        bArr[i6] = (byte) (i9 | 128);
        int i11 = i >>> 21;
        if ((i11 & (-128)) == 0) {
            bArr[i8] = (byte) i11;
            this.d = i10;
            this.e = i5 + 4;
        } else {
            bArr[i8] = (byte) (i11 | 128);
            bArr[i10] = (byte) (i >>> 28);
            this.d = i2 + 5;
            this.e = i5 + 5;
        }
    }

    final void C(long j) {
        int i = this.d;
        int i2 = i + 1;
        long j2 = j & (-128);
        int i3 = (int) j;
        int i4 = this.e;
        byte[] bArr = this.b;
        if (j2 == 0) {
            bArr[i] = (byte) i3;
            this.d = i2;
            this.e = i4 + 1;
            return;
        }
        int i5 = i + 2;
        bArr[i] = (byte) (i3 | 128);
        long j3 = j >>> 7;
        long j4 = j3 & (-128);
        int i6 = (int) j3;
        if (j4 == 0) {
            bArr[i2] = (byte) i6;
            this.d = i5;
            this.e = i4 + 2;
            return;
        }
        int i7 = i + 3;
        bArr[i2] = (byte) (i6 | 128);
        long j5 = j >>> 14;
        long j6 = j5 & (-128);
        int i8 = (int) j5;
        if (j6 == 0) {
            bArr[i5] = (byte) i8;
            this.d = i7;
            this.e = i4 + 3;
            return;
        }
        int i9 = i + 4;
        bArr[i5] = (byte) (i8 | 128);
        long j7 = j >>> 21;
        long j8 = j7 & (-128);
        int i10 = (int) j7;
        if (j8 == 0) {
            bArr[i7] = (byte) i10;
            this.d = i9;
            this.e = i4 + 4;
            return;
        }
        int i11 = i + 5;
        bArr[i7] = (byte) (i10 | 128);
        long j9 = j >>> 28;
        int i12 = (int) j9;
        if ((j9 & (-128)) == 0) {
            bArr[i9] = (byte) i12;
            this.d = i11;
            this.e = i4 + 5;
            return;
        }
        int i13 = i + 6;
        bArr[i9] = (byte) (i12 | 128);
        long j10 = j >>> 35;
        int i14 = (int) j10;
        if ((j10 & (-128)) == 0) {
            bArr[i11] = (byte) i14;
            this.d = i13;
            this.e = i4 + 6;
            return;
        }
        int i15 = i + 7;
        bArr[i11] = (byte) (i14 | 128);
        long j11 = j >>> 42;
        long j12 = j11 & (-128);
        int i16 = (int) j11;
        if (j12 == 0) {
            bArr[i13] = (byte) i16;
            this.d = i15;
            this.e = i4 + 7;
            return;
        }
        int i17 = i + 8;
        bArr[i13] = (byte) (i16 | 128);
        long j13 = j >>> 49;
        long j14 = j13 & (-128);
        int i18 = (int) j13;
        if (j14 == 0) {
            bArr[i15] = (byte) i18;
            this.d = i17;
            this.e = i4 + 8;
            return;
        }
        int i19 = i + 9;
        bArr[i15] = (byte) (i18 | 128);
        long j15 = j >>> 56;
        long j16 = j15 & (-128);
        int i20 = (int) j15;
        if (j16 == 0) {
            bArr[i17] = (byte) i20;
            this.d = i19;
            this.e = i4 + 9;
        } else {
            bArr[i17] = (byte) (i20 | 128);
            bArr[i19] = (byte) (j >>> 63);
            this.d = i + 10;
            this.e = i4 + 10;
        }
    }

    public final void D(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.c;
        int i4 = this.d;
        int i5 = i3 - i4;
        byte[] bArr2 = this.b;
        if (i5 >= i2) {
            java.lang.System.arraycopy(bArr, i, bArr2, i4, i2);
            this.d += i2;
            this.e += i2;
            return;
        }
        java.lang.System.arraycopy(bArr, i, bArr2, i4, i5);
        int i6 = i + i5;
        this.d = i3;
        this.e += i5;
        O();
        int i7 = i2 - i5;
        if (i7 <= i3) {
            java.lang.System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.d = i7;
        } else {
            this.f.write(bArr, i6, i7);
        }
        this.e += i7;
    }

    @Override // defpackage.abnn
    public final void a(byte[] bArr, int i, int i2) throws java.io.IOException {
        D(bArr, i, i2);
    }

    @Override // defpackage.abof
    public final int b() {
        throw new java.lang.UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // defpackage.abof
    public final void c() throws java.io.IOException {
        if (this.d > 0) {
            O();
        }
    }

    @Override // defpackage.abof
    public final void d(byte b) throws java.io.IOException {
        if (this.d == this.c) {
            O();
        }
        e(b);
    }

    final void e(byte b) {
        byte[] bArr = this.b;
        int i = this.d;
        bArr[i] = b;
        this.d = i + 1;
        this.e++;
    }

    @Override // defpackage.abof
    public final void f(int i, boolean z) throws java.io.IOException {
        P(11);
        B(i << 3);
        e(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.abof
    public final void g(int i, defpackage.abnv abnvVar) throws java.io.IOException {
        v((i << 3) | 2);
        h(abnvVar);
    }

    @Override // defpackage.abof
    public final void h(defpackage.abnv abnvVar) throws java.io.IOException {
        v(abnvVar.d());
        abnvVar.l(this);
    }

    @Override // defpackage.abof
    public final void i(int i, int i2) throws java.io.IOException {
        P(14);
        B((i << 3) | 5);
        z(i2);
    }

    @Override // defpackage.abof
    public final void j(int i) throws java.io.IOException {
        P(4);
        z(i);
    }

    @Override // defpackage.abof
    public final void k(int i, long j) throws java.io.IOException {
        P(18);
        B((i << 3) | 1);
        A(j);
    }

    @Override // defpackage.abof
    public final void l(long j) throws java.io.IOException {
        P(8);
        A(j);
    }

    @Override // defpackage.abof
    public final void m(int i, int i2) throws java.io.IOException {
        P(20);
        B(i << 3);
        if (i2 >= 0) {
            B(i2);
        } else {
            C(i2);
        }
    }

    @Override // defpackage.abof
    public final void n(int i) throws java.io.IOException {
        if (i >= 0) {
            v(i);
        } else {
            x(i);
        }
    }

    @Override // defpackage.abof
    public final void o(defpackage.abpy abpyVar) throws java.io.IOException {
        v(abpyVar.m());
        abpyVar.R(this);
    }

    @Override // defpackage.abof
    public final void p(int i, defpackage.abpy abpyVar) throws java.io.IOException {
        v(11);
        u(2, i);
        v(26);
        o(abpyVar);
        v(12);
    }

    @Override // defpackage.abof
    public final void q(int i, defpackage.abnv abnvVar) throws java.io.IOException {
        v(11);
        u(2, i);
        g(3, abnvVar);
        v(12);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void r(int i, java.lang.String str) throws java.io.IOException, abod {
        v((i << 3) | 2);
        s(str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void s(java.lang.String str) throws java.io.IOException, abod {
        int iBQ;
        int length = str.length() * 3;
        int iNumberOfLeadingZeros = (352 - (java.lang.Integer.numberOfLeadingZeros(length) * 9)) >>> 6;
        int i = iNumberOfLeadingZeros + length;
        int i2 = this.c;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int iBR = defpackage.ysr.bR(str, bArr, 0, length);
            v(iBR);
            D(bArr, 0, iBR);
            return;
        }
        if (i > i2 - this.d) {
            O();
        }
        int iNumberOfLeadingZeros2 = java.lang.Integer.numberOfLeadingZeros(str.length()) * 9;
        int i3 = this.d;
        int i4 = (352 - iNumberOfLeadingZeros2) >>> 6;
        try {
            if (i4 == iNumberOfLeadingZeros) {
                int i5 = i3 + i4;
                this.d = i5;
                int iBR2 = defpackage.ysr.bR(str, this.b, i5, i2 - i5);
                this.d = i3;
                iBQ = (iBR2 - i3) - i4;
                B(iBQ);
                this.d = iBR2;
            } else {
                iBQ = defpackage.ysr.bQ(str);
                B(iBQ);
                this.d = defpackage.ysr.bR(str, this.b, this.d, iBQ);
            }
            this.e += iBQ;
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw new abod(e);
        }
    }

    @Override // defpackage.abof
    public final void t(int i, int i2) throws java.io.IOException {
        v((i << 3) | i2);
    }

    @Override // defpackage.abof
    public final void u(int i, int i2) throws java.io.IOException {
        P(20);
        B(i << 3);
        B(i2);
    }

    @Override // defpackage.abof
    public final void v(int i) throws java.io.IOException {
        P(5);
        B(i);
    }

    @Override // defpackage.abof
    public final void w(int i, long j) throws java.io.IOException {
        P(20);
        B(i << 3);
        C(j);
    }

    @Override // defpackage.abof
    public final void x(long j) throws java.io.IOException {
        P(10);
        C(j);
    }

    @Override // defpackage.abof
    public final void y(byte[] bArr, int i) throws java.io.IOException {
        v(i);
        D(bArr, 0, i);
    }

    final void z(int i) {
        int i2 = this.d;
        byte[] bArr = this.b;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.d = i2 + 4;
        this.e += 4;
    }
}
