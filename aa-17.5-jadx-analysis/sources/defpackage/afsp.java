package defpackage;

/* loaded from: classes3.dex */
public final class afsp<V> extends aftv<V> implements afhp<V> {
    private final aezr setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afsp(afrj afrjVar, String str, Object obj, agoj agojVar, afpq afpqVar) {
        super(afrjVar, str, obj, agojVar, afpqVar);
        afrjVar.getClass();
        str.getClass();
        agojVar.getClass();
        afpqVar.getClass();
        this.setter$delegate = woy.dH(2, new afsn(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afso setter_delegate$lambda$0(afsp afspVar) {
        return new afso(afspVar);
    }

    @Override // defpackage.afhp
    public afso<V> getSetter() {
        return (afso) this.setter$delegate.a();
    }

    @Override // defpackage.aftv, defpackage.afue
    public afue<V> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new afsp(afrjVar, getSignature(), afeq.NO_RECEIVER, getKmProperty(), afpqVar);
    }
}
