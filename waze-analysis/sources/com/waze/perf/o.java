package com.waze.perf;

import android.app.Application;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import com.waze.ConfigManager;
import com.waze.bm.a.a.ac;
import com.waze.bm.a.a.ad;
import com.waze.bm.a.a.ai;
import com.waze.bm.a.a.an;
import com.waze.config.ConfigValues;
import com.waze.map.b.ed;
import com.waze.navigate.eo;
import com.waze.network.ap;
import com.waze.reports.ay;
import com.waze.reports.ba;
import com.waze.reports_v2.c.Cdo;
import com.waze.reports_v2.c.ae;
import com.waze.reports_v2.c.ao;
import com.waze.reports_v2.c.bj;
import com.waze.reports_v2.c.br;
import com.waze.reports_v2.c.bs;
import com.waze.reports_v2.c.cn;
import com.waze.reports_v2.c.dp;
import com.waze.reports_v2.presentation.ab;
import com.waze.reports_v2.presentation.bb;
import com.waze.reports_v2.presentation.bd;
import com.waze.reports_v2.presentation.cz;
import com.waze.reports_v2.presentation.db;
import com.waze.sound.fm;
import h.g.b.ah;
import h.g.b.ar;
import java.util.Iterator;
import k.x$$ExternalSyntheticApiModelOutline0;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class o implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f33062a;

    public /* synthetic */ o(int i2) {
        this.f33062a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33062a) {
            case 0:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                int i2 = t.f33065a;
                h.g.b.x.f(bVar, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                com.waze.perf.tracer.e eVar = new com.waze.perf.tracer.e(com.waze.settings.tree.c.f.g(bVar, "WazePerf"));
                int i3 = ar.f48106a;
                com.waze.perf.tracer.c cVar = new com.waze.perf.tracer.c((com.google.firebase.perf.d) bVar.a(new h.g.b.m(com.google.firebase.perf.d.class), null, null));
                com.waze.config.b bVar2 = ConfigValues.CONFIG_VALUE_ANALYTICS_FIREBASE_PERFORMANCE_ENABLED;
                h.g.b.x.e(bVar2, "CONFIG_VALUE_ANALYTICS_F…EBASE_PERFORMANCE_ENABLED");
                return new com.waze.perf.tracer.i(eVar, cVar, new s(bVar2, 1, null));
            case 1:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                int i4 = t.f33065a;
                h.g.b.x.f(bVar3, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i5 = ar.f48106a;
                com.waze.perf.tracer.g gVar = (com.waze.perf.tracer.g) bVar3.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null);
                q qVar = new q(bVar3.a(new h.g.b.m(ap.class), null, null));
                final com.waze.n nVarD = com.b.b.a.u.d();
                h.g.b.x.e(nVarD, "getAppConfig(...)");
                return new h(gVar, qVar, new ah(nVarD) { // from class: com.waze.perf.r
                    @Override // h.g.b.ah, h.l.n
                    public final Object get() {
                        return ((com.waze.n) this.receiver).a();
                    }
                }, (u) bVar3.a(new h.g.b.m(u.class), null, null));
            case 2:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i6 = t.f33065a;
                h.g.b.x.f(bVar4, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i7 = ar.f48106a;
                StorageStatsManager storageStatsManagerM = x$$ExternalSyntheticApiModelOutline0.m(((Context) bVar4.a(new h.g.b.m(Context.class), null, null)).getSystemService(x$$ExternalSyntheticApiModelOutline0.m37439m()));
                ap apVar = (ap) bVar4.a(new h.g.b.m(ap.class), null, null);
                com.waze.config.c cVar2 = ConfigValues.CONFIG_VALUE_SYSTEM_HEALTH_HEALTH_REPORT_INTERVAL_SEC;
                h.g.b.x.e(cVar2, "CONFIG_VALUE_SYSTEM_HEAL…EALTH_REPORT_INTERVAL_SEC");
                return new com.waze.perf.a.b(storageStatsManagerM, apVar, new s(cVar2, 0), com.waze.settings.tree.c.f.g(bVar4, "WazePerf"), (u) bVar4.a(new h.g.b.m(u.class), null, null));
            case 3:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar5, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i8 = ar.f48106a;
                return new com.waze.bl.b.c.t((com.waze.t.b.ap) bVar5.a(new h.g.b.m(com.waze.t.b.ap.class), null, null), (com.waze.bl.b.c.r) bVar5.a(new h.g.b.m(com.waze.bl.b.c.r.class), null, null));
            case 4:
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.bl.b.c.a();
            case 5:
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.bl.b.c.b();
            case 6:
                ac acVar = (ac) obj;
                ai aiVar = (ai) obj2;
                h.g.b.x.f(acVar, "stub");
                h.g.b.x.f(aiVar, "request");
                Iterator itD = e.a.h.s.d(acVar.getChannel(), ad.b(), acVar.getCallOptions(), aiVar);
                h.g.b.x.e(itD, "chat(...)");
                return itD;
            case 7:
                ac acVar2 = (ac) obj;
                an anVar = (an) obj2;
                h.g.b.x.f(acVar2, "stub");
                h.g.b.x.f(anVar, "request");
                Iterator itD2 = e.a.h.s.d(acVar2.getChannel(), ad.c(), acVar2.getCallOptions(), anVar);
                h.g.b.x.e(itD2, "startChat(...)");
                return itD2;
            case 8:
                int i9 = ay.f33670a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$scoped");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return com.waze.shared_infra.i.a.d("EditPlaceFragmentMapView");
            case 9:
                int i10 = ay.f33670a;
                return a.a.w((org.a.d.k.b) obj, (org.a.d.h.a) obj2);
            case 10:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                int i11 = ay.f33670a;
                h.g.b.x.f(bVar6, "$this$scoped");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i12 = ar.f48106a;
                ed edVar = (ed) bVar6.a(new h.g.b.m(ed.class), null, null);
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("EditPlaceFragmentMapViewHelper");
                h.g.b.x.e(eVarD, "create(...)");
                return new ba(edVar, eVarD);
            case 11:
                org.a.d.k.b bVar7 = (org.a.d.k.b) obj;
                com.waze.reports_v2.j jVar = com.waze.reports_v2.j.f34601a;
                h.g.b.x.f(bVar7, "$this$scoped");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i13 = ar.f48106a;
                com.waze.reports_v2.presentation.q qVar2 = (com.waze.reports_v2.presentation.q) bVar7.a(new h.g.b.m(com.waze.reports_v2.presentation.q.class), null, null);
                com.waze.reports_v2.presentation.p pVar = (com.waze.reports_v2.presentation.p) bVar7.a(new h.g.b.m(com.waze.reports_v2.presentation.p.class), null, null);
                com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("ReportMenuConversationalReportingStateHolder");
                h.g.b.x.e(eVarD2, "create(...)");
                return qVar2.a(pVar, eVarD2);
            case 12:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                com.waze.reports_v2.j jVar2 = com.waze.reports_v2.j.f34601a;
                h.g.b.x.f(bVar8, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i14 = ar.f48106a;
                return new bd((dp) bVar8.a(new h.g.b.m(dp.class), null, null), (com.waze.alerters.a) bVar8.a(new h.g.b.m(com.waze.alerters.a.class), null, null));
            case 13:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                com.waze.reports_v2.j jVar3 = com.waze.reports_v2.j.f34601a;
                h.g.b.x.f(bVar9, "$this$viewModel");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i15 = ar.f48106a;
                com.waze.reports_v2.c.n nVar = (com.waze.reports_v2.c.n) bVar9.a(new h.g.b.m(com.waze.reports_v2.c.n.class), null, null);
                com.waze.shared_infra.q.e eVar2 = (com.waze.shared_infra.q.e) bVar9.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null);
                return new cz(nVar, (bb) bVar9.a(new h.g.b.m(bb.class), null, null), (db) bVar9.a(new h.g.b.m(db.class), null, null), eVar2, (Cdo) bVar9.a(new h.g.b.m(Cdo.class), null, null), (com.waze.reports_v2.c.q) bVar9.a(new h.g.b.m(com.waze.reports_v2.c.q.class), null, null), (com.waze.map.b.ai) bVar9.a(new h.g.b.m(com.waze.map.b.ai.class), null, null), (ab) bVar9.a(new h.g.b.m(ab.class), null, null), (com.waze.bl.d.a) bVar9.a(new h.g.b.m(com.waze.bl.d.a.class), null, null), (com.waze.bl.d.a.f) bVar9.a(new h.g.b.m(com.waze.bl.d.a.f.class), null, null), (com.waze.reports_v2.e) bVar9.a(new h.g.b.m(com.waze.reports_v2.e.class), null, null), (br) bVar9.a(new h.g.b.m(br.class), com.waze.ch.a.a.f.f("MobileConversationalReportingReportMenuOnboardingController"), null));
            case 14:
                org.a.d.k.b bVar10 = (org.a.d.k.b) obj;
                com.waze.reports_v2.j jVar4 = com.waze.reports_v2.j.f34601a;
                h.g.b.x.f(bVar10, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i16 = ar.f48106a;
                return new db((com.waze.reports_v2.e) bVar10.a(new h.g.b.m(com.waze.reports_v2.e.class), null, null), (br) bVar10.a(new h.g.b.m(br.class), com.waze.ch.a.a.f.f("MobileConversationalReportingReportMenuOnboardingController"), null));
            case 15:
                org.a.d.k.b bVar11 = (org.a.d.k.b) obj;
                com.waze.reports_v2.j jVar5 = com.waze.reports_v2.j.f34601a;
                h.g.b.x.f(bVar11, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i17 = ar.f48106a;
                return new com.waze.reports_v2.c.r((ConfigManager) bVar11.a(new h.g.b.m(ConfigManager.class), null, null));
            case 16:
                org.a.d.k.b bVar12 = (org.a.d.k.b) obj;
                com.waze.reports_v2.j jVar6 = com.waze.reports_v2.j.f34601a;
                h.g.b.x.f(bVar12, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i18 = ar.f48106a;
                return new com.waze.reports_v2.c.q((eo) bVar12.a(new h.g.b.m(eo.class), null, null), (com.waze.reports_v2.c.r) bVar12.a(new h.g.b.m(com.waze.reports_v2.c.r.class), null, null), (com.waze.shared_infra.q.e) bVar12.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null));
            case 17:
                org.a.d.k.b bVar13 = (org.a.d.k.b) obj;
                com.waze.reports_v2.j jVar7 = com.waze.reports_v2.j.f34601a;
                h.g.b.x.f(bVar13, "$this$scoped");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i19 = ar.f48106a;
                fm fmVar = (fm) bVar13.a(new h.g.b.m(fm.class), null, null);
                com.waze.shared_infra.i.b bVar14 = (com.waze.shared_infra.i.b) bVar13.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ReportMenuFragment_AndroidTtsService");
                h.g.b.x.e(eVarD3, "create(...)");
                return new com.waze.sound.m((bs) bVar13.a(new h.g.b.m(bs.class), null, null), bVar14, fmVar, eVarD3, 8);
            case 18:
                org.a.d.k.b bVar15 = (org.a.d.k.b) obj;
                com.waze.reports_v2.j jVar8 = com.waze.reports_v2.j.f34601a;
                h.g.b.x.f(bVar15, "$this$scoped");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i20 = ar.f48106a;
                Application application = (Application) bVar15.a(new h.g.b.m(Application.class), null, null);
                com.waze.speech.k kVar = (com.waze.speech.k) bVar15.a(new h.g.b.m(com.waze.speech.k.class), null, null);
                com.waze.shared_infra.i.b bVar16 = (com.waze.shared_infra.i.b) bVar15.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                com.waze.speech.m mVar = (com.waze.speech.m) bVar15.a(new h.g.b.m(com.waze.speech.m.class), null, null);
                com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("ReportMenuFragment_SpeechRecognizerService");
                h.g.b.x.e(eVarD4, "create(...)");
                return new com.waze.speech.w(application, kVar, bVar16, mVar, eVarD4);
            case 19:
                com.waze.reports_v2.j jVar9 = com.waze.reports_v2.j.f34601a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$scoped");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.reports_v2.presentation.p();
            default:
                org.a.d.k.b bVar17 = (org.a.d.k.b) obj;
                com.waze.reports_v2.j jVar10 = com.waze.reports_v2.j.f34601a;
                h.g.b.x.f(bVar17, "$this$scoped");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i21 = ar.f48106a;
                ae aeVar = (ae) bVar17.a(new h.g.b.m(ae.class), null, null);
                ao aoVar = (ao) bVar17.a(new h.g.b.m(cn.class), null, null);
                com.waze.reports_v2.d.j jVar11 = (com.waze.reports_v2.d.j) bVar17.a(new h.g.b.m(com.waze.reports_v2.d.j.class), null, null);
                com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("ConversationalReportingController");
                h.g.b.x.e(eVarD5, "create(...)");
                return new bj(aeVar, aoVar, jVar11, eVarD5, (bs) bVar17.a(new h.g.b.m(bs.class), null, null), ((com.waze.h.a) bVar17.a(new h.g.b.m(com.waze.h.a.class), null, null)).a(), 16);
        }
    }
}
