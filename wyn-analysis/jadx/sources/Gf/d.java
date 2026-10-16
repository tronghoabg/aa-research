package Gf;

import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class d extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4791b;

    /* renamed from: c, reason: collision with root package name */
    public int f4792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f4791b = eVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f4790a = obj;
        this.f4792c |= Integer.MIN_VALUE;
        Object objC = this.f4791b.C(null, 0, 0L, this);
        return objC == kf.a.f39711a ? objC : new l(objC);
    }
}
