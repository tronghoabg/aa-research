package xd;

import lf.AbstractC3464c;

/* renamed from: xd.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4510b extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Sd.a f47879a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f47880b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4511c f47881c;

    /* renamed from: d, reason: collision with root package name */
    public int f47882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4510b(C4511c c4511c, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f47881c = c4511c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f47880b = obj;
        this.f47882d |= Integer.MIN_VALUE;
        return this.f47881c.a(null, this);
    }
}
