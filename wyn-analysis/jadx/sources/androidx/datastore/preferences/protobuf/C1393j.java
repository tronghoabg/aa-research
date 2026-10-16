package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import od.Y0;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1393j extends Q {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f18227h = Logger.getLogger(C1393j.class.getName());

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f18228i = s0.f18266f;

    /* renamed from: c, reason: collision with root package name */
    public J f18229c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f18230d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18231e;

    /* renamed from: f, reason: collision with root package name */
    public int f18232f;

    /* renamed from: g, reason: collision with root package name */
    public final Y0 f18233g;

    public C1393j(Y0 y02, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i5, 20);
        this.f18230d = new byte[iMax];
        this.f18231e = iMax;
        this.f18233g = y02;
    }

    public static int A(long j8) {
        int i5;
        if (((-128) & j8) == 0) {
            return 1;
        }
        if (j8 < 0) {
            return 10;
        }
        if (((-34359738368L) & j8) != 0) {
            j8 >>>= 28;
            i5 = 6;
        } else {
            i5 = 2;
        }
        if (((-2097152) & j8) != 0) {
            i5 += 2;
            j8 >>>= 14;
        }
        return (j8 & (-16384)) != 0 ? i5 + 1 : i5;
    }

    public static int r(int i5, C1390g c1390g) {
        return s(c1390g) + y(i5);
    }

    public static int s(C1390g c1390g) {
        int size = c1390g.size();
        return z(size) + size;
    }

    public static int t(int i5) {
        return y(i5) + 4;
    }

    public static int u(int i5) {
        return y(i5) + 8;
    }

    public static int v(int i5, AbstractC1382a abstractC1382a, InterfaceC1385b0 interfaceC1385b0) {
        return abstractC1382a.b(interfaceC1385b0) + (y(i5) * 2);
    }

    public static int w(int i5) {
        if (i5 >= 0) {
            return z(i5);
        }
        return 10;
    }

    public static int x(String str) {
        int length;
        try {
            length = v0.b(str);
        } catch (u0 unused) {
            length = str.getBytes(AbstractC1407y.f18274a).length;
        }
        return z(length) + length;
    }

    public static int y(int i5) {
        return z(i5 << 3);
    }

    public static int z(int i5) {
        if ((i5 & (-128)) == 0) {
            return 1;
        }
        if ((i5 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i5) == 0) {
            return 3;
        }
        return (i5 & (-268435456)) == 0 ? 4 : 5;
    }

    public final void B() {
        this.f18233g.write(this.f18230d, 0, this.f18232f);
        this.f18232f = 0;
    }

    public final void C(int i5) {
        if (this.f18231e - this.f18232f < i5) {
            B();
        }
    }

    public final void D(byte b5) {
        if (this.f18232f == this.f18231e) {
            B();
        }
        int i5 = this.f18232f;
        this.f18232f = i5 + 1;
        this.f18230d[i5] = b5;
    }

    public final void E(byte[] bArr, int i5, int i10) {
        int i11 = this.f18232f;
        int i12 = this.f18231e;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f18230d;
        if (i13 >= i10) {
            System.arraycopy(bArr, i5, bArr2, i11, i10);
            this.f18232f += i10;
            return;
        }
        System.arraycopy(bArr, i5, bArr2, i11, i13);
        int i14 = i5 + i13;
        int i15 = i10 - i13;
        this.f18232f = i12;
        B();
        if (i15 > i12) {
            this.f18233g.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f18232f = i15;
        }
    }

    public final void F(int i5, boolean z2) {
        C(11);
        o(i5, 0);
        byte b5 = z2 ? (byte) 1 : (byte) 0;
        int i10 = this.f18232f;
        this.f18232f = i10 + 1;
        this.f18230d[i10] = b5;
    }

    public final void G(int i5, C1390g c1390g) {
        R(i5, 2);
        H(c1390g);
    }

    public final void H(C1390g c1390g) {
        T(c1390g.size());
        l(c1390g.f18206b, c1390g.b(), c1390g.size());
    }

    public final void I(int i5, int i10) {
        C(14);
        o(i5, 5);
        m(i10);
    }

    public final void J(int i5) {
        C(4);
        m(i5);
    }

    public final void K(int i5, long j8) {
        C(18);
        o(i5, 1);
        n(j8);
    }

    public final void L(long j8) {
        C(8);
        n(j8);
    }

    public final void M(int i5, int i10) {
        C(20);
        o(i5, 0);
        if (i10 >= 0) {
            p(i10);
        } else {
            q(i10);
        }
    }

    public final void N(int i5) {
        if (i5 >= 0) {
            T(i5);
        } else {
            V(i5);
        }
    }

    public final void O(int i5, AbstractC1382a abstractC1382a, InterfaceC1385b0 interfaceC1385b0) {
        R(i5, 2);
        T(abstractC1382a.b(interfaceC1385b0));
        interfaceC1385b0.c(abstractC1382a, this.f18229c);
    }

    public final void P(int i5, String str) throws C1392i {
        R(i5, 2);
        Q(str);
    }

    public final void Q(String str) throws C1392i {
        try {
            int length = str.length() * 3;
            int iZ = z(length);
            int i5 = iZ + length;
            int i10 = this.f18231e;
            if (i5 > i10) {
                byte[] bArr = new byte[length];
                int iF = v0.f18273a.f(0, length, str, bArr);
                T(iF);
                E(bArr, 0, iF);
                return;
            }
            if (i5 > i10 - this.f18232f) {
                B();
            }
            int iZ2 = z(str.length());
            int i11 = this.f18232f;
            byte[] bArr2 = this.f18230d;
            try {
                if (iZ2 == iZ) {
                    int i12 = i11 + iZ2;
                    this.f18232f = i12;
                    int iF2 = v0.f18273a.f(i12, i10 - i12, str, bArr2);
                    this.f18232f = i11;
                    p((iF2 - i11) - iZ2);
                    this.f18232f = iF2;
                } else {
                    int iB = v0.b(str);
                    p(iB);
                    this.f18232f = v0.f18273a.f(this.f18232f, iB, str, bArr2);
                }
            } catch (u0 e7) {
                this.f18232f = i11;
                throw e7;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new C1392i(e10);
            }
        } catch (u0 e11) {
            f18227h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
            byte[] bytes = str.getBytes(AbstractC1407y.f18274a);
            try {
                T(bytes.length);
                l(bytes, 0, bytes.length);
            } catch (C1392i e12) {
                throw e12;
            } catch (IndexOutOfBoundsException e13) {
                throw new C1392i(e13);
            }
        }
    }

    public final void R(int i5, int i10) {
        T((i5 << 3) | i10);
    }

    public final void S(int i5, int i10) {
        C(20);
        o(i5, 0);
        p(i10);
    }

    public final void T(int i5) {
        C(5);
        p(i5);
    }

    public final void U(int i5, long j8) {
        C(20);
        o(i5, 0);
        q(j8);
    }

    public final void V(long j8) {
        C(10);
        q(j8);
    }

    @Override // androidx.datastore.preferences.protobuf.Q
    public final void l(byte[] bArr, int i5, int i10) {
        E(bArr, i5, i10);
    }

    public final void m(int i5) {
        int i10 = this.f18232f;
        int i11 = i10 + 1;
        this.f18232f = i11;
        byte[] bArr = this.f18230d;
        bArr[i10] = (byte) (i5 & 255);
        int i12 = i10 + 2;
        this.f18232f = i12;
        bArr[i11] = (byte) ((i5 >> 8) & 255);
        int i13 = i10 + 3;
        this.f18232f = i13;
        bArr[i12] = (byte) ((i5 >> 16) & 255);
        this.f18232f = i10 + 4;
        bArr[i13] = (byte) ((i5 >> 24) & 255);
    }

    public final void n(long j8) {
        int i5 = this.f18232f;
        int i10 = i5 + 1;
        this.f18232f = i10;
        byte[] bArr = this.f18230d;
        bArr[i5] = (byte) (j8 & 255);
        int i11 = i5 + 2;
        this.f18232f = i11;
        bArr[i10] = (byte) ((j8 >> 8) & 255);
        int i12 = i5 + 3;
        this.f18232f = i12;
        bArr[i11] = (byte) ((j8 >> 16) & 255);
        int i13 = i5 + 4;
        this.f18232f = i13;
        bArr[i12] = (byte) (255 & (j8 >> 24));
        int i14 = i5 + 5;
        this.f18232f = i14;
        bArr[i13] = (byte) (((int) (j8 >> 32)) & 255);
        int i15 = i5 + 6;
        this.f18232f = i15;
        bArr[i14] = (byte) (((int) (j8 >> 40)) & 255);
        int i16 = i5 + 7;
        this.f18232f = i16;
        bArr[i15] = (byte) (((int) (j8 >> 48)) & 255);
        this.f18232f = i5 + 8;
        bArr[i16] = (byte) (((int) (j8 >> 56)) & 255);
    }

    public final void o(int i5, int i10) {
        p((i5 << 3) | i10);
    }

    public final void p(int i5) {
        boolean z2 = f18228i;
        byte[] bArr = this.f18230d;
        if (z2) {
            while ((i5 & (-128)) != 0) {
                int i10 = this.f18232f;
                this.f18232f = i10 + 1;
                s0.j(bArr, i10, (byte) ((i5 & 127) | 128));
                i5 >>>= 7;
            }
            int i11 = this.f18232f;
            this.f18232f = i11 + 1;
            s0.j(bArr, i11, (byte) i5);
            return;
        }
        while ((i5 & (-128)) != 0) {
            int i12 = this.f18232f;
            this.f18232f = i12 + 1;
            bArr[i12] = (byte) ((i5 & 127) | 128);
            i5 >>>= 7;
        }
        int i13 = this.f18232f;
        this.f18232f = i13 + 1;
        bArr[i13] = (byte) i5;
    }

    public final void q(long j8) {
        boolean z2 = f18228i;
        byte[] bArr = this.f18230d;
        if (z2) {
            while ((j8 & (-128)) != 0) {
                int i5 = this.f18232f;
                this.f18232f = i5 + 1;
                s0.j(bArr, i5, (byte) ((((int) j8) & 127) | 128));
                j8 >>>= 7;
            }
            int i10 = this.f18232f;
            this.f18232f = i10 + 1;
            s0.j(bArr, i10, (byte) j8);
            return;
        }
        while ((j8 & (-128)) != 0) {
            int i11 = this.f18232f;
            this.f18232f = i11 + 1;
            bArr[i11] = (byte) ((((int) j8) & 127) | 128);
            j8 >>>= 7;
        }
        int i12 = this.f18232f;
        this.f18232f = i12 + 1;
        bArr[i12] = (byte) j8;
    }
}
