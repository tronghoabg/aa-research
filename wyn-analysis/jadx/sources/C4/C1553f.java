package c4;

import lf.AbstractC3464c;

/* renamed from: c4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1553f extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C1555h f19626a;

    /* renamed from: b, reason: collision with root package name */
    public C1557j f19627b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19628c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1555h f19629d;

    /* renamed from: e, reason: collision with root package name */
    public int f19630e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1553f(C1555h c1555h, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f19629d = c1555h;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f19628c = obj;
        this.f19630e |= Integer.MIN_VALUE;
        return this.f19629d.d(null, this);
    }
}
