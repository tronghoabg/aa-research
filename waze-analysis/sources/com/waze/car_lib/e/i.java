package com.waze.car_lib.e;

import androidx.car.app.CarContext;
import com.waze.car_lib.aq;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i implements aq {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19285a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.i.a.p f19286b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.map.opengl.g f19287c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f19288d;

    public i(com.waze.shared_infra.i.e eVar, com.waze.car_lib.i.a.p pVar, com.waze.map.opengl.g gVar) {
        x.f(eVar, "logger");
        x.f(pVar, "scaleFactorGetter");
        x.f(gVar, "godotInitializer");
        this.f19285a = eVar;
        this.f19286b = pVar;
        this.f19287c = gVar;
        this.f19288d = ck.b(null);
    }

    static final ab c(com.waze.car_lib.i.b.r rVar, i iVar) {
        iVar.f19288d.e(new com.waze.car_lib.c.f(rVar));
        return ab.f48028a;
    }

    static final ab d(i iVar) {
        iVar.f19288d.e(null);
        return ab.f48028a;
    }

    @Override // com.waze.car_lib.aq
    public final void a(com.waze.car_lib.i.a.a aVar, af afVar, CarContext carContext) {
        x.f(aVar, "presentableController");
        x.f(afVar, "scope");
        x.f(carContext, "context");
        this.f19286b.a();
        aj.z(afVar, null, null, new o(this, com.waze.beacons.n.b(this.f19285a, aVar, carContext), aVar, (h.c.e) null, 1), 3);
    }
}
