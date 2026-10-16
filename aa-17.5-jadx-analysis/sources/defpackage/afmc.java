package defpackage;

/* loaded from: classes3.dex */
public final class afmc<T, V> extends aflr<V> implements afhw<T, V> {
    private final afmd<T, V> property;

    /* JADX WARN: Multi-variable type inference failed */
    public afmc(afmd<T, ? extends V> afmdVar) {
        afmdVar.getClass();
        this.property = afmdVar;
    }

    @Override // defpackage.afec
    public V invoke(T t) {
        return getProperty().get(t);
    }

    @Override // defpackage.afln, defpackage.afhs
    public afmd<T, V> getProperty() {
        return this.property;
    }
}
