package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aflx<V> extends defpackage.afmz<V> implements defpackage.afik<V> {
    private final defpackage.afar setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aflx(defpackage.afsj afsjVar, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        super(afsjVar, str, str2, obj);
        afsjVar.getClass();
        str.getClass();
        str2.getClass();
        this.setter$delegate = defpackage.afga.cB(2, new defpackage.aflv(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.aflw setter_delegate$lambda$0(defpackage.aflx aflxVar) {
        return new defpackage.aflw(aflxVar);
    }

    @Override // defpackage.afik, defpackage.afip
    public defpackage.aflw<V> getSetter() {
        return (defpackage.aflw) this.setter$delegate.a();
    }

    @Override // defpackage.afik
    public void set(V v) {
        getSetter().call(v);
    }

    @Override // defpackage.afmz, defpackage.afve
    public defpackage.aflx<V> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.aflx<>(afsjVar, getDescriptor(), afqqVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aflx(defpackage.afsj afsjVar, defpackage.agen agenVar, defpackage.afqq afqqVar) {
        super(afsjVar, agenVar, afqqVar);
        afsjVar.getClass();
        agenVar.getClass();
        afqqVar.getClass();
        this.setter$delegate = defpackage.afga.cB(2, new defpackage.aflv(this));
    }
}
