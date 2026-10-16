package com.waze.main_screen.af.a;

import com.waze.R;
import com.waze.an.a.ae;
import com.waze.an.a.u;
import com.waze.asks.WazeAsksNativeManager;
import com.waze.asks.as;
import com.waze.asks.aw;
import com.waze.asks.q;
import com.waze.asks.v;
import com.waze.asks.x;
import com.waze.reports_v2.b.ab;
import com.waze.reports_v2.b.ap;
import com.waze.reports_v2.b.aq;
import com.waze.reports_v2.d.j;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final j f25772a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f25773b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.an.d.b f25774c;

    /* renamed from: d, reason: collision with root package name */
    private final v f25775d;

    /* renamed from: e, reason: collision with root package name */
    private final aq f25776e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f25777f;

    /* renamed from: g, reason: collision with root package name */
    private final x f25778g;

    /* renamed from: h, reason: collision with root package name */
    private final WazeAsksNativeManager f25779h;

    /* renamed from: i, reason: collision with root package name */
    private final af f25780i;

    /* renamed from: j, reason: collision with root package name */
    private final bn f25781j;

    /* renamed from: k, reason: collision with root package name */
    private final ch f25782k;

    public i(j jVar, com.waze.shared_infra.i.e eVar, com.waze.an.d.b bVar, v vVar, aq aqVar, com.waze.shared_infra.o.a aVar, x xVar, WazeAsksNativeManager wazeAsksNativeManager, h.c.j jVar2) {
        h.g.b.x.f(jVar, "reportingStatsSender");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(bVar, "notificationInsightsService");
        h.g.b.x.f(vVar, "wazeAsksApi");
        h.g.b.x.f(aqVar, "reportPointsProvider");
        h.g.b.x.f(aVar, "stringsProvider");
        h.g.b.x.f(xVar, "config");
        h.g.b.x.f(wazeAsksNativeManager, "nativeManager");
        h.g.b.x.f(jVar2, "coroutineContext");
        this.f25772a = jVar;
        this.f25773b = eVar;
        this.f25774c = bVar;
        this.f25775d = vVar;
        this.f25776e = aqVar;
        this.f25777f = aVar;
        this.f25778g = xVar;
        this.f25779h = wazeAsksNativeManager;
        af afVarE = aj.e(jVar2);
        this.f25780i = afVarE;
        bn bnVarB = ck.b(null);
        this.f25781j = bnVarB;
        k kVarL = ai.L(bnVarB, new a(this, null));
        int i2 = bz.f51630a;
        this.f25782k = ai.V(kVarL, afVarE, by.c(), bnVarB.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object b(com.waze.main_screen.af.a.i r4, com.waze.asks.q r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.main_screen.af.a.b
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.main_screen.af.a.b r0 = (com.waze.main_screen.af.a.b) r0
            int r1 = r0.f25758c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25758c = r1
            goto L18
        L13:
            com.waze.main_screen.af.a.b r0 = new com.waze.main_screen.af.a.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25756a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f25758c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            com.waze.asks.v r6 = r4.f25775d
            r0.f25758c = r3
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.waze.asks.t r6 = (com.waze.asks.t) r6
            com.waze.asks.r r5 = com.waze.asks.r.f15634a
            boolean r5 = h.g.b.x.n(r6, r5)
            if (r5 == 0) goto L51
            com.waze.shared_infra.i.e r4 = r4.f25773b
            java.lang.String r5 = "Could not send answer, api returned error"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.b(r5)
            goto La0
        L51:
            boolean r5 = r6 instanceof com.waze.asks.s
            if (r5 == 0) goto La3
            com.waze.asks.s r6 = (com.waze.asks.s) r6
            long r0 = r6.a()
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L87
            com.waze.shared_infra.i.e r5 = r4.f25773b
            long r0 = r6.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "User got "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " points"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.a(r0)
            long r5 = r6.a()
            r4.m(r5)
            goto La0
        L87:
            com.waze.shared_infra.i.e r4 = r4.f25773b
            long r5 = r6.a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Got invalid points "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.b(r5)
        La0:
            h.ab r4 = h.ab.f48028a
            return r4
        La3:
            h.i r4 = new h.i
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.af.a.i.b(com.waze.main_screen.af.a.i, com.waze.asks.q, h.c.e):java.lang.Object");
    }

    private final void k(as asVar, com.waze.asks.d dVar) {
        aj.z(this.f25780i, null, null, new c(this, new q(asVar.e(), asVar.f(), dVar.c()), dVar, asVar, null), 3);
    }

    private final void l(as asVar, com.waze.asks.d dVar) {
        this.f25779h.sendEnrichAlertAnswer(asVar, dVar);
        m(dVar.a());
    }

    private final void m(long j2) {
        this.f25776e.b(new ap((int) j2, ab.f34011c));
    }

    public final ch d() {
        return this.f25782k;
    }

    public final void f() {
        this.f25773b.g("Waze Asks flow aborted without closing");
    }

    public final void g(as asVar) {
        h.g.b.x.f(asVar, "question");
        this.f25773b.g("Waze Asks flow dismissed by timeout (" + asVar + ")");
        this.f25772a.I(asVar, com.waze.reports_v2.d.i.f34593b);
        this.f25781j.e(null);
    }

    public final void h(as asVar) {
        h.g.b.x.f(asVar, "question");
        this.f25773b.g("Waze Asks flow dismissed by user (" + asVar + ")");
        this.f25772a.I(asVar, com.waze.reports_v2.d.i.f34592a);
        this.f25781j.e(null);
    }

    public final void i(as asVar, com.waze.asks.d dVar) {
        h.g.b.x.f(asVar, "question");
        h.g.b.x.f(dVar, "answer");
        com.waze.shared_infra.i.e eVar = this.f25773b;
        eVar.a("Waze Asks flow ended with " + dVar + " for " + asVar);
        if (!asVar.i()) {
            aw awVarD = asVar.d();
            aw awVar = aw.f15546a;
            int iOrdinal = awVarD.ordinal();
            if (iOrdinal == 0) {
                eVar.g("Unknown Waze asks question source, using newInfraEnabled flag to decide what send answer endpoint to use");
                if (this.f25778g.c()) {
                    l(asVar, dVar);
                } else {
                    k(asVar, dVar);
                }
            } else if (iOrdinal == 1) {
                k(asVar, dVar);
            } else {
                if (iOrdinal != 2) {
                    throw new h.i();
                }
                if (this.f25778g.c()) {
                    l(asVar, dVar);
                } else {
                    eVar.g("got waze asks question from new infra, but newInfraEnabled flag is disabled, can't send answer.");
                }
            }
        }
        u uVar = new u("WazeAsksController.thankYou", ae.f14545a);
        com.waze.shared_infra.o.a aVar = this.f25777f;
        if (com.waze.an.c.q.b(this.f25774c, uVar, new com.waze.an.a.k(aVar.c(R.string.WAZE_ASKS_THANKS_FOR_REPORTING_TITLE, new Object[0]), aVar.c(R.string.WAZE_ASKS_THANKS_FOR_REPORTING_MESSAGE, new Object[0]), Integer.valueOf(R.drawable.icon_report_check), new com.waze.an.a.j(this.f25778g.b(), new com.waze.main_screen.c.g.a(18), null), h.a.i.h()), null, null, 28)) {
            eVar.a("Thank You scheduled to be shown in insight");
        } else {
            eVar.a("Thank You already there, cannot be added");
        }
        this.f25772a.G(asVar, dVar);
        this.f25781j.e(null);
    }

    public final void j(as asVar) {
        h.g.b.x.f(asVar, "question");
        as asVar2 = asVar;
        this.f25779h.onQuestionShown(asVar2);
        this.f25772a.J(asVar2, false);
    }
}
