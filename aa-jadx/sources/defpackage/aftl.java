package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aftl<T, V> extends defpackage.afui<V> implements defpackage.afil<T, V> {
    private final defpackage.aftm<T, V> property;

    public aftl(defpackage.aftm<T, V> aftmVar) {
        aftmVar.getClass();
        this.property = aftmVar;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public void m63invoke(T t, V v) {
        getProperty().set(t, v);
    }

    @Override // defpackage.afud, defpackage.afis
    public defpackage.aftm<T, V> getProperty() {
        return this.property;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.affg
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        m63invoke(obj, obj2);
        return defpackage.afbk.a;
    }
}
