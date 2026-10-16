package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bl implements com.waze.shared_infra.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32155a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f32156b;

    /* renamed from: c, reason: collision with root package name */
    private final am f32157c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.l f32158d;

    /* renamed from: e, reason: collision with root package name */
    private final String f32159e;

    public bl(com.waze.shared_infra.i.e eVar, kotlinx.coroutines.b.k kVar, am amVar, h.g.a.l lVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(kVar, "networkStatus");
        h.g.b.x.f(amVar, "statsReporter");
        h.g.b.x.f(lVar, "onConnectionChange");
        this.f32155a = eVar;
        this.f32156b = kVar;
        this.f32157c = amVar;
        this.f32158d = lVar;
        this.f32159e = "NetworkMonitor";
    }

    public final am a() {
        return this.f32157c;
    }

    @Override // com.waze.shared_infra.a.c
    public final Object b(h.c.e eVar) {
        Object objD = kotlinx.coroutines.b.ai.d(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.A(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.D(this.f32156b), new bk(this, null, 1, null)), new com.waze.navigate.location_preview.q(1)), new bk(this, null, 0)), eVar);
        return objD == h.c.a.a.f48038a ? objD : h.ab.f48028a;
    }

    @Override // com.waze.shared_infra.a.c
    public final String c() {
        return this.f32159e;
    }

    public final com.waze.shared_infra.i.e d() {
        return this.f32155a;
    }

    public final h.g.a.l e() {
        return this.f32158d;
    }
}
