package b4;

import lf.AbstractC3464c;

/* renamed from: b4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1514j extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f19309b;

    /* renamed from: c, reason: collision with root package name */
    public int f19310c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1514j(l lVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f19309b = lVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f19308a = obj;
        this.f19310c |= Integer.MIN_VALUE;
        return this.f19309b.b(null, this);
    }
}
