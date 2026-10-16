package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class afbl implements java.io.Serializable, defpackage.afar {
    private defpackage.afer a;
    private java.lang.Object b = defpackage.afbg.a;

    public afbl(defpackage.afer aferVar) {
        this.a = aferVar;
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() {
        return new defpackage.afao(a());
    }

    @Override // defpackage.afar
    public final java.lang.Object a() {
        if (this.b == defpackage.afbg.a) {
            defpackage.afer aferVar = this.a;
            aferVar.getClass();
            this.b = aferVar.invoke();
            this.a = null;
        }
        return this.b;
    }

    @Override // defpackage.afar
    public final boolean b() {
        throw null;
    }

    public final java.lang.String toString() {
        return this.b != defpackage.afbg.a ? java.lang.String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
