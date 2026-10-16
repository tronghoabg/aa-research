package com.waze.alerters.a;

import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.j f14163a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f14164b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f14165c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f14166d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f14167e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f14168f;

    /* renamed from: g, reason: collision with root package name */
    private final ch f14169g;

    j(com.waze.j jVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, h.g.a.a aVar5) {
        this.f14163a = jVar;
        this.f14164b = aVar;
        this.f14165c = aVar2;
        this.f14166d = aVar3;
        this.f14167e = aVar4;
        this.f14168f = aVar5;
        this.f14169g = ai.U(ck.b(jVar));
    }

    @Override // com.waze.alerters.a.c
    public final com.waze.k a() {
        return this.f14163a.f();
    }

    @Override // com.waze.alerters.a.c
    public final /* synthetic */ b b() {
        return new b(false, false, null);
    }

    @Override // com.waze.alerters.a.c
    public final com.waze.an.a.x c() {
        return com.waze.an.a.x.f14612a;
    }

    @Override // com.waze.alerters.a.c
    public final ch d() {
        return this.f14169g;
    }

    @Override // com.waze.alerters.a.c
    public final void e(a aVar) {
        h.g.b.x.f(aVar, "action");
        a aVar2 = a.f14132a;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 1) {
            this.f14168f.invoke();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f14167e.invoke();
        }
    }

    @Override // com.waze.alerters.a.c
    public final void f() {
        this.f14166d.invoke();
    }

    @Override // com.waze.alerters.a.c
    public final void g() {
        this.f14164b.invoke();
    }

    @Override // com.waze.alerters.a.c
    public final void h(com.waze.f fVar) {
        h.g.b.x.f(fVar, "rejectedAlertReason");
    }

    @Override // com.waze.alerters.a.c
    public final void i() {
    }

    @Override // com.waze.alerters.a.c
    public final void j() {
    }

    @Override // com.waze.alerters.a.c
    public final void k() {
        this.f14165c.invoke();
    }
}
