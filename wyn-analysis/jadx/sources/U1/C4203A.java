package u1;

import lf.AbstractC3464c;

/* renamed from: u1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4203A extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C4209G f46413a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4209G f46415c;

    /* renamed from: d, reason: collision with root package name */
    public int f46416d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4203A(C4209G c4209g, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f46415c = c4209g;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f46414b = obj;
        this.f46416d |= Integer.MIN_VALUE;
        return this.f46415c.f(this);
    }
}
