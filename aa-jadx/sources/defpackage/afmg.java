package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afmg<V> extends defpackage.afnm<V> implements defpackage.afip<V> {
    private final defpackage.afar setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afmg(defpackage.afsj afsjVar, defpackage.agen agenVar, defpackage.afqq afqqVar) {
        super(afsjVar, agenVar, afqqVar);
        afsjVar.getClass();
        agenVar.getClass();
        afqqVar.getClass();
        this.setter$delegate = defpackage.afga.cB(2, new defpackage.afme(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afmf setter_delegate$lambda$0(defpackage.afmg afmgVar) {
        return new defpackage.afmf(afmgVar);
    }

    @Override // defpackage.afip
    public defpackage.afmf<V> getSetter() {
        return (defpackage.afmf) this.setter$delegate.a();
    }

    @Override // defpackage.afnm, defpackage.afve
    public defpackage.afmg<V> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.afmg<>(afsjVar, getDescriptor(), afqqVar);
    }
}
