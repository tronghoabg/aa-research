package com.waze.location;

import android.content.Context;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavType;
import androidx.navigation.PopUpToBuilder;
import com.waze.config.ConfigValues;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class aa implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f25236a;

    public /* synthetic */ aa(int i2) {
        this.f25236a = i2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = 2;
        int i3 = 7;
        int i4 = 6;
        int i5 = 5;
        switch (this.f25236a) {
            case 0:
                return LocationNativeManager.initializeSavedLocation$lambda$0((byte[]) obj);
            case 1:
                return a.a.C((PopUpToBuilder) obj);
            case 2:
                NavArgumentBuilder navArgumentBuilder = (NavArgumentBuilder) obj;
                h.g.b.x.f(navArgumentBuilder, "$this$navArgument");
                navArgumentBuilder.setType(NavType.BoolType);
                navArgumentBuilder.setNullable(false);
                navArgumentBuilder.setDefaultValue(false);
                return h.ab.f48028a;
            case 3:
                return a.a.C((PopUpToBuilder) obj);
            case 4:
                org.a.d.g.a aVar = (org.a.d.g.a) obj;
                int i6 = com.waze.main_screen.a.a.a.f25529a;
                h.g.b.x.f(aVar, "$this$module");
                com.waze.main_screen.y yVar = new com.waze.main_screen.y(i5);
                org.a.d.i.b bVar = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar = org.a.d.c.c.f56383b;
                List listH = h.a.i.h();
                int i7 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar2 = new org.a.d.e.a(new org.a.d.c.a(bVar, new h.g.b.m(com.waze.main_screen.a.a.n.class), null, yVar, cVar, listH));
                aVar.f(aVar2);
                new org.a.d.c.d(aVar, aVar2);
                return h.ab.f48028a;
            case 5:
                org.a.d.g.a aVar3 = (org.a.d.g.a) obj;
                int i8 = com.waze.main_screen.b.a.f25867a;
                h.g.b.x.f(aVar3, "$this$module");
                com.waze.main_screen.y yVar2 = new com.waze.main_screen.y(i4);
                org.a.d.i.b bVar2 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar2 = org.a.d.c.c.f56382a;
                List listH2 = h.a.i.h();
                int i9 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(bVar2, new h.g.b.m(com.waze.main_screen.b.a.c.class), null, yVar2, cVar2, listH2));
                aVar3.f(eVar);
                new org.a.d.c.d(aVar3, eVar);
                com.waze.main_screen.y yVar3 = new com.waze.main_screen.y(i3);
                org.a.d.e.e eVar2 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.main_screen.b.a.d.class), null, yVar3, cVar2, h.a.i.h()));
                aVar3.f(eVar2);
                new org.a.d.c.d(aVar3, eVar2);
                com.waze.main_screen.y yVar4 = new com.waze.main_screen.y(8);
                org.a.d.e.e eVar3 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.main_screen.b.a.f.class), null, yVar4, cVar2, h.a.i.h()));
                aVar3.f(eVar3);
                new org.a.d.c.d(aVar3, eVar3);
                com.waze.main_screen.y yVar5 = new com.waze.main_screen.y(9);
                org.a.d.e.e eVar4 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.main_screen.b.a.a.class), null, yVar5, cVar2, h.a.i.h()));
                aVar3.f(eVar4);
                new org.a.d.c.d(aVar3, eVar4);
                com.waze.main_screen.y yVar6 = new com.waze.main_screen.y(10);
                org.a.d.e.e eVar5 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.main_screen.b.a.b.class), null, yVar6, cVar2, h.a.i.h()));
                aVar3.f(eVar5);
                new org.a.d.c.d(aVar3, eVar5);
                return h.ab.f48028a;
            case 6:
                int iIntValue = ((Integer) obj).intValue();
                return Integer.valueOf(iIntValue + iIntValue);
            case 7:
                int iIntValue2 = ((Integer) obj).intValue();
                return Integer.valueOf(iIntValue2 + iIntValue2);
            case 8:
                ConfigValues.CONFIG_VALUE_DIALOGS_SAFETY_DIALOG_SHOWN.d(true);
                return null;
            case 9:
                com.waze.main_screen.a.b.h.d().b(com.waze.main_screen.bottom_bars.scrollable_eta.l.s);
                return h.ab.f48028a;
            case 10:
                org.a.d.g.a aVar4 = (org.a.d.g.a) obj;
                int i10 = com.waze.main_screen.c.c.f26156a;
                h.g.b.x.f(aVar4, "$this$module");
                com.waze.main_screen.y yVar7 = new com.waze.main_screen.y(13);
                org.a.d.i.b bVar3 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar3 = org.a.d.c.c.f56382a;
                List listH3 = h.a.i.h();
                int i11 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar6 = new org.a.d.e.e(new org.a.d.c.a(bVar3, new h.g.b.m(com.waze.main_screen.c.a.class), null, yVar7, cVar3, listH3));
                aVar4.f(eVar6);
                new org.a.d.c.d(aVar4, eVar6);
                com.waze.main_screen.y yVar8 = new com.waze.main_screen.y(14);
                org.a.d.e.e eVar7 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.main_screen.c.r.class), null, yVar8, cVar3, h.a.i.h()));
                aVar4.f(eVar7);
                new org.a.d.c.d(aVar4, eVar7);
                com.waze.main_screen.y yVar9 = new com.waze.main_screen.y(15);
                org.a.d.e.e eVar8 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.main_screen.c.e.h.class), null, yVar9, cVar3, h.a.i.h()));
                aVar4.f(eVar8);
                new org.a.d.c.d(aVar4, eVar8);
                return h.ab.f48028a;
            case 11:
                Context context = (Context) obj;
                h.g.b.x.f(context, "context");
                return new com.waze.main_screen.g.f(context, 2);
            case 12:
                org.a.d.g.a aVar5 = (org.a.d.g.a) obj;
                int i12 = com.waze.main_screen.c.f.a.f26221a;
                h.g.b.x.f(aVar5, "$this$module");
                com.waze.main_screen.y yVar10 = new com.waze.main_screen.y(17);
                org.a.d.i.b bVar4 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar4 = org.a.d.c.c.f56382a;
                List listH4 = h.a.i.h();
                int i13 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar9 = new org.a.d.e.e(new org.a.d.c.a(bVar4, new h.g.b.m(com.waze.main_screen.c.f.j.class), null, yVar10, cVar4, listH4));
                aVar5.f(eVar9);
                new org.a.d.c.d(aVar5, eVar9);
                com.waze.main_screen.y yVar11 = new com.waze.main_screen.y(18);
                org.a.d.e.e eVar10 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.main_screen.c.f.h.class), null, yVar11, cVar4, h.a.i.h()));
                aVar5.f(eVar10);
                new org.a.d.c.d(aVar5, eVar10);
                return h.ab.f48028a;
            case 13:
                org.a.d.g.a aVar6 = (org.a.d.g.a) obj;
                h.g.b.x.f(aVar6, "$this$module");
                com.waze.main_screen.y yVar12 = new com.waze.main_screen.y(19);
                org.a.d.i.b bVar5 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar5 = org.a.d.c.c.f56382a;
                List listH5 = h.a.i.h();
                int i14 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar11 = new org.a.d.e.e(new org.a.d.c.a(bVar5, new h.g.b.m(com.waze.main_screen.d.a.b.class), null, yVar12, cVar5, listH5));
                aVar6.f(eVar11);
                new org.a.d.c.d(aVar6, eVar11);
                com.waze.main_screen.y yVar13 = new com.waze.main_screen.y(20);
                org.a.d.e.e eVar12 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.main_screen.d.a.c.class), null, yVar13, cVar5, h.a.i.h()));
                aVar6.f(eVar12);
                new org.a.d.c.d(aVar6, eVar12);
                return h.ab.f48028a;
            case 14:
                Context context2 = (Context) obj;
                h.g.b.x.f(context2, "context");
                return new com.waze.main_screen.g.f(context2, 1);
            case 15:
                org.a.d.g.a aVar7 = (org.a.d.g.a) obj;
                int i15 = com.waze.main_screen.f.a.f26337a;
                h.g.b.x.f(aVar7, "$this$module");
                com.waze.main_screen.bottom_bars.scrollable_eta.b bVar6 = new com.waze.main_screen.bottom_bars.scrollable_eta.b(i2);
                org.a.d.i.b bVar7 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar6 = org.a.d.c.c.f56382a;
                List listH6 = h.a.i.h();
                int i16 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar13 = new org.a.d.e.e(new org.a.d.c.a(bVar7, new h.g.b.m(com.waze.main_screen.f.a.a.class), null, bVar6, cVar6, listH6));
                aVar7.f(eVar13);
                new org.a.d.c.d(aVar7, eVar13);
                return h.ab.f48028a;
            case 16:
                Context context3 = (Context) obj;
                h.g.b.x.f(context3, "it");
                return new com.waze.main_screen.g.b.d(context3);
            case 17:
                org.a.d.g.a aVar8 = (org.a.d.g.a) obj;
                int i17 = com.waze.main_screen.i.a.f26452a;
                h.g.b.x.f(aVar8, "$this$module");
                com.waze.main_screen.bottom_bars.scrollable_eta.b bVar8 = new com.waze.main_screen.bottom_bars.scrollable_eta.b(3);
                org.a.d.i.b bVar9 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar7 = org.a.d.c.c.f56383b;
                List listH7 = h.a.i.h();
                int i18 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar9 = new org.a.d.e.a(new org.a.d.c.a(bVar9, new h.g.b.m(com.waze.main_screen.h.a.a.class), null, bVar8, cVar7, listH7));
                aVar8.f(aVar9);
                new org.a.d.c.d(aVar8, aVar9);
                return h.ab.f48028a;
            case 18:
                org.a.d.g.a aVar10 = (org.a.d.g.a) obj;
                int i19 = com.waze.main_screen.j.n.f26495a;
                h.g.b.x.f(aVar10, "$this$module");
                com.waze.main_screen.bottom_bars.scrollable_eta.b bVar10 = new com.waze.main_screen.bottom_bars.scrollable_eta.b(4);
                org.a.d.i.b bVar11 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar8 = org.a.d.c.c.f56382a;
                List listH8 = h.a.i.h();
                int i20 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar14 = new org.a.d.e.e(new org.a.d.c.a(bVar11, new h.g.b.m(com.waze.main_screen.j.a.b.class), null, bVar10, cVar8, listH8));
                aVar10.f(eVar14);
                new org.a.d.c.d(aVar10, eVar14);
                com.waze.main_screen.bottom_bars.scrollable_eta.b bVar12 = new com.waze.main_screen.bottom_bars.scrollable_eta.b(i5);
                org.a.d.e.e eVar15 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.main_screen.j.a.g.class), null, bVar12, cVar8, h.a.i.h()));
                aVar10.f(eVar15);
                new org.a.d.c.d(aVar10, eVar15);
                com.waze.main_screen.bottom_bars.scrollable_eta.b bVar13 = new com.waze.main_screen.bottom_bars.scrollable_eta.b(i4);
                org.a.d.e.e eVar16 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.main_screen.j.h.class), null, bVar13, cVar8, h.a.i.h()));
                aVar10.f(eVar16);
                new org.a.d.c.d(aVar10, eVar16);
                com.waze.main_screen.bottom_bars.scrollable_eta.b bVar14 = new com.waze.main_screen.bottom_bars.scrollable_eta.b(i3);
                org.a.d.e.a aVar11 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.main_screen.j.i.class), null, bVar14, org.a.d.c.c.f56383b, h.a.i.h()));
                aVar10.f(aVar11);
                new org.a.d.c.d(aVar10, aVar11);
                return h.ab.f48028a;
            case 19:
                int iIntValue3 = ((Integer) obj).intValue();
                return Integer.valueOf(iIntValue3 + iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj).intValue();
                return Integer.valueOf(iIntValue4 + iIntValue4);
        }
    }
}
