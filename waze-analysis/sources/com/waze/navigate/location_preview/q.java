package com.waze.navigate.location_preview;

import com.waze.ConfigManager;
import com.waze.NativeManager;
import com.waze.places.PlacesNativeManager;
import com.waze.planned_drive.PlannedDriveActivity;
import com.waze.planned_drive.PlannedDriveFragment;
import com.waze.planned_drive.PlannedDriveNativeManager;
import com.waze.planned_drive.ch;
import e.a.dx;
import i.b.l.cd;
import java.net.InetAddress;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class q implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f31750a;

    public /* synthetic */ q(int i2) {
        this.f31750a = i2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = 19;
        int i3 = 18;
        int i4 = 17;
        int i5 = 0;
        int i6 = 16;
        int i7 = 15;
        int i8 = 14;
        int i9 = 13;
        int i10 = 1;
        switch (this.f31750a) {
            case 0:
                break;
            case 1:
                ba baVar = (ba) obj;
                h.g.b.x.f(baVar, "it");
                break;
            case 2:
                InetAddress inetAddress = (InetAddress) obj;
                int i11 = com.waze.network.b.c.f32035d;
                h.g.b.x.f(inetAddress, "it");
                String hostAddress = inetAddress.getHostAddress();
                if (hostAddress == null) {
                    hostAddress = null;
                }
                if (hostAddress == null) {
                    hostAddress = "";
                }
                break;
            case 3:
                com.waze.network.b.ay ayVar = (com.waze.network.b.ay) obj;
                h.g.b.x.f(ayVar, "it");
                break;
            case 4:
                okhttp3.al alVar = (okhttp3.al) obj;
                h.g.b.x.f(alVar, "it");
                break;
            case 5:
                org.a.d.g.a aVar = (org.a.d.g.a) obj;
                h.g.b.x.f(aVar, "$this$module");
                org.a.d.i.a aVarE = com.waze.ch.a.a.f.e(com.waze.network.e.e.f32240a);
                com.waze.network.o oVar = new com.waze.network.o(i9);
                org.a.d.i.b bVar = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar = org.a.d.c.c.f56383b;
                List listH = h.a.i.h();
                int i12 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar2 = new org.a.d.e.a(new org.a.d.c.a(bVar, new h.g.b.m(okhttp3.ac.class), aVarE, oVar, cVar, listH));
                aVar.f(aVar2);
                new org.a.d.c.d(aVar, aVar2);
                org.a.d.e.a aVar3 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(okhttp3.ac.class), com.waze.ch.a.a.f.e(com.waze.network.e.e.f32241b), new com.waze.network.o(i8), cVar, h.a.i.h()));
                aVar.f(aVar3);
                new org.a.d.c.d(aVar, aVar3);
                org.a.d.e.a aVar4 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(okhttp3.ac.class), com.waze.ch.a.a.f.e(com.waze.network.e.e.f32242c), new com.waze.network.o(i7), cVar, h.a.i.h()));
                aVar.f(aVar4);
                new org.a.d.c.d(aVar, aVar4);
                org.a.d.e.a aVar5 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(okhttp3.ac.class), com.waze.ch.a.a.f.e(com.waze.network.e.e.f32243d), new com.waze.network.o(i6), cVar, h.a.i.h()));
                aVar.f(aVar5);
                new org.a.d.c.d(aVar, aVar5);
                com.waze.network.e.f fVar = new com.waze.network.e.f(i5);
                org.a.d.i.b bVar2 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar2 = org.a.d.c.c.f56382a;
                org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(bVar2, new h.g.b.m(com.waze.network.e.d.class), null, fVar, cVar2, h.a.i.h()));
                aVar.f(eVar);
                new org.a.d.c.d(aVar, eVar);
                org.a.d.e.e eVar2 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.network.e.b.class), null, new com.waze.network.o(i4), cVar2, h.a.i.h()));
                aVar.f(eVar2);
                new org.a.d.c.d(aVar, eVar2);
                break;
            case 6:
                org.a.d.g.a aVar6 = (org.a.d.g.a) obj;
                int i13 = com.waze.notifications.g.f32616a;
                h.g.b.x.f(aVar6, "$this$module");
                com.waze.network.o oVar2 = new com.waze.network.o(i3);
                org.a.d.i.b bVar3 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar3 = org.a.d.c.c.f56382a;
                List listH2 = h.a.i.h();
                int i14 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar3 = new org.a.d.e.e(new org.a.d.c.a(bVar3, new h.g.b.m(com.waze.notifications.b.e.class), null, oVar2, cVar3, listH2));
                aVar6.f(eVar3);
                com.waze.web.r.q(new org.a.d.c.d(aVar6, eVar3), new h.g.b.m(com.waze.notifications.b.d.class));
                org.a.d.e.a aVar7 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.notifications.a.a.class), null, new com.waze.network.o(i2), org.a.d.c.c.f56383b, h.a.i.h()));
                aVar6.f(aVar7);
                new org.a.d.c.d(aVar6, aVar7);
                break;
            case 7:
                h.g.b.x.f((Throwable) obj, "it");
                break;
            case 8:
                org.a.d.g.a aVar8 = (org.a.d.g.a) obj;
                h.g.b.x.f(aVar8, "$this$module");
                com.waze.network.e.f fVar2 = new com.waze.network.e.f(4);
                org.a.d.i.b bVar4 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar4 = org.a.d.c.c.f56383b;
                List listH3 = h.a.i.h();
                int i15 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar9 = new org.a.d.e.a(new org.a.d.c.a(bVar4, new h.g.b.m(com.waze.az.b.class), null, fVar2, cVar4, listH3));
                aVar8.f(aVar9);
                new org.a.d.c.d(aVar8, aVar9);
                org.a.d.e.e eVar4 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.by.b.class), null, new com.waze.network.e.f(5), org.a.d.c.c.f56382a, h.a.i.h()));
                aVar8.f(eVar4);
                new org.a.d.c.d(aVar8, eVar4);
                break;
            case 9:
                org.a.d.g.a aVar10 = (org.a.d.g.a) obj;
                com.waze.planned_drive.p pVar = com.waze.planned_drive.p.f33350a;
                h.g.b.x.f(aVar10, "$this$module");
                int i16 = h.g.b.ar.f48106a;
                org.a.d.i.c cVar5 = new org.a.d.i.c(new h.g.b.m(PlannedDriveActivity.class));
                dx dxVar = new dx(cVar5, aVar10);
                com.waze.network.e.f fVar3 = new com.waze.network.e.f(6);
                org.a.d.i.a aVarK = dxVar.k();
                org.a.d.c.c cVar6 = org.a.d.c.c.f56384c;
                org.a.d.e.c cVar7 = new org.a.d.e.c(new org.a.d.c.a(aVarK, new h.g.b.m(com.waze.planned_drive.z.class), null, fVar3, cVar6, h.a.i.h()));
                dxVar.j().f(cVar7);
                new org.a.d.c.d(dxVar.j(), cVar7);
                com.waze.network.e.f fVar4 = new com.waze.network.e.f(7);
                org.a.d.g.a aVarJ = dxVar.j();
                org.a.d.i.a aVarK2 = dxVar.k();
                org.a.d.c.c cVar8 = org.a.d.c.c.f56383b;
                org.a.d.e.a aVar11 = new org.a.d.e.a(new org.a.d.c.a(aVarK2, new h.g.b.m(PlannedDriveFragment.class), null, fVar4, cVar8, h.a.i.h()));
                aVarJ.f(aVar11);
                new org.a.d.c.d(aVarJ, aVar11);
                aVar10.c().add(cVar5);
                org.a.d.i.c cVar9 = new org.a.d.i.c(new h.g.b.m(PlannedDriveFragment.class));
                dx dxVar2 = new dx(cVar9, aVar10);
                org.a.d.e.c cVar10 = new org.a.d.e.c(new org.a.d.c.a(dxVar2.k(), new h.g.b.m(PlannedDriveNativeManager.class), null, new com.waze.network.e.f(8), cVar6, h.a.i.h()));
                dxVar2.j().f(cVar10);
                new org.a.d.c.d(dxVar2.j(), cVar10);
                org.a.d.e.c cVar11 = new org.a.d.e.c(new org.a.d.c.a(dxVar2.k(), new h.g.b.m(PlacesNativeManager.class), null, new com.waze.network.e.f(9), cVar6, h.a.i.h()));
                dxVar2.j().f(cVar11);
                new org.a.d.c.d(dxVar2.j(), cVar11);
                org.a.d.e.c cVar12 = new org.a.d.e.c(new org.a.d.c.a(dxVar2.k(), new h.g.b.m(NativeManager.class), null, new com.waze.network.e.f(10), cVar6, h.a.i.h()));
                dxVar2.j().f(cVar12);
                new org.a.d.c.d(dxVar2.j(), cVar12);
                org.a.d.e.c cVar13 = new org.a.d.e.c(new org.a.d.c.a(dxVar2.k(), new h.g.b.m(ConfigManager.class), null, new com.waze.network.e.f(11), cVar6, h.a.i.h()));
                dxVar2.j().f(cVar13);
                new org.a.d.c.d(dxVar2.j(), cVar13);
                com.waze.network.e.f fVar5 = new com.waze.network.e.f(12);
                org.a.d.g.a aVarJ2 = dxVar2.j();
                org.a.d.e.a aVar12 = new org.a.d.e.a(new org.a.d.c.a(dxVar2.k(), new h.g.b.m(com.waze.planned_drive.histogram.b.class), null, fVar5, cVar8, h.a.i.h()));
                aVarJ2.f(aVar12);
                new org.a.d.c.d(aVarJ2, aVar12);
                com.waze.network.e.f fVar6 = new com.waze.network.e.f(i9);
                org.a.d.g.a aVarJ3 = dxVar2.j();
                org.a.d.e.a aVar13 = new org.a.d.e.a(new org.a.d.c.a(dxVar2.k(), new h.g.b.m(ch.class), null, fVar6, cVar8, h.a.i.h()));
                aVarJ3.f(aVar13);
                new org.a.d.c.d(aVarJ3, aVar13);
                aVar10.c().add(cVar9);
                break;
            case 10:
                com.waze.planned_drive.ad adVar = com.waze.planned_drive.ad.f33183a;
                h.g.b.x.f((org.a.d.g.a) obj, "$this$module");
                break;
            case 11:
                i.b.j.l lVar = (i.b.j.l) obj;
                h.g.b.x.f(lVar, "$this$send");
                lVar.c(i.b.j.s.newBuilder());
                break;
            case 12:
                i.b.j.l lVar2 = (i.b.j.l) obj;
                h.g.b.x.f(lVar2, "$this$send");
                lVar2.b(i.b.j.q.newBuilder());
                break;
            case 13:
                org.a.d.g.a aVar14 = (org.a.d.g.a) obj;
                int i17 = com.waze.bh.a.f16750a;
                h.g.b.x.f(aVar14, "$this$module");
                com.waze.network.e.f fVar7 = new com.waze.network.e.f(i8);
                org.a.d.i.b bVar5 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar14 = org.a.d.c.c.f56383b;
                List listH4 = h.a.i.h();
                int i18 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar15 = new org.a.d.e.a(new org.a.d.c.a(bVar5, new h.g.b.m(com.waze.bh.b.c.class), null, fVar7, cVar14, listH4));
                aVar14.f(aVar15);
                new org.a.d.c.d(aVar14, aVar15);
                org.a.d.i.c cVar15 = new org.a.d.i.c(new h.g.b.m(com.waze.bh.c.e.class));
                dx dxVar3 = new dx(cVar15, aVar14);
                com.waze.network.e.f fVar8 = new com.waze.network.e.f(i7);
                org.a.d.g.a aVarJ4 = dxVar3.j();
                org.a.d.e.a aVar16 = new org.a.d.e.a(new org.a.d.c.a(dxVar3.k(), new h.g.b.m(com.waze.bh.c.h.class), null, fVar8, cVar14, h.a.i.h()));
                aVarJ4.f(aVar16);
                new org.a.d.c.d(aVarJ4, aVar16);
                aVar14.c().add(cVar15);
                org.a.d.e.a aVar17 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.bh.a.a.class), null, new com.waze.network.e.f(i6), cVar14, h.a.i.h()));
                aVar14.f(aVar17);
                new org.a.d.c.d(aVar14, aVar17);
                break;
            case 14:
                cd cdVar = (cd) obj;
                int i19 = com.waze.bh.b.h.f16769a;
                h.g.b.x.f(cdVar, "it");
                break;
            case 15:
                cd cdVar2 = (cd) obj;
                int i20 = com.waze.bh.b.h.f16769a;
                h.g.b.x.f(cdVar2, "it");
                break;
            case 16:
                cd cdVar3 = (cd) obj;
                int i21 = com.waze.bh.b.h.f16769a;
                h.g.b.x.f(cdVar3, "it");
                break;
            case 17:
                cd cdVar4 = (cd) obj;
                int i22 = com.waze.bh.b.h.f16769a;
                h.g.b.x.f(cdVar4, "it");
                break;
            case 18:
                cd cdVar5 = (cd) obj;
                int i23 = com.waze.bh.b.h.f16769a;
                h.g.b.x.f(cdVar5, "it");
                break;
            case 19:
                org.a.d.g.a aVar18 = (org.a.d.g.a) obj;
                int i24 = com.waze.bi.e.f16810a;
                h.g.b.x.f(aVar18, "$this$module");
                org.a.d.i.a aVarE2 = com.waze.ch.a.a.f.e(com.waze.bi.k.f16817a);
                com.waze.bi.c cVar16 = new com.waze.bi.c(i10);
                org.a.d.i.b bVar6 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar17 = org.a.d.c.c.f56382a;
                List listH5 = h.a.i.h();
                int i25 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar5 = new org.a.d.e.e(new org.a.d.c.a(bVar6, new h.g.b.m(com.waze.bi.j.class), aVarE2, cVar16, cVar17, listH5));
                aVar18.f(eVar5);
                new org.a.d.c.d(aVar18, eVar5);
                org.a.d.e.e eVar6 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.bi.j.class), com.waze.ch.a.a.f.e(com.waze.bi.k.f16818b), new com.waze.network.e.f(i4), cVar17, h.a.i.h()));
                aVar18.f(eVar6);
                new org.a.d.c.d(aVar18, eVar6);
                org.a.d.e.e eVar7 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.bi.g.class), null, new com.waze.bi.c(i5), cVar17, h.a.i.h()));
                aVar18.f(eVar7);
                new org.a.d.c.d(aVar18, eVar7);
                org.a.d.e.a aVar19 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.main_screen.e.a.class), null, new com.waze.network.e.f(i3), org.a.d.c.c.f56383b, h.a.i.h()));
                aVar18.f(aVar19);
                new org.a.d.c.d(aVar18, aVar19);
                break;
            default:
                org.a.d.g.a aVar20 = (org.a.d.g.a) obj;
                int i26 = com.waze.bj.a.f16826a;
                h.g.b.x.f(aVar20, "$this$module");
                com.waze.network.e.f fVar9 = new com.waze.network.e.f(i2);
                org.a.d.i.b bVar7 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar18 = org.a.d.c.c.f56383b;
                List listH6 = h.a.i.h();
                int i27 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar21 = new org.a.d.e.a(new org.a.d.c.a(bVar7, new h.g.b.m(com.waze.bj.a.b.class), null, fVar9, cVar18, listH6));
                aVar20.f(aVar21);
                new org.a.d.c.d(aVar20, aVar21);
                break;
        }
        return h.ab.f48028a;
    }
}
