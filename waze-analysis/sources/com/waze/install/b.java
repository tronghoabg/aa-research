package com.waze.install;

import android.app.Application;
import android.content.Context;
import com.waze.ConfigManager;
import com.waze.config.ConfigValues;
import com.waze.lc;
import com.waze.location.bn;
import com.waze.main_screen.be;
import com.waze.navigate.dg;
import com.waze.reports_v2.presentation.a.ba;
import com.waze.sound.co;
import com.waze.stats.ax;
import com.waze.view.bottom.BottomNotificationNativeManager;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class b implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f24769a;

    public /* synthetic */ b(int i2) {
        this.f24769a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        byte[] bArr = null;
        switch (this.f24769a) {
            case 0:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                int i2 = g.f24774a;
                h.g.b.x.f(bVar, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i3 = h.g.b.ar.f48106a;
                Context context = (Context) bVar.a(new h.g.b.m(Context.class), null, null);
                h.f fVarA = h.g.a(new com.waze.beacons.a.a(bVar, 4));
                ch chVarA = ((com.waze.shared_infra.r.y) bVar.a(new h.g.b.m(com.waze.shared_infra.r.y.class), null, null)).a();
                x xVar = (x) bVar.a(new h.g.b.m(x.class), null, null);
                d dVar = d.f24771a;
                com.waze.app_nav.hub.b.c cVar = (com.waze.app_nav.hub.b.c) bVar.a(new h.g.b.m(com.waze.app_nav.hub.b.c.class), null, null);
                e eVar = e.f24772a;
                f fVar = f.f24773a;
                com.waze.tide.o oVar = (com.waze.tide.o) bVar.a(new h.g.b.m(com.waze.tide.o.class), null, null);
                com.waze.aq.o oVar2 = (com.waze.aq.o) bVar.a(new h.g.b.m(com.waze.aq.o.class), null, null);
                com.waze.al.a.a aVar = (com.waze.al.a.a) bVar.a(new h.g.b.m(com.waze.al.a.a.class), null, null);
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeInstall");
                h.g.b.x.e(eVarD, "create(...)");
                return new ae(context, eVarD, fVarA, chVarA, xVar, dVar, cVar, eVar, fVar, oVar, oVar2, aVar);
            case 1:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar2, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i4 = h.g.b.ar.f48106a;
                return new com.waze.location.a.g((com.waze.an.d.b) bVar2.a(new h.g.b.m(com.waze.an.d.b.class), null, null), (com.waze.shared_infra.o.a) bVar2.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (co) bVar2.a(new h.g.b.m(co.class), null, null), (com.waze.sound.d.a) bVar2.a(new h.g.b.m(com.waze.sound.d.a.class), null, null), kotlinx.coroutines.aj.f(), com.waze.settings.tree.c.f.g(bVar2, "LocationInconsistencyInsightPresenter"));
            case 2:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar3, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                com.waze.shared_infra.i.e eVarG = com.waze.settings.tree.c.f.g(bVar3, "Location");
                int i5 = h.g.b.ar.f48106a;
                com.waze.location.y yVar = (com.waze.location.y) bVar3.a(new h.g.b.m(com.waze.location.y.class), null, null);
                com.waze.location.a.b bVar4 = (com.waze.location.a.b) bVar3.a(new h.g.b.m(com.waze.location.a.b.class), null, null);
                Long lB = ConfigValues.CONFIG_VALUE_GPS_ISSUE_DETECTOR_TIME_INCONSISTENCY_THRESHOLD_MS.b();
                h.g.b.x.e(lB, "getValue(...)");
                Long lB2 = ConfigValues.CONFIG_VALUE_GPS_ISSUE_DETECTOR_LOCATION_INCONSISTENCY_METERS.b();
                h.g.b.x.e(lB2, "getValue(...)");
                long jLongValue = lB2.longValue();
                h.o.c cVar2 = h.o.a.f48264a;
                Long lB3 = ConfigValues.CONFIG_VALUE_GPS_ISSUE_DETECTOR_LOCATION_INCONSISTENCY_MAX_TIME_MS.b();
                h.g.b.x.e(lB3, "getValue(...)");
                Long lB4 = ConfigValues.CONFIG_VALUE_GPS_ISSUE_DETECTOR_STALE_LOCATION_THRESHOLD_MS.b();
                h.g.b.x.e(lB4, "getValue(...)");
                return new com.waze.location.a.w(eVarG, bVar4, yVar, h.a.i.i(new com.waze.location.a.af(lB.longValue(), 0), new com.waze.location.a.d(jLongValue, h.o.c.j(lB3.longValue(), h.o.d.f48272c)), new com.waze.location.a.af(lB4.longValue(), 1)), (com.waze.location.a.n) bVar3.a(new h.g.b.m(com.waze.location.a.n.class), null, null), (com.waze.location.a.h) bVar3.a(new h.g.b.m(com.waze.location.a.h.class), null, null), (com.waze.location.a.p) bVar3.a(new h.g.b.m(com.waze.location.a.p.class), null, null));
            case 3:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar5, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i6 = h.g.b.ar.f48106a;
                return new com.waze.location.a.o((ax) bVar5.a(new h.g.b.m(ax.class), null, null));
            case 4:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar6, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i7 = h.g.b.ar.f48106a;
                return new bn((ax) bVar6.a(new h.g.b.m(ax.class), null, null));
            case 5:
                org.a.d.k.b bVar7 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar7, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i8 = h.g.b.ar.f48106a;
                return new com.waze.location.g((dg) bVar7.a(new h.g.b.m(dg.class), null, null), (com.waze.location.y) bVar7.a(new h.g.b.m(com.waze.location.y.class), null, null), (com.waze.shared_infra.q.e) bVar7.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null));
            case 6:
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                com.waze.location.o oVarA = com.waze.location.z.a();
                h.g.b.x.e(oVarA, "getInstance(...)");
                return oVarA;
            case 7:
                h.g.b.x.f((org.a.d.k.b) obj, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.location.v();
            case 8:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar8, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                com.waze.shared_infra.i.e eVarG2 = com.waze.settings.tree.c.f.g(bVar8, "Location");
                int i9 = h.g.b.ar.f48106a;
                return new com.waze.location.u(eVarG2, (com.waze.location.w) bVar8.a(new h.g.b.m(com.waze.location.w.class), null, null), (com.waze.ai.a) bVar8.a(new h.g.b.m(com.waze.ai.a.class), null, null), (com.waze.shared_infra.q.e) bVar8.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null), new com.waze.c.d.as(), new com.waze.c.d.as(bArr));
            case 9:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar9, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i10 = h.g.b.ar.f48106a;
                return new com.waze.location.a.ae((dg) bVar9.a(new h.g.b.m(dg.class), null, null), (com.waze.sharedui.e.g) bVar9.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null));
            case 10:
                org.a.d.k.b bVar10 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar10, "$this$viewModel");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i11 = h.g.b.ar.f48106a;
                return new com.waze.location.ax((Application) bVar10.a(new h.g.b.m(Application.class), null, null), (com.waze.app_nav.hub.b.c) bVar10.e().a().c().a(new h.g.b.m(com.waze.app_nav.hub.b.c.class), null, null), new com.waze.beacons.a.a(bVar10, 5));
            case 11:
                h.g.b.x.f((org.a.d.k.b) obj, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.location.s();
            case 12:
                org.a.d.k.b bVar11 = (org.a.d.k.b) obj;
                org.a.d.h.a aVar2 = (org.a.d.h.a) obj2;
                h.g.b.x.f(bVar11, "$this$factory");
                h.g.b.x.f(aVar2, "<destruct>");
                int i12 = h.g.b.ar.f48106a;
                com.waze.location.b.a aVar3 = (com.waze.location.b.a) aVar2.c(new h.g.b.m(com.waze.location.b.a.class));
                com.waze.sharedui.e.g gVar = (com.waze.sharedui.e.g) bVar11.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                com.waze.location.y yVar2 = (com.waze.location.y) bVar11.a(new h.g.b.m(com.waze.location.y.class), null, null);
                com.waze.perf.tracer.g gVar2 = (com.waze.perf.tracer.g) bVar11.a(new h.g.b.m(com.waze.perf.tracer.g.class), null, null);
                com.waze.shared_infra.q.e eVar2 = (com.waze.shared_infra.q.e) bVar11.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null);
                com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("FreshLocationProvider");
                h.g.b.x.e(eVarD2, "create(...)");
                return new com.waze.location.b.i(aVar3, gVar, yVar2, eVarD2, gVar2, eVar2);
            case 13:
                org.a.d.k.b bVar12 = (org.a.d.k.b) obj;
                int i13 = com.waze.at.a.f15649a;
                h.g.b.x.f(bVar12, "$this$viewModel");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i14 = h.g.b.ar.f48106a;
                return new com.waze.at.b.f((com.waze.app_nav.w) bVar12.a(new h.g.b.m(com.waze.app_nav.w.class), null, null), (com.waze.shared_infra.r.a) bVar12.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null), (lc) bVar12.a(new h.g.b.m(lc.class), null, null));
            case 14:
                org.a.d.k.b bVar13 = (org.a.d.k.b) obj;
                int i15 = com.waze.at.a.f15649a;
                h.g.b.x.f(bVar13, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i16 = h.g.b.ar.f48106a;
                com.waze.app_nav.w wVar = (com.waze.app_nav.w) bVar13.a(new h.g.b.m(com.waze.app_nav.w.class), null, null);
                com.waze.shared_infra.r.a aVar4 = (com.waze.shared_infra.r.a) bVar13.a(new h.g.b.m(com.waze.shared_infra.r.a.class), null, null);
                int i17 = kotlinx.coroutines.av.f51370a;
                return new com.waze.at.a.b(wVar, aVar4, kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a.c()));
            case 15:
                org.a.d.k.b bVar14 = (org.a.d.k.b) obj;
                int i18 = com.waze.main_screen.k.f26497a;
                h.g.b.x.f(bVar14, "$this$viewModel");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i19 = h.g.b.ar.f48106a;
                return new be(com.waze.copilot.data.b.k.f((com.waze.crash.c) bVar14.a(new h.g.b.m(com.waze.crash.c.class), null, null), (com.waze.shared_infra.i.b) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null), "WazeMainScreenViewModel"), (com.waze.main_screen.ad.a.h) bVar14.a(new h.g.b.m(com.waze.main_screen.ad.a.h.class), null, null), (com.waze.main_screen.k.a.u) bVar14.a(new h.g.b.m(com.waze.main_screen.k.a.u.class), null, null), (com.waze.cg.b.e) bVar14.a(new h.g.b.m(com.waze.cg.b.e.class), null, null), (com.waze.main_screen.c.r) bVar14.a(new h.g.b.m(com.waze.main_screen.c.r.class), null, null), (com.waze.nav_connect.b.x) bVar14.a(new h.g.b.m(com.waze.nav_connect.b.x.class), null, null), (com.waze.ao) bVar14.a(new h.g.b.m(com.waze.ao.class), null, null), (com.waze.sharedrive.d.a) bVar14.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null), (com.waze.bf.c.b) bVar14.a(new h.g.b.m(com.waze.bf.c.b.class), null, null), (com.waze.ac.c.b) bVar14.a(new h.g.b.m(com.waze.ac.c.b.class), null, null), (com.waze.reports_v2.presentation.a.s) bVar14.a(new h.g.b.m(com.waze.reports_v2.presentation.a.s.class), null, null), (ba) bVar14.a(new h.g.b.m(ba.class), null, null), (com.waze.o.d.b.b.d) bVar14.a(new h.g.b.m(com.waze.o.d.b.b.d.class), null, null));
            case 16:
                org.a.d.k.b bVar15 = (org.a.d.k.b) obj;
                com.waze.main_screen.s sVar = com.waze.main_screen.s.f27419a;
                h.g.b.x.f(bVar15, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i20 = h.g.b.ar.f48106a;
                return new com.waze.main_screen.g.a.b((BottomNotificationNativeManager) bVar15.a(new h.g.b.m(BottomNotificationNativeManager.class), null, null));
            case 17:
                org.a.d.k.b bVar16 = (org.a.d.k.b) obj;
                com.waze.main_screen.u uVar = com.waze.main_screen.u.f27645a;
                h.g.b.x.f(bVar16, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i21 = h.g.b.ar.f48106a;
                return new com.waze.main_screen.j((ax) bVar16.a(new h.g.b.m(ax.class), null, null));
            case 18:
                org.a.d.k.b bVar17 = (org.a.d.k.b) obj;
                com.waze.main_screen.u uVar2 = com.waze.main_screen.u.f27645a;
                h.g.b.x.f(bVar17, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i22 = h.g.b.ar.f48106a;
                return new com.waze.main_screen.o.g((com.waze.sharedui.f.f) bVar17.a(new h.g.b.m(com.waze.sharedui.f.f.class), null, null), com.waze.shared_infra.i.a.d("MenuBannersApi"));
            case 19:
                org.a.d.k.b bVar18 = (org.a.d.k.b) obj;
                com.waze.main_screen.u uVar3 = com.waze.main_screen.u.f27645a;
                h.g.b.x.f(bVar18, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                kotlinx.coroutines.af afVarF = kotlinx.coroutines.aj.f();
                int i23 = h.g.b.ar.f48106a;
                com.waze.main_screen.o.d dVar2 = (com.waze.main_screen.o.d) bVar18.a(new h.g.b.m(com.waze.main_screen.o.d.class), null, null);
                ch chVarA2 = ((com.waze.shared_infra.r.y) bVar18.a(new h.g.b.m(com.waze.shared_infra.r.y.class), null, null)).a();
                h.g.b.x.f(chVarA2, "userUpdateFlow");
                return new com.waze.main_screen.o.r(afVarF, dVar2, kotlinx.coroutines.b.ai.y(new com.waze.main_screen.o.j(chVarA2)), com.waze.shared_infra.i.a.d("MenuBannersRepository"));
            default:
                org.a.d.k.b bVar19 = (org.a.d.k.b) obj;
                com.waze.main_screen.u uVar4 = com.waze.main_screen.u.f27645a;
                h.g.b.x.f(bVar19, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i24 = h.g.b.ar.f48106a;
                return new com.waze.main_screen.c((ConfigManager) bVar19.a(new h.g.b.m(ConfigManager.class), null, null));
        }
    }
}
