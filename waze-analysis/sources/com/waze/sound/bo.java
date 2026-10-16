package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bo implements bm {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.navigate.dg f39549a;

    /* renamed from: b, reason: collision with root package name */
    private final dd f39550b;

    /* renamed from: c, reason: collision with root package name */
    private final eb f39551c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39552d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.reports_v2.presentation.dd f39553e;

    public bo(com.waze.navigate.dg dgVar, dd ddVar, eb ebVar, com.waze.reports_v2.presentation.dd ddVar2, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(dgVar, "navigationInfoInterface");
        h.g.b.x.f(ddVar, "routeInstructionVoicesRepository");
        h.g.b.x.f(ebVar, "routeInstructionsVoiceAssetsRepository");
        h.g.b.x.f(ddVar2, "config");
        h.g.b.x.f(eVar, "logger");
        this.f39549a = dgVar;
        this.f39550b = ddVar;
        this.f39551c = ebVar;
        this.f39553e = ddVar2;
        this.f39552d = eVar;
    }

    @Override // com.waze.sound.bm
    public final kotlinx.coroutines.b.k a() {
        return kotlinx.coroutines.b.ai.r(this.f39549a.ae(), this.f39550b.k(), this.f39551c.k(), new bn(this, null));
    }
}
