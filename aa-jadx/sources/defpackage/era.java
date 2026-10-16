package defpackage;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
final class era implements defpackage.eqe {
    private final java.lang.Object a;
    private final defpackage.etl b;

    public era(java.lang.Object obj) {
        this.a = obj;
        this.b = defpackage.eph.a.c(obj.getClass());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.eqe
    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
        ?? r0 = this.b.b;
        java.util.List list = (java.util.List) r0.get(epwVar);
        java.lang.Object obj = this.a;
        defpackage.etl.a(list, eqgVar, epwVar, obj);
        defpackage.etl.a((java.util.List) r0.get(defpackage.epw.ON_ANY), eqgVar, epwVar, obj);
    }
}
