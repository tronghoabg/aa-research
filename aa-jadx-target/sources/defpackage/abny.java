package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class abny {
    private static volatile int a = 100;
    public static final /* synthetic */ int l = 0;
    int g;
    int h;
    int i = a;
    public int j = Integer.MAX_VALUE;
    java.lang.Object k;

    public static defpackage.abny H(byte[] bArr) {
        return N(bArr, 0, bArr.length);
    }

    public static defpackage.abny L(java.io.InputStream inputStream) {
        return inputStream == null ? N(defpackage.abpk.a, 0, 0) : new defpackage.abnx(inputStream);
    }

    public static defpackage.abny M(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return N(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return N(bArr, 0, iRemaining);
    }

    public static defpackage.abny N(byte[] bArr, int i, int i2) {
        defpackage.abnw abnwVar = new defpackage.abnw(bArr, i, i2);
        try {
            abnwVar.f(i2);
            return abnwVar;
        } catch (defpackage.abpp e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public abstract void A(int i);

    public abstract void B(int i) throws java.io.IOException;

    public abstract boolean C() throws java.io.IOException;

    public abstract boolean D() throws java.io.IOException;

    public abstract boolean E(int i) throws java.io.IOException;

    public final void I() throws defpackage.abpp {
        if (this.g + this.h >= this.i) {
            throw new defpackage.abpp("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void J() throws defpackage.abpp {
        if (this.h == 0) {
            z(0);
        }
    }

    public final void K() throws java.io.IOException {
        boolean zE;
        do {
            int iN = n();
            if (iN == 0) {
                return;
            }
            I();
            this.h++;
            zE = E(iN);
            this.h--;
        } while (zE);
    }

    public abstract double b() throws java.io.IOException;

    public abstract float c() throws java.io.IOException;

    public abstract int d();

    public abstract int e();

    public abstract int f(int i) throws defpackage.abpp;

    public abstract int g() throws java.io.IOException;

    public abstract int h() throws java.io.IOException;

    public abstract int i() throws java.io.IOException;

    public abstract int k() throws java.io.IOException;

    public abstract int l() throws java.io.IOException;

    public abstract int m() throws java.io.IOException;

    public abstract int n() throws java.io.IOException;

    public abstract int o() throws java.io.IOException;

    public abstract long p() throws java.io.IOException;

    public abstract long q() throws java.io.IOException;

    public abstract long s() throws java.io.IOException;

    public abstract long t() throws java.io.IOException;

    public abstract long u() throws java.io.IOException;

    public abstract long v() throws java.io.IOException;

    public abstract defpackage.abnv w() throws java.io.IOException;

    public abstract java.lang.String x() throws java.io.IOException;

    public abstract java.lang.String y() throws java.io.IOException;

    public abstract void z(int i) throws defpackage.abpp;
}
