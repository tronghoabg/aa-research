package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class ae extends q {

    /* renamed from: a, reason: collision with root package name */
    Object f12644a;

    /* synthetic */ ae(byte[] bArr) {
    }

    public static int F(int i2, v vVar) {
        return U(i2) + G(vVar);
    }

    public static int G(v vVar) {
        return L(vVar.c());
    }

    public static int H(int i2, int i3) {
        return U(i2) + J(i3);
    }

    public static int I(int i2, int i3) {
        return U(i2) + J(i3);
    }

    public static int J(int i2) {
        return Y(i2);
    }

    public static int K(int i2, long j2) {
        return U(i2) + Y(j2);
    }

    static int L(int i2) {
        return W(i2) + i2;
    }

    public static int M(fi fiVar) {
        return L(fiVar.getSerializedSize());
    }

    static int N(int i2) {
        if (i2 > 4096) {
            return 4096;
        }
        return i2;
    }

    public static int O(int i2, int i3) {
        return U(i2) + P(i3);
    }

    public static int P(int i2) {
        return W(Z(i2));
    }

    public static int Q(int i2, long j2) {
        return U(i2) + R(j2);
    }

    public static int R(long j2) {
        return Y(aa(j2));
    }

    public static int S(int i2, String str) {
        return U(i2) + T(str);
    }

    public static int T(String str) {
        return L(dc.t(str));
    }

    public static int U(int i2) {
        return W(go.c(i2, 0));
    }

    public static int V(int i2, int i3) {
        return U(i2) + W(i3);
    }

    public static int W(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int X(int i2, long j2) {
        return U(i2) + Y(j2);
    }

    public static int Y(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public static int Z(int i2) {
        return (i2 >> 31) ^ (i2 + i2);
    }

    public static long aa(long j2) {
        return (j2 >> 63) ^ (j2 + j2);
    }

    public static ae ab(byte[] bArr) {
        return new ab(bArr, 0, bArr.length);
    }

    public static ae ac(byte[] bArr, int i2, int i3) {
        return new ab(bArr, i2, i3);
    }

    public static int an(int i2) {
        return U(i2) + 1;
    }

    public static int ao(int i2) {
        return U(i2) + 8;
    }

    public static int ap(int i2) {
        return U(i2) + 4;
    }

    public static int aq(int i2) {
        return U(i2) + 8;
    }

    public static int ar(int i2) {
        return U(i2) + 4;
    }

    public static int as(int i2) {
        return U(i2) + 4;
    }

    public static int at(int i2) {
        return U(i2) + 8;
    }

    public final void ad() {
        if (b() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (b() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public final void ae(int i2, double d2) {
        k(i2, Double.doubleToRawLongBits(d2));
    }

    public final void af(double d2) {
        l(Double.doubleToRawLongBits(d2));
    }

    public final void ag(int i2, float f2) {
        i(i2, Float.floatToRawIntBits(f2));
    }

    public final void ah(float f2) {
        j(Float.floatToRawIntBits(f2));
    }

    @Deprecated
    public final void ai(fi fiVar) {
        fiVar.writeTo(this);
    }

    public final void aj(int i2, int i3) {
        u(i2, Z(i3));
    }

    public final void ak(int i2) {
        v(Z(i2));
    }

    public final void al(int i2, long j2) {
        w(i2, aa(j2));
    }

    public final void am(long j2) {
        x(aa(j2));
    }

    public abstract int b();

    public abstract void c();

    public abstract void d(byte b2);

    public abstract void f(int i2, boolean z);

    public abstract void g(int i2, v vVar);

    public abstract void h(v vVar);

    public abstract void i(int i2, int i3);

    public abstract void j(int i2);

    public abstract void k(int i2, long j2);

    public abstract void l(long j2);

    public abstract void m(int i2, int i3);

    public abstract void n(int i2);

    public abstract void o(fi fiVar);

    public abstract void p(int i2, fi fiVar);

    public abstract void q(int i2, v vVar);

    public abstract void r(int i2, String str);

    public abstract void s(String str);

    public abstract void t(int i2, int i3);

    public abstract void u(int i2, int i3);

    public abstract void v(int i2);

    public abstract void w(int i2, long j2);

    public abstract void x(long j2);

    abstract void y(byte[] bArr, int i2);

    private ae() {
        throw null;
    }
}
