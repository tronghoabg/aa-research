package o0;

import lf.AbstractC3464c;

/* renamed from: o0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3637e extends AbstractC3464c {

    /* renamed from: a, reason: collision with root package name */
    public C3638f f41254a;

    /* renamed from: b, reason: collision with root package name */
    public long f41255b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f41256c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3638f f41257d;

    /* renamed from: e, reason: collision with root package name */
    public int f41258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3637e(C3638f c3638f, AbstractC3464c abstractC3464c) {
        super(abstractC3464c);
        this.f41257d = c3638f;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        this.f41256c = obj;
        this.f41258e |= Integer.MIN_VALUE;
        return this.f41257d.f(0L, this);
    }
}
