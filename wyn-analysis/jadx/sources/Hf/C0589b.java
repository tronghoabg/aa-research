package Hf;

import lf.AbstractC3464c;

/* renamed from: Hf.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0589b extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public Gf.t f5113a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0591c f5115c;

    /* renamed from: d, reason: collision with root package name */
    public int f5116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0589b(C0591c c0591c, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f5115c = c0591c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f5114b = obj;
        this.f5116d |= Integer.MIN_VALUE;
        return this.f5115c.d(null, this);
    }
}
