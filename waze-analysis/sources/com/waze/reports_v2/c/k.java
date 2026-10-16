package com.waze.reports_v2.c;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.config.ConfigValues;
import com.waze.rtalerts.RtAlertsNativeManager;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.af f34509a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.reports_v2.b.d f34510b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.reports_v2.b.am f34511c;

    /* renamed from: d, reason: collision with root package name */
    private final p f34512d;

    /* renamed from: e, reason: collision with root package name */
    private final RtAlertsNativeManager f34513e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34514f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicInteger f34515g;

    public k(kotlinx.coroutines.af afVar, com.waze.reports_v2.b.d dVar, com.waze.reports_v2.b.am amVar, a aVar, p pVar, RtAlertsNativeManager rtAlertsNativeManager) {
        h.g.b.x.f(afVar, "bgScope");
        h.g.b.x.f(dVar, "reportAlertApi");
        h.g.b.x.f(amVar, "reportMapIssueApi");
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(pVar, "canSend");
        h.g.b.x.f(rtAlertsNativeManager, "rtAlertsNativeManager");
        this.f34509a = afVar;
        this.f34510b = dVar;
        this.f34511c = amVar;
        this.f34512d = pVar;
        this.f34513e = rtAlertsNativeManager;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AddUserReportAlertUseCase");
        h.g.b.x.e(eVarD, "create(...)");
        this.f34514f = eVarD;
        this.f34515g = new AtomicInteger(0);
    }

    private final e i(h.g.a.l lVar) {
        CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        if (this.f34512d.b()) {
            kotlinx.coroutines.aj.z(this.f34509a, null, null, new g(completableDeferredJ, lVar, null), 3);
            return new e(f.f34483a, completableDeferredJ);
        }
        AtomicInteger atomicInteger = this.f34515g;
        if (atomicInteger.get() >= ((int) ConfigValues.CONFIG_VALUE_ALERTS_MAX_OFFLINE_REPORTS.b().longValue())) {
            return new e(f.f34485c, kotlinx.coroutines.bo.h(b.f34229a));
        }
        atomicInteger.incrementAndGet();
        kotlinx.coroutines.aj.z(this.f34509a, null, null, new h(this, completableDeferredJ, lVar, null), 3);
        return new e(f.f34484b, completableDeferredJ);
    }

    public final e c(com.waze.reports_v2.b.at atVar, com.waze.sharedui.e.c cVar, long j2, com.waze.rtalerts.y yVar, com.waze.reports_v2.b.i iVar) {
        Object next;
        h.g.b.x.f(atVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(cVar, "location");
        h.g.b.x.f(yVar, "useCaseType");
        com.waze.reports_v2.b.af afVar = com.waze.reports_v2.b.af.f34037a;
        h.g.b.x.f(atVar, "subtype");
        Iterator<E> it = com.waze.reports_v2.b.af.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((com.waze.reports_v2.b.af) next).b() == atVar) {
                break;
            }
        }
        com.waze.reports_v2.b.af afVar2 = (com.waze.reports_v2.b.af) next;
        if (afVar2 != null) {
            return i(new ac(this, cVar, afVar2, iVar instanceof com.waze.reports_v2.b.h ? (com.waze.reports_v2.b.h) iVar : null, (h.c.e) null, 1));
        }
        return i(new i(cVar, atVar, j2, yVar, iVar, this, null));
    }

    public final void h(com.waze.reports_v2.b.at atVar, com.waze.sharedui.e.c cVar, long j2, com.waze.rtalerts.y yVar, com.waze.reports_v2.b.i iVar, h.g.a.l lVar) {
        h.g.b.x.f(atVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(cVar, "location");
        h.g.b.x.f(yVar, "useCaseType");
        h.g.b.x.f(lVar, "callback");
        kotlinx.coroutines.aj.z(this.f34509a, null, null, new j(lVar, c(atVar, cVar, j2, yVar, iVar), this, null), 3);
    }
}
