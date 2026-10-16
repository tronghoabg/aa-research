package com.waze.car_lib.r.d;

import com.waze.car_lib.bd;
import com.waze.modules.navigation.af;
import com.waze.trip_overview.bl;
import com.waze.trip_overview.z;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.utils.f f21288a;

    /* renamed from: b, reason: collision with root package name */
    private final af f21289b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21290c;

    /* renamed from: d, reason: collision with root package name */
    private final bl f21291d;

    /* renamed from: e, reason: collision with root package name */
    private final g f21292e;

    /* renamed from: f, reason: collision with root package name */
    private final z f21293f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.car_lib.j.w f21294g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.bp.i f21295h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.af f21296i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.car_lib.j.x f21297j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.bn.b f21298k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f21299l;
    private final com.waze.z m;

    public /* synthetic */ i(com.waze.sharedui.utils.f fVar, af afVar, com.waze.shared_infra.o.a aVar, bl blVar, z zVar, com.waze.car_lib.j.w wVar, com.waze.bp.i iVar, kotlinx.coroutines.af afVar2, com.waze.car_lib.j.x xVar, com.waze.bn.b bVar, com.waze.shared_infra.i.e eVar, com.waze.z zVar2) {
        y yVar = new y();
        h.g.b.x.f(fVar, "distanceUtils");
        h.g.b.x.f(afVar, "selectRouteController");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(blVar, "stats");
        h.g.b.x.f(yVar, "inCarConfiguration");
        h.g.b.x.f(zVar, "configuration");
        h.g.b.x.f(wVar, "canvasViewModel");
        h.g.b.x.f(iVar, "tripOverViewRoutesRepository");
        h.g.b.x.f(afVar2, "stateHolderScope");
        h.g.b.x.f(xVar, "tollInfoController");
        h.g.b.x.f(bVar, "roamingStateProvider");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(zVar2, "appType");
        this.f21288a = fVar;
        this.f21289b = afVar;
        this.f21290c = aVar;
        this.f21291d = blVar;
        this.f21292e = yVar;
        this.f21293f = zVar;
        this.f21294g = wVar;
        this.f21295h = iVar;
        this.f21296i = afVar2;
        this.f21297j = xVar;
        this.f21298k = bVar;
        this.f21299l = eVar;
        this.m = zVar2;
    }

    public final x a(com.waze.car_lib.f.h hVar, bd bdVar) {
        h.g.b.x.f(hVar, "coordinatorController");
        h.g.b.x.f(bdVar, "primaryMapController");
        return new x(hVar, this.f21288a, this.f21289b, this.f21290c, this.f21292e, this.f21293f, this.f21295h, this.f21294g, this.f21291d, bdVar, this.f21296i, this.f21297j, this.f21298k, this.f21299l, this.m);
    }
}
