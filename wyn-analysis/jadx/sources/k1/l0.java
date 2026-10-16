package k1;

import b1.C1494c;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f38844a;

    /* renamed from: b, reason: collision with root package name */
    public C1494c[] f38845b;

    public l0() {
        this(new v0());
    }

    public final void a() {
        C1494c[] c1494cArr = this.f38845b;
        if (c1494cArr != null) {
            C1494c c1494cF = c1494cArr[0];
            C1494c c1494cF2 = c1494cArr[1];
            v0 v0Var = this.f38844a;
            if (c1494cF2 == null) {
                c1494cF2 = v0Var.f38877a.f(2);
            }
            if (c1494cF == null) {
                c1494cF = v0Var.f38877a.f(1);
            }
            g(C1494c.a(c1494cF, c1494cF2));
            C1494c c1494c = this.f38845b[android.support.v4.media.session.b.i0(16)];
            if (c1494c != null) {
                f(c1494c);
            }
            C1494c c1494c2 = this.f38845b[android.support.v4.media.session.b.i0(32)];
            if (c1494c2 != null) {
                d(c1494c2);
            }
            C1494c c1494c3 = this.f38845b[android.support.v4.media.session.b.i0(64)];
            if (c1494c3 != null) {
                h(c1494c3);
            }
        }
    }

    public abstract v0 b();

    public void c(int i5, C1494c c1494c) {
        if (this.f38845b == null) {
            this.f38845b = new C1494c[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i5 & i10) != 0) {
                this.f38845b[android.support.v4.media.session.b.i0(i10)] = c1494c;
            }
        }
    }

    public abstract void e(C1494c c1494c);

    public abstract void g(C1494c c1494c);

    public l0(v0 v0Var) {
        this.f38844a = v0Var;
    }

    public void d(C1494c c1494c) {
    }

    public void f(C1494c c1494c) {
    }

    public void h(C1494c c1494c) {
    }
}
