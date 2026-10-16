package com.waze.map;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.waze.native_managers.WazeNativeLooperDispatcher;
import com.waze.nav_connect.NavConnectNativeManager;
import com.waze.navigate.location_preview.LocationPreviewActivity;
import com.waze.network.GrpcCallerNativeManager;
import com.waze.reports.AddPlaceFlowActivity;
import com.waze.resources.ResourcesNativeManager;
import com.waze.settings.SettingsMainActivity;
import i.b.l.ps;
import i.b.l.sl;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class gl implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f29157a;

    public /* synthetic */ gl(int i2) {
        this.f29157a = i2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        ps routingResponse;
        List<sl> alternativeResponseList;
        int i2 = 12;
        int i3 = 10;
        int i4 = 8;
        int i5 = 11;
        int i6 = 9;
        switch (this.f29157a) {
            case 0:
                return WazeMapNativeManager.onUserLocationClicked$lambda$0((com.waze.map.canvas.a.c) obj);
            case 1:
                return h.ab.f48028a;
            case 2:
                return WazeMapNativeManager.onMapInteractionStarted$lambda$0((com.waze.map.canvas.a.c) obj);
            case 3:
                return new com.waze.modules.navigation.a.c(((Boolean) obj).booleanValue());
            case 4:
                return new com.waze.modules.navigation.a.d(((Boolean) obj).booleanValue());
            case 5:
                org.a.d.g.a aVar = (org.a.d.g.a) obj;
                int i7 = com.waze.modules.b.e.f29821a;
                h.g.b.x.f(aVar, "$this$module");
                com.waze.av.b.ab abVar = new com.waze.av.b.ab(i4);
                org.a.d.i.b bVar = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar = org.a.d.c.c.f56382a;
                List listH = h.a.i.h();
                int i8 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(bVar, new h.g.b.m(com.waze.modules.b.d.class), null, abVar, cVar, listH));
                aVar.f(eVar);
                new org.a.d.c.d(aVar, eVar);
                org.a.d.e.e eVar2 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.modules.b.i.class), null, new com.waze.av.b.ab(i6), cVar, h.a.i.h()));
                aVar.f(eVar2);
                new org.a.d.c.d(aVar, eVar2);
                org.a.d.e.e eVar3 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.modules.b.h.class), null, new com.waze.av.b.ab(i3), cVar, h.a.i.h()));
                aVar.f(eVar3);
                new org.a.d.c.d(aVar, eVar3);
                org.a.d.e.e eVar4 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.network.m.class), null, new com.waze.av.b.ab(i5), cVar, h.a.i.h()));
                aVar.f(eVar4);
                new org.a.d.c.d(aVar, eVar4);
                org.a.d.e.e eVar5 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(GrpcCallerNativeManager.class), null, new com.waze.av.b.ab(i2), cVar, h.a.i.h()));
                aVar.f(eVar5);
                new org.a.d.c.d(aVar, eVar5);
                org.a.d.e.a aVar2 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.ap.b.n.class), null, new com.waze.av.b.ab(13), org.a.d.c.c.f56383b, h.a.i.h()));
                aVar.f(aVar2);
                new org.a.d.c.d(aVar, aVar2);
                return h.ab.f48028a;
            case 6:
                sl slVar = (sl) obj;
                h.g.b.x.f(slVar, "it");
                return String.valueOf(slVar.getAltId());
            case 7:
                sl slVar2 = (sl) obj;
                h.g.b.x.f(slVar2, "it");
                return String.valueOf(slVar2.getAltId());
            case 8:
                i.b.l.cd cdVar = (i.b.l.cd) obj;
                h.g.b.x.f(cdVar, "it");
                return cdVar.getAlternativeRoutesResponse();
            case 9:
                i.b.l.cd cdVar2 = (i.b.l.cd) obj;
                h.g.b.x.f(cdVar2, "it");
                ps routingResponse2 = cdVar2.getRoutingResponse();
                h.g.b.x.e(routingResponse2, "getRoutingResponse(...)");
                return routingResponse2;
            case 10:
                i.b.l.cd cdVar3 = (i.b.l.cd) obj;
                long size = 0;
                if (cdVar3 != null && (routingResponse = cdVar3.getRoutingResponse()) != null && (alternativeResponseList = routingResponse.getAlternativeResponseList()) != null) {
                    size = alternativeResponseList.size();
                }
                return Long.valueOf(size);
            case 11:
                com.waze.stats.aw awVar = (com.waze.stats.aw) obj;
                boolean z = awVar instanceof com.waze.perf.j;
                int i9 = com.waze.modules.d.h.f30227a;
                com.waze.perf.j jVar = z ? (com.waze.perf.j) awVar : null;
                if (jVar != null) {
                    jVar.b();
                }
                return h.ab.f48028a;
            case 12:
                org.a.d.g.a aVar3 = (org.a.d.g.a) obj;
                int i10 = com.waze.modules.d.h.f30227a;
                h.g.b.x.f(aVar3, "$this$module");
                com.waze.av.b.ab abVar2 = new com.waze.av.b.ab(14);
                org.a.d.i.b bVar2 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar2 = org.a.d.c.c.f56382a;
                List listH2 = h.a.i.h();
                int i11 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar6 = new org.a.d.e.e(new org.a.d.c.a(bVar2, new h.g.b.m(com.waze.stats.aw.class), null, abVar2, cVar2, listH2));
                aVar3.f(eVar6);
                com.waze.web.r.s(new org.a.d.c.d(aVar3, eVar6), new gl(i5));
                org.a.d.e.e eVar7 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.stats.ax.class), null, new com.waze.av.b.ab(15), cVar2, h.a.i.h()));
                aVar3.f(eVar7);
                new org.a.d.c.d(aVar3, eVar7);
                org.a.d.e.a aVar4 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.stats.b.class), null, new com.waze.av.b.ab(16), org.a.d.c.c.f56383b, h.a.i.h()));
                aVar3.f(aVar4);
                new org.a.d.c.d(aVar3, aVar4);
                return h.ab.f48028a;
            case 13:
                org.a.d.g.a aVar5 = (org.a.d.g.a) obj;
                com.waze.mywaze.b bVar3 = com.waze.mywaze.b.f30576a;
                h.g.b.x.f(aVar5, "$this$module");
                com.waze.modules.d.j jVar2 = new com.waze.modules.d.j(i6);
                org.a.d.i.b bVar4 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar3 = org.a.d.c.c.f56383b;
                List listH3 = h.a.i.h();
                int i12 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar6 = new org.a.d.e.a(new org.a.d.c.a(bVar4, new h.g.b.m(com.waze.mywaze.ah.class), null, jVar2, cVar3, listH3));
                aVar5.f(aVar6);
                new org.a.d.c.d(aVar5, aVar6);
                return h.ab.f48028a;
            case 14:
                org.a.d.g.a aVar7 = (org.a.d.g.a) obj;
                int i13 = com.waze.native_managers.k.f30695a;
                h.g.b.x.f(aVar7, "$this$module");
                com.waze.native_managers.f fVar = new com.waze.native_managers.f(2);
                org.a.d.i.b bVar5 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar4 = org.a.d.c.c.f56382a;
                List listH4 = h.a.i.h();
                int i14 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar8 = new org.a.d.e.e(new org.a.d.c.a(bVar5, new h.g.b.m(com.waze.native_managers.o.class), null, fVar, cVar4, listH4));
                aVar7.f(eVar8);
                com.waze.web.r.q(new org.a.d.c.d(aVar7, eVar8), new h.g.b.m(com.waze.native_managers.p.class));
                org.a.d.e.e eVar9 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(WazeNativeLooperDispatcher.class), null, new com.waze.native_managers.f(3), cVar4, h.a.i.h()));
                aVar7.f(eVar9);
                new org.a.d.c.d(aVar7, eVar9);
                org.a.d.e.e eVar10 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.native_managers.j.class), null, new com.waze.native_managers.f(4), cVar4, h.a.i.h()));
                aVar7.f(eVar10);
                new org.a.d.c.d(aVar7, eVar10);
                return h.ab.f48028a;
            case 15:
                org.a.d.g.a aVar8 = (org.a.d.g.a) obj;
                int i15 = com.waze.nav_connect.b.f30751a;
                h.g.b.x.f(aVar8, "$this$module");
                com.waze.native_managers.f fVar2 = new com.waze.native_managers.f(5);
                org.a.d.i.b bVar6 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar5 = org.a.d.c.c.f56382a;
                List listH5 = h.a.i.h();
                int i16 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar11 = new org.a.d.e.e(new org.a.d.c.a(bVar6, new h.g.b.m(com.waze.nav_connect.a.f.class), null, fVar2, cVar5, listH5));
                aVar8.f(eVar11);
                new org.a.d.c.d(aVar8, eVar11);
                org.a.d.e.e eVar12 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.nav_connect.a.class), null, new com.waze.native_managers.f(6), cVar5, h.a.i.h()));
                aVar8.f(eVar12);
                new org.a.d.c.d(aVar8, eVar12);
                org.a.d.e.e eVar13 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.nav_connect.g.class), null, new com.waze.native_managers.f(7), cVar5, h.a.i.h()));
                aVar8.f(eVar13);
                new org.a.d.c.d(aVar8, eVar13);
                org.a.d.e.e eVar14 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(NavConnectNativeManager.class), null, new com.waze.native_managers.f(i4), cVar5, h.a.i.h()));
                aVar8.f(eVar14);
                new org.a.d.c.d(aVar8, eVar14);
                org.a.d.e.e eVar15 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.nav_connect.b.g.class), null, new com.waze.native_managers.f(i6), cVar5, h.a.i.h()));
                aVar8.f(eVar15);
                new org.a.d.c.d(aVar8, eVar15);
                org.a.d.e.e eVar16 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.nav_connect.b.b.class), null, new com.waze.native_managers.f(i3), cVar5, h.a.i.h()));
                aVar8.f(eVar16);
                new org.a.d.c.d(aVar8, eVar16);
                org.a.d.e.e eVar17 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.nav_connect.b.x.class), null, new com.waze.native_managers.f(i5), cVar5, h.a.i.h()));
                aVar8.f(eVar17);
                new org.a.d.c.d(aVar8, eVar17);
                org.a.d.e.e eVar18 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.nav_connect.c.b.class), null, new com.waze.native_managers.f(i2), cVar5, h.a.i.h()));
                aVar8.f(eVar18);
                new org.a.d.c.d(aVar8, eVar18);
                return h.ab.f48028a;
            case 16:
                String str = (String) obj;
                int i17 = com.waze.navbar.q.f30914a;
                h.g.b.x.f(str, "it");
                return ResourcesNativeManager.getInstance().getEncBitmap(str);
            case 17:
                int i18 = LocationPreviewActivity.f31472g;
                h.g.b.x.f((View) obj, "it");
                return h.ab.f48028a;
            case 18:
                Context context = (Context) obj;
                h.g.b.x.f(context, "it");
                int i19 = SettingsMainActivity.f36691g;
                return com.waze.br.c.d.e(context, "settings_main.notifications_and_reminders.planned_drive", "MAP");
            case 19:
                Context context2 = (Context) obj;
                h.g.b.x.f(context2, "it");
                Intent intentN = AddPlaceFlowActivity.n(context2);
                h.g.b.x.e(intentN, "getActivityIntentWithPermissionActivity(...)");
                return intentN;
            default:
                com.waze.ev.c cVar6 = (com.waze.ev.c) obj;
                h.g.b.x.f(cVar6, "it");
                return Float.valueOf(cVar6.a());
        }
    }
}
