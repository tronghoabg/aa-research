package defpackage;

import android.os.Build;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ai extends cn {
    public final List a;
    public final cp b;
    public final cp c;
    public final ck d;
    public final yw e;
    public final boolean f;
    public Object g;
    public boolean h;
    private final Object k;
    private final ArrayList l;
    private final ArrayList m;
    private final yw n;
    private final ArrayList o;
    private final ArrayList p;
    private final yw q;
    private final dvw r;

    public ai(List list, cp cpVar, cp cpVar2, ck ckVar, Object obj, ArrayList arrayList, ArrayList arrayList2, yw ywVar, ArrayList arrayList3, ArrayList arrayList4, yw ywVar2, yw ywVar3, boolean z) {
        arrayList3.getClass();
        arrayList4.getClass();
        this.a = list;
        this.b = cpVar;
        this.c = cpVar2;
        this.d = ckVar;
        this.k = obj;
        this.l = arrayList;
        this.m = arrayList2;
        this.n = ywVar;
        this.o = arrayList3;
        this.p = arrayList4;
        this.q = ywVar2;
        this.e = ywVar3;
        this.f = z;
        this.r = new dvw();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ee A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.aezu g(android.view.ViewGroup r28, defpackage.cp r29, defpackage.cp r30) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai.g(android.view.ViewGroup, cp, cp):aezu");
    }

    private final void h(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = ebo.a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                childAt.getClass();
                h(arrayList, childAt);
            }
        }
    }

    private final void i(ArrayList arrayList, ViewGroup viewGroup, afdr afdrVar) {
        cd.b(arrayList, 4);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.m;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            int[] iArr = ebm.a;
            arrayList2.add(view.getTransitionName());
            view.setTransitionName(null);
        }
        if (bt.ac(2)) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator it = this.l.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                View view2 = (View) next;
                int[] iArr2 = ebm.a;
                Log.v("FragmentManager", "View: " + view2 + " Name: " + view2.getTransitionName());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            Iterator it2 = arrayList3.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                next2.getClass();
                View view3 = (View) next2;
                int[] iArr3 = ebm.a;
                Log.v("FragmentManager", "View: " + view3 + " Name: " + view3.getTransitionName());
            }
        }
        afdrVar.invoke();
        ck ckVar = this.d;
        ArrayList arrayList4 = this.l;
        yw ywVar = this.n;
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < size2; i2++) {
            View view4 = (View) arrayList4.get(i2);
            int[] iArr4 = ebm.a;
            String transitionName = view4.getTransitionName();
            arrayList5.add(transitionName);
            if (transitionName != null) {
                view4.setTransitionName(null);
                String str = (String) ywVar.get(transitionName);
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i3))) {
                        ((View) arrayList3.get(i3)).setTransitionName(transitionName);
                        break;
                    }
                    i3++;
                }
            }
        }
        eal.b(viewGroup, new ode(size2, arrayList3, arrayList2, arrayList4, arrayList5, 1));
        cd.b(arrayList, 0);
        ckVar.l(this.k, arrayList4, arrayList3);
    }

    @Override // defpackage.cn
    public final void a(ViewGroup viewGroup) {
        this.r.a();
    }

    @Override // defpackage.cn
    public final void b(ViewGroup viewGroup) {
        int i = 0;
        if (!viewGroup.isLaidOut() || this.h) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                cp cpVar = ((aj) it.next()).a;
                if (bt.ac(2)) {
                    if (this.h) {
                        Objects.toString(cpVar);
                        Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation ".concat(cpVar.toString()));
                    } else {
                        Log.v("FragmentManager", a.bt(cpVar, viewGroup, "SpecialEffectsController: Container ", " has not been laid out. Completing operation "));
                    }
                }
                cpVar.f(this);
            }
            this.h = false;
            return;
        }
        Object obj = this.g;
        if (obj != null) {
            this.d.t(obj);
            if (bt.ac(2)) {
                Log.v("FragmentManager", "Ending execution of operations from " + this.b + " to " + this.c);
                return;
            }
            return;
        }
        cp cpVar2 = this.c;
        cp cpVar3 = this.b;
        aezu aezuVarG = g(viewGroup, cpVar2, cpVar3);
        Object obj2 = aezuVarG.a;
        Object obj3 = aezuVarG.b;
        List list = this.a;
        ArrayList arrayList = (ArrayList) obj2;
        ArrayList<cp> arrayList2 = new ArrayList(woy.bp(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((aj) it2.next()).a);
        }
        for (cp cpVar4 : arrayList2) {
            ck ckVar = this.d;
            Fragment fragment = cpVar4.a;
            ckVar.r(obj3, this.r, new af(cpVar4, this, 2));
        }
        i(arrayList, viewGroup, new ah(this, viewGroup, obj3, i));
        if (bt.ac(2)) {
            Log.v("FragmentManager", a.bt(cpVar2, cpVar3, "Completed executing operations from ", " to "));
        }
    }

    @Override // defpackage.cn
    public final void c(ViewGroup viewGroup) {
        Object obj;
        if (!viewGroup.isLaidOut()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                cp cpVar = ((aj) it.next()).a;
                if (bt.ac(2)) {
                    Log.v("FragmentManager", a.bt(cpVar, viewGroup, "SpecialEffectsController: Container ", " has not been laid out. Skipping onStart for operation "));
                }
            }
            return;
        }
        if (f() && (obj = this.k) != null && !d()) {
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + this.b + " and " + this.c + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (d() && f()) {
            affv affvVar = new affv();
            aezu aezuVarG = g(viewGroup, this.c, this.b);
            Object obj2 = aezuVarG.a;
            Object obj3 = aezuVarG.b;
            List list = this.a;
            ArrayList arrayList = (ArrayList) obj2;
            ArrayList<cp> arrayList2 = new ArrayList(woy.bp(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((aj) it2.next()).a);
            }
            for (cp cpVar2 : arrayList2) {
                ag agVar = new ag(affvVar, 2);
                ck ckVar = this.d;
                Fragment fragment = cpVar2.a;
                ckVar.z(obj3, this.r, agVar, new af(cpVar2, this, 3));
            }
            i(arrayList, viewGroup, new fpb(this, viewGroup, obj3, affvVar, 1));
        }
    }

    @Override // defpackage.cn
    public final boolean d() {
        Object obj;
        ck ckVar = this.d;
        if (!ckVar.n()) {
            return false;
        }
        List<aj> list = this.a;
        if (!list.isEmpty()) {
            for (aj ajVar : list) {
                if (Build.VERSION.SDK_INT < 34 || (obj = ajVar.b) == null || !ckVar.o(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.k;
        return obj2 == null || ckVar.o(obj2);
    }

    @Override // defpackage.cn
    public final void e(nw nwVar) {
        Object obj = this.g;
        if (obj != null) {
            this.d.w(obj, nwVar.b);
        }
    }

    public final boolean f() {
        List list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((aj) it.next()).a.a.mTransitioning) {
                return false;
            }
        }
        return true;
    }
}
