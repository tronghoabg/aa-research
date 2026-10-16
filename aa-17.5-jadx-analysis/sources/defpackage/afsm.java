package defpackage;

/* loaded from: classes3.dex */
public final class afsm<T, V> extends aftq<T, V> implements afhm<T, V> {
    private final aezr setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afsm(afrj afrjVar, String str, Object obj, agoj agojVar, afpq afpqVar) {
        super(afrjVar, str, obj, agojVar, afpqVar);
        afrjVar.getClass();
        str.getClass();
        agojVar.getClass();
        afpqVar.getClass();
        this.setter$delegate = woy.dH(2, new afsk(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afsl setter_delegate$lambda$0(afsm afsmVar) {
        return new afsl(afsmVar);
    }

    @Override // defpackage.afhm, defpackage.afhp
    public afsl<T, V> getSetter() {
        return (afsl) this.setter$delegate.a();
    }

    @Override // defpackage.afhm
    public void set(T t, V v) {
        getSetter().call(t, v);
    }

    @Override // defpackage.aftq, defpackage.afue
    public afue<V> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new afsm(afrjVar, getSignature(), afeq.NO_RECEIVER, getKmProperty(), afpqVar);
    }
}
