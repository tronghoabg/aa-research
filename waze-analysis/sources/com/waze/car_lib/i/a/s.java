package com.waze.car_lib.i.a;

import com.waze.map.ec;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private final h.c.j f19904a;

    /* renamed from: b, reason: collision with root package name */
    private final o f19905b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.map.f.f f19906c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.map.opengl.l f19907d;

    /* renamed from: e, reason: collision with root package name */
    private com.waze.bk.e f19908e;

    /* renamed from: f, reason: collision with root package name */
    private com.waze.bk.r f19909f;

    /* renamed from: g, reason: collision with root package name */
    private com.waze.shared_infra.s.d f19910g;

    /* renamed from: h, reason: collision with root package name */
    private af f19911h;

    public s(h.c.j jVar, o oVar, com.waze.map.f.f fVar) {
        h.g.b.x.f(jVar, "uiContext");
        h.g.b.x.f(oVar, "touchController");
        h.g.b.x.f(fVar, "mapStatsSender");
        this.f19904a = jVar;
        this.f19905b = oVar;
        this.f19906c = fVar;
        this.f19907d = new com.waze.map.opengl.l();
    }

    protected final com.waze.map.opengl.l a() {
        return this.f19907d;
    }

    public final void c() {
        this.f19907d.a();
    }

    public final void d(h hVar, f fVar, ec ecVar, com.waze.bk.e eVar, com.waze.map.opengl.x xVar) {
        h.g.b.x.f(hVar, "surfaceInterface");
        h.g.b.x.f(fVar, "surfaceCallbacksOneToMany");
        h.g.b.x.f(ecVar, "touchNotifier");
        h.g.b.x.f(eVar, "renderThread");
        h.g.b.x.f(xVar, "openGLRenderer");
        o oVar = this.f19905b;
        oVar.i(ecVar);
        hVar.h(oVar.d());
        this.f19910g = fVar.a(oVar.a());
        com.waze.bk.r rVar = new com.waze.bk.r(xVar, hVar, this.f19904a);
        eVar.b(rVar);
        rVar.g();
        this.f19909f = rVar;
        eVar.d();
        this.f19908e = eVar;
        af afVarE = aj.e(bo.f(eVar));
        this.f19911h = afVarE;
        aj.z(afVarE, null, null, new r(rVar, this, null), 3);
    }

    public final void e(h hVar) {
        h.g.b.x.f(hVar, "surfaceInterface");
        af afVar = this.f19911h;
        if (afVar != null) {
            aj.h(afVar, null);
        }
        this.f19911h = null;
        hVar.i(this.f19905b.d());
        com.waze.shared_infra.s.d dVar = this.f19910g;
        if (dVar != null) {
            dVar.a();
        }
        this.f19910g = null;
        com.waze.bk.r rVar = this.f19909f;
        if (rVar != null) {
            rVar.f();
            com.waze.bk.e eVar = this.f19908e;
            if (eVar != null) {
                eVar.e(rVar);
            }
        }
        this.f19909f = null;
        com.waze.bk.e eVar2 = this.f19908e;
        if (eVar2 != null) {
            eVar2.h();
        }
        this.f19908e = null;
    }
}
