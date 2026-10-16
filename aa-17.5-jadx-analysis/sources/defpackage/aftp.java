package defpackage;

/* loaded from: classes3.dex */
public final class aftp<T, V> extends aftf<V> implements afhw<T, V> {
    private final aftq<T, V> property;

    /* JADX WARN: Multi-variable type inference failed */
    public aftp(aftq<T, ? extends V> aftqVar) {
        aftqVar.getClass();
        this.property = aftqVar;
    }

    @Override // defpackage.afec
    public V invoke(T t) {
        return getProperty().get(t);
    }

    @Override // defpackage.aftd, defpackage.afhs
    public aftq<T, V> getProperty() {
        return this.property;
    }
}
