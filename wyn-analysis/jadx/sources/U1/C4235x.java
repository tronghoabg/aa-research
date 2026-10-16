package u1;

import lf.AbstractC3464c;

/* renamed from: u1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4235x extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Object f46508a;

    /* renamed from: b, reason: collision with root package name */
    public Object f46509b;

    /* renamed from: c, reason: collision with root package name */
    public Object f46510c;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.G f46511d;

    /* renamed from: e, reason: collision with root package name */
    public C4209G f46512e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f46513f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4236y f46514g;

    /* renamed from: h, reason: collision with root package name */
    public int f46515h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4235x(C4236y c4236y, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f46514g = c4236y;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f46513f = obj;
        this.f46515h |= Integer.MIN_VALUE;
        return this.f46514g.a(null, this);
    }
}
