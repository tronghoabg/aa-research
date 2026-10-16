package com.waze.perf;

import com.waze.stats.aw;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import l.a.bas;
import l.a.brf;
import l.a.bri;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.perf.tracer.g f33050a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.crash.k f33051b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f33052c;

    /* renamed from: d, reason: collision with root package name */
    private final af f33053d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.main_screen.ae.a.o f33054e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.main_screen.p.a.b.b.r f33055f;

    public j(com.waze.perf.tracer.g gVar, com.waze.crash.k kVar, com.waze.shared_infra.i.e eVar, com.waze.main_screen.ae.a.o oVar, h.c.j jVar) {
        h.g.b.x.f(gVar, "perfTracer");
        h.g.b.x.f(kVar, "firebaseLogger");
        h.g.b.x.f(eVar, "loggerInterface");
        h.g.b.x.f(oVar, "config");
        h.g.b.x.f(jVar, "coroutineContext");
        this.f33050a = gVar;
        this.f33051b = kVar;
        this.f33052c = eVar;
        this.f33054e = oVar;
        this.f33053d = aj.e(jVar.plus(new ae("FirebaseStatsInterceptor")).plus(aj.Q()));
        this.f33055f = oVar.b() ? new com.waze.main_screen.p.a.b.b.r(kVar, eVar) : null;
        eVar.a("started");
    }

    public static final /* synthetic */ void a(j jVar, bas basVar) {
        com.waze.perf.tracer.f fVarA = jVar.f33050a.a(x.f33081c.a());
        try {
            fVarA.c();
            fVarA.a("api", basVar.getApi().name());
            fVarA.a("success", String.valueOf(basVar.getSuccess()));
            fVarA.b("latency_ms", basVar.getLatencyMs());
            fVarA.a("request_queue", basVar.getRequestQueue().name());
            fVarA.a("quality_of_service", basVar.getQualityOfService().name());
            if (basVar.hasClientQueueLatencyMs()) {
                fVarA.b("client_queue_latency_ms", basVar.getClientQueueLatencyMs());
            }
            if (basVar.hasServerProcessingLatencyMs()) {
                fVarA.b("server_processing_latency_ms", basVar.getServerProcessingLatencyMs());
            }
            if (basVar.hasRoundtripLatencyMs()) {
                fVarA.b("roundtrip_latency_ms", basVar.getRoundtripLatencyMs());
            }
            if (basVar.hasRetries()) {
                fVarA.b("retries", basVar.getRetries());
            }
            if (basVar.hasRequestSizeBytes()) {
                fVarA.b("request_size_bytes", basVar.getRequestSizeBytes());
            }
            if (basVar.hasResponseSizeBytes()) {
                fVarA.b("response_size_bytes", basVar.getResponseSizeBytes());
            }
        } finally {
            fVarA.d();
        }
    }

    public final void b() {
        this.f33052c.a("closed");
        aj.h(this.f33053d, null);
    }

    @Override // com.waze.stats.aw
    public final void c(brf brfVar) {
        h.g.b.x.f(brfVar, "payload");
        aj.z(this.f33053d, null, null, new i(brfVar, this, (h.c.e) null, 1), 3);
    }

    @Override // com.waze.stats.aw
    public final void d(bri briVar) {
        h.g.b.x.f(briVar, "payload");
        aj.z(this.f33053d, null, null, new i(this, briVar, (h.c.e) null, 0), 3);
    }
}
