package com.waze.car_lib.f;

import androidx.car.app.CarContext;
import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class w extends fg {

    /* renamed from: d, reason: collision with root package name */
    private final x f19780d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.app_nav.w f19781e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, com.waze.app_nav.w wVar) {
        super(xVar);
        h.g.b.x.f(xVar, "controller");
        h.g.b.x.f(wVar, "mainScreenFlowController");
        this.f19780d = xVar;
        this.f19781e = wVar;
    }

    @Override // com.waze.car_lib.f.fg, com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19780d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        com.waze.i.a aVar = (com.waze.i.a) obj;
        h.g.b.x.f(aVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(aVar, fk.f19584a)) {
            J(new com.waze.car_lib.screens.s(a()), true);
            com.waze.alerters.a.k.c(this.f19781e, new com.waze.location.j((byte[]) null), com.waze.app_nav.ah.f15182a);
            return;
        }
        if (aVar instanceof fj) {
            com.waze.alerters.a.k.c(this.f19781e, new com.waze.location.j(((fj) aVar).a()), com.waze.app_nav.ah.f15182a);
            return;
        }
        fh fhVar = fh.f19581a;
        if (h.g.b.x.n(aVar, fhVar)) {
            D(fl.f19585a);
            return;
        }
        if (!(aVar instanceof fi)) {
            throw new h.i();
        }
        x xVar = this.f19780d;
        CarContext carContextA = a();
        com.waze.location.a aVarA = ((fi) aVar).a();
        h.g.b.x.f(carContextA, "context");
        h.g.b.x.f(aVarA, "response");
        if (com.waze.location.q.f(carContextA)) {
            xVar.H(fhVar);
        }
        com.google.android.gms.common.api.y yVarA = aVarA.a();
        if (yVarA != null) {
            xVar.H(new fj(yVarA));
        }
    }
}
