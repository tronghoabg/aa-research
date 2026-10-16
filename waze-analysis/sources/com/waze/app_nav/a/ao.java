package com.waze.app_nav.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ao extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15114a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(kotlinx.coroutines.af afVar, com.waze.shared_infra.i.e eVar) {
        super(av.f15121a, afVar);
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(eVar, "logger");
        this.f15114a = eVar;
    }

    public final void a(com.waze.asks.as asVar, com.waze.asks.d dVar) {
        h.g.b.x.f(asVar, "question");
        h.g.b.x.f(dVar, "answer");
        this.f15114a.a("received " + dVar + " for " + asVar);
        H(new au(new aq(asVar, dVar)));
    }
}
