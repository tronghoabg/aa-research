package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ebj {
    static android.view.WindowInsets c(android.view.View view, android.view.WindowInsets windowInsets) {
        int i = ebv.a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static void d(defpackage.fbm fbmVar) {
        defpackage.epy lifecycle = fbmVar.getLifecycle();
        defpackage.epx epxVarA = lifecycle.a();
        if (epxVarA == defpackage.epx.b || epxVarA.a(defpackage.epx.d)) {
            fbmVar.getSavedStateRegistry().d(equ.class);
        } else {
            lifecycle.c(new erk(fbmVar, 0));
        }
    }

    public static java.lang.Object e(defpackage.epy epyVar, defpackage.epx epxVar, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        java.lang.Object objA;
        if (epxVar != defpackage.epx.b) {
            return (epyVar.a() != defpackage.epx.a && (objA = ahoi.a(new defpackage.egg(epyVar, epxVar, affgVar, null, 4, null), afdkVar)) == defpackage.afdr.a) ? objA : defpackage.afbk.a;
        }
        throw new java.lang.IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static java.lang.Object f(defpackage.eqg eqgVar, defpackage.epx epxVar, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        java.lang.Object objE = e(eqgVar.getLifecycle(), epxVar, affgVar, afdkVar);
        return objE == defpackage.afdr.a ? objE : defpackage.afbk.a;
    }

    public void a() {
    }

    public void b() {
    }
}
