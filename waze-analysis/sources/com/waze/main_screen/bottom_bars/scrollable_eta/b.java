package com.waze.main_screen.bottom_bars.scrollable_eta;

import androidx.compose.runtime.Composer;
import com.waze.an.a.a.am;
import com.waze.an.a.a.bb;
import com.waze.an.a.a.bg;
import com.waze.an.a.a.bm;
import com.waze.an.a.ap;
import com.waze.app_nav.w;
import com.waze.google_assistant.aa;
import com.waze.insights_infra.InsightsInfraNativeManager;
import com.waze.location.a.ae;
import com.waze.navigate.ch;
import com.waze.navigate.cj;
import com.waze.navigate.en;
import com.waze.navigate.eo;
import com.waze.reports_v2.presentation.be;
import h.g.b.ar;
import h.g.b.x;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class b implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f25944a;

    public /* synthetic */ b(int i2) {
        this.f25944a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25944a) {
            case 0:
                return c.a((Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return a.a((Composer) obj, ((Integer) obj2).intValue());
            case 2:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                int i2 = com.waze.main_screen.f.a.f26337a;
                x.f(bVar, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i3 = ar.f48106a;
                return new com.waze.main_screen.f.a.a((ch) bVar.a(new h.g.b.m(ch.class), null, null), (cj) bVar.a(new h.g.b.m(cj.class), null, null), (eo) bVar.a(new h.g.b.m(eo.class), null, null));
            case 3:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                int i4 = com.waze.main_screen.i.a.f26452a;
                x.f(bVar2, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i5 = ar.f48106a;
                return new com.waze.main_screen.h.a.f((com.waze.main_screen.g.a.a) bVar2.a(new h.g.b.m(com.waze.main_screen.g.a.a.class), null, null));
            case 4:
                int i6 = com.waze.main_screen.j.n.f26495a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.main_screen.j.a.b();
            case 5:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                int i7 = com.waze.main_screen.j.n.f26495a;
                x.f(bVar3, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i8 = ar.f48106a;
                return new com.waze.main_screen.j.a.g((com.waze.main_screen.j.a.b) bVar3.a(new h.g.b.m(com.waze.main_screen.j.a.b.class), null, null), (aa) bVar3.a(new h.g.b.m(aa.class), null, null));
            case 6:
                int i9 = com.waze.main_screen.j.n.f26495a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.main_screen.j.h();
            case 7:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i10 = com.waze.main_screen.j.n.f26495a;
                x.f(bVar4, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i11 = ar.f48106a;
                com.waze.main_screen.j.h hVar = (com.waze.main_screen.j.h) bVar4.a(new h.g.b.m(com.waze.main_screen.j.h.class), null, null);
                w wVar = (w) bVar4.a(new h.g.b.m(w.class), null, null);
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("GoogleAssistantActionsStateHolder");
                x.e(eVarD, "create(...)");
                return new com.waze.main_screen.j.m(hVar, eVarD, wVar);
            case 8:
                int i12 = com.waze.main_screen.k.c.f26583a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.insights_infra.k(InsightsInfraNativeManager.INSTANCE);
            case 9:
                int i13 = com.waze.main_screen.k.c.f26583a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.main_screen.k.a();
            case 10:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                int i14 = com.waze.main_screen.k.c.f26583a;
                x.f(bVar5, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i15 = ar.f48106a;
                return new com.waze.an.a.a.b((com.waze.alerters.b.a) bVar5.a(new h.g.b.m(com.waze.alerters.b.a.class), null, null));
            case 11:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                int i16 = com.waze.main_screen.k.c.f26583a;
                x.f(bVar6, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i17 = ar.f48106a;
                return new com.waze.an.a.a.f((com.waze.alerters.a.d) bVar6.a(new h.g.b.m(com.waze.alerters.a.d.class), null, null));
            case 12:
                org.a.d.k.b bVar7 = (org.a.d.k.b) obj;
                int i18 = com.waze.main_screen.k.c.f26583a;
                x.f(bVar7, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i19 = ar.f48106a;
                return new bg((ae) bVar7.a(new h.g.b.m(ae.class), null, null));
            case 13:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                int i20 = com.waze.main_screen.k.c.f26583a;
                x.f(bVar8, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i21 = ar.f48106a;
                com.waze.insights_infra.k kVar = (com.waze.insights_infra.k) bVar8.a(new h.g.b.m(com.waze.insights_infra.k.class), null, null);
                com.waze.an.e.j jVar = (com.waze.an.e.j) bVar8.a(new h.g.b.m(com.waze.an.e.j.class), null, null);
                com.waze.shared_infra.o.a aVar = (com.waze.shared_infra.o.a) bVar8.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                InsightsInfraNativeManager insightsInfraNativeManager = InsightsInfraNativeManager.INSTANCE;
                com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("SegmentInsightsSource");
                x.e(eVarD2, "create(...)");
                return new bb(kVar, jVar, aVar, insightsInfraNativeManager, eVarD2);
            case 14:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                int i22 = com.waze.main_screen.k.c.f26583a;
                x.f(bVar9, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i23 = ar.f48106a;
                com.waze.alerters.a.d dVar = (com.waze.alerters.a.d) bVar9.a(new h.g.b.m(com.waze.alerters.a.d.class), null, null);
                com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("NotificationAlertInsightsSource");
                x.e(eVarD3, "create(...)");
                return new am(dVar, eVarD3);
            case 15:
                org.a.d.k.b bVar10 = (org.a.d.k.b) obj;
                int i24 = com.waze.main_screen.k.c.f26583a;
                x.f(bVar10, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i25 = ar.f48106a;
                am amVar = (am) bVar10.a(new h.g.b.m(am.class), null, null);
                ab abVarA = av.a();
                com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("NotificationInsightSource");
                x.e(eVarD4, "create(...)");
                return new com.waze.an.a.a.ar(eVarD4, amVar, abVarA);
            case 16:
                org.a.d.k.b bVar11 = (org.a.d.k.b) obj;
                int i26 = com.waze.main_screen.k.c.f26583a;
                x.f(bVar11, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                be beVar = new be();
                int i27 = ar.f48106a;
                en enVar = (en) bVar11.a(new h.g.b.m(en.class), null, null);
                com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("InsightFTESource");
                x.e(eVarD5, "create(...)");
                return new com.waze.an.a.a.p(beVar, enVar, eVarD5);
            case 17:
                org.a.d.k.b bVar12 = (org.a.d.k.b) obj;
                int i28 = com.waze.main_screen.k.c.f26583a;
                x.f(bVar12, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i29 = ar.f48106a;
                return new com.waze.an.a.a((com.waze.an.a.a.b) bVar12.a(new h.g.b.m(com.waze.an.a.a.b.class), null, null), (bg) bVar12.a(new h.g.b.m(bg.class), null, null));
            case 18:
                org.a.d.k.b bVar13 = (org.a.d.k.b) obj;
                int i30 = com.waze.main_screen.k.c.f26583a;
                x.f(bVar13, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i31 = ar.f48106a;
                return new ap((bm) bVar13.a(new h.g.b.m(bm.class), null, null), (com.waze.an.a.a.ar) bVar13.a(new h.g.b.m(com.waze.an.a.a.ar.class), null, null), (bg) bVar13.a(new h.g.b.m(bg.class), null, null), (com.waze.an.a.a.f) bVar13.a(new h.g.b.m(com.waze.an.a.a.f.class), null, null), (bb) bVar13.a(new h.g.b.m(bb.class), null, null), (com.waze.an.a.a.p) bVar13.a(new h.g.b.m(com.waze.an.a.a.p.class), null, null));
            case 19:
                org.a.d.k.b bVar14 = (org.a.d.k.b) obj;
                int i32 = com.waze.main_screen.k.c.f26583a;
                x.f(bVar14, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i33 = ar.f48106a;
                ap apVar = (ap) bVar14.a(new h.g.b.m(ap.class), null, null);
                com.waze.main_screen.k.a aVar2 = (com.waze.main_screen.k.a) bVar14.a(new h.g.b.m(com.waze.main_screen.k.a.class), null, null);
                ab abVarA2 = av.a();
                com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("StandardInsightPolicy");
                x.e(eVarD6, "create(...)");
                return new com.waze.an.b.o(apVar, aVar2, eVarD6, abVarA2);
            default:
                org.a.d.k.b bVar15 = (org.a.d.k.b) obj;
                int i34 = com.waze.main_screen.k.c.f26583a;
                x.f(bVar15, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i35 = ar.f48106a;
                return new com.waze.an.b.d((com.waze.an.a.a) bVar15.a(new h.g.b.m(com.waze.an.a.a.class), null, null), av.a());
        }
    }
}
