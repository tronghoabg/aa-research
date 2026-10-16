package com.waze.car_lib.r;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dn {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21413a;

    public dn(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        this.f21413a = aVar;
    }

    public final dm a(com.waze.reports_v2.b.r rVar) {
        String strC;
        h.g.b.x.f(rVar, "reportData");
        com.waze.shared_infra.o.a aVar = this.f21413a;
        String strC2 = aVar.c(R.string.REPORT_INCAR_CLOSURE_REPORT_TITLE, new Object[0]);
        com.waze.reports_v2.b.s sVarA = rVar.a();
        com.waze.reports_v2.b.s sVar = com.waze.reports_v2.b.s.f34126a;
        int iOrdinal = sVarA.ordinal();
        if (iOrdinal == 0) {
            strC = aVar.c(R.string.REPORT_INCAR_CLOSURE_REPORT_AHEAD_MESSAGE, new Object[0]);
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            strC = aVar.c(R.string.REPORT_INCAR_CLOSURE_REPORT_BEHIND_MESSAGE, new Object[0]);
        }
        return new dm(rVar, new com.waze.car_lib.p.ak(strC2, strC, com.waze.car_lib.p.ag.f20542a, new com.waze.car_lib.p.af(aVar.c(R.string.REPORT_INCAR_CLOSURE_REPORT_PRIMARY_BUTTON, new Object[0]), true, true), new com.waze.car_lib.p.af(aVar.c(R.string.REPORT_INCAR_CLOSURE_REPORT_SECONDARY_BUTTON, new Object[0]), false, false), null, 32));
    }
}
