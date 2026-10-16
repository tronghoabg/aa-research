package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xys extends defpackage.xyn {
    private static final long serialVersionUID = 0;
    public final java.lang.Object a;

    public xys(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // defpackage.xyn
    public final defpackage.xyn a(defpackage.xyd xydVar) {
        java.lang.Object objA = xydVar.a(this.a);
        objA.getClass();
        return new defpackage.xys(objA);
    }

    @Override // defpackage.xyn
    public final java.lang.Object b() {
        return this.a;
    }

    @Override // defpackage.xyn
    public final java.lang.Object c(defpackage.xzi xziVar) {
        return this.a;
    }

    @Override // defpackage.xyn
    public final java.lang.Object d(java.lang.Object obj) {
        obj.getClass();
        return this.a;
    }

    @Override // defpackage.xyn
    public final java.lang.Object e() {
        return this.a;
    }

    @Override // defpackage.xyn
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.xys) {
            return this.a.equals(((defpackage.xys) obj).a);
        }
        return false;
    }

    @Override // defpackage.xyn
    public final boolean f() {
        return true;
    }

    @Override // defpackage.xyn
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final java.lang.String toString() {
        return "Optional.of(" + this.a.toString() + ")";
    }
}
