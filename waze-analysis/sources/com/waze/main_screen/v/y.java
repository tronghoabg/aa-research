package com.waze.main_screen.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class y extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27835a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f27836b;

    /* renamed from: c, reason: collision with root package name */
    int f27837c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(z zVar, h.c.e eVar) {
        super(eVar);
        this.f27836b = zVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27835a = obj;
        this.f27837c |= Integer.MIN_VALUE;
        return this.f27836b.b(null, this);
    }
}
