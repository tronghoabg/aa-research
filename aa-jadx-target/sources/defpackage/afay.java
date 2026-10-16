package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afay implements java.io.Serializable, defpackage.afar {
    private defpackage.afer a;
    private volatile java.lang.Object b = defpackage.afbg.a;
    private final java.lang.Object c = this;

    public afay(defpackage.afer aferVar) {
        this.a = aferVar;
    }

    private final java.lang.Object writeReplace() {
        return new afao(a());
    }

    @Override // defpackage.afar
    public final java.lang.Object a() {
        java.lang.Object objInvoke;
        java.lang.Object obj = this.b;
        defpackage.afbg afbgVar = defpackage.afbg.a;
        if (obj != afbgVar) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == afbgVar) {
                defpackage.afer aferVar = this.a;
                aferVar.getClass();
                objInvoke = aferVar.invoke();
                this.b = objInvoke;
                this.a = null;
            }
        }
        return objInvoke;
    }

    @Override // defpackage.afar
    public final boolean b() {
        return this.b != defpackage.afbg.a;
    }

    public final java.lang.String toString() {
        return b() ? java.lang.String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
