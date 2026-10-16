package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aftj<V> extends defpackage.afum<V> implements defpackage.afik<V> {
    private final defpackage.afar setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aftj(defpackage.afsj afsjVar, java.lang.String str, java.lang.Object obj, defpackage.agpj agpjVar, defpackage.afqq afqqVar) {
        super(afsjVar, str, obj, agpjVar, afqqVar);
        afsjVar.getClass();
        str.getClass();
        agpjVar.getClass();
        afqqVar.getClass();
        this.setter$delegate = defpackage.afga.cB(2, new defpackage.afth(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afti setter_delegate$lambda$0(defpackage.aftj aftjVar) {
        return new defpackage.afti(aftjVar);
    }

    @Override // defpackage.afik, defpackage.afip
    public defpackage.afti<V> getSetter() {
        return (defpackage.afti) this.setter$delegate.a();
    }

    @Override // defpackage.afik
    public void set(V v) {
        getSetter().call(v);
    }

    @Override // defpackage.afum, defpackage.afve
    public defpackage.afve<V> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.aftj(afsjVar, getSignature(), defpackage.affq.NO_RECEIVER, getKmProperty(), afqqVar);
    }
}
