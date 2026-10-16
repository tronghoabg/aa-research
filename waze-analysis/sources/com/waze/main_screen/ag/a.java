package com.waze.main_screen.ag;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.webkit.UserAgentMetadata;
import com.waze.ResumePendingIntentBuilder;
import com.waze.av.b.aa;
import com.waze.av.b.ad;
import com.waze.av.b.ah;
import com.waze.av.b.h;
import com.waze.ch.a.a.f;
import com.waze.location.bh;
import com.waze.main_screen.k.a.p;
import com.waze.map.ae;
import com.waze.map.af;
import com.waze.map.b.ai;
import com.waze.map.b.bk;
import com.waze.map.b.cj;
import com.waze.map.b.ed;
import com.waze.map.b.ee;
import com.waze.map.canvas.AndroidPlatformCanvasNativeManager;
import com.waze.map.cl;
import com.waze.map.w;
import com.waze.maplabelsposition.MapLabelsPositionsNativeManager;
import com.waze.parking.ParkingUpdateLocationActivity;
import com.waze.parking.y;
import com.waze.places.PlaceFormatterNativeManager;
import com.waze.places.PlacesNativeManager;
import com.waze.places.g;
import com.waze.reports.ak;
import com.waze.reports.n;
import com.waze.web.r;
import com.waze.z;
import e.a.dx;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import org.a.d.c.c;
import org.a.d.c.d;
import org.a.d.e.e;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f25806a;

    public /* synthetic */ a(int i2) {
        this.f25806a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.g.a.l
    public final Object invoke(Object obj) throws IOException {
        int i2 = 15;
        int i3 = 9;
        int i4 = 8;
        int i5 = 19;
        int i6 = 7;
        int i7 = 6;
        int i8 = 17;
        int i9 = 14;
        int i10 = 13;
        int i11 = 18;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i12 = 16;
        int i13 = 1;
        switch (this.f25806a) {
            case 0:
                org.a.d.g.a aVar = (org.a.d.g.a) obj;
                int i14 = b.f25820a;
                x.f(aVar, "$this$module");
                p pVar = new p(i5);
                org.a.d.i.b bVar = org.a.d.j.a.f56411b;
                c cVar = c.f56382a;
                List listH = i.h();
                int i15 = ar.f48106a;
                e eVar = new e(new org.a.d.c.a(bVar, new m(com.waze.main_screen.ag.a.c.class), null, pVar, cVar, listH));
                aVar.f(eVar);
                new d(aVar, eVar);
                e eVar2 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.main_screen.ag.a.d.class), null, new p(20), cVar, i.h()));
                aVar.f(eVar2);
                new d(aVar, eVar2);
                return ab.f48028a;
            case 1:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 2:
                org.a.d.g.a aVar2 = (org.a.d.g.a) obj;
                x.f(aVar2, "$this$module");
                w wVar = new w(i13);
                org.a.d.i.b bVar2 = org.a.d.j.a.f56411b;
                c cVar2 = c.f56383b;
                List listH2 = i.h();
                int i16 = ar.f48106a;
                org.a.d.e.a aVar3 = new org.a.d.e.a(new org.a.d.c.a(bVar2, new m(com.waze.map.a.e.class), null, wVar, cVar2, listH2));
                aVar2.f(aVar3);
                new d(aVar2, aVar3);
                org.a.d.i.c cVar3 = new org.a.d.i.c(new m(n.class));
                dx dxVar = new dx(cVar3, aVar2);
                w wVar2 = new w(objArr == true ? 1 : 0);
                org.a.d.g.a aVarJ = dxVar.j();
                org.a.d.e.a aVar4 = new org.a.d.e.a(new org.a.d.c.a(dxVar.k(), new m(ak.class), null, wVar2, cVar2, i.h()));
                aVarJ.f(aVar4);
                new d(aVarJ, aVar4);
                aVar2.c().add(cVar3);
                org.a.d.e.a aVar5 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(y.class), null, new w(2), cVar2, i.h()));
                aVar2.f(aVar5);
                new d(aVar2, aVar5);
                org.a.d.i.c cVar4 = new org.a.d.i.c(new m(ParkingUpdateLocationActivity.class));
                dx dxVar2 = new dx(cVar4, aVar2);
                org.a.d.e.c cVar5 = new org.a.d.e.c(new org.a.d.c.a(dxVar2.k(), new m(com.waze.shared_infra.i.e.class), null, new w(3), c.f56384c, i.h()));
                dxVar2.j().f(cVar5);
                new d(dxVar2.j(), cVar5);
                aVar2.c().add(cVar4);
                return ab.f48028a;
            case 3:
                org.a.d.g.a aVar6 = (org.a.d.g.a) obj;
                int i17 = af.f27928a;
                x.f(aVar6, "$this$module");
                w wVar3 = new w(i11);
                org.a.d.i.b bVar3 = org.a.d.j.a.f56411b;
                c cVar6 = c.f56383b;
                List listH3 = i.h();
                int i18 = ar.f48106a;
                org.a.d.e.a aVar7 = new org.a.d.e.a(new org.a.d.c.a(bVar3, new m(com.waze.ui.p.l.class), null, wVar3, cVar6, listH3));
                aVar6.f(aVar7);
                new d(aVar6, aVar7);
                return ab.f48028a;
            case 4:
                org.a.d.g.a aVar8 = (org.a.d.g.a) obj;
                int i19 = af.f27928a;
                x.f(aVar8, "$this$module");
                org.a.d.i.b bVarF = f.f("com.waze.map.MapDi.canvasesDiModule.JNI_THREAD");
                w wVar4 = new w(10);
                org.a.d.i.b bVar4 = org.a.d.j.a.f56411b;
                c cVar7 = c.f56383b;
                List listH4 = i.h();
                int i20 = ar.f48106a;
                org.a.d.e.a aVar9 = new org.a.d.e.a(new org.a.d.c.a(bVar4, new m(Executor.class), bVarF, wVar4, cVar7, listH4));
                aVar8.f(aVar9);
                new d(aVar8, aVar9);
                org.a.d.e.a aVar10 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(Executor.class), f.f("com.waze.map.MapDi.canvasesDiModule.MAIN_THREAD"), new w(11), cVar7, i.h()));
                aVar8.f(aVar10);
                new d(aVar8, aVar10);
                w wVar5 = new w(12);
                org.a.d.i.b bVar5 = org.a.d.j.a.f56411b;
                c cVar8 = c.f56382a;
                e eVar3 = new e(new org.a.d.c.a(bVar5, new m(AndroidPlatformCanvasNativeManager.class), null, wVar5, cVar8, i.h()));
                aVar8.f(eVar3);
                r.q(new d(aVar8, eVar3), new m(com.waze.map.canvas.d.class));
                org.a.d.e.a aVar11 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.map.canvas.e.class), null, new w(i10), cVar7, i.h()));
                aVar8.f(aVar11);
                new d(aVar8, aVar11);
                org.a.d.e.a aVar12 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.map.canvas.r.class), null, new w(i9), cVar7, i.h()));
                aVar8.f(aVar12);
                new d(aVar8, aVar12);
                e eVar4 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(ed.class), f.f(UserAgentMetadata.FORM_FACTOR_MOBILE), new w(i12), cVar8, i.h()));
                aVar8.f(eVar4);
                new d(aVar8, eVar4);
                e eVar5 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(ed.class), f.f("InCar"), new w(i8), cVar8, i.h()));
                aVar8.f(eVar5);
                new d(aVar8, eVar5);
                return ab.f48028a;
            case 5:
                org.a.d.g.a aVar13 = (org.a.d.g.a) obj;
                int i21 = com.waze.map.b.ak.f28002a;
                x.f(aVar13, "$this$module");
                ae aeVar = new ae(i7);
                org.a.d.i.b bVar6 = org.a.d.j.a.f56411b;
                c cVar9 = c.f56382a;
                List listH5 = i.h();
                int i22 = ar.f48106a;
                e eVar6 = new e(new org.a.d.c.a(bVar6, new m(ai.class), null, aeVar, cVar9, listH5));
                aVar13.f(eVar6);
                new d(aVar13, eVar6);
                e eVar7 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.map.b.n.class), null, new ae(i6), cVar9, i.h()));
                aVar13.f(eVar7);
                new d(aVar13, eVar7);
                e eVar8 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(bk.class), null, new ae(i4), cVar9, i.h()));
                aVar13.f(eVar8);
                new d(aVar13, eVar8);
                org.a.d.e.a aVar14 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.map.b.c.class), null, new ae(i3), c.f56383b, i.h()));
                aVar13.f(aVar14);
                new d(aVar13, aVar14);
                return ab.f48028a;
            case 6:
                org.a.d.g.a aVar15 = (org.a.d.g.a) obj;
                int i23 = ee.f28240a;
                x.f(aVar15, "$this$module");
                ae aeVar2 = new ae(10);
                org.a.d.i.b bVar7 = org.a.d.j.a.f56411b;
                c cVar10 = c.f56383b;
                List listH6 = i.h();
                int i24 = ar.f48106a;
                org.a.d.e.a aVar16 = new org.a.d.e.a(new org.a.d.c.a(bVar7, new m(cj.class), null, aeVar2, cVar10, listH6));
                aVar15.f(aVar16);
                new d(aVar15, aVar16);
                org.a.d.i.b bVarF2 = f.f("com.waze.map.genericcanvas.mapViewControllerDiModule.PRIVATE_LOGGER");
                ae aeVar3 = new ae(11);
                org.a.d.i.b bVar8 = org.a.d.j.a.f56411b;
                c cVar11 = c.f56382a;
                e eVar9 = new e(new org.a.d.c.a(bVar8, new m(com.waze.shared_infra.i.e.class), bVarF2, aeVar3, cVar11, i.h()));
                aVar15.f(eVar9);
                new d(aVar15, eVar9);
                org.a.d.e.a aVar17 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.map.canvas.a.a.class), null, new ae(12), cVar10, i.h()));
                aVar15.f(aVar17);
                new d(aVar15, aVar17);
                org.a.d.e.a aVar18 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.map.canvas.a.f.class), null, new ae(i10), cVar10, i.h()));
                aVar15.f(aVar18);
                new d(aVar15, aVar18);
                org.a.d.e.a aVar19 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.map.cj.class), null, new ae(i9), cVar10, i.h()));
                aVar15.f(aVar19);
                new d(aVar15, aVar19);
                e eVar10 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.shared_infra.p.a.class), f.f("com.waze.map.controller.mapViewControllerDiModule.MAP_HELPER_THREAD"), new ae(i2), cVar11, i.h()));
                aVar15.f(eVar10);
                new d(aVar15, eVar10);
                e eVar11 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(cl.class), null, new ae(i12), cVar11, i.h()));
                aVar15.f(eVar11);
                new d(aVar15, eVar11);
                return ab.f48028a;
            case 7:
                x.f((com.waze.map.b.r) obj, "it");
                return ab.f48028a;
            case 8:
                org.a.d.g.a aVar20 = (org.a.d.g.a) obj;
                int i25 = com.waze.maplabelsposition.a.f29607a;
                x.f(aVar20, "$this$module");
                com.waze.map.opengl.n nVar = new com.waze.map.opengl.n(3);
                org.a.d.i.b bVar9 = org.a.d.j.a.f56411b;
                c cVar12 = c.f56382a;
                List listH7 = i.h();
                int i26 = ar.f48106a;
                e eVar12 = new e(new org.a.d.c.a(bVar9, new m(MapLabelsPositionsNativeManager.class), null, nVar, cVar12, listH7));
                aVar20.f(eVar12);
                new d(aVar20, eVar12);
                e eVar13 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.shared_infra.p.a.class), null, new com.waze.map.opengl.n(4), cVar12, i.h()));
                aVar20.f(eVar13);
                new d(aVar20, eVar13);
                e eVar14 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.maplabelsposition.b.class), null, new com.waze.map.opengl.n(5), cVar12, i.h()));
                aVar20.f(eVar14);
                new d(aVar20, eVar14);
                return ab.f48028a;
            case 9:
                org.a.d.g.a aVar21 = (org.a.d.g.a) obj;
                int i27 = com.waze.mobile.b.f29793a;
                x.f(aVar21, "$this$module");
                com.waze.map.opengl.n nVar2 = new com.waze.map.opengl.n(i7);
                org.a.d.i.b bVar10 = org.a.d.j.a.f56411b;
                c cVar13 = c.f56382a;
                List listH8 = i.h();
                int i28 = ar.f48106a;
                e eVar15 = new e(new org.a.d.c.a(bVar10, new m(z.class), null, nVar2, cVar13, listH8));
                aVar21.f(eVar15);
                new d(aVar21, eVar15);
                e eVar16 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.car_lib.a.class), null, new com.waze.map.opengl.n(i6), cVar13, i.h()));
                aVar21.f(eVar16);
                new d(aVar21, eVar16);
                org.a.d.e.a aVar22 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(ResumePendingIntentBuilder.class), null, new com.waze.map.opengl.n(i4), c.f56383b, i.h()));
                aVar21.f(aVar22);
                new d(aVar21, aVar22);
                e eVar17 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(bh.class), null, new com.waze.map.opengl.n(i3), cVar13, i.h()));
                aVar21.f(eVar17);
                new d(aVar21, eVar17);
                e eVar18 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.car_lib.h.b.class), null, new com.waze.map.opengl.n(10), cVar13, i.h()));
                aVar21.f(eVar18);
                new d(aVar21, eVar18);
                e eVar19 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.car_lib.h.a.class), null, new com.waze.map.opengl.n(11), cVar13, i.h()));
                aVar21.f(eVar19);
                new d(aVar21, eVar19);
                e eVar20 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.car_lib.i.a.p.class), f.f("PrimaryCanvasScaleFactorGetter"), new com.waze.map.opengl.n(12), cVar13, i.h()));
                aVar21.f(eVar20);
                new d(aVar21, eVar20);
                return ab.f48028a;
            case 10:
                return ab.f48028a;
            case 11:
                return ab.f48028a;
            case 12:
                return ab.f48028a;
            case 13:
                com.waze.av.b.y yVar = (com.waze.av.b.y) obj;
                x.f(yVar, "it");
                return com.waze.shared_infra.q.b.c(yVar.a());
            case 14:
                org.a.d.g.a aVar23 = (org.a.d.g.a) obj;
                int i29 = ad.f15850a;
                x.f(aVar23, "$this$module");
                com.waze.map.opengl.n nVar3 = new com.waze.map.opengl.n(i10);
                org.a.d.i.b bVar11 = org.a.d.j.a.f56411b;
                c cVar14 = c.f56382a;
                List listH9 = i.h();
                int i30 = ar.f48106a;
                e eVar21 = new e(new org.a.d.c.a(bVar11, new m(PlacesNativeManager.class), null, nVar3, cVar14, listH9));
                aVar23.f(eVar21);
                new d(aVar23, eVar21);
                e eVar22 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(PlaceFormatterNativeManager.class), null, new com.waze.map.opengl.n(i9), cVar14, i.h()));
                aVar23.f(eVar22);
                new d(aVar23, eVar22);
                org.a.d.e.a aVar24 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.af.e.class), null, new com.waze.map.opengl.n(i2), c.f56383b, i.h()));
                aVar23.f(aVar24);
                new d(aVar23, aVar24);
                e eVar23 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(g.class), null, new com.waze.map.opengl.n(i12), cVar14, i.h()));
                aVar23.f(eVar23);
                new d(aVar23, eVar23);
                e eVar24 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.w.r.class), null, new com.waze.map.opengl.n(i8), cVar14, i.h()));
                aVar23.f(eVar24);
                new d(aVar23, eVar24);
                e eVar25 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.w.n.class), null, new com.waze.map.opengl.n(i11), cVar14, i.h()));
                aVar23.f(eVar25);
                new d(aVar23, eVar25);
                e eVar26 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.w.l.class), null, new com.waze.map.opengl.n(i5), cVar14, i.h()));
                aVar23.f(eVar26);
                new d(aVar23, eVar26);
                e eVar27 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(ah.class), null, new com.waze.av.b.ab(i13), cVar14, i.h()));
                aVar23.f(eVar27);
                new d(aVar23, eVar27);
                e eVar28 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.av.a.b.class), null, new com.waze.av.b.ab(objArr2 == true ? 1 : 0), cVar14, i.h()));
                aVar23.f(eVar28);
                new d(aVar23, eVar28);
                return ab.f48028a;
            case 15:
                aa aaVar = (aa) obj;
                x.f(aaVar, "it");
                List<com.waze.av.b.c> listB = aaVar.b();
                if ((listB instanceof Collection) && listB.isEmpty()) {
                    z = true;
                } else {
                    for (com.waze.av.b.c cVar15 : listB) {
                        if (x.n(cVar15.c(), cVar15.c())) {
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                h hVar = (h) obj;
                x.f(hVar, "it");
                if (hVar instanceof com.waze.av.b.e) {
                    return "HOME";
                }
                if (hVar instanceof com.waze.av.b.g) {
                    return "WORK";
                }
                if (hVar instanceof com.waze.av.b.f) {
                    return ((com.waze.av.b.f) hVar).d();
                }
                throw new h.i();
            case 17:
                com.waze.av.b.y yVar2 = (com.waze.av.b.y) obj;
                x.f(yVar2, "it");
                return "rid/" + yVar2.b() + "}-" + yVar2.a();
            case 18:
                h hVar2 = (h) obj;
                x.f(hVar2, "it");
                return "fid/" + hVar2.a() + "-{" + hVar2.b() + "}";
            case 19:
                aa aaVar2 = (aa) obj;
                x.f(aaVar2, "place");
                String strAM = i.aM(aaVar2.c(), null, null, null, 0, new a(i12), 31);
                if (strAM.length() == 0 && (strAM = com.waze.nightmode.e.l(aaVar2.a(), com.waze.shared_infra.o.b.a())) == null) {
                    strAM = "??";
                }
                String str = strAM;
                String strAM2 = i.aM(aaVar2.d(), null, null, null, 0, new a(i8), 31);
                String strAM3 = i.aM(aaVar2.c(), null, null, null, 0, new a(i11), 31);
                com.waze.av.b.c cVar16 = (com.waze.av.b.c) i.R(aaVar2.b());
                return "[WazePlace " + str + DomExceptionUtils.SEPARATOR + aaVar2.a().e() + ", " + strAM3 + " " + strAM2 + " " + (cVar16 != null ? "eid/" + cVar16.a() + "-" + cVar16.c() + "-" + cVar16.d() : "") + "]";
            default:
                org.a.d.g.a aVar25 = (org.a.d.g.a) obj;
                int i31 = com.waze.modules.a.c.f29797a;
                x.f(aVar25, "$this$module");
                com.waze.map.opengl.n nVar4 = new com.waze.map.opengl.n(20);
                org.a.d.i.b bVar12 = org.a.d.j.a.f56411b;
                c cVar17 = c.f56382a;
                List listH10 = i.h();
                int i32 = ar.f48106a;
                e eVar29 = new e(new org.a.d.c.a(bVar12, new m(com.waze.be.b.class), null, nVar4, cVar17, listH10));
                aVar25.f(eVar29);
                new d(aVar25, eVar29);
                com.waze.av.b.ab abVar = new com.waze.av.b.ab(2);
                org.a.d.i.b bVar13 = org.a.d.j.a.f56411b;
                c cVar18 = c.f56383b;
                org.a.d.e.a aVar26 = new org.a.d.e.a(new org.a.d.c.a(bVar13, new m(com.waze.i.c.class), null, abVar, cVar18, i.h()));
                aVar25.f(aVar26);
                new d(aVar25, aVar26);
                org.a.d.e.a aVar27 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.authentication.l.class), null, new com.waze.av.b.ab(3), cVar18, i.h()));
                aVar25.f(aVar27);
                new d(aVar25, aVar27);
                org.a.d.e.a aVar28 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.uid.i.class), null, new com.waze.av.b.ab(4), cVar18, i.h()));
                aVar25.f(aVar28);
                new d(aVar25, aVar28);
                e eVar30 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.authentication.i.class), new org.a.d.i.c(new m(com.waze.authentication.a.class)), new com.waze.av.b.ab(5), cVar17, i.h()));
                aVar25.f(eVar30);
                new d(aVar25, eVar30);
                e eVar31 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.network.d.h.class), null, new com.waze.av.b.ab(i7), cVar17, i.h()));
                aVar25.f(eVar31);
                new d(aVar25, eVar31);
                e eVar32 = new e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.authentication.ai.class), null, new com.waze.av.b.ab(i6), cVar17, i.h()));
                aVar25.f(eVar32);
                new d(aVar25, eVar32);
                return ab.f48028a;
        }
    }
}
