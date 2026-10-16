package defpackage;

/* loaded from: classes3.dex */
public class aftm<V> extends aftr<V> implements afhv<V> {
    private final aezr<Object> delegateValue;
    private final aezr getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aftm(afrj afrjVar, String str, Object obj, agoj agojVar, afpq afpqVar) {
        super(afrjVar, str, obj, agojVar, afpqVar);
        afrjVar.getClass();
        str.getClass();
        agojVar.getClass();
        afpqVar.getClass();
        this.getter$delegate = woy.dH(2, new aftj(this));
        this.delegateValue = woy.dH(2, new aftk(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object delegateValue$lambda$0(aftm aftmVar) {
        return afuo.getDelegateImpl(aftmVar, aftmVar.computeDelegateSource(), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aftl getter_delegate$lambda$0(aftm aftmVar) {
        return new aftl(aftmVar);
    }

    @Override // defpackage.afhv
    public V get() {
        return getGetter().call(new Object[0]);
    }

    @Override // defpackage.afhv
    public Object getDelegate() {
        return this.delegateValue.a();
    }

    @Override // defpackage.aftr, defpackage.afia
    public aftl<V> getGetter() {
        return (aftl) this.getter$delegate.a();
    }

    @Override // defpackage.afdr
    public V invoke() {
        return get();
    }

    @Override // defpackage.afue
    public afue<V> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new aftm(afrjVar, getSignature(), afeq.NO_RECEIVER, getKmProperty(), afpqVar);
    }
}
