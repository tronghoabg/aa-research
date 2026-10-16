package defpackage;

import java.lang.reflect.Member;

/* loaded from: classes3.dex */
public class afmd<T, V> extends afmi<V> implements afhx<T, V> {
    private final aezr<Member> delegateSource;
    private final aezr getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afmd(afrj afrjVar, String str, String str2, Object obj) {
        super(afrjVar, str, str2, obj);
        afrjVar.getClass();
        str.getClass();
        str2.getClass();
        this.getter$delegate = woy.dH(2, new afma(this));
        this.delegateSource = woy.dH(2, new afmb(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afmc getter_delegate$lambda$0(afmd afmdVar) {
        return new afmc(afmdVar);
    }

    @Override // defpackage.afhx
    public V get(T t) {
        return getGetter().call(t);
    }

    @Override // defpackage.afhx
    public Object getDelegate(T t) {
        return afuo.getDelegateImpl(this, (Member) this.delegateSource.a(), t, null);
    }

    @Override // defpackage.afmi, defpackage.afia
    public afmc<T, V> getGetter() {
        return (afmc) this.getter$delegate.a();
    }

    @Override // defpackage.afec
    public V invoke(T t) {
        return get(t);
    }

    @Override // defpackage.afue
    public afmd<T, V> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new afmd<>(afrjVar, getDescriptor(), afpqVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afmd(afrj afrjVar, agdn agdnVar, afpq afpqVar) {
        super(afrjVar, agdnVar, afpqVar);
        afrjVar.getClass();
        agdnVar.getClass();
        afpqVar.getClass();
        this.getter$delegate = woy.dH(2, new afma(this));
        this.delegateSource = woy.dH(2, new afmb(this));
    }
}
