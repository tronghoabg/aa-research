package u0;

import lf.AbstractC3464c;
import x.C4413f;

/* loaded from: classes.dex */
public final class r extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C4195s f46331a;

    /* renamed from: b, reason: collision with root package name */
    public C4413f f46332b;

    /* renamed from: c, reason: collision with root package name */
    public Gf.b f46333c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f46334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4195s f46335e;

    /* renamed from: f, reason: collision with root package name */
    public int f46336f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C4195s c4195s, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f46335e = c4195s;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f46334d = obj;
        this.f46336f |= Integer.MIN_VALUE;
        return this.f46335e.j(this);
    }
}
