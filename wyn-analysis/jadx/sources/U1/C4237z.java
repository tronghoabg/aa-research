package u1;

import lf.AbstractC3464c;

/* renamed from: u1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4237z extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C4209G f46520a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46521b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4209G f46522c;

    /* renamed from: d, reason: collision with root package name */
    public int f46523d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4237z(C4209G c4209g, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f46522c = c4209g;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f46521b = obj;
        this.f46523d |= Integer.MIN_VALUE;
        return this.f46522c.e(this);
    }
}
