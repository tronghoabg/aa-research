package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class afnh<D, E, V> extends defpackage.afni<V> implements defpackage.afiz<D, E, V> {
    private final defpackage.afar<java.lang.reflect.Member> delegateSource;
    private final defpackage.afar getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afnh(defpackage.afsj afsjVar, java.lang.String str, java.lang.String str2) {
        super(afsjVar, str, str2, defpackage.affq.NO_RECEIVER);
        afsjVar.getClass();
        str.getClass();
        str2.getClass();
        this.getter$delegate = defpackage.afga.cB(2, new defpackage.afne(this));
        this.delegateSource = defpackage.afga.cB(2, new defpackage.afnf(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afng getter_delegate$lambda$0(defpackage.afnh afnhVar) {
        return new defpackage.afng(afnhVar);
    }

    public V get(D d, E e) {
        return getGetter().call(d, e);
    }

    public java.lang.Object getDelegate(D d, E e) {
        return defpackage.afvo.getDelegateImpl(this, (java.lang.reflect.Member) this.delegateSource.a(), d, e);
    }

    @Override // defpackage.afni, defpackage.afja
    public defpackage.afng<D, E, V> getGetter() {
        return (defpackage.afng) this.getter$delegate.a();
    }

    @Override // defpackage.affg
    public V invoke(D d, E e) {
        return get(d, e);
    }

    @Override // defpackage.afve
    public defpackage.afnh<D, E, V> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.afnh<>(afsjVar, getDescriptor(), afqqVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afnh(defpackage.afsj afsjVar, defpackage.agen agenVar, defpackage.afqq afqqVar) {
        super(afsjVar, agenVar, afqqVar);
        afsjVar.getClass();
        agenVar.getClass();
        afqqVar.getClass();
        this.getter$delegate = defpackage.afga.cB(2, new defpackage.afne(this));
        this.delegateSource = defpackage.afga.cB(2, new defpackage.afnf(this));
    }
}
