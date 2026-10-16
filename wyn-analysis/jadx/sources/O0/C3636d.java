package o0;

import lf.AbstractC3464c;

/* renamed from: o0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3636d extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C3638f f41248a;

    /* renamed from: b, reason: collision with root package name */
    public long f41249b;

    /* renamed from: c, reason: collision with root package name */
    public long f41250c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f41251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3638f f41252e;

    /* renamed from: f, reason: collision with root package name */
    public int f41253f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3636d(C3638f c3638f, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f41252e = c3638f;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f41251d = obj;
        this.f41253f |= Integer.MIN_VALUE;
        return this.f41252e.c(0L, 0L, this);
    }
}
