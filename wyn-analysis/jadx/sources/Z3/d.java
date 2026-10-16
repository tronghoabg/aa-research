package Z3;

import lf.AbstractC3464c;

/* loaded from: classes.dex */
public final class d extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Object f16960a;

    /* renamed from: b, reason: collision with root package name */
    public Nf.j f16961b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16962c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f16963d;

    /* renamed from: e, reason: collision with root package name */
    public int f16964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f16963d = eVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f16962c = obj;
        this.f16964e |= Integer.MIN_VALUE;
        return this.f16963d.a(this);
    }
}
