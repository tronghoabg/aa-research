package com.waze.car_lib.i.a;

import com.waze.map.Cdo;
import com.waze.map.dn;
import com.waze.map.ec;
import com.waze.map.opengl.WazeMapRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x extends s {

    /* renamed from: a, reason: collision with root package name */
    private final o f19925a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.bk.e f19926b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.map.opengl.d f19927c;

    /* renamed from: d, reason: collision with root package name */
    private final List f19928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(h.c.j jVar, o oVar, com.waze.bk.e eVar, com.waze.map.opengl.d dVar, com.waze.map.f.f fVar) {
        super(jVar, oVar, fVar);
        h.g.b.x.f(jVar, "uiContext");
        h.g.b.x.f(oVar, "touchController");
        h.g.b.x.f(eVar, "wazeMapRenderThread");
        h.g.b.x.f(dVar, "renderContextProvider");
        h.g.b.x.f(fVar, "mapStatsSender");
        this.f19925a = oVar;
        this.f19926b = eVar;
        this.f19927c = dVar;
        this.f19928d = new ArrayList();
    }

    static final h.ab f(x xVar, bn bnVar, String str) {
        h.g.b.x.f(str, "mapId");
        xVar.f19925a.h(str);
        bnVar.e(new Cdo(new com.waze.map.ac(str)));
        return h.ab.f48028a;
    }

    static final void h(x xVar, bn bnVar) {
        xVar.f19925a.g();
        bnVar.e(dn.f28759a);
    }

    public final void g(WazeMapRenderer wazeMapRenderer, bn bnVar, h hVar, ec ecVar, f fVar) {
        h.g.b.x.f(wazeMapRenderer, "renderer");
        h.g.b.x.f(bnVar, "canvasState");
        h.g.b.x.f(hVar, "surfaceInterface");
        h.g.b.x.f(ecVar, "touchNotifier");
        h.g.b.x.f(fVar, "surfaceCallbacksOneToMany");
        List list = this.f19928d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.waze.shared_infra.s.d) it.next()).a();
        }
        list.clear();
        List list2 = list;
        list2.add(wazeMapRenderer.b(new v(this, bnVar, 0)));
        list2.add(wazeMapRenderer.a(new w(this, bnVar, 0)));
        com.waze.map.opengl.x xVar = new com.waze.map.opengl.x(com.waze.map.opengl.f.f29546b, a(), wazeMapRenderer, this.f19927c.b(), false);
        xVar.gwEnableAaOverlay();
        d(hVar, fVar, ecVar, this.f19926b, xVar);
    }
}
