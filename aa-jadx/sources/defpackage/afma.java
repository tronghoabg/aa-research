package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afma<T, V> extends defpackage.afnd<T, V> implements defpackage.afim<T, V> {
    private final defpackage.afar setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afma(defpackage.afsj afsjVar, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        super(afsjVar, str, str2, obj);
        afsjVar.getClass();
        str.getClass();
        str2.getClass();
        this.setter$delegate = defpackage.afga.cB(2, new defpackage.afly(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.aflz setter_delegate$lambda$0(defpackage.afma afmaVar) {
        return new defpackage.aflz(afmaVar);
    }

    @Override // defpackage.afim, defpackage.afip
    public defpackage.aflz<T, V> getSetter() {
        return (defpackage.aflz) this.setter$delegate.a();
    }

    @Override // defpackage.afim
    public void set(T t, V v) {
        getSetter().call(t, v);
    }

    @Override // defpackage.afnd, defpackage.afve
    public defpackage.afma<T, V> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.afma<>(afsjVar, getDescriptor(), afqqVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afma(defpackage.afsj afsjVar, defpackage.agen agenVar, defpackage.afqq afqqVar) {
        super(afsjVar, agenVar, afqqVar);
        afsjVar.getClass();
        agenVar.getClass();
        afqqVar.getClass();
        this.setter$delegate = defpackage.afga.cB(2, new defpackage.afly(this));
    }
}
