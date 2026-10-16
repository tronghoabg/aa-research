package com.waze.reports_v2.presentation;

import android.content.Context;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.R;
import com.waze.gp;
import com.waze.reports_v2.c.Cdo;
import com.waze.reports_v2.c.dv;
import com.waze.reports_v2.c.dw;
import com.waze.reports_v2.c.dx;
import com.waze.reports_v2.c.dy;
import com.waze.reports_v2.c.dz;
import com.waze.reports_v2.c.ea;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dg implements dc {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.app_nav.hub.b.c f35026a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f35027b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.an.d.b f35028c;

    /* renamed from: d, reason: collision with root package name */
    private final dd f35029d;

    /* renamed from: e, reason: collision with root package name */
    private final Cdo f35030e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.an.a.u f35031f;

    public dg(com.waze.app_nav.hub.b.c cVar, com.waze.shared_infra.o.a aVar, com.waze.an.d.b bVar, dd ddVar, Cdo cdo, bb bbVar) {
        h.g.b.x.f(cVar, "popupManager");
        h.g.b.x.f(aVar, "stringsProvider");
        h.g.b.x.f(bVar, "notificationInsightsService");
        h.g.b.x.f(ddVar, "config");
        h.g.b.x.f(cdo, "reportMenuStatsSender");
        h.g.b.x.f(bbVar, "categoriesTransformer");
        this.f35026a = cVar;
        this.f35027b = aVar;
        this.f35028c = bVar;
        this.f35029d = ddVar;
        this.f35030e = cdo;
        this.f35031f = new com.waze.an.a.u("ReportResultPresenter.feedback", com.waze.an.a.ae.f14546b);
    }

    static final h.ab e(dg dgVar, com.waze.reports_v2.b.q qVar, com.waze.reports_v2.b.at atVar) {
        dgVar.f35030e.B(qVar, atVar);
        return h.ab.f48028a;
    }

    static final com.waze.ab.s f(dg dgVar, ea eaVar, Context context) {
        h.k kVar;
        h.g.b.x.f(context, "context");
        if (h.g.b.x.n(eaVar, dz.f34455a)) {
            kVar = new h.k(Integer.valueOf(R.string.CANNOT_REPORT_WHILE_INVISIBLE_TITLE), Integer.valueOf(R.string.CANNOT_REPORT_WHILE_INVISIBLE));
        } else if (h.g.b.x.n(eaVar, dx.f34453a)) {
            kVar = new h.k(Integer.valueOf(R.string.NO_NETWORK_A_GPS), Integer.valueOf(R.string.SORRY__YOU_NEED_NETWORK_A_GPS_CONNECTION_WHEN_REPORTING_AN_EVENT__PLEASE_REHTRY_LATER));
        } else if (h.g.b.x.n(eaVar, dw.f34452a)) {
            kVar = new h.k(Integer.valueOf(R.string.NO_GPS_RECEPTION), Integer.valueOf(R.string.SORRY__THERESS_NO_GPS_RECEPTION_IN_THIS_LOCATION__MAKE_SURE_YOU_ARE_OUTDOORS));
        } else if (h.g.b.x.n(eaVar, dy.f34454a)) {
            kVar = new h.k(Integer.valueOf(R.string.NO_NETWORK_CONNECTION), Integer.valueOf(R.string.SORRY__YOU_HAVE_NO_NETWORK_CONNECTION_RIGHT_NOW__PLEASE_TRY_LATER));
        } else {
            if (!h.g.b.x.n(eaVar, dv.f34451a)) {
                throw new h.i();
            }
            kVar = new h.k(Integer.valueOf(R.string.REPORT_MENU_V2_CATEGORIES_CONFIG_ERROR_TITLE), Integer.valueOf(R.string.REPORT_MENU_V2_CATEGORIES_CONFIG_ERROR_MESSAGE));
        }
        h.k kVar2 = new h.k(Integer.valueOf(((Number) kVar.a()).intValue()), Integer.valueOf(((Number) kVar.b()).intValue()));
        int iIntValue = ((Number) kVar2.a()).intValue();
        int iIntValue2 = ((Number) kVar2.b()).intValue();
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = dgVar.f35027b;
        oVar.Q(aVar.c(iIntValue, new Object[0]));
        oVar.P(aVar.c(iIntValue2, new Object[0]));
        oVar.M(aVar.c(R.string.OK, new Object[0]));
        oVar.w(5);
        oVar.K(new com.google.android.gms.common.api.internal.bc(19));
        com.waze.ab.s sVar = new com.waze.ab.s(context, oVar);
        sVar.show();
        return sVar;
    }

    private final com.waze.an.a.k g(String str, String str2, Integer num) {
        h.o.c cVar = h.o.a.f48264a;
        return new com.waze.an.a.k(str, str2, num, new com.waze.an.a.j(h.o.c.i(this.f35029d.a(), h.o.d.f48273d), new com.waze.navigate.dc(9), null), h.a.i.h());
    }

    private final void h(com.waze.an.a.k kVar, h.g.a.a aVar) {
        if (com.waze.an.c.q.b(this.f35028c, this.f35031f, kVar, null, null, 28)) {
            aVar.invoke();
        }
    }

    @Override // com.waze.reports_v2.presentation.dc
    public final void a(com.waze.reports_v2.presentation.a.bc bcVar) {
        h.g.b.x.f(bcVar, "error");
        if (!h.g.b.x.n(bcVar, com.waze.reports_v2.presentation.a.bb.f34709a)) {
            throw new h.i();
        }
        h.k kVar = new h.k(this.f35027b.c(R.string.REPORT_MENU_V2_CLOSURE_REPORT_SEGMENT_CALCULATION_ERROR_TITLE, new Object[0]), null);
        h.k kVar2 = new h.k((String) kVar.a(), (Void) kVar.b());
        h(g((String) kVar2.a(), (String) kVar2.b(), Integer.valueOf(R.drawable.icon_report_error)), new com.waze.navigate.dc(10));
    }

    @Override // com.waze.reports_v2.presentation.dc
    public final void b(final com.waze.reports_v2.b.q qVar, final com.waze.reports_v2.b.at atVar, com.waze.reports_v2.b.i iVar) {
        String strC;
        String strC2;
        h.g.b.x.f(qVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(atVar, "subtype");
        boolean z = iVar instanceof com.waze.reports_v2.b.g;
        if (z) {
            strC = this.f35027b.c(R.string.REPORT_MENU_V2_CLOSURE_REPORT_REPORTED_TITLE, new Object[0]);
        } else {
            if (!(iVar instanceof com.waze.reports_v2.b.h) && iVar != null) {
                throw new h.i();
            }
            strC = this.f35027b.c(R.string.REPORT_MENU_V2_THANKS_FOR_REPORTING_TITLE, new Object[0]);
        }
        if (z) {
            com.waze.reports_v2.b.s sVarC = ((com.waze.reports_v2.b.g) iVar).c();
            com.waze.reports_v2.b.s sVar = com.waze.reports_v2.b.s.f34126a;
            int iOrdinal = sVarC.ordinal();
            if (iOrdinal == 0) {
                strC2 = this.f35027b.c(R.string.REPORT_MENU_V2_CLOSURE_REPORT_REPORTED_AHEAD_SUBTITLE, new Object[0]);
            } else {
                if (iOrdinal != 1) {
                    throw new h.i();
                }
                strC2 = this.f35027b.c(R.string.REPORT_MENU_V2_CLOSURE_REPORT_REPORTED_BEHIND_SUBTITLE, new Object[0]);
            }
        } else {
            if (!(iVar instanceof com.waze.reports_v2.b.h) && iVar != null) {
                throw new h.i();
            }
            strC2 = this.f35027b.c(R.string.REPORT_MENU_V2_THANKS_FOR_REPORTING_MESSAGE, new Object[0]);
        }
        h(g(strC, strC2, Integer.valueOf(R.drawable.icon_report_check)), new h.g.a.a() { // from class: com.waze.reports_v2.presentation.de
            @Override // h.g.a.a
            public final Object invoke() {
                return dg.e(this.f35020a, qVar, atVar);
            }
        });
    }

    @Override // com.waze.reports_v2.presentation.dc
    public final void c() {
        h(g(this.f35027b.c(R.string.REPORT_MENU_V2_SEND_REPORT_FAILED_TITLE, new Object[0]), null, Integer.valueOf(R.drawable.icon_report_error)), new com.waze.navigate.dc(8));
    }

    @Override // com.waze.reports_v2.presentation.dc
    public final void d(ea eaVar) {
        h.g.b.x.f(eaVar, "error");
        this.f35026a.b(new com.waze.app_nav.hub.b.k("REPORT_FLOW_ERROR", null, new gp(new df(this, eaVar, 0), 19), 6));
    }
}
