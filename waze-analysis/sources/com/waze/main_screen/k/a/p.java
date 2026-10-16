package com.waze.main_screen.k.a;

import com.waze.ao;
import com.waze.google_assistant.aa;
import com.waze.main_screen.v.ad;
import com.waze.main_screen.v.ae;
import com.waze.main_screen.v.z;
import com.waze.map.b.ai;
import com.waze.modules.navigation.bp;
import com.waze.navigate.ce;
import com.waze.navigate.dg;
import com.waze.navigate.en;
import com.waze.navigate.gj;
import com.waze.sdk.bd;
import com.waze.settings.hd;
import com.waze.sound.ho;
import com.waze.sound.ih;
import com.waze.sound.js;
import com.waze.stats.ax;
import h.g.b.ar;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.av;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class p implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f26552a;

    public /* synthetic */ p(int i2) {
        this.f26552a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26552a) {
            case 0:
                a aVar = (a) obj2;
                com.waze.an.c.a.p pVarD = ((a) obj).d();
                com.waze.an.a.v vVarA = pVarD != null ? pVarD.a() : null;
                com.waze.an.c.a.p pVarD2 = aVar.d();
                return Boolean.valueOf(x.n(vVarA, pVarD2 != null ? pVarD2.a() : null));
            case 1:
                return Boolean.valueOf(u.m((List) obj, (List) obj2));
            case 2:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                int i2 = com.waze.main_screen.v.h.f27796a;
                x.f(bVar, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i3 = ar.f48106a;
                com.waze.main_screen.v.j jVar = (com.waze.main_screen.v.j) bVar.a(new h.g.b.m(com.waze.main_screen.v.j.class), null, null);
                en enVar = (en) bVar.a(new h.g.b.m(dg.class), null, null);
                com.waze.bn.b bVar2 = (com.waze.bn.b) bVar.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                com.waze.sharedui.web.j jVar2 = (com.waze.sharedui.web.j) bVar.a(new h.g.b.m(com.waze.sharedui.web.j.class), null, null);
                ao aoVar = (ao) bVar.a(new h.g.b.m(ao.class), null, null);
                ch chVarF = com.waze.sharedui.profile.b.a().f();
                x.e(chVarF, "getProfileStateFlow(...)");
                return new z(jVar, enVar, bVar2, jVar2, aoVar, chVarF, com.waze.shared_infra.i.a.d("PromotionalChipStateHolder"), (ad) bVar.a(new h.g.b.m(ad.class), null, null), (com.waze.main_screen.i) bVar.a(new h.g.b.m(com.waze.main_screen.i.class), null, null));
            case 3:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                int i4 = com.waze.main_screen.v.h.f27796a;
                x.f(bVar3, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i5 = ar.f48106a;
                return new com.waze.main_screen.v.f((com.waze.sharedui.f.f) bVar3.a(new h.g.b.m(com.waze.sharedui.f.f.class), null, null), com.waze.shared_infra.i.a.d("PromotionalChipApi"));
            case 4:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i6 = com.waze.main_screen.v.h.f27796a;
                x.f(bVar4, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i7 = ar.f48106a;
                return new com.waze.main_screen.v.l((com.waze.main_screen.v.c) bVar4.a(new h.g.b.m(com.waze.main_screen.v.c.class), null, null), com.waze.shared_infra.i.a.d("PromotionalChipRepository"));
            case 5:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                int i8 = com.waze.main_screen.v.h.f27796a;
                x.f(bVar5, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i9 = ar.f48106a;
                return new ae((com.waze.main_screen.i) bVar5.a(new h.g.b.m(com.waze.main_screen.i.class), null, null));
            case 6:
                int i10 = com.waze.main_screen.w.a.f27854a;
                x.f((org.a.d.k.b) obj, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.main_screen.w.a.c(hd.f37382a, new com.waze.an.a.a.z());
            case 7:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                x.f(bVar6, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i11 = ar.f48106a;
                return new com.waze.main_screen.x.e(((com.waze.an.b.e) bVar6.a(new h.g.b.m(com.waze.an.b.e.class), null, null)).a());
            case 8:
                com.waze.an.b.f fVar = (com.waze.an.b.f) obj;
                com.waze.an.b.f fVar2 = (com.waze.an.b.f) obj2;
                x.f(fVar, "old");
                x.f(fVar2, "new");
                com.waze.an.a.r rVarB = fVar.b();
                com.waze.location.q qVarM = rVarB != null ? rVarB.m() : null;
                com.waze.an.a.r rVarB2 = fVar2.b();
                return Boolean.valueOf(x.n(qVarM, rVarB2 != null ? rVarB2.m() : null));
            case 9:
                org.a.d.k.b bVar7 = (org.a.d.k.b) obj;
                int i12 = com.waze.main_screen.z.a.f27887a;
                x.f(bVar7, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i13 = ar.f48106a;
                return new com.waze.main_screen.z.a.a.c((com.waze.app_nav.w) bVar7.a(new h.g.b.m(com.waze.app_nav.w.class), null, null), (com.waze.av.b.v) bVar7.a(new h.g.b.m(com.waze.av.b.v.class), null, null), (com.waze.shared_infra.o.a) bVar7.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (bp) bVar7.a(new h.g.b.m(bp.class), null, null));
            case 10:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                int i14 = com.waze.main_screen.z.a.f27887a;
                x.f(bVar8, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i15 = ar.f48106a;
                return new js((ih) bVar8.a(new h.g.b.m(ih.class), null, null));
            case 11:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                int i16 = com.waze.main_screen.z.a.f27887a;
                x.f(bVar9, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i17 = ar.f48106a;
                return new ho((ih) bVar9.a(new h.g.b.m(ih.class), null, null), (com.waze.sound.f.f) bVar9.a(new h.g.b.m(com.waze.sound.f.f.class), null, null), (aa) bVar9.a(new h.g.b.m(aa.class), null, null));
            case 12:
                org.a.d.k.b bVar10 = (org.a.d.k.b) obj;
                int i18 = com.waze.main_screen.z.a.f27887a;
                x.f(bVar10, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i19 = ar.f48106a;
                return new com.waze.menus.a.b.c((ax) bVar10.a(new h.g.b.m(ax.class), null, null));
            case 13:
                org.a.d.k.b bVar11 = (org.a.d.k.b) obj;
                int i20 = com.waze.main_screen.ab.j.f25666a;
                x.f(bVar11, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.main_screen.ab.h(bVar11);
            case 14:
                org.a.d.k.b bVar12 = (org.a.d.k.b) obj;
                int i21 = com.waze.main_screen.ab.j.f25666a;
                x.f(bVar12, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i22 = ar.f48106a;
                return new com.waze.main_screen.ab.a.q((ai) bVar12.a(new h.g.b.m(ai.class), null, null));
            case 15:
                org.a.d.k.b bVar13 = (org.a.d.k.b) obj;
                int i23 = com.waze.main_screen.ad.a.f25690a;
                x.f(bVar13, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i24 = ar.f48106a;
                return new com.waze.main_screen.ad.a.h((gj) bVar13.a(new h.g.b.m(gj.class), null, null), (com.waze.navigate.ao) bVar13.a(new h.g.b.m(com.waze.navigate.ao.class), null, null), (ce) bVar13.a(new h.g.b.m(ce.class), null, null), (com.waze.app_nav.w) bVar13.a(new h.g.b.m(com.waze.app_nav.w.class), null, null));
            case 16:
                org.a.d.k.b bVar14 = (org.a.d.k.b) obj;
                int i25 = com.waze.main_screen.ae.a.f25714a;
                x.f(bVar14, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i26 = ar.f48106a;
                return new com.waze.main_screen.ae.a.n((bd) bVar14.a(new h.g.b.m(bd.class), null, null), av.b(), (com.waze.main_screen.ae.a.o) bVar14.a(new h.g.b.m(com.waze.main_screen.ae.a.o.class), null, null));
            case 17:
                org.a.d.k.b bVar15 = (org.a.d.k.b) obj;
                int i27 = com.waze.main_screen.ae.a.f25714a;
                x.f(bVar15, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i28 = ar.f48106a;
                return new com.waze.main_screen.ae.a.h((bd) bVar15.a(new h.g.b.m(bd.class), null, null), av.b(), (com.waze.main_screen.ae.a.o) bVar15.a(new h.g.b.m(com.waze.main_screen.ae.a.o.class), null, null));
            case 18:
                org.a.d.k.b bVar16 = (org.a.d.k.b) obj;
                int i29 = com.waze.main_screen.ae.a.f25714a;
                x.f(bVar16, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i30 = ar.f48106a;
                return new com.waze.main_screen.ae.a.o((ax) bVar16.a(new h.g.b.m(ax.class), null, null));
            case 19:
                int i31 = com.waze.main_screen.ag.b.f25820a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.main_screen.ag.a.c();
            default:
                org.a.d.k.b bVar17 = (org.a.d.k.b) obj;
                int i32 = com.waze.main_screen.ag.b.f25820a;
                x.f(bVar17, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i33 = ar.f48106a;
                return new com.waze.main_screen.ag.a.h((com.waze.main_screen.ag.a.c) bVar17.a(new h.g.b.m(com.waze.main_screen.ag.a.c.class), null, null));
        }
    }
}
