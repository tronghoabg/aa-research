package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class afuz<V, D extends defpackage.afiv<? extends V>> extends defpackage.afvb<V, D> implements defpackage.afiv<V> {
    private final java.lang.String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afuz(java.lang.String str, defpackage.afer<? extends D> aferVar) {
        super(aferVar);
        str.getClass();
        aferVar.getClass();
        this.name = str;
    }

    @Override // defpackage.afiv
    public V get() {
        return (V) getDelegate().get();
    }

    @Override // defpackage.afiv
    public java.lang.Object getDelegate() {
        return getDelegate().getDelegate();
    }

    @Override // defpackage.afja
    public defpackage.afiu<V> getGetter() {
        return getDelegate().getGetter();
    }

    @Override // defpackage.afid
    public java.lang.String getName() {
        return this.name;
    }

    @Override // defpackage.afer
    public V invoke() {
        return (V) getDelegate().invoke();
    }
}
