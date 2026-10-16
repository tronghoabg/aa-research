package com.waze.main_screen.s;

import android.content.Context;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.waze.main_screen.c.e.k;
import com.waze.main_screen.c.n;
import com.waze.main_screen.c.s;
import com.waze.main_screen.k.a.p;
import com.waze.main_screen.t.al;
import com.waze.main_screen.t.aw;
import com.waze.main_screen.v.ad;
import com.waze.main_screen.v.h;
import com.waze.main_screen.v.o;
import com.waze.navigate.fo;
import com.waze.sound.hn;
import com.waze.sound.jr;
import com.waze.ui.j.j;
import com.waze.view.navbar.q;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f27421a;

    public /* synthetic */ a(int i2) {
        this.f27421a = i2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = 7;
        int i3 = 6;
        int i4 = 3;
        int i5 = 5;
        int i6 = 4;
        switch (this.f27421a) {
            case 0:
                org.a.d.g.a aVar = (org.a.d.g.a) obj;
                int i7 = b.f27422a;
                x.f(aVar, "$this$module");
                k kVar = new k(i6);
                org.a.d.i.b bVar = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar = org.a.d.c.c.f56383b;
                List listH = i.h();
                int i8 = ar.f48106a;
                org.a.d.e.a aVar2 = new org.a.d.e.a(new org.a.d.c.a(bVar, new m(fo.class), null, kVar, cVar, listH));
                aVar.f(aVar2);
                new org.a.d.c.d(aVar, aVar2);
                org.a.d.e.a aVar3 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(c.class), null, new k(i5), cVar, i.h()));
                aVar.f(aVar3);
                new org.a.d.c.d(aVar, aVar3);
                return ab.f48028a;
            case 1:
                org.a.d.g.a aVar4 = (org.a.d.g.a) obj;
                int i9 = com.waze.main_screen.r.a.f27407a;
                x.f(aVar4, "$this$module");
                k kVar2 = new k(i4);
                org.a.d.i.b bVar2 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar2 = org.a.d.c.c.f56383b;
                List listH2 = i.h();
                int i10 = ar.f48106a;
                org.a.d.e.a aVar5 = new org.a.d.e.a(new org.a.d.c.a(bVar2, new m(com.waze.main_screen.r.a.c.class), null, kVar2, cVar2, listH2));
                aVar4.f(aVar5);
                new org.a.d.c.d(aVar4, aVar5);
                return ab.f48028a;
            case 2:
                Context context = (Context) obj;
                x.f(context, "it");
                q qVar = new q(context);
                qVar.d();
                return qVar;
            case 3:
                org.a.d.g.a aVar6 = (org.a.d.g.a) obj;
                int i11 = com.waze.main_screen.t.a.f27432a;
                x.f(aVar6, "$this$module");
                k kVar3 = new k(i3);
                org.a.d.i.b bVar3 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar3 = org.a.d.c.c.f56383b;
                List listH3 = i.h();
                int i12 = ar.f48106a;
                org.a.d.e.a aVar7 = new org.a.d.e.a(new org.a.d.c.a(bVar3, new m(aw.class), null, kVar3, cVar3, listH3));
                aVar6.f(aVar7);
                new org.a.d.c.d(aVar6, aVar7);
                org.a.d.e.a aVar8 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(j.class), null, new k(i2), cVar3, i.h()));
                aVar6.f(aVar8);
                new org.a.d.c.d(aVar6, aVar8);
                return ab.f48028a;
            case 4:
                s sVar = (s) obj;
                int i13 = al.f27484a;
                x.f(sVar, "it");
                com.waze.location.q qVarD = sVar.d();
                return Boolean.valueOf(((qVarD instanceof n) || (qVarD instanceof com.waze.main_screen.c.q)) ? false : true);
            case 5:
                int i14 = al.f27484a;
                x.f((com.waze.location.q) obj, "it");
                return Boolean.valueOf(!(r0 instanceof n));
            case 6:
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                int i15 = al.f27484a;
                x.f(graphicsLayerScope, "$this$graphicsLayer");
                graphicsLayerScope.getDensity();
                graphicsLayerScope.setTranslationY(graphicsLayerScope.mo2127toPx0680j_4(400.0f) * 0.35f);
                return ab.f48028a;
            case 7:
                int iIntValue = ((Integer) obj).intValue();
                int i16 = al.f27484a;
                return Integer.valueOf(-iIntValue);
            case 8:
                int iIntValue2 = ((Integer) obj).intValue();
                int i17 = al.f27484a;
                return Integer.valueOf(-iIntValue2);
            case 9:
                ((Integer) obj).intValue();
                int i18 = al.f27484a;
                return ab.f48028a;
            case 10:
                org.a.d.g.a aVar9 = (org.a.d.g.a) obj;
                int i19 = h.f27796a;
                x.f(aVar9, "$this$module");
                p pVar = new p(2);
                org.a.d.i.b bVar4 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar4 = org.a.d.c.c.f56383b;
                List listH4 = i.h();
                int i20 = ar.f48106a;
                org.a.d.e.a aVar10 = new org.a.d.e.a(new org.a.d.c.a(bVar4, new m(o.class), null, pVar, cVar4, listH4));
                aVar9.f(aVar10);
                new org.a.d.c.d(aVar9, aVar10);
                p pVar2 = new p(i4);
                org.a.d.i.b bVar5 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar5 = org.a.d.c.c.f56382a;
                org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(bVar5, new m(com.waze.main_screen.v.c.class), null, pVar2, cVar5, i.h()));
                aVar9.f(eVar);
                new org.a.d.c.d(aVar9, eVar);
                org.a.d.e.e eVar2 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.main_screen.v.j.class), null, new p(i6), cVar5, i.h()));
                aVar9.f(eVar2);
                new org.a.d.c.d(aVar9, eVar2);
                org.a.d.e.e eVar3 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(ad.class), null, new p(i5), cVar5, i.h()));
                aVar9.f(eVar3);
                new org.a.d.c.d(aVar9, eVar3);
                return ab.f48028a;
            case 11:
                x.f((com.waze.ui.q.c) obj, "it");
                return ab.f48028a;
            case 12:
                org.a.d.g.a aVar11 = (org.a.d.g.a) obj;
                int i21 = com.waze.main_screen.w.a.f27854a;
                x.f(aVar11, "$this$module");
                p pVar3 = new p(i3);
                org.a.d.i.b bVar6 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar6 = org.a.d.c.c.f56383b;
                List listH5 = i.h();
                int i22 = ar.f48106a;
                org.a.d.e.a aVar12 = new org.a.d.e.a(new org.a.d.c.a(bVar6, new m(com.waze.main_screen.w.a.a.class), null, pVar3, cVar6, listH5));
                aVar11.f(aVar12);
                new org.a.d.c.d(aVar11, aVar12);
                return ab.f48028a;
            case 13:
                org.a.d.g.a aVar13 = (org.a.d.g.a) obj;
                x.f(aVar13, "$this$module");
                p pVar4 = new p(i2);
                org.a.d.i.b bVar7 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar7 = org.a.d.c.c.f56383b;
                List listH6 = i.h();
                int i23 = ar.f48106a;
                org.a.d.e.a aVar14 = new org.a.d.e.a(new org.a.d.c.a(bVar7, new m(com.waze.main_screen.x.a.class), null, pVar4, cVar7, listH6));
                aVar13.f(aVar14);
                new org.a.d.c.d(aVar13, aVar14);
                return ab.f48028a;
            case 14:
                org.a.d.g.a aVar15 = (org.a.d.g.a) obj;
                int i24 = com.waze.main_screen.z.a.f27887a;
                x.f(aVar15, "$this$module");
                p pVar5 = new p(9);
                org.a.d.i.b bVar8 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar8 = org.a.d.c.c.f56383b;
                List listH7 = i.h();
                int i25 = ar.f48106a;
                org.a.d.e.a aVar16 = new org.a.d.e.a(new org.a.d.c.a(bVar8, new m(com.waze.bw.c.c.a.class), null, pVar5, cVar8, listH7));
                aVar15.f(aVar16);
                new org.a.d.c.d(aVar15, aVar16);
                org.a.d.e.a aVar17 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(jr.class), null, new p(10), cVar8, i.h()));
                aVar15.f(aVar17);
                new org.a.d.c.d(aVar15, aVar17);
                org.a.d.e.a aVar18 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(hn.class), null, new p(11), cVar8, i.h()));
                aVar15.f(aVar18);
                new org.a.d.c.d(aVar15, aVar18);
                org.a.d.e.a aVar19 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.menus.a.b.b.class), null, new p(12), cVar8, i.h()));
                aVar15.f(aVar19);
                new org.a.d.c.d(aVar15, aVar19);
                return ab.f48028a;
            case 15:
                org.a.d.g.a aVar20 = (org.a.d.g.a) obj;
                int i26 = com.waze.main_screen.ab.j.f25666a;
                x.f(aVar20, "$this$module");
                p pVar6 = new p(13);
                org.a.d.i.b bVar9 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar9 = org.a.d.c.c.f56382a;
                List listH8 = i.h();
                int i27 = ar.f48106a;
                org.a.d.e.e eVar4 = new org.a.d.e.e(new org.a.d.c.a(bVar9, new m(com.waze.main_screen.ab.h.class), null, pVar6, cVar9, listH8));
                aVar20.f(eVar4);
                new org.a.d.c.d(aVar20, eVar4);
                org.a.d.e.e eVar5 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.main_screen.ab.a.m.class), null, new p(14), cVar9, i.h()));
                aVar20.f(eVar5);
                new org.a.d.c.d(aVar20, eVar5);
                return ab.f48028a;
            case 16:
                x.f((SemanticsPropertyReceiver) obj, "$this$clearAndSetSemantics");
                return ab.f48028a;
            case 17:
                org.a.d.g.a aVar21 = (org.a.d.g.a) obj;
                int i28 = com.waze.main_screen.ad.a.f25690a;
                x.f(aVar21, "$this$module");
                p pVar7 = new p(15);
                org.a.d.i.b bVar10 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar10 = org.a.d.c.c.f56383b;
                List listH9 = i.h();
                int i29 = ar.f48106a;
                org.a.d.e.a aVar22 = new org.a.d.e.a(new org.a.d.c.a(bVar10, new m(com.waze.main_screen.ad.a.h.class), null, pVar7, cVar10, listH9));
                aVar21.f(aVar22);
                new org.a.d.c.d(aVar21, aVar22);
                return ab.f48028a;
            case 18:
                Context context2 = (Context) obj;
                x.f(context2, "context");
                return new com.waze.view.navbar.i(context2);
            case 19:
                org.a.d.g.a aVar23 = (org.a.d.g.a) obj;
                int i30 = com.waze.main_screen.ae.a.f25714a;
                x.f(aVar23, "$this$module");
                p pVar8 = new p(16);
                org.a.d.i.b bVar11 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar11 = org.a.d.c.c.f56383b;
                List listH10 = i.h();
                int i31 = ar.f48106a;
                org.a.d.e.a aVar24 = new org.a.d.e.a(new org.a.d.c.a(bVar11, new m(com.waze.main_screen.ae.a.d.class), null, pVar8, cVar11, listH10));
                aVar23.f(aVar24);
                new org.a.d.c.d(aVar23, aVar24);
                p pVar9 = new p(17);
                org.a.d.i.b bVar12 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar12 = org.a.d.c.c.f56382a;
                org.a.d.e.e eVar6 = new org.a.d.e.e(new org.a.d.c.a(bVar12, new m(com.waze.main_screen.ae.a.a.class), null, pVar9, cVar12, i.h()));
                aVar23.f(eVar6);
                new org.a.d.c.d(aVar23, eVar6);
                org.a.d.e.e eVar7 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new m(com.waze.main_screen.ae.a.o.class), null, new p(18), cVar12, i.h()));
                aVar23.f(eVar7);
                new org.a.d.c.d(aVar23, eVar7);
                return ab.f48028a;
            default:
                Context context3 = (Context) obj;
                x.f(context3, "context");
                com.waze.main_screen.g.e eVar8 = new com.waze.main_screen.g.e(context3);
                eVar8.e();
                return eVar8;
        }
    }
}
