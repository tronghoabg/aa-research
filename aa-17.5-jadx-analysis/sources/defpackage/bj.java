package defpackage;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
final class bj extends om {
    final /* synthetic */ bt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(bt btVar) {
        super(false);
        this.a = btVar;
    }

    @Override // defpackage.om
    public final void a() {
        if (bt.ac(3)) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        this.a.q();
    }

    @Override // defpackage.om
    public final void b() {
        int i;
        if (bt.ac(3)) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        bt btVar = this.a;
        btVar.f = true;
        btVar.an(true);
        btVar.f = false;
        if (btVar.e == null) {
            if (btVar.g.c) {
                if (bt.ac(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                btVar.ao();
                return;
            } else {
                if (bt.ac(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                btVar.A.y();
                return;
            }
        }
        if (!btVar.j.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(bt.ai(btVar.e));
            ArrayList arrayList = btVar.j;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                glf glfVar = (glf) arrayList.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        glfVar.d((Fragment) it.next(), true);
                    }
                }
                i2 = i;
            }
        }
        ArrayList arrayList2 = btVar.e.e;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Fragment fragment = ((cb) arrayList2.get(i3)).b;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        for (cq cqVar : btVar.m(new ArrayList(Collections.singletonList(btVar.e)), 0, 1)) {
            if (bt.ac(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            List list = cqVar.c;
            cqVar.h(list);
            cqVar.d(list);
        }
        ArrayList arrayList3 = btVar.e.e;
        int size3 = arrayList3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Fragment fragment2 = ((cb) arrayList3.get(i4)).b;
            if (fragment2 != null && fragment2.mContainer == null) {
                btVar.k(fragment2).e();
            }
        }
        btVar.e = null;
        btVar.X();
        if (bt.ac(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + btVar.g.c + " for  FragmentManager " + btVar);
        }
    }

    @Override // defpackage.om
    public final void c(nw nwVar) {
        if (bt.ac(2)) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        bt btVar = this.a;
        w wVar = btVar.e;
        if (wVar != null) {
            ArrayList arrayList = new ArrayList(Collections.singletonList(wVar));
            for (cq cqVar : btVar.m(arrayList, 0, 1)) {
                if (bt.ac(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + nwVar.b);
                }
                List list = cqVar.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    woy.cq(arrayList2, ((cp) it.next()).g);
                }
                List listCf = woy.cf(woy.cl(arrayList2));
                int size = listCf.size();
                for (int i = 0; i < size; i++) {
                    cn cnVar = (cn) listCf.get(i);
                    ViewGroup viewGroup = cqVar.a;
                    cnVar.e(nwVar);
                }
            }
            ArrayList arrayList3 = btVar.j;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
            }
        }
    }

    @Override // defpackage.om
    public final void d() {
        if (bt.ac(3)) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + this.a);
        }
        bt btVar = this.a;
        btVar.I();
        btVar.J(new bq(btVar), false);
    }
}
