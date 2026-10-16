package com.waze.reports_v2.c;

import com.waze.jni.protos.rtalerts.ReportLocationProto;
import com.waze.rtalerts.RtAlertsNativeManager;
import java.util.Objects;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class du implements ds {

    /* renamed from: a, reason: collision with root package name */
    private final RtAlertsNativeManager f34449a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34450b;

    public du(RtAlertsNativeManager rtAlertsNativeManager, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(rtAlertsNativeManager, "rtAlertsNativeManager");
        h.g.b.x.f(eVar, "logger");
        this.f34449a = rtAlertsNativeManager;
        this.f34450b = eVar;
    }

    static final h.ab e(h.g.a.l lVar, du duVar, ReportLocationProto reportLocationProto) {
        com.waze.sharedui.e.c cVarE = reportLocationProto != null ? com.waze.reports_v2.b.n.e(reportLocationProto) : null;
        com.waze.shared_infra.i.e eVar = duVar.f34450b;
        Objects.toString(cVarE);
        eVar.a("retrieving saved position: ".concat(String.valueOf(cVarE)));
        lVar.invoke(cVarE);
        return h.ab.f48028a;
    }

    static final h.ab f(h.g.a.l lVar, du duVar, ReportLocationProto reportLocationProto) {
        com.waze.sharedui.e.c cVarE = reportLocationProto != null ? com.waze.reports_v2.b.n.e(reportLocationProto) : null;
        com.waze.shared_infra.i.e eVar = duVar.f34450b;
        Objects.toString(cVarE);
        eVar.a("saving report position: ".concat(String.valueOf(cVarE)));
        lVar.invoke(cVarE);
        return h.ab.f48028a;
    }

    @Override // com.waze.reports_v2.c.ds
    public final Object a(h.c.e eVar) {
        CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        c(new com.waze.car_lib.o.ab(completableDeferredJ, 1));
        return completableDeferredJ.c(eVar);
    }

    @Override // com.waze.reports_v2.c.ds
    public final Object b(h.c.e eVar) {
        CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        d(new com.waze.car_lib.o.ab(completableDeferredJ, 2));
        return completableDeferredJ.c(eVar);
    }

    @Override // com.waze.reports_v2.c.ds
    public final void c(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "callback");
        this.f34449a.getReportLocation(new dt(lVar, this, 1));
    }

    @Override // com.waze.reports_v2.c.ds
    public final void d(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "callback");
        this.f34449a.setAndRetrieveReportLocation(new dt(lVar, this, 0));
    }
}
