package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class glm {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ glm(defpackage.gfa gfaVar, androidx.car.app.model.ClickableSpan clickableSpan) {
        this.a = gfaVar;
        this.b = clickableSpan;
    }

    public final void a() {
        ((android.os.Handler) ((defpackage.jto) this.b).c).removeMessages(((defpackage.gnr) this.a).ordinal());
    }

    public final void b(defpackage.dfg dfgVar) {
        dfgVar.getClass();
        defpackage.gdd.i((defpackage.gfa) this.a, ((androidx.car.app.model.ClickableSpan) this.b).getOnClickDelegate());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aiyx, java.lang.Object] */
    public final void c(java.lang.Object obj) {
        defpackage.fmx fmxVar = (defpackage.fmx) this.b;
        this.a.j(fmxVar.e(obj) ? new defpackage.fmo(fmxVar.d()) : defpackage.fmn.a);
    }

    public final void d(android.support.v4.app.Fragment fragment, boolean z) {
        java.lang.Object obj;
        java.lang.Object objPrevious;
        fragment.getClass();
        defpackage.evx evxVar = (defpackage.evx) this.b;
        java.util.List listAS = defpackage.afga.aS((java.util.Collection) evxVar.d.b(), (java.lang.Iterable) evxVar.e.b());
        java.util.ListIterator listIterator = listAS.listIterator(listAS.size());
        do {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!defpackage.afga.f(((defpackage.euw) objPrevious).c, fragment.getTag()));
        defpackage.euw euwVar = (defpackage.euw) objPrevious;
        boolean z2 = z && ((defpackage.ewm) this.a).c.isEmpty() && fragment.isRemoving();
        java.util.List list = ((defpackage.ewm) this.a).c;
        for (java.lang.Object obj2 : list) {
            if (defpackage.afga.f(((defpackage.afau) obj2).a, fragment.getTag())) {
                obj = obj2;
                break;
            }
        }
        defpackage.afau afauVar = (defpackage.afau) obj;
        if (afauVar != null) {
            list.remove(afauVar);
        }
        if (!z2 && defpackage.ewm.k()) {
            android.util.Log.v("FragmentNavigator", defpackage.a.bs(euwVar, fragment, "OnBackStackChangedCommitted for fragment ", " associated with entry "));
        }
        boolean z3 = afauVar != null && ((java.lang.Boolean) afauVar.b).booleanValue();
        if (!z && !z3 && euwVar == null) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bl(fragment, "The fragment ", " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
        }
        if (euwVar != null) {
            defpackage.ewm.l(fragment, evxVar);
            if (z2) {
                if (defpackage.ewm.k()) {
                    android.util.Log.v("FragmentNavigator", defpackage.a.bv(euwVar, fragment, "OnBackStackChangedCommitted for fragment ", " popping associated entry ", " via system back"));
                }
                evxVar.g(euwVar, false);
            }
        }
    }

    public final void e(android.support.v4.app.Fragment fragment, boolean z) {
        java.lang.Object objPrevious;
        fragment.getClass();
        if (z) {
            java.lang.Object obj = this.b;
            defpackage.evx evxVar = (defpackage.evx) obj;
            java.util.List list = (java.util.List) evxVar.d.b();
            java.util.ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!defpackage.afga.f(((defpackage.euw) objPrevious).c, fragment.getTag()));
            defpackage.euw euwVar = (defpackage.euw) objPrevious;
            if (defpackage.ewm.k()) {
                android.util.Log.v("FragmentNavigator", defpackage.a.bs(euwVar, fragment, "OnBackStackChangedStarted for fragment ", " associated with entry "));
            }
            if (euwVar != null) {
                defpackage.ajba ajbaVar = evxVar.g;
                ajbaVar.d(defpackage.afga.N((java.util.Set) ajbaVar.b(), euwVar));
                if (!((defpackage.eux) obj).b.b.e.contains(euwVar)) {
                    throw new java.lang.IllegalStateException("Cannot transition entry that is not in the back stack");
                }
                euwVar.b(defpackage.epx.d);
            }
        }
    }

    public glm(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj2;
        this.b = obj;
    }

    public glm(java.lang.Object obj, java.lang.Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }
}
