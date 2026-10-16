package defpackage;

/* loaded from: classes3.dex */
public final class aflc<D, E, V> extends aflv<V> implements afhn<D, E, V> {
    private final afld<D, E, V> property;

    public aflc(afld<D, E, V> afldVar) {
        afldVar.getClass();
        this.property = afldVar;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public void m60invoke(D d, E e, V v) {
        getProperty().set(d, e, v);
    }

    @Override // defpackage.afln, defpackage.afhs
    public afld<D, E, V> getProperty() {
        return this.property;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afeh
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m60invoke((aflc<D, E, V>) obj, obj2, obj3);
        return afak.a;
    }
}
