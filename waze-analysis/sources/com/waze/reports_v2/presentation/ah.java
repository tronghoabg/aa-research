package com.waze.reports_v2.presentation;

import com.waze.config.ConfigValues;
import java.util.Locale;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ah implements ab {

    /* renamed from: a, reason: collision with root package name */
    private final bb f34777a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34778b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.reports_v2.c.ao f34779c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.m.a f34780d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.reports_v2.c.bj f34781e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.reports_v2.c.br f34782f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.af f34783g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f34784h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f34785i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f34786j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f34787k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f34788l;
    private final kotlinx.coroutines.b.bq m;

    public ah(bb bbVar, com.waze.shared_infra.i.e eVar, p pVar, com.waze.reports_v2.c.ao aoVar, com.waze.shared_infra.m.a aVar, com.waze.reports_v2.c.bj bjVar, com.waze.reports_v2.c.br brVar) {
        h.g.b.x.f(bbVar, "categoriesTransformer");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(pVar, "config");
        h.g.b.x.f(aoVar, "conversationalReportingConfig");
        h.g.b.x.f(aVar, "mediaVolumeRepository");
        h.g.b.x.f(bjVar, "controller");
        h.g.b.x.f(brVar, "reportMenuOnboardingController");
        this.f34777a = bbVar;
        this.f34778b = eVar;
        this.f34779c = aoVar;
        this.f34780d = aVar;
        this.f34781e = bjVar;
        this.f34782f = brVar;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, null);
        this.f34783g = afVarP;
        boolean z = ((int) ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_USER_REPORTED_SUCCESSFULLY_COUNT.b().longValue()) >= ((int) ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_VOICE_FOCUSED_MINIMUM_SUCCESSFULL_REPORTS.b().longValue()) && !brVar.b();
        this.f34784h = z;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(new com.waze.ui.w.b.am(new com.waze.ui.w.b.w(null), z, aoVar.k()));
        this.f34786j = bnVarB;
        this.f34787k = kotlinx.coroutines.b.ai.U(bnVarB);
        kotlinx.coroutines.b.bm bmVarE = kotlinx.coroutines.b.bu.e(0, 0, null, 7);
        this.f34788l = bmVarE;
        this.m = kotlinx.coroutines.b.ai.S(bmVarE);
        kotlinx.coroutines.aj.z(afVarP, null, null, new ad(this, null), 3);
        kotlinx.coroutines.aj.z(afVarP, null, null, new af(this, null), 3);
    }

    public static final /* synthetic */ void g(ah ahVar, com.waze.ui.w.b.bg bgVar) {
        Objects.toString(bgVar);
        ahVar.f34778b.a("Cancel command called with reason: ".concat(String.valueOf(bgVar)));
        ahVar.q(new com.waze.ui.w.b.t(bgVar));
        ahVar.o(new t(bgVar));
    }

    public static final /* synthetic */ void h(ah ahVar, com.waze.ui.w.b.ab abVar) {
        ahVar.q(new com.waze.ui.w.b.u(abVar));
        ahVar.o(new w(abVar));
    }

    public static final /* synthetic */ void i(ah ahVar, String str) {
        ahVar.q(com.waze.ui.w.b.aa.f43565a);
        ahVar.o(new x(str));
    }

    public static final /* synthetic */ void k(ah ahVar, com.waze.reports_v2.b.at atVar, int i2) {
        com.waze.ui.w.b.au auVarE;
        com.waze.ui.w.b.bj bjVarC = null;
        if (atVar != null && (auVarE = ahVar.f34777a.e(atVar)) != null) {
            bjVarC = auVarE.c();
        }
        ahVar.q(new com.waze.ui.w.b.z(bjVarC));
        ahVar.o(new v(atVar, bjVarC, i2));
        p(s.f35069a);
    }

    public static final /* synthetic */ void l(ah ahVar, int i2) {
        if (i2 <= 0 || !h.g.b.x.n(((com.waze.ui.w.b.am) ahVar.f34787k.d()).c(), new com.waze.ui.w.b.u(com.waze.ui.w.b.ab.f43568c))) {
            return;
        }
        ahVar.f34786j.e(new com.waze.ui.w.b.am(new com.waze.ui.w.b.w(null), ahVar.f34784h, ahVar.f34779c.k()));
        ahVar.f34785i = true;
        ahVar.f34781e.k(com.waze.reports_v2.c.av.f34225a);
    }

    public static final /* synthetic */ void m(ah ahVar) {
        Integer num = (Integer) ahVar.f34780d.a().d();
        if (num != null && num.intValue() == 0) {
            ahVar.f34781e.k(new com.waze.reports_v2.c.au(bx.b(com.waze.ui.w.b.ab.f43568c)));
            return;
        }
        if (!ahVar.f34785i) {
            Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_FTE_HINT_ENABLED.b();
            h.g.b.x.e(boolB, "getValue(...)");
            if (boolB.booleanValue() && p.b() < ((int) ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_FTE_HINT_MAX_TIMES.b().longValue())) {
                String strB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_FTE_HINT_PATTERN.b();
                h.g.b.x.e(strB, "getValue(...)");
                String lowerCase = strB.toLowerCase(Locale.ROOT);
                h.g.b.x.e(lowerCase, "toLowerCase(...)");
                String str = lowerCase;
                Character chK = h.n.o.K(str, p.b());
                if (chK == null) {
                    chK = h.n.o.L(str);
                }
                com.waze.ui.w.b.an anVar = (chK != null && chK.charValue() == 'a') ? com.waze.ui.w.b.an.f43590a : (chK != null && chK.charValue() == 'b') ? com.waze.ui.w.b.an.f43591b : (chK != null && chK.charValue() == 'c') ? com.waze.ui.w.b.an.f43592c : com.waze.ui.w.b.an.f43592c;
                ahVar.q(new com.waze.ui.w.b.v(anVar));
                ahVar.o(new y(anVar));
                return;
            }
        }
        ahVar.f34785i = false;
        ahVar.q(new com.waze.ui.w.b.x((byte[]) null));
        ahVar.o(z.f35082a);
    }

    private final void o(aa aaVar) {
        kotlinx.coroutines.aj.z(this.f34783g, null, null, new ag(this, aaVar, null), 3);
    }

    private static final void p(s sVar) {
        String strA;
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_LAST_SUCCESSFUL_REPORT_TYPE;
        if (sVar == null || (strA = sVar.a()) == null) {
            strA = "";
        }
        dVar.d(strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(com.waze.ui.d.s sVar) {
        this.f34786j.e(new com.waze.ui.w.b.am(sVar, this.f34784h, this.f34779c.k()));
    }

    @Override // com.waze.reports_v2.presentation.ab
    public final kotlinx.coroutines.b.bq a() {
        return this.m;
    }

    @Override // com.waze.reports_v2.presentation.ab
    public final kotlinx.coroutines.b.ch b() {
        return this.f34787k;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    @Override // com.waze.reports_v2.presentation.ab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.waze.ui.w.a.b r6) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.presentation.ah.c(com.waze.ui.w.a.b):void");
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.aj.h(this.f34783g, null);
    }
}
