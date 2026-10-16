package com.waze.reports;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bm {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.c.k f33703a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.reports_v2.c.ds f33704b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.reports_v2.presentation.dc f33705c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f33706d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f33707e;

    public bm(com.waze.reports_v2.c.k kVar, com.waze.reports_v2.c.ds dsVar, com.waze.reports_v2.presentation.dc dcVar, com.waze.shared_infra.q.e eVar, com.waze.shared_infra.i.e eVar2) {
        h.g.b.x.f(kVar, "addUserReportAlertUseCase");
        h.g.b.x.f(dsVar, "positionSaver");
        h.g.b.x.f(dcVar, "resultPresenter");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(eVar2, "logger");
        this.f33703a = kVar;
        this.f33704b = dsVar;
        this.f33705c = dcVar;
        this.f33706d = eVar;
        this.f33707e = eVar2;
    }

    public static /* synthetic */ h.ab a(bm bmVar, com.waze.reports_v2.b.at atVar, com.waze.reports_v2.c.d dVar) {
        h.g.b.x.f(dVar, "result");
        if (dVar instanceof com.waze.reports_v2.c.b) {
            bmVar.f33705c.c();
        } else {
            if (!(dVar instanceof com.waze.reports_v2.c.c)) {
                throw new h.i();
            }
            bmVar.f33705c.b(com.waze.reports_v2.b.q.f34117g, atVar, null);
        }
        return h.ab.f48028a;
    }

    static final h.ab b(com.waze.reports_v2.b.af afVar, bm bmVar, String str, com.waze.sharedui.e.c cVar) {
        long jA;
        com.waze.reports_v2.b.at atVarB = afVar.b();
        if (cVar != null) {
            com.waze.reports_v2.c.k kVar = bmVar.f33703a;
            Long lI = cVar.i();
            if (lI != null) {
                jA = com.waze.settings.h.c.h(lI.longValue());
            } else {
                com.waze.shared_infra.q.e eVar = bmVar.f33706d;
                com.waze.shared_infra.i.e eVar2 = bmVar.f33707e;
                jA = eVar.a();
                eVar2.g("Location provided without timestamp, falling back to current time");
            }
            com.waze.rtalerts.y yVar = com.waze.rtalerts.y.f35166a;
            if (true == h.n.o.G(str)) {
                str = null;
            }
            kVar.h(atVarB, cVar, jA, yVar, str != null ? new com.waze.reports_v2.b.h(str) : null, new com.waze.authentication.as(bmVar, atVarB, 6));
        } else {
            bmVar.f33705c.c();
        }
        return h.ab.f48028a;
    }

    public final void c(int i2, final String str) {
        Object next;
        h.g.b.x.f(str, "description");
        Iterator<E> it = com.waze.reports_v2.b.af.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((com.waze.reports_v2.b.af) next).a() == i2) {
                    break;
                }
            }
        }
        final com.waze.reports_v2.b.af afVar = (com.waze.reports_v2.b.af) next;
        if (afVar != null) {
            this.f33704b.c(new h.g.a.l() { // from class: com.waze.reports.bl
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return bm.b(afVar, this, str, (com.waze.sharedui.e.c) obj);
                }
            });
        } else {
            this.f33705c.c();
        }
    }
}
