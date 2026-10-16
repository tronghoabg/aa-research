package com.waze.modules.d;

import com.google.v.gc;
import java.util.TimeZone;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements com.waze.stats.z {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.e.g f30223a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f30224b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.z f30225c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.g.d f30226d;

    public g(com.waze.sharedui.e.g gVar, com.waze.shared_infra.q.e eVar, com.waze.z zVar, com.waze.g.d dVar) {
        h.g.b.x.f(gVar, "locationService");
        h.g.b.x.f(eVar, "wazeClock");
        h.g.b.x.f(zVar, "appType");
        h.g.b.x.f(dVar, "applicationInfoRepository");
        this.f30223a = gVar;
        this.f30224b = eVar;
        this.f30225c = zVar;
        this.f30226d = dVar;
    }

    @Override // com.waze.stats.z
    public final com.waze.stats.y a() {
        com.waze.n.r rVar;
        com.waze.sharedui.e.c cVarA = this.f30223a.a();
        if (cVarA != null) {
            com.waze.n.q qVarNewBuilder = com.waze.n.r.newBuilder();
            h.g.b.x.f(qVarNewBuilder, "builder");
            qVarNewBuilder.a(cVarA.f().a());
            qVarNewBuilder.b(cVarA.f().b());
            com.waze.n.r rVarBuild = qVarNewBuilder.build();
            h.g.b.x.e(rVarBuild, "build(...)");
            rVar = rVarBuild;
        } else {
            rVar = null;
        }
        gc gcVarD = com.waze.sharedui.utils.o.d(this.f30224b.a());
        String id = TimeZone.getDefault().getID();
        h.g.b.x.e(id, "getID(...)");
        com.waze.n.h hVarNewBuilder = com.waze.n.i.newBuilder();
        h.g.b.x.f(hVarNewBuilder, "builder");
        com.waze.n.g gVar = this.f30225c == com.waze.z.f45554b ? com.waze.n.g.WAZE_AAOS : com.waze.n.g.WAZE;
        h.g.b.x.f(gVar, "value");
        hVarNewBuilder.a(gVar);
        this.f30226d.d();
        h.g.b.x.f("5.20.90.901", "value");
        hVarNewBuilder.b();
        com.waze.n.i iVarBuild = hVarNewBuilder.build();
        h.g.b.x.e(iVarBuild, "build(...)");
        return new com.waze.stats.y(rVar, gcVarD, id, iVarBuild);
    }
}
