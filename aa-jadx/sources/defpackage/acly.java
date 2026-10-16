package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acly implements defpackage.aclw {
    private static final java.lang.Object a = new java.lang.Object();
    private volatile defpackage.aclw b;
    private volatile java.lang.Object c = a;

    private acly(defpackage.aclw aclwVar) {
        this.b = aclwVar;
    }

    public static defpackage.aclw b(defpackage.aclw aclwVar) {
        return ((aclwVar instanceof defpackage.acly) || (aclwVar instanceof defpackage.acls)) ? aclwVar : new defpackage.acly(aclwVar);
    }

    @Override // defpackage.afak, defpackage.afaj
    public final java.lang.Object a() {
        java.lang.Object obj = this.c;
        if (obj != a) {
            return obj;
        }
        defpackage.aclw aclwVar = this.b;
        if (aclwVar == null) {
            return this.c;
        }
        java.lang.Object objA = aclwVar.a();
        this.c = objA;
        this.b = null;
        return objA;
    }
}
