package Mf;

import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class g extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public h f7646a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7647b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f7648c;

    /* renamed from: d, reason: collision with root package name */
    public int f7649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f7648c = hVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f7647b = obj;
        this.f7649d |= Integer.MIN_VALUE;
        return this.f7648c.d(this);
    }
}
