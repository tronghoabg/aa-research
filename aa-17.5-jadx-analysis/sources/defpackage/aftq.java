package defpackage;

import java.lang.reflect.Member;

/* loaded from: classes3.dex */
public class aftq<T, V> extends aftr<V> implements afhx<T, V> {
    private final aezr<Member> delegateSource;
    private final aezr getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aftq(afrj afrjVar, String str, Object obj, agoj agojVar, afpq afpqVar) {
        super(afrjVar, str, obj, agojVar, afpqVar);
        afrjVar.getClass();
        str.getClass();
        agojVar.getClass();
        afpqVar.getClass();
        this.getter$delegate = woy.dH(2, new aftn(this));
        this.delegateSource = woy.dH(2, new afto(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aftp getter_delegate$lambda$0(aftq aftqVar) {
        return new aftp(aftqVar);
    }

    @Override // defpackage.afhx
    public V get(T t) {
        return getGetter().call(t);
    }

    @Override // defpackage.afhx
    public Object getDelegate(T t) {
        return afuo.getDelegateImpl(this, (Member) this.delegateSource.a(), t, null);
    }

    @Override // defpackage.aftr, defpackage.afia
    public aftp<T, V> getGetter() {
        return (aftp) this.getter$delegate.a();
    }

    @Override // defpackage.afec
    public V invoke(T t) {
        return get(t);
    }

    @Override // defpackage.afue
    public afue<V> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new aftq(afrjVar, getSignature(), afeq.NO_RECEIVER, getKmProperty(), afpqVar);
    }
}
