package M;

import lf.AbstractC3464c;

/* loaded from: classes.dex */
public final class h extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public o f7173a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f7175c;

    /* renamed from: d, reason: collision with root package name */
    public int f7176d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f7175c = oVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f7174b = obj;
        this.f7176d |= Integer.MIN_VALUE;
        return this.f7175c.a(this);
    }
}
