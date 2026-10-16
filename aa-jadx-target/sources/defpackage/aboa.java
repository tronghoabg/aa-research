package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aboa extends defpackage.abof {
    private final byte[] b;
    private final int c;
    private final int d;
    private int e;
    private final defpackage.abob f;

    public aboa(byte[] bArr, int i, int i2, defpackage.abob abobVar) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("buffer");
        }
        int i3 = i + i2;
        int length = bArr.length;
        if ((i | i2 | (length - i3)) < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
        this.b = bArr;
        this.c = i;
        this.e = i;
        this.d = i3;
        this.f = abobVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abnn
    public final void a(byte[] bArr, int i, int i2) throws java.io.IOException, abod {
        e(bArr, i, i2);
    }

    @Override // defpackage.abof
    public final int b() {
        return this.d - this.e;
    }

    @Override // defpackage.abof
    public final void c() {
        defpackage.abob abobVar = this.f;
        if (abobVar != null) {
            int i = this.e - this.c;
            ((java.nio.Buffer) abobVar.b).position(abobVar.a + i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void d(byte b) throws java.io.IOException, abod {
        int i = this.e;
        try {
            int i2 = i + 1;
            try {
                this.b[i] = b;
                this.e = i2;
            } catch (java.lang.IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new abod(i, this.d, 1, e);
            }
        } catch (java.lang.IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    public final void e(byte[] bArr, int i, int i2) throws java.io.IOException, abod {
        try {
            java.lang.System.arraycopy(bArr, i, this.b, this.e, i2);
            this.e += i2;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new abod(this.e, this.d, i2, e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void f(int i, boolean z) throws java.io.IOException, abod {
        v(i << 3);
        d(z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void g(int i, defpackage.abnv abnvVar) throws java.io.IOException, abod {
        v((i << 3) | 2);
        h(abnvVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void h(defpackage.abnv abnvVar) throws java.io.IOException, abod {
        v(abnvVar.d());
        abnvVar.l(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void i(int i, int i2) throws java.io.IOException, abod {
        v((i << 3) | 5);
        j(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void j(int i) throws java.io.IOException, abod {
        int i2 = this.e;
        try {
            byte[] bArr = this.b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.e = i2 + 4;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new abod(i2, this.d, 4, e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void k(int i, long j) throws java.io.IOException, abod {
        v((i << 3) | 1);
        l(j);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void l(long j) throws java.io.IOException, abod {
        int i = this.e;
        try {
            byte[] bArr = this.b;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.e = i + 8;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new abod(i, this.d, 8, e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void m(int i, int i2) throws java.io.IOException, abod {
        v(i << 3);
        n(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void n(int i) throws java.io.IOException, abod {
        if (i >= 0) {
            v(i);
            return;
        }
        int i2 = this.e;
        try {
            byte[] bArr = this.b;
            long j = i;
            int i3 = i2 + 1;
            try {
                bArr[i2] = (byte) (((int) j) | 128);
                int i4 = i2 + 2;
                try {
                    bArr[i3] = (byte) (((int) (j >>> 7)) | 128);
                    int i5 = i2 + 3;
                    bArr[i4] = (byte) (((int) (j >>> 14)) | 128);
                    i4 = i2 + 4;
                    bArr[i5] = (byte) (((int) (j >>> 21)) | 128);
                    int i6 = i2 + 5;
                    bArr[i4] = (byte) (((int) (j >>> 28)) | 128);
                    int i7 = i2 + 6;
                    try {
                        bArr[i6] = -1;
                        int i8 = i2 + 7;
                        bArr[i7] = -1;
                        i7 = i2 + 8;
                        bArr[i8] = -1;
                        i3 = i2 + 9;
                        bArr[i7] = -1;
                        i2 += 10;
                        bArr[i3] = 1;
                        this.e = i2;
                    } catch (java.lang.IndexOutOfBoundsException e) {
                        e = e;
                        i2 = i7;
                        throw new abod(i2, this.d, 10, e);
                    }
                } catch (java.lang.IndexOutOfBoundsException e2) {
                    e = e2;
                    i2 = i4;
                }
            } catch (java.lang.IndexOutOfBoundsException e3) {
                i2 = i3;
                e = e3;
            }
        } catch (java.lang.IndexOutOfBoundsException e4) {
            e = e4;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void o(defpackage.abpy abpyVar) throws java.io.IOException, abod {
        v(abpyVar.m());
        abpyVar.R(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void p(int i, defpackage.abpy abpyVar) throws java.io.IOException, abod {
        v(11);
        u(2, i);
        v(26);
        o(abpyVar);
        v(12);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void q(int i, defpackage.abnv abnvVar) throws java.io.IOException, abod {
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
        int i = this.e;
        try {
            int iNumberOfLeadingZeros = (352 - (java.lang.Integer.numberOfLeadingZeros(str.length()) * 9)) >>> 6;
            int i2 = i + iNumberOfLeadingZeros;
            this.e = i2;
            byte[] bArr = this.b;
            int iBR = (defpackage.ysr.bR(str, bArr, i2, bArr.length - i2) - i) - iNumberOfLeadingZeros;
            int iNumberOfLeadingZeros2 = (352 - (java.lang.Integer.numberOfLeadingZeros(iBR) * 9)) >>> 6;
            if (iNumberOfLeadingZeros2 != iNumberOfLeadingZeros) {
                java.lang.System.arraycopy(bArr, i2, bArr, i + iNumberOfLeadingZeros2, iBR);
            }
            this.e = i;
            v(iBR);
            this.e = i + iNumberOfLeadingZeros2 + iBR;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new abod(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void t(int i, int i2) throws java.io.IOException, abod {
        v((i << 3) | i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void u(int i, int i2) throws java.io.IOException, abod {
        v(i << 3);
        v(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void v(int i) throws java.io.IOException, abod {
        int i2 = this.e;
        int i3 = i & (-128);
        byte[] bArr = this.b;
        try {
            if (i3 == 0) {
                int i4 = i2 + 1;
                bArr[i2] = (byte) i;
                this.e = i4;
                return;
            }
            int i5 = i2 + 1;
            bArr[i2] = (byte) (i | 128);
            int i6 = i >>> 7;
            try {
                if ((i6 & (-128)) == 0) {
                    int i7 = i2 + 2;
                    bArr[i5] = (byte) i6;
                    this.e = i7;
                    return;
                }
                int i8 = i2 + 2;
                try {
                    bArr[i5] = (byte) (i6 | 128);
                    int i9 = i >>> 14;
                    if ((i9 & (-128)) == 0) {
                        int i10 = i2 + 3;
                        bArr[i8] = (byte) i9;
                        this.e = i10;
                        return;
                    }
                    int i11 = i2 + 3;
                    try {
                        bArr[i8] = (byte) (i9 | 128);
                        int i12 = i >>> 21;
                        if ((i12 & (-128)) == 0) {
                            int i13 = i2 + 4;
                            bArr[i11] = (byte) i12;
                            this.e = i13;
                            return;
                        } else {
                            i8 = i2 + 4;
                            bArr[i11] = (byte) (i12 | 128);
                            int i14 = i2 + 5;
                            bArr[i8] = (byte) (i >>> 28);
                            this.e = i14;
                            return;
                        }
                    } catch (java.lang.IndexOutOfBoundsException e) {
                        e = e;
                        i3 = i11;
                    }
                } catch (java.lang.IndexOutOfBoundsException e2) {
                    e = e2;
                    i3 = i8;
                }
                throw new abod(i3, this.d, 1, e);
            } catch (java.lang.IndexOutOfBoundsException e3) {
                i3 = i;
                e = e3;
            }
        } catch (java.lang.IndexOutOfBoundsException e4) {
            e = e4;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void w(int i, long j) throws java.io.IOException, abod {
        v(i << 3);
        x(j);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void x(long j) throws java.io.IOException, abod {
        long j2 = j & (-128);
        int i = this.e;
        byte[] bArr = this.b;
        try {
            if (j2 == 0) {
                bArr[i] = (byte) j;
                this.e = i + 1;
                return;
            }
            bArr[i] = (byte) (((int) j) | 128);
            int i2 = i + 1;
            long j3 = j >>> 7;
            long j4 = j3 & (-128);
            int i3 = (int) j3;
            if (j4 == 0) {
                bArr[i2] = (byte) i3;
                this.e = i + 2;
                return;
            }
            bArr[i2] = (byte) (i3 | 128);
            int i4 = i + 2;
            long j5 = j >>> 14;
            long j6 = j5 & (-128);
            int i5 = (int) j5;
            if (j6 == 0) {
                bArr[i4] = (byte) i5;
                this.e = i + 3;
                return;
            }
            bArr[i4] = (byte) (i5 | 128);
            int i6 = i + 3;
            long j7 = j >>> 21;
            long j8 = j7 & (-128);
            int i7 = (int) j7;
            if (j8 == 0) {
                bArr[i6] = (byte) i7;
                this.e = i + 4;
                return;
            }
            bArr[i6] = (byte) (i7 | 128);
            int i8 = i + 4;
            long j9 = j >>> 28;
            long j10 = j9 & (-128);
            int i9 = (int) j9;
            if (j10 == 0) {
                bArr[i8] = (byte) i9;
                this.e = i + 5;
                return;
            }
            bArr[i8] = (byte) (i9 | 128);
            int i10 = i + 5;
            long j11 = j >>> 35;
            long j12 = j11 & (-128);
            int i11 = (int) j11;
            if (j12 == 0) {
                bArr[i10] = (byte) i11;
                this.e = i + 6;
                return;
            }
            bArr[i10] = (byte) (i11 | 128);
            int i12 = i + 6;
            long j13 = j >>> 42;
            long j14 = j13 & (-128);
            int i13 = (int) j13;
            if (j14 == 0) {
                bArr[i12] = (byte) i13;
                this.e = i + 7;
                return;
            }
            bArr[i12] = (byte) (i13 | 128);
            int i14 = i + 7;
            long j15 = j >>> 49;
            long j16 = j15 & (-128);
            int i15 = (int) j15;
            if (j16 == 0) {
                bArr[i14] = (byte) i15;
                this.e = i + 8;
                return;
            }
            bArr[i14] = (byte) (i15 | 128);
            int i16 = i + 8;
            long j17 = j >>> 56;
            int i17 = (int) j17;
            if (((-128) & j17) == 0) {
                bArr[i16] = (byte) i17;
                this.e = i + 9;
            } else {
                bArr[i16] = (byte) (i17 | 128);
                bArr[i + 9] = (byte) (j >>> 63);
                this.e = i + 10;
            }
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new abod(i, this.d, 1, e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abod */
    @Override // defpackage.abof
    public final void y(byte[] bArr, int i) throws java.io.IOException, abod {
        v(i);
        e(bArr, 0, i);
    }
}
