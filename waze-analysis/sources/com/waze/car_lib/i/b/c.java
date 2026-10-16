package com.waze.car_lib.i.b;

import android.content.Context;
import com.waze.map.b.ed;
import com.waze.map.cj;
import com.waze.map.cv;
import com.waze.map.opengl.WazeRenderer;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c implements r {

    /* renamed from: a, reason: collision with root package name */
    private final ed f19975a;

    /* renamed from: b, reason: collision with root package name */
    private final cj f19976b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.i.a.ac f19977c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.map.opengl.p f19978d;

    /* renamed from: e, reason: collision with root package name */
    private final p f19979e;

    public c(String str, ed edVar, cj cjVar, com.waze.car_lib.i.a.ac acVar, com.waze.map.opengl.p pVar) {
        h.g.b.x.f(str, "description");
        h.g.b.x.f(edVar, "controller");
        h.g.b.x.f(cjVar, "presenterBuilder");
        h.g.b.x.f(acVar, "loaderController");
        h.g.b.x.f(pVar, "externalDependencies");
        this.f19975a = edVar;
        this.f19976b = cjVar;
        this.f19977c = acVar;
        this.f19978d = pVar;
        com.waze.map.opengl.ae aeVar = com.waze.map.opengl.ae.f29536b;
        String strA = com.waze.map.canvas.q.f28655b.a();
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("renderer:genericCanvas:".concat(str));
        h.g.b.x.e(eVarD, "create(...)");
        this.f19979e = new p(new WazeRenderer(aeVar, str, strA, pVar, eVarD));
    }

    static final h.ab b(List list, com.waze.car_lib.i.a.a aVar, c cVar, com.waze.map.h hVar) {
        list.clear();
        aVar.f(cVar.f19979e);
        hVar.b();
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.i.b.r
    public final void a() {
        this.f19979e.a().f();
    }

    @Override // com.waze.car_lib.i.b.r
    public final /* bridge */ /* synthetic */ void c(Context context, kotlinx.coroutines.af afVar, com.waze.car_lib.i.a.a aVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(aVar, "presentableController");
        ch chVarE = aVar.e(this.f19979e);
        com.waze.map.h hVar = new com.waze.map.h(aVar.b());
        WeakReference weakReference = new WeakReference(context);
        this.f19975a.B(this.f19976b.a(cv.f28707a, afVar, chVarE, this.f19977c.b(), new ag(aVar, null, 1, null), new com.waze.b.g(weakReference, 12), hVar), new com.waze.ui.p.h(aVar.d(), 1));
        com.waze.ad.c.b.a(afVar, new ac(h.a.i.l(context), aVar, this, hVar, 1));
    }
}
