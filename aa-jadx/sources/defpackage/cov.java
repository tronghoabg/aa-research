package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cov {
    public static final java.util.List a = defpackage.afce.a;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public static final java.util.List a(java.lang.String str) {
        if (str == null) {
            return a;
        }
        defpackage.cok cokVar = new defpackage.cok();
        cokVar.a(str);
        ?? r1 = cokVar.a;
        return r1 == 0 ? defpackage.afce.a : r1;
    }

    public static final boolean b(defpackage.cke ckeVar) {
        if (!(ckeVar instanceof defpackage.cjx)) {
            return ckeVar == null;
        }
        int i = ((defpackage.cjx) ckeVar).a;
        return i == 5 || i == 3;
    }
}
