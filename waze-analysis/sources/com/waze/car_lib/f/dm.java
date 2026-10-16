package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dm extends com.waze.car_lib.bm {

    /* renamed from: d, reason: collision with root package name */
    private final dn f19494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(dn dnVar) {
        super((byte[]) null);
        h.g.b.x.f(dnVar, "controller");
        this.f19494d = dnVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19494d;
    }

    public final dn f() {
        return this.f19494d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        com.waze.ab.a.l lVar = (com.waze.ab.a.l) obj;
        h.g.b.x.f(lVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(lVar, dp.f19497a)) {
            return;
        }
        if (lVar instanceof dr) {
            com.waze.car_lib.screens.ag agVar = new com.waze.car_lib.screens.ag(a(), this.f19494d, ((dr) lVar).a());
            agVar.disableBackPresses();
            J(agVar, true);
            return;
        }
        if (h.g.b.x.n(lVar, dq.f19498a)) {
            D(ds.f19501a);
            return;
        }
        if (!(lVar instanceof Cdo)) {
            throw new h.i();
        }
        Cdo cdo = (Cdo) lVar;
        com.waze.car_lib.screens.p pVar = new com.waze.car_lib.screens.p(a(), cdo.b(), cdo.a());
        pVar.disableBackPresses();
        J(pVar, true);
    }
}
