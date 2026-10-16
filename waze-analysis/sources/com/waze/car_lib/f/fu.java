package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class fu extends com.waze.car_lib.bm {

    /* renamed from: d, reason: collision with root package name */
    private final fw f19593d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.car_lib.screens.br f19594e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.car_lib.screens.bp f19595f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu(fw fwVar, com.waze.car_lib.screens.br brVar, com.waze.car_lib.screens.bp bpVar) {
        super((byte[]) null);
        h.g.b.x.f(fwVar, "controller");
        h.g.b.x.f(brVar, "viewModel");
        h.g.b.x.f(bpVar, "deniedViewModel");
        this.f19593d = fwVar;
        this.f19594e = brVar;
        this.f19595f = bpVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19593d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        Object objA;
        com.waze.car_lib.screens.bx bxVar = (com.waze.car_lib.screens.bx) obj;
        h.g.b.x.f(bxVar, NotificationCompat.CATEGORY_EVENT);
        if (bxVar instanceof fx) {
            D(((fx) bxVar).a() ? gd.f19606a : gc.f19605a);
            return;
        }
        if (bxVar instanceof fy) {
            this.f19593d.c(a());
            return;
        }
        if (bxVar instanceof ga) {
            J(new com.waze.car_lib.screens.bq(a(), this.f19593d, this.f19594e), true);
            return;
        }
        if (bxVar instanceof fz) {
            J(new com.waze.car_lib.screens.bo(a(), this.f19593d, this.f19595f), true);
            return;
        }
        if (!(bxVar instanceof gb)) {
            throw new h.i();
        }
        try {
            fu fuVar = this;
            com.waze.car_lib.r.bq.k(a());
            objA = h.ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            com.waze.shared_infra.i.h.c("couldn't open application setting: ".concat(String.valueOf(thC.getMessage())));
        }
    }
}
