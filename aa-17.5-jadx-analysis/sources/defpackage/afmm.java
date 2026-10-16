package defpackage;

/* loaded from: classes3.dex */
public class afmm<V> extends afmi<V> {
    private final aezr getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afmm(afrj afrjVar, agdn agdnVar, afpq afpqVar) {
        super(afrjVar, agdnVar, afpqVar);
        afrjVar.getClass();
        agdnVar.getClass();
        afpqVar.getClass();
        this.getter$delegate = woy.dH(2, new afmk(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afml getter_delegate$lambda$0(afmm afmmVar) {
        return new afml(afmmVar);
    }

    @Override // defpackage.afmi, defpackage.afia
    public afml<V> getGetter() {
        return (afml) this.getter$delegate.a();
    }

    @Override // defpackage.afue
    public afmm<V> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new afmm<>(afrjVar, getDescriptor(), afpqVar);
    }
}
