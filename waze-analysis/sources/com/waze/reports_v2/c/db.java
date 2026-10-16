package com.waze.reports_v2.c;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class db {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.navigate.eo f34388a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f34389b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.reports_v2.d.j f34390c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.q.r f34391d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f34392e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f34393f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34394g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f34395h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f34396i;

    /* renamed from: j, reason: collision with root package name */
    private kotlinx.coroutines.br f34397j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f34398k;

    public /* synthetic */ db(com.waze.navigate.eo eoVar, kotlinx.coroutines.b.ch chVar, com.waze.reports_v2.d.j jVar, com.waze.shared_infra.q.r rVar, com.waze.shared_infra.q.e eVar) {
        this.f34388a = eoVar;
        this.f34389b = chVar;
        this.f34390c = jVar;
        this.f34391d = rVar;
        this.f34392e = eVar;
        Boolean boolB = ConfigValues.CONFIG_VALUE_INSIGHT_STANDARD_FTE_SHOWN.b();
        h.g.b.x.e(boolB, "getValue(...)");
        this.f34393f = boolB.booleanValue();
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ReportButtonTapReportingEducationStateHandler");
        h.g.b.x.e(eVarD, "create(...)");
        this.f34394g = eVarD;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(null);
        this.f34395h = bnVarB;
        this.f34396i = kotlinx.coroutines.b.ai.U(bnVarB);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (kotlinx.coroutines.aj.q(r4, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object b(com.waze.reports_v2.c.db r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.reports_v2.c.ct
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.reports_v2.c.ct r0 = (com.waze.reports_v2.c.ct) r0
            int r1 = r0.f34367c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34367c = r1
            goto L18
        L13:
            com.waze.reports_v2.c.ct r0 = new com.waze.reports_v2.c.ct
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f34365a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f34367c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r7)
            goto L70
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            e.b.c.b(r7)
            goto L52
        L36:
            e.b.c.b(r7)
            com.waze.navigate.eo r7 = r6.f34388a
            kotlinx.coroutines.b.ch r7 = r7.ah()
            kotlinx.coroutines.b.k r7 = (kotlinx.coroutines.b.k) r7
            com.waze.reports_v2.c.cy r2 = new com.waze.reports_v2.c.cy
            r5 = 0
            r2.<init>(r5, r4, r5)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f34367c = r4
            java.lang.Object r7 = kotlinx.coroutines.b.ai.i(r7, r2, r0)
            if (r7 != r1) goto L52
            goto L6f
        L52:
            com.waze.config.c r7 = com.waze.config.ConfigValues.CONFIG_VALUE_REPORTING_REPORT_BUTTON_EDUCATION_DELAY_SECONDS
            java.lang.Long r7 = r7.b()
            java.lang.String r2 = "getValue(...)"
            h.g.b.x.e(r7, r2)
            java.lang.Number r7 = (java.lang.Number) r7
            long r4 = r7.longValue()
            long r4 = com.waze.settings.h.c.h(r4)
            r0.f34367c = r3
            java.lang.Object r7 = kotlinx.coroutines.aj.q(r4, r0)
            if (r7 != r1) goto L70
        L6f:
            return r1
        L70:
            com.waze.navigate.eo r6 = r6.f34388a
            boolean r6 = r6.T()
            if (r6 == 0) goto L7b
            com.waze.reports_v2.c.cs r6 = com.waze.reports_v2.c.cs.f34361b
            return r6
        L7b:
            com.waze.reports_v2.c.cs r6 = com.waze.reports_v2.c.cs.f34360a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.c.db.b(com.waze.reports_v2.c.db, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object c(com.waze.reports_v2.c.db r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.reports_v2.c.cu
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.reports_v2.c.cu r0 = (com.waze.reports_v2.c.cu) r0
            int r1 = r0.f34370c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34370c = r1
            goto L18
        L13:
            com.waze.reports_v2.c.cu r0 = new com.waze.reports_v2.c.cu
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f34368a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f34370c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r6)
            kotlinx.coroutines.b.ch r5 = r5.f34389b
            kotlinx.coroutines.b.k r5 = (kotlinx.coroutines.b.k) r5
            com.waze.reports_v2.c.cv r6 = new com.waze.reports_v2.c.cv
            r2 = 0
            r4 = 0
            r6.<init>(r2, r4)
            h.g.a.p r6 = (h.g.a.p) r6
            r0.f34370c = r3
            java.lang.Object r5 = kotlinx.coroutines.b.ai.i(r5, r6, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            com.waze.reports_v2.c.cs r5 = com.waze.reports_v2.c.cs.f34362c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.c.db.c(com.waze.reports_v2.c.db, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ void h(db dbVar, cs csVar) {
        dbVar.f34390c.f(csVar);
        ConfigValues.CONFIG_VALUE_REPORTING_REPORT_BUTTON_EDUCATION_SHOWN_TIMESTAMP_EPOCH_SECONDS.d(Long.valueOf(dbVar.f34392e.b().getEpochSecond()));
        ConfigValues.CONFIG_VALUE_REPORTING_REPORT_BUTTON_EDUCATION_SHOWN_COUNTER.d(Long.valueOf(com.waze.realtime_report_feedback.c.e() + 1));
    }

    private final int k() {
        Long lB = ConfigValues.CONFIG_VALUE_REPORTING_REPORT_BUTTON_EDUCATION_SHOWN_TIMESTAMP_EPOCH_SECONDS.b();
        h.g.b.x.e(lB, "getValue(...)");
        int iA = this.f34391d.a(lB.longValue(), this.f34392e.b().getEpochSecond()).a();
        this.f34394g.a("daysSinceLastShown returns: " + iA);
        return iA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
    
        if (r7 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(h.c.e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.waze.reports_v2.c.cw
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.reports_v2.c.cw r0 = (com.waze.reports_v2.c.cw) r0
            int r1 = r0.f34375c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34375c = r1
            goto L18
        L13:
            com.waze.reports_v2.c.cw r0 = new com.waze.reports_v2.c.cw
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f34373a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f34375c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            e.b.c.b(r8)
            goto L98
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            e.b.c.b(r8)
            goto L77
        L37:
            e.b.c.b(r8)
            boolean r8 = r7.f34398k
            if (r8 == 0) goto L3f
            goto L98
        L3f:
            boolean r8 = r7.j()
            if (r8 == 0) goto L98
            r7.f34398k = r4
            kotlinx.coroutines.b.k[] r8 = new kotlinx.coroutines.b.k[r3]
            com.waze.reports_v2.c.cx r2 = new com.waze.reports_v2.c.cx
            r6 = 0
            r2.<init>(r7, r5, r6)
            h.g.a.p r2 = (h.g.a.p) r2
            kotlinx.coroutines.b.k r2 = kotlinx.coroutines.b.ai.E(r2)
            r8[r6] = r2
            com.waze.reports_v2.c.cx r2 = new com.waze.reports_v2.c.cx
            r2.<init>(r7, r5, r3, r5)
            h.g.a.p r2 = (h.g.a.p) r2
            kotlinx.coroutines.b.k r2 = kotlinx.coroutines.b.ai.E(r2)
            r8[r4] = r2
            kotlinx.coroutines.b.k r8 = kotlinx.coroutines.b.ai.I(r8)
            com.waze.reports_v2.c.cy r2 = new com.waze.reports_v2.c.cy
            r2.<init>(r5, r6)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f34375c = r4
            java.lang.Object r8 = kotlinx.coroutines.b.ai.k(r8, r2, r0)
            if (r8 == r1) goto L97
        L77:
            com.waze.reports_v2.c.cs r8 = (com.waze.reports_v2.c.cs) r8
            if (r8 == 0) goto L98
            boolean r2 = r7.j()
            if (r4 == r2) goto L82
            r8 = r5
        L82:
            if (r8 == 0) goto L98
            r0.f34375c = r3
            com.waze.reports_v2.c.da r2 = new com.waze.reports_v2.c.da
            r2.<init>(r7, r8, r5)
            h.g.a.p r2 = (h.g.a.p) r2
            java.lang.Object r7 = kotlinx.coroutines.aj.d(r2, r0)
            if (r7 == r1) goto L95
            h.ab r7 = h.ab.f48028a
        L95:
            if (r7 != r1) goto L98
        L97:
            return r1
        L98:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.c.db.d(h.c.e):java.lang.Object");
    }

    public final kotlinx.coroutines.b.ch g() {
        return this.f34396i;
    }

    public final boolean j() {
        if (!com.waze.realtime_report_feedback.c.f() && !com.waze.realtime_report_feedback.c.g()) {
            this.f34394g.a("Reporting button education not enabled: Config is OFF for nav start and zero speed");
            return false;
        }
        if (ConfigValues.CONFIG_VALUE_INSIGHT_STANDARD_ENABLED.b().booleanValue() && ConfigValues.CONFIG_VALUE_INSIGHT_STANDARD_FTE_ENABLED.b().booleanValue() && !this.f34393f) {
            this.f34394g.a("Reporting button education not enabled in this session: InSight Standard FTE has priority");
            return false;
        }
        com.waze.shared_infra.i.e eVar = this.f34394g;
        int iE = com.waze.realtime_report_feedback.c.e();
        eVar.a("educationShownCounter: " + iE);
        if (iE == 0) {
            return true;
        }
        if (iE != 1) {
            if (iE == 2 && k() >= 4) {
                return true;
            }
        } else if (k() >= 2) {
            return true;
        }
        return false;
    }
}
