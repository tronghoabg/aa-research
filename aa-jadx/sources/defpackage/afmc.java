package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afmc<D, E, V> extends defpackage.afmv<V> implements defpackage.afin<D, E, V> {
    private final defpackage.afmd<D, E, V> property;

    public afmc(defpackage.afmd<D, E, V> afmdVar) {
        afmdVar.getClass();
        this.property = afmdVar;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public void m59invoke(D d, E e, V v) {
        getProperty().set(d, e, v);
    }

    @Override // defpackage.afmn, defpackage.afis
    public defpackage.afmd<D, E, V> getProperty() {
        return this.property;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.affh
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        m59invoke(obj, obj2, obj3);
        return defpackage.afbk.a;
    }
}
