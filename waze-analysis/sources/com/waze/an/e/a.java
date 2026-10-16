package com.waze.an.e;

import com.waze.ab.ab;
import com.waze.an.c.w;
import com.waze.sharedui.utils.o;
import com.waze.sharedui.web.as;
import com.waze.stats.ax;
import com.waze.ui.l.ad;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import l.a.adg;
import l.a.adh;
import l.a.adj;
import l.a.adp;
import l.a.adr;
import l.a.ads;
import l.a.aep;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final ax f14859a;

    public a(ax axVar) {
        x.f(axVar, "statsReporter");
        this.f14859a = axVar;
    }

    private final void i(com.waze.an.c.k kVar, ad adVar, adg adgVar) {
        as asVarD = e.c.h.d(aep.newBuilder());
        adh adhVarNewBuilder = adj.newBuilder();
        x.f(adhVarNewBuilder, "builder");
        x.f(adgVar, "value");
        adhVarNewBuilder.a(adgVar);
        adp adpVarI = ab.i(this, kVar, adVar);
        x.f(adpVarI, "value");
        adhVarNewBuilder.b(adpVarI);
        adj adjVarBuild = adhVarNewBuilder.build();
        x.e(adjVarBuild, "build(...)");
        asVarD.y(adjVarBuild);
        o.u(this.f14859a, asVarD.x());
    }

    public final void a(com.waze.an.c.k kVar, ad adVar) {
        x.f(kVar, "insightStateHolder");
        x.f(adVar, "insightCardState");
        i(kVar, adVar, adg.BACK_CLICK);
    }

    public final void b(com.waze.an.c.k kVar, ad adVar) {
        x.f(kVar, "insightStateHolder");
        x.f(adVar, "insightCardState");
        i(kVar, adVar, adg.CLOSE);
    }

    public final void c(com.waze.an.c.k kVar, ad adVar) {
        x.f(kVar, "insightStateHolder");
        x.f(adVar, "insightCardState");
        i(kVar, adVar, adg.EMPTY_MAP_CLICK);
    }

    public final void d(com.waze.an.c.k kVar, ad adVar) {
        x.f(kVar, "insightStateHolder");
        x.f(adVar, "insightCardState");
        i(kVar, adVar, adg.GENERAL_CARD_TAP);
    }

    public final void e(List list, List list2) {
        x.f(list, "lastReportedResults");
        x.f(list2, "changedMappedResults");
        List<w> list3 = list;
        ArrayList arrayList = new ArrayList(h.a.i.q(list3, 10));
        for (w wVar : list3) {
            arrayList.add(ab.i(this, wVar.a(), wVar.b()));
        }
        ArrayList arrayList2 = arrayList;
        List<w> list4 = list2;
        ArrayList arrayList3 = new ArrayList(h.a.i.q(list4, 10));
        for (w wVar2 : list4) {
            arrayList3.add(ab.i(this, wVar2.a(), wVar2.b()));
        }
        ax axVar = this.f14859a;
        as asVarD = e.c.h.d(aep.newBuilder());
        adr adrVarNewBuilder = ads.newBuilder();
        adrVarNewBuilder.a(arrayList2);
        adrVarNewBuilder.b(arrayList3);
        ads adsVarBuild = adrVarNewBuilder.build();
        x.e(adsVarBuild, "build(...)");
        asVarD.z(adsVarBuild);
        o.u(axVar, asVarD.x());
    }

    public final void f(com.waze.an.c.k kVar, ad adVar) {
        x.f(kVar, "insightStateHolder");
        x.f(adVar, "insightCardState");
        i(kVar, adVar, adg.TIMEOUT);
    }

    public final void g(com.waze.an.c.k kVar, ad adVar) {
        x.f(kVar, "insightStateHolder");
        x.f(adVar, "insightCardState");
        i(kVar, adVar, adg.PRIMARY_BUTTON);
    }

    public final void h(com.waze.an.c.k kVar, ad adVar) {
        x.f(kVar, "insightStateHolder");
        x.f(adVar, "insightCardState");
        i(kVar, adVar, adg.SECONDARY_BUTTON);
    }
}
