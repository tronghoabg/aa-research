package Vd;

import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class b extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public int f14884a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14885b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f14886c;

    /* renamed from: d, reason: collision with root package name */
    public int f14887d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f14886c = dVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f14885b = obj;
        this.f14887d |= Integer.MIN_VALUE;
        return this.f14886c.g(0, this);
    }
}
