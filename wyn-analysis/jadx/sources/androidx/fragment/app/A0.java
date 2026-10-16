package androidx.fragment.app;

import A.AbstractC0213f;
import Va.M6;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public int f18278a;

    /* renamed from: b, reason: collision with root package name */
    public int f18279b;

    /* renamed from: c, reason: collision with root package name */
    public final F f18280c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f18281d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18282e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18283f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18284g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18285h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18286i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f18287j;
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public final l0 f18288l;

    public A0(int i5, int i10, l0 l0Var) {
        AbstractC3256n.m(i5, "finalState");
        AbstractC3256n.m(i10, "lifecycleImpact");
        F fragment = l0Var.f18480c;
        AbstractC3340k.d(fragment, "fragmentStateManager.fragment");
        AbstractC3256n.m(i5, "finalState");
        AbstractC3256n.m(i10, "lifecycleImpact");
        AbstractC3340k.e(fragment, "fragment");
        this.f18278a = i5;
        this.f18279b = i10;
        this.f18280c = fragment;
        this.f18281d = new ArrayList();
        this.f18286i = true;
        ArrayList arrayList = new ArrayList();
        this.f18287j = arrayList;
        this.k = arrayList;
        this.f18288l = l0Var;
    }

    public final void a(ViewGroup container) {
        AbstractC3340k.e(container, "container");
        this.f18285h = false;
        if (this.f18282e) {
            return;
        }
        this.f18282e = true;
        if (this.f18287j.isEmpty()) {
            b();
            return;
        }
        for (z0 z0Var : ff.o.S0(this.k)) {
            z0Var.getClass();
            if (!z0Var.f18572b) {
                z0Var.b(container);
            }
            z0Var.f18572b = true;
        }
    }

    public final void b() {
        this.f18285h = false;
        if (!this.f18283f) {
            if (e0.J(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f18283f = true;
            Iterator it = this.f18281d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f18280c.mTransitioning = false;
        this.f18288l.k();
    }

    public final void c(z0 effect) {
        AbstractC3340k.e(effect, "effect");
        ArrayList arrayList = this.f18287j;
        if (arrayList.remove(effect) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i5, int i10) {
        AbstractC3256n.m(i5, "finalState");
        AbstractC3256n.m(i10, "lifecycleImpact");
        int iF = AbstractC0213f.f(i10);
        F f10 = this.f18280c;
        if (iF == 0) {
            if (this.f18278a != 1) {
                if (e0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + f10 + " mFinalState = " + M6.G(this.f18278a) + " -> " + M6.G(i5) + '.');
                }
                this.f18278a = i5;
                return;
            }
            return;
        }
        if (iF == 1) {
            if (this.f18278a == 1) {
                if (e0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + f10 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + M6.F(this.f18279b) + " to ADDING.");
                }
                this.f18278a = 2;
                this.f18279b = 2;
                this.f18286i = true;
                return;
            }
            return;
        }
        if (iF != 2) {
            return;
        }
        if (e0.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + f10 + " mFinalState = " + M6.G(this.f18278a) + " -> REMOVED. mLifecycleImpact  = " + M6.F(this.f18279b) + " to REMOVING.");
        }
        this.f18278a = 1;
        this.f18279b = 3;
        this.f18286i = true;
    }

    public final String toString() {
        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbW.append(M6.G(this.f18278a));
        sbW.append(" lifecycleImpact = ");
        sbW.append(M6.F(this.f18279b));
        sbW.append(" fragment = ");
        sbW.append(this.f18280c);
        sbW.append('}');
        return sbW.toString();
    }
}
