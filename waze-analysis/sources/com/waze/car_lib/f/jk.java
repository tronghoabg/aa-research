package com.waze.car_lib.f;

import androidx.car.app.CarContext;
import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jk extends com.waze.car_lib.bm {

    /* renamed from: d, reason: collision with root package name */
    private final jl f19756d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19757e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(jl jlVar, com.waze.shared_infra.i.e eVar) {
        super((byte[]) null);
        h.g.b.x.f(jlVar, "controller");
        h.g.b.x.f(eVar, "logger");
        this.f19756d = jlVar;
        this.f19757e = eVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19756d;
    }

    public final jl f() {
        return this.f19756d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        com.waze.car_lib.b bVar = (com.waze.car_lib.b) obj;
        h.g.b.x.f(bVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(bVar, jn.f19760a)) {
            return;
        }
        if (!(bVar instanceof jo)) {
            if (!(bVar instanceof jm)) {
                throw new h.i();
            }
            D(((jm) bVar).e());
            return;
        }
        com.waze.shared_infra.i.e eVar = this.f19757e;
        jo joVar = (jo) bVar;
        eVar.a("got ShowWazeAsksQuestion event, question entity id: ".concat(String.valueOf(joVar.e().e())));
        if (!com.waze.car_lib.r.bq.i(a())) {
            eVar.g("waze asks is triggered but not shown as CarAppApiLevels is < 7");
            D(new jr(jq.f19765c));
            return;
        }
        jk jkVar = this;
        jl jlVar = this.f19756d;
        CarContext carContextA = a();
        com.waze.asks.as asVarE = joVar.e();
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeAsksInCarScreen");
        h.g.b.x.e(eVarD, "create(...)");
        jkVar.J(new com.waze.car_lib.screens.df(jlVar, carContextA, asVarE, eVarD), true);
    }
}
