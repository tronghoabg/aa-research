package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xzk implements defpackage.xzi {
    private volatile defpackage.xzi a;
    private java.lang.Object b;
    private final defpackage.affp c = new defpackage.affp();

    public xzk(defpackage.xzi xziVar) {
        xziVar.getClass();
        this.a = xziVar;
    }

    @Override // defpackage.xzi
    public final java.lang.Object fF() {
        if (this.a != null) {
            synchronized (this.c) {
                if (this.a != null) {
                    java.lang.Object objFF = this.a.fF();
                    this.b = objFF;
                    this.a = null;
                    return objFF;
                }
            }
        }
        return this.b;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.a;
        if (obj == null) {
            obj = "<supplier that returned " + java.lang.String.valueOf(this.b) + ">";
        }
        return defpackage.a.bV(obj, "Suppliers.memoize(", ")");
    }
}
