package com.waze.car_lib.i.a;

import com.waze.car_lib.f.gh;
import com.waze.map.ec;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final t f19917a;

    /* renamed from: b, reason: collision with root package name */
    private final x f19918b;

    public u(t tVar, x xVar) {
        h.g.b.x.f(tVar, "canvasRendererPresenter");
        h.g.b.x.f(xVar, "mapRendererPresenter");
        this.f19917a = tVar;
        this.f19918b = xVar;
    }

    public final void a() {
        this.f19917a.c();
        this.f19918b.c();
    }

    public final void b(h hVar) {
        h.g.b.x.f(hVar, "surfaceInterface");
        this.f19917a.e(hVar);
        this.f19918b.e(hVar);
    }

    public final void c(gh ghVar, bn bnVar, h hVar, ec ecVar, f fVar) {
        h.g.b.x.f(ghVar, "renderer");
        h.g.b.x.f(bnVar, "mapStateOutput");
        h.g.b.x.f(hVar, "surfaceInterface");
        h.g.b.x.f(ecVar, "touchNotifier");
        h.g.b.x.f(fVar, "surfaceCallbacksOneToMany");
        if (ghVar instanceof com.waze.car_lib.i.b.p) {
            this.f19917a.g(((com.waze.car_lib.i.b.p) ghVar).a(), bnVar, hVar, ecVar, fVar);
        } else {
            if (!(ghVar instanceof com.waze.car_lib.i.b.q)) {
                throw new h.i();
            }
            this.f19918b.g(((com.waze.car_lib.i.b.q) ghVar).a(), bnVar, hVar, ecVar, fVar);
        }
    }
}
