package com.waze.alerters.a;

import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aa implements c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f14142a;

    /* renamed from: b, reason: collision with root package name */
    private final c f14143b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14144c;

    public aa(ab abVar, c cVar) {
        h.g.b.x.f(cVar, "stateHolder");
        this.f14142a = abVar;
        this.f14143b = cVar;
    }

    @Override // com.waze.alerters.a.c
    public final com.waze.k a() {
        return this.f14143b.a();
    }

    @Override // com.waze.alerters.a.c
    public final b b() {
        return this.f14143b.b();
    }

    @Override // com.waze.alerters.a.c
    public final com.waze.an.a.x c() {
        return this.f14143b.c();
    }

    @Override // com.waze.alerters.a.c
    public final ch d() {
        return this.f14143b.d();
    }

    @Override // com.waze.alerters.a.c
    public final void e(a aVar) {
        h.g.b.x.f(aVar, "action");
        this.f14143b.e(aVar);
        f();
    }

    @Override // com.waze.alerters.a.c
    public final void f() {
        if (this.f14144c) {
            return;
        }
        this.f14144c = true;
        c cVar = this.f14143b;
        cVar.f();
        this.f14142a.b(cVar.a());
    }

    @Override // com.waze.alerters.a.c
    public final void g() {
        this.f14143b.g();
    }

    @Override // com.waze.alerters.a.c
    public final void h(com.waze.f fVar) {
        h.g.b.x.f(fVar, "rejectedAlertReason");
    }

    @Override // com.waze.alerters.a.c
    public final void i() {
        this.f14143b.i();
    }

    @Override // com.waze.alerters.a.c
    public final void j() {
        this.f14143b.j();
    }

    @Override // com.waze.alerters.a.c
    public final void k() {
        this.f14143b.k();
    }
}
