package com.waze.z.a.d;

import androidx.compose.runtime.Composer;
import com.waze.asks.WazeAsksNativeManager;
import com.waze.insights_infra.NotificationInsightsNativeManager;
import com.waze.location.bp;
import com.waze.reports_v2.b.aq;
import com.waze.stats.ax;
import h.g.b.ar;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class c implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f45943a;

    public /* synthetic */ c(int i2) {
        this.f45943a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f45943a) {
            case 0:
                return e.p((Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return e.q((Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return e.o((Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return e.n((Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return e.m((Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return e.l((Composer) obj, ((Integer) obj2).intValue());
            case 6:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                int i2 = com.waze.an.a.f14321a;
                h.g.b.x.f(bVar, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i3 = ar.f48106a;
                return new com.waze.an.e.m((ax) bVar.a(new h.g.b.m(ax.class), null, null), (com.waze.reports_v2.d.j) bVar.a(new h.g.b.m(com.waze.reports_v2.d.j.class), null, null));
            case 7:
                int i4 = com.waze.an.a.f14321a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.an.d.e();
            case 8:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                int i5 = com.waze.an.a.f14321a;
                h.g.b.x.f(bVar2, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i6 = ar.f48106a;
                return new com.waze.an.d.g((com.waze.an.d.b) bVar2.a(new h.g.b.m(com.waze.an.d.b.class), null, null), (com.waze.shared_infra.o.a) bVar2.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (com.waze.an.d.e) bVar2.a(new h.g.b.m(com.waze.an.d.e.class), null, null));
            case 9:
                int i7 = com.waze.an.a.f14321a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.ao.a.a();
            case 10:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                int i8 = com.waze.an.a.f14321a;
                h.g.b.x.f(bVar3, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i9 = ar.f48106a;
                com.waze.an.e.m mVarA = ((com.waze.ao.a.c) bVar3.a(new h.g.b.m(com.waze.ao.a.c.class), null, null)).a();
                com.waze.shared_infra.o.a aVar = (com.waze.shared_infra.o.a) bVar3.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                WazeAsksNativeManager wazeAsksNativeManager = (WazeAsksNativeManager) bVar3.a(new h.g.b.m(WazeAsksNativeManager.class), null, null);
                aq aqVar = (aq) bVar3.a(new h.g.b.m(aq.class), null, null);
                com.waze.an.e.m mVar = (com.waze.an.e.m) bVar3.a(new h.g.b.m(com.waze.an.e.m.class), null, null);
                com.waze.ao.a.a aVar2 = (com.waze.ao.a.a) bVar3.a(new h.g.b.m(com.waze.ao.a.a.class), null, null);
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("InsightFeedbackConverter");
                h.g.b.x.e(eVarD, "create(...)");
                return new com.waze.an.a.a.y(mVarA, aVar, wazeAsksNativeManager, aqVar, mVar, aVar2, eVarD);
            case 11:
                int i10 = com.waze.an.a.f14321a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.ao.a.c(null);
            case 12:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i11 = com.waze.an.a.f14321a;
                h.g.b.x.f(bVar4, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i12 = ar.f48106a;
                com.waze.ao.a.c cVar = (com.waze.ao.a.c) bVar4.a(new h.g.b.m(com.waze.ao.a.c.class), null, null);
                com.waze.an.e.m mVar2 = (com.waze.an.e.m) bVar4.a(new h.g.b.m(com.waze.an.e.m.class), null, null);
                com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("InsightFeedbackEndOfDriveStateHolder");
                h.g.b.x.e(eVarD2, "create(...)");
                return new com.waze.ao.b.a(cVar, mVar2, eVarD2);
            case 13:
                int i13 = com.waze.an.a.f14321a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.an.a.a.z();
            case 14:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                int i14 = com.waze.an.a.f14321a;
                h.g.b.x.f(bVar5, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i15 = ar.f48106a;
                com.waze.shared_infra.o.a aVar3 = (com.waze.shared_infra.o.a) bVar5.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                WazeAsksNativeManager wazeAsksNativeManager2 = (WazeAsksNativeManager) bVar5.a(new h.g.b.m(WazeAsksNativeManager.class), null, null);
                aq aqVar2 = (aq) bVar5.a(new h.g.b.m(aq.class), null, null);
                com.waze.an.a.a.z zVar = (com.waze.an.a.a.z) bVar5.a(new h.g.b.m(com.waze.an.a.a.z.class), null, null);
                com.waze.an.d.f fVar = (com.waze.an.d.f) bVar5.a(new h.g.b.m(com.waze.an.d.f.class), null, null);
                com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("MultiAskConverter");
                h.g.b.x.e(eVarD3, "create(...)");
                return new com.waze.an.a.a.ac(aVar3, wazeAsksNativeManager2, aqVar2, zVar, fVar, eVarD3);
            case 15:
                com.waze.an.b.f fVar2 = (com.waze.an.b.f) obj;
                com.waze.an.b.f fVar3 = (com.waze.an.b.f) obj2;
                h.g.b.x.f(fVar2, "old");
                h.g.b.x.f(fVar3, "new");
                com.waze.an.a.r rVarB = fVar2.b();
                com.waze.location.q qVarM = rVarB != null ? rVarB.m() : null;
                com.waze.an.a.r rVarB2 = fVar3.b();
                boolean zN = h.g.b.x.n(qVarM, rVarB2 != null ? rVarB2.m() : null);
                boolean z = false;
                if (zN) {
                    com.waze.an.a.p pVarA = fVar2.a();
                    com.waze.an.a.v vVarA = pVarA != null ? pVarA.a() : null;
                    com.waze.an.a.p pVarA2 = fVar3.a();
                    if (h.g.b.x.n(vVarA, pVarA2 != null ? pVarA2.a() : null)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 16:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                int i16 = com.waze.insights_infra.b.f24696a;
                h.g.b.x.f(bVar6, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i17 = ar.f48106a;
                com.waze.ap.b.n nVar = (com.waze.ap.b.n) bVar6.a(new h.g.b.m(com.waze.ap.b.n.class), null, null);
                kotlinx.coroutines.ab abVarB = av.b();
                com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("InsightsInfra");
                h.g.b.x.e(eVarD4, "create(...)");
                return new com.waze.insights_infra.d(nVar, abVarB, eVarD4);
            case 17:
                org.a.d.k.b bVar7 = (org.a.d.k.b) obj;
                int i18 = com.waze.insights_infra.b.f24696a;
                h.g.b.x.f(bVar7, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i19 = ar.f48106a;
                com.waze.an.d.b bVar8 = (com.waze.an.d.b) bVar7.a(new h.g.b.m(com.waze.an.d.b.class), null, null);
                com.waze.shared_infra.i.e eVarD5 = com.waze.shared_infra.i.a.d("NotificationInsightsNativeManager");
                h.g.b.x.e(eVarD5, "create(...)");
                return new NotificationInsightsNativeManager(bVar8, eVarD5);
            case 18:
                int i20 = com.waze.install.g.f24774a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                com.waze.shared_infra.i.e eVarD6 = com.waze.shared_infra.i.a.d("WazeInstall");
                h.g.b.x.e(eVarD6, "create(...)");
                return new com.waze.install.aq(eVarD6);
            case 19:
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new bp();
            default:
                h.g.b.x.f((org.a.d.k.b) obj, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.location.a.x();
        }
    }
}
