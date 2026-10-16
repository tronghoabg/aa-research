package defpackage;

/* loaded from: classes.dex */
public final class m9 {
    public static final int[] n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public final byte[] a;
    public int b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int[] l;
    public int m;

    public m9() {
        this.a = new byte[4];
        this.b = 0;
    }

    public static int a(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    public static int b(int i, int i2, int i3) {
        return ((i ^ i2) & i3) | (i & i2);
    }

    public static int c(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    public static int d(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    public final void e(m9 m9Var) {
        byte[] bArr = m9Var.a;
        System.arraycopy(bArr, 0, this.a, 0, bArr.length);
        this.b = m9Var.b;
        this.c = m9Var.c;
        this.d = m9Var.d;
        this.e = m9Var.e;
        this.f = m9Var.f;
        this.g = m9Var.g;
        this.h = m9Var.h;
        this.i = m9Var.i;
        this.j = m9Var.j;
        this.k = m9Var.k;
        int[] iArr = m9Var.l;
        System.arraycopy(iArr, 0, this.l, 0, iArr.length);
        this.m = m9Var.m;
    }

    public final void f(int i, byte[] bArr) {
        long j = this.c << 3;
        byte b = -128;
        while (true) {
            j(b);
            if (this.b == 0) {
                break;
            } else {
                b = 0;
            }
        }
        if (this.m > 14) {
            g();
        }
        int[] iArr = this.l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
        g();
        w1.m(bArr, this.d, i);
        w1.m(bArr, this.e, i + 4);
        w1.m(bArr, this.f, i + 8);
        w1.m(bArr, this.g, i + 12);
        w1.m(bArr, this.h, i + 16);
        w1.m(bArr, this.i, i + 20);
        w1.m(bArr, this.j, i + 24);
        w1.m(bArr, this.k, i + 28);
        i();
    }

    public final void g() {
        int[] iArr = this.l;
        for (int i = 16; i <= 63; i++) {
            int i2 = iArr[i - 2];
            int i3 = ((i2 >>> 10) ^ (((i2 >>> 17) | (i2 << 15)) ^ ((i2 >>> 19) | (i2 << 13)))) + iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = i3 + ((i4 >>> 3) ^ (((i4 >>> 7) | (i4 << 25)) ^ ((i4 >>> 18) | (i4 << 14)))) + iArr[i - 16];
        }
        int iB = this.d;
        int iB2 = this.e;
        int iB3 = this.f;
        int iB4 = this.g;
        int i5 = this.h;
        int i6 = this.i;
        int i7 = this.j;
        int i8 = this.k;
        int i9 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            int iA = a(i5, i6, i7) + d(i5);
            int[] iArr2 = n;
            int i11 = iA + iArr2[i9] + iArr[i9] + i8;
            int i12 = iB4 + i11;
            int iB5 = b(iB, iB2, iB3) + c(iB) + i11;
            int i13 = i9 + 1;
            int iA2 = a(i12, i5, i6) + d(i12) + iArr2[i13] + iArr[i13] + i7;
            int i14 = iB3 + iA2;
            int iB6 = b(iB5, iB, iB2) + c(iB5) + iA2;
            int i15 = i9 + 2;
            int iA3 = a(i14, i12, i5) + d(i14) + iArr2[i15] + iArr[i15] + i6;
            int i16 = iB2 + iA3;
            int iB7 = b(iB6, iB5, iB) + c(iB6) + iA3;
            int i17 = i9 + 3;
            int iA4 = a(i16, i14, i12) + d(i16) + iArr2[i17] + iArr[i17] + i5;
            int i18 = iB + iA4;
            int iB8 = b(iB7, iB6, iB5) + c(iB7) + iA4;
            int i19 = i9 + 4;
            int iA5 = a(i18, i16, i14) + d(i18) + iArr2[i19] + iArr[i19] + i12;
            i8 = iB5 + iA5;
            iB4 = b(iB8, iB7, iB6) + c(iB8) + iA5;
            int i20 = i9 + 5;
            int iA6 = a(i8, i18, i16) + d(i8) + iArr2[i20] + iArr[i20] + i14;
            i7 = iB6 + iA6;
            iB3 = b(iB4, iB8, iB7) + c(iB4) + iA6;
            int i21 = i9 + 6;
            int iA7 = a(i7, i8, i18) + d(i7) + iArr2[i21] + iArr[i21] + i16;
            i6 = iB7 + iA7;
            iB2 = b(iB3, iB4, iB8) + c(iB3) + iA7;
            int i22 = i9 + 7;
            int iA8 = a(i6, i7, i8) + d(i6) + iArr2[i22] + iArr[i22] + i18;
            i5 = iB8 + iA8;
            iB = b(iB2, iB3, iB4) + c(iB2) + iA8;
            i9 += 8;
        }
        this.d += iB;
        this.e += iB2;
        this.f += iB3;
        this.g += iB4;
        this.h += i5;
        this.i += i6;
        this.j += i7;
        this.k += i8;
        this.m = 0;
        for (int i23 = 0; i23 < 16; i23++) {
            iArr[i23] = 0;
        }
    }

    public final void h(int i, byte[] bArr) {
        this.l[this.m] = w1.c(i, bArr);
        int i2 = this.m + 1;
        this.m = i2;
        if (i2 == 16) {
            g();
        }
    }

    public final void i() {
        this.c = 0L;
        this.b = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.d = 1779033703;
        this.e = -1150833019;
        this.f = 1013904242;
        this.g = -1521486534;
        this.h = 1359893119;
        this.i = -1694144372;
        this.j = 528734635;
        this.k = 1541459225;
        this.m = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.l;
            if (i2 == iArr.length) {
                return;
            }
            iArr[i2] = 0;
            i2++;
        }
    }

    public final void j(byte b) {
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte[] bArr = this.a;
        bArr[i] = b;
        if (i2 == bArr.length) {
            h(0, bArr);
            this.b = 0;
        }
        this.c++;
    }

    public final void k(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int iMax = Math.max(0, i2);
        int i4 = this.b;
        byte[] bArr2 = this.a;
        if (i4 != 0) {
            int i5 = 0;
            while (true) {
                if (i5 >= iMax) {
                    i3 = i5;
                    break;
                }
                int i6 = this.b;
                int i7 = i6 + 1;
                this.b = i7;
                int i8 = i5 + 1;
                bArr2[i6] = bArr[i5 + i];
                if (i7 == 4) {
                    h(0, bArr2);
                    this.b = 0;
                    i3 = i8;
                    break;
                }
                i5 = i8;
            }
        }
        int i9 = iMax - 3;
        while (i3 < i9) {
            h(i + i3, bArr);
            i3 += 4;
        }
        while (i3 < iMax) {
            int i10 = this.b;
            this.b = i10 + 1;
            bArr2[i10] = bArr[i3 + i];
            i3++;
        }
        this.c += iMax;
    }

    public m9(m9 m9Var) {
        byte[] bArr = new byte[4];
        this.a = bArr;
        byte[] bArr2 = m9Var.a;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.b = m9Var.b;
        this.c = m9Var.c;
    }
}
