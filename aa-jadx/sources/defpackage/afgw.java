package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class afgw {
    public static final defpackage.afgx a;

    static {
        defpackage.afgx afgxVar = null;
        try {
            afgxVar = (defpackage.afgx) java.lang.Class.forName("afvx").newInstance();
        } catch (java.lang.ClassCastException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
        }
        if (afgxVar == null) {
            afgxVar = new defpackage.afgx();
        }
        a = afgxVar;
    }

    public static java.lang.String a(defpackage.affw affwVar) {
        return a.renderLambdaToString(affwVar);
    }

    public static defpackage.afie b(java.lang.Class cls) {
        return a.getOrCreateKotlinClass(cls);
    }

    public static defpackage.afig c(java.lang.Class cls) {
        return a.getOrCreateKotlinPackage(cls, "");
    }

    public static defpackage.afjb d(defpackage.afjb afjbVar) {
        return a.mutableCollectionType(afjbVar);
    }

    public static defpackage.afjb e(java.lang.Class cls) {
        return a.typeOf(b(cls), java.util.Collections.EMPTY_LIST, true);
    }

    public static defpackage.afjb f(java.lang.Class cls) {
        return a.typeOf(b(cls), java.util.Collections.EMPTY_LIST, false);
    }

    public static defpackage.afjb g(java.lang.Class cls, defpackage.afjd afjdVar) {
        return a.typeOf(b(cls), java.util.Collections.singletonList(afjdVar), false);
    }
}
