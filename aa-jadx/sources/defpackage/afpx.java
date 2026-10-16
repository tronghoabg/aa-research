package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class afpx<V> extends defpackage.afpy<V> implements defpackage.afiv<V> {
    private final defpackage.afar getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpx(defpackage.afsj afsjVar, java.lang.reflect.Field field, java.lang.Object obj, defpackage.afqq afqqVar) {
        super(afsjVar, field, obj, afqqVar);
        afsjVar.getClass();
        field.getClass();
        afqqVar.getClass();
        this.getter$delegate = defpackage.afga.cB(2, new defpackage.afpv(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afpw getter_delegate$lambda$0(defpackage.afpx afpxVar) {
        return new defpackage.afpw(afpxVar);
    }

    @Override // defpackage.afiv
    public V get() {
        return getGetter().call(new java.lang.Object[0]);
    }

    @Override // defpackage.afiv
    public java.lang.Object getDelegate() {
        return null;
    }

    @Override // defpackage.afpy, defpackage.afja
    public defpackage.afpw<V> getGetter() {
        return (defpackage.afpw) this.getter$delegate.a();
    }

    @Override // defpackage.afer
    public V invoke() {
        return get();
    }

    @Override // defpackage.afve
    public defpackage.afve<V> shallowCopy(defpackage.afsj afsjVar, defpackage.afqq afqqVar) {
        afsjVar.getClass();
        afqqVar.getClass();
        return new defpackage.afpx(afsjVar, getJField(), getRawBoundReceiver(), afqqVar);
    }
}
