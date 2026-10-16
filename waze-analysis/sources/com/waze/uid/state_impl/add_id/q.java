package com.waze.uid.state_impl.add_id;

import androidx.core.app.NotificationCompat;
import com.waze.uid.FlowContext;
import com.waze.uid.UidModel;
import com.waze.uid.VehicleType;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q extends com.waze.uid.e.f {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f44594a;

    /* renamed from: f, reason: collision with root package name */
    private VehicleType f44595f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.waze.uid.e.b bVar, com.waze.uid.e.h hVar, com.waze.uid.b.m mVar) {
        super("AddIdChooseVehicleTypeState", bVar, hVar, mVar);
        h.g.b.x.f(bVar, "trace");
        h.g.b.x.f(hVar, "parent");
        h.g.b.x.f(mVar, "controller");
        this.f44594a = h.g.a(new com.waze.ui.r.a.e.c(11));
        this.f44595f = VehicleType.Private;
    }

    private final com.waze.shared_infra.i.e a() {
        return (com.waze.shared_infra.i.e) this.f44594a.getValue();
    }

    @Override // com.waze.uid.e.f
    public final void f(com.waze.uid.e.e eVar) {
        a().a("onEnterState");
        super.f(eVar);
        com.waze.uid.d.q.f44463a.a().c().m();
        com.waze.uid.b.m mVar = this.f44485c;
        mVar.k(mVar.a().e(new bb(bm.p, null, aa.f44576a, false)));
    }

    @Override // com.waze.uid.e.f
    public final boolean h(com.waze.uid.e.e eVar) {
        com.waze.shared_infra.i.e eVarA = a();
        Objects.toString(eVar);
        eVarA.a("shouldEnterState(dir:".concat(String.valueOf(eVar)));
        if (eVar == com.waze.uid.e.e.f44481a) {
            return com.waze.uid.b.m.t().a().k() && ((UidModel) this.f44485c.b()).getFlowContext() == FlowContext.WAZE_ONBOARDING;
        }
        return false;
    }

    @Override // com.waze.uid.e.f, com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        com.waze.uid.stats.g gVar;
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        if (sVar instanceof com.waze.uid.b.p) {
            com.waze.uid.d.p pVar = com.waze.uid.d.q.f44463a;
            pVar.a().c().l(com.waze.uid.stats.g.f44743e);
            com.waze.shared_infra.i.e eVarA = a();
            VehicleType vehicleType = this.f44595f;
            Objects.toString(vehicleType);
            eVarA.a("set selected vehicle type: ".concat(String.valueOf(vehicleType)));
            pVar.a().f44467e.q(this.f44595f);
            k();
            return;
        }
        if (sVar instanceof com.waze.uid.b.c) {
            com.waze.uid.d.q.f44463a.a().c().l(com.waze.uid.stats.g.f44742d);
            k();
            return;
        }
        if (!(sVar instanceof z)) {
            super.o(sVar);
            return;
        }
        com.waze.uid.stats.s sVarC = com.waze.uid.d.q.f44463a.a().c();
        z zVar = (z) sVar;
        VehicleType vehicleTypeA = zVar.a();
        VehicleType vehicleType2 = VehicleType.Private;
        int iOrdinal = vehicleTypeA.ordinal();
        if (iOrdinal == 0) {
            gVar = com.waze.uid.stats.g.f44739a;
        } else if (iOrdinal == 1) {
            gVar = com.waze.uid.stats.g.f44740b;
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            gVar = com.waze.uid.stats.g.f44741c;
        }
        sVarC.l(gVar);
        this.f44595f = zVar.a();
    }
}
