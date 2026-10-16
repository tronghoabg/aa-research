package com.waze.an.a.a;

import com.waze.R;
import com.waze.asks.WazeAsksNativeManager;
import com.waze.config.ConfigValues;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f14334a;

    /* renamed from: b, reason: collision with root package name */
    private final WazeAsksNativeManager f14335b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.reports_v2.b.aq f14336c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.an.d.f f14337d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14338e;

    public ac(com.waze.shared_infra.o.a aVar, WazeAsksNativeManager wazeAsksNativeManager, com.waze.reports_v2.b.aq aqVar, z zVar, com.waze.an.d.f fVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(wazeAsksNativeManager, "nativeManager");
        h.g.b.x.f(aqVar, "reportPointsProvider");
        h.g.b.x.f(zVar, "config");
        h.g.b.x.f(fVar, "wazeAsksThankYouService");
        h.g.b.x.f(eVar, "logger");
        this.f14334a = aVar;
        this.f14335b = wazeAsksNativeManager;
        this.f14336c = aqVar;
        this.f14337d = fVar;
        this.f14338e = eVar;
    }

    public static /* synthetic */ h.ab b(ac acVar, com.waze.asks.au auVar, com.waze.asks.j jVar, com.waze.an.a.u uVar, h.g.a.l lVar) {
        acVar.e(auVar, jVar, uVar, lVar);
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab c(ac acVar, com.waze.asks.au auVar, com.waze.asks.j jVar, com.waze.an.a.u uVar, h.g.a.l lVar) {
        acVar.e(auVar, jVar, uVar, lVar);
        return h.ab.f48028a;
    }

    static final h.ab d(ac acVar, com.waze.asks.av avVar) {
        acVar.f14335b.onQuestionShown(avVar);
        return h.ab.f48028a;
    }

    private final void e(com.waze.asks.au auVar, com.waze.asks.j jVar, com.waze.an.a.u uVar, h.g.a.l lVar) {
        lVar.invoke(uVar);
        this.f14337d.a(new com.waze.an.a.u(String.valueOf(uVar.c()).concat("_thank_you"), com.waze.an.a.ae.m));
        int iA = jVar.a();
        if (iA > 0) {
            this.f14336c.b(new com.waze.reports_v2.b.ap(iA, com.waze.reports_v2.b.ab.f34011c));
        }
        this.f14335b.sendMultiAskAnswer(auVar, jVar);
    }

    public final com.waze.an.a.l a(com.waze.asks.av avVar, h.g.a.l lVar, h.g.a.l lVar2) {
        int i2;
        ArrayList arrayList;
        com.waze.asks.au auVar;
        com.waze.an.a.i iVar;
        ac acVar = this;
        h.g.a.l lVar3 = lVar2;
        h.g.b.x.f(avVar, "question");
        h.g.b.x.f(lVar, "addDescriptor");
        h.g.b.x.f(lVar3, "removeDescriptor");
        byte[] bArr = null;
        if (avVar instanceof com.waze.asks.au) {
            Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_WAZE_ASKS_MULTI_ENABLED.b();
            h.g.b.x.e(boolB, "getValue(...)");
            if (boolB.booleanValue()) {
                Boolean boolB2 = ConfigValues.CONFIG_VALUE_REPORTING_WAZE_ASKS_NEW_INFRA_ENABLED.b();
                h.g.b.x.e(boolB2, "getValue(...)");
                if (boolB2.booleanValue()) {
                    com.waze.asks.au auVar2 = (com.waze.asks.au) avVar;
                    com.waze.an.a.u uVar = new com.waze.an.a.u(auVar2.e(), com.waze.an.a.ae.m);
                    com.waze.asks.l lVarA = auVar2.a();
                    com.waze.asks.k kVar = com.waze.asks.k.f15610a;
                    int iOrdinal = lVarA.ordinal();
                    int i3 = 1;
                    if (iOrdinal == 0) {
                        i2 = R.string.MULTI_ASKS_ALERT_CAR_ON_SHOULDER_NEAR_LANE_TITLE;
                    } else if (iOrdinal == 1) {
                        i2 = R.string.MULTI_ASKS_ALERT_CAR_ON_SHOULDER_CLEARLY_MARKED_TITLE;
                    } else {
                        if (iOrdinal != 2) {
                            throw new h.i();
                        }
                        i2 = R.string.MULTI_ASKS_ALERT_CAR_ON_SHOULDER_PEOPLE_AROUND_TITLE;
                    }
                    com.waze.shared_infra.o.a aVar = acVar.f14334a;
                    String strC = aVar.c(i2, new Object[0]);
                    h.o.c cVar = h.o.a.f48264a;
                    Long lB = ConfigValues.CONFIG_VALUE_REPORTING_WAZE_ASKS_QUESTION_TIMEOUT_SECONDS.b();
                    h.g.b.x.e(lB, "getValue(...)");
                    long j2 = h.o.c.j(lB.longValue(), h.o.d.f48273d);
                    List<com.waze.asks.j> listB = auVar2.b();
                    ArrayList arrayList2 = new ArrayList(h.a.i.q(listB, 10));
                    for (com.waze.asks.j jVar : listB) {
                        int iOrdinal2 = jVar.b().ordinal();
                        if (iOrdinal2 == 0) {
                            arrayList = arrayList2;
                            auVar = auVar2;
                            acVar = this;
                            lVar3 = lVar2;
                            iVar = new com.waze.an.a.i(aVar.c(R.string.MULTI_ASKS_ALERT_YES_BUTTON, new Object[0]), new com.waze.z.a.d.y(acVar, auVar, jVar, uVar, lVar3, 2), com.waze.an.a.c.f14570b, null, null);
                        } else {
                            if (iOrdinal2 != i3) {
                                throw new h.i();
                            }
                            arrayList = arrayList2;
                            auVar = auVar2;
                            iVar = new com.waze.an.a.i(aVar.c(R.string.MULTI_ASKS_ALERT_NO_BUTTON, new Object[0]), new com.waze.z.a.d.y(acVar, auVar, jVar, uVar, lVar3, 3), com.waze.an.a.c.f14570b, null, null);
                            acVar = this;
                            lVar3 = lVar2;
                        }
                        arrayList.add(iVar);
                        auVar2 = auVar;
                        arrayList2 = arrayList;
                        i3 = 1;
                    }
                    ab abVar = new ab(strC, j2, arrayList2);
                    String strB = abVar.b();
                    long jA = abVar.a();
                    List listC = abVar.c();
                    acVar.f14338e.a("got question, data: title: " + strB + ", timeoutDuration: " + h.o.a.y(jA) + ", actionList: " + listC);
                    int i4 = 20;
                    return new bh(uVar, new com.waze.app_nav.hub.c.h(avVar, i4), new aa(acVar, avVar, 0), new u(lVar3, uVar, 3), new u(lVar3, uVar, 4), new com.waze.car_lib.ar(lVar3, uVar, 19, bArr), new com.waze.ab.z(1), new com.waze.an.a.k(strB, null, null, new com.waze.an.a.j(jA, new com.waze.car_lib.ar(lVar3, uVar, i4, bArr), null), listC));
                }
            }
            acVar.f14338e.g("a required feature flag is disabled, return null");
        }
        return null;
    }
}
