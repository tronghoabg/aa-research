package com.waze.main_screen.c;

import androidx.compose.runtime.saveable.SaverScope;
import com.waze.NativeManager;
import com.waze.config.ConfigValues;
import com.waze.main_screen.p.bu;
import com.waze.navigate.NavigationInfoNativeManager;
import com.waze.navigate.cf;
import com.waze.navigate.cg;
import com.waze.navigate.ch;
import com.waze.navigate.cj;
import com.waze.navigate.cr;
import com.waze.navigate.dg;
import com.waze.navigate.eo;
import com.waze.rtalerts.RtAlertsNativeManager;
import com.waze.sound.bs;
import com.waze.stats.ax;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class ap implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f26127a;

    public /* synthetic */ ap(int i2) {
        this.f26127a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26127a) {
            case 0:
                ao aoVar = (ao) obj2;
                h.g.b.x.f((SaverScope) obj, "$this$listSaver");
                h.g.b.x.f(aoVar, "state");
                return h.a.i.d(aoVar.b());
            case 1:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                int i2 = com.waze.main_screen.k.c.f26583a;
                h.g.b.x.f(bVar, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i3 = h.g.b.ar.f48106a;
                return new com.waze.an.b.e((com.waze.main_screen.k.a) bVar.a(new h.g.b.m(com.waze.main_screen.k.a.class), null, null), bVar);
            case 2:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                int i4 = com.waze.main_screen.k.c.f26583a;
                h.g.b.x.f(bVar2, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                kotlinx.coroutines.ab abVarA = av.a();
                h.g.b.x.f(bVar2, "koinScope");
                h.g.b.x.f(abVarA, "coroutineContext");
                if (ConfigValues.CONFIG_VALUE_INSIGHT_STANDARD_ENABLED.b().booleanValue()) {
                    int i5 = h.g.b.ar.f48106a;
                    return new com.waze.an.d.d((com.waze.an.a.a.ar) bVar2.a(new h.g.b.m(com.waze.an.a.a.ar.class), null, null), abVarA);
                }
                int i6 = h.g.b.ar.f48106a;
                return new com.waze.an.d.a((com.waze.alerters.a.i) bVar2.a(new h.g.b.m(com.waze.alerters.a.i.class), null, null));
            case 3:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                int i7 = com.waze.main_screen.k.c.f26583a;
                h.g.b.x.f(bVar3, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i8 = h.g.b.ar.f48106a;
                com.waze.shared_infra.o.a aVar = (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                com.waze.main_screen.k.a aVar2 = (com.waze.main_screen.k.a) bVar3.a(new h.g.b.m(com.waze.main_screen.k.a.class), null, null);
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("Insights");
                h.g.b.x.e(eVarD, "create(...)");
                return new com.waze.an.c.a.g(aVar, aVar2, eVarD);
            case 4:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i9 = com.waze.main_screen.k.c.f26583a;
                h.g.b.x.f(bVar4, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i10 = h.g.b.ar.f48106a;
                return new com.waze.an.e.j((ax) bVar4.a(new h.g.b.m(ax.class), null, null));
            case 5:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                int i11 = com.waze.main_screen.k.c.f26583a;
                h.g.b.x.f(bVar5, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i12 = h.g.b.ar.f48106a;
                return new com.waze.an.e.a((ax) bVar5.a(new h.g.b.m(ax.class), null, null));
            case 6:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                int i13 = com.waze.main_screen.k.c.f26583a;
                h.g.b.x.f(bVar6, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i14 = h.g.b.ar.f48106a;
                com.waze.an.b.g gVarA = ((com.waze.an.b.e) bVar6.a(new h.g.b.m(com.waze.an.b.e.class), null, null)).a();
                boolean zD = ((com.waze.main_screen.k.a) bVar6.a(new h.g.b.m(com.waze.main_screen.k.a.class), null, null)).d();
                com.waze.an.c.a.g gVar = (com.waze.an.c.a.g) bVar6.a(new h.g.b.m(com.waze.an.c.a.g.class), null, null);
                com.waze.an.c.x xVar = new com.waze.an.c.x((com.waze.an.e.a) bVar6.a(new h.g.b.m(com.waze.an.e.a.class), null, null));
                com.waze.an.e.a aVar3 = (com.waze.an.e.a) bVar6.a(new h.g.b.m(com.waze.an.e.a.class), null, null);
                com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("Insights");
                h.g.b.x.e(eVarD2, "create(...)");
                return new com.waze.main_screen.k.a.u(gVarA, eVarD2, gVar, xVar, aVar3, zD);
            case 7:
                com.waze.an.c.k kVar = (com.waze.an.c.k) obj;
                com.waze.an.c.k kVar2 = (com.waze.an.c.k) obj2;
                return Boolean.valueOf(h.g.b.x.n(kVar != null ? kVar.h() : null, kVar2 != null ? kVar2.h() : null));
            case 8:
                org.a.d.k.b bVar7 = (org.a.d.k.b) obj;
                int i15 = com.waze.main_screen.l.b.f26596a;
                h.g.b.x.f(bVar7, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i16 = h.g.b.ar.f48106a;
                return new com.waze.main_screen.l.a.e((NavigationInfoNativeManager) bVar7.a(new h.g.b.m(NavigationInfoNativeManager.class), null, null), (RtAlertsNativeManager) bVar7.a(new h.g.b.m(RtAlertsNativeManager.class), null, null));
            case 9:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                int i17 = com.waze.main_screen.l.b.f26596a;
                h.g.b.x.f(bVar8, "$this$viewModel");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i18 = h.g.b.ar.f48106a;
                return new com.waze.main.navigate.g((com.waze.main_screen.l.b.e) bVar8.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null));
            case 10:
                int i19 = com.waze.main_screen.l.b.f26596a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.main_screen.l.b.d();
            case 11:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                int i20 = com.waze.main_screen.l.b.f26596a;
                h.g.b.x.f(bVar9, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i21 = h.g.b.ar.f48106a;
                com.waze.main_screen.l.a.e eVar = (com.waze.main_screen.l.a.e) bVar9.a(new h.g.b.m(com.waze.main_screen.l.a.e.class), null, null);
                com.waze.navigate.b.g gVar2 = (com.waze.navigate.b.g) bVar9.a(new h.g.b.m(com.waze.navigate.b.g.class), null, null);
                cr crVar = (cr) bVar9.a(new h.g.b.m(cr.class), null, null);
                com.waze.main_screen.l.b.d dVar = (com.waze.main_screen.l.b.d) bVar9.a(new h.g.b.m(com.waze.main_screen.l.b.d.class), null, null);
                com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("NavInstListStateHolder");
                h.g.b.x.e(eVarD3, "create(...)");
                return new com.waze.main_screen.l.b.f(eVar, crVar, dVar, gVar2, eVarD3);
            case 12:
                int i22 = bu.f27237a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.main_screen.q.a.b();
            case 13:
                org.a.d.k.b bVar10 = (org.a.d.k.b) obj;
                int i23 = bu.f27237a;
                h.g.b.x.f(bVar10, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i24 = h.g.b.ar.f48106a;
                return new com.waze.main_screen.q.b.j((com.waze.main_screen.q.a.b) bVar10.a(new h.g.b.m(com.waze.main_screen.q.a.b.class), null, null));
            case 14:
                int i25 = com.waze.main_screen.p.a.a.f26736a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.main_screen.p.a.a.a();
            case 15:
                org.a.d.k.b bVar11 = (org.a.d.k.b) obj;
                int i26 = com.waze.main_screen.p.a.a.f26736a;
                h.g.b.x.f(bVar11, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i27 = h.g.b.ar.f48106a;
                cg cgVar = (cg) bVar11.a(new h.g.b.m(cg.class), null, null);
                cj cjVar = (cj) bVar11.a(new h.g.b.m(cj.class), null, null);
                eo eoVar = (eo) bVar11.a(new h.g.b.m(eo.class), null, null);
                com.waze.network.b.al alVar = (com.waze.network.b.al) bVar11.a(new h.g.b.m(com.waze.network.b.al.class), null, null);
                com.waze.network.b.y yVar = (com.waze.network.b.y) bVar11.a(new h.g.b.m(com.waze.network.b.y.class), null, null);
                com.waze.main_screen.bottom_bars.scrollable_eta.q qVar = (com.waze.main_screen.bottom_bars.scrollable_eta.q) bVar11.a(new h.g.b.m(com.waze.main_screen.bottom_bars.scrollable_eta.q.class), null, null);
                bs bsVar = (bs) bVar11.a(new h.g.b.m(bs.class), null, null);
                com.waze.shared_infra.o.a aVar4 = (com.waze.shared_infra.o.a) bVar11.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                com.waze.app_nav.w wVar = (com.waze.app_nav.w) bVar11.a(new h.g.b.m(com.waze.app_nav.w.class), null, null);
                com.waze.settings.ai aiVar = (com.waze.settings.ai) bVar11.a(new h.g.b.m(com.waze.settings.ai.class), null, null);
                com.waze.as.a aVar5 = (com.waze.as.a) bVar11.a(new h.g.b.m(com.waze.as.a.class), null, null);
                com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("EtaBarStateHolder");
                h.g.b.x.e(eVarD4, "create(...)");
                return new com.waze.main_screen.p.a.b.b.a(cgVar, cjVar, eoVar, alVar, yVar, qVar, bsVar, aVar4, wVar, aiVar, aVar5, eVarD4);
            case 16:
                org.a.d.k.b bVar12 = (org.a.d.k.b) obj;
                int i28 = com.waze.main_screen.p.a.a.f26736a;
                h.g.b.x.f(bVar12, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i29 = h.g.b.ar.f48106a;
                return new com.waze.main_screen.p.a.b.b.ak((cg) bVar12.a(new h.g.b.m(cg.class), null, null), (cf) bVar12.a(new h.g.b.m(cf.class), null, null), (com.waze.ev.n) bVar12.a(new h.g.b.m(com.waze.ev.n.class), null, null), (eo) bVar12.a(new h.g.b.m(eo.class), null, null), (com.waze.main_screen.p.a.a.a) bVar12.a(new h.g.b.m(com.waze.main_screen.p.a.a.a.class), null, null));
            case 17:
                org.a.d.k.b bVar13 = (org.a.d.k.b) obj;
                int i30 = com.waze.main_screen.p.a.a.f26736a;
                h.g.b.x.f(bVar13, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i31 = h.g.b.ar.f48106a;
                return new com.waze.main_screen.p.a.b.b.r((cg) bVar13.a(new h.g.b.m(cg.class), null, null), (eo) bVar13.a(new h.g.b.m(eo.class), null, null), (com.waze.sharedrive.e.j) bVar13.a(new h.g.b.m(com.waze.sharedrive.e.j.class), null, null));
            case 18:
                org.a.d.k.b bVar14 = (org.a.d.k.b) obj;
                int i32 = com.waze.main_screen.p.a.a.f26736a;
                h.g.b.x.f(bVar14, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i33 = h.g.b.ar.f48106a;
                return new com.waze.main_screen.p.a.b.b.ad((ch) bVar14.a(new h.g.b.m(ch.class), null, null), (com.waze.main_screen.p.a.b.b.a) bVar14.a(new h.g.b.m(com.waze.main_screen.p.a.b.b.a.class), null, null), (com.waze.main_screen.p.a.b.b.ak) bVar14.a(new h.g.b.m(com.waze.main_screen.p.a.b.b.ak.class), null, null), (com.waze.main_screen.p.a.b.b.r) bVar14.a(new h.g.b.m(com.waze.main_screen.p.a.b.b.r.class), null, null), (com.waze.main_screen.p.a.a.a) bVar14.a(new h.g.b.m(com.waze.main_screen.p.a.a.a.class), null, null), (com.waze.main_screen.bottom_bars.scrollable_eta.q) bVar14.a(new h.g.b.m(com.waze.main_screen.bottom_bars.scrollable_eta.q.class), null, null), (NativeManager) bVar14.a(new h.g.b.m(NativeManager.class), null, null));
            case 19:
                h.g.b.x.f((org.a.d.k.b) obj, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.main_screen.p.b.a.b.b();
            default:
                org.a.d.k.b bVar15 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar15, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i34 = h.g.b.ar.f48106a;
                dg dgVar = (dg) bVar15.a(new h.g.b.m(dg.class), null, null);
                com.waze.main_screen.p.b.a.b.b bVar16 = (com.waze.main_screen.p.b.a.b.b) bVar15.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.b.class), null, null);
                com.waze.navigate.b.g gVar3 = (com.waze.navigate.b.g) bVar15.a(new h.g.b.m(com.waze.navigate.b.g.class), null, null);
                com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("NavBarStateHolder");
                h.g.b.x.e(eVarD5, "create(...)");
                return new com.waze.main_screen.p.b.a.b.d(dgVar, bVar16, gVar3, eVarD5);
        }
    }
}
