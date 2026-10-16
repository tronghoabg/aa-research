package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bm {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.q.j f18611a;

    /* renamed from: b, reason: collision with root package name */
    private final bl f18612b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f18613c;

    public bm(com.waze.shared_infra.q.j jVar, bl blVar, com.waze.shared_infra.q.e eVar) {
        h.g.b.x.f(jVar, "wazeDateFormat");
        h.g.b.x.f(blVar, "config");
        h.g.b.x.f(eVar, "wazeClock");
        this.f18611a = jVar;
        this.f18612b = blVar;
        this.f18613c = eVar;
    }

    public final bn a(cc ccVar, ca caVar) {
        h.g.b.x.f(ccVar, "onRouteAttributeClicked");
        h.g.b.x.f(caVar, "onHovRouteEnabledChangeListener");
        bl blVar = this.f18612b;
        return new bt(ccVar, this.f18611a, blVar.b(), this.f18613c, caVar, blVar.a(), blVar.c(), blVar.d());
    }
}
