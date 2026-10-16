package defpackage;

/* loaded from: classes3.dex */
public class aftv<V> extends aftr<V> {
    private final aezr getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aftv(afrj afrjVar, String str, Object obj, agoj agojVar, afpq afpqVar) {
        super(afrjVar, str, obj, agojVar, afpqVar);
        afrjVar.getClass();
        str.getClass();
        agojVar.getClass();
        afpqVar.getClass();
        this.getter$delegate = woy.dH(2, new aftt(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aftu getter_delegate$lambda$0(aftv aftvVar) {
        return new aftu(aftvVar);
    }

    @Override // defpackage.aftr, defpackage.afia
    public aftu<V> getGetter() {
        return (aftu) this.getter$delegate.a();
    }

    @Override // defpackage.afue
    public afue<V> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new aftv(afrjVar, getSignature(), afeq.NO_RECEIVER, getKmProperty(), afpqVar);
    }
}
