package com.waze.search.v2;

import com.waze.MoodManager;
import com.waze.kd;
import com.waze.la;
import com.waze.settings.SettingsNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ae implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f36143a;

    public /* synthetic */ ae(int i2) {
        this.f36143a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        String strU;
        switch (this.f36143a) {
            case 0:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                int i2 = af.f36144a;
                h.g.b.x.f(bVar, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i3 = h.g.b.ar.f48106a;
                Object objA = bVar.a(new h.g.b.m(MoodManager.class), null, null);
                h.g.b.x.d(objA, "null cannot be cast to non-null type com.waze.moods.MoodNameProvider");
                return (com.waze.aw.a) objA;
            case 1:
                int i4 = af.f36144a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new bu();
            case 2:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                int i5 = af.f36144a;
                h.g.b.x.f(bVar2, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i6 = h.g.b.ar.f48106a;
                com.waze.aw.a aVar = (com.waze.aw.a) bVar2.a(new h.g.b.m(com.waze.aw.a.class), null, null);
                com.waze.navigate.dg dgVar = (com.waze.navigate.dg) bVar2.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar2.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                p pVar = (p) bVar2.a(new h.g.b.m(p.class), null, null);
                com.waze.av.c.j jVar = (com.waze.av.c.j) bVar2.a(new h.g.b.m(com.waze.av.c.j.class), null, null);
                com.waze.sharedui.f.k kVarE = com.waze.shared_infra.l.b.e();
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("SearchOperationImpl");
                h.g.b.x.e(eVarD, "create(...)");
                return new com.waze.search.bl(aVar, dgVar, gVar, kVarE, pVar, jVar, eVarD);
            case 3:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                org.a.d.h.a aVar2 = (org.a.d.h.a) obj2;
                int i7 = af.f36144a;
                h.g.b.x.f(bVar3, "$this$viewModel");
                h.g.b.x.f(aVar2, "<destruct>");
                int i8 = h.g.b.ar.f48106a;
                di diVar = (di) aVar2.c(new h.g.b.m(di.class));
                fs fsVar = (fs) bVar3.a(new h.g.b.m(fs.class), null, new com.waze.bi.a(diVar, 5));
                com.waze.shared_infra.o.a aVar3 = (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                p pVar2 = (p) bVar3.a(new h.g.b.m(p.class), null, null);
                com.waze.ev.n nVar = (com.waze.ev.n) bVar3.a(new h.g.b.m(com.waze.ev.n.class), null, null);
                com.waze.shared_infra.q.e eVar = (com.waze.shared_infra.q.e) bVar3.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null);
                com.waze.search.bd bdVar = (com.waze.search.bd) bVar3.a(new h.g.b.m(com.waze.search.bd.class), null, null);
                com.waze.search.a.a.a aVar4 = (com.waze.search.a.a.a) bVar3.a(new h.g.b.m(com.waze.search.a.a.a.class), null, null);
                com.waze.navigate.dg dgVar2 = (com.waze.navigate.dg) bVar3.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
                com.waze.navigate.location_preview.o oVar = (com.waze.navigate.location_preview.o) bVar3.a(new h.g.b.m(com.waze.navigate.location_preview.o.class), null, null);
                return new fi(aVar3, pVar2, (com.waze.location.o) bVar3.a(new h.g.b.m(com.waze.location.o.class), null, null), diVar, nVar, eVar, bdVar, fsVar, aVar4, dgVar2, (com.waze.sharedui.j) bVar3.a(new h.g.b.m(com.waze.sharedui.j.class), null, null), (com.waze.shared_infra.s.b) bVar3.a(new h.g.b.m(com.waze.shared_infra.s.b.class), null, null), oVar, (la) bVar3.a(new h.g.b.m(la.class), null, null), (kd) bVar3.a(new h.g.b.m(kd.class), null, null), (com.waze.favorites.k) bVar3.a(new h.g.b.m(com.waze.favorites.k.class), null, null), (com.waze.bf) bVar3.a(new h.g.b.m(com.waze.bf.class), null, null), (ft) bVar3.a(new h.g.b.m(ft.class), null, null), (com.waze.navigate.location_preview.s) bVar3.a(new h.g.b.m(com.waze.navigate.location_preview.s.class), null, null), (com.waze.navigate.cj) bVar3.a(new h.g.b.m(com.waze.navigate.cj.class), null, null), (com.waze.shared_infra.q.j) bVar3.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null), (com.waze.navigate.location_preview.p) bVar3.a(new h.g.b.m(com.waze.navigate.location_preview.p.class), null, null), (com.waze.shared_infra.q.r) bVar3.a(new h.g.b.m(com.waze.shared_infra.q.r.class), null, null), (bu) bVar3.a(new h.g.b.m(bu.class), null, null), (com.waze.favorites.q) bVar3.a(new h.g.b.m(com.waze.favorites.q.class), null, null), (com.waze.search.b.d) bVar3.a(new h.g.b.m(com.waze.search.b.d.class), null, null), (SettingsNativeManager) bVar3.a(new h.g.b.m(SettingsNativeManager.class), null, null), (com.waze.br.b.p) bVar3.a(new h.g.b.m(com.waze.br.b.p.class), null, null), (com.waze.br.c.e) bVar3.a(new h.g.b.m(com.waze.br.c.e.class), null, null), (com.waze.modules.navigation.bp) bVar3.a(new h.g.b.m(com.waze.modules.navigation.bp.class), null, null));
            case 4:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i9 = af.f36144a;
                h.g.b.x.f(bVar4, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i10 = h.g.b.ar.f48106a;
                return new fx((com.waze.search.b.d) bVar4.a(new h.g.b.m(com.waze.search.b.d.class), null, null), (com.waze.search.bd) bVar4.a(new h.g.b.m(com.waze.search.bd.class), null, null), (com.waze.navigate.fl) bVar4.a(new h.g.b.m(com.waze.navigate.fl.class), null, null), (com.waze.shared_infra.o.a) bVar4.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (com.waze.bf) bVar4.a(new h.g.b.m(com.waze.bf.class), null, null), (com.waze.ev.n) bVar4.a(new h.g.b.m(com.waze.ev.n.class), null, null), (p) bVar4.a(new h.g.b.m(p.class), null, null), (com.waze.av.a.b) bVar4.a(new h.g.b.m(com.waze.av.a.b.class), null, null), (com.waze.location.o) bVar4.a(new h.g.b.m(com.waze.location.o.class), null, null), (com.waze.shared_infra.q.r) bVar4.a(new h.g.b.m(com.waze.shared_infra.q.r.class), null, null));
            case 5:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                int i11 = af.f36144a;
                h.g.b.x.f(bVar5, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i12 = h.g.b.ar.f48106a;
                return new com.waze.favorites.r((com.waze.stats.ax) bVar5.a(new h.g.b.m(com.waze.stats.ax.class), null, null));
            case 6:
                int i13 = af.f36144a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$scoped");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return com.waze.shared_infra.i.a.d("SearchV2Activity");
            case 7:
                int i14 = af.f36144a;
                return a.a.w((org.a.d.k.b) obj, (org.a.d.h.a) obj2);
            case 8:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                org.a.d.h.a aVar5 = (org.a.d.h.a) obj2;
                int i15 = af.f36144a;
                h.g.b.x.f(bVar6, "$this$scoped");
                h.g.b.x.f(aVar5, "<destruct>");
                int i16 = h.g.b.ar.f48106a;
                di diVar2 = (di) aVar5.c(new h.g.b.m(di.class));
                if (diVar2 == null || (strU = diVar2.e()) == null) {
                    strU = com.waze.ad.c.b.u();
                }
                return new fs(strU, diVar2 != null ? diVar2.f() : null, diVar2 != null ? diVar2.d() : null, diVar2 != null ? diVar2.c() : null, (com.waze.ev.n) bVar6.a(new h.g.b.m(com.waze.ev.n.class), null, null), (com.waze.navigate.cj) bVar6.a(new h.g.b.m(com.waze.navigate.cj.class), null, null), (com.waze.shared_infra.q.e) bVar6.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null), (com.waze.location.o) bVar6.a(new h.g.b.m(com.waze.location.o.class), null, null), (com.waze.search.stats.s) bVar6.a(new h.g.b.m(com.waze.search.stats.s.class), null, null));
            case 9:
                int i17 = af.f36144a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$fragment");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new ck();
            case 10:
                int i18 = af.f36144a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$scoped");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return com.waze.shared_infra.i.a.d("SearchV2Fragment");
            case 11:
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                return "";
            case 12:
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.bq.c.e();
            case 13:
                org.a.d.k.b bVar7 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar7, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("SearchAgentActionHandlerImpl");
                h.g.b.x.e(eVarD2, "create(...)");
                return new com.waze.bq.c.b(eVarD2, k.a.k.h(bVar7));
            case 14:
                h.g.b.x.f((org.a.d.k.b) obj, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("SearchAgentImpl");
                h.g.b.x.e(eVarD3, "create(...)");
                return new com.waze.bq.a.e(eVarD3);
            case 15:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar8, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("SearchAgentController");
                h.g.b.x.e(eVarD4, "create(...)");
                int i19 = h.g.b.ar.f48106a;
                com.waze.shared_infra.i.b bVar9 = (com.waze.shared_infra.i.b) bVar8.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null);
                com.waze.bq.a.a aVar6 = (com.waze.bq.a.a) bVar8.a(new h.g.b.m(com.waze.bq.a.a.class), null, null);
                com.waze.bq.c.a aVar7 = (com.waze.bq.c.a) bVar8.a(new h.g.b.m(com.waze.bq.c.a.class), null, null);
                com.waze.h.a aVar8 = (com.waze.h.a) bVar8.a(new h.g.b.m(com.waze.h.a.class), null, null);
                com.waze.t.b.b bVar10 = (com.waze.t.b.b) bVar8.a(new h.g.b.m(com.waze.t.b.b.class), null, null);
                com.waze.h.a.j jVar2 = (com.waze.h.a.j) bVar8.a(new h.g.b.m(com.waze.h.a.j.class), null, null);
                com.waze.h.a.a aVar9 = (com.waze.h.a.a) bVar8.a(new h.g.b.m(com.waze.h.a.a.class), null, null);
                com.waze.t.b.ca caVar = (com.waze.t.b.ca) bVar8.a(new h.g.b.m(com.waze.t.b.ca.class), null, null);
                com.waze.t.b.c cVar = (com.waze.t.b.c) bVar8.a(new h.g.b.m(com.waze.bq.c.d.class), null, null);
                com.waze.t.b.bn bnVarF = com.waze.n.aq.f(bVar8, com.waze.t.b.bl.f40744c);
                com.waze.t.b.as asVarM = com.waze.o.ad.m(bVar8);
                com.waze.t.b.aq aqVar = (com.waze.t.b.aq) bVar8.a(new h.g.b.m(com.waze.t.b.aq.class), null, null);
                com.waze.t.c.f fVar = (com.waze.t.c.f) bVar8.a(new h.g.b.m(com.waze.t.c.f.class), null, null);
                int i20 = kotlinx.coroutines.av.f51370a;
                return new com.waze.bq.c.f(kotlinx.coroutines.e.ac.f51860a, eVarD4, bVar9, aVar6, aVar7, aVar8, bVar10, jVar2, aVar9, caVar, cVar, bnVarF, asVarM, aqVar, fVar);
            case 16:
                org.a.d.k.b bVar11 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar11, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("SearchAgentStateHolder");
                h.g.b.x.e(eVarD5, "create(...)");
                int i21 = h.g.b.ar.f48106a;
                return new com.waze.bq.f(eVarD5, (com.waze.bq.c.f) bVar11.a(new h.g.b.m(com.waze.bq.c.f.class), null, null), (com.waze.shared_infra.m.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.m.a.class), null, null), (com.waze.bq.c.d) bVar11.a(new h.g.b.m(com.waze.bq.c.d.class), null, null));
            case 17:
                int i22 = com.waze.br.b.f17316a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return com.waze.br.a.u.f17309a;
            case 18:
                org.a.d.k.b bVar12 = (org.a.d.k.b) obj;
                int i23 = com.waze.br.b.f17316a;
                h.g.b.x.f(bVar12, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i24 = h.g.b.ar.f48106a;
                e.a.i iVarB = ((com.waze.modules.b.h) bVar12.a(new h.g.b.m(com.waze.modules.b.h.class), null, null)).b();
                e.a.h hVar = e.a.h.f47759a;
                h.g.b.x.e(hVar, "DEFAULT");
                return new com.waze.bs.b(iVarB, hVar);
            case 19:
                org.a.d.k.b bVar13 = (org.a.d.k.b) obj;
                int i25 = com.waze.br.b.f17316a;
                h.g.b.x.f(bVar13, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i26 = h.g.b.ar.f48106a;
                return new com.waze.br.a.s((com.waze.bs.b) bVar13.a(new h.g.b.m(com.waze.bs.b.class), null, null));
            default:
                org.a.d.k.b bVar14 = (org.a.d.k.b) obj;
                int i27 = com.waze.br.b.f17316a;
                h.g.b.x.f(bVar14, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i28 = h.g.b.ar.f48106a;
                return new com.waze.br.a.r((com.waze.br.a.ab) bVar14.a(new h.g.b.m(com.waze.br.a.ab.class), null, null));
        }
    }
}
