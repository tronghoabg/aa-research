package com.waze.car_lib.f;

import java.util.List;
import l.a.bjz;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class z extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.c.b f19785a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.navigate.location_preview.bh f19786b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.z f19787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.waze.car_lib.c.b bVar, com.waze.car_lib.j.a aVar, kotlinx.coroutines.af afVar, com.waze.navigate.location_preview.bh bhVar, com.waze.z zVar) {
        super(ad.f19352a, afVar);
        h.g.b.x.f(bVar, "analyticsSender");
        h.g.b.x.f(aVar, "drivingStatusProvider");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(bhVar, "statsSender");
        h.g.b.x.f(zVar, "appType");
        this.f19785a = bVar;
        this.f19786b = bhVar;
        this.f19787c = zVar;
    }

    public final void a() {
        H(ab.f19348a);
        bjz bjzVarG = com.b.b.a.u.g(this.f19787c);
        h.g.b.x.f(bjzVarG, "triggeringPlatform");
        this.f19785a.a(com.waze.car_lib.c.c.f19221e, bjzVarG);
    }

    public final void b(com.waze.av.b.n nVar, boolean z, com.waze.modules.navigation.at atVar) {
        h.g.b.x.f(nVar, "place");
        H(new ac(nVar, z, atVar));
        bjz bjzVarG = com.b.b.a.u.g(this.f19787c);
        h.g.b.x.f(bjzVarG, "triggeringPlatform");
        com.waze.car_lib.c.b bVar = this.f19785a;
        if (atVar != null) {
            com.waze.car_lib.c.c cVar = com.waze.car_lib.c.c.f19217a;
            int iOrdinal = atVar.ordinal();
            if (iOrdinal == 0) {
                bVar.a(com.waze.car_lib.c.c.f19218b, bjzVarG);
                return;
            } else if (iOrdinal == 1) {
                bVar.a(com.waze.car_lib.c.c.f19217a, bjzVarG);
                return;
            }
        }
        bVar.a(com.waze.car_lib.c.c.f19219c, bjzVarG);
    }

    public final void c() {
        bjz bjzVarG = com.b.b.a.u.g(this.f19787c);
        h.g.b.x.f(bjzVarG, "triggeringPlatform");
        this.f19785a.a(com.waze.car_lib.c.c.f19220d, bjzVarG);
    }

    public final void d(com.waze.map.isolated.e eVar) {
        h.g.b.x.f(eVar, "ad");
        H(new af(eVar));
        this.f19786b.e(com.waze.navigate.location_preview.bb.f31615g, eVar.d(), 0, null, null, null, com.b.b.a.u.g(this.f19787c));
    }

    public final void e(com.waze.av.b.n nVar, com.waze.av.d.k kVar, com.waze.navigate.location_preview.bb bbVar) {
        List listG;
        h.g.b.x.f(nVar, "place");
        h.g.b.x.f(bbVar, "context");
        H(new ae(nVar, kVar));
        String strC = nVar.e().c().c();
        if (strC == null) {
            strC = "";
        }
        int size = 0;
        if (kVar != null && (listG = kVar.G()) != null) {
            size = listG.size();
        }
        this.f19786b.e(bbVar, strC, Integer.valueOf(size), null, null, null, com.b.b.a.u.g(this.f19787c));
    }
}
