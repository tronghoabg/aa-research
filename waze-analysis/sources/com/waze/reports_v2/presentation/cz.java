package com.waze.reports_v2.presentation;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.reports_v2.c.Cdo;
import com.waze.reports_v2.c.dj;
import com.waze.reports_v2.c.dm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cz extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.c.n f34997a;

    /* renamed from: b, reason: collision with root package name */
    private final bb f34998b;

    /* renamed from: c, reason: collision with root package name */
    private final db f34999c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f35000d;

    /* renamed from: e, reason: collision with root package name */
    private final Cdo f35001e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.reports_v2.c.q f35002f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.map.b.ai f35003g;

    /* renamed from: h, reason: collision with root package name */
    private final ab f35004h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.bl.d.a.f f35005i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.reports_v2.e f35006j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.reports_v2.c.br f35007k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f35008l;
    private kotlinx.coroutines.br m;
    private final kotlinx.coroutines.b.bm n;
    private com.waze.reports_v2.b.r o;
    private com.waze.shared_infra.s.d p;
    private final com.waze.bl.d.l q;
    private final kotlinx.coroutines.b.bn r;
    private final kotlinx.coroutines.b.ch s;
    private final CompletableDeferred t;
    private final kotlinx.coroutines.b.bm u;
    private final kotlinx.coroutines.b.bq v;

    public cz(com.waze.reports_v2.c.n nVar, bb bbVar, db dbVar, com.waze.shared_infra.q.e eVar, Cdo cdo, com.waze.reports_v2.c.q qVar, com.waze.map.b.ai aiVar, ab abVar, com.waze.bl.d.a aVar, com.waze.bl.d.a.f fVar, com.waze.reports_v2.e eVar2, com.waze.reports_v2.c.br brVar) {
        h.g.b.x.f(nVar, "categoriesUseCase");
        h.g.b.x.f(bbVar, "categoriesTransformer");
        h.g.b.x.f(dbVar, "config");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(cdo, "statsSender");
        h.g.b.x.f(qVar, "closureReportDataProvider");
        h.g.b.x.f(aiVar, "mapController");
        h.g.b.x.f(abVar, "conversationalReportingStateHolder");
        h.g.b.x.f(aVar, "reportAgentStateHolderFactory");
        h.g.b.x.f(fVar, "closureMapPresenter");
        h.g.b.x.f(eVar2, "conversationalModeProvider");
        h.g.b.x.f(brVar, "conversationalReportingOnboardingController");
        this.f34997a = nVar;
        this.f34998b = bbVar;
        this.f34999c = dbVar;
        this.f35000d = eVar;
        this.f35001e = cdo;
        this.f35002f = qVar;
        this.f35003g = aiVar;
        this.f35004h = abVar;
        this.f35005i = fVar;
        this.f35006j = eVar2;
        this.f35007k = brVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ReportMenuViewModel");
        h.g.b.x.e(eVarD, "create(...)");
        this.f35008l = eVarD;
        this.n = kotlinx.coroutines.b.bu.e(0, 1, kotlinx.coroutines.a.a.f51272b, 1);
        com.waze.bl.d.l lVarA = aVar.a();
        this.q = lVarA;
        addCloseable((AutoCloseable) lVarA);
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(com.waze.ui.w.b.bb.f43634a);
        this.r = bnVarB;
        this.s = kotlinx.coroutines.b.ai.U(bnVarB);
        this.t = kotlinx.coroutines.bo.j();
        kotlinx.coroutines.b.bm bmVarE = kotlinx.coroutines.b.bu.e(0, 0, null, 7);
        this.u = bmVarE;
        this.v = kotlinx.coroutines.b.ai.T(kotlinx.coroutines.b.ai.S(bmVarE), new cj(this, null));
    }

    private final void A() {
        com.waze.shared_infra.s.d dVar = this.p;
        if (dVar != null) {
            dVar.a();
        }
        this.p = null;
    }

    private final void B(boolean z, com.waze.reports_v2.b.q qVar, com.waze.reports_v2.b.at atVar) {
        com.waze.ui.w.b.bh bhVarF;
        int i2 = ci.f34949a;
        ci.a().set(false);
        kotlinx.coroutines.br brVar = this.m;
        if (brVar != null) {
            brVar.s(null);
        }
        A();
        com.waze.ui.w.b.ap apVarY = y();
        com.waze.reports_v2.b.q qVarB = (apVarY == null || (bhVarF = apVarY.f()) == null) ? null : this.f34998b.b(bhVarF);
        if (atVar != null && qVarB != null) {
            this.f35001e.K(new com.waze.reports_v2.c.ck(qVarB), new com.waze.reports_v2.c.cl(atVar), z);
        }
        this.f35004h.c(com.waze.ui.w.b.n.f43704a);
        z();
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new ck(this, qVar, atVar, (h.c.e) null, 0), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(com.waze.ui.w.b.as asVar) {
        int iC;
        com.waze.reports_v2.b.r rVar;
        com.waze.reports_v2.b.at atVarX;
        this.o = null;
        com.waze.ui.w.b.bh bhVarD = asVar.d();
        com.waze.ui.w.b.bh bhVar = com.waze.ui.w.b.bh.f43666g;
        if (bhVarD == bhVar) {
            com.waze.reports_v2.b.r rVarA = this.f35002f.a();
            this.o = rVarA;
            if (rVarA == null) {
                ch chVar = ch.f34947a;
                kotlinx.coroutines.br brVar = this.m;
                if (brVar != null) {
                    brVar.s(null);
                }
                A();
                z();
                int i2 = ci.f34949a;
                ci.a().set(false);
                kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new bl(this, chVar, (h.c.e) null, 5), 3);
                return;
            }
            com.waze.shared_infra.l.a aVarB = rVarA.b();
            A();
            this.p = this.f35003g.c(aVarB);
        }
        com.waze.ui.w.b.bh bhVarD2 = asVar.d();
        h.g.b.x.f(bhVarD2, "category");
        if (bhVarD2 != bhVar && ConfigValues.CONFIG_VALUE_REPORTING_ONE_TAP_REPORTING_ENABLED.b().booleanValue()) {
            bb bbVar = this.f34998b;
            com.waze.reports_v2.b.q qVarB = bbVar.b(asVar.d());
            com.waze.ui.w.b.au auVar = (com.waze.ui.w.b.au) h.a.i.R(asVar.e());
            if (auVar == null || (atVarX = bbVar.d(auVar.c())) == null) {
                atVarX = x();
            }
            B(false, qVarB, atVarX);
            return;
        }
        kotlinx.coroutines.b.bn bnVar = this.r;
        h.g.b.x.f(asVar, "<this>");
        if (asVar.d() != bhVar || (rVar = this.o) == null) {
            iC = asVar.c();
        } else {
            com.waze.reports_v2.b.s sVarA = rVar.a();
            com.waze.ui.w.b.b bVar = com.waze.ui.w.b.b.f43626a;
            com.waze.ui.w.b.bd bdVar = com.waze.ui.w.b.bd.f43641a;
            dj djVar = dj.f34409a;
            com.waze.reports_v2.b.s sVar = com.waze.reports_v2.b.s.f34126a;
            int iOrdinal = sVarA.ordinal();
            if (iOrdinal == 0) {
                iC = R.string.REPORT_MENU_V2_CLOSURE_REPORT_AHEAD_TITLE;
            } else {
                if (iOrdinal != 1) {
                    throw new h.i();
                }
                iC = R.string.REPORT_MENU_V2_CLOSURE_REPORT_BEHIND_TITLE;
            }
        }
        bnVar.e(new com.waze.ui.w.b.ba(new com.waze.ui.w.b.ap(iC, asVar.d(), asVar.e(), this.f35000d.a(), com.waze.settings.h.c.g(db.c()), (com.waze.ui.w.b.au) h.a.i.R(asVar.e())), com.waze.ui.w.b.ax.f43623a));
        z();
        kotlinx.coroutines.br brVar2 = this.m;
        if (brVar2 != null) {
            brVar2.s(null);
        }
        kotlinx.coroutines.br brVarZ = kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), new cx(CoroutineExceptionHandler.f51269c, this), null, new cy(this, null), 2);
        this.m = brVarZ;
        if (brVarZ != null) {
            brVarZ.bY(new by(this, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(List list, boolean z) {
        com.waze.ui.w.b.ax awVar;
        if (z) {
            com.waze.reports_v2.c.br brVar = this.f35007k;
            if (brVar.b()) {
                brVar.a();
                awVar = new com.waze.ui.w.b.ay(new com.waze.ui.w.b.ac(this.f35006j.b().a().k()));
            } else {
                da daVarB = this.f34999c.b();
                da daVar = da.f35012a;
                com.waze.ui.w.b.bh bhVar = com.waze.ui.w.b.bh.f43660a;
                int iOrdinal = daVarB.ordinal();
                if (iOrdinal == 0) {
                    awVar = com.waze.ui.w.b.ax.f43623a;
                } else if (iOrdinal == 1) {
                    awVar = new com.waze.ui.w.b.aw((com.waze.ui.w.b.am) this.f35004h.b().d());
                } else {
                    if (iOrdinal != 2) {
                        throw new h.i();
                    }
                    awVar = new com.waze.ui.w.b.az(((com.waze.bl.d.b) this.q.g().d()).a());
                }
            }
        } else {
            awVar = com.waze.ui.w.b.ax.f43623a;
        }
        boolean z2 = awVar instanceof com.waze.ui.w.b.ax;
        boolean z3 = false;
        if (z2 && ConfigValues.CONFIG_VALUE_COMPLIANCE_SHOULD_SHOW_REPORT_GENERAL_KNOWLEDGE_DISCLAIMER.b().booleanValue() && !ConfigValues.CONFIG_VALUE_COMPLIANCE_REPORT_GENERAL_KNOWLEDGE_DISCLAIMER_SHOWN.b().booleanValue()) {
            z3 = true;
        }
        this.r.e(new com.waze.ui.w.b.ba(new com.waze.ui.w.b.ao(list, z3), awVar));
        if (awVar instanceof com.waze.ui.w.b.aw) {
            cz czVar = this;
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(czVar), null, null, new bj(this, (h.c.e) null, 9, (byte[]) null), 3);
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(czVar), null, null, new bj(this, (h.c.e) null, 10, (char[]) null), 3);
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(czVar), null, null, new bj(this, (h.c.e) null, 11, (short[]) null), 3);
            return;
        }
        if (awVar instanceof com.waze.ui.w.b.az) {
            cz czVar2 = this;
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(czVar2), null, null, new bj(this, (h.c.e) null, 12, (int[]) null), 3);
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(czVar2), null, null, new bj(this, (h.c.e) null, 13, (boolean[]) null), 3);
            v(new com.waze.ui.w.b.i(com.waze.ui.f.u.f42313a));
            return;
        }
        if (!z2) {
            if (!(awVar instanceof com.waze.ui.w.b.ay)) {
                throw new h.i();
            }
        } else if (z3) {
            ConfigValues.CONFIG_VALUE_COMPLIANCE_REPORT_GENERAL_KNOWLEDGE_DISCLAIMER_SHOWN.d(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r5.emit(r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object k(com.waze.reports_v2.presentation.cz r5, com.waze.reports_v2.presentation.cg r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.reports_v2.presentation.ct
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.reports_v2.presentation.ct r0 = (com.waze.reports_v2.presentation.ct) r0
            int r1 = r0.f34982d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34982d = r1
            goto L18
        L13:
            com.waze.reports_v2.presentation.ct r0 = new com.waze.reports_v2.presentation.ct
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f34980b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f34982d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r7)
            goto L57
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r6 = r0.f34979a
            com.waze.reports_v2.presentation.cg r6 = (com.waze.reports_v2.presentation.cg) r6
            e.b.c.b(r7)
            goto L49
        L3a:
            e.b.c.b(r7)
            kotlinx.coroutines.CompletableDeferred r7 = r5.t
            r0.f34979a = r6
            r0.f34982d = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 == r1) goto L5a
        L49:
            kotlinx.coroutines.b.bm r5 = r5.u
            r7 = 0
            r0.f34979a = r7
            r0.f34982d = r3
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L57
            goto L5a
        L57:
            h.ab r5 = h.ab.f48028a
            return r5
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.presentation.cz.k(com.waze.reports_v2.presentation.cz, com.waze.reports_v2.presentation.cg, h.c.e):java.lang.Object");
    }

    static /* synthetic */ void s(cz czVar, boolean z) {
        com.waze.ui.w.b.bh bhVarF;
        Object objD = czVar.r.d();
        com.waze.reports_v2.b.q qVarB = null;
        com.waze.ui.w.b.ba baVar = objD instanceof com.waze.ui.w.b.ba ? (com.waze.ui.w.b.ba) objD : null;
        com.waze.ui.x.u uVarL = baVar != null ? baVar.l() : null;
        com.waze.ui.w.b.ap apVar = uVarL instanceof com.waze.ui.w.b.ap ? (com.waze.ui.w.b.ap) uVarL : null;
        if (apVar != null && (bhVarF = apVar.f()) != null) {
            qVarB = czVar.f34998b.b(bhVarF);
        }
        czVar.B(z, qVarB, czVar.x());
    }

    static final h.ab t(cz czVar) {
        czVar.m = null;
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void u(cz czVar, com.waze.ui.x.u uVar, boolean z) {
        if (!(uVar instanceof com.waze.ui.w.b.ao)) {
            if (!(uVar instanceof com.waze.ui.w.b.ap)) {
                throw new h.i();
            }
            bb bbVar = czVar.f34998b;
            com.waze.ui.w.b.ap apVar = (com.waze.ui.w.b.ap) uVar;
            if (bbVar.b(apVar.f()) != null) {
                Cdo cdo = czVar.f35001e;
                List listA = apVar.a();
                ArrayList arrayList = new ArrayList();
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    com.waze.reports_v2.b.at atVarD = bbVar.d(((com.waze.ui.w.b.au) it.next()).c());
                    if (atVarD != null) {
                        arrayList.add(atVarD);
                    }
                }
                cdo.N(arrayList);
                com.waze.reports_v2.b.r rVar = czVar.o;
                if (rVar != null) {
                    cdo.h(rVar);
                    return;
                }
                return;
            }
            return;
        }
        Cdo cdo2 = czVar.f35001e;
        List<com.waze.ui.w.b.av> listA2 = ((com.waze.ui.w.b.ao) uVar).a();
        ArrayList arrayList2 = new ArrayList();
        for (com.waze.ui.w.b.av avVar : listA2) {
            com.waze.reports_v2.c.ck ckVar = null;
            if (avVar instanceof com.waze.ui.w.b.as) {
                com.waze.reports_v2.b.q qVarB = czVar.f34998b.b(((com.waze.ui.w.b.as) avVar).d());
                if (qVarB != null) {
                    ckVar = new com.waze.reports_v2.c.ck(qVarB);
                }
            } else if (avVar instanceof com.waze.ui.w.b.at) {
                com.waze.reports_v2.b.ad adVarC = czVar.f34998b.c(((com.waze.ui.w.b.at) avVar).c());
                if (adVarC != null) {
                    ckVar = new com.waze.reports_v2.c.ck(adVarC);
                }
            } else if (!(avVar instanceof com.waze.ui.w.b.au)) {
                throw new h.i();
            }
            if (ckVar != null) {
                arrayList2.add(ckVar);
            }
        }
        cdo2.e(arrayList2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.reports_v2.b.i w() {
        com.waze.reports_v2.b.g gVar;
        com.waze.reports_v2.b.r rVar = this.o;
        if (rVar != null) {
            gVar = new com.waze.reports_v2.b.g(rVar.b().g() ? rVar.b().d() : rVar.b().a(), rVar.b().g() ? rVar.b().a() : rVar.b().d(), rVar.a(), rVar.b().e(), Integer.valueOf(h.h.a.b(rVar.c().floatValue())));
        } else {
            gVar = null;
        }
        return gVar;
    }

    private final com.waze.reports_v2.b.at x() {
        Object objD = this.r.d();
        com.waze.ui.w.b.ba baVar = objD instanceof com.waze.ui.w.b.ba ? (com.waze.ui.w.b.ba) objD : null;
        com.waze.ui.x.u uVarL = baVar != null ? baVar.l() : null;
        com.waze.ui.w.b.ap apVar = uVarL instanceof com.waze.ui.w.b.ap ? (com.waze.ui.w.b.ap) uVarL : null;
        if (apVar == null) {
            return null;
        }
        com.waze.ui.w.b.bh bhVarF = apVar.f();
        da daVar = da.f35012a;
        com.waze.ui.w.b.bh bhVar = com.waze.ui.w.b.bh.f43660a;
        int iOrdinal = bhVarF.ordinal();
        if (iOrdinal == 6) {
            return com.waze.reports_v2.b.at.I;
        }
        if (iOrdinal == 7) {
            return com.waze.reports_v2.b.at.X;
        }
        com.waze.ui.w.b.au auVarE = apVar.e();
        if (auVarE != null) {
            return this.f34998b.d(auVarE.c());
        }
        return null;
    }

    private final com.waze.ui.w.b.ap y() {
        Object objD = this.r.d();
        com.waze.ui.w.b.ba baVar = objD instanceof com.waze.ui.w.b.ba ? (com.waze.ui.w.b.ba) objD : null;
        com.waze.ui.x.u uVarL = baVar != null ? baVar.l() : null;
        if (uVarL instanceof com.waze.ui.w.b.ap) {
            return (com.waze.ui.w.b.ap) uVarL;
        }
        return null;
    }

    private final void z() {
        com.waze.ui.w.b.m mVar = com.waze.ui.w.b.m.f43703a;
        ab abVar = this.f35004h;
        abVar.c(mVar);
        abVar.close();
        this.q.h(com.waze.ui.f.s.f42311a);
    }

    public final long a() {
        return this.f34999c.a();
    }

    public final da i() {
        return this.f34999c.b();
    }

    public final kotlinx.coroutines.b.bq o() {
        return this.v;
    }

    @Override // androidx.lifecycle.ViewModel
    protected final void onCleared() {
        A();
        int i2 = ci.f34949a;
        ci.a().set(false);
    }

    public final kotlinx.coroutines.b.ch p() {
        return this.s;
    }

    public final void v(com.waze.ui.w.ai aiVar) {
        com.waze.ui.w.b.ap apVarY;
        com.waze.ui.w.b.bh bhVarF;
        com.waze.reports_v2.b.q qVarB;
        h.g.b.x.f(aiVar, NotificationCompat.CATEGORY_EVENT);
        if (aiVar instanceof com.waze.ui.w.b.c) {
            s(this, false);
            return;
        }
        if (aiVar instanceof com.waze.ui.w.b.f) {
            com.waze.ui.w.b.f fVar = (com.waze.ui.w.b.f) aiVar;
            com.waze.ui.w.b.bd bdVarV = fVar.v();
            com.waze.ui.w.b.b bVarU = fVar.u();
            Object objD = this.s.d();
            com.waze.ui.w.b.ba baVar = objD instanceof com.waze.ui.w.b.ba ? (com.waze.ui.w.b.ba) objD : null;
            if (baVar != null) {
                com.waze.ui.x.u uVarL = baVar.l();
                if (uVarL instanceof com.waze.ui.w.b.ao) {
                    this.f35001e.c(bdVarV != null ? com.waze.reports_v2.presentation.a.an.s(bdVarV) : null, com.waze.reports_v2.presentation.a.an.r(bVarU));
                } else {
                    if (!(uVarL instanceof com.waze.ui.w.b.ap)) {
                        throw new h.i();
                    }
                    this.f35001e.M(com.waze.reports_v2.presentation.a.an.r(bVarU));
                }
                com.waze.ui.j.h hVarM = baVar.m();
                if (hVarM instanceof com.waze.ui.w.b.aw) {
                    this.f35004h.c(new com.waze.ui.w.b.l(com.waze.ui.w.b.bg.f43658g));
                } else if (hVarM instanceof com.waze.ui.w.b.az) {
                    this.q.h(com.waze.ui.f.s.f42311a);
                } else if (!(hVarM instanceof com.waze.ui.w.b.ay) && !h.g.b.x.n(hVarM, com.waze.ui.w.b.ax.f43623a)) {
                    throw new h.i();
                }
            }
            kotlinx.coroutines.br brVar = this.m;
            if (brVar != null) {
                brVar.s(null);
            }
            A();
            z();
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new bj(this, (h.c.e) null, 8), 3);
            return;
        }
        if (!(aiVar instanceof com.waze.ui.w.b.h)) {
            if (aiVar instanceof com.waze.ui.w.b.a) {
                kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new bl(this, aiVar, (h.c.e) null, 6), 3);
                return;
            }
            if (h.g.b.x.n(aiVar, com.waze.ui.w.b.g.f43696a)) {
                this.f35001e.C(com.waze.reports_v2.d.f.f34579a, null, null, com.waze.reports_v2.d.h.f34589a);
                return;
            }
            if (aiVar instanceof com.waze.ui.w.b.e) {
                com.waze.ui.w.b.e eVar = (com.waze.ui.w.b.e) aiVar;
                if (eVar.u() instanceof com.waze.ui.w.b.k) {
                    this.f35001e.a();
                }
                this.f35004h.c(eVar.u());
                return;
            }
            if (aiVar instanceof com.waze.ui.w.b.i) {
                this.q.h(((com.waze.ui.w.b.i) aiVar).u());
                return;
            }
            if (!h.g.b.x.n(aiVar, com.waze.ui.w.b.d.f43692a)) {
                throw new h.i();
            }
            com.waze.reports_v2.c.s sVarA = this.f35006j.b().a();
            if (!sVarA.m()) {
                sVarA.f(true);
            }
            Object objD2 = this.r.d();
            com.waze.ui.w.b.ba baVar2 = objD2 instanceof com.waze.ui.w.b.ba ? (com.waze.ui.w.b.ba) objD2 : null;
            if (baVar2 != null) {
                D(baVar2.l().a(), true);
                return;
            }
            return;
        }
        com.waze.ui.w.b.h hVar = (com.waze.ui.w.b.h) aiVar;
        com.waze.ui.w.b.av avVarU = hVar.u();
        com.waze.ui.w.b.bd bdVarV2 = hVar.v();
        kotlinx.coroutines.b.ch chVar = this.s;
        if (chVar.d() instanceof com.waze.ui.w.b.ba) {
            Object objD3 = chVar.d();
            h.g.b.x.d(objD3, "null cannot be cast to non-null type com.waze.ui.reports.model.ReportMenuState.Loaded");
            if (((com.waze.ui.w.b.ba) objD3).m() instanceof com.waze.ui.w.b.aw) {
                this.f35004h.c(new com.waze.ui.w.b.l(com.waze.ui.w.b.bg.f43656e));
                this.q.h(com.waze.ui.f.s.f42311a);
            }
        }
        dm dmVarS = bdVarV2 != null ? com.waze.reports_v2.presentation.a.an.s(bdVarV2) : null;
        if (avVarU instanceof com.waze.ui.w.b.as) {
            com.waze.reports_v2.b.q qVarB2 = this.f34998b.b(((com.waze.ui.w.b.as) avVarU).d());
            if (qVarB2 != null) {
                this.f35001e.d(dmVarS, new com.waze.reports_v2.c.ck(qVarB2));
            }
        } else if (avVarU instanceof com.waze.ui.w.b.at) {
            com.waze.reports_v2.b.ad adVarC = this.f34998b.c(((com.waze.ui.w.b.at) avVarU).c());
            if (adVarC != null) {
                this.f35001e.d(dmVarS, new com.waze.reports_v2.c.ck(adVarC));
            }
        } else {
            if (!(avVarU instanceof com.waze.ui.w.b.au)) {
                throw new h.i();
            }
            bb bbVar = this.f34998b;
            com.waze.reports_v2.b.at atVarD = bbVar.d(((com.waze.ui.w.b.au) avVarU).c());
            if (atVarD != null && (apVarY = y()) != null && (bhVarF = apVarY.f()) != null && (qVarB = bbVar.b(bhVarF)) != null) {
                this.f35001e.L(qVarB, atVarD);
            }
        }
        com.waze.ui.w.b.av avVarU2 = hVar.u();
        if (avVarU2 instanceof com.waze.ui.w.b.as) {
            C((com.waze.ui.w.b.as) avVarU2);
            return;
        }
        if (avVarU2 instanceof com.waze.ui.w.b.at) {
            com.waze.ui.w.b.at atVar = (com.waze.ui.w.b.at) avVarU2;
            z();
            this.o = null;
            com.waze.reports_v2.b.ad adVarC2 = this.f34998b.c(atVar.c());
            if (adVarC2 != null) {
                kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new bl(this, adVarC2, (h.c.e) null, 7), 3);
                return;
            }
            this.f35008l.g("Clicked category " + atVar.c() + " does not exist)");
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new bj(this, (h.c.e) null, 14, (float[]) null), 3);
            return;
        }
        if (!(avVarU2 instanceof com.waze.ui.w.b.au)) {
            throw new h.i();
        }
        com.waze.ui.w.b.au auVar = (com.waze.ui.w.b.au) avVarU2;
        z();
        com.waze.reports_v2.b.at atVarD2 = this.f34998b.d(auVar.c());
        if (atVarD2 == null) {
            this.f35008l.g("Subtype " + auVar.c() + " does not exist");
            return;
        }
        com.waze.ui.w.b.ap apVarY2 = y();
        if (apVarY2 != null) {
            this.r.e(new com.waze.ui.w.b.ba(com.waze.ui.w.b.ap.g(apVarY2, auVar), com.waze.ui.w.b.ax.f43623a));
            return;
        }
        this.f35008l.g("Subtype " + atVarD2 + " clicked while in the wrong viewModel state (" + this.r.d());
    }
}
