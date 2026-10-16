package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.evu(a = "dialog")
public final class ewh extends defpackage.evv<ewg> {
    private final android.content.Context e;
    private final defpackage.bt f;
    public final java.util.Set b = new java.util.LinkedHashSet();
    public final defpackage.oa d = new defpackage.oa(this, 6, null);
    public final java.util.Map c = new java.util.LinkedHashMap();

    public ewh(android.content.Context context, defpackage.bt btVar) {
        this.e = context;
        this.f = btVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ay */
    private final defpackage.ao l(defpackage.euw euwVar) throws ay {
        ewg ewgVar = euwVar.a;
        ewgVar.getClass();
        ewg ewgVar2 = ewgVar;
        java.lang.String strJ = ewgVar2.j();
        if (strJ.charAt(0) == '.') {
            strJ = java.lang.String.valueOf(this.e.getPackageName()).concat(strJ);
        }
        android.support.v4.app.Fragment fragmentA = this.f.i().a(this.e.getClassLoader(), strJ);
        fragmentA.getClass();
        if (defpackage.ao.class.isAssignableFrom(fragmentA.getClass())) {
            defpackage.ao aoVar = (defpackage.ao) fragmentA;
            aoVar.setArguments(euwVar.a());
            aoVar.getLifecycle().c(this.d);
            this.c.put(euwVar.c, aoVar);
            return aoVar;
        }
        throw new java.lang.IllegalArgumentException("Dialog destination " + ewgVar2.j() + " is not an instance of DialogFragment");
    }

    @Override // defpackage.evv
    public final /* synthetic */ defpackage.evf a() {
        return new ewg(this);
    }

    @Override // defpackage.evv
    public final void d(java.util.List list, defpackage.evk evkVar) {
        defpackage.bt btVar = this.f;
        if (btVar.af()) {
            android.util.Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.euw euwVar = (defpackage.euw) it.next();
            l(euwVar).e(btVar, euwVar.c);
            defpackage.euw euwVar2 = (defpackage.euw) defpackage.afga.aF((java.util.List) f().d.b());
            boolean zBh = defpackage.afga.bh((java.lang.Iterable) f().e.b(), euwVar2);
            f().h(euwVar);
            if (euwVar2 != null && !zBh) {
                f().c(euwVar2);
            }
        }
    }

    @Override // defpackage.evv
    public final void g(defpackage.evx evxVar) {
        defpackage.epy lifecycle;
        super.g(evxVar);
        for (defpackage.euw euwVar : (java.util.List) evxVar.d.b()) {
            defpackage.bt btVar = this.f;
            java.lang.String str = euwVar.c;
            defpackage.ao aoVar = (defpackage.ao) btVar.f(str);
            if (aoVar == null || (lifecycle = aoVar.getLifecycle()) == null) {
                this.b.add(str);
            } else {
                lifecycle.c(this.d);
            }
        }
        this.f.n(new ewf(this));
    }

    @Override // defpackage.evv
    public final void h(defpackage.euw euwVar) {
        euwVar.getClass();
        defpackage.bt btVar = this.f;
        if (btVar.af()) {
            android.util.Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        java.util.Map map = this.c;
        java.lang.String str = euwVar.c;
        defpackage.ao aoVar = (defpackage.ao) map.get(str);
        if (aoVar == null) {
            android.support.v4.app.Fragment fragmentF = btVar.f(str);
            aoVar = fragmentF instanceof defpackage.ao ? (defpackage.ao) fragmentF : null;
        }
        if (aoVar != null) {
            aoVar.getLifecycle().d(this.d);
            aoVar.c();
        }
        l(euwVar).e(btVar, str);
        defpackage.evx evxVarF = f();
        java.util.List list = (java.util.List) evxVarF.d.b();
        java.util.ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            defpackage.euw euwVar2 = (defpackage.euw) listIterator.previous();
            if (defpackage.afga.f(euwVar2.c, str)) {
                ajba ajbaVar = evxVarF.g;
                ajbaVar.d(defpackage.afga.N(defpackage.afga.N((java.util.Set) ajbaVar.b(), euwVar2), euwVar));
                evxVarF.f(euwVar);
                return;
            }
        }
        throw new java.util.NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // defpackage.evv
    public final void j(defpackage.euw euwVar, boolean z) {
        defpackage.bt btVar = this.f;
        if (btVar.af()) {
            android.util.Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        java.util.List list = (java.util.List) f().d.b();
        int iIndexOf = list.indexOf(euwVar);
        java.util.Iterator it = defpackage.afga.aU(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            android.support.v4.app.Fragment fragmentF = btVar.f(((defpackage.euw) it.next()).c);
            if (fragmentF != null) {
                ((defpackage.ao) fragmentF).c();
            }
        }
        k(iIndexOf, euwVar, z);
    }

    public final void k(int i, defpackage.euw euwVar, boolean z) {
        defpackage.euw euwVar2 = (defpackage.euw) defpackage.afga.aC((java.util.List) f().d.b(), i - 1);
        boolean zBh = defpackage.afga.bh((java.lang.Iterable) f().e.b(), euwVar2);
        f().g(euwVar, z);
        if (euwVar2 == null || zBh) {
            return;
        }
        f().c(euwVar2);
    }
}
