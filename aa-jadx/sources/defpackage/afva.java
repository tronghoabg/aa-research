package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class afva<T, V, D extends defpackage.afix<T, ? extends V>> extends defpackage.afvb<V, D> implements defpackage.afix<T, V> {
    private final java.lang.String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afva(java.lang.String str, defpackage.afer<? extends D> aferVar) {
        super(aferVar);
        str.getClass();
        aferVar.getClass();
        this.name = str;
    }

    @Override // defpackage.afix
    public V get(T t) {
        return (V) getDelegate().get(t);
    }

    @Override // defpackage.afix
    public java.lang.Object getDelegate(T t) {
        return getDelegate().getDelegate(t);
    }

    @Override // defpackage.afja
    public defpackage.afiw<T, V> getGetter() {
        return getDelegate().getGetter();
    }

    @Override // defpackage.afid
    public java.lang.String getName() {
        return this.name;
    }

    @Override // defpackage.affc
    public V invoke(T t) {
        return (V) getDelegate().invoke(t);
    }
}
