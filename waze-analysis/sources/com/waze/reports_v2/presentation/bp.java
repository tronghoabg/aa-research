package com.waze.reports_v2.presentation;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.reports_v2.c.Cdo;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bp implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final be f34889a;

    /* renamed from: b, reason: collision with root package name */
    private final Cdo f34890b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34891c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.reports_v2.e f34892d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.af f34893e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.reports_v2.c.db f34894f;

    /* renamed from: g, reason: collision with root package name */
    private final ConversationalReportingNonFteHintStateHolder f34895g;

    /* renamed from: h, reason: collision with root package name */
    private final ab f34896h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.bl.d.l f34897i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f34898j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f34899k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.reports_v2.b.aa f34900l;

    public bp(be beVar, Cdo cdo, com.waze.reports_v2.b.aq aqVar, com.waze.reports_v2.c.cr crVar, q qVar, k kVar, m mVar, com.waze.shared_infra.i.e eVar, com.waze.reports_v2.e eVar2, com.waze.bl.d.a aVar) {
        kotlinx.coroutines.b.ch<l> state;
        h.g.b.x.f(beVar, "config");
        h.g.b.x.f(cdo, "statsSender");
        h.g.b.x.f(aqVar, "reportPointsProvider");
        h.g.b.x.f(crVar, "tapReportingEducationHandlerFactory");
        h.g.b.x.f(qVar, "conversationalReportingStateHolderFactory");
        h.g.b.x.f(kVar, "conversationalReportingFteTooltipStateHolderFactory");
        h.g.b.x.f(mVar, "conversationalReportingNonFteHintStateHolderFactory");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(eVar2, "conversationalModeProvider");
        h.g.b.x.f(aVar, "reportAgentStateHolderFactory");
        this.f34889a = beVar;
        this.f34890b = cdo;
        this.f34891c = eVar;
        this.f34892d = eVar2;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, "ReportMenuButtonStateHolder");
        this.f34893e = afVarP;
        this.f34894f = crVar.a();
        com.waze.reports_v2.b.aa aaVarB = kVar.b();
        this.f34900l = aaVarB;
        ConversationalReportingNonFteHintStateHolder conversationalReportingNonFteHintStateHolderA = mVar.a();
        this.f34895g = conversationalReportingNonFteHintStateHolderA;
        this.f34896h = qVar.a(new p(), eVar);
        this.f34897i = aVar.a();
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(new bi(false, null, false));
        this.f34898j = bnVarB;
        bo boVar = new bo(bnVarB, this);
        int i2 = kotlinx.coroutines.b.bz.f51630a;
        this.f34899k = kotlinx.coroutines.b.ai.V(boVar, afVarP, kotlinx.coroutines.b.by.b(), new bg(null, beVar.b(), false));
        kotlinx.coroutines.aj.z(afVarP, null, null, new bj(this, (h.c.e) null, 0), 3);
        if (aaVarB != null) {
            kotlinx.coroutines.aj.z(afVarP, null, null, new bl(aaVarB.d(), this, (h.c.e) null, 0), 3);
        }
        if (conversationalReportingNonFteHintStateHolderA != null && (state = conversationalReportingNonFteHintStateHolderA.getState()) != null) {
            kotlinx.coroutines.aj.z(afVarP, null, null, new bl(state, this, null, 2, null), 3);
        }
        kotlinx.coroutines.aj.z(afVarP, null, null, new bj(this, (h.c.e) null, 2, (byte[]) null), 3);
        kotlinx.coroutines.aj.z(afVarP, null, null, new bj(this, (h.c.e) null, 3, (char[]) null), 3);
        kotlinx.coroutines.aj.z(afVarP, null, null, new bj(this, (h.c.e) null, 4, (short[]) null), 3);
    }

    public static final /* synthetic */ bg d(bp bpVar, bi biVar) {
        bg bgVar = new bg(biVar.a(), bpVar.f34889a.b(), bpVar.q(biVar));
        bpVar.f34891c.a("External state: " + bgVar + " (internal state " + biVar + ")");
        return bgVar;
    }

    public static final /* synthetic */ boolean o(bp bpVar, bi biVar) {
        return !bpVar.q(biVar);
    }

    private final boolean q(bi biVar) {
        return (!biVar.b() ? com.waze.reports_v2.b.f34001a : this.f34892d.a()) instanceof com.waze.reports_v2.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bi r(bi biVar, av avVar) {
        return bi.c(biVar, false, avVar, false, 5);
    }

    public final ConversationalReportingNonFteHintStateHolder b() {
        return this.f34895g;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34896h.close();
        this.f34897i.close();
        kotlinx.coroutines.aj.h(this.f34893e, null);
        ConversationalReportingNonFteHintStateHolder conversationalReportingNonFteHintStateHolder = this.f34895g;
        if (conversationalReportingNonFteHintStateHolder != null) {
            conversationalReportingNonFteHintStateHolder.close();
        }
    }

    public final kotlinx.coroutines.b.ch g() {
        return this.f34899k;
    }

    public final void h(ba baVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        h.g.b.x.f(baVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        Objects.toString(baVar);
        this.f34891c.a("Education aborted, type ".concat(baVar.toString()));
        baVar.a().invoke();
        do {
            bnVar = this.f34898j;
            objD = bnVar.d();
        } while (!bnVar.f(objD, r((bi) objD, null)));
    }

    public final void i(ba baVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        h.g.b.x.f(baVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        Objects.toString(baVar);
        this.f34891c.a("Education ended, type ".concat(baVar.toString()));
        baVar.a().invoke();
        do {
            bnVar = this.f34898j;
            objD = bnVar.d();
        } while (!bnVar.f(objD, r((bi) objD, null)));
    }

    public final void j() {
        this.f34890b.A(com.waze.reports_v2.d.c.f34558b);
    }

    public final void k(boolean z) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        do {
            bnVar = this.f34898j;
            objD = bnVar.d();
        } while (!bnVar.f(objD, bi.c((bi) objD, false, null, z, 3)));
    }

    public final void l() {
        this.f34890b.A(com.waze.reports_v2.d.c.f34559c);
    }

    public final void m() {
        this.f34890b.A(com.waze.reports_v2.d.c.f34561e);
    }

    public final void n() {
        this.f34890b.A(com.waze.reports_v2.d.c.f34560d);
    }
}
