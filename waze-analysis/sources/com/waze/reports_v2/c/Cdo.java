package com.waze.reports_v2.c;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.List;
import l.a.om;

/* compiled from: WazeSource */
/* renamed from: com.waze.reports_v2.c.do, reason: invalid class name */
/* loaded from: classes7.dex */
public final class Cdo implements com.waze.reports_v2.d.j {

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.reports_v2.d.j f34442b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.config.b f34443c;

    public Cdo(com.waze.reports_v2.d.j jVar, com.waze.config.b bVar) {
        h.g.b.x.f(jVar, "reportingStatsSender");
        h.g.b.x.f(bVar, "simplifiedClosureFlowConfig");
        this.f34442b = jVar;
        this.f34443c = bVar;
    }

    @Override // com.waze.reports_v2.d.j
    public final void A(com.waze.reports_v2.d.c cVar) {
        this.f34442b.A(cVar);
    }

    @Override // com.waze.reports_v2.d.j
    public final void B(com.waze.reports_v2.b.q qVar, com.waze.reports_v2.b.at atVar) {
        h.g.b.x.f(qVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(atVar, "subtype");
        this.f34442b.B(qVar, atVar);
    }

    @Override // com.waze.reports_v2.d.j
    public final void C(com.waze.reports_v2.d.f fVar, ck ckVar, cl clVar, com.waze.reports_v2.d.h hVar) {
        h.g.b.x.f(fVar, "action");
        h.g.b.x.f(hVar, "level");
        this.f34442b.C(fVar, ckVar, clVar, hVar);
    }

    @Override // com.waze.reports_v2.d.j
    public final void D(com.waze.reports_v2.d.g gVar, ck ckVar, cl clVar, com.waze.reports_v2.d.h hVar, dm dmVar, Boolean bool) {
        h.g.b.x.f(gVar, "action");
        h.g.b.x.f(hVar, "level");
        this.f34442b.D(gVar, ckVar, clVar, hVar, dmVar, bool);
    }

    @Override // com.waze.reports_v2.d.j
    public final void E(List list, List list2, com.waze.reports_v2.d.h hVar, boolean z) {
        h.g.b.x.f(hVar, "level");
        this.f34442b.E(list, list2, hVar, z);
    }

    @Override // com.waze.reports_v2.d.j
    public final void F(dn dnVar) {
        h.g.b.x.f(dnVar, "reason");
        this.f34442b.F(dnVar);
    }

    @Override // com.waze.reports_v2.d.j
    public final void G(com.waze.asks.as asVar, com.waze.asks.d dVar) {
        h.g.b.x.f(asVar, "question");
        h.g.b.x.f(dVar, "answer");
        this.f34442b.G(asVar, dVar);
    }

    @Override // com.waze.reports_v2.d.j
    public final void H(com.waze.asks.at atVar, com.waze.asks.f fVar) {
        h.g.b.x.f(atVar, "question");
        h.g.b.x.f(fVar, "answer");
        this.f34442b.H(atVar, fVar);
    }

    @Override // com.waze.reports_v2.d.j
    public final void I(com.waze.asks.av avVar, com.waze.reports_v2.d.i iVar) {
        h.g.b.x.f(avVar, "question");
        h.g.b.x.f(iVar, "reason");
        this.f34442b.I(avVar, iVar);
    }

    @Override // com.waze.reports_v2.d.j
    public final void J(com.waze.asks.av avVar, boolean z) {
        h.g.b.x.f(avVar, "question");
        this.f34442b.J(avVar, z);
    }

    public final void K(ck ckVar, cl clVar, boolean z) {
        if (z) {
            C(com.waze.reports_v2.d.f.f34580b, ckVar, clVar, com.waze.reports_v2.d.h.f34590b);
        } else {
            D(com.waze.reports_v2.d.g.f34584c, ckVar, clVar, com.waze.reports_v2.d.h.f34590b, null, (ckVar != null ? ckVar.b() : null) == com.waze.reports_v2.b.ad.f34020d ? this.f34443c.b() : null);
        }
    }

    public final void L(com.waze.reports_v2.b.q qVar, com.waze.reports_v2.b.at atVar) {
        h.g.b.x.f(qVar, "category");
        h.g.b.x.f(atVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        D(com.waze.reports_v2.d.g.f34585d, new ck(qVar), new cl(atVar), com.waze.reports_v2.d.h.f34590b, dm.f34427a, false);
    }

    public final void M(dl dlVar) {
        h.g.b.x.f(dlVar, "reason");
        D(com.waze.reports_v2.b.n.f(dlVar), null, null, com.waze.reports_v2.d.h.f34590b, dm.f34427a, null);
    }

    public final void N(List list) {
        h.g.b.x.f(list, "availableTypes");
        E(null, list, com.waze.reports_v2.d.h.f34590b, false);
    }

    @Override // com.waze.reports_v2.d.j
    public final void O(om omVar, String str, String str2) {
        h.g.b.x.f(omVar, "component");
        h.g.b.x.f(str, "uiLanguage");
        h.g.b.x.f(str2, "ttsLanguage");
        this.f34442b.O(omVar, str, str2);
    }

    @Override // com.waze.reports_v2.d.j
    public final void P(com.waze.reports_v2.d.e eVar, int i2, int i3, com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(eVar, "action");
        this.f34442b.P(eVar, i2, i3, cVar);
    }

    public final void a() {
        this.f34442b.D(com.waze.reports_v2.d.g.f34587f, null, null, com.waze.reports_v2.d.h.f34589a, null, false);
    }

    public final void b(ck ckVar, cl clVar) {
        D(com.waze.reports_v2.d.g.f34583b, ckVar, clVar, com.waze.reports_v2.d.h.f34590b, null, (ckVar != null ? ckVar.b() : null) == com.waze.reports_v2.b.ad.f34020d ? this.f34443c.b() : null);
    }

    public final void c(dm dmVar, dl dlVar) {
        h.g.b.x.f(dlVar, "reason");
        D(com.waze.reports_v2.b.n.f(dlVar), null, null, com.waze.reports_v2.d.h.f34589a, dmVar, null);
    }

    public final void d(dm dmVar, ck ckVar) {
        h.g.b.x.f(ckVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        D(com.waze.reports_v2.d.g.f34585d, ckVar, null, com.waze.reports_v2.d.h.f34589a, dmVar, false);
    }

    public final void e(List list, boolean z) {
        h.g.b.x.f(list, "availableTypes");
        E(list, null, com.waze.reports_v2.d.h.f34589a, z);
    }

    @Override // com.waze.reports_v2.d.j
    public final void f(cs csVar) {
        h.g.b.x.f(csVar, "trigger");
        this.f34442b.f(csVar);
    }

    @Override // com.waze.reports_v2.d.j
    public final void g() {
        this.f34442b.g();
    }

    @Override // com.waze.reports_v2.d.j
    public final void h(com.waze.reports_v2.b.r rVar) {
        h.g.b.x.f(rVar, "closureReportData");
        this.f34442b.h(rVar);
    }

    @Override // com.waze.reports_v2.d.j
    public final void i(com.waze.reports_v2.d.a aVar, Integer num, Integer num2) {
        h.g.b.x.f(aVar, "action");
        this.f34442b.i(aVar, num, num2);
    }

    @Override // com.waze.reports_v2.d.j
    public final void j(String str, String str2, Long l2, com.waze.reports_v2.b.at atVar, String str3) {
        this.f34442b.j(str, str2, l2, atVar, str3);
    }

    @Override // com.waze.reports_v2.d.j
    public final void k(String str, String str2, aq aqVar) {
        h.g.b.x.f(aqVar, "cancelReason");
        this.f34442b.k(str, str2, aqVar);
    }

    @Override // com.waze.reports_v2.d.j
    public final void l(String str, String str2, ar arVar) {
        h.g.b.x.f(arVar, "failureReason");
        this.f34442b.l(str, str2, arVar);
    }

    @Override // com.waze.reports_v2.d.j
    public final void m() {
        this.f34442b.m();
    }

    @Override // com.waze.reports_v2.d.j
    public final void n() {
        this.f34442b.n();
    }

    @Override // com.waze.reports_v2.d.j
    public final void o() {
        this.f34442b.o();
    }

    @Override // com.waze.reports_v2.d.j
    public final void p() {
        this.f34442b.p();
    }

    @Override // com.waze.reports_v2.d.j
    public final void q() {
        this.f34442b.q();
    }

    @Override // com.waze.reports_v2.d.j
    public final void r() {
        this.f34442b.r();
    }

    @Override // com.waze.reports_v2.d.j
    public final void s() {
        this.f34442b.s();
    }

    @Override // com.waze.reports_v2.d.j
    public final void t(String str, String str2) {
        h.g.b.x.f(str, "ugcContextId");
        h.g.b.x.f(str2, "conversationId");
        this.f34442b.t(str, str2);
    }

    @Override // com.waze.reports_v2.d.j
    public final void u(String str, String str2, String str3, int i2, String str4, com.waze.reports_v2.b.ac acVar) {
        h.g.b.x.f(str3, "messageText");
        h.g.b.x.f(str4, "languageLocale");
        h.g.b.x.f(acVar, HintConstants.AUTOFILL_HINT_GENDER);
        this.f34442b.u(str, str2, str3, i2, str4, acVar);
    }

    @Override // com.waze.reports_v2.d.j
    public final void v(String str, String str2, String str3, int i2, String str4, com.waze.reports_v2.b.ac acVar) {
        h.g.b.x.f(str3, "messageText");
        h.g.b.x.f(str4, "languageLocale");
        h.g.b.x.f(acVar, HintConstants.AUTOFILL_HINT_GENDER);
        this.f34442b.v(str, str2, str3, i2, str4, acVar);
    }

    @Override // com.waze.reports_v2.d.j
    public final void w(com.waze.reports_v2.b.ab abVar) {
        h.g.b.x.f(abVar, "rewardSource");
        this.f34442b.w(abVar);
    }

    @Override // com.waze.reports_v2.d.j
    public final void x(com.waze.reports_v2.b.ab abVar) {
        h.g.b.x.f(abVar, "rewardSource");
        this.f34442b.x(abVar);
    }

    @Override // com.waze.reports_v2.d.j
    public final void y(com.waze.reports_v2.d.d dVar, ck ckVar) {
        h.g.b.x.f(dVar, "action");
        this.f34442b.y(dVar, ckVar);
    }

    @Override // com.waze.reports_v2.d.j
    public final void z() {
        this.f34442b.z();
    }
}
