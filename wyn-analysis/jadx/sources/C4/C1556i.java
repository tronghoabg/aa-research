package c4;

import lf.AbstractC3464c;

/* renamed from: c4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1556i extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C1557j f19642a;

    /* renamed from: b, reason: collision with root package name */
    public C1555h f19643b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19644c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1557j f19645d;

    /* renamed from: e, reason: collision with root package name */
    public int f19646e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1556i(C1557j c1557j, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f19645d = c1557j;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f19644c = obj;
        this.f19646e |= Integer.MIN_VALUE;
        return this.f19645d.b(null, this);
    }
}
