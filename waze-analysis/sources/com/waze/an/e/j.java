package com.waze.an.e;

import com.waze.an.a.af;
import com.waze.an.a.ag;
import com.waze.an.a.ah;
import com.waze.an.a.ai;
import com.waze.an.a.aj;
import com.waze.an.a.ak;
import com.waze.an.a.al;
import com.waze.an.a.am;
import com.waze.an.a.an;
import com.waze.an.a.ao;
import com.waze.an.a.n;
import com.waze.an.a.o;
import com.waze.an.a.v;
import com.waze.stats.ax;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l.a.aen;
import l.a.aep;
import l.a.aeq;
import l.a.aes;
import l.a.aet;
import l.a.bae;
import l.a.cj;
import l.a.ck;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final ax f14868a;

    public j(ax axVar) {
        x.f(axVar, "reporter");
        this.f14868a = axVar;
    }

    public final void a(v vVar, n nVar, boolean z, List list, boolean z2, String str) {
        bae baeVar;
        aes aesVar;
        x.f(vVar, "segmentId");
        x.f(nVar, "state");
        x.f(list, "sourceAlertInfos");
        x.f(str, "impressionId");
        aeq aeqVarNewBuilder = aet.newBuilder();
        aeqVarNewBuilder.d(vVar.c());
        aeqVarNewBuilder.b(str);
        ao aoVarB = vVar.b();
        if (aoVarB instanceof an) {
            baeVar = bae.SEGMENT_TYPE_TRAFFIC;
        } else if (aoVarB instanceof am) {
            baeVar = bae.SEGMENT_TYPE_GROUPED_SPEED_BUMPS;
        } else if (aoVarB instanceof ai) {
            baeVar = bae.SEGMENT_TYPE_GROUPED_SHARP_CURVES;
        } else if (aoVarB instanceof ak) {
            baeVar = bae.SEGMENT_TYPE_GROUPED_HOV_LANE_CAMERAS;
        } else if (aoVarB instanceof ah) {
            baeVar = bae.SEGMENT_TYPE_GROUPED_CARPOOL_LANE_CAMERAS;
        } else if (aoVarB instanceof ag) {
            baeVar = bae.SEGMENT_TYPE_GROUPED_BUS_LANE_CAMERAS;
        } else if (aoVarB instanceof aj) {
            baeVar = bae.SEGMENT_TYPE_ENFORCEMENT_ZONE;
        } else if (aoVarB instanceof af) {
            baeVar = bae.SEGMENT_TYPE_AVERAGE_SPEED_ZONE;
        } else {
            if (!(aoVarB instanceof al)) {
                throw new h.i();
            }
            baeVar = bae.SEGMENT_TYPE_SCHOOL_ZONE;
        }
        aeqVarNewBuilder.e(baeVar);
        boolean z3 = true;
        if (z) {
            aesVar = aes.FINISHED;
        } else {
            o oVarB = nVar.b();
            o oVar = o.f14602a;
            int iOrdinal = oVarB.ordinal();
            if (iOrdinal == 0) {
                aesVar = aes.APPROACHING;
            } else {
                if (iOrdinal != 1) {
                    throw new h.i();
                }
                aesVar = z2 ? aes.AT_START : aes.WITHIN;
            }
        }
        aeqVarNewBuilder.f(aesVar);
        List<com.waze.an.a.m> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z3 = false;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((com.waze.an.a.m) it.next()).e()) {
                    break;
                }
            }
            z3 = false;
        }
        aeqVarNewBuilder.c(z3);
        ArrayList arrayList = new ArrayList(h.a.i.q(list2, 10));
        for (com.waze.an.a.m mVar : list2) {
            cj cjVarNewBuilder = ck.newBuilder();
            cjVarNewBuilder.a(mVar.b());
            cjVarNewBuilder.c(mVar.a());
            cjVarNewBuilder.d(mVar.c().getValueForStats());
            cjVarNewBuilder.b(mVar.d());
            arrayList.add(cjVarNewBuilder.build());
        }
        aeqVarNewBuilder.a(arrayList);
        x.e(aeqVarNewBuilder, "addAllAlerterInfo(...)");
        ax axVar = this.f14868a;
        aen aenVarNewBuilder = aep.newBuilder();
        aenVarNewBuilder.c(aeqVarNewBuilder);
        aep aepVarBuild = aenVarNewBuilder.build();
        x.e(aepVarBuild, "build(...)");
        com.waze.sharedui.utils.o.u(axVar, aepVarBuild);
    }
}
