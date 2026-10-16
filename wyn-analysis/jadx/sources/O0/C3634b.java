package o0;

import lf.AbstractC3464c;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3634b extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f41242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3635c f41243b;

    /* renamed from: c, reason: collision with root package name */
    public int f41244c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3634b(C3635c c3635c, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f41243b = c3635c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f41242a = obj;
        this.f41244c |= Integer.MIN_VALUE;
        return this.f41243b.b(0L, this);
    }
}
