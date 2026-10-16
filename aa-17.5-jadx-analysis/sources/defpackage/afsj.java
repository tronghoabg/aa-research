package defpackage;

/* loaded from: classes3.dex */
public final class afsj<V> extends aftm<V> implements afhk<V> {
    private final aezr setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afsj(afrj afrjVar, String str, Object obj, agoj agojVar, afpq afpqVar) {
        super(afrjVar, str, obj, agojVar, afpqVar);
        afrjVar.getClass();
        str.getClass();
        agojVar.getClass();
        afpqVar.getClass();
        this.setter$delegate = woy.dH(2, new afsh(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afsi setter_delegate$lambda$0(afsj afsjVar) {
        return new afsi(afsjVar);
    }

    @Override // defpackage.afhk, defpackage.afhp
    public afsi<V> getSetter() {
        return (afsi) this.setter$delegate.a();
    }

    @Override // defpackage.afhk
    public void set(V v) {
        getSetter().call(v);
    }

    @Override // defpackage.aftm, defpackage.afue
    public afue<V> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new afsj(afrjVar, getSignature(), afeq.NO_RECEIVER, getKmProperty(), afpqVar);
    }
}
