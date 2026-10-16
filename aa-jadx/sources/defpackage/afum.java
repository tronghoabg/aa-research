package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class afum<V> extends defpackage.afur<V> implements defpackage.afiv<V> {
    private final defpackage.afar<java.lang.Object> delegateValue;
    private final defpackage.afar getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afum(defpackage.afsj afsjVar, java.lang.String str, java.lang.Object obj, defpackage.agpj agpjVar, defpackage.afqq afqqVar) {
        super(afsjVar, str, obj, agpjVar, afqqVar);
        afsjVar.getClass();
        str.getClass();
        agpjVar.getClass();
        afqqVar.getClass();
        this.getter$delegate = defpackage.afga.cB(2, new defpackage.afuj(this));
        this.delegateValue = defpackage.afga.cB(2, new defpackage.afuk(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object delegateValue$lambda$0(defpackage.afum afumVar) {
        return defpackage.afvo.getDelegateImpl(afumVar, afumVar.computeDelegateSource(), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.aful getter_delegate$lambda$0(defpackage.afum afumVar) {
        return new defpackage.aful(afumVar);
    }

    @Override // defpackage.afiv
    public V get() {
        return getGetter().call(new java.lang.Object[0]);
    }

    @Override // defpackage.afiv
    public java.lang.Object getDelegate() {
        return this.delegateValue.a();
    }

    @Override // defpackage.afur, defpackage.afja
    public defpackage.aful<V> getGetter() {
        return (defpackage.aful) this.getter$delegate.a();
    }

    @Override // defpackage.afer
    public V invoke() {
        return get();
    }

    @Override // defpackage.afve
    public defpackage.afve<V> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.afum(afsjVar, getSignature(), defpackage.affq.NO_RECEIVER, getKmProperty(), afqqVar);
    }
}
