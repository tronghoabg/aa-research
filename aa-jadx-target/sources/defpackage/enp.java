package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class enp {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.eno b = defpackage.eno.a;

    public static final void a(android.support.v4.app.Fragment fragment, java.lang.String str) {
        fragment.getClass();
        enm enmVar = new enm(fragment, str);
        d(enmVar);
        defpackage.eno enoVarB = b(fragment);
        if (enoVarB.b.contains(defpackage.enn.c) && e(enoVarB, fragment.getClass(), enmVar.getClass())) {
            c(enoVarB, enmVar);
        }
    }

    public static final defpackage.eno b(android.support.v4.app.Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager();
            }
            fragment = fragment.getParentFragment();
        }
        return b;
    }

    public static final void c(defpackage.eno enoVar, defpackage.enz enzVar) {
        android.support.v4.app.Fragment fragment = enzVar.a;
        java.lang.String name = fragment.getClass().getName();
        java.util.Set set = enoVar.b;
        if (set.contains(defpackage.enn.a)) {
            android.util.Log.d("FragmentStrictMode", "Policy violation in ".concat(java.lang.String.valueOf(name)), enzVar);
        }
        if (set.contains(defpackage.enn.b)) {
            defpackage.af afVar = new defpackage.af(name, enzVar, 20);
            if (!fragment.isAdded()) {
                afVar.run();
                return;
            }
            android.os.Handler handler = fragment.getParentFragmentManager().m.d;
            if (defpackage.afga.f(handler.getLooper(), android.os.Looper.myLooper())) {
                afVar.run();
            } else {
                handler.post(afVar);
            }
        }
    }

    public static final void d(defpackage.enz enzVar) {
        if (defpackage.bt.ac(3)) {
            android.util.Log.d("FragmentManager", "StrictMode violation in ".concat(java.lang.String.valueOf(enzVar.a.getClass().getName())), enzVar);
        }
    }

    public static final boolean e(defpackage.eno enoVar, java.lang.Class cls, java.lang.Class cls2) {
        java.util.Set set = (java.util.Set) enoVar.c.get(cls.getName());
        if (set == null) {
            return true;
        }
        return (defpackage.afga.f(cls2.getSuperclass(), defpackage.enz.class) || !defpackage.afga.bh(set, cls2.getSuperclass())) && !set.contains(cls2);
    }
}
