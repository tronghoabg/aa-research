package ga;

import lf.AbstractC3464c;

/* renamed from: ga.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2715a extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Object f35777a;

    /* renamed from: b, reason: collision with root package name */
    public Nf.a f35778b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f35779c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2718d f35780d;

    /* renamed from: e, reason: collision with root package name */
    public int f35781e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2715a(C2718d c2718d, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f35780d = c2718d;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f35779c = obj;
        this.f35781e |= Integer.MIN_VALUE;
        return this.f35780d.d(this);
    }
}
