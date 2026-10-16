package com.waze.map;

import android.os.Handler;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bz {

    /* renamed from: a, reason: collision with root package name */
    private final MapPositionTrackerNativeManager f28452a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f28453b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f28454c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.af f28455d;

    /* renamed from: e, reason: collision with root package name */
    private Map f28456e;

    /* renamed from: f, reason: collision with root package name */
    private kotlinx.coroutines.br f28457f;

    public bz(h.c.j jVar, MapPositionTrackerNativeManager mapPositionTrackerNativeManager, Handler handler, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(jVar, "renderingContext");
        h.g.b.x.f(mapPositionTrackerNativeManager, "nativeManager");
        h.g.b.x.f(handler, "mainThreadHandler");
        h.g.b.x.f(eVar, "logger");
        this.f28452a = mapPositionTrackerNativeManager;
        this.f28453b = handler;
        this.f28454c = eVar;
        this.f28455d = kotlinx.coroutines.aj.e(jVar);
        this.f28456e = h.a.r.j();
        this.f28457f = h.g.b.o.i();
        mapPositionTrackerNativeManager.addOnPositionUpdatedCallback(new bx(this));
    }

    public static final /* synthetic */ void c(bz bzVar, int i2, com.waze.map.b.dw dwVar) {
        bs bsVar = (bs) bzVar.f28456e.get(Integer.valueOf(i2));
        if (bsVar != null) {
            bzVar.f28453b.postAtFrontOfQueue(new com.google.firebase.appcheck.debug.a.a(bsVar, dwVar, 2, null));
            return;
        }
        bzVar.f28454c.g("No active tracking with id " + i2);
    }

    public static final /* synthetic */ void e(bz bzVar, Map map) {
        Map map2 = bzVar.f28456e;
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Set setKeySet = map.keySet();
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (!setKeySet.contains(numValueOf)) {
                bzVar.f28452a.cancelTracking(iIntValue);
                bzVar.f28456e = h.a.r.l(bzVar.f28456e, numValueOf);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue2 = ((Number) entry.getKey()).intValue();
            bs bsVar = (bs) entry.getValue();
            Set setKeySet2 = map2.keySet();
            Integer numValueOf2 = Integer.valueOf(iIntValue2);
            if (!setKeySet2.contains(numValueOf2)) {
                bzVar.f28456e = h.a.r.p(bzVar.f28456e, new h.k(numValueOf2, bsVar));
                bzVar.f28452a.requestTracking(iIntValue2, bsVar.b());
            }
        }
    }

    public final void f() {
        this.f28457f.s(null);
        kotlinx.coroutines.aj.z(this.f28455d, null, null, new by(this, (h.c.e) null, 0), 3);
    }

    public final void g(kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(kVar, "trackingRequests");
        this.f28457f.s(null);
        this.f28457f = kotlinx.coroutines.aj.z(this.f28455d, null, null, new eu(kVar, this, (h.c.e) null, 1), 3);
    }

    public final boolean h(Cdo cdo) {
        h.g.b.x.f(cdo, "mapState");
        com.waze.ae.e eVarK = cdo.k();
        if (eVarK instanceof ab) {
            return false;
        }
        if (eVarK instanceof ac) {
            return h.g.b.x.n(((ac) eVarK).i(), this.f28452a.getMapId());
        }
        throw new h.i();
    }
}
