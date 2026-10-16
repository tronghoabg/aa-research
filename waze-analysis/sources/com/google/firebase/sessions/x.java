package com.google.firebase.sessions;

import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavType;
import com.waze.MainActivity;
import com.waze.ads.AdsNativeManager;
import com.waze.co;
import com.waze.dh;
import com.waze.dt;
import com.waze.el;
import com.waze.ez;
import com.waze.ml;
import com.waze.mn;
import com.waze.mp;
import com.waze.mt;
import e.a.dx;
import i.b.l.cd;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f11000a;

    public /* synthetic */ x(int i2) {
        this.f11000a = i2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        int i5 = 15;
        int i6 = 7;
        int i7 = 6;
        int i8 = 0;
        int i9 = 12;
        switch (this.f11000a) {
            case 0:
                CorruptionException corruptionException = (CorruptionException) obj;
                int i10 = ag.f10793a;
                h.g.b.x.f(corruptionException, "ex");
                Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + q.b() + ".", corruptionException);
                break;
            case 1:
                org.a.d.g.a aVar = (org.a.d.g.a) obj;
                int i11 = defpackage.b.f1684a;
                h.g.b.x.f(aVar, "$this$module");
                defpackage.a aVar2 = new defpackage.a(1);
                org.a.d.i.b bVar = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar = org.a.d.c.c.f56382a;
                List listH = h.a.i.h();
                int i12 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(bVar, new h.g.b.m(com.waze.as.d.class), null, aVar2, cVar, listH));
                aVar.f(eVar);
                new org.a.d.c.d(aVar, eVar);
                org.a.d.e.e eVar2 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.as.a.class), null, new defpackage.a(i8), cVar, h.a.i.h()));
                aVar.f(eVar2);
                new org.a.d.c.d(aVar, eVar2);
                break;
            case 2:
                CorruptionException corruptionException2 = (CorruptionException) obj;
                int i13 = com.google.firebase.sessions.b.k.f10898a;
                h.g.b.x.f(corruptionException2, "ex");
                Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + q.b() + ".", corruptionException2);
                break;
            case 3:
                org.a.d.g.a aVar3 = (org.a.d.g.a) obj;
                h.g.b.x.f(aVar3, "$this$module");
                defpackage.a aVar4 = new defpackage.a(2);
                org.a.d.i.b bVar2 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar2 = org.a.d.c.c.f56383b;
                List listH2 = h.a.i.h();
                int i14 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar5 = new org.a.d.e.a(new org.a.d.c.a(bVar2, new h.g.b.m(dh.class), null, aVar4, cVar2, listH2));
                aVar3.f(aVar5);
                new org.a.d.c.d(aVar3, aVar5);
                org.a.d.i.c cVar3 = new org.a.d.i.c(new h.g.b.m(MainActivity.class));
                dx dxVar = new dx(cVar3, aVar3);
                defpackage.a aVar6 = new defpackage.a(3);
                org.a.d.g.a aVarJ = dxVar.j();
                org.a.d.e.a aVar7 = new org.a.d.e.a(new org.a.d.c.a(dxVar.k(), new h.g.b.m(com.waze.map.main.p.class), null, aVar6, cVar2, h.a.i.h()));
                aVarJ.f(aVar7);
                new org.a.d.c.d(aVarJ, aVar7);
                defpackage.a aVar8 = new defpackage.a(4);
                org.a.d.g.a aVarJ2 = dxVar.j();
                org.a.d.e.a aVar9 = new org.a.d.e.a(new org.a.d.c.a(dxVar.k(), new h.g.b.m(ez.class), null, aVar8, cVar2, h.a.i.h()));
                aVarJ2.f(aVar9);
                new org.a.d.c.d(aVarJ2, aVar9);
                defpackage.a aVar10 = new defpackage.a(5);
                org.a.d.g.a aVarJ3 = dxVar.j();
                org.a.d.e.a aVar11 = new org.a.d.e.a(new org.a.d.c.a(dxVar.k(), new h.g.b.m(dt.class), null, aVar10, cVar2, h.a.i.h()));
                aVarJ3.f(aVar11);
                new org.a.d.c.d(aVarJ3, aVar11);
                defpackage.a aVar12 = new defpackage.a(i7);
                org.a.d.g.a aVarJ4 = dxVar.j();
                org.a.d.e.a aVar13 = new org.a.d.e.a(new org.a.d.c.a(dxVar.k(), new h.g.b.m(co.class), null, aVar12, cVar2, h.a.i.h()));
                aVarJ4.f(aVar13);
                new org.a.d.c.d(aVarJ4, aVar13);
                aVar3.c().add(cVar3);
                break;
            case 4:
                NavArgumentBuilder navArgumentBuilder = (NavArgumentBuilder) obj;
                int i15 = el.f23656h;
                h.g.b.x.f(navArgumentBuilder, "$this$navArgument");
                navArgumentBuilder.setType(NavType.BoolType);
                navArgumentBuilder.setNullable(false);
                break;
            case 5:
                break;
            case 6:
                com.waze.ar arVar = (com.waze.ar) obj;
                com.waze.at atVar = arVar instanceof com.waze.at ? (com.waze.at) arVar : null;
                if (atVar != null) {
                    atVar.g();
                }
                break;
            case 7:
                dx dxVar2 = (dx) obj;
                h.g.b.x.f(dxVar2, "$this$mobileCoordinatorFactory");
                mn mnVar = new mn(4);
                org.a.d.g.a aVarJ5 = dxVar2.j();
                org.a.d.i.a aVarK = dxVar2.k();
                org.a.d.c.c cVar4 = org.a.d.c.c.f56383b;
                List listH3 = h.a.i.h();
                int i16 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar14 = new org.a.d.e.a(new org.a.d.c.a(aVarK, new h.g.b.m(com.waze.app_nav.a.k.class), null, mnVar, cVar4, listH3));
                aVarJ5.f(aVar14);
                new org.a.d.c.d(aVarJ5, aVar14);
                mn mnVar2 = new mn(5);
                org.a.d.g.a aVarJ6 = dxVar2.j();
                org.a.d.e.a aVar15 = new org.a.d.e.a(new org.a.d.c.a(dxVar2.k(), new h.g.b.m(com.waze.app_nav.a.e.class), null, mnVar2, cVar4, h.a.i.h()));
                aVarJ6.f(aVar15);
                new org.a.d.c.d(aVarJ6, aVar15);
                break;
            case 8:
                dx dxVar3 = (dx) obj;
                h.g.b.x.f(dxVar3, "$this$mobileCoordinatorFactory");
                defpackage.a aVar16 = new defpackage.a(i6);
                org.a.d.g.a aVarJ7 = dxVar3.j();
                org.a.d.i.a aVarK2 = dxVar3.k();
                org.a.d.c.c cVar5 = org.a.d.c.c.f56383b;
                List listH4 = h.a.i.h();
                int i17 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar17 = new org.a.d.e.a(new org.a.d.c.a(aVarK2, new h.g.b.m(com.waze.app_nav.a.ag.class), null, aVar16, cVar5, listH4));
                aVarJ7.f(aVar17);
                new org.a.d.c.d(aVarJ7, aVar17);
                ml mlVar = new ml(i9);
                org.a.d.g.a aVarJ8 = dxVar3.j();
                org.a.d.e.a aVar18 = new org.a.d.e.a(new org.a.d.c.a(dxVar3.k(), new h.g.b.m(com.waze.app_nav.a.ae.class), null, mlVar, cVar5, h.a.i.h()));
                aVarJ8.f(aVar18);
                new org.a.d.c.d(aVarJ8, aVar18);
                break;
            case 9:
                dx dxVar4 = (dx) obj;
                h.g.b.x.f(dxVar4, "$this$mobileCoordinatorFactory");
                mn mnVar3 = new mn(i7);
                org.a.d.g.a aVarJ9 = dxVar4.j();
                org.a.d.i.a aVarK3 = dxVar4.k();
                org.a.d.c.c cVar6 = org.a.d.c.c.f56383b;
                List listH5 = h.a.i.h();
                int i18 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar19 = new org.a.d.e.a(new org.a.d.c.a(aVarK3, new h.g.b.m(com.waze.app_nav.a.v.class), null, mnVar3, cVar6, listH5));
                aVarJ9.f(aVar19);
                new org.a.d.c.d(aVarJ9, aVar19);
                mn mnVar4 = new mn(i6);
                org.a.d.g.a aVarJ10 = dxVar4.j();
                org.a.d.e.a aVar20 = new org.a.d.e.a(new org.a.d.c.a(dxVar4.k(), new h.g.b.m(com.waze.app_nav.a.u.class), null, mnVar4, cVar6, h.a.i.h()));
                aVarJ10.f(aVar20);
                new org.a.d.c.d(aVarJ10, aVar20);
                break;
            case 10:
                dx dxVar5 = (dx) obj;
                h.g.b.x.f(dxVar5, "$this$mobileCoordinatorFactory");
                mp mpVar = new mp(4);
                org.a.d.g.a aVarJ11 = dxVar5.j();
                org.a.d.i.a aVarK4 = dxVar5.k();
                org.a.d.c.c cVar7 = org.a.d.c.c.f56383b;
                List listH6 = h.a.i.h();
                int i19 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar21 = new org.a.d.e.a(new org.a.d.c.a(aVarK4, new h.g.b.m(com.waze.app_nav.a.ao.class), null, mpVar, cVar7, listH6));
                aVarJ11.f(aVar21);
                new org.a.d.c.d(aVarJ11, aVar21);
                mp mpVar2 = new mp(i5);
                org.a.d.g.a aVarJ12 = dxVar5.j();
                org.a.d.e.a aVar22 = new org.a.d.e.a(new org.a.d.c.a(dxVar5.k(), new h.g.b.m(com.waze.app_nav.a.an.class), null, mpVar2, cVar7, h.a.i.h()));
                aVarJ12.f(aVar22);
                new org.a.d.c.d(aVarJ12, aVar22);
                break;
            case 11:
                cd cdVar = (cd) obj;
                int i20 = com.waze.a.a.f13571a;
                h.g.b.x.f(cdVar, "it");
                break;
            case 12:
                cd cdVar2 = (cd) obj;
                int i21 = com.waze.a.a.f13571a;
                h.g.b.x.f(cdVar2, "it");
                break;
            case 13:
                org.a.d.g.a aVar23 = (org.a.d.g.a) obj;
                int i22 = com.waze.a.i.f13640a;
                h.g.b.x.f(aVar23, "$this$module");
                mt mtVar = new mt(i7);
                org.a.d.i.b bVar3 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar8 = org.a.d.c.c.f56382a;
                List listH7 = h.a.i.h();
                int i23 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar3 = new org.a.d.e.e(new org.a.d.c.a(bVar3, new h.g.b.m(com.waze.sharedui.profile.b.class), null, mtVar, cVar8, listH7));
                aVar23.f(eVar3);
                new org.a.d.c.d(aVar23, eVar3);
                org.a.d.e.e eVar4 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.b.f.class), null, new mt(i6), cVar8, h.a.i.h()));
                aVar23.f(eVar4);
                new org.a.d.c.d(aVar23, eVar4);
                org.a.d.e.e eVar5 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.b.y.class), null, new mt(8), cVar8, h.a.i.h()));
                aVar23.f(eVar5);
                new org.a.d.c.d(aVar23, eVar5);
                org.a.d.e.e eVar6 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.b.u.class), null, new mt(i4), cVar8, h.a.i.h()));
                aVar23.f(eVar6);
                new org.a.d.c.d(aVar23, eVar6);
                org.a.d.e.e eVar7 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.b.o.class), null, new mt(i3), cVar8, h.a.i.h()));
                aVar23.f(eVar7);
                new org.a.d.c.d(aVar23, eVar7);
                break;
            case 14:
                h.g.b.x.f((com.waze.design_components.c.b) obj, "it");
                break;
            case 15:
                org.a.d.g.a aVar24 = (org.a.d.g.a) obj;
                int i24 = com.waze.ads.a.f13901a;
                h.g.b.x.f(aVar24, "$this$module");
                mt mtVar2 = new mt(i2);
                org.a.d.i.b bVar4 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar9 = org.a.d.c.c.f56383b;
                List listH8 = h.a.i.h();
                int i25 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar25 = new org.a.d.e.a(new org.a.d.c.a(bVar4, new h.g.b.m(com.waze.ads.c.m.class), null, mtVar2, cVar9, listH8));
                aVar24.f(aVar25);
                new org.a.d.c.d(aVar24, aVar25);
                org.a.d.e.a aVar26 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.ads.a.a.class), null, new mt(i9), cVar9, h.a.i.h()));
                aVar24.f(aVar26);
                new org.a.d.c.d(aVar24, aVar26);
                mt mtVar3 = new mt(13);
                org.a.d.i.b bVar5 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar10 = org.a.d.c.c.f56382a;
                org.a.d.e.e eVar8 = new org.a.d.e.e(new org.a.d.c.a(bVar5, new h.g.b.m(com.waze.ads.b.a.class), null, mtVar3, cVar10, h.a.i.h()));
                aVar24.f(eVar8);
                new org.a.d.c.d(aVar24, eVar8);
                org.a.d.e.a aVar27 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.ads.d.i.class), null, new mt(14), cVar9, h.a.i.h()));
                aVar24.f(aVar27);
                new org.a.d.c.d(aVar24, aVar27);
                org.a.d.e.a aVar28 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.ads.d.b.class), null, new mt(i5), cVar9, h.a.i.h()));
                aVar24.f(aVar28);
                new org.a.d.c.d(aVar24, aVar28);
                org.a.d.e.e eVar9 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(AdsNativeManager.class), null, new mt(16), cVar10, h.a.i.h()));
                aVar24.f(eVar9);
                new org.a.d.c.d(aVar24, eVar9);
                org.a.d.e.e eVar10 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.google.android.libraries.f.a.a.a.e.class), null, new mt(17), cVar10, h.a.i.h()));
                aVar24.f(eVar10);
                new org.a.d.c.d(aVar24, eVar10);
                org.a.d.e.e eVar11 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.ads.a.h.class), null, new mt(18), cVar10, h.a.i.h()));
                aVar24.f(eVar11);
                new org.a.d.c.d(aVar24, eVar11);
                break;
            case 16:
                NavArgumentBuilder navArgumentBuilder2 = (NavArgumentBuilder) obj;
                h.g.b.x.f(navArgumentBuilder2, "$this$navArgument");
                navArgumentBuilder2.setType(NavType.StringType);
                navArgumentBuilder2.setNullable(false);
                break;
            case 17:
                break;
            case 18:
                com.waze.calendar.b bVar6 = (com.waze.calendar.b) obj;
                h.g.b.x.f(bVar6, "it");
                if (bVar6 instanceof com.waze.a.x) {
                    com.waze.uid.stats.s sVarC = com.waze.uid.d.q.f44463a.a().c();
                    com.waze.uid.stats.b bVar7 = com.waze.uid.stats.b.f44724b;
                    com.waze.a.x xVar = (com.waze.a.x) bVar6;
                    com.waze.shared_infra.q.i iVarA = xVar.a();
                    Long lValueOf = iVarA != null ? Long.valueOf(iVarA.b()) : null;
                    com.waze.shared_infra.q.i iVarA2 = xVar.a();
                    if (iVarA2 == null) {
                        int i26 = com.waze.shared_infra.q.i.f37938a;
                        iVarA2 = com.waze.settings.h.c.d();
                    }
                    com.waze.ui.w.ai.p(sVarC, bVar7, null, lValueOf, Boolean.valueOf(com.waze.trip_overview.views.l.c(com.waze.trip_overview.views.l.b(iVarA2))), 6);
                } else if (bVar6 instanceof com.waze.a.s) {
                    com.waze.ui.w.ai.o(com.waze.uid.d.q.f44463a.a().c(), com.waze.uid.stats.b.f44724b, null, com.waze.a.af.a((com.waze.a.s) bVar6), bVar6 instanceof com.waze.a.r ? Long.valueOf(((com.waze.a.r) bVar6).a().b()) : null, 10);
                } else if (bVar6 instanceof com.waze.a.m) {
                    com.waze.ui.w.ai.r(com.waze.uid.d.q.f44463a.a().c(), Long.valueOf(((com.waze.a.m) bVar6).a().b()), com.waze.uid.stats.b.f44724b, null, 12);
                } else if (bVar6 instanceof com.waze.a.l) {
                    com.waze.ui.w.ai.q(com.waze.uid.d.q.f44463a.a().c(), com.waze.a.af.b((com.waze.a.l) bVar6), com.waze.uid.stats.b.f44724b, null, 25);
                }
                break;
            case 19:
                org.a.d.g.a aVar29 = (org.a.d.g.a) obj;
                int i27 = com.waze.app_nav.a.f15094a;
                h.g.b.x.f(aVar29, "$this$module");
                int i28 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar12 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.app_nav.hub.c.e.class), new org.a.d.i.c(new h.g.b.m(com.waze.app_nav.c.a.class)), new com.waze.c.c.a(i4), org.a.d.c.c.f56382a, h.a.i.h()));
                aVar29.f(eVar12);
                new org.a.d.c.d(aVar29, eVar12);
                org.a.d.e.a aVar30 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.app_nav.j.class), null, new com.waze.c.c.a(i3), org.a.d.c.c.f56383b, h.a.i.h()));
                aVar29.f(aVar30);
                new org.a.d.c.d(aVar29, aVar30);
                break;
            default:
                org.a.d.g.a aVar31 = (org.a.d.g.a) obj;
                int i29 = com.waze.app_nav.b.f15186a;
                h.g.b.x.f(aVar31, "$this$module");
                com.waze.c.c.a aVar32 = new com.waze.c.c.a(i2);
                org.a.d.i.b bVar8 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar11 = org.a.d.c.c.f56382a;
                List listH9 = h.a.i.h();
                int i30 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar13 = new org.a.d.e.e(new org.a.d.c.a(bVar8, new h.g.b.m(com.waze.app_nav.w.class), null, aVar32, cVar11, listH9));
                aVar31.f(eVar13);
                new org.a.d.c.d(aVar31, eVar13);
                org.a.d.e.e eVar14 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.app_nav.e.class), null, new com.waze.c.c.a(i9), cVar11, h.a.i.h()));
                aVar31.f(eVar14);
                new org.a.d.c.d(aVar31, eVar14);
                break;
        }
        return h.ab.f48028a;
    }
}
