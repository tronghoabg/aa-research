package com.waze.bi;

import com.waze.bg.a.cd;
import com.waze.bm.a.a.aa;
import com.waze.bm.a.a.m;
import com.waze.bm.a.a.o;
import com.waze.bm.a.a.q;
import com.waze.bm.a.a.r;
import com.waze.bm.a.a.s;
import com.waze.bm.a.a.u;
import com.waze.bm.a.a.v;
import com.waze.bm.a.a.w;
import com.waze.bm.a.a.y;
import com.waze.bm.a.a.z;
import com.waze.reports_v2.b.af;
import com.waze.reports_v2.b.at;
import h.ab;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class i {
    public /* synthetic */ i(byte[] bArr) {
    }

    public static Object a(g gVar, kotlinx.coroutines.b.k kVar, h.c.e eVar) {
        Object objD = ai.d(ai.K(kVar, new h(gVar, null)), eVar);
        return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
    }

    public static com.waze.bm.a.a.f b(com.waze.bl.c.b.j jVar) {
        x.f(jVar, "<this>");
        com.waze.bm.a.a.e eVarNewBuilder = com.waze.bm.a.a.f.newBuilder();
        x.f(eVarNewBuilder, "builder");
        if (jVar instanceof com.waze.bl.c.b.i) {
            z zVarNewBuilder = aa.newBuilder();
            x.f(zVarNewBuilder, "builder");
            zVarNewBuilder.a(((com.waze.bl.c.b.i) jVar).e());
            aa aaVarBuild = zVarNewBuilder.build();
            x.e(aaVarBuild, "build(...)");
            aa aaVar = aaVarBuild;
            x.f(aaVar, "value");
            eVarNewBuilder.d(aaVar);
        } else if (jVar instanceof com.waze.bl.c.b.g) {
            r rVarNewBuilder = s.newBuilder();
            x.f(rVarNewBuilder, "builder");
            rVarNewBuilder.a(((com.waze.bl.c.b.g) jVar).e());
            s sVarBuild = rVarNewBuilder.build();
            x.e(sVarBuild, "build(...)");
            s sVar = sVarBuild;
            x.f(sVar, "value");
            eVarNewBuilder.b(sVar);
        } else if (jVar instanceof com.waze.bl.c.b.f) {
            com.waze.bm.a.a.l lVarNewBuilder = m.newBuilder();
            x.f(lVarNewBuilder, "builder");
            List listA = lVarNewBuilder.a();
            x.e(listA, "getCandidatesList(...)");
            com.google.v.b.a aVar = new com.google.v.b.a(listA);
            List<com.waze.bl.c.c.b> listA2 = ((com.waze.bl.c.b.f) jVar).a();
            ArrayList arrayList = new ArrayList(h.a.i.q(listA2, 10));
            for (com.waze.bl.c.c.b bVar : listA2) {
                x.f(bVar, "<this>");
                com.waze.bm.a.a.g gVarNewBuilder = com.waze.bm.a.a.h.newBuilder();
                gVarNewBuilder.a(bVar.b());
                gVarNewBuilder.c(bVar.c());
                gVarNewBuilder.b(bVar.a().g());
                String strE = bVar.a().e();
                if (strE != null) {
                    gVarNewBuilder.d(strE);
                }
                com.waze.bm.a.a.h hVarBuild = gVarNewBuilder.build();
                x.e(hVarBuild, "build(...)");
                arrayList.add(hVarBuild);
            }
            ArrayList arrayList2 = arrayList;
            x.f(aVar, "<this>");
            x.f(arrayList2, "values");
            lVarNewBuilder.b(arrayList2);
            m mVarBuild = lVarNewBuilder.build();
            x.e(mVarBuild, "build(...)");
            m mVar = mVarBuild;
            x.f(mVar, "value");
            eVarNewBuilder.a(mVar);
        } else {
            if (!(jVar instanceof com.waze.bl.c.b.h)) {
                throw new h.i();
            }
            v vVarNewBuilder = w.newBuilder();
            x.f(vVarNewBuilder, "builder");
            vVarNewBuilder.a(((com.waze.bl.c.b.h) jVar).e());
            w wVarBuild = vVarNewBuilder.build();
            x.e(wVarBuild, "build(...)");
            w wVar = wVarBuild;
            x.f(wVar, "value");
            eVarNewBuilder.c(wVar);
        }
        com.waze.bm.a.a.f fVarBuild = eVarNewBuilder.build();
        x.e(fVarBuild, "build(...)");
        return fVarBuild;
    }

    public static /* synthetic */ boolean c(com.waze.bl.c.b.j jVar) {
        if ((jVar instanceof com.waze.bl.c.b.f) || (jVar instanceof com.waze.bl.c.b.g)) {
            return false;
        }
        if ((jVar instanceof com.waze.bl.c.b.i) || (jVar instanceof com.waze.bl.c.b.h)) {
            return jVar.e();
        }
        throw new h.i();
    }

    public static /* synthetic */ boolean d(com.waze.bl.c.b.j jVar) {
        if ((jVar instanceof com.waze.bl.c.b.f) || (jVar instanceof com.waze.bl.c.b.h) || (jVar instanceof com.waze.bl.c.b.i)) {
            return false;
        }
        if (jVar instanceof com.waze.bl.c.b.g) {
            return ((com.waze.bl.c.b.g) jVar).e();
        }
        throw new h.i();
    }

    public static com.waze.bl.b.c.b e(q qVar) {
        x.f(qVar, "<this>");
        o alertType = qVar.getAlertType();
        x.e(alertType, "getAlertType(...)");
        x.f(alertType, "<this>");
        at atVar = at.f34082j;
        at atVar2 = at.p;
        switch (alertType) {
            case ALERT_TYPE_UNSPECIFIED:
                throw new IllegalArgumentException("backend should specify type");
            case POLICE_DEFAULT:
                atVar = at.f34075c;
                break;
            case POLICE_HIDDEN:
                atVar = at.f34076d;
                break;
            case CRASH_DEFAULT:
                atVar = at.f34079g;
                break;
            case CRASH_PILE_UP:
                atVar = at.f34080h;
                break;
            case CRASH_MAJOR:
                atVar = at.E;
                break;
            case CRASH_MINOR:
                atVar = at.F;
                break;
            case TRAFFIC_DEFAULT:
                atVar = at.f34073a;
                break;
            case TRAFFIC_STANDSTILL:
                atVar = at.f34074b;
                break;
            case TRAFFIC_LIGHT:
            case HAZARD_DEFAULT:
            case HAZARD_OIL:
            case HAZARD_SHOULDER:
            case HAZARD_EMERGENCY_VEHICLE:
                break;
            case TRAFFIC_MODERATE:
                atVar = at.G;
                break;
            case TRAFFIC_HEAVY:
                atVar = at.H;
                break;
            case HAZARD_CONSTRUCTION:
                atVar = at.o;
                break;
            case HAZARD_VEHICLE_STOPPED:
                atVar = at.n;
                break;
            case HAZARD_OBJECT_ON_ROAD:
                atVar = at.m;
                break;
            case HAZARD_POTHOLE:
                atVar = at.f34084l;
                break;
            case HAZARD_BROKEN_TRAFFIC_LIGHT:
                atVar = at.f34083k;
                break;
            case HAZARD_ANIMALS:
                atVar = at.A;
                break;
            case HAZARD_MISSING_SIGN:
                atVar = at.B;
                break;
            case HAZARD_ROAD_KILL:
                atVar = at.C;
                break;
            case HAZARD_SHOULDER_VEHICLE_STOPPED:
                atVar = at.D;
                break;
            case WEATHER_DEFAULT:
            case WEATHER_HEAT_WAVE:
            case WEATHER_TORNADO:
            case WEATHER_HEAVY_RAIN:
            case WEATHER_HURRICANE:
            case WEATHER_MONSOON:
                atVar = atVar2;
                break;
            case WEATHER_SLIPPERY_ROAD:
                atVar = at.r;
                break;
            case WEATHER_FLOOD:
                atVar = at.q;
                break;
            case WEATHER_UNPLOWED_ROAD:
                atVar = at.s;
                break;
            case WEATHER_FOG:
                atVar = at.u;
                break;
            case WEATHER_ICY_ROAD:
                atVar = at.t;
                break;
            case WEATHER_HAIL:
                atVar = at.z;
                break;
            case BLOCKED_LANE_DEFAULT:
                atVar = at.v;
                break;
            case BLOCKED_LANE_LEFT:
                atVar = at.w;
                break;
            case BLOCKED_LANE_CENTER:
                atVar = at.x;
                break;
            case BLOCKED_LANE_RIGHT:
                atVar = at.y;
                break;
            case PERSONAL_SAFETY_DEFAULT:
                atVar = at.X;
                break;
            case POLICE_MOBILE_CAMERA:
                atVar = at.f34077e;
                break;
            default:
                throw new h.i();
        }
        return new com.waze.bl.c.b.c(atVar);
    }

    public static com.waze.bl.b.c.b f(u uVar) {
        x.f(uVar, "<this>");
        String candidateOrdinalId = uVar.getCandidateOrdinalId();
        x.e(candidateOrdinalId, "getCandidateOrdinalId(...)");
        return new com.waze.bl.c.b.d(candidateOrdinalId);
    }

    public static com.waze.bl.b.c.b g(y yVar) {
        x.f(yVar, "<this>");
        cd mapIssueType = yVar.getMapIssueType();
        x.e(mapIssueType, "getMapIssueType(...)");
        x.f(mapIssueType, "<this>");
        af afVar = af.f34041e;
        switch (mapIssueType.ordinal()) {
            case 0:
            case 1:
            case 6:
            case 15:
            case 16:
            case 17:
                break;
            case 2:
                afVar = af.f34037a;
                break;
            case 3:
                afVar = af.f34038b;
                break;
            case 4:
                afVar = af.f34039c;
                break;
            case 5:
                afVar = af.f34040d;
                break;
            case 7:
                afVar = af.f34042f;
                break;
            case 8:
                afVar = af.f34043g;
                break;
            case 9:
                afVar = af.f34044h;
                break;
            case 10:
                afVar = af.f34045i;
                break;
            case 11:
                afVar = af.f34046j;
                break;
            case 12:
                afVar = af.f34047k;
                break;
            case 13:
                afVar = af.f34048l;
                break;
            case 14:
                afVar = af.m;
                break;
            case 18:
                afVar = af.n;
                break;
            default:
                throw new h.i();
        }
        String description = yVar.getDescription();
        x.e(description, "getDescription(...)");
        return new com.waze.bl.c.b.e(afVar, description);
    }

    private i() {
        throw null;
    }
}
