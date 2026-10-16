package Ee;

import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class a extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Ce.a f3645a;

    /* renamed from: b, reason: collision with root package name */
    public String f3646b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3647c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ce.a f3648d;

    /* renamed from: e, reason: collision with root package name */
    public int f3649e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Ce.a aVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f3648d = aVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f3647c = obj;
        this.f3649e |= Integer.MIN_VALUE;
        return this.f3648d.e0(null, this);
    }
}
