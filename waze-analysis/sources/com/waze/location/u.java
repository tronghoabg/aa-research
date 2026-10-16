package com.waze.location;

import android.location.Location;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class u implements y {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f25421a;

    /* renamed from: b, reason: collision with root package name */
    private final w f25422b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ai.a f25423c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f25424d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f25425e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f25426f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f25427g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f25428h;

    /* renamed from: i, reason: collision with root package name */
    private final bq f25429i;

    /* renamed from: j, reason: collision with root package name */
    private final bq f25430j;

    /* renamed from: k, reason: collision with root package name */
    private final ch f25431k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f25432l;
    private final com.waze.c.d.as m;
    private final com.waze.c.d.as n;

    public u(com.waze.shared_infra.i.e eVar, w wVar, com.waze.ai.a aVar, com.waze.shared_infra.q.e eVar2, com.waze.c.d.as asVar, com.waze.c.d.as asVar2) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(wVar, "config");
        h.g.b.x.f(aVar, "statsSender");
        h.g.b.x.f(eVar2, "clock");
        h.g.b.x.f(asVar, "filterStrategy");
        h.g.b.x.f(asVar2, "merger");
        this.f25421a = eVar;
        this.f25422b = wVar;
        this.f25423c = aVar;
        this.f25424d = eVar2;
        this.m = asVar;
        this.n = asVar2;
        this.f25425e = ck.b(new t(null));
        kotlinx.coroutines.b.bn bnVarB = ck.b(null);
        this.f25426f = bnVarB;
        kotlinx.coroutines.a.a aVar2 = kotlinx.coroutines.a.a.f51272b;
        kotlinx.coroutines.b.bm bmVarC = bu.c(8, 8, aVar2);
        this.f25427g = bmVarC;
        kotlinx.coroutines.b.bm bmVarC2 = bu.c(0, 10, aVar2);
        this.f25428h = bmVarC2;
        this.f25429i = kotlinx.coroutines.b.ai.S(bmVarC);
        this.f25430j = kotlinx.coroutines.b.ai.S(bmVarC2);
        this.f25431k = kotlinx.coroutines.b.ai.U(bnVarB);
        this.f25432l = wVar.b();
    }

    @Override // com.waze.location.y
    public final bq a() {
        return this.f25430j;
    }

    @Override // com.waze.location.y
    public final bq b() {
        return this.f25429i;
    }

    @Override // com.waze.location.y
    public final ch c() {
        return this.f25431k;
    }

    @Override // com.waze.location.y
    public final synchronized void d(Location location, bf bfVar) {
        Location locationC;
        com.waze.shared_infra.q.e eVar;
        long jA;
        Location location2;
        Location locationC2 = location;
        synchronized (this) {
            h.g.b.x.f(locationC2, "location");
            h.g.b.x.f(bfVar, "source");
            this.f25427g.c(new x(new Location(locationC2), bfVar));
            boolean zA = this.f25422b.a();
            if (zA) {
                locationC2 = bg.c(locationC2);
            }
            com.waze.shared_infra.i.e eVar2 = this.f25421a;
            eVar2.a("new location: source=" + bfVar + ", location=" + locationC2 + ", reducedAccuracy=" + zA + ", locationTime=" + locationC2.getTime());
            kotlinx.coroutines.b.bn bnVar = this.f25425e;
            long j2 = 0;
            bf bfVar2 = null;
            while (true) {
                Object objD = bnVar.d();
                t tVar = (t) objD;
                com.waze.c.d.as asVar = this.n;
                h.g.b.x.c(locationC2);
                locationC = asVar.c(locationC2, bfVar, tVar.b());
                long j3 = j2;
                t tVarC = tVar.c(bfVar, locationC);
                com.waze.c.d.as asVar2 = this.m;
                eVar = this.f25424d;
                if (asVar2.b(locationC, bfVar, tVarC, eVar)) {
                    bf bfVarD = tVar.d();
                    jA = tVar.a();
                    long jA2 = eVar.a();
                    h.g.b.x.f(bfVar, "source");
                    tVarC = t.f(tVarC, null, null, bfVar, jA2, 3);
                    location2 = locationC;
                    bfVar2 = bfVarD;
                } else {
                    jA = j3;
                    location2 = null;
                }
                if (bnVar.f(objD, tVarC)) {
                    break;
                } else {
                    j2 = jA;
                }
            }
            if (locationC != null) {
                this.f25428h.c(new x(new Location(locationC), bfVar));
            }
            if (location2 == null) {
                eVar2.a("Discarding location with provider=" + locationC2.getProvider() + " from source=" + bfVar);
                return;
            }
            if (bfVar2 != null && bfVar != bfVar2) {
                long jA3 = eVar.a() - jA;
                eVar2.g("Switching location source from " + bfVar2.name() + " to " + bfVar.name() + " time from last location = " + jA3);
                this.f25423c.a(bfVar2, bfVar);
            }
            this.f25426f.e(new Location(location2));
        }
    }

    @Override // com.waze.location.y
    public final boolean e() {
        return this.f25432l;
    }
}
