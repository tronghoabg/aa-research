package com.waze.o.a;

import com.waze.av.b.ah;
import com.waze.modules.b.h;
import com.waze.modules.c.ch;
import com.waze.modules.navigation.ag;
import com.waze.n.aq;
import com.waze.navigate.cj;
import com.waze.navigate.db;
import com.waze.navigate.eo;
import com.waze.o.ac;
import com.waze.o.ad;
import com.waze.o.aw;
import com.waze.o.b.a.f;
import com.waze.o.b.b.a.g;
import com.waze.o.b.b.a.i;
import com.waze.o.b.b.a.j;
import com.waze.o.c.c.a.n;
import com.waze.o.d.b.b.d;
import com.waze.reports.WazeReportNativeManager;
import com.waze.reports_v2.c.ds;
import com.waze.search.bd;
import com.waze.shared_infra.i.e;
import com.waze.shared_infra.r.y;
import com.waze.sound.bs;
import com.waze.t.a.k;
import com.waze.t.a.o;
import com.waze.t.b.as;
import com.waze.t.b.bl;
import com.waze.t.b.bn;
import com.waze.t.b.ca;
import com.waze.t.c.l;
import e.a.h.s;
import h.g.a.p;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import java.util.Iterator;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f32623a;

    public /* synthetic */ a(int i2) {
        this.f32623a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32623a) {
            case 0:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                int i2 = c.f32624a;
                x.f(bVar, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i3 = ar.f48106a;
                return new com.waze.o.d.b.a.c((com.waze.o.c.c.c) bVar.a(new m(com.waze.o.c.c.c.class), null, null), (l) bVar.a(new m(l.class), null, null));
            case 1:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                int i4 = com.waze.closure.b.a.f22450a;
                x.f(bVar2, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i5 = ar.f48106a;
                return new com.waze.closure.domain.b((WazeReportNativeManager) bVar2.a(new m(WazeReportNativeManager.class), null, null));
            case 2:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                int i6 = c.f32624a;
                x.f(bVar3, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                e eVarD = com.waze.shared_infra.i.a.d("CompaninioOverlayStateHolder");
                x.e(eVarD, "create(...)");
                int i7 = ar.f48106a;
                return new d(eVarD, (com.waze.o.c.c.c) bVar3.a(new m(com.waze.o.c.c.c.class), null, null), (l) bVar3.a(new m(l.class), null, null));
            case 3:
                int i8 = c.f32624a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.o.b.b.d();
            case 4:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i9 = c.f32624a;
                x.f(bVar4, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i10 = ar.f48106a;
                return ad.h(((h) bVar4.a(new m(h.class), null, null)).b());
            case 5:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                int i11 = c.f32624a;
                x.f(bVar5, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i12 = ar.f48106a;
                ac acVar = (ac) bVar5.a(new m(ac.class), null, null);
                e eVarD2 = com.waze.shared_infra.i.a.d("CompaninioGrpcApi");
                x.e(eVarD2, "create(...)");
                return new f(acVar, eVarD2);
            case 6:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                int i13 = c.f32624a;
                x.f(bVar6, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                e eVarD3 = com.waze.shared_infra.i.a.d("GetWazeAddressByVenueIdUseCase");
                x.e(eVarD3, "create(...)");
                int i14 = ar.f48106a;
                return new i(eVarD3, (bd) bVar6.a(new m(bd.class), null, null));
            case 7:
                org.a.d.k.b bVar7 = (org.a.d.k.b) obj;
                int i15 = c.f32624a;
                x.f(bVar7, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                e eVarD4 = com.waze.shared_infra.i.a.d("AddFavoriteUseCaseImpl");
                x.e(eVarD4, "create(...)");
                int i16 = ar.f48106a;
                return new com.waze.o.b.b.a.b(eVarD4, (ah) bVar7.a(new m(ah.class), null, null), (n) bVar7.a(new m(n.class), null, null), (com.waze.shared_infra.o.a) bVar7.a(new m(com.waze.shared_infra.o.a.class), null, null));
            case 8:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                int i17 = c.f32624a;
                x.f(bVar8, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                e eVarD5 = com.waze.shared_infra.i.a.d("DeleteFavoriteByVenueIdUseCaseImpl");
                x.e(eVarD5, "create(...)");
                int i18 = ar.f48106a;
                return new g(eVarD5, (ah) bVar8.a(new m(ah.class), null, null));
            case 9:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                int i19 = c.f32624a;
                x.f(bVar9, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i20 = ar.f48106a;
                return new j((ag) bVar9.a(new m(ag.class), null, null));
            case 10:
                org.a.d.k.b bVar10 = (org.a.d.k.b) obj;
                int i21 = c.f32624a;
                x.f(bVar10, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                e eVarD6 = com.waze.shared_infra.i.a.d("CompaninioActionHandlerImpl");
                x.e(eVarD6, "create(...)");
                int i22 = ar.f48106a;
                return new com.waze.o.b.b.a(eVarD6, (bs) bVar10.a(new m(bs.class), null, null), (com.waze.shared_infra.i.i) bVar10.a(new m(com.waze.shared_infra.i.i.class), null, null), (com.waze.o.c.c.a.e) bVar10.a(new m(com.waze.o.c.c.a.e.class), null, null), (db) bVar10.a(new m(db.class), null, null), (com.waze.o.c.c.a.d) bVar10.a(new m(com.waze.o.c.c.a.d.class), null, null), (com.waze.o.c.c.a.i) bVar10.a(new m(com.waze.o.c.c.a.i.class), null, null), (com.waze.o.c.c.a.p) bVar10.a(new m(com.waze.o.c.c.a.p.class), null, null), (com.waze.bl.c.a) bVar10.a(new m(com.waze.bl.c.a.class), null, null));
            case 11:
                org.a.d.k.b bVar11 = (org.a.d.k.b) obj;
                int i23 = c.f32624a;
                x.f(bVar11, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                e eVarD7 = com.waze.shared_infra.i.a.d("CalculateRouteByVenueIdUseCase");
                x.e(eVarD7, "create(...)");
                int i24 = ar.f48106a;
                return new com.waze.o.b.b.a.e(eVarD7, (ch) bVar11.a(new m(ch.class), null, null), (com.waze.sharedui.e.g) bVar11.a(new m(com.waze.sharedui.e.g.class), null, null), (bd) bVar11.a(new m(bd.class), null, null));
            case 12:
                org.a.d.k.b bVar12 = (org.a.d.k.b) obj;
                int i25 = c.f32624a;
                x.f(bVar12, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i26 = ar.f48106a;
                return new com.waze.o.b.a.e((com.waze.o.c.a.b) bVar12.a(new m(com.waze.o.c.a.b.class), null, null), (com.waze.t.a.m) bVar12.a(new m(com.waze.t.a.m.class), null, null), (o) bVar12.a(new m(o.class), null, null), (k) bVar12.a(new m(k.class), null, null), (com.waze.t.a.n) bVar12.a(new m(com.waze.t.a.n.class), null, null), (com.waze.t.a.l) bVar12.a(new m(com.waze.t.a.l.class), null, null), (com.waze.aw.a) bVar12.a(new m(com.waze.aw.a.class), null, null), (ah) bVar12.a(new m(ah.class), null, null), (eo) bVar12.a(new m(eo.class), null, null), (cj) bVar12.a(new m(cj.class), null, null), av.b());
            case 13:
                org.a.d.k.b bVar13 = (org.a.d.k.b) obj;
                int i27 = c.f32624a;
                x.f(bVar13, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                e eVarD8 = com.waze.shared_infra.i.a.d("CompaninioController");
                x.e(eVarD8, "create(...)");
                int i28 = ar.f48106a;
                com.waze.shared_infra.i.b bVar14 = (com.waze.shared_infra.i.b) bVar13.a(new m(com.waze.shared_infra.i.b.class), null, null);
                com.waze.o.c.a.a aVar = (com.waze.o.c.a.a) bVar13.a(new m(com.waze.o.c.a.a.class), null, null);
                com.waze.o.c.c.a aVar2 = (com.waze.o.c.c.a) bVar13.a(new m(com.waze.o.c.c.a.class), null, null);
                com.waze.h.a aVar3 = (com.waze.h.a) bVar13.a(new m(com.waze.h.a.class), null, null);
                com.waze.t.b.b bVar15 = (com.waze.t.b.b) bVar13.a(new m(com.waze.t.b.b.class), null, null);
                com.waze.h.a.j jVar = (com.waze.h.a.j) bVar13.a(new m(com.waze.h.a.j.class), null, null);
                com.waze.h.a.a aVar4 = (com.waze.h.a.a) bVar13.a(new m(com.waze.h.a.a.class), null, null);
                ca caVar = (ca) bVar13.a(new m(ca.class), null, null);
                com.waze.o.c.c.b bVar16 = (com.waze.o.c.c.b) bVar13.a(new m(com.waze.o.c.c.b.class), null, null);
                bn bnVarF = aq.f(bVar13, bl.f40743b);
                as asVarM = ad.m(bVar13);
                com.waze.t.b.aq aqVar = (com.waze.t.b.aq) bVar13.a(new m(com.waze.t.b.aq.class), null, null);
                com.waze.t.c.f fVar = (com.waze.t.c.f) bVar13.a(new m(com.waze.t.c.f.class), null, null);
                int i29 = av.f51370a;
                return new com.waze.o.b.b.l(kotlinx.coroutines.e.ac.f51860a, eVarD8, bVar14, aVar, aVar2, aVar3, bVar15, jVar, aVar4, caVar, bVar16, bnVarF, asVarM, aqVar, fVar);
            case 14:
                int i30 = c.f32624a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                e eVarD9 = com.waze.shared_infra.i.a.d("ConversationPermissionStateHolderImpl");
                x.e(eVarD9, "create(...)");
                return new com.waze.t.c.m(eVarD9);
            case 15:
                org.a.d.k.b bVar17 = (org.a.d.k.b) obj;
                int i31 = c.f32624a;
                x.f(bVar17, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i32 = ar.f48106a;
                ds dsVar = (ds) bVar17.a(new m(ds.class), null, null);
                com.waze.o.c.c.b bVar18 = (com.waze.o.c.c.b) bVar17.a(new m(com.waze.o.c.c.b.class), null, null);
                e eVarD10 = com.waze.shared_infra.i.a.d("CompaninioReportLocationSnapper");
                x.e(eVarD10, "create(...)");
                return new com.waze.o.b.b.o(dsVar, bVar18, eVarD10);
            case 16:
                org.a.d.k.b bVar19 = (org.a.d.k.b) obj;
                int i33 = c.f32624a;
                x.f(bVar19, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                e eVarD11 = com.waze.shared_infra.i.a.d("CompaninioController");
                x.e(eVarD11, "create(...)");
                int i34 = av.f51370a;
                kotlinx.coroutines.cj cjVar = kotlinx.coroutines.e.ac.f51860a;
                int i35 = ar.f48106a;
                return new com.waze.o.b.b.f(cjVar, eVarD11, (com.waze.o.c.c.d) bVar19.a(new m(com.waze.o.c.c.d.class), null, null), (com.waze.shared_infra.m.a) bVar19.a(new m(com.waze.shared_infra.m.a.class), null, null), (com.waze.o.b.b.m) bVar19.a(new m(com.waze.o.b.b.m.class), null, null), (com.waze.reports_v2.b.aq) bVar19.a(new m(com.waze.reports_v2.b.aq.class), null, null), (com.waze.o.c.c.b) bVar19.a(new m(com.waze.o.c.c.b.class), null, null));
            case 17:
                ac acVar2 = (ac) obj;
                aw awVar = (aw) obj2;
                x.f(acVar2, "stub");
                x.f(awVar, "request");
                Iterator itD = s.d(acVar2.getChannel(), ad.j(), acVar2.getCallOptions(), awVar);
                x.e(itD, "startChat(...)");
                return itD;
            case 18:
                ac acVar3 = (ac) obj;
                com.waze.o.x xVar = (com.waze.o.x) obj2;
                x.f(acVar3, "stub");
                x.f(xVar, "request");
                Iterator itD2 = s.d(acVar3.getChannel(), ad.i(), acVar3.getCallOptions(), xVar);
                x.e(itD2, "chat(...)");
                return itD2;
            case 19:
                org.a.d.k.b bVar20 = (org.a.d.k.b) obj;
                int i36 = com.waze.q.c.f33455a;
                x.f(bVar20, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i37 = ar.f48106a;
                com.waze.q.a aVar5 = (com.waze.q.a) bVar20.a(new m(com.waze.q.a.class), null, null);
                com.waze.shared_infra.o.a aVar6 = (com.waze.shared_infra.o.a) bVar20.a(new m(com.waze.shared_infra.o.a.class), null, null);
                com.waze.sharedui.b.d dVar = (com.waze.sharedui.b.d) bVar20.a(new m(com.waze.sharedui.b.d.class), null, null);
                y yVar = (y) bVar20.a(new m(y.class), null, null);
                com.waze.install.x xVar2 = (com.waze.install.x) bVar20.a(new m(com.waze.install.x.class), null, null);
                e eVarD12 = com.waze.shared_infra.i.a.d("ConsentBumpRepositoryImpl");
                x.e(eVarD12, "create(...)");
                return new com.waze.q.e(aVar5, aVar6, dVar, xVar2, yVar, eVarD12, av.a());
            default:
                org.a.d.k.b bVar21 = (org.a.d.k.b) obj;
                int i38 = com.waze.q.c.f33455a;
                x.f(bVar21, "$this$viewModel");
                x.f((org.a.d.h.a) obj2, "it");
                int i39 = ar.f48106a;
                return new com.waze.q.l((com.waze.shared_infra.o.a) bVar21.a(new m(com.waze.shared_infra.o.a.class), null, null), (com.waze.al.a.a) bVar21.a(new m(com.waze.al.a.a.class), null, null));
        }
    }
}
