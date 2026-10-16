package com.waze.car_lib.r;

import android.os.Parcelable;
import androidx.car.app.CarContext;
import androidx.core.app.NotificationCompat;
import com.waze.R;
import com.waze.reports_v2.c.Cdo;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dl {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.b.br f21399a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21400b;

    /* renamed from: c, reason: collision with root package name */
    private final Cdo f21401c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.alerters.a f21402d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.reports_v2.e f21403e;

    /* renamed from: f, reason: collision with root package name */
    private final de f21404f;

    /* renamed from: g, reason: collision with root package name */
    private final u f21405g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.reports_v2.c.bw f21406h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.reports_v2.c.br f21407i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f21408j;

    /* renamed from: k, reason: collision with root package name */
    private List f21409k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f21410l;

    public dl(com.waze.car_lib.b.br brVar, com.waze.shared_infra.o.a aVar, Cdo cdo, com.waze.alerters.a aVar2, com.waze.reports_v2.e eVar, de deVar, u uVar, com.waze.reports_v2.c.bw bwVar, com.waze.reports_v2.c.br brVar2) {
        h.g.b.x.f(brVar, "controller");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(cdo, "statsSender");
        h.g.b.x.f(aVar2, "alerterConfig");
        h.g.b.x.f(eVar, "conversationalModeProvider");
        h.g.b.x.f(deVar, "reportAgentViewModel");
        h.g.b.x.f(uVar, "conversationalReportingViewModel");
        h.g.b.x.f(bwVar, "userConsent");
        h.g.b.x.f(brVar2, "conversationalReportingOnboardingController");
        this.f21399a = brVar;
        this.f21400b = aVar;
        this.f21401c = cdo;
        this.f21402d = aVar2;
        this.f21403e = eVar;
        this.f21404f = deVar;
        this.f21405g = uVar;
        this.f21406h = bwVar;
        this.f21407i = brVar2;
        h.g.b.x.e(com.waze.shared_infra.i.a.d("ReportAlertViewModel"), "create(...)");
        this.f21408j = kotlinx.coroutines.b.ck.b(false);
        this.f21409k = h.a.i.h();
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(new dg(aVar.c(R.string.AAOS_UGC_REPORTS_TITLE, new Object[0])));
        this.f21410l = bnVarB;
        kotlinx.coroutines.b.ai.U(bnVarB);
    }

    public static final /* synthetic */ com.waze.car_lib.b.a.b b(dl dlVar) {
        return new com.waze.car_lib.b.a.b("CONVERSATION_ONBOARDING", dlVar.f21400b.c(R.string.CONVERSATIONAL_REPORTING_IDLE_OB_FLOW_BUTTON, new Object[0]), R.drawable.icon_report_conversational_cancel_vector);
    }

    public static final /* synthetic */ com.waze.car_lib.b.a.b c(dl dlVar, com.waze.reports_v2.b.q qVar) {
        com.waze.reports_v2.c.cb cbVar = com.waze.reports_v2.c.cb.f34317a;
        Parcelable.Creator<com.waze.reports_v2.b.q> creator = com.waze.reports_v2.b.q.CREATOR;
        switch (qVar.ordinal()) {
            case 0:
                return new com.waze.car_lib.b.a.b(qVar.name(), dlVar.f21400b.c(R.string.REPORT_MENU_V2_TRAFFIC_REPORT_LABEL, new Object[0]), R.drawable.icon_report_traffic_vector);
            case 1:
                return new com.waze.car_lib.b.a.b(qVar.name(), dlVar.f21400b.c(R.string.REPORT_MENU_V2_POLICE_REPORT_LABEL, new Object[0]), R.drawable.icon_report_police_vector);
            case 2:
                return new com.waze.car_lib.b.a.b(qVar.name(), dlVar.f21400b.c(R.string.REPORT_MENU_V2_CRASH_REPORT_LABEL, new Object[0]), R.drawable.icon_report_accident_vector);
            case 3:
                return new com.waze.car_lib.b.a.b(qVar.name(), dlVar.f21400b.c(R.string.REPORT_MENU_V2_HAZARD_ON_ROAD_REPORT_LABEL, new Object[0]), R.drawable.icon_report_hazard_vector);
            case 4:
                return new com.waze.car_lib.b.a.b(qVar.name(), dlVar.f21400b.c(R.string.REPORT_MENU_V2_BAD_WEATHER_REPORT_LABEL, new Object[0]), R.drawable.icon_report_weather_vector);
            case 5:
                return new com.waze.car_lib.b.a.b(qVar.name(), dlVar.f21400b.c(R.string.REPORT_MENU_V2_BLOCKED_LANES_REPORT_LABEL, new Object[0]), true != dlVar.f21402d.a() ? R.drawable.icon_report_blocked_lane_vector : R.drawable.icon_report_blocked_lane_vector_with_lane);
            case 6:
                return new com.waze.car_lib.b.a.b(qVar.name(), dlVar.f21400b.c(R.string.MAP_ISSUE, new Object[0]), R.drawable.car_report_menu_mapissue);
            case 7:
                return new com.waze.car_lib.b.a.b(qVar.name(), dlVar.f21400b.c(R.string.AAOS_UGC_REPORTS_DEBUG_ITEM_TITLE, new Object[0]), R.drawable.icon_report_debug);
            case 8:
                return new com.waze.car_lib.b.a.b(qVar.name(), dlVar.f21400b.c(R.string.REPORT_MENU_V2_CLOSURE_REPORT_LABEL, new Object[0]), R.drawable.icon_report_closure_vector);
            case 9:
                String strC = dlVar.f21400b.c(R.string.REPORT_MENU_V2_PERSONAL_SAFETY_REPORT_LABEL, new Object[0]);
                com.waze.alerters.a aVar = dlVar.f21402d;
                h.g.b.x.f(aVar, "<this>");
                return new com.waze.car_lib.b.a.b(qVar.name(), strC, true != aVar.b() ? R.drawable.icon_alerter_personal_safety_b : R.drawable.icon_alerter_personal_safety_a);
            case 10:
                return new com.waze.car_lib.b.a.b(qVar.name(), dlVar.f21400b.c(R.string.REPORT_MENU_V2_ANIMAL_REPORT_LABEL, new Object[0]), R.drawable.icon_report_animal_vector);
            default:
                throw new h.i();
        }
    }

    public static final /* synthetic */ com.waze.car_lib.b.a.b s(dl dlVar, com.waze.alerters.a.k kVar) {
        String strC;
        if ((kVar instanceof com.waze.car_lib.b.bj) || (kVar instanceof com.waze.car_lib.b.bl)) {
            return dlVar.u();
        }
        if (kVar instanceof com.waze.car_lib.b.bi) {
            return dlVar.u();
        }
        if (kVar instanceof com.waze.car_lib.b.bf) {
            com.waze.shared_infra.o.a aVar = dlVar.f21400b;
            return new com.waze.car_lib.b.a.b("CONVERSATIONAL", aVar.c(R.string.CONVERSATIONAL_REPORTING_IN_CAR_CANCEL_GENERIC_MENU_TITLE, new Object[0]), aVar.c(R.string.CONVERSATIONAL_REPORTING_IN_CAR_CANCEL_GENERIC_MENU_SUBTITLE, new Object[0]), R.drawable.icon_report_conversational_cancel_vector);
        }
        if (kVar instanceof com.waze.car_lib.b.bg) {
            com.waze.car_lib.b.bt btVarF = ((com.waze.car_lib.b.bg) kVar).f();
            com.waze.shared_infra.o.a aVar2 = dlVar.f21400b;
            com.waze.car_lib.b.bt btVar = com.waze.car_lib.b.bt.f19066b;
            return new com.waze.car_lib.b.a.b("CONVERSATIONAL", aVar2.c(btVarF == btVar ? R.string.CONVERSATIONAL_REPORTING_IN_CAR_ERROR_MUTE_ALERTER_TITLE : R.string.CONVERSATIONAL_REPORTING_IN_CAR_ERROR_GENERIC_MENU_TITLE, new Object[0]), btVarF != btVar ? aVar2.c(R.string.CONVERSATIONAL_REPORTING_IN_CAR_ERROR_GENERIC_MENU_SUBTITLE, new Object[0]) : null, btVarF == btVar ? R.drawable.sound_off_fill : R.drawable.icon_report_conversational_error_vector);
        }
        if (!(kVar instanceof com.waze.car_lib.b.bh)) {
            if ((kVar instanceof com.waze.car_lib.b.bm) || (kVar instanceof com.waze.car_lib.b.bk)) {
                return new com.waze.car_lib.b.a.b("CONVERSATIONAL", dlVar.f21400b.c(R.string.CONVERSATIONAL_REPORTING_IN_CAR_MENU_PROCESSING, new Object[0]), null, R.drawable.icon_report_conversational_processing_vector);
            }
            throw new h.i();
        }
        com.waze.reports_v2.c.cb cbVarF = ((com.waze.car_lib.b.bh) kVar).f();
        com.waze.reports_v2.c.cb cbVar = com.waze.reports_v2.c.cb.f34317a;
        Parcelable.Creator<com.waze.reports_v2.b.q> creator = com.waze.reports_v2.b.q.CREATOR;
        int iOrdinal = cbVarF.ordinal();
        if (iOrdinal == 0) {
            strC = dlVar.f21400b.c(R.string.CONVERSATIONAL_REPORTING_REPORT_MENU_FTE_HINT_A, new Object[0]);
        } else if (iOrdinal == 1) {
            strC = dlVar.f21400b.c(R.string.CONVERSATIONAL_REPORTING_REPORT_MENU_FTE_HINT_B, new Object[0]);
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            strC = dlVar.f21400b.c(R.string.CONVERSATIONAL_REPORTING_REPORT_MENU_FTE_HINT_C, new Object[0]);
        }
        return new com.waze.car_lib.b.a.b("CONVERSATIONAL", strC, null, R.drawable.icon_report_conversational_listening_vector);
    }

    private final com.waze.car_lib.b.a.b u() {
        com.waze.shared_infra.o.a aVar = this.f21400b;
        return new com.waze.car_lib.b.a.b("CONVERSATIONAL", aVar.c(R.string.CONVERSATIONAL_REPORTING_IN_CAR_MENU_LISTENING, new Object[0]), aVar.c(R.string.CONVERSATIONAL_REPORTING_IN_CAR_MENU_LISTENING_SUBTITLE, new Object[0]), R.drawable.icon_report_conversational_listening_vector);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.reports_v2.d v() {
        com.waze.reports_v2.c.bw bwVar = this.f21406h;
        com.waze.reports_v2.d dVarB = this.f21403e.b();
        if (!bwVar.a().c() && !this.f21407i.b()) {
            dVarB = null;
        }
        return dVarB == null ? com.waze.reports_v2.b.f34001a : dVarB;
    }

    public final com.waze.reports_v2.b.ag g(com.waze.reports_v2.b.q qVar) {
        Object next;
        h.g.b.x.f(qVar, "categoryGroup");
        Iterator it = this.f21409k.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((com.waze.reports_v2.b.ag) next).g() == qVar) {
                break;
            }
        }
        return (com.waze.reports_v2.b.ag) next;
    }

    public final kotlinx.coroutines.b.k l(kotlinx.coroutines.af afVar, CarContext carContext) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(carContext, "carContext");
        boolean z = !this.f21407i.b();
        kotlinx.coroutines.b.bn bnVar = this.f21408j;
        bnVar.e(Boolean.valueOf(z));
        kotlinx.coroutines.b.bn bnVar2 = bnVar;
        kotlinx.coroutines.b.k kVarR = kotlinx.coroutines.b.ai.R(bnVar2, new dh(null, this, carContext));
        kotlinx.coroutines.b.k kVarR2 = kotlinx.coroutines.b.ai.R(bnVar2, new di(null, this, afVar, carContext));
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(new dg(this.f21400b.c(R.string.AAOS_UGC_REPORTS_TITLE, new Object[0])));
        kotlinx.coroutines.b.k kVarR3 = kotlinx.coroutines.b.ai.r(bnVarB, kVarR, kVarR2, new dk(this, null));
        kotlinx.coroutines.aj.z(afVar, null, null, new dj(this, bnVarB, null), 3);
        return kVarR3;
    }

    public final void n() {
        com.waze.reports_v2.d dVarV = v();
        if (h.g.b.x.n(dVarV, com.waze.reports_v2.b.f34001a)) {
            return;
        }
        if (dVarV instanceof com.waze.reports_v2.a) {
            this.f21405g.l(new com.waze.car_lib.b.aw(com.waze.car_lib.b.bs.f19059a));
        } else {
            if (!(dVarV instanceof com.waze.reports_v2.c)) {
                throw new h.i();
            }
            this.f21404f.k(cu.f21233b);
        }
    }

    public final void o() {
        com.waze.reports_v2.e eVar = this.f21403e;
        com.waze.reports_v2.c.s sVarA = eVar.b().a();
        if (!sVarA.m()) {
            sVarA.f(true);
        }
        this.f21408j.e(true);
        if (eVar.a() instanceof com.waze.reports_v2.a) {
            t(com.waze.car_lib.b.ax.f19004a);
        }
    }

    public final void p() {
        com.waze.reports_v2.d dVarV = v();
        if (h.g.b.x.n(dVarV, com.waze.reports_v2.b.f34001a)) {
            return;
        }
        if (dVarV instanceof com.waze.reports_v2.a) {
            this.f21405g.l(new com.waze.car_lib.b.aw(com.waze.car_lib.b.bs.f19062d));
        } else {
            if (!(dVarV instanceof com.waze.reports_v2.c)) {
                throw new h.i();
            }
            this.f21404f.k(cu.f21233b);
        }
    }

    public final void q() {
        this.f21404f.k(cu.f21232a);
    }

    public final void r() {
        u uVar = this.f21405g;
        com.waze.alerters.a.k kVar = (com.waze.alerters.a.k) uVar.i().d();
        if (kVar != null) {
            h.g.b.x.f(kVar, "<this>");
            if (!(kVar instanceof com.waze.car_lib.b.bm) && !(kVar instanceof com.waze.car_lib.b.bf) && !(kVar instanceof com.waze.car_lib.b.bg) && !(kVar instanceof com.waze.car_lib.b.bi)) {
                if (!(kVar instanceof com.waze.car_lib.b.bj) && !(kVar instanceof com.waze.car_lib.b.bk) && !(kVar instanceof com.waze.car_lib.b.bh) && !(kVar instanceof com.waze.car_lib.b.bl)) {
                    throw new h.i();
                }
                uVar.l(new com.waze.car_lib.b.aw(com.waze.car_lib.b.bs.f19059a));
                return;
            }
        }
        if (uVar.i().d() instanceof com.waze.car_lib.b.bm) {
            return;
        }
        uVar.l(com.waze.car_lib.b.bb.f19023a);
    }

    public final void t(com.waze.ads.c.e eVar) {
        h.g.b.x.f(eVar, NotificationCompat.CATEGORY_EVENT);
        this.f21405g.l(eVar);
    }
}
