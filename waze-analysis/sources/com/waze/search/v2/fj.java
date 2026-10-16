package com.waze.search.v2;

import com.waze.R;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fj {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f36529a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f36530b = h.a.r.k(new h.k("WHEELCHAIR_ACCESSIBLE", Integer.valueOf(R.string.CATEGORY_SEARCH_AMENITIES_FILTER_WHEELCHAIR_ACCESSIBLE)), new h.k("DISABILITY_PARKING", Integer.valueOf(R.string.CATEGORY_SEARCH_AMENITIES_FILTER_DISABILITY_PARKING)), new h.k("RESTROOMS", Integer.valueOf(R.string.CATEGORY_SEARCH_AMENITIES_FILTER_RESTROOMS)), new h.k("PARKING_FOR_CUSTOMERS", Integer.valueOf(R.string.CATEGORY_SEARCH_AMENITIES_FILTER_CUSTOMER_PARKING)), new h.k("EV_CHARGING_STATION", Integer.valueOf(R.string.CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION)));

    public static final /* synthetic */ com.waze.navigate.location_preview.bo a(com.waze.av.d.r rVar, c cVar) {
        com.waze.search.aw awVarI = cVar.i();
        if (awVarI == null) {
            return null;
        }
        return new com.waze.navigate.location_preview.bo(rVar.c(), rVar.b(), awVarI.p());
    }

    public static final /* synthetic */ com.waze.search.bc b(kotlinx.coroutines.b.ch chVar) {
        com.waze.sdk.bq bqVarQ = ((dd) chVar.d()).q();
        if (bqVarQ instanceof com.waze.search.bc) {
            return (com.waze.search.bc) bqVarQ;
        }
        return null;
    }

    public static final Set d(c cVar) {
        h.g.b.x.f(cVar, "<this>");
        return e.c.d.a.s(cVar.c(), cVar.b(), cVar.e(), cVar.f(), cVar.m(), cVar.i(), cVar.g(), cVar.h(), cVar.d(), cVar.l(), cVar.k(), cVar.a(), cVar.j());
    }

    public static final boolean e(dd ddVar) {
        List listC;
        h.g.b.x.f(ddVar, "<this>");
        com.waze.sdk.bq bqVarQ = ddVar.q();
        com.waze.search.bc bcVar = bqVarQ instanceof com.waze.search.bc ? (com.waze.search.bc) bqVarQ : null;
        if (bcVar == null || (listC = bcVar.e().c()) == null) {
            return false;
        }
        return !listC.isEmpty();
    }

    public static final boolean f(dd ddVar) {
        h.g.b.x.f(ddVar, "<this>");
        return ddVar.c().m() != null;
    }

    public static final com.waze.ad.c.b g(di diVar, com.waze.sdk.bq bqVar) {
        String strD;
        String strA;
        boolean z = bqVar instanceof com.waze.search.bc;
        String strC = null;
        com.waze.search.bc bcVar = z ? (com.waze.search.bc) bqVar : null;
        if (bcVar == null || (strD = bcVar.e().b()) == null) {
            strD = diVar != null ? diVar.d() : null;
        }
        com.waze.search.bc bcVar2 = z ? (com.waze.search.bc) bqVar : null;
        if (bcVar2 != null && (strA = bcVar2.e().a()) != null) {
            strC = strA;
        } else if (diVar != null) {
            strC = diVar.c();
        }
        return strC != null ? new com.waze.av.c.d(strC) : strD != null ? new com.waze.av.c.e(strD) : diVar == null ? com.waze.av.c.h.f16032a : diVar.a() != null ? new com.waze.av.c.d("parking") : diVar.f() != null ? new com.waze.av.c.f(diVar.f()) : com.waze.av.c.h.f16032a;
    }
}
