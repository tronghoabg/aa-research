package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;
import java.util.BitSet;

/* loaded from: classes3.dex */
public final class usp {
    final int a;
    int b;
    BitSet c;
    BitSet d;
    int[] e;
    int f;
    int[] g;
    int[] h;
    int i;
    int[] j;
    int[] k;
    int l;
    int m;

    public usp(int i, int i2) {
        woy.Z(i > 0);
        woy.Z(i2 > 0);
        this.a = i;
        this.b = i2;
        this.c = new BitSet(i2);
        this.d = new BitSet(i * i2);
        this.f = -1;
        int[] iArr = new int[1024];
        this.g = iArr;
        this.h = new int[1024];
        this.i = -1;
        this.j = new int[i2];
        this.l = -1;
        this.m = 0;
        Arrays.fill(iArr, -1);
        Arrays.fill(this.h, -1);
        Arrays.fill(this.j, -1);
        this.k = new int[usn.f * 1024];
        for (int i3 = 0; i3 < 1024; i3++) {
            n(i3);
        }
        this.e = new int[uso.g * 128];
        for (int i4 = 0; i4 < 128; i4++) {
            o(i4);
        }
    }

    public static final int B(BitSet bitSet, int i, int i2, int i3) {
        while (i >= 0 && i2 - i >= i3) {
            int iNextSetBit = bitSet.nextSetBit(i);
            if (iNextSetBit == -1 || iNextSetBit - i >= i3) {
                return i;
            }
            i = bitSet.nextClearBit(iNextSetBit);
        }
        return -1;
    }

    final void A(int i, int i2) {
        uso.c.b(this.e, i, i2);
    }

    @ResultIgnorabilityUnspecified
    public final int a(int i, int i2) {
        int iB;
        int iK;
        int i3;
        int i4;
        int i5;
        boolean z = i2 > 0;
        woy.Z(z);
        int i6 = this.a;
        if (i <= i6) {
            int iG = this.g[i2];
            if (iG >= 0) {
                iB = -1;
                iK = -1;
                i3 = -1;
                i4 = -1;
                while (iG != -1) {
                    i4 = i(iG);
                    if (i4 + i <= i6 && uso.f.a(this.e, iG) > i) {
                        iK = k(iG);
                        i3 = iK * i6;
                        iB = B(this.d, i3, i3 + i6, i);
                        if (iB != -1) {
                            break;
                        }
                        z(iG, i);
                    }
                    iG = g(iG);
                }
            } else {
                iB = -1;
                iK = -1;
                i3 = -1;
                i4 = -1;
            }
            if (iB == -1) {
                woy.Z(z);
                int iB2 = B(this.c, 0, this.b, i2);
                if (iB2 == -1) {
                    iG = -1;
                } else {
                    if (this.f == -1) {
                        int length = this.e.length;
                        int i7 = uso.g;
                        int i8 = length / i7;
                        int i9 = i8 + 128;
                        this.e = Arrays.copyOf(this.e, i7 * i9);
                        while (i8 < i9) {
                            o(i8);
                            i8++;
                        }
                    }
                    iG = this.f;
                    this.f = g(iG);
                    v(iG, -1);
                    A(iG, iB2);
                    y(iG, i2);
                    this.c.set(iB2, iB2 + i2);
                    this.j[iB2] = iG;
                }
                if (iG != -1) {
                    l(iG, i2);
                    iK = k(iG);
                    iB = iK * i6;
                    i4 = 0;
                    i3 = iB;
                }
                i5 = -1;
            }
            int i10 = i + iB;
            if (this.l == -1) {
                int length2 = this.k.length;
                int i11 = usn.f;
                int i12 = length2 / i11;
                int i13 = i12 + 1024;
                this.k = Arrays.copyOf(this.k, i11 * i13);
                while (i12 < i13) {
                    n(i12);
                    i12++;
                }
            }
            int i14 = i10 - iB;
            i5 = this.l;
            this.l = usn.a.a(this.k, i5);
            u(i5, -1);
            s(i5, iB - i3);
            t(i5, iK);
            r(i5, i14);
            q(i5, i2);
            int i15 = i4 + i14;
            x(iG, i15);
            if (i15 == i6) {
                p(iG, i2);
                woy.Z(iG >= 0);
                woy.Z(iG < j());
                woy.Z(g(iG) == -1);
                woy.Z(h(iG) == -1);
                int i16 = this.i;
                w(iG, -1);
                v(iG, i16);
                if (i16 != -1) {
                    w(i16, iG);
                }
                this.i = iG;
            }
            this.d.set(iB, i10);
        } else {
            i5 = -1;
        }
        if (i5 != -1) {
            this.m++;
        }
        return i5;
    }

