package com.waze.an.a.a;

import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ar implements AutoCloseable, com.waze.an.a.ad {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14389a;

    /* renamed from: b, reason: collision with root package name */
    private final am f14390b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.af f14391c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f14392d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f14393e;

    public ar(com.waze.shared_infra.i.e eVar, am amVar, h.c.j jVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(amVar, "notificationAlertsInsightsSource");
        h.g.b.x.f(jVar, "coroutineContext");
        this.f14389a = eVar;
        this.f14390b = amVar;
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(jVar.plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("PlatformInsightsService")));
        this.f14391c = afVarE;
        bn bnVarB = ck.b(h.a.r.j());
        this.f14392d = bnVarB;
        e eVar2 = new e(kotlinx.coroutines.b.ai.L(bnVarB, new ap(this, null)), 2);
        int i2 = bz.f51630a;
        this.f14393e = kotlinx.coroutines.b.ai.V(eVar2, afVarE, by.b(), h.a.i.ao(((Map) bnVarB.d()).values()));
    }

    public static final /* synthetic */ Object b(ar arVar, h.c.e eVar) {
        h.g.b.aq aqVar = new h.g.b.aq();
        aqVar.f48105a = e.c.d.a.p();
        Object objCollect = arVar.f14390b.a().collect(new an(aqVar, arVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    @Override // com.waze.an.a.ad
    public final kotlinx.coroutines.b.k a() {
        return this.f14393e;
    }

    @Override // java.lang.AutoCloseable, com.waze.an.a.ad
    public final void close() {
        kotlinx.coroutines.aj.h(this.f14391c, null);
    }

    public final void e(com.waze.an.a.l lVar) {
        bn bnVar;
        Object objD;
        h.g.b.x.f(lVar, "notificationInsightDescriptor");
        com.waze.an.a.u uVarM = lVar.m();
        Objects.toString(uVarM);
        this.f14389a.a("adding insight id=".concat(String.valueOf(uVarM)));
        do {
            bnVar = this.f14392d;
            objD = bnVar.d();
        } while (!bnVar.f(objD, h.a.r.p((Map) objD, new h.k(lVar.m(), lVar))));
    }

    public final void f(com.waze.an.a.u uVar) {
        bn bnVar;
        Object objD;
        h.g.b.x.f(uVar, "insightId");
        Objects.toString(uVar);
        this.f14389a.a("removing insight id=".concat(String.valueOf(uVar)));
        do {
            bnVar = this.f14392d;
            objD = bnVar.d();
        } while (!bnVar.f(objD, h.a.r.l((Map) objD, uVar)));
    }

    public final boolean g(com.waze.an.a.u uVar) {
        h.g.b.x.f(uVar, "insightId");
        return ((Map) this.f14392d.d()).containsKey(uVar);
    }
}
