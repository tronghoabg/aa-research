package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class afuq<T, V> extends defpackage.afur<V> implements defpackage.afix<T, V> {
    private final defpackage.afar<java.lang.reflect.Member> delegateSource;
    private final defpackage.afar getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afuq(defpackage.afsj afsjVar, java.lang.String str, java.lang.Object obj, defpackage.agpj agpjVar, defpackage.afqq afqqVar) {
        super(afsjVar, str, obj, agpjVar, afqqVar);
        afsjVar.getClass();
        str.getClass();
        agpjVar.getClass();
        afqqVar.getClass();
        this.getter$delegate = defpackage.afga.cB(2, new defpackage.afun(this));
        this.delegateSource = defpackage.afga.cB(2, new defpackage.afuo(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afup getter_delegate$lambda$0(defpackage.afuq afuqVar) {
        return new defpackage.afup(afuqVar);
    }

    @Override // defpackage.afix
    public V get(T t) {
        return getGetter().call(t);
    }

    @Override // defpackage.afix
    public java.lang.Object getDelegate(T t) {
        return defpackage.afvo.getDelegateImpl(this, (java.lang.reflect.Member) this.delegateSource.a(), t, null);
    }

    @Override // defpackage.afur, defpackage.afja
    public defpackage.afup<T, V> getGetter() {
        return (defpackage.afup) this.getter$delegate.a();
    }

    @Override // defpackage.affc
    public V invoke(T t) {
        return get(t);
    }

    @Override // defpackage.afve
    public defpackage.afve<V> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.afuq(afsjVar, getSignature(), defpackage.affq.NO_RECEIVER, getKmProperty(), afqqVar);
    }
}
