package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kf {
    public android.view.View d;
    public final defpackage.izq e;
    public int c = 0;
    public final defpackage.ke a = new defpackage.ke();
    public final java.util.List b = new java.util.ArrayList();

    public kf(defpackage.izq izqVar) {
        this.e = izqVar;
    }

    private final int m(int i) {
        if (i < 0) {
            return -1;
        }
        int iW = this.e.w();
        int i2 = i;
        while (i2 < iW) {
            defpackage.ke keVar = this.a;
            int iA = i - (i2 - keVar.a(i2));
            if (iA == 0) {
                while (keVar.f(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iA;
        }
        return -1;
    }

    public final int a() {
        return this.e.w() - this.b.size();
    }

    public final int b() {
        return this.e.w();
    }

    final int c(android.view.View view) {
        int iX = this.e.x(view);
        if (iX != -1) {
            defpackage.ke keVar = this.a;
            if (!keVar.f(iX)) {
                return iX - keVar.a(iX);
            }
        }
        return -1;
    }

    public final android.view.View d(int i) {
        return this.e.y(m(i));
    }

    public final android.view.View e(int i) {
        return this.e.y(i);
    }

    public final void f(android.view.View view, int i, boolean z) {
        int iW = i < 0 ? this.e.w() : m(i);
        this.a.c(iW, z);
        if (z) {
            i(view);
        }
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) this.e.a;
        recyclerView.addView(view, iW);
        if (view != null) {
            defpackage.mr mrVar = ((defpackage.md) view.getLayoutParams()).c;
        }
        java.util.List list = recyclerView.x;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
        }
    }

    public final void g(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams, boolean z) {
        int iW = i < 0 ? this.e.w() : m(i);
        this.a.c(iW, z);
        if (z) {
            i(view);
        }
        defpackage.izq izqVar = this.e;
        int i2 = android.support.v7.widget.RecyclerView.ac;
        defpackage.mr mrVar = view == null ? null : ((defpackage.md) view.getLayoutParams()).c;
        if (mrVar != null) {
            if (!mrVar.x() && !mrVar.A()) {
                throw new java.lang.IllegalArgumentException("Called attach on a child which is not detached: " + mrVar + ((android.support.v7.widget.RecyclerView) izqVar.a).n());
            }
            mrVar.j();
        }
        ((android.support.v7.widget.RecyclerView) izqVar.a).attachViewToParent(view, iW, layoutParams);
    }

    final void h(int i) {
        defpackage.ke keVar = this.a;
        int iM = m(i);
        keVar.g(iM);
        defpackage.izq izqVar = this.e;
        android.view.View viewY = izqVar.y(iM);
        if (viewY != null) {
            int i2 = android.support.v7.widget.RecyclerView.ac;
            defpackage.mr mrVar = ((defpackage.md) viewY.getLayoutParams()).c;
            if (mrVar != null) {
                if (mrVar.x() && !mrVar.A()) {
                    throw new java.lang.IllegalArgumentException("called detach on an already detached child " + mrVar + ((android.support.v7.widget.RecyclerView) izqVar.a).n());
                }
                mrVar.f(256);
            }
        } else {
            int i3 = android.support.v7.widget.RecyclerView.ac;
        }
        ((android.support.v7.widget.RecyclerView) izqVar.a).detachViewFromParent(iM);
    }

    public final void i(android.view.View view) {
        this.b.add(view);
        defpackage.mr mrVarK = android.support.v7.widget.RecyclerView.k(view);
        if (mrVarK != null) {
            defpackage.izq izqVar = this.e;
            int i = mrVarK.p;
            if (i != -1) {
                mrVarK.o = i;
            } else {
                mrVarK.o = mrVarK.a.getImportantForAccessibility();
            }
            ((android.support.v7.widget.RecyclerView) izqVar.a).ar(mrVarK, 4);
        }
    }

    final void j(int i) {
        int i2 = this.c;
        if (i2 == 1) {
            throw new java.lang.IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new java.lang.IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iM = m(i);
            defpackage.izq izqVar = this.e;
            android.view.View viewY = izqVar.y(iM);
            if (viewY != null) {
                this.c = 1;
                this.d = viewY;
                if (this.a.g(iM)) {
                    l(viewY);
                }
                izqVar.A(iM);
            }
        } finally {
            this.c = 0;
            this.d = null;
        }
    }

    public final boolean k(android.view.View view) {
        return this.b.contains(view);
    }

    public final void l(android.view.View view) {
        if (this.b.remove(view)) {
            this.e.z(view);
        }
    }

    public final java.lang.String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}
