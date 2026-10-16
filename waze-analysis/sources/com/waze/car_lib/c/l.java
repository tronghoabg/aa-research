package com.waze.car_lib.c;

import com.b.b.a.u;
import com.waze.av.d.r;
import com.waze.car_lib.n.v;
import com.waze.car_lib.o.ae;
import com.waze.search.stats.SearchStatsSender$SearchCategoryGroup;
import com.waze.search.stats.o;
import com.waze.search.stats.p;
import com.waze.search.stats.s;
import com.waze.z;
import h.g.b.x;
import java.util.LinkedHashSet;
import java.util.Set;
import l.a.bjz;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final s f19254a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.d.c f19255b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f19256c;

    /* renamed from: d, reason: collision with root package name */
    private final bjz f19257d;

    public l(s sVar, com.waze.d.c cVar, z zVar) {
        x.f(sVar, "searchStatsSender");
        x.f(cVar, "analyticsWrapper");
        x.f(zVar, "appType");
        this.f19254a = sVar;
        this.f19255b = cVar;
        this.f19256c = new LinkedHashSet();
        this.f19257d = u.g(zVar);
    }

    public final void a(com.waze.search.stats.k kVar, com.waze.search.stats.e eVar) {
        x.f(kVar, "action");
        x.f(eVar, "clickedCard");
        com.waze.search.d.a.b.i(this.f19254a, kVar, null, null, null, null, eVar, this.f19257d, 30);
    }

    public final void b(boolean z, int i2) {
        this.f19254a.o(z, false, i2, this.f19257d);
    }

    public final void c(int i2, v vVar, Integer num) {
        x.f(vVar, "query");
        bjz bjzVar = this.f19257d;
        this.f19254a.r(i2, ae.j(vVar), com.waze.c.c.e.l(vVar), num, vVar.c(), false, bjzVar);
    }

    public final void d() {
        com.waze.search.d.a.b.i(this.f19254a, com.waze.search.stats.k.f36061d, null, null, null, null, null, this.f19257d, 62);
    }

    public final void e() {
        Set set = this.f19256c;
        k kVar = k.f19252a;
        if (set.contains(kVar)) {
            return;
        }
        set.add(kVar);
        this.f19254a.f();
    }

    public final void f(com.waze.av.d.k kVar, v vVar, int i2, Integer num) {
        h.o.a aVarZ;
        x.f(kVar, "searchResult");
        x.f(vVar, "searchQuery");
        com.waze.search.stats.l lVar = com.waze.search.stats.l.f36065a;
        String strJ = ae.j(vVar);
        SearchStatsSender$SearchCategoryGroup searchStatsSender$SearchCategoryGroupL = com.waze.c.c.e.l(vVar);
        p pVarN = com.waze.c.c.e.n(vVar);
        o oVarM = com.waze.c.c.e.m(vVar);
        String strC = vVar.c();
        long jIntValue = num != null ? num.intValue() : -1L;
        Long l2 = kVar.l();
        if (l2 != null) {
            h.o.c cVar = h.o.a.f48264a;
            aVarZ = h.o.a.z(h.o.c.j(l2.longValue(), h.o.d.f48273d));
        } else {
            aVarZ = null;
        }
        h.o.a aVar = aVarZ;
        boolean z = kVar.e() != null;
        r rVarE = kVar.e();
        this.f19254a.y(lVar, strJ, searchStatsSender$SearchCategoryGroupL, pVarN, oVarM, strC, i2, i2, jIntValue, aVar, z, rVarE != null ? rVarE.c() : false, kVar.A(), kVar.h(), kVar.L() ? com.waze.search.stats.m.f36071b : com.waze.search.stats.m.f36070a, null, null, null, null, null, null, null, null, false, null, this.f19257d);
        this.f19255b.a();
    }
}
