package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afux<V, D extends defpackage.afik<V>> extends defpackage.afuz<V, D> implements defpackage.afik<V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afux(java.lang.String str, defpackage.afer<? extends D> aferVar) {
        super(str, aferVar);
        str.getClass();
        aferVar.getClass();
    }

    @Override // defpackage.afip
    public defpackage.afij<V> getSetter() {
        return getDelegate().getSetter();
    }

    @Override // defpackage.afik
    public void set(V v) {
        getDelegate().set(v);
    }
}
