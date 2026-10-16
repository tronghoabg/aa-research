package com.waze.network;

import androidx.activity.result.ActivityResult;
import com.waze.config.ConfigValues;
import com.waze.map.b.ed;
import com.waze.search.v2.ck;
import com.waze.search.v2.df;
import e.a.dx;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class q implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f32403a;

    public /* synthetic */ q(int i2) {
        this.f32403a = i2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f32403a) {
            case 0:
                return r.d((org.a.d.g.a) obj);
            case 1:
                Throwable th = (Throwable) obj;
                h.g.b.x.f(th, "throwable");
                return kotlinx.coroutines.b.ai.G(h.m.d(e.b.c.a(th)));
            case 2:
                Throwable th2 = (Throwable) obj;
                h.g.b.x.f(th2, "throwable");
                return kotlinx.coroutines.b.ai.G(h.m.d(e.b.c.a(th2)));
            case 3:
                org.a.d.g.a aVar = (org.a.d.g.a) obj;
                int i2 = com.waze.reports.ay.f33670a;
                h.g.b.x.f(aVar, "$this$module");
                int i3 = h.g.b.ar.f48106a;
                org.a.d.i.c cVar = new org.a.d.i.c(new h.g.b.m(com.waze.reports.ax.class));
                dx dxVar = new dx(cVar, aVar);
                com.waze.perf.o oVar = new com.waze.perf.o(8);
                org.a.d.i.a aVarK = dxVar.k();
                org.a.d.c.c cVar2 = org.a.d.c.c.f56384c;
                org.a.d.e.c cVar3 = new org.a.d.e.c(new org.a.d.c.a(aVarK, new h.g.b.m(com.waze.shared_infra.i.e.class), null, oVar, cVar2, h.a.i.h()));
                dxVar.j().f(cVar3);
                new org.a.d.c.d(dxVar.j(), cVar3);
                org.a.d.e.c cVar4 = new org.a.d.e.c(new org.a.d.c.a(dxVar.k(), new h.g.b.m(ed.class), null, new com.waze.perf.o(9), cVar2, h.a.i.h()));
                dxVar.j().f(cVar4);
                new org.a.d.c.d(dxVar.j(), cVar4);
                org.a.d.e.c cVar5 = new org.a.d.e.c(new org.a.d.c.a(dxVar.k(), new h.g.b.m(com.waze.reports.ba.class), null, new com.waze.perf.o(10), cVar2, h.a.i.h()));
                dxVar.j().f(cVar5);
                new org.a.d.c.d(dxVar.j(), cVar5);
                aVar.c().add(cVar);
                return h.ab.f48028a;
            case 4:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 5:
                org.a.d.g.a aVar2 = (org.a.d.g.a) obj;
                int i4 = com.waze.search.l.f35977a;
                h.g.b.x.f(aVar2, "$this$module");
                com.waze.search.c cVar6 = new com.waze.search.c(16);
                org.a.d.i.b bVar = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar7 = org.a.d.c.c.f56382a;
                List listH = h.a.i.h();
                int i5 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(bVar, new h.g.b.m(com.waze.av.c.j.class), null, cVar6, cVar7, listH));
                aVar2.f(eVar);
                new org.a.d.c.d(aVar2, eVar);
                return h.ab.f48028a;
            case 6:
                i.b.n.a.o oVar2 = (i.b.n.a.o) obj;
                h.g.b.x.f(oVar2, "$this$add");
                oVar2.f(ConfigValues.CONFIG_VALUE_EV_PLUG_SPEED_TIER_2_MIN_KW.b().longValue());
                return h.ab.f48028a;
            case 7:
                i.b.n.a.o oVar3 = (i.b.n.a.o) obj;
                h.g.b.x.f(oVar3, "$this$add");
                oVar3.g(ConfigValues.CONFIG_VALUE_SEARCH_TOP_RATED_MIN_RATING.b().longValue());
                return h.ab.f48028a;
            case 8:
                org.a.d.g.a aVar3 = (org.a.d.g.a) obj;
                int i6 = com.waze.search.bo.f35581a;
                h.g.b.x.f(aVar3, "$this$module");
                com.waze.search.c cVar8 = new com.waze.search.c(17);
                org.a.d.i.b bVar2 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar9 = org.a.d.c.c.f56383b;
                List listH2 = h.a.i.h();
                int i7 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar4 = new org.a.d.e.a(new org.a.d.c.a(bVar2, new h.g.b.m(com.waze.search.b.a.class), null, cVar8, cVar9, listH2));
                aVar3.f(aVar4);
                new org.a.d.c.d(aVar3, aVar4);
                org.a.d.e.a aVar5 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.search.b.d.class), null, new com.waze.search.c(18), cVar9, h.a.i.h()));
                aVar3.f(aVar5);
                new org.a.d.c.d(aVar3, aVar5);
                return h.ab.f48028a;
            case 9:
                org.a.d.g.a aVar6 = (org.a.d.g.a) obj;
                com.waze.search.a.d dVar = com.waze.search.a.d.f35473a;
                h.g.b.x.f(aVar6, "$this$module");
                com.waze.search.c cVar10 = new com.waze.search.c(19);
                org.a.d.i.b bVar3 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar11 = org.a.d.c.c.f56382a;
                List listH3 = h.a.i.h();
                int i8 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar2 = new org.a.d.e.e(new org.a.d.c.a(bVar3, new h.g.b.m(com.waze.w.t.class), null, cVar10, cVar11, listH3));
                aVar6.f(eVar2);
                new org.a.d.c.d(aVar6, eVar2);
                org.a.d.e.e eVar3 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.w.y.class), null, new com.waze.search.a.a(1), cVar11, h.a.i.h()));
                aVar6.f(eVar3);
                new org.a.d.c.d(aVar6, eVar3);
                org.a.d.e.e eVar4 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.search.a.a.a.class), null, new com.waze.search.c(20), cVar11, h.a.i.h()));
                aVar6.f(eVar4);
                new org.a.d.c.d(aVar6, eVar4);
                com.waze.search.a.a aVar7 = new com.waze.search.a.a(0);
                org.a.d.i.b bVar4 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar12 = org.a.d.c.c.f56383b;
                org.a.d.e.a aVar8 = new org.a.d.e.a(new org.a.d.c.a(bVar4, new h.g.b.m(com.waze.search.a.c.a.class), null, aVar7, cVar12, h.a.i.h()));
                aVar6.f(aVar8);
                new org.a.d.c.d(aVar6, aVar8);
                org.a.d.i.c cVar13 = new org.a.d.i.c(new h.g.b.m(com.waze.search.a.b.h.class));
                dx dxVar2 = new dx(cVar13, aVar6);
                com.waze.search.a.a aVar9 = new com.waze.search.a.a(2);
                org.a.d.g.a aVarJ = dxVar2.j();
                org.a.d.e.a aVar10 = new org.a.d.e.a(new org.a.d.c.a(dxVar2.k(), new h.g.b.m(com.waze.search.a.c.g.class), null, aVar9, cVar12, h.a.i.h()));
                aVarJ.f(aVar10);
                new org.a.d.c.d(aVarJ, aVar10);
                aVar6.c().add(cVar13);
                return h.ab.f48028a;
            case 10:
                h.g.b.x.f((com.waze.search.e.p) obj, "it");
                return h.ab.f48028a;
            case 11:
                h.g.b.x.f((com.waze.search.e.p) obj, "it");
                return h.ab.f48028a;
            case 12:
                h.g.b.x.f((com.waze.search.e.p) obj, "it");
                return h.ab.f48028a;
            case 13:
                h.g.b.x.f((com.waze.search.e.p) obj, "it");
                return h.ab.f48028a;
            case 14:
                h.g.b.x.f((ActivityResult) obj, "it");
                return h.ab.f48028a;
            case 15:
                h.g.b.x.f((ActivityResult) obj, "it");
                return h.ab.f48028a;
            case 16:
                return h.n.o.j("$", ((Integer) obj).intValue());
            case 17:
                int i9 = ck.f36249b;
                return h.ab.f48028a;
            case 18:
                com.waze.z.a.m mVar = (com.waze.z.a.m) obj;
                int i10 = df.f36355a;
                h.g.b.x.f(mVar, "it");
                return mVar;
            case 19:
                return com.waze.navigate.location_preview.ay.U((com.waze.navigate.location_preview.ay) obj, 5, null, null, null, null, -5);
            default:
                return Long.valueOf(((com.waze.z.a.d.ak) obj) == null ? 0L : 300L);
        }
    }
}
