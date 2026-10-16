package com.waze.car_lib.j;

import com.waze.map.b.ch;
import com.waze.map.b.cj;
import com.waze.map.b.cr;
import com.waze.map.b.ea;
import com.waze.map.b.ed;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class w implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.nightmode.j f20283a;

    /* renamed from: b, reason: collision with root package name */
    private final cj f20284b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f20285c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.map.c.d f20286d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.maplabelsposition.b f20287e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.trip_overview.z f20288f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f20289g;

    /* renamed from: h, reason: collision with root package name */
    private final ed f20290h;

    public w(com.waze.nightmode.j jVar, cj cjVar, com.waze.shared_infra.o.a aVar, com.waze.map.c.d dVar, com.waze.maplabelsposition.b bVar, com.waze.trip_overview.z zVar) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        h.g.b.x.f(jVar, "nightModeManager");
        h.g.b.x.f(cjVar, "mapViewControllerFactory");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(dVar, "mapMarkerCreator");
        h.g.b.x.f(bVar, "mapLabelsPositionsCalculator");
        h.g.b.x.f(zVar, "configuration");
        this.f20283a = jVar;
        this.f20284b = cjVar;
        this.f20285c = aVar;
        this.f20286d = dVar;
        this.f20287e = bVar;
        this.f20288f = zVar;
        w wVar = this;
        if (wVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) wVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(com.waze.shared_infra.i.g.class);
        } else {
            bVarC = wVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(com.waze.shared_infra.i.g.class);
        }
        com.waze.shared_infra.i.e eVarA = ((com.waze.shared_infra.i.g) bVarC.a(mVar, null, null)).a(new com.waze.shared_infra.i.c("AlternateRoutesCanvasViewModel"));
        h.g.b.x.e(eVarA, "provide(...)");
        this.f20289g = eVarA;
        this.f20290h = cjVar.a(eVarA, ch.f28144a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object d(com.waze.car_lib.j.w r27, com.waze.shared_infra.h.c r28, com.waze.shared_infra.h.c r29, com.waze.modules.c.dk r30, long r31, boolean r33, h.g.a.l r34, h.c.e r35) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.j.w.d(com.waze.car_lib.j.w, com.waze.shared_infra.h.c, com.waze.shared_infra.h.c, com.waze.modules.c.dk, long, boolean, h.g.a.l, h.c.e):java.lang.Object");
    }

    public final ed a() {
        return this.f20290h;
    }

    public final Object e(h.c.e eVar) {
        Object objC = com.waze.install.ah.e(this.f20290h, new ea(false, null, 2), cr.f28163a, false, 12).a().c(eVar);
        return objC == h.c.a.a.f48038a ? objC : h.ab.f48028a;
    }

    public final void f(kotlinx.coroutines.af afVar, kotlinx.coroutines.b.k kVar, h.g.a.l lVar) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(kVar, "content");
        h.g.b.x.f(lVar, "onRouteLabelClick");
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(kVar, this, lVar, (h.c.e) null, 1), 3);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
