package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gf extends com.waze.car_lib.bm {

    /* renamed from: d, reason: collision with root package name */
    private final gg f19610d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19611e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(gg ggVar, com.waze.shared_infra.i.e eVar) {
        super((byte[]) null);
        h.g.b.x.f(ggVar, "controller");
        h.g.b.x.f(eVar, "logger");
        this.f19610d = ggVar;
        this.f19611e = eVar;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f19610d;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        com.waze.car_lib.o.ae aeVar = (com.waze.car_lib.o.ae) obj;
        h.g.b.x.f(aeVar, NotificationCompat.CATEGORY_EVENT);
        if (aeVar instanceof gi) {
            if (com.waze.car_lib.r.bq.i(a())) {
                J(new com.waze.car_lib.screens.bw(this.f19610d, a()), true);
                return;
            } else {
                this.f19611e.g("Showing ReportAlertScreen instead of ReportAlertScreenV2, CarAppApiLevels is < 7");
                J(new com.waze.car_lib.screens.bu(this.f19610d, a()), true);
                return;
            }
        }
        if (aeVar instanceof gj) {
            D(go.f19621a);
            return;
        }
        if (h.g.b.x.n(aeVar, gm.f19619a)) {
            kotlinx.coroutines.aj.z(A(), null, null, new ge(this, (h.c.e) null, 0), 3);
            return;
        }
        if (h.g.b.x.n(aeVar, gk.f19617a)) {
            D(gp.f19622a);
            return;
        }
        if (aeVar instanceof gn) {
            if (com.waze.car_lib.r.bq.i(a())) {
                J(new com.waze.car_lib.screens.cb(((gn) aeVar).a(), this.f19610d, a()), true);
                return;
            } else {
                this.f19611e.g("Showing ReportSubAlertScreen instead of ReportSubAlertScreenV2, CarAppApiLevels is < 7");
                J(new com.waze.car_lib.screens.ca(((gn) aeVar).a(), this.f19610d, a()), true);
                return;
            }
        }
        if (!(aeVar instanceof gl)) {
            throw new h.i();
        }
        com.waze.reports_v2.b.r rVarA = ((gl) aeVar).a();
        if (rVarA != null) {
            J(new com.waze.car_lib.screens.bz(rVarA, this.f19610d, a()), true);
        } else {
            D(gp.f19622a);
        }
    }
}
