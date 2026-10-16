package com.waze.an.a.a;

import com.waze.R;
import com.waze.asks.WazeAsksNativeManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f14532a;

    /* renamed from: b, reason: collision with root package name */
    private final WazeAsksNativeManager f14533b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.reports_v2.b.aq f14534c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.an.e.m f14535d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.ao.a.a f14536e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14537f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.an.e.m f14538g;

    public y(com.waze.an.e.m mVar, com.waze.shared_infra.o.a aVar, WazeAsksNativeManager wazeAsksNativeManager, com.waze.reports_v2.b.aq aqVar, com.waze.an.e.m mVar2, com.waze.ao.a.a aVar2, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(wazeAsksNativeManager, "nativeManager");
        h.g.b.x.f(aqVar, "reportPointsProvider");
        h.g.b.x.f(mVar2, "wazeAsksStatSender");
        h.g.b.x.f(aVar2, "config");
        h.g.b.x.f(eVar, "logger");
        this.f14538g = mVar;
        this.f14532a = aVar;
        this.f14533b = wazeAsksNativeManager;
        this.f14534c = aqVar;
        this.f14535d = mVar2;
        this.f14536e = aVar2;
        this.f14537f = eVar;
    }

    public static /* synthetic */ h.ab b(y yVar, com.waze.asks.at atVar, com.waze.asks.f fVar, com.waze.an.a.u uVar, h.g.a.l lVar, h.g.a.l lVar2) {
        lVar2.invoke(uVar);
        com.waze.asks.h hVarA = atVar.a();
        String strC = yVar.f14532a.c(R.string.INSIGHT_FEEDBACK_ALERT_TEMPORARY_HIDDEN_TITLE, new Object[0]);
        com.waze.an.a.u uVar2 = new com.waze.an.a.u(String.valueOf(uVar.c()).concat("_hidden"), com.waze.an.a.ae.f14553i);
        com.waze.asks.g gVar = com.waze.asks.g.f15590a;
        int iOrdinal = hVarA.ordinal();
        int i2 = R.drawable.icon_insight_feedback_cam_hov_hidden;
        switch (iOrdinal) {
            case 0:
                i2 = R.drawable.icon_insight_feedback_railroad_hidden;
                break;
            case 1:
                i2 = R.drawable.icon_insight_feedback_speed_bumps_hidden;
                break;
            case 2:
                i2 = R.drawable.icon_insight_feedback_dangerous_curves_hidden;
                break;
            case 3:
                i2 = R.drawable.icon_insight_feedback_dangerous_intersection_hidden;
                break;
            case 4:
                i2 = R.drawable.icon_insight_feedback_dangerous_merge_hidden;
                break;
            case 5:
                i2 = R.drawable.icon_insight_feedback_toll_both_hidden;
                break;
            case 6:
                i2 = R.drawable.icon_insight_feedback_topes_hidden;
                break;
            case 7:
                i2 = R.drawable.icon_insight_feedback_school_zone_hidden;
                break;
            case 8:
                i2 = R.drawable.icon_insight_feedback_cam_speed_hidden;
                break;
            case 9:
                i2 = R.drawable.icon_insight_feedback_cam_red_light_hidden;
                break;
            case 10:
                i2 = R.drawable.icon_insight_feedback_cam_seat_belt_hidden;
                break;
            case 11:
                i2 = R.drawable.icon_insight_feedback_cam_phone_hidden;
                break;
            case 12:
                i2 = R.drawable.icon_insight_feedback_cam_stop_sign_hidden;
                break;
            case 13:
                i2 = R.drawable.icon_insight_feedback_cam_noise_hidden;
                break;
            case 14:
                i2 = R.drawable.icon_insight_feedback_cam_distance_between_vehicles_hidden;
                break;
            case 15:
            case 17:
                break;
            case 16:
                i2 = R.drawable.icon_insight_feedback_cam_bus_lane_hidden;
                break;
            case 18:
                i2 = R.drawable.icon_insight_feedback_traffic_light_speed_cam_hidden;
                break;
            default:
                throw new h.i();
        }
        h.p pVar = new h.p(strC, uVar2, Integer.valueOf(i2));
        yVar.l(atVar, (com.waze.an.a.u) pVar.b(), (String) pVar.a(), ((Number) pVar.c()).intValue(), false, lVar, lVar2);
        yVar.f14533b.sendFeedbackAnswer(atVar, fVar);
        yVar.f14535d.d(atVar, fVar);
        com.waze.an.e.m mVar = yVar.f14538g;
        if (mVar != null) {
            mVar.j(atVar);
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab c(y yVar, com.waze.asks.at atVar, com.waze.asks.f fVar, com.waze.an.a.u uVar, h.g.a.l lVar, h.g.a.l lVar2) {
        lVar2.invoke(uVar);
        yVar.l(atVar, new com.waze.an.a.u(String.valueOf(uVar.c()).concat("_thank_you"), com.waze.an.a.ae.f14553i), yVar.f14532a.c(R.string.INSIGHT_FEEDBACK_ALERT_THANKS_TITLE, new Object[0]), R.drawable.icon_insight_feedback_thumbs_up, true, lVar, lVar2);
        yVar.f14533b.sendFeedbackAnswer(atVar, fVar);
        int iA = fVar.a();
        if (iA > 0) {
            yVar.f14534c.b(new com.waze.reports_v2.b.ap(iA, com.waze.reports_v2.b.ab.f34011c));
        }
        yVar.f14535d.d(atVar, fVar);
        return h.ab.f48028a;
    }

    static final h.ab d(y yVar, com.waze.asks.at atVar, boolean z) {
        yVar.f14535d.c(atVar, z);
        return h.ab.f48028a;
    }

    static final h.ab e(h.g.a.l lVar, com.waze.an.a.u uVar, y yVar, com.waze.asks.av avVar) {
        lVar.invoke(uVar);
        yVar.f14535d.e(avVar, com.waze.an.e.k.f14869a);
        return h.ab.f48028a;
    }

    static final h.ab f(y yVar, com.waze.asks.av avVar) {
        yVar.f14535d.f(avVar);
        yVar.f14533b.onQuestionShown(avVar);
        return h.ab.f48028a;
    }

    static final h.ab g(y yVar, com.waze.asks.av avVar, h.g.a.l lVar, com.waze.an.a.u uVar, com.waze.an.a.u uVar2) {
        h.g.b.x.f(uVar2, "it");
        yVar.f14535d.e(avVar, com.waze.an.e.k.f14870b);
        lVar.invoke(uVar);
        return h.ab.f48028a;
    }

    static final h.ab h(y yVar, com.waze.asks.av avVar, h.g.a.l lVar, com.waze.an.a.u uVar) {
        yVar.f14535d.g(avVar);
        lVar.invoke(uVar);
        return h.ab.f48028a;
    }

    static final boolean i(y yVar) {
        return yVar.f14536e.d();
    }

    static final boolean j(com.waze.asks.at atVar, com.waze.location.q qVar) {
        return m(qVar, atVar);
    }

    static final boolean k(com.waze.asks.av avVar, com.waze.location.q qVar) {
        return m(qVar, (com.waze.asks.at) avVar);
    }

    private final void l(final com.waze.asks.at atVar, com.waze.an.a.u uVar, String str, int i2, final boolean z, h.g.a.l lVar, h.g.a.l lVar2) {
        lVar.invoke(new bh(uVar, new q(atVar, 1), new h.g.a.a() { // from class: com.waze.an.a.a.t
            @Override // h.g.a.a
            public final Object invoke() {
                return y.d(this.f14510a, atVar, z);
            }
        }, new u(lVar2, uVar, 0), new u(lVar2, uVar, 2), new com.waze.z.a.d.b(19), new com.waze.z.a.d.b(20), new com.waze.an.a.k(str, null, Integer.valueOf(i2), new com.waze.an.a.j(this.f14536e.a(), new com.waze.car_lib.ar(lVar2, uVar, 18, null), null), h.a.i.h())));
    }

    private static final boolean m(com.waze.location.q qVar, com.waze.asks.at atVar) {
        com.waze.asks.p pVarB = atVar.b();
        if (!(pVarB instanceof com.waze.asks.n)) {
            if (pVarB instanceof com.waze.asks.o) {
                return false;
            }
            throw new h.i();
        }
        if (qVar instanceof com.waze.an.a.s) {
            com.waze.an.a.s sVar = (com.waze.an.a.s) qVar;
            return (h.g.b.x.n(sVar.b().b(), ((com.waze.asks.n) atVar.b()).b()) && h.g.b.x.n(sVar.b().a(), ((com.waze.asks.n) atVar.b()).a())) ? false : true;
        }
        return true;
    }

    public final com.waze.an.a.l a(final com.waze.asks.av avVar, h.g.a.l lVar, final h.g.a.l lVar2) {
        ArrayList arrayList;
        com.waze.an.a.i iVar;
        y yVar = this;
        h.g.a.l lVar3 = lVar2;
        h.g.b.x.f(avVar, "question");
        h.g.a.l lVar4 = lVar;
        h.g.b.x.f(lVar4, "addDescriptor");
        h.g.b.x.f(lVar3, "removeDescriptor");
        if (!(avVar instanceof com.waze.asks.at)) {
            return null;
        }
        com.waze.ao.a.a aVar = yVar.f14536e;
        if (aVar.e()) {
            yVar.f14537f.g("a required Feature flags is disabled, return null");
            return null;
        }
        com.waze.asks.at atVar = (com.waze.asks.at) avVar;
        final com.waze.an.a.u uVar = new com.waze.an.a.u(atVar.e(), com.waze.an.a.ae.f14553i);
        com.waze.ao.b.g gVarG = com.waze.ab.a.l.g(atVar.a());
        int iA = gVarG.a();
        int iB = gVarG.b();
        com.waze.shared_infra.o.a aVar2 = yVar.f14532a;
        int i2 = 0;
        int i3 = 1;
        String strC = aVar2.c(R.string.INSIGHT_FEEDBACK_ALERT_TITLE_PS, aVar2.c(iA, new Object[0]));
        long jB = aVar.b();
        List<com.waze.asks.f> listG = atVar.g();
        ArrayList arrayList2 = new ArrayList(h.a.i.q(listG, 10));
        for (com.waze.asks.f fVar : listG) {
            com.waze.asks.g gVarB = fVar.b();
            com.waze.asks.g gVar = com.waze.asks.g.f15590a;
            int iOrdinal = gVarB.ordinal();
            if (iOrdinal == 0) {
                arrayList = arrayList2;
                yVar = this;
                iVar = new com.waze.an.a.i(aVar2.c(R.string.INSIGHT_FEEDBACK_ALERT_YES_BUTTON, new Object[0]), new v(yVar, atVar, fVar, uVar, lVar, lVar2, 1), com.waze.an.a.c.f14570b, null, null);
            } else {
                if (iOrdinal != i3) {
                    throw new h.i();
                }
                arrayList = arrayList2;
                iVar = new com.waze.an.a.i(aVar2.c(R.string.INSIGHT_FEEDBACK_ALERT_NO_BUTTON, new Object[0]), new v(yVar, atVar, fVar, uVar, lVar4, lVar3, 0), com.waze.an.a.c.f14570b, null, null);
                yVar = this;
            }
            arrayList.add(iVar);
            lVar4 = lVar;
            lVar3 = lVar2;
            arrayList2 = arrayList;
            i3 = 1;
        }
        x xVar = new x(strC, iB, jB, arrayList2);
        String strC2 = xVar.c();
        int iA2 = xVar.a();
        long jB2 = xVar.b();
        List listD = xVar.d();
        yVar.f14537f.a("got question, data: title: " + strC2 + ", timeoutDuration: " + h.o.a.y(jB2) + ", actionList: " + listD);
        final y yVar2 = yVar;
        return new bh(new com.waze.app_nav.hub.c.h(avVar, 19), uVar, new q(avVar, i2), new aa(yVar2, avVar, 1), new h.g.a.l() { // from class: com.waze.an.a.a.r
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return y.g(this.f14505a, avVar, lVar2, uVar, (com.waze.an.a.u) obj);
            }
        }, new u(lVar2, uVar, 1), new w(yVar2, avVar, lVar2, uVar, 1), new h.g.a.a() { // from class: com.waze.an.a.a.s
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(y.i(this.f14509a));
            }
        }, new com.waze.an.a.k(strC2, null, Integer.valueOf(iA2), new com.waze.an.a.j(jB2, new w(lVar2, uVar, yVar2, avVar, 0), null), listD));
    }
}
