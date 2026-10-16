package com.waze.location.a;

import com.waze.location.bf;
import com.waze.stats.ax;
import java.util.Map;
import l.a.aav;
import l.a.aax;
import l.a.afw;
import l.a.afx;
import l.a.agk;
import l.a.agl;
import l.a.agn;
import l.a.ago;
import l.a.agp;
import l.a.agz;
import l.a.aha;
import l.a.brd;
import l.a.brf;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    private final ax f25212a;

    public o(ax axVar) {
        h.g.b.x.f(axVar, "statsReporter");
        this.f25212a = axVar;
    }

    @Override // com.waze.location.a.n
    public final void a(l lVar) {
        aha ahaVar;
        h.g.b.x.f(lVar, "issue");
        brd brdVarNewBuilder = brf.newBuilder();
        aav aavVarNewBuilder = aax.newBuilder();
        agn agnVarNewBuilder = agp.newBuilder();
        h.g.b.x.e(agnVarNewBuilder, "newBuilder(...)");
        for (Map.Entry entry : lVar.b().entrySet()) {
            y yVar = (y) entry.getKey();
            c cVar = (c) entry.getValue();
            afw afwVarNewBuilder = afx.newBuilder();
            afwVarNewBuilder.a(cVar.c().getLatitude());
            afwVarNewBuilder.b(cVar.c().getLongitude());
            afx afxVarBuild = afwVarNewBuilder.build();
            h.g.b.x.e(afxVarBuild, "build(...)");
            afx afxVar = afxVarBuild;
            agk agkVarNewBuilder = agl.newBuilder();
            String strB = yVar.b();
            agkVarNewBuilder.b(h.g.b.x.n(strB, "network") ? agz.LOCATION_PROVIDER_NETWORK : h.g.b.x.n(strB, "gps") ? agz.LOCATION_PROVIDER_GPS : agz.LOCATION_PROVIDER_UNSPECIFIED);
            bf bfVarA = yVar.a();
            bf bfVar = bf.f25343a;
            int iOrdinal = bfVarA.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                ahaVar = aha.LOCATION_SOURCE_UNSPECIFIED;
            } else if (iOrdinal == 2) {
                ahaVar = aha.LOCATION_SOURCE_MOBILE;
            } else {
                if (iOrdinal != 3) {
                    throw new h.i();
                }
                ahaVar = aha.LOCATION_SOURCE_EXTERNAL;
            }
            agkVarNewBuilder.c(ahaVar);
            agkVarNewBuilder.a(afxVar);
            h.g.b.x.e(agkVarNewBuilder, "setCoordinates(...)");
            agnVarNewBuilder.a(agkVarNewBuilder);
        }
        if (lVar instanceof i) {
            agnVarNewBuilder.c(ago.LOCATION_INCONSISTENCY);
            agnVarNewBuilder.b(((i) lVar).a());
        } else if (lVar instanceof j) {
            agnVarNewBuilder.c(ago.STALE_LOCATION);
            agnVarNewBuilder.d(((j) lVar).a());
        } else {
            if (!(lVar instanceof k)) {
                throw new h.i();
            }
            agnVarNewBuilder.c(ago.TIME_INCONSISTENCY);
            agnVarNewBuilder.e(((k) lVar).a());
        }
        ax axVar = this.f25212a;
        agp agpVarBuild = agnVarNewBuilder.build();
        h.g.b.x.e(agpVarBuild, "build(...)");
        aavVarNewBuilder.b(agpVarBuild);
        brdVarNewBuilder.r(aavVarNewBuilder);
        brf brfVarBuild = brdVarNewBuilder.build();
        h.g.b.x.e(brfVarBuild, "build(...)");
        com.waze.sharedui.utils.o.e(axVar, brfVarBuild);
    }
}
