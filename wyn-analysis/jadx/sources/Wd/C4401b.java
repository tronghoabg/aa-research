package wd;

import lf.AbstractC3464c;

/* renamed from: wd.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4401b extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f47461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4402c f47462b;

    /* renamed from: c, reason: collision with root package name */
    public int f47463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4401b(C4402c c4402c, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f47462b = c4402c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f47461a = obj;
        this.f47463c |= Integer.MIN_VALUE;
        return this.f47462b.a(null, this);
    }
}
