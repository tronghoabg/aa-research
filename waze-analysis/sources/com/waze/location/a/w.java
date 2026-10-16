package com.waze.location.a;

import android.location.Location;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class w implements com.waze.shared_infra.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f25221a;

    /* renamed from: b, reason: collision with root package name */
    private final b f25222b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.location.y f25223c;

    /* renamed from: d, reason: collision with root package name */
    private final List f25224d;

    /* renamed from: e, reason: collision with root package name */
    private final n f25225e;

    /* renamed from: f, reason: collision with root package name */
    private final h f25226f;

    /* renamed from: g, reason: collision with root package name */
    private final p f25227g;

    /* renamed from: h, reason: collision with root package name */
    private final String f25228h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f25229i;

    /* renamed from: j, reason: collision with root package name */
    private List f25230j;

    public w(com.waze.shared_infra.i.e eVar, b bVar, com.waze.location.y yVar, List list, n nVar, h hVar, p pVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(bVar, "locationClock");
        h.g.b.x.f(yVar, "locationEvents");
        h.g.b.x.f(list, "detectors");
        h.g.b.x.f(nVar, "statsReporter");
        h.g.b.x.f(hVar, "presenter");
        h.g.b.x.f(pVar, "config");
        this.f25221a = eVar;
        this.f25222b = bVar;
        this.f25223c = yVar;
        this.f25224d = list;
        this.f25225e = nVar;
        this.f25226f = hVar;
        this.f25227g = pVar;
        this.f25228h = "LocationMonitor";
        this.f25229i = new LinkedHashMap();
        this.f25230j = h.a.i.h();
    }

    public static final /* synthetic */ a a(w wVar, a aVar, Instant instant) {
        long epochMilli = instant.toEpochMilli() - aVar.b().toEpochMilli();
        p pVar = wVar.f25227g;
        if (epochMilli >= h.o.a.m(pVar.a())) {
            if (pVar.d() && (aVar.a() instanceof i)) {
                com.waze.shared_infra.i.e eVar = wVar.f25221a;
                l lVarA = aVar.a();
                Objects.toString(lVarA);
                eVar.a("presenting location inconsistency issue: ".concat(String.valueOf(lVarA)));
                wVar.f25226f.g((i) aVar.a());
            }
            Instant instantC = aVar.c();
            if (instantC == null || instant.toEpochMilli() - instantC.toEpochMilli() >= h.o.a.m(pVar.b())) {
                com.waze.shared_infra.i.e eVar2 = wVar.f25221a;
                l lVarA2 = aVar.a();
                Objects.toString(lVarA2);
                eVar2.g("location monitor reporting issue: ".concat(String.valueOf(lVarA2)));
                wVar.f25225e.a(aVar.a());
                return a.d(aVar.f25172a, aVar.f25173b, instant);
            }
        }
        return aVar;
    }

    public static final /* synthetic */ List e(w wVar, Instant instant) {
        Object next;
        List list = wVar.f25224d;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVarA = ((m) it.next()).a(wVar.f25229i, instant.toEpochMilli());
            if (lVarA != null) {
                arrayList.add(lVarA);
            }
        }
        ArrayList<l> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(h.a.i.q(arrayList2, 10));
        for (l lVar : arrayList2) {
            Iterator it2 = wVar.f25230j.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((a) next).a().getClass() == lVar.getClass()) {
                    break;
                }
            }
            a aVar = (a) next;
            arrayList3.add(aVar == null ? new a(lVar, instant, null) : a.d(lVar, aVar.b(), aVar.c()));
        }
        return arrayList3;
    }

    public static final /* synthetic */ void g(w wVar, Location location, y yVar, Instant instant) {
        Map map = wVar.f25229i;
        c cVar = (c) map.get(yVar);
        long epochMilli = instant.toEpochMilli();
        wVar.f25221a.a("updating location: location=" + location + ", locationProvider=" + yVar + ", prevData=" + cVar + ", realtimeElapsedMs=" + epochMilli);
        map.put(yVar, new c(location, epochMilli, (cVar != null && cVar.c().getLatitude() == location.getLatitude() && cVar.c().getLongitude() == location.getLongitude()) ? cVar.b() : epochMilli));
    }

    @Override // com.waze.shared_infra.a.c
    public final Object b(h.c.e eVar) {
        p pVar = this.f25227g;
        boolean zC = pVar.c();
        com.waze.shared_infra.i.e eVar2 = this.f25221a;
        if (!zC) {
            eVar2.g("location monitor is disabled");
            return h.ab.f48028a;
        }
        eVar2.g("location monitor started: detectors=" + this.f25224d + ", minReportInterval=" + h.o.a.y(pVar.b()));
        Object objCollect = ai.I(new ab(this.f25223c.b(), 1), ai.E(new v(null))).collect(new u(this), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    @Override // com.waze.shared_infra.a.c
    public final String c() {
        return this.f25228h;
    }
}
