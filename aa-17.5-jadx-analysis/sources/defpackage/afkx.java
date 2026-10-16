package defpackage;

/* loaded from: classes3.dex */
public final class afkx<V> extends aflz<V> implements afhk<V> {
    private final aezr setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afkx(afrj afrjVar, String str, String str2, Object obj) {
        super(afrjVar, str, str2, obj);
        afrjVar.getClass();
        str.getClass();
        str2.getClass();
        this.setter$delegate = woy.dH(2, new afkv(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afkw setter_delegate$lambda$0(afkx afkxVar) {
        return new afkw(afkxVar);
    }

    @Override // defpackage.afhk, defpackage.afhp
    public afkw<V> getSetter() {
        return (afkw) this.setter$delegate.a();
    }

    @Override // defpackage.afhk
    public void set(V v) {
        getSetter().call(v);
    }

    @Override // defpackage.aflz, defpackage.afue
    public afkx<V> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new afkx<>(afrjVar, getDescriptor(), afpqVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afkx(afrj afrjVar, agdn agdnVar, afpq afpqVar) {
        super(afrjVar, agdnVar, afpqVar);
        afrjVar.getClass();
        agdnVar.getClass();
        afpqVar.getClass();
        this.setter$delegate = woy.dH(2, new afkv(this));
    }
}
