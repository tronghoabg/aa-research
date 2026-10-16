package com.waze.main_screen;

import android.app.Application;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Modifier;
import com.waze.MoodManager;
import com.waze.NativeManager;
import com.waze.navigate.en;
import com.waze.realtime.RealtimeNativeManager;
import com.waze.sdk.bi;
import com.waze.search.h.bx;
import com.waze.sharedrive.e.bo;
import com.waze.sound.bs;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class y implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f27869a;

    public /* synthetic */ y(int i2) {
        this.f27869a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27869a) {
            case 0:
                ab abVar = (ab) obj2;
                h.g.b.x.f((SaverScope) obj, "$this$listSaver");
                h.g.b.x.f(abVar, "it");
                return h.a.i.d(Boolean.valueOf(abVar.f25619e));
            case 1:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                u uVar = u.f27645a;
                h.g.b.x.f(bVar, "$this$viewModel");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i2 = h.g.b.ar.f48106a;
                return new ax((Application) bVar.a(new h.g.b.m(Application.class), null, null), (NativeManager) bVar.a(new h.g.b.m(NativeManager.class), null, null), (RealtimeNativeManager) bVar.a(new h.g.b.m(RealtimeNativeManager.class), null, null), (com.waze.sharedui.profile.b) bVar.a(new h.g.b.m(com.waze.sharedui.profile.b.class), null, null), (MoodManager) bVar.a(new h.g.b.m(MoodManager.class), null, null), (com.waze.bi.g) bVar.a(new h.g.b.m(com.waze.bi.g.class), null, null), (com.waze.main_screen.o.k) bVar.a(new h.g.b.m(com.waze.main_screen.o.k.class), null, null), (com.waze.bi.j) bVar.a(new h.g.b.m(com.waze.bi.j.class), com.waze.ch.a.a.f.e(com.waze.bi.k.f16817a), null), (com.waze.bi.j) bVar.a(new h.g.b.m(com.waze.bi.j.class), com.waze.ch.a.a.f.e(com.waze.bi.k.f16818b), null), (b) bVar.a(new h.g.b.m(b.class), null, null), (i) bVar.a(new h.g.b.m(i.class), null, null), com.waze.settings.tree.c.f.g(bVar, "WazeMainMenuViewModel"));
            case 2:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                int i3 = com.waze.main_screen.a.a.f25527a;
                h.g.b.x.f(bVar2, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i4 = h.g.b.ar.f48106a;
                return new com.waze.main_screen.a.b.j((com.waze.search.stats.s) bVar2.a(new h.g.b.m(com.waze.search.stats.s.class), null, null));
            case 3:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                int i5 = com.waze.main_screen.a.a.f25527a;
                h.g.b.x.f(bVar3, "$this$viewModel");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i6 = h.g.b.ar.f48106a;
                com.waze.p pVar = (com.waze.p) bVar3.a(new h.g.b.m(com.waze.p.class), null, null);
                com.waze.ac acVar = (com.waze.ac) bVar3.a(new h.g.b.m(com.waze.ac.class), null, null);
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeAapMainScreenViewModel");
                h.g.b.x.e(eVarD, "create(...)");
                return new com.waze.main_screen.a.d(pVar, acVar, eVarD);
            case 4:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i7 = com.waze.main_screen.a.a.f25527a;
                h.g.b.x.f(bVar4, "$this$viewModel");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                com.waze.ab.z zVar = new com.waze.ab.z(8);
                int i8 = h.g.b.ar.f48106a;
                return new com.waze.main_screen.a.b.a.g((bx) bVar4.a(new h.g.b.m(bx.class), null, zVar), (com.waze.ui.j.j) bVar4.a(new h.g.b.m(com.waze.ui.j.j.class), null, null), (en) bVar4.a(new h.g.b.m(en.class), null, null), (com.waze.main_screen.a.b.j) bVar4.a(new h.g.b.m(com.waze.main_screen.a.b.j.class), null, null));
            case 5:
                org.a.d.k.b bVar5 = (org.a.d.k.b) obj;
                int i9 = com.waze.main_screen.a.a.a.f25529a;
                h.g.b.x.f(bVar5, "$this$viewModel");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i10 = h.g.b.ar.f48106a;
                com.waze.map.b.n nVar = (com.waze.map.b.n) bVar5.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
                en enVar = (en) bVar5.a(new h.g.b.m(en.class), null, null);
                com.waze.main_screen.ab.a.m mVar = (com.waze.main_screen.ab.a.m) bVar5.a(new h.g.b.m(com.waze.main_screen.ab.a.m.class), null, null);
                com.waze.main_screen.w.a.a aVar = (com.waze.main_screen.w.a.a) bVar5.a(new h.g.b.m(com.waze.main_screen.w.a.a.class), null, null);
                com.waze.main_screen.r.a.c cVar = (com.waze.main_screen.r.a.c) bVar5.a(new h.g.b.m(com.waze.main_screen.r.a.c.class), null, null);
                com.waze.main_screen.p.a.b.b.ac acVar2 = (com.waze.main_screen.p.a.b.b.ac) bVar5.a(new h.g.b.m(com.waze.main_screen.p.a.b.b.ac.class), null, null);
                com.waze.main_screen.p.b.a.b.c cVar2 = (com.waze.main_screen.p.b.a.b.c) bVar5.a(new h.g.b.m(com.waze.main_screen.p.b.a.b.c.class), null, null);
                com.waze.main_screen.l.b.e eVar = (com.waze.main_screen.l.b.e) bVar5.a(new h.g.b.m(com.waze.main_screen.l.b.e.class), null, null);
                bo boVar = (bo) bVar5.a(new h.g.b.m(bo.class), null, null);
                com.waze.reports_v2.c.an anVar = (com.waze.reports_v2.c.an) bVar5.a(new h.g.b.m(com.waze.reports_v2.c.an.class), null, null);
                com.waze.sound.e.k kVar = (com.waze.sound.e.k) bVar5.a(new h.g.b.m(com.waze.sound.e.k.class), null, null);
                com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("AapMidDriveViewModel");
                h.g.b.x.e(eVarD2, "create(...)");
                return new com.waze.main_screen.a.a.n(eVarD2, nVar, enVar, mVar, aVar, cVar, kVar, acVar2, cVar2, eVar, boVar, anVar);
            case 6:
                int i11 = com.waze.main_screen.b.a.f25867a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.main_screen.b.a.c();
            case 7:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                int i12 = com.waze.main_screen.b.a.f25867a;
                h.g.b.x.f(bVar6, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i13 = h.g.b.ar.f48106a;
                return new com.waze.main_screen.b.a.h((com.waze.main_screen.b.a.c) bVar6.a(new h.g.b.m(com.waze.main_screen.b.a.c.class), null, null), bVar6, (com.waze.main_screen.ab.a.m) bVar6.a(new h.g.b.m(com.waze.main_screen.ab.a.m.class), null, null));
            case 8:
                org.a.d.k.b bVar7 = (org.a.d.k.b) obj;
                int i14 = com.waze.main_screen.b.a.f25867a;
                h.g.b.x.f(bVar7, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i15 = h.g.b.ar.f48106a;
                return new com.waze.main_screen.b.a.m((com.waze.sdk.bd) bVar7.a(new h.g.b.m(com.waze.sdk.bd.class), null, null), (com.waze.ax.b) bVar7.a(new h.g.b.m(com.waze.ax.b.class), null, null), kotlinx.coroutines.av.b());
            case 9:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                int i16 = com.waze.main_screen.b.a.f25867a;
                h.g.b.x.f(bVar8, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.main_screen.b.a.a(bVar8);
            case 10:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                int i17 = com.waze.main_screen.b.a.f25867a;
                h.g.b.x.f(bVar9, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i18 = h.g.b.ar.f48106a;
                return ((com.waze.main_screen.b.a.a) bVar9.a(new h.g.b.m(com.waze.main_screen.b.a.a.class), null, null)).a();
            case 11:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i19 = iIntValue & 3;
                int i20 = iIntValue & 1;
                int i21 = com.waze.main_screen.bottom_bars.scrollable_eta.a.f25941a;
                if (composer.shouldExecute(i19 != 2, i20)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(973038802, iIntValue, -1, "com.waze.main_screen.bottom_bars.scrollable_eta.ComposableSingletons$EtaOfflineViewKt.lambda$973038802.<anonymous> (EtaOfflineView.kt:16)");
                    }
                    com.waze.ui.b.d.f(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 10.0f, 0.0f, 4.0f, 5, null), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 12:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i22 = iIntValue2 & 3;
                int i23 = iIntValue2 & 1;
                int i24 = com.waze.main_screen.bottom_bars.scrollable_eta.c.f25945a;
                if (composer2.shouldExecute(i22 != 2, i23)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-910117368, iIntValue2, -1, "com.waze.main_screen.bottom_bars.scrollable_eta.ComposableSingletons$LockedScreenViewKt.lambda$-910117368.<anonymous> (LockedScreenView.kt:16)");
                    }
                    com.waze.ui.n.e.e(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 10.0f, 0.0f, 4.0f, 5, null), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 13:
                org.a.d.k.b bVar10 = (org.a.d.k.b) obj;
                int i25 = com.waze.main_screen.c.c.f26156a;
                h.g.b.x.f(bVar10, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i26 = h.g.b.ar.f48106a;
                return new com.waze.main_screen.c.b((com.waze.main_screen.c.f.j) bVar10.a(new h.g.b.m(com.waze.main_screen.c.f.j.class), null, null), (com.waze.main_screen.b.a.c) bVar10.a(new h.g.b.m(com.waze.main_screen.b.a.c.class), null, null), (com.waze.main_screen.j.a.b) bVar10.a(new h.g.b.m(com.waze.main_screen.j.a.b.class), null, null), (com.waze.google_assistant.aa) bVar10.a(new h.g.b.m(com.waze.google_assistant.aa.class), null, null), (bi) bVar10.a(new h.g.b.m(bi.class), null, null), (com.waze.nav_connect.a) bVar10.a(new h.g.b.m(com.waze.nav_connect.a.class), null, null), (com.waze.nav_connect.a.f) bVar10.a(new h.g.b.m(com.waze.nav_connect.a.f.class), null, null), (com.waze.o.c.c.b) bVar10.a(new h.g.b.m(com.waze.o.c.c.b.class), null, null));
            case 14:
                org.a.d.k.b bVar11 = (org.a.d.k.b) obj;
                int i27 = com.waze.main_screen.c.c.f26156a;
                h.g.b.x.f(bVar11, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i28 = h.g.b.ar.f48106a;
                return new com.waze.main_screen.c.r((com.waze.main_screen.c.a) bVar11.a(new h.g.b.m(com.waze.main_screen.c.a.class), null, null), (com.waze.main_screen.b.a.d) bVar11.a(new h.g.b.m(com.waze.main_screen.b.a.d.class), null, null), (com.waze.main_screen.ae.a.a) bVar11.a(new h.g.b.m(com.waze.main_screen.ae.a.a.class), null, null), (com.waze.main_screen.j.a.g) bVar11.a(new h.g.b.m(com.waze.main_screen.j.a.g.class), null, null), (com.waze.main_screen.c.f.h) bVar11.a(new h.g.b.m(com.waze.main_screen.c.f.h.class), null, null), (com.waze.nav_connect.b.g) bVar11.a(new h.g.b.m(com.waze.nav_connect.b.g.class), null, null), (com.waze.nav_connect.b.b) bVar11.a(new h.g.b.m(com.waze.nav_connect.b.b.class), null, null), (com.waze.main_screen.c.e.h) bVar11.a(new h.g.b.m(com.waze.main_screen.c.e.h.class), null, null), (com.waze.o.d.b.a.b) bVar11.a(new h.g.b.m(com.waze.o.d.b.a.b.class), null, null), (com.waze.sdk.bd) bVar11.a(new h.g.b.m(com.waze.sdk.bd.class), null, null));
            case 15:
                org.a.d.k.b bVar12 = (org.a.d.k.b) obj;
                int i29 = com.waze.main_screen.c.c.f26156a;
                h.g.b.x.f(bVar12, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i30 = h.g.b.ar.f48106a;
                com.waze.sharedrive.d.a aVar2 = (com.waze.sharedrive.d.a) bVar12.a(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
                com.waze.sharedrive.e.au auVar = (com.waze.sharedrive.e.au) bVar12.a(new h.g.b.m(com.waze.sharedrive.e.au.class), null, null);
                com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("ButtonPackShareDriveButtonStateHolder");
                h.g.b.x.e(eVarD3, "create(...)");
                return new com.waze.main_screen.c.e.h(aVar2, auVar, eVarD3);
            case 16:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i31 = iIntValue3 & 3;
                int i32 = iIntValue3 & 1;
                int i33 = com.waze.main_screen.c.a.a.f26078a;
                if (composer3.shouldExecute(i31 != 2, i32)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(162574296, iIntValue3, -1, "com.waze.main_screen.button_pack.assistant_button.ComposableSingletons$GoogleAssistantButtonV1Kt.lambda$162574296.<anonymous> (GoogleAssistantButtonV1.kt:72)");
                    }
                    Object objRememberedValue = composer3.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new com.waze.ab.z(18);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    com.waze.main_screen.c.b.d.c((h.g.a.a) objRememberedValue, true, null, composer3, 54, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 17:
                int i34 = com.waze.main_screen.c.f.a.f26221a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.main_screen.c.f.j();
            case 18:
                org.a.d.k.b bVar13 = (org.a.d.k.b) obj;
                int i35 = com.waze.main_screen.c.f.a.f26221a;
                h.g.b.x.f(bVar13, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i36 = h.g.b.ar.f48106a;
                return new com.waze.main_screen.c.f.h((bs) bVar13.a(new h.g.b.m(bs.class), null, null), (com.waze.main_screen.c.f.j) bVar13.a(new h.g.b.m(com.waze.main_screen.c.f.j.class), null, null), (com.waze.main_screen.bottom_bars.scrollable_eta.q) bVar13.a(new h.g.b.m(com.waze.main_screen.bottom_bars.scrollable_eta.q.class), null, null));
            case 19:
                h.g.b.x.f((org.a.d.k.b) obj, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                return new com.waze.main_screen.d.a.b();
            default:
                org.a.d.k.b bVar14 = (org.a.d.k.b) obj;
                h.g.b.x.f(bVar14, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i37 = h.g.b.ar.f48106a;
                return new com.waze.main_screen.d.a.h((com.waze.main_screen.d.a.b) bVar14.a(new h.g.b.m(com.waze.main_screen.d.a.b.class), null, null), (com.waze.map.b.ai) bVar14.a(new h.g.b.m(com.waze.map.b.ai.class), null, null), (com.waze.map.f.f) bVar14.a(new h.g.b.m(com.waze.map.f.f.class), null, null));
        }
    }
}
