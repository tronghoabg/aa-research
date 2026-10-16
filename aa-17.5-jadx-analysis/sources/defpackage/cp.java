package defpackage;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class cp {
    public final Fragment a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final List g;
    public int h;
    public int i;
    private final List k;
    private final List j = new ArrayList();
    public boolean f = true;

    public cp(int i, int i2, Fragment fragment) {
        this.h = i;
        this.i = i2;
        this.a = fragment;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.g = arrayList;
    }

    public void a() {
        this.e = false;
        if (this.c) {
            return;
        }
        if (bt.ac(2)) {
            Log.v("FragmentManager", a.bm(this, "SpecialEffectsController: ", " has called complete."));
        }
        this.c = true;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public void b() {
        this.e = true;
    }

    public final void c(Runnable runnable) {
        this.j.add(runnable);
    }

    public final void d(cn cnVar) {
        this.k.add(cnVar);
    }

    public final void e(ViewGroup viewGroup) {
        this.e = false;
        if (this.b) {
            return;
        }
        this.b = true;
        if (this.k.isEmpty()) {
            a();
            return;
        }
        for (cn cnVar : woy.cf(this.g)) {
            if (!cnVar.j) {
                cnVar.a(viewGroup);
            }
            cnVar.j = true;
        }
    }

    public final void f(cn cnVar) {
        List list = this.k;
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
                if (bt.ac(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + ((Object) ca.b(this.i)) + " to ADDING.");
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
                if (bt.ac(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = " + ((Object) ca.g(this.h)) + " -> " + ((Object) ca.g(i)) + ".");
                }
                this.h = i;
                return;
            }
            return;
        }
        if (bt.ac(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.a + " mFinalState = " + ((Object) ca.g(this.h)) + " -> REMOVED. mLifecycleImpact  = " + ((Object) ca.b(this.i)) + " to REMOVING.");
        }
        this.h = 1;
        this.i = 3;
        this.f = true;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + ((Object) ca.g(this.h)) + " lifecycleImpact = " + ((Object) ca.b(this.i)) + " fragment = " + this.a + "}";
    }
}
