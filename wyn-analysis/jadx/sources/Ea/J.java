package ea;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class J extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public K f34471a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f34472b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K f34473c;

    /* renamed from: d, reason: collision with root package name */
    public int f34474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f34473c = k;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f34472b = obj;
        this.f34474d |= Integer.MIN_VALUE;
        return K.a(this.f34473c, this);
    }
}
