package com.waze.an.a.a;

import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class at implements as {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.alerters.a.c f14394a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.an.a.x f14395b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f14396c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.location.q f14397d;

    public at(com.waze.alerters.a.c cVar) {
        h.g.b.x.f(cVar, "stateHolder");
        this.f14394a = cVar;
        this.f14397d = new com.waze.an.a.s(cVar.a());
        this.f14395b = cVar.c();
        this.f14396c = cVar.d();
    }

    @Override // com.waze.an.a.b
    public final Integer a() {
        return this.f14394a.b().a();
    }

    @Override // com.waze.an.a.b
    public final ch b() {
        return this.f14396c;
    }

    @Override // com.waze.an.a.b
    public final void c(com.waze.alerters.a.a aVar) {
        h.g.b.x.f(aVar, "action");
        this.f14394a.e(aVar);
    }

    @Override // com.waze.an.a.b
    public final void d(com.waze.f fVar) {
        h.g.b.x.f(fVar, "rejectedAlertReason");
        this.f14394a.h(fVar);
    }

    @Override // com.waze.an.a.a.as
    public final boolean e() {
        return this.f14394a.b().c();
    }

    @Override // com.waze.an.a.r
    public final com.waze.an.a.x j() {
        return this.f14395b;
    }

    @Override // com.waze.an.a.r
    public final void k() {
        this.f14394a.f();
    }

    @Override // com.waze.an.a.r
    public final void l() {
        this.f14394a.k();
    }

    @Override // com.waze.an.a.r
    public final com.waze.location.q m() {
        return this.f14397d;
    }
}
