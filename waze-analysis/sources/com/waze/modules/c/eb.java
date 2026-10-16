package com.waze.modules.c;

import androidx.camera.video.AudioStats;
import com.waze.gw.Gateway;
import com.waze.jni.protos.navigate.PolylineGeometry;
import com.waze.navigate.et;
import i.b.l.og;
import i.b.l.ps;
import i.b.l.pw;
import i.b.l.qg;
import i.b.l.qo;
import i.b.l.qq;
import i.b.l.re;
import i.b.l.rf;
import i.b.l.sl;
import i.b.l.ss;
import i.b.l.su;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class eb {
    public /* synthetic */ eb(byte[] bArr) {
    }

    private static ar a(sl slVar, com.waze.map.d dVar, ao aoVar) {
        if (!slVar.hasHovRouteInfo() || !slVar.getHovRouteInfo().hasNormalRouteAltId()) {
            sl slVarB = aoVar.b(slVar.getAltId());
            return h(slVar, dVar, slVarB != null ? n(slVarB, dVar) : null);
        }
        long normalRouteAltId = slVar.getHovRouteInfo().getNormalRouteAltId();
        sl slVarC = aoVar.c(normalRouteAltId);
        if (slVarC != null) {
            return h(slVarC, dVar, n(slVar, dVar));
        }
        com.waze.shared_infra.i.h.k("AlternativeRoutesResponse", "Non Hov version of id: " + normalRouteAltId + " treated as no normalRouteAltId, cannot be found in response, routes:" + aoVar);
        return n(slVar, dVar);
    }

    private static br b(su suVar) {
        Double dValueOf = Double.valueOf(suVar.getTollPrice());
        dValueOf.doubleValue();
        if (true != suVar.hasTollPrice()) {
            dValueOf = null;
        }
        double dDoubleValue = dValueOf != null ? dValueOf.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE;
        String tollPriceCurrencyCode = suVar.getTollPriceCurrencyCode();
        if (tollPriceCurrencyCode == null) {
            tollPriceCurrencyCode = "";
        }
        return new br(dDoubleValue, tollPriceCurrencyCode);
    }

    public static com.waze.shared_infra.h.c e(i.b.s sVar) {
        h.g.b.x.f(sVar, "<this>");
        return new com.waze.shared_infra.h.c(sVar.getLatTimes1000000(), sVar.getLonTimes1000000());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.waze.modules.c.g] */
    public static List f(qq qqVar, com.waze.map.d dVar) {
        h.g.b.x.f(qqVar, "<this>");
        try {
            Gateway.onRoadTypePolylines(qqVar);
        } catch (Throwable th) {
        }
        h.g.b.x.f(dVar, "compressedPolylineUtils");
        List<qo> polylinesList = qqVar.getPolylinesList();
        h.g.b.x.e(polylinesList, "getPolylinesList(...)");
        ArrayList arrayList = new ArrayList();
        for (qo qoVar : polylinesList) {
            byte[] bArrX = qoVar.getEncodedS2Points().x();
            h.g.b.x.e(bArrX, "toByteArray(...)");
            PolylineGeometry polylineGeometryA = dVar.a(bArrX);
            ap gVar = null;
            if (polylineGeometryA != null) {
                List listR = et.r(polylineGeometryA);
                if (qoVar.hasRoadType()) {
                    i.a.a.g roadType = qoVar.getRoadType();
                    h.g.b.x.e(roadType, "getRoadType(...)");
                    gVar = com.waze.ae.e.e(roadType);
                }
                List<Integer> serverSegmentIdList = qoVar.getServerSegmentIdList();
                h.g.b.x.e(serverSegmentIdList, "getServerSegmentIdList(...)");
                List<Integer> list = serverSegmentIdList;
                ArrayList arrayList2 = new ArrayList(h.a.i.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((Integer) it.next()).intValue()));
                }
                gVar = new g(listR, gVar, arrayList2);
            }
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }

    public static h g(rf rfVar) {
        j jVar;
        i iVar;
        i iVar2;
        j jVar2;
        h.g.b.x.f(rfVar, "<this>");
        Long lValueOf = rfVar.hasAlertId() ? Long.valueOf(rfVar.getAlertId()) : null;
        if (rfVar.hasAlertType()) {
            i.b.l alertType = rfVar.getAlertType();
            h.g.b.x.e(alertType, "getAlertType(...)");
            j jVar3 = j.f30171a;
            i iVar3 = i.f30159a;
            switch (alertType.ordinal()) {
                case 0:
                    jVar2 = j.f30171a;
                    break;
                case 1:
                    jVar2 = j.f30172b;
                    break;
                case 2:
                    jVar2 = j.f30173c;
                    break;
                case 3:
                    jVar2 = j.f30174d;
                    break;
                case 4:
                    jVar2 = j.f30175e;
                    break;
                case 5:
                    jVar2 = j.f30176f;
                    break;
                case 6:
                    jVar2 = j.f30177g;
                    break;
                case 7:
                    jVar2 = j.f30178h;
                    break;
                case 8:
                    jVar2 = j.f30179i;
                    break;
                case 9:
                    jVar2 = j.f30180j;
                    break;
                case 10:
                    jVar2 = j.f30181k;
                    break;
                case 11:
                    jVar2 = j.f30182l;
                    break;
                case 12:
                    jVar2 = j.m;
                    break;
                case 13:
                case 14:
                case 17:
                case 18:
                    jVar2 = j.n;
                    break;
                case 15:
                    jVar2 = j.o;
                    break;
                case 16:
                    jVar2 = j.p;
                    break;
                case 19:
                    jVar2 = j.q;
                    break;
                default:
                    throw new h.i();
            }
            jVar = jVar2;
        } else {
            jVar = null;
        }
        if (rfVar.hasAlertType()) {
            i.b.j alertSubType = rfVar.getAlertSubType();
            h.g.b.x.e(alertSubType, "getAlertSubType(...)");
            j jVar4 = j.f30171a;
            i iVar4 = i.f30159a;
            switch (alertSubType.ordinal()) {
                case 0:
                    iVar2 = i.f30159a;
                    break;
                case 1:
                    iVar2 = i.f30160b;
                    break;
                case 2:
                    iVar2 = i.f30161c;
                    break;
                case 3:
                    iVar2 = i.f30162d;
                    break;
                case 4:
                    iVar2 = i.f30163e;
                    break;
                case 5:
                    iVar2 = i.f30164f;
                    break;
                case 6:
                    iVar2 = i.f30165g;
                    break;
                case 7:
                    iVar2 = i.f30166h;
                    break;
                case 8:
                    iVar2 = i.f30167i;
                    break;
                case 9:
                    iVar2 = i.f30168j;
                    break;
                case 10:
                    iVar2 = i.f30169k;
                    break;
                case 11:
                    iVar2 = i.f30170l;
                    break;
                case 12:
                    iVar2 = i.m;
                    break;
                case 13:
                    iVar2 = i.n;
                    break;
                case 14:
                    iVar2 = i.o;
                    break;
                case 15:
                    iVar2 = i.p;
                    break;
                case 16:
                    iVar2 = i.q;
                    break;
                case 17:
                    iVar2 = i.r;
                    break;
                case 18:
                    iVar2 = i.s;
                    break;
                case 19:
                    iVar2 = i.t;
                    break;
                case 20:
                    iVar2 = i.u;
                    break;
                case 21:
                    iVar2 = i.v;
                    break;
                case 22:
                    iVar2 = i.w;
                    break;
                case 23:
                    iVar2 = i.x;
                    break;
                case 24:
                    iVar2 = i.y;
                    break;
                case 25:
                    iVar2 = i.z;
                    break;
                case 26:
                    iVar2 = i.A;
                    break;
                case 27:
                    iVar2 = i.B;
                    break;
                case 28:
                    iVar2 = i.C;
                    break;
                case 29:
                    iVar2 = i.D;
                    break;
                case 30:
                    iVar2 = i.E;
                    break;
                case 31:
                    iVar2 = i.F;
                    break;
                case 32:
                    iVar2 = i.G;
                    break;
                case 33:
                    iVar2 = i.H;
                    break;
                case 34:
                    iVar2 = i.I;
                    break;
                case 35:
                case 39:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                    iVar2 = i.f30159a;
                    break;
                case 36:
                    iVar2 = i.J;
                    break;
                case 37:
                    iVar2 = i.K;
                    break;
                case 38:
                    iVar2 = i.L;
                    break;
                case 40:
                    iVar2 = i.M;
                    break;
                case 41:
                    iVar2 = i.N;
                    break;
                case 42:
                    iVar2 = i.O;
                    break;
                case 43:
                    iVar2 = i.P;
                    break;
                case 44:
                    iVar2 = i.Q;
                    break;
                case 45:
                    iVar2 = i.R;
                    break;
                case 46:
                    iVar2 = i.S;
                    break;
                case 47:
                    iVar2 = i.T;
                    break;
                default:
                    throw new h.i();
            }
            iVar = iVar2;
        } else {
            iVar = null;
        }
        Integer numValueOf = rfVar.hasRoadInfoSeverity() ? Integer.valueOf(rfVar.getRoadInfoSeverity()) : null;
        Double dValueOf = rfVar.hasRatioOnRoadStart() ? Double.valueOf(rfVar.getRatioOnRoadStart()) : null;
        Double dValueOf2 = rfVar.hasRatioOnRoadEnd() ? Double.valueOf(rfVar.getRatioOnRoadEnd()) : null;
        Boolean boolValueOf = rfVar.hasIsMajorEvent() ? Boolean.valueOf(rfVar.getIsMajorEvent()) : null;
        Integer numValueOf2 = rfVar.hasDuration() ? Integer.valueOf(rfVar.getDuration()) : null;
        com.waze.shared_infra.h.c cVar = rfVar.hasLocation() ? new com.waze.shared_infra.h.c(rfVar.getLocation().getLatTimes1000000(), rfVar.getLocation().getLonTimes1000000()) : null;
        List<i.b.s> geometryPointsList = rfVar.getGeometryPointsList();
        h.g.b.x.e(geometryPointsList, "getGeometryPointsList(...)");
        List<i.b.s> list = geometryPointsList;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        for (i.b.s sVar : list) {
            arrayList.add(new com.waze.shared_infra.h.c(sVar.getLatTimes1000000(), sVar.getLonTimes1000000()));
        }
        return new h(lValueOf, jVar, iVar, numValueOf, dValueOf, dValueOf2, boolValueOf, numValueOf2, cVar, arrayList, rfVar.hasJamId() ? Long.valueOf(rfVar.getJamId()) : null, rfVar.hasIsPartialLaneClosure() ? Boolean.valueOf(rfVar.getIsPartialLaneClosure()) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x040c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.waze.modules.c.ar h(i.b.l.sl r33, com.waze.map.d r34, com.waze.modules.c.ar r35) {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.c.eb.h(i.b.l.sl, com.waze.map.d, com.waze.modules.c.ar):com.waze.modules.c.ar");
    }

    public static aw i(i.b.l.af afVar, com.waze.map.d dVar) {
        sl routingResult;
        at atVar;
        au auVar;
        h.g.b.x.f(afVar, "<this>");
        h.g.b.x.f(dVar, "compressedPolylineUtils");
        i.b.l.ae currentRouteCase = afVar.getCurrentRouteCase();
        j jVar = j.f30171a;
        i iVar = i.f30159a;
        int iOrdinal = currentRouteCase.ordinal();
        if (iOrdinal == 0) {
            routingResult = afVar.getRoutingUpdate().getRoutingResult();
        } else if (iOrdinal == 1) {
            routingResult = afVar.getSilentRerouteSuggestion().getRerouteRoutingResult();
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            routingResult = null;
        }
        List listD = h.a.i.d(routingResult);
        List<sl> alternativeResponseList = afVar.getAlternativeRoutes().getAlternativeResponseList();
        h.g.b.x.e(alternativeResponseList, "getAlternativeResponseList(...)");
        List listAc = h.a.i.ac(h.a.i.af(listD, alternativeResponseList));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listAc) {
            sl slVar = (sl) obj;
            if (slVar.hasHovRouteInfo() && slVar.getHovRouteInfo().hasNormalRouteAltId()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        h.k kVar = new h.k(arrayList, arrayList2);
        ao aoVar = new ao((List) kVar.b(), (List) kVar.a());
        int iOrdinal2 = afVar.getCurrentRouteCase().ordinal();
        if (iOrdinal2 == 0) {
            pw routingUpdate = afVar.getRoutingUpdate();
            sl routingResult2 = routingUpdate.getRoutingResult();
            h.g.b.x.e(routingResult2, "getRoutingResult(...)");
            atVar = new at(a(routingResult2, dVar, aoVar), routingUpdate.getRouteId(), routingUpdate.getRoutingResult().hasHovRouteInfo());
        } else if (iOrdinal2 == 1) {
            qg silentRerouteSuggestion = afVar.getSilentRerouteSuggestion();
            if (silentRerouteSuggestion.hasId()) {
                long id = silentRerouteSuggestion.getId();
                int id2 = silentRerouteSuggestion.getId();
                int secondsBefore = silentRerouteSuggestion.hasSecondsBefore() ? silentRerouteSuggestion.getSecondsBefore() : -1;
                int secondsAfter = silentRerouteSuggestion.hasSecondsAfter() ? silentRerouteSuggestion.getSecondsAfter() : -1;
                boolean isSilent = silentRerouteSuggestion.hasIsSilent() ? silentRerouteSuggestion.getIsSilent() : false;
                sl rerouteRoutingResult = silentRerouteSuggestion.getRerouteRoutingResult();
                h.g.b.x.e(rerouteRoutingResult, "getRerouteRoutingResult(...)");
                dl dlVar = new dl(id2, secondsBefore, secondsAfter, a(rerouteRoutingResult, dVar, aoVar), isSilent);
                qg silentRerouteSuggestion2 = afVar.getSilentRerouteSuggestion();
                h.g.b.x.e(silentRerouteSuggestion2, "getSilentRerouteSuggestion(...)");
                auVar = new au(dlVar, silentRerouteSuggestion2, id, silentRerouteSuggestion.getRerouteRoutingResult().hasHovRouteInfo());
            } else {
                com.waze.shared_infra.i.h.k("AlternativeRoutesResponse", "silent route suggestion dropped due to now routing id");
                auVar = null;
            }
            atVar = auVar;
        } else {
            if (iOrdinal2 != 2) {
                throw new h.i();
            }
            atVar = null;
        }
        ps alternativeRoutes = afVar.getAlternativeRoutes();
        h.g.b.x.e(alternativeRoutes, "getAlternativeRoutes(...)");
        List listA = aoVar.a();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listA) {
            if (!h.g.b.x.n(((sl) obj2).getAlternativeRouteUuid(), atVar != null ? atVar.a().j() : null)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(h.a.i.q(arrayList4, 10));
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            arrayList5.add(a((sl) it.next(), dVar, aoVar));
        }
        return new aw(new dk(alternativeRoutes, arrayList5, afVar.getAlternativeRoutes().getRoutingResponseCode().getId(), null, 56), atVar);
    }

    public static by j(su suVar) {
        String str;
        int iIntValue;
        h.g.b.x.f(suVar, "<this>");
        ss popupId = suVar.getPopupId();
        j jVar = j.f30171a;
        i iVar = i.f30159a;
        switch (popupId.ordinal()) {
            case 0:
                return new bq(false);
            case 1:
                String passBasedMissingPassName = suVar.getPassBasedMissingPassName();
                return new bs(passBasedMissingPassName != null ? passBasedMissingPassName : "");
            case 2:
                double dDoubleValue = 0.0d;
                br brVarB = b(suVar);
                Double dValueOf = Double.valueOf(suVar.getPassBasedPriceChangeToPrice());
                dValueOf.doubleValue();
                Double d2 = true != suVar.hasPassBasedPriceChangeToPrice() ? null : dValueOf;
                if (d2 != null) {
                    dDoubleValue = d2.doubleValue();
                }
                String passBasedMissingPassName2 = suVar.getPassBasedMissingPassName();
                return new bt(brVarB, dDoubleValue, passBasedMissingPassName2 != null ? passBasedMissingPassName2 : "");
            case 3:
                double dDoubleValue2 = 0.0d;
                br brVarB2 = b(suVar);
                String tollRoadName = suVar.getTollRoadName();
                String str2 = tollRoadName != null ? tollRoadName : "";
                Double dValueOf2 = Double.valueOf(suVar.getTimeBasedPriceChangeToPrice());
                dValueOf2.doubleValue();
                if (true != suVar.hasTimeBasedPriceChangeToPrice()) {
                    dValueOf2 = null;
                }
                if (dValueOf2 != null) {
                    dDoubleValue2 = dValueOf2.doubleValue();
                }
                double d3 = dDoubleValue2;
                Integer numValueOf = Integer.valueOf(suVar.getTimeBasedPriceChangeAtSeconds());
                numValueOf.intValue();
                if (true != suVar.hasTimeBasedPriceChangeAtSeconds()) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    str = str2;
                    iIntValue = numValueOf.intValue();
                } else {
                    str = str2;
                    iIntValue = 0;
                }
                return new bv(brVarB2, d3, str, iIntValue);
            case 4:
                String tollRoadName2 = suVar.getTollRoadName();
                return new bw(tollRoadName2 != null ? tollRoadName2 : "");
            case 5:
                String passBasedUserPassName = suVar.getPassBasedUserPassName();
                return new bx(passBasedUserPassName != null ? passBasedUserPassName : "", b(suVar));
            case 6:
                return suVar.hasTollPrice() ? b(suVar) : bu.f29925a;
            case 7:
            default:
                return bu.f29925a;
            case 8:
                return bp.f29917a;
            case 9:
                return new bq(true);
        }
    }

    public static dk k(ps psVar, com.waze.map.d dVar) {
        com.waze.ae.e eVarB;
        h.g.b.x.f(psVar, "<this>");
        h.g.b.x.f(dVar, "compressedPolylineUtils");
        List<sl> alternativeResponseList = psVar.getAlternativeResponseList();
        h.g.b.x.e(alternativeResponseList, "getAlternativeResponseList(...)");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : alternativeResponseList) {
            sl slVar = (sl) obj;
            if (slVar.hasHovRouteInfo() && slVar.getHovRouteInfo().hasNormalRouteAltId()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        h.k kVar = new h.k(arrayList, arrayList2);
        ao aoVar = new ao((List) kVar.b(), (List) kVar.a());
        List listA = aoVar.a();
        ArrayList arrayList3 = new ArrayList(h.a.i.q(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList3.add(a((sl) it.next(), dVar, aoVar));
        }
        ArrayList arrayList4 = arrayList3;
        long id = psVar.getRoutingResponseCode().getId();
        if (psVar.hasClosuresImpactInfo()) {
            og closuresImpactInfo = psVar.getClosuresImpactInfo();
            h.g.b.x.e(closuresImpactInfo, "getClosuresImpactInfo(...)");
            eVarB = com.waze.modules.navigation.j.b(closuresImpactInfo, dVar);
        } else {
            eVarB = null;
        }
        return new dk(psVar, arrayList4, id, eVarB, 32);
    }

    public static dm l(su suVar) {
        h.g.b.x.f(suVar, "<this>");
        return new dm(suVar.hasTollPrice() ? Double.valueOf(suVar.getTollPrice()) : null, suVar.hasTollPriceCurrencyCode() ? suVar.getTollPriceCurrencyCode() : null, suVar.hasPopupId() ? Integer.valueOf(suVar.getPopupId().getNumber()) : null, suVar.hasActionUrl() ? suVar.getActionUrl() : null, suVar.hasTollRoadName() ? suVar.getTollRoadName() : null, suVar.hasPassBasedMissingPassName() ? suVar.getPassBasedMissingPassName() : null, suVar.hasPassBasedPriceChangeToPrice() ? Double.valueOf(suVar.getPassBasedPriceChangeToPrice()) : null, suVar.hasTimeBasedPriceChangeAtSeconds() ? Integer.valueOf(suVar.getTimeBasedPriceChangeAtSeconds()) : null, suVar.hasTimeBasedPriceChangeToPrice() ? Double.valueOf(suVar.getTimeBasedPriceChangeToPrice()) : null, suVar.hasPassBasedUserPassName() ? suVar.getPassBasedUserPassName() : null);
    }

    public static rf m(h hVar) {
        i.b.j jVar;
        i.b.l lVar;
        h.g.b.x.f(hVar, "<this>");
        re reVarNewBuilder = rf.newBuilder();
        Long lJ = hVar.j();
        if (lJ != null) {
            reVarNewBuilder.b(lJ.longValue());
        }
        j jVarB = hVar.b();
        if (jVarB != null) {
            i iVar = i.f30159a;
            switch (jVarB.ordinal()) {
                case 0:
                    lVar = i.b.l.CHIT_CHAT;
                    break;
                case 1:
                    lVar = i.b.l.POLICE;
                    break;
                case 2:
                    lVar = i.b.l.ACCIDENT;
                    break;
                case 3:
                    lVar = i.b.l.JAM;
                    break;
                case 4:
                    lVar = i.b.l.TRAFFIC_INFO;
                    break;
                case 5:
                    lVar = i.b.l.HAZARD;
                    break;
                case 6:
                    lVar = i.b.l.MISC;
                    break;
                case 7:
                    lVar = i.b.l.CONSTRUCTION;
                    break;
                case 8:
                    lVar = i.b.l.PARKING;
                    break;
                case 9:
                    lVar = i.b.l.DYNAMIC;
                    break;
                case 10:
                    lVar = i.b.l.CAMERA;
                    break;
                case 11:
                    lVar = i.b.l.PARKED;
                    break;
                case 12:
                    lVar = i.b.l.ROAD_CLOSED;
                    break;
                case 13:
                    lVar = i.b.l.UNKKNOWN;
                    break;
                case 14:
                    lVar = i.b.l.SYSTEM_ROAD_CLOSED;
                    break;
                case 15:
                    lVar = i.b.l.SOS;
                    break;
                case 16:
                    lVar = i.b.l.PERSONAL_SAFETY;
                    break;
                default:
                    throw new h.i();
            }
            reVarNewBuilder.d(lVar);
        }
        i iVarA = hVar.a();
        if (iVarA != null) {
            j jVar2 = j.f30171a;
            switch (iVarA.ordinal()) {
                case 0:
                    jVar = i.b.j.NO_SUBTYPE;
                    break;
                case 1:
                    jVar = i.b.j.POLICE_VISIBLE;
                    break;
                case 2:
                    jVar = i.b.j.POLICE_HIDING;
                    break;
                case 3:
                    jVar = i.b.j.POLICE_WITH_MOBILE_CAMERA;
                    break;
                case 4:
                    jVar = i.b.j.ACCIDENT_MINOR;
                    break;
                case 5:
                    jVar = i.b.j.ACCIDENT_MAJOR;
                    break;
                case 6:
                    jVar = i.b.j.JAM_MODERATE_TRAFFIC;
                    break;
                case 7:
                    jVar = i.b.j.JAM_HEAVY_TRAFFIC;
                    break;
                case 8:
                    jVar = i.b.j.JAM_STAND_STILL_TRAFFIC;
                    break;
                case 9:
                    jVar = i.b.j.JAM_LIGHT_TRAFFIC;
                    break;
                case 10:
                    jVar = i.b.j.HAZARD_ON_ROAD;
                    break;
                case 11:
                    jVar = i.b.j.HAZARD_ON_SHOULDER;
                    break;
                case 12:
                    jVar = i.b.j.HAZARD_WEATHER;
                    break;
                case 13:
                    jVar = i.b.j.HAZARD_ON_ROAD_OBJECT;
                    break;
                case 14:
                    jVar = i.b.j.HAZARD_ON_ROAD_POT_HOLE;
                    break;
                case 15:
                    jVar = i.b.j.HAZARD_ON_ROAD_ROAD_KILL;
                    break;
                case 16:
                    jVar = i.b.j.HAZARD_ON_SHOULDER_CAR_STOPPED;
                    break;
                case 17:
                    jVar = i.b.j.HAZARD_ON_SHOULDER_ANIMALS;
                    break;
                case 18:
                    jVar = i.b.j.HAZARD_ON_SHOULDER_MISSING_SIGN;
                    break;
                case 19:
                    jVar = i.b.j.HAZARD_WEATHER_FOG;
                    break;
                case 20:
                    jVar = i.b.j.HAZARD_WEATHER_HAIL;
                    break;
                case 21:
                    jVar = i.b.j.HAZARD_WEATHER_HEAVY_RAIN;
                    break;
                case 22:
                    jVar = i.b.j.HAZARD_WEATHER_HEAVY_SNOW;
                    break;
                case 23:
                    jVar = i.b.j.HAZARD_WEATHER_FLOOD;
                    break;
                case 24:
                    jVar = i.b.j.HAZARD_WEATHER_MONSOON;
                    break;
                case 25:
                    jVar = i.b.j.HAZARD_WEATHER_TORNADO;
                    break;
                case 26:
                    jVar = i.b.j.HAZARD_WEATHER_HEAT_WAVE;
                    break;
                case 27:
                    jVar = i.b.j.HAZARD_WEATHER_HURRICANE;
                    break;
                case 28:
                    jVar = i.b.j.HAZARD_WEATHER_FREEZING_RAIN;
                    break;
                case 29:
                    jVar = i.b.j.HAZARD_ON_ROAD_LANE_CLOSED;
                    break;
                case 30:
                    jVar = i.b.j.HAZARD_ON_ROAD_OIL;
                    break;
                case 31:
                    jVar = i.b.j.HAZARD_ON_ROAD_ICE;
                    break;
                case 32:
                    jVar = i.b.j.HAZARD_ON_ROAD_CONSTRUCTION;
                    break;
                case 33:
                    jVar = i.b.j.HAZARD_ON_ROAD_CAR_STOPPED;
                    break;
                case 34:
                    jVar = i.b.j.HAZARD_ON_ROAD_TRAFFIC_LIGHT_FAULT;
                    break;
                case 35:
                    jVar = i.b.j.ROAD_CLOSED_HAZARD;
                    break;
                case 36:
                    jVar = i.b.j.ROAD_CLOSED_CONSTRUCTION;
                    break;
                case 37:
                    jVar = i.b.j.ROAD_CLOSED_EVENT;
                    break;
                case 38:
                    jVar = i.b.j.PARKED_ON;
                    break;
                case 39:
                    jVar = i.b.j.PARKED_OFF;
                    break;
                case 40:
                    jVar = i.b.j.SOS_FLAT_TIRE;
                    break;
                case 41:
                    jVar = i.b.j.SOS_NO_FUEL;
                    break;
                case 42:
                    jVar = i.b.j.SOS_MEDICAL_HELP;
                    break;
                case 43:
                    jVar = i.b.j.SOS_MECHANICAL_PROBLEM;
                    break;
                case 44:
                    jVar = i.b.j.SOS_OTHER;
                    break;
                case 45:
                    jVar = i.b.j.SOS_BATTERY_ISSUE;
                    break;
                default:
                    throw new h.i();
            }
            reVarNewBuilder.c(jVar);
        }
        com.waze.shared_infra.h.c cVarC = hVar.c();
        if (cVarC != null) {
            reVarNewBuilder.j(com.waze.sharedui.e.e.e(cVarC));
        }
        List listL = hVar.l();
        ArrayList arrayList = new ArrayList(h.a.i.q(listL, 10));
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            arrayList.add(com.waze.sharedui.e.e.e((com.waze.shared_infra.h.c) it.next()));
        }
        reVarNewBuilder.a(arrayList);
        Integer numH = hVar.h();
        if (numH != null) {
            reVarNewBuilder.e(numH.intValue());
        }
        Boolean boolD = hVar.d();
        if (boolD != null) {
            reVarNewBuilder.f(boolD.booleanValue());
        }
        Boolean boolE = hVar.e();
        if (boolE != null) {
            reVarNewBuilder.g(boolE.booleanValue());
        }
        Long lK = hVar.k();
        if (lK != null) {
            reVarNewBuilder.h(lK.longValue());
        }
        Integer numI = hVar.i();
        if (numI != null) {
            reVarNewBuilder.m(numI.intValue());
        }
        Double dF = hVar.f();
        if (dF != null) {
            reVarNewBuilder.k(dF.doubleValue());
        }
        Double dG = hVar.g();
        if (dG != null) {
            reVarNewBuilder.l(dG.doubleValue());
        }
        rf rfVarBuild = reVarNewBuilder.build();
        h.g.b.x.e(rfVarBuild, "build(...)");
        return rfVarBuild;
    }

    public static /* synthetic */ ar n(sl slVar, com.waze.map.d dVar) {
        return h(slVar, dVar, null);
    }

    private eb() {
        throw null;
    }
}
