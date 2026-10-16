package defpackage;

/* loaded from: classes3.dex */
public class aflz<V> extends afmi<V> implements afhv<V> {
    private final aezr<Object> delegateValue;
    private final aezr getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aflz(afrj afrjVar, String str, String str2, Object obj) {
        super(afrjVar, str, str2, obj);
        afrjVar.getClass();
        str.getClass();
        str2.getClass();
        this.getter$delegate = woy.dH(2, new aflw(this));
        this.delegateValue = woy.dH(2, new aflx(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object delegateValue$lambda$0(aflz aflzVar) {
        return afuo.getDelegateImpl(aflzVar, aflzVar.computeDelegateSource(), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afly getter_delegate$lambda$0(aflz aflzVar) {
        return new afly(aflzVar);
    }

    @Override // defpackage.afhv
    public V get() {
        return getGetter().call(new Object[0]);
    }

    @Override // defpackage.afhv
    public Object getDelegate() {
        return this.delegateValue.a();
    }

    @Override // defpackage.afmi, defpackage.afia
    public afly<V> getGetter() {
        return (afly) this.getter$delegate.a();
    }

    @Override // defpackage.afdr
    public V invoke() {
        return get();
    }

    @Override // defpackage.afue
    public aflz<V> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new aflz<>(afrjVar, getDescriptor(), afpqVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aflz(afrj afrjVar, agdn agdnVar, afpq afpqVar) {
        super(afrjVar, agdnVar, afpqVar);
        afrjVar.getClass();
        agdnVar.getClass();
        afpqVar.getClass();
        this.getter$delegate = woy.dH(2, new aflw(this));
        this.delegateValue = woy.dH(2, new aflx(this));
    }
}
