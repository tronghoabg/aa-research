package Ee;

import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class b extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Ce.a f3650a;

    /* renamed from: b, reason: collision with root package name */
    public String f3651b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3652c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ce.a f3653d;

    /* renamed from: e, reason: collision with root package name */
    public int f3654e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Ce.a aVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f3653d = aVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f3652c = obj;
        this.f3654e |= Integer.MIN_VALUE;
        return this.f3653d.f0(null, this);
    }
}
