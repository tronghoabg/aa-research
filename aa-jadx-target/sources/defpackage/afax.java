package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afax implements java.io.Serializable, defpackage.afar {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.afax.class, java.lang.Object.class, "c");
    private volatile defpackage.afer b;
    private volatile java.lang.Object c = defpackage.afbg.a;

    public afax(defpackage.afer aferVar) {
        this.b = aferVar;
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() {
        return new afao(a());
    }

    @Override // defpackage.afar
    public final java.lang.Object a() {
        java.lang.Object obj = this.c;
        defpackage.afbg afbgVar = defpackage.afbg.a;
        if (obj != afbgVar) {
            return obj;
        }
        defpackage.afer aferVar = this.b;
        if (aferVar != null) {
            java.lang.Object objInvoke = aferVar.invoke();
            if (defpackage.a.h(a, this, afbgVar, objInvoke)) {
                this.b = null;
                return objInvoke;
            }
        }
        return this.c;
    }

    @Override // defpackage.afar
    public final boolean b() {
        throw null;
    }

    public final java.lang.String toString() {
        return this.c != defpackage.afbg.a ? java.lang.String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
