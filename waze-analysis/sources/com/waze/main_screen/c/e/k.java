package com.waze.main_screen.c.e;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.SavedStateHandle;
import com.waze.app_nav.w;
import com.waze.av.b.ah;
import com.waze.bv.r;
import com.waze.kd;
import com.waze.main_screen.t.aw;
import com.waze.main_screen.u.af;
import com.waze.main_screen.u.ag;
import com.waze.main_screen.u.ai;
import com.waze.main_screen.u.aj;
import com.waze.main_screen.u.n;
import com.waze.main_screen.v.o;
import com.waze.modules.navigation.bp;
import com.waze.navigate.cg;
import com.waze.navigate.cj;
import com.waze.navigate.dg;
import com.waze.navigate.en;
import com.waze.navigate.fq;
import com.waze.network.z;
import com.waze.reports_v2.presentation.bf;
import com.waze.resume_drive.ResumeDriveNativeManager;
import com.waze.shared_infra.r.y;
import com.waze.sharedrive.e.bw;
import com.waze.stats.ax;
import h.ab;
import h.g.a.p;
import h.g.b.ar;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class k implements p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f26216a;

    public /* synthetic */ k(int i2) {
        this.f26216a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26216a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = iIntValue & 3;
                int i3 = iIntValue & 1;
                int i4 = m.f26217a;
                if (composer.shouldExecute(i2 != 2, i3)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1627107081, iIntValue, -1, "com.waze.main_screen.button_pack.share_drive_button.ComposableSingletons$ButtonPackShareDriveButtonKt.lambda$1627107081.<anonymous> (ButtonPackShareDriveButton.kt:66)");
                    }
                    com.waze.main_screen.c.f.d.b(new l(), true, null, null, composer, 48, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return ab.f48028a;
            case 1:
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                com.waze.main_screen.p.b.a.b.l lVar = com.waze.main_screen.p.b.a.b.l.f27121a;
                return ab.f48028a;
            case 2:
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                return ab.f48028a;
            case 3:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                int i5 = com.waze.main_screen.r.a.f27407a;
                x.f(bVar, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i6 = ar.f48106a;
                return new com.waze.main_screen.r.a.g((kd) bVar.a(new h.g.b.m(kd.class), null, null));
            case 4:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                int i7 = com.waze.main_screen.s.b.f27422a;
                x.f(bVar2, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i8 = ar.f48106a;
                return new fq((cj) bVar2.a(new h.g.b.m(cj.class), null, null));
            case 5:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                int i9 = com.waze.main_screen.s.b.f27422a;
                x.f(bVar3, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i10 = ar.f48106a;
                return new com.waze.main_screen.s.g((cg) bVar3.a(new h.g.b.m(cg.class), null, null));
            case 6:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i11 = com.waze.main_screen.t.a.f27432a;
                x.f(bVar4, "$this$viewModel");
                x.f((org.a.d.h.a) obj2, "it");
                int i12 = ar.f48106a;
                SavedStateHandle savedStateHandle = (SavedStateHandle) bVar4.a(new h.g.b.m(SavedStateHandle.class), null, null);
                en enVar = (en) bVar4.a(new h.g.b.m(en.class), null, null);
                com.waze.main_screen.q.b.g gVar = (com.waze.main_screen.q.b.g) bVar4.a(new h.g.b.m(com.waze.main_screen.q.b.g.class), null, null);
                com.waze.reports_v2.presentation.k kVar = new com.waze.reports_v2.presentation.k();
                r rVar = (r) bVar4.a(new h.g.b.m(r.class), null, null);
                com.waze.notifications.b.e eVar = (com.waze.notifications.b.e) bVar4.a(new h.g.b.m(com.waze.notifications.b.e.class), null, null);
                com.waze.main_screen.ab.a.m mVar = (com.waze.main_screen.ab.a.m) bVar4.a(new h.g.b.m(com.waze.main_screen.ab.a.m.class), null, null);
                com.waze.main_screen.d.a.c cVar = (com.waze.main_screen.d.a.c) bVar4.a(new h.g.b.m(com.waze.main_screen.d.a.c.class), null, null);
                com.waze.main_screen.b.a.d dVar = (com.waze.main_screen.b.a.d) bVar4.a(new h.g.b.m(com.waze.main_screen.b.a.d.class), null, null);
                com.waze.main_screen.ag.a.d dVar2 = (com.waze.main_screen.ag.a.d) bVar4.a(new h.g.b.m(com.waze.main_screen.ag.a.d.class), null, null);
                com.waze.main_screen.ae.a.a aVar = (com.waze.main_screen.ae.a.a) bVar4.a(new h.g.b.m(com.waze.main_screen.ae.a.a.class), null, null);
                com.waze.main_screen.c.a aVar2 = (com.waze.main_screen.c.a) bVar4.a(new h.g.b.m(com.waze.main_screen.c.a.class), null, null);
                com.waze.main_screen.af.b.i iVar = (com.waze.main_screen.af.b.i) bVar4.a(new h.g.b.m(com.waze.main_screen.af.b.i.class), null, null);
                com.waze.reports_v2.presentation.a.l lVar2 = (com.waze.reports_v2.presentation.a.l) bVar4.a(new h.g.b.m(com.waze.reports_v2.presentation.a.l.class), null, null);
                bf bfVar = (bf) bVar4.a(new h.g.b.m(bf.class), null, null);
                com.waze.main_screen.w.a.a aVar3 = (com.waze.main_screen.w.a.a) bVar4.a(new h.g.b.m(com.waze.main_screen.w.a.a.class), null, null);
                com.waze.bw.c.c.x xVar = (com.waze.bw.c.c.x) bVar4.a(new h.g.b.m(com.waze.bw.c.c.x.class), null, null);
                com.waze.ui.j.j jVar = (com.waze.ui.j.j) bVar4.a(new h.g.b.m(com.waze.ui.j.j.class), null, null);
                o oVar = (o) bVar4.a(new h.g.b.m(o.class), null, null);
                com.waze.main_screen.u.o oVar2 = (com.waze.main_screen.u.o) bVar4.a(new h.g.b.m(com.waze.main_screen.u.o.class), null, null);
                com.waze.main_screen.h.a.a aVar4 = (com.waze.main_screen.h.a.a) bVar4.a(new h.g.b.m(com.waze.main_screen.h.a.a.class), null, null);
                com.waze.main_screen.r.a.c cVar2 = (com.waze.main_screen.r.a.c) bVar4.a(new h.g.b.m(com.waze.main_screen.r.a.c.class), null, null);
                com.waze.view.popups.b.m mVar2 = (com.waze.view.popups.b.m) bVar4.a(new h.g.b.m(com.waze.view.popups.b.m.class), null, null);
                com.waze.main_screen.j.i iVar2 = (com.waze.main_screen.j.i) bVar4.a(new h.g.b.m(com.waze.main_screen.j.i.class), null, null);
                bw bwVar = (bw) bVar4.a(new h.g.b.m(bw.class), null, null);
                com.waze.ao.b.a aVar5 = (com.waze.ao.b.a) bVar4.a(new h.g.b.m(com.waze.ao.b.a.class), null, null);
                com.waze.tide.a.a aVar6 = (com.waze.tide.a.a) bVar4.a(new h.g.b.m(com.waze.tide.a.a.class), null, null);
                com.waze.sound.e.k kVar2 = (com.waze.sound.e.k) bVar4.a(new h.g.b.m(com.waze.sound.e.k.class), null, null);
                com.waze.br.c.e eVar2 = (com.waze.br.c.e) bVar4.a(new h.g.b.m(com.waze.br.c.e.class), null, null);
                com.waze.br.b.p pVar = (com.waze.br.b.p) bVar4.a(new h.g.b.m(com.waze.br.b.p.class), null, null);
                bp bpVar = (bp) bVar4.a(new h.g.b.m(bp.class), null, null);
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("PreDriveViewModel");
                x.e(eVarD, "create(...)");
                return new aw(savedStateHandle, enVar, eVarD, rVar, cVar, gVar, eVar, dVar, dVar2, lVar2, aVar, aVar2, kVar, jVar, oVar, aVar3, xVar, oVar2, mVar, iVar, bfVar, aVar4, cVar2, iVar2, mVar2, bwVar, aVar5, aVar6, kVar2, eVar2, bpVar, pVar);
            case 7:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                int i13 = com.waze.main_screen.t.a.f27432a;
                x.f(bVar5, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i14 = ar.f48106a;
                return new com.waze.main_screen.t.a.a.f((com.waze.main_screen.e.a) bVar5.a(new h.g.b.m(com.waze.main_screen.e.a.class), null, null), (com.waze.bi.g) bVar5.a(new h.g.b.m(com.waze.bi.g.class), null, null), (w) bVar5.a(new h.g.b.m(w.class), null, null), (com.waze.main_screen.i) bVar5.a(new h.g.b.m(com.waze.main_screen.i.class), null, null));
            case 8:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                int i15 = com.waze.main_screen.u.j.f27713a;
                x.f(bVar6, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i16 = ar.f48106a;
                return new com.waze.main_screen.u.b.d((w) bVar6.a(new h.g.b.m(w.class), null, null), (com.waze.shared_infra.o.a) bVar6.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
            case 9:
                org.a.d.k.b bVar7 = (org.a.d.k.b) obj;
                int i17 = com.waze.main_screen.u.j.f27713a;
                x.f(bVar7, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i18 = ar.f48106a;
                return new com.waze.main_screen.u.w((com.waze.main_screen.u.k) bVar7.a(new h.g.b.m(com.waze.main_screen.u.k.class), null, null), (aj) bVar7.a(new h.g.b.m(aj.class), null, null), (com.waze.bn.b) bVar7.a(new h.g.b.m(com.waze.bn.b.class), null, null), (com.waze.bw.b.a.k) bVar7.a(new h.g.b.m(com.waze.bw.b.a.k.class), null, null), (com.waze.shared_infra.q.j) bVar7.a(new h.g.b.m(com.waze.shared_infra.q.j.class), null, null), (com.waze.shared_infra.i.e) bVar7.a(new h.g.b.m(com.waze.shared_infra.i.e.class), com.waze.ch.a.a.f.f("PredictionCardStateHolder"), null), (bp) bVar7.a(new h.g.b.m(bp.class), null, null), (af) bVar7.a(new h.g.b.m(af.class), null, null), (n) bVar7.a(new h.g.b.m(n.class), null, null), (w) bVar7.a(new h.g.b.m(w.class), null, null), (dg) bVar7.a(new h.g.b.m(dg.class), null, null), (com.waze.main_screen.u.c) bVar7.a(new h.g.b.m(com.waze.main_screen.u.c.class), null, null), (y) bVar7.a(new h.g.b.m(y.class), null, null), (z) bVar7.a(new h.g.b.m(z.class), null, null), (com.waze.shared_infra.o.a) bVar7.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null));
            case 10:
                int i19 = com.waze.main_screen.u.j.f27713a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return new n();
            case 11:
                int i20 = com.waze.main_screen.u.j.f27713a;
                x.f((org.a.d.k.b) obj, "$this$single");
                x.f((org.a.d.h.a) obj2, "it");
                return ai.f27681a;
            case 12:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                int i21 = com.waze.main_screen.u.j.f27713a;
                x.f(bVar8, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i22 = ar.f48106a;
                return new ag((ax) bVar8.a(new h.g.b.m(ax.class), null, null));
            case 13:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                int i23 = com.waze.main_screen.u.j.f27713a;
                x.f(bVar9, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i24 = ar.f48106a;
                return ((com.waze.shared_infra.i.g) bVar9.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("PredictionCardStateHolder"));
            case 14:
                org.a.d.k.b bVar10 = (org.a.d.k.b) obj;
                int i25 = com.waze.main_screen.u.j.f27713a;
                x.f(bVar10, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i26 = ar.f48106a;
                return new com.waze.bd.a.f((com.waze.sharedui.f.f) bVar10.a(new h.g.b.m(com.waze.sharedui.f.f.class), null, null));
            case 15:
                int i27 = com.waze.main_screen.u.j.f27713a;
                x.f((org.a.d.k.b) obj, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                return ResumeDriveNativeManager.Companion.a();
            case 16:
                org.a.d.k.b bVar11 = (org.a.d.k.b) obj;
                int i28 = com.waze.main_screen.u.j.f27713a;
                x.f(bVar11, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i29 = ar.f48106a;
                return new aj((ResumeDriveNativeManager) bVar11.a(new h.g.b.m(ResumeDriveNativeManager.class), null, null));
            case 17:
                org.a.d.k.b bVar12 = (org.a.d.k.b) obj;
                int i30 = com.waze.main_screen.u.j.f27713a;
                x.f(bVar12, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i31 = ar.f48106a;
                return ((com.waze.shared_infra.i.g) bVar12.a(new h.g.b.m(com.waze.shared_infra.i.g.class), null, null)).a(new com.waze.shared_infra.i.c("GetPredictionDataAutoUseCase"));
            case 18:
                org.a.d.k.b bVar13 = (org.a.d.k.b) obj;
                int i32 = com.waze.main_screen.u.j.f27713a;
                x.f(bVar13, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                com.waze.main_screen.c.g.a aVar7 = new com.waze.main_screen.c.g.a(14);
                int i33 = ar.f48106a;
                return new com.waze.main_screen.u.k((com.waze.location.b.d) bVar13.a(new h.g.b.m(com.waze.location.b.d.class), null, aVar7));
            case 19:
                int i34 = com.waze.main_screen.u.j.f27713a;
                x.f((org.a.d.k.b) obj, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.main_screen.u.d();
            default:
                org.a.d.k.b bVar14 = (org.a.d.k.b) obj;
                int i35 = com.waze.main_screen.u.j.f27713a;
                x.f(bVar14, "$this$factory");
                x.f((org.a.d.h.a) obj2, "it");
                int i36 = ar.f48106a;
                return new com.waze.main_screen.u.h((com.waze.bd.a.d) bVar14.a(new h.g.b.m(com.waze.bd.a.d.class), null, null), (com.waze.location.b.d) bVar14.a(new h.g.b.m(com.waze.main_screen.u.k.class), null, null), (ah) bVar14.a(new h.g.b.m(ah.class), null, null), (aj) bVar14.a(new h.g.b.m(aj.class), null, null), (y) bVar14.a(new h.g.b.m(y.class), null, null), (z) bVar14.a(new h.g.b.m(z.class), null, null), (com.waze.main_screen.u.d) bVar14.a(new h.g.b.m(com.waze.main_screen.u.d.class), null, null), (com.waze.shared_infra.i.e) bVar14.a(new h.g.b.m(com.waze.shared_infra.i.e.class), com.waze.ch.a.a.f.f("GetPredictionDataAutoUseCase"), null), (af) bVar14.a(new h.g.b.m(af.class), null, null), (com.waze.main_screen.u.ah) bVar14.a(new h.g.b.m(com.waze.main_screen.u.ah.class), null, null));
        }
    }
}
