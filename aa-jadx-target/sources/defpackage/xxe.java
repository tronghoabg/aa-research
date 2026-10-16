package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xxe extends defpackage.xyn {
    public static final defpackage.xxe a = new defpackage.xxe();
    private static final long serialVersionUID = 0;

    private xxe() {
    }

    private java.lang.Object readResolve() {
        return a;
    }

    @Override // defpackage.xyn
    public final defpackage.xyn a(defpackage.xyd xydVar) {
        return a;
    }

    @Override // defpackage.xyn
    public final java.lang.Object b() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.xyn
    public final java.lang.Object c(defpackage.xzi xziVar) {
        java.lang.Object objFF = xziVar.fF();
        objFF.getClass();
        return objFF;
    }

    @Override // defpackage.xyn
    public final java.lang.Object d(java.lang.Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // defpackage.xyn
    public final java.lang.Object e() {
        return null;
    }

    @Override // defpackage.xyn
    public final boolean equals(java.lang.Object obj) {
        return this == obj;
    }

    @Override // defpackage.xyn
    public final boolean f() {
        return false;
    }

    @Override // defpackage.xyn
    public final int hashCode() {
        return 2040732332;
    }

    public final java.lang.String toString() {
        return "Optional.absent()";
    }
}
