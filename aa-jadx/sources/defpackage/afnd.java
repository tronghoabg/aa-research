package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class afnd<T, V> extends defpackage.afni<V> implements defpackage.afix<T, V> {
    private final defpackage.afar<java.lang.reflect.Member> delegateSource;
    private final defpackage.afar getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afnd(defpackage.afsj afsjVar, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        super(afsjVar, str, str2, obj);
        afsjVar.getClass();
        str.getClass();
        str2.getClass();
        this.getter$delegate = defpackage.afga.cB(2, new defpackage.afna(this));
        this.delegateSource = defpackage.afga.cB(2, new defpackage.afnb(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afnc getter_delegate$lambda$0(defpackage.afnd afndVar) {
        return new defpackage.afnc(afndVar);
    }

    @Override // defpackage.afix
    public V get(T t) {
        return getGetter().call(t);
    }

    @Override // defpackage.afix
    public java.lang.Object getDelegate(T t) {
        return defpackage.afvo.getDelegateImpl(this, (java.lang.reflect.Member) this.delegateSource.a(), t, null);
    }

    @Override // defpackage.afni, defpackage.afja
    public defpackage.afnc<T, V> getGetter() {
        return (defpackage.afnc) this.getter$delegate.a();
    }

    @Override // defpackage.affc
    public V invoke(T t) {
        return get(t);
    }

    @Override // defpackage.afve
    public defpackage.afnd<T, V> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.afnd<>(afsjVar, getDescriptor(), afqqVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afnd(defpackage.afsj afsjVar, defpackage.agen agenVar, defpackage.afqq afqqVar) {
        super(afsjVar, agenVar, afqqVar);
        afsjVar.getClass();
        agenVar.getClass();
        afqqVar.getClass();
        this.getter$delegate = defpackage.afga.cB(2, new defpackage.afna(this));
        this.delegateSource = defpackage.afga.cB(2, new defpackage.afnb(this));
    }
}
