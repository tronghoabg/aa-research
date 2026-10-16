package defpackage;

/* loaded from: classes3.dex */
public final class afkz<T, V> extends aflv<V> implements afhl<T, V> {
    private final afla<T, V> property;

    public afkz(afla<T, V> aflaVar) {
        aflaVar.getClass();
        this.property = aflaVar;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public void m59invoke(T t, V v) {
        getProperty().set(t, v);
    }

    @Override // defpackage.afln, defpackage.afhs
    public afla<T, V> getProperty() {
        return this.property;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afeg
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m59invoke((afkz<T, V>) obj, obj2);
        return afak.a;
    }
}
