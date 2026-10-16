package Cd;

import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class h0 extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2109a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f2110b;

    /* renamed from: c, reason: collision with root package name */
    public int f2111c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f2110b = i0Var;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f2109a = obj;
        this.f2111c |= Integer.MIN_VALUE;
        return this.f2110b.a(null, this);
    }
}
