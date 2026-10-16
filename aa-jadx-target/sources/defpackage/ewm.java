package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.evu(a = "fragment")
public class ewm extends defpackage.evv<defpackage.ewk> {
    public final defpackage.bt b;
    private final android.content.Context f;
    private final int g;
    private final java.util.Set h = new java.util.LinkedHashSet();
    public final java.util.List c = new java.util.ArrayList();
    public final defpackage.eqe d = new erk(this, 2, (byte[]) null);
    public final defpackage.affc e = new ewr(this, 1);

    public ewm(android.content.Context context, defpackage.bt btVar, int i) {
        this.f = context;
        this.b = btVar;
        this.g = i;
    }

    public static final boolean k() {
        return android.util.Log.isLoggable("FragmentManager", 2) || android.util.Log.isLoggable("FragmentNavigator", 2);
    }

    public static final void l(android.support.v4.app.Fragment fragment, defpackage.evx evxVar) {
        defpackage.erz viewModelStore = fragment.getViewModelStore();
        viewModelStore.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        defpackage.ere.d(defpackage.afgw.b(ewj.class), new dne(20), linkedHashMap);
        new defpackage.ery(viewModelStore, defpackage.ere.c(linkedHashMap), defpackage.esg.a).a(ewj.class).a = new java.lang.ref.WeakReference(new defpackage.bso(evxVar, fragment, 15));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ay */
    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    private final defpackage.cc m(defpackage.euw euwVar, defpackage.evk evkVar) throws ay {
        defpackage.evf evfVar = euwVar.a;
        evfVar.getClass();
        android.os.Bundle bundleA = euwVar.a();
        java.lang.String strConcat = ((defpackage.ewk) evfVar).a;
        if (strConcat == null) {
            throw new java.lang.IllegalStateException("Fragment class was not set");
        }
        if (strConcat.charAt(0) == '.') {
            strConcat = java.lang.String.valueOf(this.f.getPackageName()).concat(strConcat);
        }
        defpackage.bt btVar = this.b;
        android.support.v4.app.Fragment fragmentA = btVar.i().a(this.f.getClassLoader(), strConcat);
        fragmentA.getClass();
        fragmentA.setArguments(bundleA);
        defpackage.w wVar = new defpackage.w(btVar);
        int i = evkVar != null ? evkVar.f : -1;
        int i2 = evkVar != null ? evkVar.g : -1;
        int i3 = evkVar != null ? evkVar.h : -1;
        int i4 = evkVar != null ? evkVar.i : -1;
        if (i != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            wVar.r(i, i2, i3, i4 != -1 ? i4 : 0);
        } else {
            if (i2 != -1) {
                i = -1;
            } else if (i3 != -1) {
                i = -1;
                i2 = -1;
            } else if (i4 != -1) {
                i = -1;
                i2 = -1;
                i3 = -1;
            }
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            wVar.r(i, i2, i3, i4 != -1 ? i4 : 0);
        }
        wVar.q(this.g, fragmentA, euwVar.c);
        wVar.l(fragmentA);
        wVar.s();
        return wVar;
    }

    private final void n(java.lang.String str, boolean z, boolean z2) {
        if (z2) {
            defpackage.afga.bq(this.c, new defpackage.deh(str, 20));
        }
        this.c.add(new defpackage.afau(str, java.lang.Boolean.valueOf(z)));
    }

    @Override // defpackage.evv
    public final /* synthetic */ defpackage.evf a() {
        return new defpackage.ewk(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ay */
    @Override // defpackage.evv
    public final void d(java.util.List list, defpackage.evk evkVar) throws ay {
        defpackage.bt btVar = this.b;
        if (btVar.af()) {
            android.util.Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.euw euwVar = (defpackage.euw) it.next();
            boolean zIsEmpty = ((java.util.List) f().d.b()).isEmpty();
            if (evkVar != null && !zIsEmpty && evkVar.b) {
                java.util.Set set = this.h;
                java.lang.String str = euwVar.c;
                if (set.remove(str)) {
                    btVar.J(new br(btVar, str), false);
                    f().h(euwVar);
                }
            }
            defpackage.cc ccVarM = m(euwVar, evkVar);
            if (!zIsEmpty) {
                defpackage.euw euwVar2 = (defpackage.euw) defpackage.afga.aF((java.util.List) f().d.b());
                if (euwVar2 != null) {
                    n(euwVar2.c, false, true);
                }
                java.lang.String str2 = euwVar.c;
                n(str2, false, true);
                ccVarM.n(str2);
            }
            ((defpackage.w) ccVarM).i(false, true);
            if (k()) {
                java.util.Objects.toString(euwVar);
                android.util.Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry ".concat(java.lang.String.valueOf(euwVar)));
            }
            f().h(euwVar);
        }
    }

    @Override // defpackage.evv
    public final android.os.Bundle e() {
        java.util.Set set = this.h;
        if (set.isEmpty()) {
            return null;
        }
        android.os.Bundle bundleU = defpackage.ebl.u((defpackage.afau[]) java.util.Arrays.copyOf(new defpackage.afau[0], 0));
        defpackage.fbo.e(bundleU, "androidx-nav-fragment:navigator:savedIds", new java.util.ArrayList(set));
        return bundleU;
    }

    @Override // defpackage.evv
    public final void g(defpackage.evx evxVar) {
        super.g(evxVar);
        if (k()) {
            android.util.Log.v("FragmentNavigator", "onAttach");
        }
        defpackage.bt btVar = this.b;
        btVar.n(new ewi(evxVar, this));
        btVar.j.add(new glm(evxVar, this, (byte[]) null));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ay */
    @Override // defpackage.evv
    public final void h(defpackage.euw euwVar) throws ay {
        euwVar.getClass();
        defpackage.bt btVar = this.b;
        if (btVar.af()) {
            android.util.Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        defpackage.cc ccVarM = m(euwVar, null);
        java.util.List list = (java.util.List) f().d.b();
        if (list.size() > 1) {
            defpackage.euw euwVar2 = (defpackage.euw) defpackage.afga.aC(list, defpackage.afga.ab(list) - 1);
            if (euwVar2 != null) {
                n(euwVar2.c, false, true);
            }
            java.lang.String str = euwVar.c;
            n(str, true, true);
            btVar.al(str);
            n(str, false, false);
            ccVarM.n(str);
        }
        ((defpackage.w) ccVarM).i(false, true);
        f().f(euwVar);
    }

    @Override // defpackage.evv
    public final void i(android.os.Bundle bundle) {
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            java.util.Set set = this.h;
            set.clear();
            defpackage.afga.bk(set, stringArrayList);
        }
    }

    @Override // defpackage.evv
    public final void j(defpackage.euw euwVar, boolean z) {
        defpackage.bt btVar = this.b;
        if (btVar.af()) {
            android.util.Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        java.util.List list = (java.util.List) f().d.b();
        int iIndexOf = list.indexOf(euwVar);
        java.util.List listSubList = list.subList(iIndexOf, list.size());
        defpackage.euw euwVar2 = (defpackage.euw) defpackage.afga.az(list);
        defpackage.euw euwVar3 = (defpackage.euw) defpackage.afga.aC(list, iIndexOf - 1);
        if (euwVar3 != null) {
            n(euwVar3.c, false, true);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listSubList) {
            aitc aitcVarQ = afsg.q(defpackage.afga.bg(this.c), new ews(1));
            java.lang.String str = ((defpackage.euw) obj).c;
            aitb aitbVar = new aitb(aitcVarQ);
            int i = 0;
            while (true) {
                if (aitbVar.hasNext()) {
                    java.lang.Object next = aitbVar.next();
                    if (i < 0) {
                        defpackage.afga.ai();
                    }
                    if (defpackage.afga.f(str, next)) {
                        if (i >= 0) {
                        }
                        arrayList.add(obj);
                    } else {
                        i++;
                    }
                }
                if (!defpackage.afga.f(str, euwVar2.c)) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n(((defpackage.euw) it.next()).c, true, true);
        }
        if (z) {
            for (defpackage.euw euwVar4 : defpackage.afga.aU(listSubList)) {
                if (defpackage.afga.f(euwVar4, euwVar2)) {
                    java.util.Objects.toString(euwVar4);
                    android.util.Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination ".concat(java.lang.String.valueOf(euwVar4)));
                } else {
                    java.lang.String str2 = euwVar4.c;
                    btVar.J(new bs(btVar, str2), false);
                    this.h.add(str2);
                }
            }
        } else {
            btVar.al(euwVar.c);
        }
        if (k()) {
            android.util.Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + euwVar + " with savedState " + z);
        }
        f().g(euwVar, z);
    }
}
