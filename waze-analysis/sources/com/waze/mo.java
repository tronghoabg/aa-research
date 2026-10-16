package com.waze;

import com.waze.asks.WazeAsksNativeManager;
import com.waze.beacons.BeaconsNativeManager;
import com.waze.calendar.CalendarNativeManager;
import java.util.List;
import l.a.bjz;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class mo implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f29792a;

    public /* synthetic */ mo(int i2) {
        this.f29792a = i2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = 0;
        switch (this.f29792a) {
            case 0:
                return ni.a((org.a.d.g.a) obj);
            case 1:
                h.g.b.x.f((com.waze.app_nav.a.an) obj, "$this$startSubCoordinator");
                throw null;
            case 2:
                ((com.waze.app_nav.a.u) obj).a().a("settings_main", "MAP", false);
                return h.ab.f48028a;
            case 3:
                return ((com.waze.app_nav.hub.b.k) obj).c();
            case 4:
                org.a.d.g.a aVar = (org.a.d.g.a) obj;
                int i3 = com.waze.asks.ac.f15487a;
                h.g.b.x.f(aVar, "$this$module");
                com.waze.app_nav.hub.c cVar = new com.waze.app_nav.hub.c(3);
                org.a.d.i.b bVar = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar2 = org.a.d.c.c.f56382a;
                List listH = h.a.i.h();
                int i4 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(bVar, new h.g.b.m(WazeAsksNativeManager.class), null, cVar, cVar2, listH));
                aVar.f(eVar);
                new org.a.d.c.d(aVar, eVar);
                com.waze.app_nav.hub.c cVar3 = new com.waze.app_nav.hub.c(4);
                org.a.d.e.e eVar2 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.asks.x.class), null, cVar3, cVar2, h.a.i.h()));
                aVar.f(eVar2);
                new org.a.d.c.d(aVar, eVar2);
                com.waze.app_nav.hub.c cVar4 = new com.waze.app_nav.hub.c(5);
                org.a.d.e.e eVar3 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.asks.v.class), null, cVar4, cVar2, h.a.i.h()));
                aVar.f(eVar3);
                new org.a.d.c.d(aVar, eVar3);
                com.waze.app_nav.hub.c cVar5 = new com.waze.app_nav.hub.c(6);
                org.a.d.e.e eVar4 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.asks.ab.class), null, cVar5, cVar2, h.a.i.h()));
                aVar.f(eVar4);
                new org.a.d.c.d(aVar, eVar4);
                com.waze.app_nav.hub.c cVar6 = new com.waze.app_nav.hub.c(7);
                org.a.d.e.e eVar5 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.main_screen.af.a.i.class), null, cVar6, cVar2, h.a.i.h()));
                aVar.f(eVar5);
                new org.a.d.c.d(aVar, eVar5);
                com.waze.app_nav.hub.c cVar7 = new com.waze.app_nav.hub.c(8);
                org.a.d.e.e eVar6 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.asks.w.class), null, cVar7, cVar2, h.a.i.h()));
                aVar.f(eVar6);
                new org.a.d.c.d(aVar, eVar6);
                org.a.d.i.c cVar8 = new org.a.d.i.c(new h.g.b.m(com.waze.asks.ah.class));
                e.a.dx dxVar = new e.a.dx(cVar8, aVar);
                com.waze.app_nav.hub.c cVar9 = new com.waze.app_nav.hub.c(9);
                org.a.d.g.a aVarJ = dxVar.j();
                org.a.d.i.a aVarK = dxVar.k();
                org.a.d.c.c cVar10 = org.a.d.c.c.f56383b;
                org.a.d.e.a aVar2 = new org.a.d.e.a(new org.a.d.c.a(aVarK, new h.g.b.m(com.waze.asks.bj.class), null, cVar9, cVar10, h.a.i.h()));
                aVarJ.f(aVar2);
                new org.a.d.c.d(aVarJ, aVar2);
                aVar.c().add(cVar8);
                com.waze.app_nav.hub.c cVar11 = new com.waze.app_nav.hub.c(10);
                org.a.d.e.a aVar3 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.main_screen.af.b.i.class), null, cVar11, cVar10, h.a.i.h()));
                aVar.f(aVar3);
                new org.a.d.c.d(aVar, aVar3);
                return h.ab.f48028a;
            case 5:
                org.a.d.g.a aVar4 = (org.a.d.g.a) obj;
                int i5 = com.waze.authentication.aa.f15683a;
                h.g.b.x.f(aVar4, "$this$module");
                com.waze.authentication.y yVar = new com.waze.authentication.y(i2);
                org.a.d.i.b bVar2 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar12 = org.a.d.c.c.f56382a;
                List listH2 = h.a.i.h();
                int i6 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar7 = new org.a.d.e.e(new org.a.d.c.a(bVar2, new h.g.b.m(com.waze.authentication.al.class), null, yVar, cVar12, listH2));
                aVar4.f(eVar7);
                new org.a.d.c.d(aVar4, eVar7);
                return h.ab.f48028a;
            case 6:
                int i7 = com.waze.authentication.aa.f15683a;
                ((h.m) obj).b();
                return h.ab.f48028a;
            case 7:
                int i8 = com.waze.j.i.f24902b;
                com.waze.search.d.a.b.f().c(com.waze.search.stats.c.f36012a, bjz.MOBILE_ANDROID);
                return h.ab.f48028a;
            case 8:
                int i9 = com.waze.j.i.f24902b;
                return Boolean.valueOf(((com.waze.j.d) obj) instanceof com.waze.j.b);
            case 9:
                h.g.b.x.f((com.waze.search.e.p) obj, "it");
                return h.ab.f48028a;
            case 10:
                org.a.d.g.a aVar5 = (org.a.d.g.a) obj;
                int i10 = com.waze.beacons.v.f16288a;
                h.g.b.x.f(aVar5, "$this$module");
                com.waze.app_nav.hub.c cVar13 = new com.waze.app_nav.hub.c(11);
                org.a.d.i.b bVar3 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar14 = org.a.d.c.c.f56383b;
                List listH3 = h.a.i.h();
                int i11 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar6 = new org.a.d.e.a(new org.a.d.c.a(bVar3, new h.g.b.m(com.waze.beacons.b.class), null, cVar13, cVar14, listH3));
                aVar5.f(aVar6);
                new org.a.d.c.d(aVar5, aVar6);
                com.waze.app_nav.hub.c cVar15 = new com.waze.app_nav.hub.c(12);
                org.a.d.e.a aVar7 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.beacons.a.f.class), null, cVar15, cVar14, h.a.i.h()));
                aVar5.f(aVar7);
                new org.a.d.c.d(aVar5, aVar7);
                com.waze.app_nav.hub.c cVar16 = new com.waze.app_nav.hub.c(13);
                org.a.d.e.a aVar8 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.beacons.g.class), null, cVar16, cVar14, h.a.i.h()));
                aVar5.f(aVar8);
                new org.a.d.c.d(aVar5, aVar8);
                com.waze.app_nav.hub.c cVar17 = new com.waze.app_nav.hub.c(14);
                org.a.d.e.e eVar8 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(BeaconsNativeManager.class), null, cVar17, org.a.d.c.c.f56382a, h.a.i.h()));
                aVar5.f(eVar8);
                com.waze.web.r.q(new org.a.d.c.d(aVar5, eVar8), new h.g.b.m(com.waze.beacons.l.class));
                return h.ab.f48028a;
            case 11:
                org.a.d.g.a aVar9 = (org.a.d.g.a) obj;
                int i12 = com.waze.l.a.f25079a;
                h.g.b.x.f(aVar9, "$this$module");
                com.waze.app_nav.hub.c cVar18 = new com.waze.app_nav.hub.c(15);
                org.a.d.i.b bVar4 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar19 = org.a.d.c.c.f56382a;
                List listH4 = h.a.i.h();
                int i13 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar9 = new org.a.d.e.e(new org.a.d.c.a(bVar4, new h.g.b.m(com.waze.l.u.class), null, cVar18, cVar19, listH4));
                aVar9.f(eVar9);
                new org.a.d.c.d(aVar9, eVar9);
                return h.ab.f48028a;
            case 12:
                ((Boolean) obj).booleanValue();
                return h.ab.f48028a;
            case 13:
                ((Boolean) obj).booleanValue();
                int i14 = com.waze.l.s.f25119a;
                return h.ab.f48028a;
            case 14:
                ((Boolean) obj).booleanValue();
                int i15 = com.waze.l.s.f25119a;
                return h.ab.f48028a;
            case 15:
                ((Boolean) obj).booleanValue();
                int i16 = com.waze.l.s.f25119a;
                return h.ab.f48028a;
            case 16:
                org.a.d.g.a aVar10 = (org.a.d.g.a) obj;
                h.g.b.x.f(aVar10, "$this$module");
                com.waze.app_nav.hub.c.i iVar = new com.waze.app_nav.hub.c.i(2);
                org.a.d.i.b bVar5 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar20 = org.a.d.c.c.f56382a;
                List listH5 = h.a.i.h();
                int i17 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar10 = new org.a.d.e.e(new org.a.d.c.a(bVar5, new h.g.b.m(CalendarNativeManager.class), null, iVar, cVar20, listH5));
                aVar10.f(eVar10);
                new org.a.d.c.d(aVar10, eVar10);
                return h.ab.f48028a;
            case 17:
                com.waze.car_lib.i.b.r rVar = (com.waze.car_lib.i.b.r) obj;
                h.g.b.x.f(rVar, "it");
                rVar.a();
                return h.ab.f48028a;
            case 18:
                return h.ab.f48028a;
            case 19:
                com.waze.an.a.r rVar2 = (com.waze.an.a.r) obj;
                if (rVar2 != null) {
                    return rVar2.m();
                }
                return null;
            default:
                ((com.waze.car_lib.f.hk) obj).f().h(null);
                return h.ab.f48028a;
        }
    }
}
