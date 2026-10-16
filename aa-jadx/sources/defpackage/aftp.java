package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aftp<V> extends defpackage.afuv<V> implements defpackage.afip<V> {
    private final defpackage.afar setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aftp(defpackage.afsj afsjVar, java.lang.String str, java.lang.Object obj, defpackage.agpj agpjVar, defpackage.afqq afqqVar) {
        super(afsjVar, str, obj, agpjVar, afqqVar);
        afsjVar.getClass();
        str.getClass();
        agpjVar.getClass();
        afqqVar.getClass();
        this.setter$delegate = defpackage.afga.cB(2, new defpackage.aftn(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afto setter_delegate$lambda$0(defpackage.aftp aftpVar) {
        return new defpackage.afto(aftpVar);
    }

    @Override // defpackage.afip
    public defpackage.afto<V> getSetter() {
        return (defpackage.afto) this.setter$delegate.a();
    }

    @Override // defpackage.afuv, defpackage.afve
    public defpackage.afve<V> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.aftp(afsjVar, getSignature(), defpackage.affq.NO_RECEIVER, getKmProperty(), afqqVar);
    }
}
