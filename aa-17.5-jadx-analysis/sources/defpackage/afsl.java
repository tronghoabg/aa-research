package defpackage;

/* loaded from: classes3.dex */
public final class afsl<T, V> extends afti<V> implements afhl<T, V> {
    private final afsm<T, V> property;

    public afsl(afsm<T, V> afsmVar) {
        afsmVar.getClass();
        this.property = afsmVar;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public void m64invoke(T t, V v) {
        getProperty().set(t, v);
    }

    @Override // defpackage.aftd, defpackage.afhs
    public afsm<T, V> getProperty() {
        return this.property;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afeg
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m64invoke((afsl<T, V>) obj, obj2);
        return afak.a;
    }
}
