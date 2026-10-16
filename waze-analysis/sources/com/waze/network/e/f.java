package com.waze.network.e;

import com.waze.ConfigManager;
import com.waze.NativeManager;
import com.waze.app_nav.w;
import com.waze.bl.b.c.q;
import com.waze.copilot.a.bq;
import com.waze.navigate.DriveToNativeManager;
import com.waze.perf.t;
import com.waze.perf.tracer.TraceNativeManager;
import com.waze.places.PlacesNativeManager;
import com.waze.planned_drive.PlannedDriveFragment;
import com.waze.planned_drive.PlannedDriveNativeManager;
import com.waze.planned_drive.bk;
import com.waze.planned_drive.ch;
import com.waze.planned_drive.s;
import com.waze.planned_drive.z;
import com.waze.shared_infra.r.y;
import h.g.a.p;
import h.g.b.ar;
import h.g.b.x;
import kotlinx.coroutines.av;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class f implements p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f32245a;

    public /* synthetic */ f(int i2) {
        this.f32245a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) throws org.a.d.d.c {
        switch (this.f32245a) {
            case 0:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                x.f(bVar, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new g(bVar);
            case 1:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                int i2 = t.f33065a;
                x.f(bVar2, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i3 = ar.f48106a;
                return ((com.waze.perf.tracer.h) bVar2.a(new h.g.b.m(com.waze.perf.tracer.h.class), null, null)).a();
            case 2:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                int i4 = t.f33065a;
                x.f(bVar3, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i5 = ar.f48106a;
                return new com.waze.perf.n((com.waze.sharedui.e.g) bVar3.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null));
            case 3:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i6 = t.f33065a;
                x.f(bVar4, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i7 = ar.f48106a;
                return new TraceNativeManager((com.waze.perf.tracer.h) bVar4.a(new h.g.b.m(com.waze.perf.tracer.h.class), null, null));
            case 4:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                x.f(bVar5, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i8 = ar.f48106a;
                return new com.waze.az.b((com.waze.coroutines.b) bVar5.a(new h.g.b.m(com.waze.coroutines.b.class), null, null), (com.waze.shared_infra.i.b) bVar5.a(new h.g.b.m(com.waze.shared_infra.i.b.class), null, null));
            case 5:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                x.f(bVar6, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i9 = ar.f48106a;
                com.waze.az.b bVar7 = (com.waze.az.b) bVar6.a(new h.g.b.m(com.waze.az.b.class), null, null);
                com.waze.settings.tree.b.f fVar = new com.waze.settings.tree.b.f();
                int i10 = av.f51370a;
                return new com.waze.by.b(bVar7, fVar, ac.f51860a);
            case 6:
                com.waze.planned_drive.p pVar = com.waze.planned_drive.p.f33350a;
                x.f((org.a.d.k.b) obj, "$this$scoped");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.planned_drive.a();
            case 7:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                com.waze.planned_drive.p pVar2 = com.waze.planned_drive.p.f33350a;
                x.f(bVar8, "$this$fragment");
                x.f((org.a.d.h.a) obj2, "it");
                int i11 = ar.f48106a;
                return new PlannedDriveFragment((z) bVar8.a(new h.g.b.m(z.class), null, null));
            case 8:
                com.waze.planned_drive.p pVar3 = com.waze.planned_drive.p.f33350a;
                x.f((org.a.d.k.b) obj, "$this$scoped");
                x.f((org.a.d.h.a) obj2, "it");
                return PlannedDriveNativeManager.getInstance();
            case 9:
                com.waze.planned_drive.p pVar4 = com.waze.planned_drive.p.f33350a;
                x.f((org.a.d.k.b) obj, "$this$scoped");
                x.f((org.a.d.h.a) obj2, "it");
                return PlacesNativeManager.INSTANCE;
            case 10:
                com.waze.planned_drive.p pVar5 = com.waze.planned_drive.p.f33350a;
                x.f((org.a.d.k.b) obj, "$this$scoped");
                x.f((org.a.d.h.a) obj2, "it");
                return NativeManager.getInstance();
            case 11:
                com.waze.planned_drive.p pVar6 = com.waze.planned_drive.p.f33350a;
                x.f((org.a.d.k.b) obj, "$this$scoped");
                x.f((org.a.d.h.a) obj2, "it");
                return ConfigManager.getInstance();
            case 12:
                com.waze.planned_drive.p pVar7 = com.waze.planned_drive.p.f33350a;
                x.f((org.a.d.k.b) obj, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.planned_drive.histogram.b();
            case 13:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                org.a.d.h.a aVar = (org.a.d.h.a) obj2;
                com.waze.planned_drive.p pVar8 = com.waze.planned_drive.p.f33350a;
                x.f(bVar9, "$this$viewModel");
                x.f(aVar, "parameters");
                int i12 = ar.f48106a;
                Object objA = aVar.a(new h.g.b.m(s.class));
                if (objA == null) {
                    throw new org.a.d.d.c("No value found for type '" + org.a.e.a.a(new h.g.b.m(s.class)) + "'");
                }
                s sVar = (s) objA;
                com.waze.navigate.j jVar = (com.waze.navigate.j) bVar9.a(new h.g.b.m(com.waze.navigate.j.class), null, null);
                PlannedDriveNativeManager plannedDriveNativeManager = (PlannedDriveNativeManager) bVar9.a(new h.g.b.m(PlannedDriveNativeManager.class), null, null);
                DriveToNativeManager driveToNativeManager = (DriveToNativeManager) bVar9.a(new h.g.b.m(DriveToNativeManager.class), null, null);
                com.waze.shared_infra.o.a aVar2 = (com.waze.shared_infra.o.a) bVar9.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                com.waze.shared_infra.q.e eVar = (com.waze.shared_infra.q.e) bVar9.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null);
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("PlannedDriveVM");
                x.e(eVarD, "create(...)");
                return new ch(sVar, jVar, plannedDriveNativeManager, driveToNativeManager, aVar2, eVar, eVarD, (bk) bVar9.a(new h.g.b.m(bk.class), null, null));
            case 14:
                org.a.d.k.b bVar10 = (org.a.d.k.b) obj;
                int i13 = com.waze.bh.a.f16750a;
                x.f(bVar10, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i14 = ar.f48106a;
                com.waze.sharedui.f.k kVar = (com.waze.sharedui.f.k) bVar10.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                com.waze.authentication.l lVar = (com.waze.authentication.l) bVar10.a(new h.g.b.m(com.waze.authentication.l.class), null, null);
                com.waze.network.a.a aVar3 = (com.waze.network.a.a) bVar10.a(new h.g.b.m(com.waze.network.a.a.class), null, null);
                com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("QrLoginClient");
                x.e(eVarD2, "create(...)");
                return new com.waze.bh.b.g(eVarD2, kVar, lVar, aVar3);
            case 15:
                org.a.d.k.b bVar11 = (org.a.d.k.b) obj;
                int i15 = com.waze.bh.a.f16750a;
                x.f(bVar11, "$this$viewModel");
                x.f((org.a.d.h.a) obj2, "it");
                int i16 = ar.f48106a;
                return new com.waze.bh.c.h((com.waze.bh.b.c) bVar11.a(new h.g.b.m(com.waze.bh.b.c.class), null, null), (w) bVar11.a(new h.g.b.m(w.class), null, null), (ConfigManager) bVar11.a(new h.g.b.m(ConfigManager.class), null, null), (com.waze.bh.f) bVar11.a(new h.g.b.m(com.waze.bh.f.class), null, null));
            case 16:
                org.a.d.k.b bVar12 = (org.a.d.k.b) obj;
                int i17 = com.waze.bh.a.f16750a;
                x.f(bVar12, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i18 = ar.f48106a;
                w wVar = (w) bVar12.a(new h.g.b.m(w.class), null, null);
                com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("QrLoginDeeplinkReceiver");
                x.e(eVarD3, "create(...)");
                return new com.waze.bh.a.a(wVar, eVarD3);
            case 17:
                org.a.d.k.b bVar13 = (org.a.d.k.b) obj;
                int i19 = com.waze.bi.e.f16810a;
                x.f(bVar13, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                int i20 = ar.f48106a;
                return new bq((com.waze.copilot.data.b.h) bVar13.a(new h.g.b.m(com.waze.copilot.data.b.h.class), null, null), (com.waze.shared_infra.q.e) bVar13.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null), (y) bVar13.a(new h.g.b.m(y.class), null, null), (ConfigManager) bVar13.a(new h.g.b.m(ConfigManager.class), null, null));
            case 18:
                org.a.d.k.b bVar14 = (org.a.d.k.b) obj;
                int i21 = com.waze.bi.e.f16810a;
                x.f(bVar14, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                org.a.d.i.a aVarE = com.waze.ch.a.a.f.e(com.waze.bi.k.f16818b);
                int i22 = ar.f48106a;
                return new com.waze.main_screen.e.a((com.waze.bi.j) bVar14.a(new h.g.b.m(com.waze.bi.j.class), aVarE, null), (com.waze.bi.j) bVar14.a(new h.g.b.m(com.waze.bi.j.class), com.waze.ch.a.a.f.e(com.waze.bi.k.f16817a), null), (com.waze.bi.g) bVar14.a(new h.g.b.m(com.waze.bi.g.class), null, null));
            case 19:
                org.a.d.k.b bVar15 = (org.a.d.k.b) obj;
                int i23 = com.waze.bj.a.f16826a;
                x.f(bVar15, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i24 = ar.f48106a;
                com.waze.sharedui.f.k kVar2 = (com.waze.sharedui.f.k) bVar15.a(new h.g.b.m(com.waze.sharedui.f.k.class), null, null);
                com.waze.shared_infra.i.e eVarD4 = com.waze.shared_infra.i.a.d("NotifyReferrerReceivedSender");
                x.e(eVarD4, "create(...)");
                return new com.waze.bj.a.d(kVar2, eVarD4);
            default:
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new q();
        }
    }
}
