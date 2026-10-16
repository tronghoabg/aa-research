package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afup<T, V> extends defpackage.afuf<V> implements defpackage.afiw<T, V> {
    private final defpackage.afuq<T, V> property;

    /* JADX WARN: Multi-variable type inference failed */
    public afup(defpackage.afuq<T, ? extends V> afuqVar) {
        afuqVar.getClass();
        this.property = afuqVar;
    }

    @Override // defpackage.affc
    public V invoke(T t) {
        return getProperty().get(t);
    }

    @Override // defpackage.afud, defpackage.afis
    public defpackage.afuq<T, V> getProperty() {
        return this.property;
    }
}
