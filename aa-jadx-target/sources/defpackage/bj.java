package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bj extends defpackage.op {
    final /* synthetic */ defpackage.bt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(defpackage.bt btVar) {
        super(false);
        this.a = btVar;
    }

    @Override // defpackage.op
    public final void a() {
        if (defpackage.bt.ac(3)) {
            android.util.Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        this.a.q();
    }

    @Override // defpackage.op
    public final void b() {
        int i;
        if (defpackage.bt.ac(3)) {
            android.util.Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        defpackage.bt btVar = this.a;
        btVar.f = true;
        btVar.an(true);
        btVar.f = false;
        if (btVar.e == null) {
            if (btVar.g.c) {
                if (defpackage.bt.ac(3)) {
                    android.util.Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                btVar.ao();
                return;
            } else {
                if (defpackage.bt.ac(3)) {
                    android.util.Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                btVar.A.y();
                return;
            }
        }
        if (!btVar.j.isEmpty()) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(defpackage.bt.ai(btVar.e));
            java.util.ArrayList arrayList = btVar.j;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                glm glmVar = (glm) arrayList.get(i2);
                java.util.Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        glmVar.d((android.support.v4.app.Fragment) it.next(), true);
                    }
                }
                i2 = i;
            }
        }
        java.util.ArrayList arrayList2 = btVar.e.e;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            android.support.v4.app.Fragment fragment = ((defpackage.cb) arrayList2.get(i3)).b;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        for (defpackage.cq cqVar : btVar.m(new java.util.ArrayList(java.util.Collections.singletonList(btVar.e)), 0, 1)) {
            if (defpackage.bt.ac(3)) {
                android.util.Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            java.util.List list = cqVar.c;
            cqVar.h(list);
            cqVar.d(list);
        }
        java.util.ArrayList arrayList3 = btVar.e.e;
        int size3 = arrayList3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            android.support.v4.app.Fragment fragment2 = ((defpackage.cb) arrayList3.get(i4)).b;
            if (fragment2 != null && fragment2.mContainer == null) {
                btVar.k(fragment2).e();
            }
        }
        btVar.e = null;
        btVar.X();
        if (defpackage.bt.ac(3)) {
            android.util.Log.d("FragmentManager", "Op is being set to null");
            android.util.Log.d("FragmentManager", "OnBackPressedCallback enabled=" + btVar.g.c + " for  FragmentManager " + btVar);
        }
    }

    @Override // defpackage.op
    public final void c(ny nyVar) {
        if (defpackage.bt.ac(2)) {
            android.util.Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        defpackage.bt btVar = this.a;
        defpackage.w wVar = btVar.e;
        if (wVar != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Collections.singletonList(wVar));
            for (defpackage.cq cqVar : btVar.m(arrayList, 0, 1)) {
                if (defpackage.bt.ac(2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + nyVar.b);
                }
                java.util.List list = cqVar.c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    defpackage.afga.bk(arrayList2, ((defpackage.cp) it.next()).g);
                }
                java.util.List listAZ = defpackage.afga.aZ(defpackage.afga.bf(arrayList2));
                int size = listAZ.size();
                for (int i = 0; i < size; i++) {
                    cn cnVar = (cn) listAZ.get(i);
                    android.view.ViewGroup viewGroup = cqVar.a;
                    cnVar.e(nyVar);
                }
            }
            java.util.ArrayList arrayList3 = btVar.j;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
            }
        }
    }

    @Override // defpackage.op
    public final void d() {
        if (defpackage.bt.ac(3)) {
            android.util.Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        defpackage.bt btVar = this.a;
        btVar.I();
        btVar.J(new bq(btVar), false);
    }
}
