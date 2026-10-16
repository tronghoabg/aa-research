package defpackage;

/* loaded from: classes3.dex */
public final class afmg<D, E, V> extends aflr<V> implements afhy<D, E, V> {
    private final afmh<D, E, V> property;

    /* JADX WARN: Multi-variable type inference failed */
    public afmg(afmh<D, E, ? extends V> afmhVar) {
        afmhVar.getClass();
        this.property = afmhVar;
    }

    @Override // defpackage.afeg
    public V invoke(D d, E e) {
        return getProperty().get(d, e);
    }

    @Override // defpackage.afln, defpackage.afhs
    public afmh<D, E, V> getProperty() {
        return this.property;
    }
}
