package com.waze.c.e.a;

import com.waze.R;
import com.waze.c.d.ao;
import com.waze.c.d.ap;
import com.waze.c.d.aq;
import com.waze.c.d.as;
import com.waze.jni.protos.map.AnimationParams;
import com.waze.jni.protos.map.EventsOnRoute;
import com.waze.jni.protos.map.ExtendedRouteData;
import com.waze.jni.protos.map.RouteOption;
import com.waze.map.aw;
import com.waze.map.b.bi;
import com.waze.map.b.ca;
import com.waze.map.b.dn;
import com.waze.map.b.dq;
import com.waze.map.b.dx;
import com.waze.map.ba;
import com.waze.map.bb;
import com.waze.map.bc;
import com.waze.modules.c.ar;
import com.waze.modules.c.bf;
import com.waze.modules.c.bq;
import com.waze.modules.c.br;
import com.waze.modules.c.by;
import com.waze.modules.c.cu;
import com.waze.modules.c.eb;
import com.waze.modules.navigation.ak;
import com.waze.strings.DisplayStrings;
import h.g.b.x;
import i.b.l.rp;
import i.b.l.rq;
import i.b.l.sk;
import i.b.l.sl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.c.d f18482a;

    /* renamed from: b, reason: collision with root package name */
    private final as f18483b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f18484c;

    public u(com.waze.map.c.d dVar, as asVar, com.waze.shared_infra.q.e eVar) {
        x.f(dVar, "mapMarkerCreator");
        x.f(asVar, "alternativeRoutesMapEtaLabelCalculator");
        x.f(eVar, "wazeClock");
        this.f18482a = dVar;
        this.f18483b = asVar;
        this.f18484c = eVar;
    }

    public final bi a(ak akVar, List list, boolean z, Map map, long j2, long j3, boolean z2, dx dxVar, int i2, boolean z3, h.g.a.l lVar) {
        ArrayList arrayListH;
        List list2;
        ArrayList arrayListH2;
        Iterator it;
        List list3;
        com.waze.ui.ac.n nVar;
        com.waze.ui.ac.k kVar;
        Iterator it2;
        com.waze.ui.ac.k kVar2;
        com.waze.ui.ac.k jVar;
        br brVarB;
        Long lB;
        Collection collection;
        sl slVarU;
        long j4 = j2;
        x.f(akVar, "destination");
        x.f(list, "rawRoutes");
        x.f(map, "labelsPositioning");
        x.f(dxVar, "mapSkinState");
        x.f(lVar, "onRouteLabelClick");
        com.waze.map.c.d dVar = this.f18482a;
        List listE = dVar.e(akVar);
        ArrayList arrayList = new ArrayList(h.a.i.q(listE, 10));
        Iterator it3 = listE.iterator();
        while (it3.hasNext()) {
            arrayList.add(com.waze.map.c.b((bc) it3.next()));
        }
        ArrayList arrayList2 = arrayList;
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                cu cuVar = (cu) h.a.i.R(((ar) it4.next()).r());
                com.waze.coroutines.b bVarB = cuVar != null ? com.waze.map.c.b(dVar.d(cuVar.b())) : null;
                if (bVarB != null) {
                    arrayList3.add(bVarB);
                }
            }
            arrayListH = arrayList3;
        } else {
            arrayListH = h.a.i.h();
        }
        h.o.c cVar = h.o.a.f48264a;
        long jI = h.o.c.i(i2, h.o.d.f48273d);
        boolean z4 = dxVar == dx.f28229b;
        if (list.size() == 1) {
            arrayListH2 = h.a.i.h();
            list2 = arrayListH;
        } else {
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                ar arVar = (ar) it5.next();
                bf bfVarE = arVar.e();
                dq dqVar = (dq) map.get(Long.valueOf((bfVarE == null || (lB = bfVarE.b()) == null) ? arVar.a() : lB.longValue()));
                h.k kVar3 = dqVar != null ? new h.k(arVar, dqVar) : null;
                if (kVar3 != null) {
                    arrayList4.add(kVar3);
                }
            }
            ArrayList arrayList5 = arrayList4;
            ArrayList arrayList6 = new ArrayList(h.a.i.q(arrayList5, 10));
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                h.k kVar4 = (h.k) it6.next();
                ar arVar2 = (ar) kVar4.a();
                dq dqVar2 = (dq) kVar4.b();
                boolean z5 = arVar2.a() == j4;
                long jA = arVar2.a();
                Iterator it7 = arVar2.q().iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        it = it6;
                        list3 = arrayListH;
                        nVar = null;
                        break;
                    }
                    eb ebVar = (eb) it7.next();
                    it = it6;
                    by byVar = ebVar instanceof by ? (by) ebVar : null;
                    if (byVar instanceof bq) {
                        jVar = new com.waze.ui.ac.j(R.string.ALT_ROUTES_V2_MAP_LABEL_DYNAMIC_TOLL_BADGE);
                        it2 = it7;
                        list3 = arrayListH;
                    } else {
                        if (byVar == null || (brVarB = com.waze.gas.a.b(byVar)) == null) {
                            it2 = it7;
                            list3 = arrayListH;
                            kVar2 = null;
                        } else {
                            it2 = it7;
                            list3 = arrayListH;
                            String strD = com.waze.shared_infra.q.m.d(brVarB.a(), brVarB.b());
                            x.e(strD, "getCurrencyString(...)");
                            kVar2 = new com.waze.ui.ac.k(R.string.ALT_ROUTES_V2_MAP_LABEL_TOLL_PS, strD);
                        }
                        jVar = kVar2;
                    }
                    if (jVar != null) {
                        nVar = jVar;
                        break;
                    }
                    it6 = it;
                    it7 = it2;
                    arrayListH = list3;
                }
                com.waze.shared_infra.h.c cVarI = com.waze.notifications.c.k.i(dqVar2.b());
                if (j3 == jA) {
                    kVar = new com.waze.ui.ac.j(R.string.ALT_ROUTES_V2_MAP_LABEL_CURRENT);
                } else {
                    com.waze.c.d.ar arVarA = this.f18483b.a(arVar2, jI);
                    if (arVarA instanceof ao) {
                        kVar = new com.waze.ui.ac.k(R.string.ALT_ROUTES_V2_MAP_LABEL_FASTER_PD, Long.valueOf(h.o.a.n(((ao) arVarA).a())));
                    } else if (arVarA instanceof ap) {
                        kVar = new com.waze.ui.ac.j(R.string.ALT_ROUTES_V2_MAP_LABEL_SIMILAR);
                    } else {
                        if (!(arVarA instanceof aq)) {
                            throw new h.i();
                        }
                        kVar = new com.waze.ui.ac.k(R.string.ALT_ROUTES_V2_MAP_LABEL_SLOWER_PD, Long.valueOf(h.o.a.n(((aq) arVarA).a())));
                    }
                }
                arrayList6.add(com.waze.map.c.a(dVar.c(new com.waze.map.c.c(cVarI, kVar, nVar, dqVar2.a(), null, null, z4, z5, z5 ? aw.f27974d : aw.f27973c, z3 ? new ba(this.f18484c.a() + 500, bb.f28380a) : null, 48)), "", new com.waze.c.d.a(lVar, arVar2, 7, null)));
                it6 = it;
                arrayListH = list3;
            }
            list2 = arrayListH;
            arrayListH2 = arrayList6;
        }
        long jA2 = this.f18484c.a();
        List<ar> list4 = list;
        List<ar> listAl = h.a.i.al(list4, new v(j4));
        ArrayList arrayList7 = new ArrayList(h.a.i.q(listAl, 10));
        for (ar arVar3 : listAl) {
            boolean z6 = arVar3.a() == j4;
            long jA3 = arVar3.a();
            ExtendedRouteData.RouteStyle.Type type = z6 ? ExtendedRouteData.RouteStyle.Type.SELECTED : ExtendedRouteData.RouteStyle.Type.NOT_SELECTED;
            RouteOption.SnailTrailBehavior snailTrailBehavior = j3 == jA3 ? RouteOption.SnailTrailBehavior.REMOVE : RouteOption.SnailTrailBehavior.KEEP;
            ExtendedRouteData.Builder builderNewBuilder = ExtendedRouteData.newBuilder();
            ExtendedRouteData.RouteStyle.Builder builderNewBuilder2 = ExtendedRouteData.RouteStyle.newBuilder();
            builderNewBuilder2.setType(type);
            builderNewBuilder.setStyle(builderNewBuilder2.build());
            RouteOption.Builder builderNewBuilder3 = RouteOption.newBuilder();
            builderNewBuilder3.setShowTraffic(true);
            builderNewBuilder3.setSnailTrailBehavior(snailTrailBehavior);
            builderNewBuilder.setOptions(builderNewBuilder3.build());
            x.e(builderNewBuilder, "setOptions(...)");
            x.f(arVar3, "<this>");
            if (x.n(arVar3.u(), sl.getDefaultInstance())) {
                sk skVarNewBuilder = sl.newBuilder();
                bf bfVarE2 = arVar3.e();
                if (bfVarE2 != null) {
                    rp rpVarNewBuilder = rq.newBuilder();
                    Long lB2 = bfVarE2.b();
                    if (lB2 != null) {
                        rpVarNewBuilder.b(lB2.longValue());
                    }
                    rpVarNewBuilder.a(bfVarE2.a());
                    rq rqVarBuild = rpVarNewBuilder.build();
                    x.e(rqVarBuild, "build(...)");
                    rq rqVar = rqVarBuild;
                    if (rqVar != null) {
                        skVarNewBuilder.h(rqVar);
                    }
                }
                skVarNewBuilder.f(arVar3.a());
                skVarNewBuilder.g(arVar3.j());
                List<com.waze.shared_infra.h.c> listO = arVar3.o();
                ArrayList arrayList8 = new ArrayList(h.a.i.q(listO, 10));
                for (com.waze.shared_infra.h.c cVar2 : listO) {
                    i.b.p pVarNewBuilder = i.b.s.newBuilder();
                    pVarNewBuilder.a(cVar2.c());
                    pVarNewBuilder.b(cVar2.d());
                    arrayList8.add(pVarNewBuilder.build());
                    arrayListH2 = arrayListH2;
                }
                collection = arrayListH2;
                skVarNewBuilder.b(arrayList8);
                skVarNewBuilder.k(h.o.a.p(arVar3.b()));
                skVarNewBuilder.j(arVar3.c());
                String strK = arVar3.k();
                if (strK != null) {
                    skVarNewBuilder.e(strK);
                }
                List listN = arVar3.n();
                ArrayList arrayList9 = new ArrayList(h.a.i.q(listN, 10));
                Iterator it8 = listN.iterator();
                while (it8.hasNext()) {
                    arrayList9.add(eb.m((com.waze.modules.c.h) it8.next()));
                }
                skVarNewBuilder.a(arrayList9);
                sl slVarBuild = skVarNewBuilder.build();
                x.e(slVarBuild, "build(...)");
                slVarU = slVarBuild;
            } else {
                slVarU = arVar3.u();
                collection = arrayListH2;
            }
            builderNewBuilder.setRouteProto(slVarU);
            if (z2 && !z6) {
                AnimationParams.Builder builderNewBuilder4 = AnimationParams.newBuilder();
                builderNewBuilder4.setCurveType(AnimationParams.CurveType.LINEAR);
                builderNewBuilder4.setAnimationStartTimeMs(jA2);
                builderNewBuilder4.setAnimationDurationMs(800L);
                builderNewBuilder.setAnimationParams(builderNewBuilder4.build());
            }
            ExtendedRouteData extendedRouteDataBuild = builderNewBuilder.build();
            x.e(extendedRouteDataBuild, "build(...)");
            arrayList7.add(extendedRouteDataBuild);
            arrayListH2 = collection;
            j4 = j2;
        }
        Collection collection2 = arrayListH2;
        ArrayList arrayList10 = arrayList7;
        ArrayList arrayList11 = new ArrayList(h.a.i.q(list4, 10));
        for (ar arVar4 : list4) {
            long jA4 = arVar4.a();
            EventsOnRoute.Builder builderNewBuilder5 = EventsOnRoute.newBuilder();
            int i3 = com.waze.trip_overview.c.f41145a;
            builderNewBuilder5.addAllEvent(com.waze.trip_overview.c.c(arVar4));
            builderNewBuilder5.setIsSelected(jA4 == j2);
            EventsOnRoute eventsOnRouteBuild = builderNewBuilder5.build();
            x.e(eventsOnRouteBuild, "build(...)");
            arrayList11.add(eventsOnRouteBuild);
        }
        return new bi(arrayList10, arrayList11, h.a.i.af(h.a.i.af(collection2, list2), arrayList2), (List) null, (List) null, new ca(true, null, false, null, null, 1022), (dn) null, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_7);
    }
}
