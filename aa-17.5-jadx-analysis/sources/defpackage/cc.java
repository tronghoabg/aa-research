package defpackage;

import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class cc {
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public String m;
    public int n;
    public CharSequence o;
    public int p;
    public CharSequence q;
    public ArrayList r;
    public ArrayList s;
    ArrayList u;
    public final ArrayList e = new ArrayList();
    boolean l = true;
    public boolean t = false;

    public abstract void c();

    public abstract void d();

    public void e(int i, Fragment fragment, String str, int i2) {
        throw null;
    }

    public void h(Fragment fragment, eps epsVar) {
        throw null;
    }

    public void j(Fragment fragment) {
        throw null;
    }

    public void k(Fragment fragment) {
        throw null;
    }

    public void l(Fragment fragment) {
        throw null;
    }

    public final void m(cb cbVar) {
        this.e.add(cbVar);
        cbVar.d = this.f;
        cbVar.e = this.g;
        cbVar.f = this.h;
        cbVar.g = this.i;
    }

    public final void n(String str) {
        if (!this.l) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.k = true;
        this.m = str;
    }

    public final void o(Fragment fragment) {
        m(new cb(7, fragment));
    }

    public final void p() {
        if (this.k) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.l = false;
    }

    public final void q(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
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

    public final void t(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        fragment.mInDynamicContainer = true;
        e(viewGroup.getId(), fragment, str, 1);
    }
}
