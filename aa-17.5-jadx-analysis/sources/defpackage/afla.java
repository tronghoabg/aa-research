package defpackage;

/* loaded from: classes3.dex */
public final class afla<T, V> extends afmd<T, V> implements afhm<T, V> {
    private final aezr setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afla(afrj afrjVar, String str, String str2, Object obj) {
        super(afrjVar, str, str2, obj);
        afrjVar.getClass();
        str.getClass();
        str2.getClass();
        this.setter$delegate = woy.dH(2, new afky(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afkz setter_delegate$lambda$0(afla aflaVar) {
        return new afkz(aflaVar);
    }

    @Override // defpackage.afhm, defpackage.afhp
    public afkz<T, V> getSetter() {
        return (afkz) this.setter$delegate.a();
    }

    @Override // defpackage.afhm
    public void set(T t, V v) {
        getSetter().call(t, v);
    }

    @Override // defpackage.afmd, defpackage.afue
    public afla<T, V> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new afla<>(afrjVar, getDescriptor(), afpqVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afla(afrj afrjVar, agdn agdnVar, afpq afpqVar) {
        super(afrjVar, agdnVar, afpqVar);
        afrjVar.getClass();
        agdnVar.getClass();
        afpqVar.getClass();
        this.setter$delegate = woy.dH(2, new afky(this));
    }
}
