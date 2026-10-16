package b4;

import lf.AbstractC3464c;

/* renamed from: b4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1515k extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public l f19311a;

    /* renamed from: b, reason: collision with root package name */
    public a4.h f19312b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19313c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f19314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f19315e;

    /* renamed from: f, reason: collision with root package name */
    public int f19316f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1515k(l lVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f19315e = lVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f19314d = obj;
        this.f19316f |= Integer.MIN_VALUE;
        return this.f19315e.a(this);
    }
}
