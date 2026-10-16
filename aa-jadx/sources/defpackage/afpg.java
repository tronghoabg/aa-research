package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afpg<V> extends defpackage.afpx<V> implements defpackage.afik<V> {
    private final defpackage.afar setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpg(defpackage.afsj afsjVar, java.lang.reflect.Field field, java.lang.Object obj, defpackage.afqq afqqVar) {
        super(afsjVar, field, obj, afqqVar);
        afsjVar.getClass();
        field.getClass();
        afqqVar.getClass();
        this.setter$delegate = defpackage.afga.cB(2, new defpackage.afpe(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afpf setter_delegate$lambda$0(defpackage.afpg afpgVar) {
        return new defpackage.afpf(afpgVar);
    }

    @Override // defpackage.afik, defpackage.afip
    public defpackage.afpf<V> getSetter() {
        return (defpackage.afpf) this.setter$delegate.a();
    }

    @Override // defpackage.afik
    public void set(V v) {
        getSetter().call(v);
    }

    @Override // defpackage.afpx, defpackage.afve
    public defpackage.afve<V> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.afpg(afsjVar, getJField(), getRawBoundReceiver(), afqqVar);
    }
}
