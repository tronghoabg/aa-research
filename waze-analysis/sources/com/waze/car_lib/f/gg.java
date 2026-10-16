package com.waze.car_lib.f;

import android.os.Parcelable;
import com.waze.reports_v2.c.Cdo;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gg extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.b.br f19612a;

    /* renamed from: b, reason: collision with root package name */
    private final Cdo f19613b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.reports_v2.c.q f19614c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(com.waze.car_lib.b.br brVar, Cdo cdo, com.waze.reports_v2.c.q qVar, kotlinx.coroutines.af afVar) {
        super(gi.f19615a, afVar);
        h.g.b.x.f(brVar, "reportAlertController");
        h.g.b.x.f(cdo, "analytics");
        h.g.b.x.f(qVar, "closureDataProvider");
        h.g.b.x.f(afVar, "scope");
        this.f19612a = brVar;
        this.f19613b = cdo;
        this.f19614c = qVar;
    }

    private final void f(com.waze.reports_v2.b.q qVar, com.waze.reports_v2.b.at atVar, com.waze.reports_v2.b.i iVar) {
        Cdo cdo = this.f19613b;
        cdo.L(qVar, atVar);
        cdo.K(new com.waze.reports_v2.c.ck(qVar), new com.waze.reports_v2.c.cl(atVar), false);
        this.f19612a.e(qVar, atVar, iVar);
        H(gj.f19616a);
    }

    public final void a() {
        H(gk.f19617a);
        this.f19613b.c(null, com.waze.reports_v2.c.dl.f34425e);
    }

    public final void b(com.waze.reports_v2.b.r rVar) {
        h.g.b.x.f(rVar, "closureReportData");
        f(com.waze.reports_v2.b.q.f34119i, com.waze.reports_v2.b.at.I, gh.a(rVar));
    }

    public final void c(com.waze.reports_v2.b.ag agVar) {
        gn gnVar;
        h.g.b.x.f(agVar, "categoryWithSubtypes");
        this.f19613b.d(com.waze.reports_v2.c.dm.f34428b, new com.waze.reports_v2.c.ck(agVar.g()));
        com.waze.reports_v2.b.q qVarG = agVar.g();
        Parcelable.Creator<com.waze.reports_v2.b.q> creator = com.waze.reports_v2.b.q.CREATOR;
        switch (qVarG.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
                gnVar = new gn(agVar);
                break;
            case 7:
                gnVar = gm.f19619a;
                break;
            case 8:
                gnVar = new gl(this.f19614c.a());
                break;
            default:
                throw new h.i();
        }
        H(gnVar);
    }

    public final void d(com.waze.reports_v2.b.q qVar, com.waze.reports_v2.b.at atVar) {
        h.g.b.x.f(qVar, "group");
        h.g.b.x.f(atVar, "subtype");
        f(qVar, atVar, null);
    }

    public final void e() {
        H(gk.f19617a);
        this.f19613b.M(com.waze.reports_v2.c.dl.f34425e);
    }
}
