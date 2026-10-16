package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dt extends com.waze.car_lib.bm {

    /* renamed from: d, reason: collision with root package name */
    private final dw f19502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt(dw dwVar) {
        super(new com.waze.shared_infra.coordinators.p(false));
        h.g.b.x.f(dwVar, "controller");
        this.f19502d = dwVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19502d;
    }

    public final dw f() {
        return this.f19502d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        gh ghVar = (gh) obj;
        h.g.b.x.f(ghVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(ghVar, dy.f19512a)) {
            return;
        }
        if (ghVar instanceof dz) {
            if (com.waze.car_lib.r.bq.i(a())) {
                J(new com.waze.car_lib.screens.bb(((dz) ghVar).a(), a(), this.f19502d), true);
                return;
            } else {
                J(new com.waze.car_lib.screens.aj(((dz) ghVar).a(), a(), this.f19502d), true);
                return;
            }
        }
        if (h.g.b.x.n(ghVar, dx.f19511a)) {
            D(h.ab.f48028a);
        } else {
            if (!(ghVar instanceof ea)) {
                throw new h.i();
            }
            kotlinx.coroutines.aj.z(A(), null, null, new d(this, ((ea) ghVar).a(), (h.c.e) null, 13), 3);
        }
    }
}
