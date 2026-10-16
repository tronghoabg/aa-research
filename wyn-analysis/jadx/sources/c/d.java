package C;

import lf.AbstractC3464c;

/* loaded from: classes.dex */
public final class d extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public e f1709a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1710b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f1711c;

    /* renamed from: d, reason: collision with root package name */
    public int f1712d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f1711c = eVar;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f1710b = obj;
        this.f1712d |= Integer.MIN_VALUE;
        return this.f1711c.a(this);
    }
}
