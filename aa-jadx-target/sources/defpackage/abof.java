package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class abof extends defpackage.abnn {
    public java.lang.Object a;

    public static int E(defpackage.abnv abnvVar) {
        int iD = abnvVar.d();
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(iD) * 9)) >>> 6) + iD;
    }

    public static int F(int i) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int G(defpackage.abpy abpyVar) {
        int iM = abpyVar.m();
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(iM) * 9)) >>> 6) + iM;
    }

    public static defpackage.abof H(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new java.lang.IllegalArgumentException("ByteBuffer is read-only");
        }
        if (byteBuffer.hasArray()) {
            return new defpackage.aboa(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), new defpackage.abob(byteBuffer));
        }
        if (byteBuffer.isDirect()) {
            return new aboc(byteBuffer);
        }
        throw new java.lang.IllegalArgumentException("ByteBuffer mut be either direct or array");
    }

    public static int N(int i) {
        return 1 + ((352 - (java.lang.Integer.numberOfLeadingZeros(i) * 9)) >>> 6);
    }

    public final void I() {
        if (b() > 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
        if (b() < 0) {
            throw new java.lang.IllegalStateException("Wrote more data than expected.");
        }
    }

    public final void J(int i, double d) throws java.io.IOException {
        k(i, java.lang.Double.doubleToRawLongBits(d));
    }

    public final void K(double d) throws java.io.IOException {
        l(java.lang.Double.doubleToRawLongBits(d));
    }

    public final void L(int i, float f) throws java.io.IOException {
        i(i, java.lang.Float.floatToRawIntBits(f));
    }

    public final void M(float f) throws java.io.IOException {
        j(java.lang.Float.floatToRawIntBits(f));
    }

    public abstract int b();

    public abstract void c() throws java.io.IOException;

    public abstract void d(byte b) throws java.io.IOException;

    public abstract void f(int i, boolean z) throws java.io.IOException;

    public abstract void g(int i, defpackage.abnv abnvVar) throws java.io.IOException;

    public abstract void h(defpackage.abnv abnvVar) throws java.io.IOException;

    public abstract void i(int i, int i2) throws java.io.IOException;

    public abstract void j(int i) throws java.io.IOException;

    public abstract void k(int i, long j) throws java.io.IOException;

    public abstract void l(long j) throws java.io.IOException;

    public abstract void m(int i, int i2) throws java.io.IOException;

    public abstract void n(int i) throws java.io.IOException;

    public abstract void o(defpackage.abpy abpyVar) throws java.io.IOException;

    public abstract void p(int i, defpackage.abpy abpyVar) throws java.io.IOException;

    public abstract void q(int i, defpackage.abnv abnvVar) throws java.io.IOException;

    public abstract void r(int i, java.lang.String str) throws java.io.IOException;

    public abstract void s(java.lang.String str) throws java.io.IOException;

    public abstract void t(int i, int i2) throws java.io.IOException;

    public abstract void u(int i, int i2) throws java.io.IOException;

    public abstract void v(int i) throws java.io.IOException;

    public abstract void w(int i, long j) throws java.io.IOException;

    public abstract void x(long j) throws java.io.IOException;

    public abstract void y(byte[] bArr, int i) throws java.io.IOException;
}
