package com.waze.install;

import androidx.activity.result.ActivityResult;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.NavType;
import androidx.navigation.PopUpToBuilder;
import com.waze.main_screen.ax;
import com.waze.main_screen.be;
import e.a.dx;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class c implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f24770a;

    public /* synthetic */ c(int i2) {
        this.f24770a = i2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = 16;
        switch (this.f24770a) {
            case 0:
                break;
            case 1:
                org.a.d.g.a aVar = (org.a.d.g.a) obj;
                h.g.b.x.f(aVar, "$this$module");
                b bVar = new b(12);
                org.a.d.i.b bVar2 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar = org.a.d.c.c.f56383b;
                List listH = h.a.i.h();
                int i3 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar2 = new org.a.d.e.a(new org.a.d.c.a(bVar2, new h.g.b.m(com.waze.location.b.d.class), null, bVar, cVar, listH));
                aVar.f(aVar2);
                new org.a.d.c.d(aVar, aVar2);
                break;
            case 2:
                org.a.d.g.a aVar3 = (org.a.d.g.a) obj;
                int i4 = com.waze.at.a.f15649a;
                h.g.b.x.f(aVar3, "$this$module");
                int i5 = h.g.b.ar.f48106a;
                org.a.d.i.c cVar2 = new org.a.d.i.c(new h.g.b.m(com.waze.at.b.d.class));
                dx dxVar = new dx(cVar2, aVar3);
                b bVar3 = new b(13);
                org.a.d.g.a aVarJ = dxVar.j();
                org.a.d.e.a aVar4 = new org.a.d.e.a(new org.a.d.c.a(dxVar.k(), new h.g.b.m(com.waze.at.b.f.class), null, bVar3, org.a.d.c.c.f56383b, h.a.i.h()));
                aVarJ.f(aVar4);
                new org.a.d.c.d(aVarJ, aVar4);
                aVar3.c().add(cVar2);
                b bVar4 = new b(14);
                org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.at.a.b.class), null, bVar4, org.a.d.c.c.f56382a, h.a.i.h()));
                aVar3.f(eVar);
                new org.a.d.c.d(aVar3, eVar);
                break;
            case 3:
                com.waze.at.c cVar3 = com.waze.at.c.f15670a;
                h.g.b.x.f((org.a.d.g.a) obj, "$this$module");
                break;
            case 4:
                org.a.d.g.a aVar5 = (org.a.d.g.a) obj;
                int i6 = com.waze.main_screen.k.f26497a;
                h.g.b.x.f(aVar5, "$this$module");
                b bVar5 = new b(15);
                org.a.d.i.b bVar6 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar4 = org.a.d.c.c.f56383b;
                List listH2 = h.a.i.h();
                int i7 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar6 = new org.a.d.e.a(new org.a.d.c.a(bVar6, new h.g.b.m(be.class), null, bVar5, cVar4, listH2));
                aVar5.f(aVar6);
                new org.a.d.c.d(aVar5, aVar6);
                break;
            case 5:
                NavArgumentBuilder navArgumentBuilder = (NavArgumentBuilder) obj;
                h.g.b.x.f(navArgumentBuilder, "$this$navArgument");
                navArgumentBuilder.setType(NavType.BoolType);
                navArgumentBuilder.setNullable(false);
                navArgumentBuilder.setDefaultValue(false);
                break;
            case 6:
                NavArgumentBuilder navArgumentBuilder2 = (NavArgumentBuilder) obj;
                h.g.b.x.f(navArgumentBuilder2, "$this$navArgument");
                navArgumentBuilder2.setType(NavType.BoolType);
                navArgumentBuilder2.setNullable(false);
                break;
            case 7:
                NavArgumentBuilder navArgumentBuilder3 = (NavArgumentBuilder) obj;
                h.g.b.x.f(navArgumentBuilder3, "$this$navArgument");
                navArgumentBuilder3.setType(NavType.IntType);
                navArgumentBuilder3.setNullable(false);
                break;
            case 8:
                NavArgumentBuilder navArgumentBuilder4 = (NavArgumentBuilder) obj;
                h.g.b.x.f(navArgumentBuilder4, "$this$navArgument");
                navArgumentBuilder4.setType(NavType.IntType);
                navArgumentBuilder4.setNullable(false);
                break;
            case 9:
                break;
            case 10:
                h.g.b.x.f((ActivityResult) obj, "it");
                break;
            case 11:
                break;
            case 12:
                NavOptionsBuilder navOptionsBuilder = (NavOptionsBuilder) obj;
                h.g.b.x.f(navOptionsBuilder, "$this$navigate");
                navOptionsBuilder.popUpTo("midDrive/{resumeDrive}", (h.g.a.l<? super PopUpToBuilder, h.ab>) new c(11));
                break;
            case 13:
                NavOptionsBuilder navOptionsBuilder2 = (NavOptionsBuilder) obj;
                h.g.b.x.f(navOptionsBuilder2, "$this$navigate");
                navOptionsBuilder2.popUpTo("alternateRoutesV2/{safeRoutesEnabled}", (h.g.a.l<? super PopUpToBuilder, h.ab>) new c(9));
                break;
            case 14:
                break;
            case 15:
                NavOptionsBuilder navOptionsBuilder3 = (NavOptionsBuilder) obj;
                h.g.b.x.f(navOptionsBuilder3, "$this$navigate");
                navOptionsBuilder3.popUpTo("preDrive/{preDriveTriggerReason}", (h.g.a.l<? super PopUpToBuilder, h.ab>) new c(i2));
                break;
            case 16:
                break;
            case 17:
                NavArgumentBuilder navArgumentBuilder5 = (NavArgumentBuilder) obj;
                h.g.b.x.f(navArgumentBuilder5, "$this$navArgument");
                navArgumentBuilder5.setType(NavType.StringType);
                navArgumentBuilder5.setNullable(false);
                break;
            case 18:
                org.a.d.g.a aVar7 = (org.a.d.g.a) obj;
                com.waze.main_screen.s sVar = com.waze.main_screen.s.f27419a;
                h.g.b.x.f(aVar7, "$this$module");
                b bVar7 = new b(i2);
                org.a.d.i.b bVar8 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar5 = org.a.d.c.c.f56382a;
                List listH3 = h.a.i.h();
                int i8 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar2 = new org.a.d.e.e(new org.a.d.c.a(bVar8, new h.g.b.m(com.waze.main_screen.g.a.a.class), null, bVar7, cVar5, listH3));
                aVar7.f(eVar2);
                new org.a.d.c.d(aVar7, eVar2);
                break;
            case 19:
                org.a.d.g.a aVar8 = (org.a.d.g.a) obj;
                com.waze.main_screen.u uVar = com.waze.main_screen.u.f27645a;
                h.g.b.x.f(aVar8, "$this$module");
                b bVar9 = new b(17);
                org.a.d.i.b bVar10 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar6 = org.a.d.c.c.f56383b;
                List listH4 = h.a.i.h();
                int i9 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar9 = new org.a.d.e.a(new org.a.d.c.a(bVar10, new h.g.b.m(com.waze.main_screen.i.class), null, bVar9, cVar6, listH4));
                aVar8.f(aVar9);
                new org.a.d.c.d(aVar8, aVar9);
                b bVar11 = new b(18);
                org.a.d.i.b bVar12 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar7 = org.a.d.c.c.f56382a;
                org.a.d.e.e eVar3 = new org.a.d.e.e(new org.a.d.c.a(bVar12, new h.g.b.m(com.waze.main_screen.o.d.class), null, bVar11, cVar7, h.a.i.h()));
                aVar8.f(eVar3);
                new org.a.d.c.d(aVar8, eVar3);
                b bVar13 = new b(19);
                org.a.d.e.e eVar4 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.main_screen.o.k.class), null, bVar13, cVar7, h.a.i.h()));
                aVar8.f(eVar4);
                new org.a.d.c.d(aVar8, eVar4);
                org.a.d.i.c cVar8 = new org.a.d.i.c(new h.g.b.m(com.waze.main_screen.af.class));
                dx dxVar2 = new dx(cVar8, aVar8);
                b bVar14 = new b(20);
                org.a.d.g.a aVarJ2 = dxVar2.j();
                org.a.d.e.a aVar10 = new org.a.d.e.a(new org.a.d.c.a(dxVar2.k(), new h.g.b.m(com.waze.main_screen.b.class), null, bVar14, cVar6, h.a.i.h()));
                aVarJ2.f(aVar10);
                new org.a.d.c.d(aVarJ2, aVar10);
                com.waze.main_screen.y yVar = new com.waze.main_screen.y(1);
                org.a.d.g.a aVarJ3 = dxVar2.j();
                org.a.d.e.a aVar11 = new org.a.d.e.a(new org.a.d.c.a(dxVar2.k(), new h.g.b.m(ax.class), null, yVar, cVar6, h.a.i.h()));
                aVarJ3.f(aVar11);
                new org.a.d.c.d(aVarJ3, aVar11);
                aVar8.c().add(cVar8);
                break;
            default:
                org.a.d.g.a aVar12 = (org.a.d.g.a) obj;
                int i10 = com.waze.main_screen.a.a.f25527a;
                h.g.b.x.f(aVar12, "$this$module");
                com.waze.main_screen.y yVar2 = new com.waze.main_screen.y(2);
                org.a.d.i.b bVar15 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar9 = org.a.d.c.c.f56382a;
                List listH5 = h.a.i.h();
                int i11 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar5 = new org.a.d.e.e(new org.a.d.c.a(bVar15, new h.g.b.m(com.waze.main_screen.a.b.j.class), null, yVar2, cVar9, listH5));
                aVar12.f(eVar5);
                new org.a.d.c.d(aVar12, eVar5);
                com.waze.main_screen.y yVar3 = new com.waze.main_screen.y(3);
                org.a.d.i.b bVar16 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar10 = org.a.d.c.c.f56383b;
                org.a.d.e.a aVar13 = new org.a.d.e.a(new org.a.d.c.a(bVar16, new h.g.b.m(com.waze.main_screen.a.d.class), null, yVar3, cVar10, h.a.i.h()));
                aVar12.f(aVar13);
                new org.a.d.c.d(aVar12, aVar13);
                com.waze.main_screen.y yVar4 = new com.waze.main_screen.y(4);
                org.a.d.e.a aVar14 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.main_screen.a.b.a.g.class), null, yVar4, cVar10, h.a.i.h()));
                aVar12.f(aVar14);
                new org.a.d.c.d(aVar12, aVar14);
                break;
        }
        return h.ab.f48028a;
    }
}
