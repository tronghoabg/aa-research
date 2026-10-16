package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class afuv<V> extends defpackage.afur<V> {
    private final defpackage.afar getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afuv(defpackage.afsj afsjVar, java.lang.String str, java.lang.Object obj, defpackage.agpj agpjVar, defpackage.afqq afqqVar) {
        super(afsjVar, str, obj, agpjVar, afqqVar);
        afsjVar.getClass();
        str.getClass();
        agpjVar.getClass();
        afqqVar.getClass();
        this.getter$delegate = defpackage.afga.cB(2, new defpackage.afut(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afuu getter_delegate$lambda$0(defpackage.afuv afuvVar) {
        return new defpackage.afuu(afuvVar);
    }

    @Override // defpackage.afur, defpackage.afja
    public defpackage.afuu<V> getGetter() {
        return (defpackage.afuu) this.getter$delegate.a();
    }

    @Override // defpackage.afve
    public defpackage.afve<V> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.afuv(afsjVar, getSignature(), defpackage.affq.NO_RECEIVER, getKmProperty(), afqqVar);
    }
}
