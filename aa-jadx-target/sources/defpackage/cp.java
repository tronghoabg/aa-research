package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class cp {
    public final android.support.v4.app.Fragment a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final java.util.List g;
    public int h;
    public int i;
    private final java.util.List k;
    private final java.util.List j = new java.util.ArrayList();
    public boolean f = true;

    public cp(int i, int i2, android.support.v4.app.Fragment fragment) {
        this.h = i;
        this.i = i2;
        this.a = fragment;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.k = arrayList;
        this.g = arrayList;
    }

    public void a() {
        this.e = false;
        if (this.c) {
            return;
        }
        if (defpackage.bt.ac(2)) {
            android.util.Log.v("FragmentManager", defpackage.a.bl(this, "SpecialEffectsController: ", " has called complete."));
        }
        this.c = true;
        java.util.Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    public void b() {
        this.e = true;
    }

    public final void c(java.lang.Runnable runnable) {
        this.j.add(runnable);
    }

    public final void d(cn cnVar) {
        this.k.add(cnVar);
    }

    public final void e(android.view.ViewGroup viewGroup) {
        this.e = false;
        if (this.b) {
            return;
        }
        this.b = true;
        if (this.k.isEmpty()) {
            a();
            return;
        }
        for (cn cnVar : defpackage.afga.aZ(this.g)) {
            if (!cnVar.j) {
                cnVar.a(viewGroup);
            }
            cnVar.j = true;
        }
    }

    public final void f(cn cnVar) {
        java.util.List list = this.k;
        if (list.remove(cnVar) && list.isEmpty()) {
            a();
        }
    }

    public final void g() {
        this.f = false;
    }

    public final void h(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 == 1) {
            if (this.h == 1) {
                if (defpackage.bt.ac(2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + ((java.lang.Object) defpackage.ca.b(this.i)) + " to ADDING.");
                }
                this.h = 2;
                this.i = 2;
                this.f = true;
                return;
            }
            return;
        }
        if (i3 != 2) {
            if (this.h != 1) {
                if (defpackage.bt.ac(2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = " + ((java.lang.Object) defpackage.ca.g(this.h)) + " -> " + ((java.lang.Object) defpackage.ca.g(i)) + ".");
                }
                this.h = i;
                return;
            }
            return;
        }
        if (defpackage.bt.ac(2)) {
            android.util.Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = " + ((java.lang.Object) defpackage.ca.g(this.h)) + " -> REMOVED. mLifecycleImpact  = " + ((java.lang.Object) defpackage.ca.b(this.i)) + " to REMOVING.");
        }
        this.h = 1;
        this.i = 3;
        this.f = true;
    }

    public final java.lang.String toString() {
        return "Operation {" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + "} {finalState = " + ((java.lang.Object) defpackage.ca.g(this.h)) + " lifecycleImpact = " + ((java.lang.Object) defpackage.ca.b(this.i)) + " fragment = " + this.a + "}";
    }
}
