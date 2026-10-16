package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class afnm<V> extends defpackage.afni<V> {
    private final defpackage.afar getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afnm(defpackage.afsj afsjVar, defpackage.agen agenVar, defpackage.afqq afqqVar) {
        super(afsjVar, agenVar, afqqVar);
        afsjVar.getClass();
        agenVar.getClass();
        afqqVar.getClass();
        this.getter$delegate = defpackage.afga.cB(2, new defpackage.afnk(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afnl getter_delegate$lambda$0(defpackage.afnm afnmVar) {
        return new defpackage.afnl(afnmVar);
    }

    @Override // defpackage.afni, defpackage.afja
    public defpackage.afnl<V> getGetter() {
        return (defpackage.afnl) this.getter$delegate.a();
    }

    @Override // defpackage.afve
    public defpackage.afnm<V> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.afnm<>(afsjVar, getDescriptor(), afqqVar);
    }
}
