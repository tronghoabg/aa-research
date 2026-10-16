package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class abnd extends abmk {
    public Object a;

    public static int E(abms abmsVar) {
        int iD = abmsVar.d();
        return ((352 - (Integer.numberOfLeadingZeros(iD) * 9)) >>> 6) + iD;
    }

    public static int F(int i) {
        return (640 - (Long.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int G(abow abowVar) {
        int iM = abowVar.m();
        return ((352 - (Integer.numberOfLeadingZeros(iM) * 9)) >>> 6) + iM;
    }

    public static abnd H(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        if (byteBuffer.hasArray()) {
            return new abmy(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), new abmz(byteBuffer));
        }
        if (byteBuffer.isDirect()) {
            return new abna(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer mut be either direct or array");
    }

    public static int N(int i) {
        return ((352 - (Integer.numberOfLeadingZeros(16) * 9)) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6);
    }

    public final void I() {
        if (b() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (b() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public final void J(int i, double d) throws IOException {
        k(i, Double.doubleToRawLongBits(d));
    }

    public final void K(double d) throws IOException {
        l(Double.doubleToRawLongBits(d));
    }

    public final void L(int i, float f) throws IOException {
        i(i, Float.floatToRawIntBits(f));
    }

    public final void M(float f) throws IOException {
        j(Float.floatToRawIntBits(f));
    }

    public abstract int b();

    public abstract void c() throws IOException;

    public abstract void d(byte b) throws IOException;

    public abstract void f(int i, boolean z) throws IOException;

    public abstract void g(int i, abms abmsVar) throws IOException;

    public abstract void h(abms abmsVar) throws IOException;

    public abstract void i(int i, int i2) throws IOException;

    public abstract void j(int i) throws IOException;

    public abstract void k(int i, long j) throws IOException;

    public abstract void l(long j) throws IOException;

    public abstract void m(int i, int i2) throws IOException;

    public abstract void n(int i) throws IOException;

    public abstract void o(abow abowVar) throws IOException;

    public abstract void p(int i, abow abowVar) throws IOException;

    public abstract void q(int i, abms abmsVar) throws IOException;

    public abstract void r(int i, String str) throws IOException;

    public abstract void s(String str) throws IOException;

    public abstract void t(int i, int i2) throws IOException;

    public abstract void u(int i, int i2) throws IOException;

    public abstract void v(int i) throws IOException;

    public abstract void w(int i, long j) throws IOException;

    public abstract void x(long j) throws IOException;

    public abstract void y(byte[] bArr, int i) throws IOException;
}
