package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aftm<T, V> extends defpackage.afuq<T, V> implements defpackage.afim<T, V> {
    private final defpackage.afar setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aftm(defpackage.afsj afsjVar, java.lang.String str, java.lang.Object obj, defpackage.agpj agpjVar, defpackage.afqq afqqVar) {
        super(afsjVar, str, obj, agpjVar, afqqVar);
        afsjVar.getClass();
        str.getClass();
        agpjVar.getClass();
        afqqVar.getClass();
        this.setter$delegate = defpackage.afga.cB(2, new defpackage.aftk(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.aftl setter_delegate$lambda$0(defpackage.aftm aftmVar) {
        return new defpackage.aftl(aftmVar);
    }

    @Override // defpackage.afim, defpackage.afip
    public defpackage.aftl<T, V> getSetter() {
        return (defpackage.aftl) this.setter$delegate.a();
    }

    @Override // defpackage.afim
    public void set(T t, V v) {
        getSetter().call(t, v);
    }

    @Override // defpackage.afuq, defpackage.afve
    public defpackage.afve<V> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.aftm(afsjVar, getSignature(), defpackage.affq.NO_RECEIVER, getKmProperty(), afqqVar);
    }
}
