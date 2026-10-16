package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jyd implements defpackage.aizk {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public jyd(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [aizk, java.lang.Object] */
    @Override // defpackage.aizk
    public final java.lang.Object a(java.lang.Object obj, defpackage.afdk afdkVar) {
        java.lang.Object objA;
        java.lang.Object objA2;
        int i = this.b;
        if (i == 0) {
            java.lang.Object objA3 = this.a.a(defpackage.afga.aB((java.util.List) obj), afdkVar);
            return objA3 == defpackage.afdr.a ? objA3 : defpackage.afbk.a;
        }
        if (i == 1) {
            java.lang.Object objA4 = this.a.a(java.lang.Boolean.valueOf(!((java.lang.Boolean) obj).booleanValue()), afdkVar);
            return objA4 == defpackage.afdr.a ? objA4 : defpackage.afbk.a;
        }
        if (i == 2) {
            return (((java.lang.Boolean) obj).booleanValue() || (objA = this.a.a(obj, afdkVar)) != defpackage.afdr.a) ? defpackage.afbk.a : objA;
        }
        if (i == 3) {
            defpackage.afgz.s(afdkVar.gT());
            return this.a.a(obj, afdkVar);
        }
        if (i == 4) {
            if (obj == null) {
                obj = defpackage.ajcb.a;
            }
            return ((defpackage.aiyl) this.a).h(obj, afdkVar);
        }
        if (i != 5) {
            return (obj == null || (objA2 = this.a.a(obj, afdkVar)) != defpackage.afdr.a) ? defpackage.afbk.a : objA2;
        }
        ((defpackage.afgv) this.a).a = obj;
        throw new defpackage.ajbf(this);
    }
}
