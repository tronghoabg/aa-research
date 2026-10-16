package ga;

import lf.AbstractC3464c;

/* loaded from: classes4.dex */
public final class i extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public j f35804a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f35805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f35806c;

    /* renamed from: d, reason: collision with root package name */
    public int f35807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f35806c = jVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f35805b = obj;
        this.f35807d |= Integer.MIN_VALUE;
        return this.f35806c.b(this);
    }
}
