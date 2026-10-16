package com.waze.reports_v2.c;

import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.b.aa f34175a;

    /* renamed from: b, reason: collision with root package name */
    private final ds f34176b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f34177c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.reports_v2.d.j f34178d;

    public ae(com.waze.reports_v2.b.aa aaVar, ds dsVar, com.waze.shared_infra.q.e eVar, com.waze.reports_v2.d.j jVar) {
        h.g.b.x.f(aaVar, "api");
        h.g.b.x.f(dsVar, "reportPositionSaver");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(jVar, "reportingStatsSender");
        this.f34175a = aaVar;
        this.f34176b = dsVar;
        this.f34177c = eVar;
        this.f34178d = jVar;
    }

    public final ad a() {
        String string = UUID.randomUUID().toString();
        h.g.b.x.e(string, "toString(...)");
        return new ad(string, string, this.f34175a, this.f34176b, this.f34177c, this.f34178d, kotlinx.coroutines.av.b());
    }
}
