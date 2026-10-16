package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aflz<T, V> extends defpackage.afmv<V> implements defpackage.afil<T, V> {
    private final defpackage.afma<T, V> property;

    public aflz(defpackage.afma<T, V> afmaVar) {
        afmaVar.getClass();
        this.property = afmaVar;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public void m58invoke(T t, V v) {
        getProperty().set(t, v);
    }

    @Override // defpackage.afmn, defpackage.afis
    public defpackage.afma<T, V> getProperty() {
        return this.property;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.affg
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        m58invoke(obj, obj2);
        return defpackage.afbk.a;
    }
}
