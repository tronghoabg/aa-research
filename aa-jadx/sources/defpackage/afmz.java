package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class afmz<V> extends defpackage.afni<V> implements defpackage.afiv<V> {
    private final defpackage.afar<java.lang.Object> delegateValue;
    private final defpackage.afar getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afmz(defpackage.afsj afsjVar, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        super(afsjVar, str, str2, obj);
        afsjVar.getClass();
        str.getClass();
        str2.getClass();
        this.getter$delegate = defpackage.afga.cB(2, new defpackage.afmw(this));
        this.delegateValue = defpackage.afga.cB(2, new defpackage.afmx(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object delegateValue$lambda$0(defpackage.afmz afmzVar) {
        return defpackage.afvo.getDelegateImpl(afmzVar, afmzVar.computeDelegateSource(), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afmy getter_delegate$lambda$0(defpackage.afmz afmzVar) {
        return new defpackage.afmy(afmzVar);
    }

    @Override // defpackage.afiv
    public V get() {
        return getGetter().call(new java.lang.Object[0]);
    }

    @Override // defpackage.afiv
    public java.lang.Object getDelegate() {
        return this.delegateValue.a();
    }

    @Override // defpackage.afni, defpackage.afja
    public defpackage.afmy<V> getGetter() {
        return (defpackage.afmy) this.getter$delegate.a();
    }

    @Override // defpackage.afer
    public V invoke() {
        return get();
    }

    @Override // defpackage.afve
    public defpackage.afmz<V> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.afmz<>(afsjVar, getDescriptor(), afqqVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afmz(defpackage.afsj afsjVar, defpackage.agen agenVar, defpackage.afqq afqqVar) {
        super(afsjVar, agenVar, afqqVar);
        afsjVar.getClass();
        agenVar.getClass();
        afqqVar.getClass();
        this.getter$delegate = defpackage.afga.cB(2, new defpackage.afmw(this));
        this.delegateValue = defpackage.afga.cB(2, new defpackage.afmx(this));
    }
}
