package com.waze.car_lib;

import android.view.WindowManager;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import com.waze.closure.domain.ClosureNativeManager;
import com.waze.jni.protos.places.GenericPlace;
import com.waze.sharedui.profile.UserProfile;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class r implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f20863a;

    public /* synthetic */ r(int i2) {
        this.f20863a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = 2;
        int i3 = 20;
        int i4 = 19;
        Object[] objArr = 0;
        int i5 = 1;
        switch (this.f20863a) {
            case 0:
                return z.f((org.a.d.g.a) obj);
            case 1:
                org.a.d.g.a aVar = (org.a.d.g.a) obj;
                int i6 = com.waze.closure.b.a.f22450a;
                h.g.b.x.f(aVar, "$this$module");
                an anVar = new an(17);
                org.a.d.i.b bVar = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar = org.a.d.c.c.f56382a;
                List listH = h.a.i.h();
                int i7 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(bVar, new h.g.b.m(ClosureNativeManager.class), null, anVar, cVar, listH));
                aVar.f(eVar);
                com.waze.web.r.r(new org.a.d.c.d(aVar, eVar), new h.l.c[]{new h.g.b.m(com.waze.closure.domain.c.class)});
                org.a.d.e.e eVar2 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.closure.domain.g.class), null, new an(18), cVar, h.a.i.h()));
                aVar.f(eVar2);
                new org.a.d.c.d(aVar, eVar2);
                org.a.d.e.a aVar2 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.closure.c.i.class), null, new an(i4), org.a.d.c.c.f56383b, h.a.i.h()));
                aVar.f(aVar2);
                new org.a.d.c.d(aVar, aVar2);
                org.a.d.e.e eVar3 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.closure.domain.i.class), null, new an(i3), cVar, h.a.i.h()));
                aVar.f(eVar3);
                new org.a.d.c.d(aVar, eVar3);
                org.a.d.e.e eVar4 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.closure.domain.a.class), null, new com.waze.o.a.a(i5), cVar, h.a.i.h()));
                aVar.f(eVar4);
                new org.a.d.c.d(aVar, eVar4);
                return h.ab.f48028a;
            case 2:
                com.waze.closure.a.a aVar3 = (com.waze.closure.a.a) obj;
                h.g.b.x.f(aVar3, "it");
                return h.a.i.av(aVar3.f());
            case 3:
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                h.g.b.x.f(graphicsLayerScope, "$this$graphicsLayer");
                graphicsLayerScope.mo8411setCompositingStrategyaDBOjCE(CompositingStrategy.Companion.m8319getOffscreenNrFUSI());
                return h.ab.f48028a;
            case 4:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 5:
                org.a.d.g.a aVar4 = (org.a.d.g.a) obj;
                int i8 = com.waze.q.c.f33455a;
                h.g.b.x.f(aVar4, "$this$module");
                com.waze.o.a.a aVar5 = new com.waze.o.a.a(i4);
                org.a.d.i.b bVar2 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar2 = org.a.d.c.c.f56382a;
                List listH2 = h.a.i.h();
                int i9 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar5 = new org.a.d.e.e(new org.a.d.c.a(bVar2, new h.g.b.m(com.waze.al.a.a.class), null, aVar5, cVar2, listH2));
                aVar4.f(eVar5);
                new org.a.d.c.d(aVar4, eVar5);
                org.a.d.e.a aVar6 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.q.l.class), null, new com.waze.o.a.a(i3), org.a.d.c.c.f56383b, h.a.i.h()));
                aVar4.f(aVar6);
                new org.a.d.c.d(aVar4, aVar6);
                org.a.d.e.e eVar6 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.q.a.class), null, new com.waze.t.l(i5), cVar2, h.a.i.h()));
                aVar4.f(eVar6);
                new org.a.d.c.d(aVar4, eVar6);
                return h.ab.f48028a;
            case 6:
                h.g.b.x.f((com.waze.design_components.c.b) obj, "it");
                return h.ab.f48028a;
            case 7:
                return Long.valueOf(((UserProfile) obj).getUserId());
            case 8:
                org.a.d.g.a aVar7 = (org.a.d.g.a) obj;
                int i10 = com.waze.coroutines.m.f23195a;
                h.g.b.x.f(aVar7, "$this$module");
                org.a.d.i.b bVarF = com.waze.ch.a.a.f.f("WazeCoroutines");
                com.waze.coroutines.l lVar = new com.waze.coroutines.l(i5);
                org.a.d.i.b bVar3 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar3 = org.a.d.c.c.f56382a;
                List listH3 = h.a.i.h();
                int i11 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar7 = new org.a.d.e.e(new org.a.d.c.a(bVar3, new h.g.b.m(com.waze.shared_infra.i.e.class), bVarF, lVar, cVar3, listH3));
                aVar7.f(eVar7);
                new org.a.d.c.d(aVar7, eVar7);
                org.a.d.e.e eVar8 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.coroutines.i.class), null, new com.waze.coroutines.l(objArr == true ? 1 : 0), cVar3, h.a.i.h()));
                aVar7.f(eVar8);
                new org.a.d.c.d(aVar7, eVar8);
                org.a.d.e.e eVar9 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.coroutines.b.class), null, new com.waze.coroutines.l(i2), cVar3, h.a.i.h()));
                aVar7.f(eVar9);
                new org.a.d.c.d(aVar7, eVar9);
                return h.ab.f48028a;
            case 9:
                GenericPlace genericPlace = (GenericPlace) obj;
                h.g.b.x.c(genericPlace);
                return com.waze.ac.e.m(genericPlace);
            case 10:
                com.waze.av.b.j jVar = (com.waze.av.b.j) obj;
                h.g.b.x.f(jVar, "it");
                return Boolean.valueOf(com.waze.ac.e.u(jVar).length() > 0);
            case 11:
                org.a.d.g.a aVar8 = (org.a.d.g.a) obj;
                int i12 = com.waze.y.b.f45545a;
                h.g.b.x.f(aVar8, "$this$module");
                com.waze.coroutines.l lVar2 = new com.waze.coroutines.l(3);
                org.a.d.i.b bVar4 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar4 = org.a.d.c.c.f56382a;
                List listH4 = h.a.i.h();
                int i13 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar10 = new org.a.d.e.e(new org.a.d.c.a(bVar4, new h.g.b.m(com.waze.y.a.class), null, lVar2, cVar4, listH4));
                aVar8.f(eVar10);
                new org.a.d.c.d(aVar8, eVar10);
                org.a.d.e.a aVar9 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.y.g.class), null, new com.waze.coroutines.l(4), org.a.d.c.c.f56383b, h.a.i.h()));
                aVar8.f(aVar9);
                new org.a.d.c.d(aVar8, aVar9);
                return h.ab.f48028a;
            case 12:
                int i14 = com.waze.design_components.a.c.f23291a;
                h.g.b.x.f((com.waze.design_components.a.d) obj, "it");
                return h.ab.f48028a;
            case 13:
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) obj;
                h.g.b.x.f(layoutParams, "params");
                layoutParams.width = -1;
                layoutParams.height = -1;
                return h.ab.f48028a;
            case 14:
                int i15 = com.waze.z.a.l.f46143a;
                return a.a.s((String) obj);
            case 15:
                int i16 = com.waze.z.a.l.f46143a;
                return a.a.s((String) obj);
            case 16:
                int i17 = com.waze.z.a.l.f46143a;
                return a.a.s((String) obj);
            case 17:
                int i18 = com.waze.z.a.l.f46143a;
                return a.a.s((String) obj);
            case 18:
                ((Float) obj).floatValue();
                int i19 = com.waze.z.a.aj.f45635a;
                return Float.valueOf(0.0f);
            case 19:
                int i20 = com.waze.z.a.d.e.f45945a;
                return a.a.s((String) obj);
            default:
                return com.waze.z.a.d.e.w((com.waze.z.a.d.ap) obj);
        }
    }
}
