package com.waze.c.e.a;

import com.waze.c.d.am;
import com.waze.map.b.aj;
import com.waze.map.b.cj;
import com.waze.navigate.eo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final u f18414a;

    /* renamed from: b, reason: collision with root package name */
    private final cj f18415b;

    /* renamed from: c, reason: collision with root package name */
    private final eo f18416c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.maplabelsposition.b f18417d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.c.a.b f18418e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f18419f;

    public b(u uVar, cj cjVar, eo eoVar, com.waze.maplabelsposition.b bVar, com.waze.c.a.b bVar2, com.waze.shared_infra.i.e eVar) {
        x.f(uVar, "alternativeRouteMapContentTransformer");
        x.f(cjVar, "mapViewControllerFactory");
        x.f(eoVar, "navigationStatusInterface");
        x.f(bVar, "mapLabelsPositionsCalculator");
        x.f(bVar2, "config");
        x.f(eVar, "logger");
        this.f18414a = uVar;
        this.f18415b = cjVar;
        this.f18416c = eoVar;
        this.f18417d = bVar;
        this.f18418e = bVar2;
        this.f18419f = eVar;
    }

    public final t a(h.c.j jVar, aj ajVar, w wVar, am amVar, boolean z) {
        x.f(jVar, "coroutineContext");
        x.f(ajVar, "mainMapController");
        x.f(wVar, "onAltRouteMapRouteClicked");
        x.f(amVar, "alternateRoutesStatsSender");
        com.waze.maplabelsposition.b bVar = this.f18417d;
        com.waze.c.a.b bVar2 = this.f18418e;
        com.waze.shared_infra.i.e eVar = this.f18419f;
        return new t(jVar, this.f18414a, this.f18415b, ajVar, this.f18416c, wVar, amVar, z, bVar, bVar2, eVar);
    }
}
