package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afmd<D, E, V> extends defpackage.afnh<D, E, V> implements defpackage.afio<D, E, V> {
    private final defpackage.afar setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afmd(defpackage.afsj afsjVar, java.lang.String str, java.lang.String str2) {
        super(afsjVar, str, str2);
        afsjVar.getClass();
        str.getClass();
        str2.getClass();
        this.setter$delegate = defpackage.afga.cB(2, new defpackage.afmb(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afmc setter_delegate$lambda$0(defpackage.afmd afmdVar) {
        return new defpackage.afmc(afmdVar);
    }

    @Override // defpackage.afip
    public defpackage.afmc<D, E, V> getSetter() {
        return (defpackage.afmc) this.setter$delegate.a();
    }

    public void set(D d, E e, V v) {
        getSetter().call(d, e, v);
    }

    @Override // defpackage.afnh, defpackage.afve
    public defpackage.afmd<D, E, V> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.afmd<>(afsjVar, getDescriptor(), afqqVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afmd(defpackage.afsj afsjVar, defpackage.agen agenVar, defpackage.afqq afqqVar) {
        super(afsjVar, agenVar, afqqVar);
        afsjVar.getClass();
        agenVar.getClass();
        afqqVar.getClass();
        this.setter$delegate = defpackage.afga.cB(2, new defpackage.afmb(this));
    }
}
