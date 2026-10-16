package defpackage;

/* loaded from: classes3.dex */
public final class afld<D, E, V> extends afmh<D, E, V> implements afho<D, E, V> {
    private final aezr setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afld(afrj afrjVar, String str, String str2) {
        super(afrjVar, str, str2);
        afrjVar.getClass();
        str.getClass();
        str2.getClass();
        this.setter$delegate = woy.dH(2, new aflb(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aflc setter_delegate$lambda$0(afld afldVar) {
        return new aflc(afldVar);
    }

    @Override // defpackage.afhp
    public aflc<D, E, V> getSetter() {
        return (aflc) this.setter$delegate.a();
    }

    public void set(D d, E e, V v) {
        getSetter().call(d, e, v);
    }

    @Override // defpackage.afmh, defpackage.afue
    public afld<D, E, V> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new afld<>(afrjVar, getDescriptor(), afpqVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afld(afrj afrjVar, agdn agdnVar, afpq afpqVar) {
        super(afrjVar, agdnVar, afpqVar);
        afrjVar.getClass();
        agdnVar.getClass();
        afpqVar.getClass();
        this.setter$delegate = woy.dH(2, new aflb(this));
    }
}
