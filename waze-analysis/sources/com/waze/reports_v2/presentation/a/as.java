package com.waze.reports_v2.presentation.a;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.reports_v2.c.Cdo;
import com.waze.reports_v2.c.dn;
import com.waze.reports_v2.c.dr;
import com.waze.reports_v2.c.ea;
import com.waze.reports_v2.c.ee;
import com.waze.reports_v2.c.ef;
import com.waze.reports_v2.c.eg;
import com.waze.reports_v2.c.eh;
import com.waze.reports_v2.c.ei;
import com.waze.reports_v2.c.ej;
import com.waze.reports_v2.c.ek;
import com.waze.reports_v2.c.el;
import com.waze.reports_v2.presentation.ch;
import com.waze.reports_v2.presentation.dc;
import java.util.Objects;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class as implements ba {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.c.k f34665a;

    /* renamed from: b, reason: collision with root package name */
    private final el f34666b;

    /* renamed from: c, reason: collision with root package name */
    private final Cdo f34667c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34668d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.reports_v2.b.aq f34669e;

    /* renamed from: f, reason: collision with root package name */
    private final dc f34670f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.reports_v2.c.dc f34671g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.af f34672h;

    public as(com.waze.reports_v2.c.k kVar, el elVar, dr drVar, Cdo cdo, com.waze.shared_infra.i.e eVar, com.waze.reports_v2.b.aq aqVar, dc dcVar, com.waze.reports_v2.c.dc dcVar2) {
        h.g.b.x.f(kVar, "sendReportUseCase");
        h.g.b.x.f(elVar, "reportingPreconditionsChecker");
        h.g.b.x.f(drVar, "reportingFeedbackConfig");
        h.g.b.x.f(cdo, "statsSender");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(aqVar, "reportPointsProvider");
        h.g.b.x.f(dcVar, "reportResultPresenter");
        h.g.b.x.f(dcVar2, "reportLocationResolver");
        this.f34665a = kVar;
        this.f34666b = elVar;
        this.f34667c = cdo;
        this.f34668d = eVar;
        this.f34669e = aqVar;
        this.f34670f = dcVar;
        this.f34671g = dcVar2;
        this.f34672h = com.waze.ui.a.l.p(this, null);
    }

    static final h.ab f(as asVar, ek ekVar) {
        dn dnVar;
        h.g.b.x.f(ekVar, "it");
        if (h.g.b.x.n(ekVar, ee.f34461a)) {
            dnVar = dn.f34431a;
        } else if (h.g.b.x.n(ekVar, ef.f34462a)) {
            dnVar = dn.f34435e;
        } else if (h.g.b.x.n(ekVar, eg.f34463a)) {
            dnVar = dn.f34437g;
        } else if (h.g.b.x.n(ekVar, eh.f34464a)) {
            dnVar = dn.f34434d;
        } else if (h.g.b.x.n(ekVar, ei.f34465a)) {
            dnVar = dn.f34432b;
        } else {
            if (!h.g.b.x.n(ekVar, ej.f34466a)) {
                throw new h.i();
            }
            dnVar = null;
        }
        if (dnVar != null) {
            asVar.f34667c.F(dnVar);
        }
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(com.waze.shared_infra.h.c r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.reports_v2.presentation.a.ap
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.reports_v2.presentation.a.ap r0 = (com.waze.reports_v2.presentation.a.ap) r0
            int r1 = r0.f34653c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34653c = r1
            goto L18
        L13:
            com.waze.reports_v2.presentation.a.ap r0 = new com.waze.reports_v2.presentation.a.ap
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f34651a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f34653c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            com.waze.reports_v2.c.dc r4 = r4.f34671g
            r0.f34653c = r3
            java.lang.Object r6 = r4.a(r5, r0)
            if (r6 == r1) goto L65
        L3c:
            com.waze.sharedui.e.c r6 = (com.waze.sharedui.e.c) r6
            if (r6 == 0) goto L59
            com.waze.reports_v2.c.eb r4 = new com.waze.reports_v2.c.eb
            java.lang.Long r5 = r6.i()
            if (r5 == 0) goto L51
            long r0 = r5.longValue()
            long r0 = com.waze.settings.h.c.h(r0)
            goto L53
        L51:
            r0 = 0
        L53:
            r4.<init>(r6, r0)
            com.waze.reports_v2.c.ed r4 = (com.waze.reports_v2.c.ed) r4
            return r4
        L59:
            com.waze.reports_v2.c.ec r4 = new com.waze.reports_v2.c.ec
            com.waze.reports_v2.c.dw r5 = com.waze.reports_v2.c.dw.f34452a
            com.waze.reports_v2.c.ea r5 = (com.waze.reports_v2.c.ea) r5
            r4.<init>(r5)
            com.waze.reports_v2.c.ed r4 = (com.waze.reports_v2.c.ed) r4
            return r4
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.presentation.a.as.n(com.waze.shared_infra.h.c, h.c.e):java.lang.Object");
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.aj.h(this.f34672h, bo.g("Closed", null));
    }

    @Override // com.waze.reports_v2.presentation.a.ba
    public final Object e(com.waze.shared_infra.h.c cVar, h.c.e eVar) {
        return cVar == null ? this.f34666b.a(new h.g.a.l() { // from class: com.waze.reports_v2.presentation.a.ao
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return as.f(this.f34650a, (ek) obj);
            }
        }, eVar) : n(cVar, eVar);
    }

    @Override // com.waze.reports_v2.presentation.a.ba
    public final void g(com.waze.reports_v2.presentation.aa aaVar) {
        h.g.b.x.f(aaVar, "conversationalCommand");
        if (aaVar instanceof com.waze.reports_v2.presentation.v) {
            this.f34669e.b(new com.waze.reports_v2.b.ap(((com.waze.reports_v2.presentation.v) aaVar).a(), com.waze.reports_v2.b.ab.f34010b));
        }
    }

    @Override // com.waze.reports_v2.presentation.a.ba
    public final void h(ch chVar) {
        h.g.b.x.f(chVar, "error");
        ch chVar2 = ch.f34947a;
        if (chVar.ordinal() != 0) {
            throw new h.i();
        }
        this.f34667c.F(dn.f34438h);
    }

    @Override // com.waze.reports_v2.presentation.a.ba
    public final void i(com.waze.reports_v2.b.q qVar, com.waze.reports_v2.b.at atVar, com.waze.sharedui.e.c cVar, long j2, com.waze.reports_v2.b.i iVar) {
        h.g.b.x.f(qVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(atVar, "subtype");
        h.g.b.x.f(cVar, "location");
        com.waze.reports_v2.c.e eVarC = this.f34665a.c(atVar, cVar, j2, com.waze.rtalerts.y.f35166a, iVar);
        if (dr.a(qVar)) {
            com.waze.reports_v2.c.f fVarA = eVarC.a();
            com.waze.reports_v2.c.f fVar = com.waze.reports_v2.c.f.f34483a;
            int iOrdinal = fVarA.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                kotlinx.coroutines.aj.z(this.f34672h, null, null, new aq(eVarC, this, qVar, atVar, iVar, null), 3);
                return;
            } else {
                if (iOrdinal != 2) {
                    throw new h.i();
                }
                this.f34670f.c();
                return;
            }
        }
        this.f34670f.b(qVar, atVar, iVar);
        com.waze.reports_v2.c.f fVarA2 = eVarC.a();
        com.waze.reports_v2.c.f fVar2 = com.waze.reports_v2.c.f.f34483a;
        int iOrdinal2 = fVarA2.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1) {
            kotlinx.coroutines.aj.z(this.f34672h, null, null, new ar(eVarC, this, qVar, atVar, null), 3);
        } else if (iOrdinal2 != 2) {
            throw new h.i();
        }
    }

    @Override // com.waze.reports_v2.presentation.a.ba
    public final void j() {
        this.f34667c.A(null);
    }

    @Override // com.waze.reports_v2.presentation.a.ba
    public final void k(ea eaVar) {
        h.g.b.x.f(eaVar, "error");
        Objects.toString(eaVar);
        this.f34668d.g("Command received to show report menu but failed due to: ".concat(eaVar.toString()));
    }

    @Override // com.waze.reports_v2.presentation.a.ba
    public final void m(com.waze.bl.d.a.d dVar) {
        h.g.b.x.f(dVar, "reportAgentCommand");
        if (dVar instanceof com.waze.bl.d.d) {
            com.waze.bl.d.d dVar2 = (com.waze.bl.d.d) dVar;
            if (dVar2.a() > 0) {
                this.f34669e.b(new com.waze.reports_v2.b.ap(dVar2.a(), com.waze.reports_v2.b.ab.f34010b));
            }
        }
    }
}
