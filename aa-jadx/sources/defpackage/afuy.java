package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afuy<T, V, D extends defpackage.afim<T, V>> extends defpackage.afva<T, V, D> implements defpackage.afim<T, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afuy(java.lang.String str, defpackage.afer<? extends D> aferVar) {
        super(str, aferVar);
        str.getClass();
        aferVar.getClass();
    }

    @Override // defpackage.afip
    public defpackage.afil<T, V> getSetter() {
        return getDelegate().getSetter();
    }

    @Override // defpackage.afim
    public void set(T t, V v) {
        getDelegate().set(t, v);
    }
}
