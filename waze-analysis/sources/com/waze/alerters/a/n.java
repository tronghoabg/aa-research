package com.waze.alerters.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14171a;

    /* renamed from: b, reason: collision with root package name */
    private final l f14172b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.asks.ab f14173c;

    public n(com.waze.shared_infra.i.e eVar, l lVar, com.waze.asks.ab abVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(lVar, "callbacks");
        h.g.b.x.f(abVar, "config");
        this.f14171a = eVar;
        this.f14172b = lVar;
        this.f14173c = abVar;
    }

    public final q a(z zVar) {
        h.g.b.x.f(zVar, "data");
        return new q(zVar.c(), com.waze.destination_cell.b.e.d(zVar.e()), zVar.a(), this.f14171a, zVar.b(), zVar.f(), this.f14172b, this.f14173c);
    }
}
