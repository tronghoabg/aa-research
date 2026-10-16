package u1;

import lf.AbstractC3464c;

/* renamed from: u1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4205C extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Object f46422a;

    /* renamed from: b, reason: collision with root package name */
    public Object f46423b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f46424c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4209G f46425d;

    /* renamed from: e, reason: collision with root package name */
    public int f46426e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4205C(C4209G c4209g, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f46425d = c4209g;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f46424c = obj;
        this.f46426e |= Integer.MIN_VALUE;
        return this.f46425d.h(this);
    }
}
