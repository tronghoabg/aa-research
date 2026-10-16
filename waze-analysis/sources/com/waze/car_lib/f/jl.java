package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jl extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19758a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(kotlinx.coroutines.af afVar, com.waze.shared_infra.i.e eVar) {
        super(jn.f19760a, afVar);
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(eVar, "logger");
        this.f19758a = eVar;
    }

    public final void a(com.waze.asks.as asVar) {
        h.g.b.x.f(asVar, "question");
        this.f19758a.a("got ShowWazeAsksQuestion event, question entity id: ".concat(String.valueOf(asVar.e())));
        H(new jo(asVar));
    }
}
