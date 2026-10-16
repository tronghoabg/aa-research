package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nc {
    public final java.util.ArrayList a = new java.util.ArrayList();
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = 0;
    public final int e;
    public final /* synthetic */ android.support.v7.widget.StaggeredGridLayoutManager f;

    public nc(android.support.v7.widget.StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = i;
    }

    public static final defpackage.nb n(android.view.View view) {
        return (defpackage.nb) view.getLayoutParams();
    }

    public final int a() {
        boolean z = this.f.d;
        java.util.ArrayList arrayList = this.a;
        return z ? m(arrayList.size() - 1, -1) : m(0, arrayList.size());
    }

    public final int b() {
        boolean z = this.f.d;
        java.util.ArrayList arrayList = this.a;
        return z ? m(0, arrayList.size()) : m(arrayList.size() - 1, -1);
    }

    public final int c() {
        int i = this.c;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        h();
        return this.c;
    }

    public final int d(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        h();
        return this.c;
    }

    public final int e() {
        int i = this.b;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        i();
        return this.b;
    }

    public final int f(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        i();
        return this.b;
    }

    public final android.view.View g(int i, int i2) {
        java.util.ArrayList arrayList = this.a;
        android.view.View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                android.view.View view2 = (android.view.View) arrayList.get(size);
                android.support.v7.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
                if ((staggeredGridLayoutManager.d && android.support.v7.widget.StaggeredGridLayoutManager.bl(view2) >= i) || ((!staggeredGridLayoutManager.d && android.support.v7.widget.StaggeredGridLayoutManager.bl(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            android.view.View view3 = (android.view.View) arrayList.get(i3);
            android.support.v7.widget.StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.f;
            if ((staggeredGridLayoutManager2.d && android.support.v7.widget.StaggeredGridLayoutManager.bl(view3) <= i) || ((!staggeredGridLayoutManager2.d && android.support.v7.widget.StaggeredGridLayoutManager.bl(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    final void h() {
        java.util.ArrayList arrayList = this.a;
        android.view.View view = (android.view.View) arrayList.get(arrayList.size() - 1);
        defpackage.nb nbVarN = n(view);
        this.c = this.f.b.a(view);
        boolean z = nbVarN.b;
    }

    final void i() {
        android.view.View view = (android.view.View) this.a.get(0);
        defpackage.nb nbVarN = n(view);
        this.b = this.f.b.d(view);
        boolean z = nbVarN.b;
    }

    public final void j() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final void k(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            this.b = i2 + i;
        }
        int i3 = this.c;
        if (i3 != Integer.MIN_VALUE) {
            this.c = i3 + i;
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = i;
    }

    final int m(int i, int i2) {
        android.support.v7.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        int iJ = staggeredGridLayoutManager.b.j();
        int iF = staggeredGridLayoutManager.b.f();
        int i3 = i;
        while (true) {
            int i4 = -1;
            if (i3 == i2) {
                return -1;
            }
            android.view.View view = (android.view.View) this.a.get(i3);
            int iD = staggeredGridLayoutManager.b.d(view);
            int iA = staggeredGridLayoutManager.b.a(view);
            boolean z = iD <= iF;
            boolean z2 = iA >= iJ;
            if (z && z2 && (iD < iJ || iA > iF)) {
                return android.support.v7.widget.StaggeredGridLayoutManager.bl(view);
            }
            if (i2 > i) {
                i4 = 1;
            }
            i3 += i4;
        }
    }
}
