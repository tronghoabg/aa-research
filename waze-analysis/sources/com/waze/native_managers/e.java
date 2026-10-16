package com.waze.native_managers;

import com.waze.audit.WazeAuditReporterNativeManager;
import com.waze.crash.CrashNativeManager;
import com.waze.favorites.FavoritesNativeManager;
import com.waze.gas.GasNativeManager;
import com.waze.install.InstallNativeManager;
import com.waze.reports.WazeReportNativeManager;
import com.waze.settings.SettingsNativeManager;
import com.waze.share.ShareNativeManager;
import com.waze.stats.AdEventsReporterNativeManager;
import com.waze.stats.MetricsReporterNativeManager;
import com.waze.stats.StatsReporterNativeManager;
import com.waze.system.SystemNativeManager;
import com.waze.view.bottom.BottomNotificationNativeManager;
import com.waze.web.r;
import h.ab;
import h.g.b.ar;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class e implements h.g.a.l {
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        org.a.d.g.a aVar = (org.a.d.g.a) obj;
        int i2 = g.f30689a;
        x.f(aVar, "$this$module");
        com.waze.modules.d.j jVar = new com.waze.modules.d.j(14);
        org.a.d.i.b bVar = org.a.d.j.a.f56411b;
        org.a.d.c.c cVar = org.a.d.c.c.f56382a;
        List listH = h.a.i.h();
        int i3 = ar.f48106a;
        org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(bVar, new h.g.b.m(AdEventsReporterNativeManager.class), null, jVar, cVar, listH));
        aVar.f(eVar);
        new org.a.d.c.d(aVar, eVar);
        org.a.d.e.e eVar2 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(BottomNotificationNativeManager.class), null, new com.waze.modules.d.j(18), cVar, h.a.i.h()));
        aVar.f(eVar2);
        new org.a.d.c.d(aVar, eVar2);
        org.a.d.e.e eVar3 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(CrashNativeManager.class), null, new com.waze.modules.d.j(19), cVar, h.a.i.h()));
        aVar.f(eVar3);
        new org.a.d.c.d(aVar, eVar3);
        org.a.d.e.e eVar4 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(FavoritesNativeManager.class), null, new com.waze.modules.d.j(20), cVar, h.a.i.h()));
        aVar.f(eVar4);
        new org.a.d.c.d(aVar, eVar4);
        org.a.d.e.e eVar5 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(InstallNativeManager.class), null, new f(1), cVar, h.a.i.h()));
        aVar.f(eVar5);
        new org.a.d.c.d(aVar, eVar5);
        org.a.d.e.e eVar6 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(MetricsReporterNativeManager.class), null, new f(0), cVar, h.a.i.h()));
        aVar.f(eVar6);
        new org.a.d.c.d(aVar, eVar6);
        org.a.d.e.e eVar7 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(SettingsNativeManager.class), null, new com.waze.modules.d.j(10), cVar, h.a.i.h()));
        aVar.f(eVar7);
        new org.a.d.c.d(aVar, eVar7);
        org.a.d.e.e eVar8 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(ShareNativeManager.class), null, new com.waze.modules.d.j(11), cVar, h.a.i.h()));
        aVar.f(eVar8);
        new org.a.d.c.d(aVar, eVar8);
        org.a.d.e.e eVar9 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(SystemNativeManager.class), null, new com.waze.modules.d.j(12), cVar, h.a.i.h()));
        aVar.f(eVar9);
        new org.a.d.c.d(aVar, eVar9);
        org.a.d.e.e eVar10 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(StatsReporterNativeManager.class), null, new com.waze.modules.d.j(13), cVar, h.a.i.h()));
        aVar.f(eVar10);
        new org.a.d.c.d(aVar, eVar10);
        org.a.d.e.e eVar11 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(WazeAuditReporterNativeManager.class), null, new com.waze.modules.d.j(15), cVar, h.a.i.h()));
        aVar.f(eVar11);
        r.r(new org.a.d.c.d(aVar, eVar11), new h.l.c[]{new h.g.b.m(com.waze.sharedui.b.d.class)});
        org.a.d.e.e eVar12 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(GasNativeManager.class), null, new com.waze.modules.d.j(16), cVar, h.a.i.h()));
        aVar.f(eVar12);
        new org.a.d.c.d(aVar, eVar12);
        org.a.d.e.e eVar13 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(WazeReportNativeManager.class), null, new com.waze.modules.d.j(17), cVar, h.a.i.h()));
        aVar.f(eVar13);
        new org.a.d.c.d(aVar, eVar13);
        return ab.f48028a;
    }
}
