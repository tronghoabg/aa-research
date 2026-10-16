package com.waze.main_screen.u;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27699a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f27700b;

    /* renamed from: c, reason: collision with root package name */
    int f27701c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.location.b.c f27702d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(h hVar, h.c.e eVar) {
        super(eVar);
        this.f27700b = hVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27699a = obj;
        this.f27701c |= Integer.MIN_VALUE;
        return this.f27700b.a(this);
    }
}
