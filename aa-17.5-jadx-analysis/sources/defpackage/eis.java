package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class eis {
    private static volatile int a = 100;
    public static final /* synthetic */ int i = 0;
    public int e;
    int f;
    final int g = a;
    public Object h;

    public abstract double b() throws IOException;

    public abstract float c() throws IOException;

    public abstract int d();

    public abstract int e(int i2) throws ejp;

    public abstract int g() throws IOException;

    public abstract void h(int i2) throws ejp;

    public abstract void i(int i2);

    public abstract boolean k() throws IOException;

    public abstract boolean l() throws IOException;

    public abstract boolean m(int i2) throws IOException;

    public final void v() throws ejp {
        if (this.e + this.f >= this.g) {
            throw new ejp("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void w() throws ejp {
        if (this.f == 0) {
            h(0);
        }
    }

    public final void x() throws IOException {
        int iG;
        do {
            iG = g();
            if (iG == 0) {
                return;
            }
            v();
            this.f++;
            this.f--;
        } while (m(iG));
    }
}
