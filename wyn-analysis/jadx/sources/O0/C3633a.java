package o0;

import lf.AbstractC3464c;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3633a extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f41239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3635c f41240b;

    /* renamed from: c, reason: collision with root package name */
    public int f41241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3633a(C3635c c3635c, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f41240b = c3635c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f41239a = obj;
        this.f41241c |= Integer.MIN_VALUE;
        return this.f41240b.a(0L, 0L, this);
    }
}
