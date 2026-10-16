package defpackage;

import java.lang.reflect.Member;

/* loaded from: classes3.dex */
public class afmh<D, E, V> extends afmi<V> implements afhz<D, E, V> {
    private final aezr<Member> delegateSource;
    private final aezr getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afmh(afrj afrjVar, String str, String str2) {
        super(afrjVar, str, str2, afeq.NO_RECEIVER);
        afrjVar.getClass();
        str.getClass();
        str2.getClass();
        this.getter$delegate = woy.dH(2, new afme(this));
        this.delegateSource = woy.dH(2, new afmf(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afmg getter_delegate$lambda$0(afmh afmhVar) {
        return new afmg(afmhVar);
    }

    public V get(D d, E e) {
        return getGetter().call(d, e);
    }

    public Object getDelegate(D d, E e) {
        return afuo.getDelegateImpl(this, (Member) this.delegateSource.a(), d, e);
    }

    @Override // defpackage.afmi, defpackage.afia
    public afmg<D, E, V> getGetter() {
        return (afmg) this.getter$delegate.a();
    }

    @Override // defpackage.afeg
    public V invoke(D d, E e) {
        return get(d, e);
    }

    @Override // defpackage.afue
    public afmh<D, E, V> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new afmh<>(afrjVar, getDescriptor(), afpqVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afmh(afrj afrjVar, agdn agdnVar, afpq afpqVar) {
        super(afrjVar, agdnVar, afpqVar);
        afrjVar.getClass();
        agdnVar.getClass();
        afpqVar.getClass();
        this.getter$delegate = woy.dH(2, new afme(this));
        this.delegateSource = woy.dH(2, new afmf(this));
    }
}
