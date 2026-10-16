package androidx.fragment.app;

import Va.M6;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class U extends androidx.activity.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f18343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(e0 e0Var) {
        super(false);
        this.f18343d = e0Var;
    }

    @Override // androidx.activity.o
    public final void a() {
        boolean zJ = e0.J(3);
        e0 e0Var = this.f18343d;
        if (zJ) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + e0Var);
        }
        C1409a c1409a = e0Var.f18415h;
        if (c1409a != null) {
            c1409a.f18366r = false;
            c1409a.d(false);
            e0Var.z(true);
            e0Var.D();
            Iterator it = e0Var.f18419m.iterator();
            if (it.hasNext()) {
                throw M6.j(it);
            }
        }
        e0Var.f18415h = null;
    }

    @Override // androidx.activity.o
    public final void b() {
        boolean zJ = e0.J(3);
        e0 e0Var = this.f18343d;
        if (zJ) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + e0Var);
        }
        e0Var.z(true);
        C1409a c1409a = e0Var.f18415h;
        U u10 = e0Var.f18416i;
        if (c1409a == null) {
            if (u10.f17724a) {
                if (e0.J(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                e0Var.P();
                return;
            } else {
                if (e0.J(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                e0Var.f18414g.b();
                return;
            }
        }
        ArrayList arrayList = e0Var.f18419m;
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(e0.E(e0Var.f18415h));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
            }
        }
        Iterator it3 = e0Var.f18415h.f18350a.iterator();
        while (it3.hasNext()) {
            F f10 = ((n0) it3.next()).f18504b;
            if (f10 != null) {
                f10.mTransitioning = false;
            }
        }
        Iterator it4 = e0Var.f(new ArrayList(Collections.singletonList(e0Var.f18415h)), 0, 1).iterator();
        while (it4.hasNext()) {
            C1426o c1426o = (C1426o) it4.next();
            c1426o.getClass();
            if (e0.J(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            ArrayList arrayList2 = c1426o.f18514c;
            c1426o.l(arrayList2);
            c1426o.c(arrayList2);
        }
        e0Var.f18415h = null;
        e0Var.d0();
        if (e0.J(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + u10.f17724a + " for  FragmentManager " + e0Var);
        }
    }

    @Override // androidx.activity.o
    public final void c(androidx.activity.b backEvent) {
        boolean zJ = e0.J(2);
        e0 e0Var = this.f18343d;
        if (zJ) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + e0Var);
        }
        if (e0Var.f18415h != null) {
            Iterator it = e0Var.f(new ArrayList(Collections.singletonList(e0Var.f18415h)), 0, 1).iterator();
            while (it.hasNext()) {
                C1426o c1426o = (C1426o) it.next();
                c1426o.getClass();
                AbstractC3340k.e(backEvent, "backEvent");
                if (e0.J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.f17699c);
                }
                ArrayList arrayList = c1426o.f18514c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ff.t.e0(((A0) it2.next()).k, arrayList2);
                }
                List listS0 = ff.o.S0(ff.o.X0(arrayList2));
                int size = listS0.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((z0) listS0.get(i5)).d(backEvent, c1426o.f18512a);
                }
            }
            Iterator it3 = e0Var.f18419m.iterator();
            if (it3.hasNext()) {
                throw M6.j(it3);
            }
        }
    }

    @Override // androidx.activity.o
    public final void d(androidx.activity.b bVar) {
        boolean zJ = e0.J(3);
        e0 e0Var = this.f18343d;
        if (zJ) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + e0Var);
        }
        e0Var.w();
        e0Var.x(new d0(e0Var), false);
    }
}
