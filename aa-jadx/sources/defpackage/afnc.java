package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afnc<T, V> extends defpackage.afmr<V> implements defpackage.afiw<T, V> {
    private final defpackage.afnd<T, V> property;

    /* JADX WARN: Multi-variable type inference failed */
    public afnc(defpackage.afnd<T, ? extends V> afndVar) {
        afndVar.getClass();
        this.property = afndVar;
    }

    @Override // defpackage.affc
    public V invoke(T t) {
        return getProperty().get(t);
    }

    @Override // defpackage.afmn, defpackage.afis
    public defpackage.afnd<T, V> getProperty() {
        return this.property;
    }
}
