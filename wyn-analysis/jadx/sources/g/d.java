package G;

import lf.AbstractC3464c;

/* loaded from: classes.dex */
public final class d extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public d0.d f4122a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f4123b;

    /* renamed from: c, reason: collision with root package name */
    public int f4124c;

    /* renamed from: d, reason: collision with root package name */
    public int f4125d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f4127f;

    /* renamed from: g, reason: collision with root package name */
    public int f4128g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f4127f = eVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f4126e = obj;
        this.f4128g |= Integer.MIN_VALUE;
        return this.f4127f.a(this);
    }
}
