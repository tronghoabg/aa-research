package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class cc {
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public java.lang.String m;
    public int n;
    public java.lang.CharSequence o;
    public int p;
    public java.lang.CharSequence q;
    public java.util.ArrayList r;
    public java.util.ArrayList s;
    java.util.ArrayList u;
    public final java.util.ArrayList e = new java.util.ArrayList();
    boolean l = true;
    public boolean t = false;

    public abstract void c();

    public abstract void d();

    public void e(int i, android.support.v4.app.Fragment fragment, java.lang.String str, int i2) {
        throw null;
    }

    public void h(android.support.v4.app.Fragment fragment, defpackage.epx epxVar) {
        throw null;
    }

    public void j(android.support.v4.app.Fragment fragment) {
        throw null;
    }

    public void k(android.support.v4.app.Fragment fragment) {
        throw null;
    }

    public void l(android.support.v4.app.Fragment fragment) {
        throw null;
    }

    public final void m(defpackage.cb cbVar) {
        this.e.add(cbVar);
        cbVar.d = this.f;
        cbVar.e = this.g;
        cbVar.f = this.h;
        cbVar.g = this.i;
    }

    public final void n(java.lang.String str) {
        if (!this.l) {
            throw new java.lang.IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.k = true;
        this.m = str;
    }

    public final void o(android.support.v4.app.Fragment fragment) {
        m(new defpackage.cb(7, fragment));
    }

    public final void p() {
        if (this.k) {
            throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
        }
        this.l = false;
    }

    public final void q(int i, android.support.v4.app.Fragment fragment, java.lang.String str) {
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Must use non-zero containerViewId");
        }
        e(i, fragment, str, 2);
    }

    public final void r(int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    public final void s() {
        this.t = true;
    }

    public final void t(android.view.ViewGroup viewGroup, android.support.v4.app.Fragment fragment, java.lang.String str) {
        fragment.mContainer = viewGroup;
        fragment.mInDynamicContainer = true;
        e(viewGroup.getId(), fragment, str, 1);
    }
}
