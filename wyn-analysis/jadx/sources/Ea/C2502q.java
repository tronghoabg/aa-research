package ea;

import lf.AbstractC3464c;

/* renamed from: ea.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2502q extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Object f34570a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f34571b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y f34572c;

    /* renamed from: d, reason: collision with root package name */
    public int f34573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2502q(Y y10, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f34572c = y10;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f34571b = obj;
        this.f34573d |= Integer.MIN_VALUE;
        return this.f34572c.a(null, this);
    }
}
