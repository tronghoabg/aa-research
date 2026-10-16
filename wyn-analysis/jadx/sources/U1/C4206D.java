package u1;

import lf.AbstractC3464c;

/* renamed from: u1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4206D extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C4209G f46427a;

    /* renamed from: b, reason: collision with root package name */
    public Object f46428b;

    /* renamed from: c, reason: collision with root package name */
    public Object f46429c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f46430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4209G f46431e;

    /* renamed from: f, reason: collision with root package name */
    public int f46432f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4206D(C4209G c4209g, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f46431e = c4209g;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f46430d = obj;
        this.f46432f |= Integer.MIN_VALUE;
        return this.f46431e.i(null, null, this);
    }
}
