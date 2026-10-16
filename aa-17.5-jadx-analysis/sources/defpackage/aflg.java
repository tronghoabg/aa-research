package defpackage;

/* loaded from: classes3.dex */
public final class aflg<V> extends afmm<V> implements afhp<V> {
    private final aezr setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aflg(afrj afrjVar, agdn agdnVar, afpq afpqVar) {
        super(afrjVar, agdnVar, afpqVar);
        afrjVar.getClass();
        agdnVar.getClass();
        afpqVar.getClass();
        this.setter$delegate = woy.dH(2, new afle(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aflf setter_delegate$lambda$0(aflg aflgVar) {
        return new aflf(aflgVar);
    }

    @Override // defpackage.afhp
    public aflf<V> getSetter() {
        return (aflf) this.setter$delegate.a();
    }

    @Override // defpackage.afmm, defpackage.afue
    public aflg<V> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new aflg<>(afrjVar, getDescriptor(), afpqVar);
    }
}
