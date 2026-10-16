package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eja {
    private static volatile int a = 100;
    public static final /* synthetic */ int i = 0;
    public int e;
    int f;
    final int g = a;
    public java.lang.Object h;

    public abstract double b() throws java.io.IOException;

    public abstract float c() throws java.io.IOException;

    public abstract int d();

    public abstract int e(int i2) throws defpackage.ejx;

    public abstract int g() throws java.io.IOException;

    public abstract void h(int i2) throws defpackage.ejx;

    public abstract void i(int i2);

    public abstract boolean k() throws java.io.IOException;

    public abstract boolean l() throws java.io.IOException;

    public abstract boolean m(int i2) throws java.io.IOException;

    public final void v() throws defpackage.ejx {
        if (this.e + this.f >= this.g) {
            throw new defpackage.ejx("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void w() throws defpackage.ejx {
        if (this.f == 0) {
            h(0);
        }
    }

    public final void x() throws java.io.IOException {
        boolean zM;
        do {
            int iG = g();
            if (iG == 0) {
                return;
            }
            v();
            this.f++;
            zM = m(iG);
            this.f--;
        } while (zM);
    }
}
