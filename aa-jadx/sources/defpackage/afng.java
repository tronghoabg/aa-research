package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afng<D, E, V> extends defpackage.afmr<V> implements defpackage.afiy<D, E, V> {
    private final defpackage.afnh<D, E, V> property;

    /* JADX WARN: Multi-variable type inference failed */
    public afng(defpackage.afnh<D, E, ? extends V> afnhVar) {
        afnhVar.getClass();
        this.property = afnhVar;
    }

    @Override // defpackage.affg
    public V invoke(D d, E e) {
        return getProperty().get(d, e);
    }

    @Override // defpackage.afmn, defpackage.afis
    public defpackage.afnh<D, E, V> getProperty() {
        return this.property;
    }
}