    public final int b(int i) {
        return usn.e.a(this.k, i);
    }

    final int c() {
        return this.k.length / usn.f;
    }

    public final int d(int i) {
        return usn.d.a(this.k, i);
    }

    public final int e(int i) {
        return usn.b.a(this.k, i);
    }

    public final int f(int i) {
        return usn.c.a(this.k, i);
    }

    final int g(int i) {
        return uso.a.a(this.e, i);
    }

    final int h(int i) {
        return uso.b.a(this.e, i);
    }

    final int i(int i) {
        return uso.e.a(this.e, i);
    }

    final int j() {
        return this.e.length / uso.g;
    }

    final int k(int i) {
        return uso.c.a(this.e, i);
    }

    final void l(int i, int i2) {
        woy.Z(i >= 0);
        woy.Z(i < j());
        woy.Z(i2 > 0);
        woy.Z(g(i) == -1);
        woy.Z(h(i) == -1);
        int[] iArr = this.h;
        int i3 = iArr[i2];
        if (i3 == -1) {
            this.g[i2] = i;
            iArr[i2] = i;
        } else {
            w(i, i3);
            v(i, -1);
            v(i3, i);
            this.h[i2] = i;
        }
    }

    final void m(int i, int i2) {
        woy.Z(i >= 0);
        woy.Z(i < j());
        woy.Z(i2 > 0);
        woy.Z(i(i) == 0);
        int iK = k(i);
        this.j[iK] = -1;
        this.c.clear(iK, i2 + iK);
        o(i);
    }

    final void n(int i) {
        woy.Z(i >= 0);
        woy.Z(i < c());
        s(i, 0);
        t(i, 0);
        r(i, 0);
        q(i, 0);
        u(i, this.l);
        this.l = i;
    }

    final void o(int i) {
        woy.Z(i >= 0);
        woy.Z(i < j());
        A(i, 0);
        y(i, 0);
        x(i, 0);
        z(i, this.a);
        v(i, this.f);
        w(i, -1);
        this.f = i;
    }

    final void p(int i, int i2) {
        boolean z;
        boolean z2;
        woy.Z(i >= 0);
        woy.Z(i < j());
        woy.Z(i2 > 0);
        int iH = h(i);
        int iG = g(i);
        if (iH == -1) {
            z = this.g[i2] == i;
            iH = -1;
        } else {
            z = true;
        }
        woy.Z(z);
        if (iG == -1) {
            z2 = this.h[i2] == i;
            iG = -1;
        } else {
            z2 = true;
        }
        woy.Z(z2);
        int[] iArr = this.g;
        if (i == iArr[i2]) {
            if (iG >= 0) {
                iArr[i2] = iG;
            } else {
                iArr[i2] = -1;
            }
        }
        int[] iArr2 = this.h;
        if (i == iArr2[i2]) {
            if (iH >= 0) {
                iArr2[i2] = iH;
            } else {
                iArr2[i2] = -1;
            }
        }
        if (iH != -1) {
            v(iH, iG);
        }
        if (iG != -1) {
            w(iG, iH);
        }
        w(i, -1);
        v(i, -1);
    }

    final void q(int i, int i2) {
        usn.e.b(this.k, i, i2);
    }

    final void r(int i, int i2) {
        usn.d.b(this.k, i, i2);
    }

    final void s(int i, int i2) {
        usn.b.b(this.k, i, i2);
    }

    final void t(int i, int i2) {
        usn.c.b(this.k, i, i2);
    }

    final void u(int i, int i2) {
        usn.a.b(this.k, i, i2);
    }

    final void v(int i, int i2) {
        uso.a.b(this.e, i, i2);
    }

    final void w(int i, int i2) {
        uso.b.b(this.e, i, i2);
    }

    final void x(int i, int i2) {
        uso.e.b(this.e, i, i2);
    }

    final void y(int i, int i2) {
        uso.d.b(this.e, i, i2);
    }

    final void z(int i, int i2) {
        uso.f.b(this.e, i, i2);
    }
}
