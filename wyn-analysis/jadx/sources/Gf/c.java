package Gf;

import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class c extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4788b;

    /* renamed from: c, reason: collision with root package name */
    public int f4789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f4788b = eVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f4787a = obj;
        this.f4789c |= Integer.MIN_VALUE;
        Object objB = e.B(this.f4788b, this);
        return objB == kf.a.f39711a ? objB : new l(objB);
    }
}
