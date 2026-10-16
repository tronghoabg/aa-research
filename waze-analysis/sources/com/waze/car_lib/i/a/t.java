package com.waze.car_lib.i.a;

import com.waze.map.Cdo;
import com.waze.map.dn;
import com.waze.map.ec;
import com.waze.map.opengl.WazeRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t extends s {

    /* renamed from: a, reason: collision with root package name */
    private final o f19912a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.bk.g f19913b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.map.opengl.d f19914c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.map.f.f f19915d;

    /* renamed from: e, reason: collision with root package name */
    private final List f19916e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(h.c.j jVar, o oVar, com.waze.bk.g gVar, com.waze.map.opengl.d dVar, com.waze.map.f.f fVar) {
        super(jVar, oVar, fVar);
        h.g.b.x.f(jVar, "uiContext");
        h.g.b.x.f(oVar, "touchController");
        h.g.b.x.f(gVar, "renderThreadProvider");
        h.g.b.x.f(dVar, "renderContextProvider");
        h.g.b.x.f(fVar, "mapStatsSender");
        this.f19912a = oVar;
        this.f19913b = gVar;
        this.f19914c = dVar;
        this.f19915d = fVar;
        this.f19916e = new ArrayList();
    }

    static final h.ab f(t tVar, bn bnVar, String str) {
        h.g.b.x.f(str, "canvasId");
        tVar.f19915d.c();
        tVar.f19912a.h(str);
        bnVar.e(new Cdo(new com.waze.map.ab(str)));
        return h.ab.f48028a;
    }

    static final void h(t tVar, bn bnVar) {
        tVar.f19912a.g();
        bnVar.e(dn.f28759a);
    }

    public final void g(WazeRenderer wazeRenderer, bn bnVar, h hVar, ec ecVar, f fVar) {
        h.g.b.x.f(wazeRenderer, "renderer");
        h.g.b.x.f(bnVar, "canvasState");
        h.g.b.x.f(hVar, "surfaceInterface");
        h.g.b.x.f(ecVar, "touchNotifier");
        h.g.b.x.f(fVar, "surfaceCallbacksOneToMany");
        List list = this.f19916e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.waze.shared_infra.s.d) it.next()).a();
        }
        list.clear();
        List list2 = list;
        list2.add(wazeRenderer.b(new v(this, bnVar, 1)));
        list2.add(wazeRenderer.a(new w(this, bnVar, 1)));
        com.waze.bk.e eVarA = this.f19913b.a();
        com.waze.map.opengl.x xVar = new com.waze.map.opengl.x(com.waze.map.opengl.f.f29545a, a(), wazeRenderer, eVarA.i() ? this.f19914c.a() : null, true);
        xVar.gwEnableAaOverlay();
        d(hVar, fVar, ecVar, eVarA, xVar);
    }
}
