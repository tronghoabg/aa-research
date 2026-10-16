package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ptm implements defpackage.aclm {
    final defpackage.xzi a;
    volatile transient boolean b;
    transient java.lang.Object c;

    public ptm(defpackage.xzi xziVar) {
        this.a = xziVar;
    }

    public static defpackage.ptm b(java.lang.Object obj) {
        return new defpackage.ptm(new defpackage.xzl(obj));
    }

    @Override // defpackage.aclm
    public final java.lang.Object a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    java.lang.Object objFF = this.a.fF();
                    this.c = objFF;
                    this.b = true;
                    return objFF;
                }
            }
        }
        return this.c;
    }

    public final java.lang.String toString() {
        return "LazySingleton.of(" + this.a.toString() + ")";
    }
}
