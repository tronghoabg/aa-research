package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afhj<T> implements defpackage.afhm<java.lang.Object, T> {
    private java.lang.Object a;

    @Override // defpackage.afhm, defpackage.afhl
    public final T getValue(java.lang.Object obj, defpackage.afja<?> afjaVar) {
        afjaVar.getClass();
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalStateException("Property " + afjaVar.getName() + " should be initialized before get.");
    }

    @Override // defpackage.afhm
    public final void setValue(java.lang.Object obj, defpackage.afja<?> afjaVar, T t) {
        afjaVar.getClass();
        t.getClass();
        this.a = t;
    }

    public final java.lang.String toString() {
        java.lang.String strConcat;
        java.lang.Object obj = this.a;
        if (obj != null) {
            java.util.Objects.toString(obj);
            strConcat = "value=".concat(obj.toString());
        } else {
            strConcat = "value not initialized yet";
        }
        return defpackage.a.bp(strConcat, "NotNullProperty(", ")");
    }
}
