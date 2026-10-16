package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class eiw extends eii {
    private static final Logger a = Logger.getLogger(eiw.class.getName());
    public static final boolean e = elf.b;
    public Object f;

    public static int E(int i, eip eipVar) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + F(eipVar);
    }

    public static int F(eip eipVar) {
        int iC = eipVar.c();
        return ((352 - (Integer.numberOfLeadingZeros(iC) * 9)) >>> 6) + iC;
    }

    public static int G(int i, int i2) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + I(i2);
    }

    public static int H(int i, int i2) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + I(i2);
    }

    public static int I(int i) {
        return (640 - (Long.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int J(int i, long j) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6);
    }

    public static int K(int i, int i2) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((352 - (Integer.numberOfLeadingZeros((i2 >> 31) ^ (i2 + i2)) * 9)) >>> 6);
    }

    public static int L(int i, long j) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros((j >> 63) ^ (j + j)) * 9)) >>> 6);
    }

    public static int M(int i, String str) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + N(str);
    }

    public static int N(String str) {
        int length;
        try {
            length = elk.b(str);
        } catch (eli unused) {
            length = str.getBytes(ejn.a).length;
        }
        return ((352 - (Integer.numberOfLeadingZeros(length) * 9)) >>> 6) + length;
    }

    public static int O(int i, int i2) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6);
    }

    public static int P(int i, long j) {
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + ((640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6);
    }

    public abstract void A(int i, long j) throws IOException;

    public abstract void B(long j) throws IOException;

    public abstract void C(byte[] bArr, int i) throws IOException;

    final void Q(String str, eli eliVar) throws IOException {
        a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) eliVar);
        byte[] bytes = str.getBytes(ejn.a);
        try {
            int length = bytes.length;
            z(length);
            a(bytes, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new eiv(e2);
        }
    }

    public final void R(int i, double d) throws IOException {
        o(i, Double.doubleToRawLongBits(d));
    }

    public final void S(double d) throws IOException {
        p(Double.doubleToRawLongBits(d));
    }

    public final void T(int i, float f) throws IOException {
        m(i, Float.floatToRawIntBits(f));
    }

    public final void U(float f) throws IOException {
        n(Float.floatToRawIntBits(f));
    }

    @Override // defpackage.eii
    public abstract void a(byte[] bArr, int i) throws IOException;

    public abstract int b();

    public abstract void i(byte b) throws IOException;

    public abstract void j(int i, boolean z) throws IOException;

    public abstract void k(int i, eip eipVar) throws IOException;

    public abstract void l(eip eipVar) throws IOException;

    public abstract void m(int i, int i2) throws IOException;

    public abstract void n(int i) throws IOException;

    public abstract void o(int i, long j) throws IOException;

    public abstract void p(long j) throws IOException;

    public abstract void q(int i, int i2) throws IOException;

    public abstract void r(int i) throws IOException;

    public abstract void s(eke ekeVar) throws IOException;

    public abstract void t(int i, eke ekeVar) throws IOException;

    public abstract void u(int i, eip eipVar) throws IOException;

    public abstract void v(int i, String str) throws IOException;

    public abstract void w(String str) throws IOException;

    public abstract void x(int i, int i2) throws IOException;

    public abstract void y(int i, int i2) throws IOException;

    public abstract void z(int i) throws IOException;
}
