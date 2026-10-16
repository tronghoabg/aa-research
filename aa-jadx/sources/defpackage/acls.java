package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acls implements defpackage.aclw, defpackage.aclm {
    private static final java.lang.Object a = new java.lang.Object();
    private volatile defpackage.aclw b;
    private volatile java.lang.Object c = a;

    private acls(defpackage.aclw aclwVar) {
        this.b = aclwVar;
    }

    public static defpackage.aclm b(defpackage.aclw aclwVar) {
        if (aclwVar instanceof defpackage.aclm) {
            return (defpackage.aclm) aclwVar;
        }
        aclwVar.getClass();
        return new defpackage.acls(aclwVar);
    }

    public static defpackage.aclw c(defpackage.aclw aclwVar) {
        return aclwVar instanceof defpackage.acls ? aclwVar : new defpackage.acls(aclwVar);
    }

    private final synchronized java.lang.Object d() {
        java.lang.Object obj = this.c;
        java.lang.Object obj2 = a;
        if (obj != obj2) {
            return obj;
        }
        java.lang.Object objA = this.b.a();
        java.lang.Object obj3 = this.c;
        if (obj3 != obj2 && obj3 != objA) {
            throw new java.lang.IllegalStateException(defpackage.a.bv(objA, obj3, "Scoped provider was invoked recursively returning different results: ", " & ", ". This is likely due to a circular dependency."));
        }
        this.c = objA;
        this.b = null;
        return objA;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final java.lang.Object a() {
        java.lang.Object obj = this.c;
        return obj == a ? d() : obj;
    }
}
