package ga;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class l extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f35816b;

    /* renamed from: c, reason: collision with root package name */
    public int f35817c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f35816b = nVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f35815a = obj;
        this.f35817c |= Integer.MIN_VALUE;
        return this.f35816b.c(null, null, this);
    }
}
