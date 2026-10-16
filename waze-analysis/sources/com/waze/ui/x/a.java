package com.waze.ui.x;

import androidx.activity.result.ActivityResult;
import com.waze.a.af;
import com.waze.bn;
import com.waze.car_lib.bl;
import com.waze.car_lib.f.dj;
import com.waze.car_lib.f.ed;
import com.waze.car_lib.f.fg;
import com.waze.car_lib.f.v;
import e.a.dx;
import h.ab;
import h.g.b.ar;
import h.g.b.x;
import i.b.l.cd;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f43806a;

    public /* synthetic */ a(int i2) {
        this.f43806a = i2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        boolean z = false;
        z = false;
        int i2 = 1;
        switch (this.f43806a) {
            case 0:
                int i3 = d.f43811a;
                x.f((n) obj, "it");
                break;
            case 1:
                Integer num = (Integer) obj;
                num.intValue();
                break;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                break;
            case 3:
                int iIntValue2 = ((Integer) obj).intValue();
                break;
            case 4:
                x.f((ActivityResult) obj, "it");
                break;
            case 5:
                int i4 = com.waze.ui.af.b.f41869a;
                x.f((com.waze.ui.af.p) obj, "it");
                break;
            case 6:
                int i5 = com.waze.ui.af.b.f41869a;
                x.f((com.waze.ui.af.p) obj, "it");
                break;
            case 7:
                int i6 = com.waze.ui.af.b.f41869a;
                x.f((com.waze.ui.af.p) obj, "it");
                break;
            case 8:
                cd cdVar = (cd) obj;
                x.f(cdVar, "it");
                break;
            case 9:
                org.a.d.g.a aVar = (org.a.d.g.a) obj;
                int i7 = com.waze.uid.m.f44536a;
                x.f(aVar, "$this$module");
                com.waze.ui.j.a aVar2 = new com.waze.ui.j.a(5);
                org.a.d.i.b bVar = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar = org.a.d.c.c.f56382a;
                List listH = h.a.i.h();
                int i8 = ar.f48106a;
                org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(bVar, new h.g.b.m(com.waze.uid.d.c.class), null, aVar2, cVar, listH));
                aVar.f(eVar);
                new org.a.d.c.d(aVar, eVar);
                org.a.d.e.e eVar2 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.uid.d.j.class), null, new com.waze.ui.j.a(6), cVar, h.a.i.h()));
                aVar.f(eVar2);
                new org.a.d.c.d(aVar, eVar2);
                org.a.d.e.e eVar3 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.uid.stats.s.class), null, new com.waze.ui.j.a(7), cVar, h.a.i.h()));
                aVar.f(eVar3);
                new org.a.d.c.d(aVar, eVar3);
                org.a.d.e.e eVar4 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.uid.d.q.class), null, new com.waze.ui.j.a(8), cVar, h.a.i.h()));
                aVar.f(eVar4);
                new org.a.d.c.d(aVar, eVar4);
                org.a.d.e.e eVar5 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.sharedui.api.d.class), null, new com.waze.ui.j.a(9), cVar, h.a.i.h()));
                aVar.f(eVar5);
                new org.a.d.c.d(aVar, eVar5);
                break;
            case 10:
                break;
            case 11:
                com.waze.calendar.b bVar2 = (com.waze.calendar.b) obj;
                x.f(bVar2, "it");
                if (bVar2 instanceof com.waze.a.x) {
                    com.waze.uid.stats.s sVarC = com.waze.uid.d.q.f44463a.a().c();
                    com.waze.uid.stats.c cVar2 = com.waze.uid.stats.c.f44728b;
                    com.waze.uid.stats.b bVar3 = com.waze.uid.stats.b.f44723a;
                    com.waze.a.x xVar = (com.waze.a.x) bVar2;
                    com.waze.shared_infra.q.i iVarA = xVar.a();
                    Long lValueOf = iVarA != null ? Long.valueOf(iVarA.b()) : null;
                    com.waze.shared_infra.q.i iVarA2 = xVar.a();
                    if (iVarA2 == null) {
                        int i9 = com.waze.shared_infra.q.i.f37938a;
                        iVarA2 = com.waze.settings.h.c.d();
                    }
                    sVarC.f(bVar3, cVar2, true, lValueOf, Boolean.valueOf(com.waze.trip_overview.views.l.c(com.waze.trip_overview.views.l.b(iVarA2))));
                } else if (bVar2 instanceof com.waze.a.s) {
                    com.waze.uid.d.q.f44463a.a().c().e(com.waze.uid.stats.b.f44723a, com.waze.uid.stats.c.f44728b, af.a((com.waze.a.s) bVar2), true, bVar2 instanceof com.waze.a.r ? Long.valueOf(((com.waze.a.r) bVar2).a().b()) : null);
                } else if (bVar2 instanceof com.waze.a.m) {
                    com.waze.uid.d.q.f44463a.a().c().C(Long.valueOf(((com.waze.a.m) bVar2).a().b()), com.waze.uid.stats.b.f44723a, com.waze.uid.stats.c.f44728b, true);
                } else if (bVar2 instanceof com.waze.a.l) {
                    com.waze.a.l lVar = (com.waze.a.l) bVar2;
                    com.waze.uid.d.q.f44463a.a().c().B(Long.valueOf(lVar.a().b()), af.b(lVar), com.waze.uid.stats.b.f44723a, com.waze.uid.stats.c.f44728b, true);
                }
                break;
            case 12:
                com.waze.calendar.b bVar4 = (com.waze.calendar.b) obj;
                x.f(bVar4, "it");
                if (bVar4 instanceof com.waze.a.x) {
                    com.waze.uid.stats.s sVarC2 = com.waze.uid.d.q.f44463a.a().c();
                    com.waze.uid.stats.c cVar3 = com.waze.uid.stats.c.f44727a;
                    com.waze.uid.stats.b bVar5 = com.waze.uid.stats.b.f44723a;
                    com.waze.a.x xVar2 = (com.waze.a.x) bVar4;
                    com.waze.shared_infra.q.i iVarA3 = xVar2.a();
                    Long lValueOf2 = iVarA3 != null ? Long.valueOf(iVarA3.b()) : null;
                    com.waze.shared_infra.q.i iVarA4 = xVar2.a();
                    if (iVarA4 == null) {
                        int i10 = com.waze.shared_infra.q.i.f37938a;
                        iVarA4 = com.waze.settings.h.c.d();
                    }
                    sVarC2.f(bVar5, cVar3, true, lValueOf2, Boolean.valueOf(com.waze.trip_overview.views.l.c(com.waze.trip_overview.views.l.b(iVarA4))));
                } else if (bVar4 instanceof com.waze.a.s) {
                    com.waze.uid.d.q.f44463a.a().c().e(com.waze.uid.stats.b.f44723a, com.waze.uid.stats.c.f44727a, af.a((com.waze.a.s) bVar4), true, bVar4 instanceof com.waze.a.r ? Long.valueOf(((com.waze.a.r) bVar4).a().b()) : null);
                } else if (bVar4 instanceof com.waze.a.m) {
                    com.waze.uid.d.q.f44463a.a().c().C(Long.valueOf(((com.waze.a.m) bVar4).a().b()), com.waze.uid.stats.b.f44723a, com.waze.uid.stats.c.f44727a, true);
                } else if (bVar4 instanceof com.waze.a.l) {
                    com.waze.a.l lVar2 = (com.waze.a.l) bVar4;
                    com.waze.uid.d.q.f44463a.a().c().B(Long.valueOf(lVar2.a().b()), af.b(lVar2), com.waze.uid.stats.b.f44723a, com.waze.uid.stats.c.f44727a, true);
                }
                break;
            case 13:
                com.waze.shared_infra.q.i iVar = (com.waze.shared_infra.q.i) obj;
                if (iVar != null && com.waze.trip_overview.views.l.c(com.waze.trip_overview.views.l.b(iVar))) {
                    z = true;
                }
                break;
            case 14:
                com.waze.shared_infra.q.i iVar2 = (com.waze.shared_infra.q.i) obj;
                if (iVar2 == null || (r0 = iVar2.e()) == null) {
                    break;
                }
                break;
            case 15:
                com.waze.shared_infra.q.i iVar3 = (com.waze.shared_infra.q.i) obj;
                if (iVar3 != null) {
                    break;
                }
                break;
            case 16:
                org.a.d.g.a aVar3 = (org.a.d.g.a) obj;
                int i11 = com.waze.cf.i.f22243a;
                x.f(aVar3, "$this$module");
                int i12 = ar.f48106a;
                org.a.d.i.c cVar4 = new org.a.d.i.c(new h.g.b.m(bl.class));
                dx dxVar = new dx(cVar4, aVar3);
                com.waze.ui.j.a aVar4 = new com.waze.ui.j.a(12);
                org.a.d.g.a aVarJ = dxVar.j();
                org.a.d.i.a aVarK = dxVar.k();
                org.a.d.c.c cVar5 = org.a.d.c.c.f56383b;
                org.a.d.e.a aVar5 = new org.a.d.e.a(new org.a.d.c.a(aVarK, new h.g.b.m(fg.class), null, aVar4, cVar5, h.a.i.h()));
                aVarJ.f(aVar5);
                new org.a.d.c.d(aVarJ, aVar5);
                com.waze.ui.j.a aVar6 = new com.waze.ui.j.a(13);
                org.a.d.g.a aVarJ2 = dxVar.j();
                org.a.d.e.a aVar7 = new org.a.d.e.a(new org.a.d.c.a(dxVar.k(), new h.g.b.m(com.waze.car_lib.f.x.class), null, aVar6, cVar5, h.a.i.h()));
                aVarJ2.f(aVar7);
                new org.a.d.c.d(aVarJ2, aVar7);
                aVar3.c().add(cVar4);
                org.a.d.i.c cVar6 = new org.a.d.i.c(new h.g.b.m(bl.class));
                dx dxVar2 = new dx(cVar6, aVar3);
                com.waze.ui.j.a aVar8 = new com.waze.ui.j.a(14);
                org.a.d.g.a aVarJ3 = dxVar2.j();
                org.a.d.e.a aVar9 = new org.a.d.e.a(new org.a.d.c.a(dxVar2.k(), new h.g.b.m(com.waze.car_lib.f.t.class), null, aVar8, cVar5, h.a.i.h()));
                aVarJ3.f(aVar9);
                new org.a.d.c.d(aVarJ3, aVar9);
                com.waze.ui.j.a aVar10 = new com.waze.ui.j.a(15);
                org.a.d.g.a aVarJ4 = dxVar2.j();
                org.a.d.e.a aVar11 = new org.a.d.e.a(new org.a.d.c.a(dxVar2.k(), new h.g.b.m(dj.class), null, aVar10, cVar5, h.a.i.h()));
                aVarJ4.f(aVar11);
                new org.a.d.c.d(aVarJ4, aVar11);
                aVar3.c().add(cVar6);
                org.a.d.i.c cVar7 = new org.a.d.i.c(new h.g.b.m(bl.class));
                dx dxVar3 = new dx(cVar7, aVar3);
                com.waze.ui.j.a aVar12 = new com.waze.ui.j.a(16);
                org.a.d.g.a aVarJ5 = dxVar3.j();
                org.a.d.e.a aVar13 = new org.a.d.e.a(new org.a.d.c.a(dxVar3.k(), new h.g.b.m(v.class), null, aVar12, cVar5, h.a.i.h()));
                aVarJ5.f(aVar13);
                new org.a.d.c.d(aVarJ5, aVar13);
                com.waze.ui.j.a aVar14 = new com.waze.ui.j.a(17);
                org.a.d.g.a aVarJ6 = dxVar3.j();
                org.a.d.e.a aVar15 = new org.a.d.e.a(new org.a.d.c.a(dxVar3.k(), new h.g.b.m(ed.class), null, aVar14, cVar5, h.a.i.h()));
                aVarJ6.f(aVar15);
                new org.a.d.c.d(aVarJ6, aVar15);
                aVar3.c().add(cVar7);
                break;
            case 17:
                org.a.d.g.a aVar16 = (org.a.d.g.a) obj;
                int i13 = com.waze.cf.k.f22246a;
                x.f(aVar16, "$this$module");
                com.waze.ui.j.a aVar17 = new com.waze.ui.j.a(18);
                org.a.d.i.b bVar6 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar8 = org.a.d.c.c.f56382a;
                List listH2 = h.a.i.h();
                int i14 = ar.f48106a;
                org.a.d.e.e eVar6 = new org.a.d.e.e(new org.a.d.c.a(bVar6, new h.g.b.m(com.waze.cf.c.l.class), null, aVar17, cVar8, listH2));
                aVar16.f(eVar6);
                new org.a.d.c.d(aVar16, eVar6);
                org.a.d.e.e eVar7 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.cf.d.c.class), null, new com.waze.ui.j.a(19), cVar8, h.a.i.h()));
                aVar16.f(eVar7);
                new org.a.d.c.d(aVar16, eVar7);
                org.a.d.e.e eVar8 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(bn.class), null, new com.waze.ui.j.a(20), cVar8, h.a.i.h()));
                aVar16.f(eVar8);
                new org.a.d.c.d(aVar16, eVar8);
                org.a.d.e.e eVar9 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.location.b.class), null, new com.waze.cf.j(i2), cVar8, h.a.i.h()));
                aVar16.f(eVar9);
                new org.a.d.c.d(aVar16, eVar9);
                org.a.d.e.e eVar10 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.location.q.class), null, new com.waze.cf.j(z ? 1 : 0), cVar8, h.a.i.h()));
                aVar16.f(eVar10);
                new org.a.d.c.d(aVar16, eVar10);
                org.a.d.e.e eVar11 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.car_lib.login.a.class), null, new com.waze.cf.j(2), cVar8, h.a.i.h()));
                aVar16.f(eVar11);
                new org.a.d.c.d(aVar16, eVar11);
                break;
            case 18:
                break;
            case 19:
                com.waze.web.d dVar = com.waze.web.d.f45485a;
                x.f((org.a.d.g.a) obj, "$this$module");
                break;
            default:
                break;
        }
        return ab.f48028a;
    }
}
