package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ma extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25485a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ mg f25486b;

    /* renamed from: c, reason: collision with root package name */
    int f25487c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ma(mg mgVar, h.c.e eVar) {
        super(eVar);
        this.f25486b = mgVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25485a = obj;
        this.f25487c |= Integer.MIN_VALUE;
        return this.f25486b.f(this);
    }
}
