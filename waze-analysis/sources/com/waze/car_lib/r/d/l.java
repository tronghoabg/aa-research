package com.waze.car_lib.r.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class l extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21304a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f21305b;

    /* renamed from: c, reason: collision with root package name */
    int f21306c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(x xVar, h.c.e eVar) {
        super(eVar);
        this.f21305b = xVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21304a = obj;
        this.f21306c |= Integer.MIN_VALUE;
        return this.f21305b.P(this);
    }
}
