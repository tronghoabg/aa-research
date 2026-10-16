package com.waze.bw.c.d;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.waze.lx;
import com.waze.mg;
import com.waze.modules.c.dx;
import com.waze.navigate.eo;
import com.waze.settings.eb;
import com.waze.strings.DisplayStrings;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class d implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f18080a;

    public /* synthetic */ d(int i2) {
        this.f18080a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        switch (this.f18080a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                org.a.d.k.b bVar = (org.a.d.k.b) obj;
                int i2 = com.waze.tide.r.f40957a;
                h.g.b.x.f(bVar, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i3 = h.g.b.ar.f48106a;
                break;
            case 3:
                org.a.d.k.b bVar2 = (org.a.d.k.b) obj;
                int i4 = com.waze.tide.r.f40957a;
                h.g.b.x.f(bVar2, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i5 = h.g.b.ar.f48106a;
                com.waze.tide.g gVar = (com.waze.tide.g) bVar2.a(new h.g.b.m(com.waze.tide.g.class), null, null);
                eo eoVar = (eo) bVar2.a(new h.g.b.m(eo.class), null, null);
                com.waze.ac acVar = (com.waze.ac) bVar2.a(new h.g.b.m(com.waze.ac.class), null, null);
                com.waze.tide.f fVar = (com.waze.tide.f) bVar2.a(new h.g.b.m(com.waze.tide.f.class), null, null);
                com.waze.tide.x xVar = (com.waze.tide.x) bVar2.a(new h.g.b.m(com.waze.tide.x.class), null, null);
                com.waze.shared_infra.q.e eVar = (com.waze.shared_infra.q.e) bVar2.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null);
                com.waze.tide.t tVar = (com.waze.tide.t) bVar2.a(new h.g.b.m(com.waze.tide.t.class), null, null);
                lx lxVar = mg.f29780a;
                Context contextA = lxVar.a();
                com.waze.tide.s sVar = (com.waze.tide.s) bVar2.a(new h.g.b.m(com.waze.tide.s.class), null, null);
                SharedPreferences sharedPreferencesA = com.waze.be.b.f16231a.a(lxVar.a());
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("TideController");
                h.g.b.x.e(eVarD, "create(...)");
                break;
            case 4:
                org.a.d.k.b bVar3 = (org.a.d.k.b) obj;
                int i6 = com.waze.tide.r.f40957a;
                h.g.b.x.f(bVar3, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i7 = h.g.b.ar.f48106a;
                break;
            case 5:
                int i8 = com.waze.trip_overview.c.g.f41283a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                break;
            case 6:
                org.a.d.k.b bVar4 = (org.a.d.k.b) obj;
                int i9 = com.waze.trip_overview.c.g.f41283a;
                h.g.b.x.f(bVar4, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i10 = h.g.b.ar.f48106a;
                com.waze.modules.c.ch chVar = (com.waze.modules.c.ch) bVar4.a(new h.g.b.m(com.waze.modules.c.ch.class), null, null);
                com.waze.sharedui.f.k kVarE = com.waze.shared_infra.l.b.e();
                com.waze.sharedui.e.g gVar2 = (com.waze.sharedui.e.g) bVar4.a(new h.g.b.m(com.waze.sharedui.e.g.class), null, null);
                com.waze.bn.b bVar5 = (com.waze.bn.b) bVar4.a(new h.g.b.m(com.waze.bn.b.class), null, null);
                com.waze.shared_infra.o.a aVar = (com.waze.shared_infra.o.a) bVar4.a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
                com.waze.map.c.d dVar = (com.waze.map.c.d) bVar4.a(new h.g.b.m(com.waze.map.c.d.class), null, null);
                com.waze.trip_overview.bl blVar = (com.waze.trip_overview.bl) bVar4.a(new h.g.b.m(com.waze.trip_overview.bl.class), null, null);
                eb ebVar = (eb) bVar4.a(new h.g.b.m(eb.class), null, null);
                kotlinx.coroutines.af afVarB = ((com.waze.coroutines.i) bVar4.a(new h.g.b.m(com.waze.coroutines.i.class), null, null)).b();
                com.waze.bo.a.c cVar = (com.waze.bo.a.c) bVar4.a(new h.g.b.m(com.waze.bo.a.c.class), null, null);
                com.waze.trip_overview.z zVar = (com.waze.trip_overview.z) bVar4.a(new h.g.b.m(com.waze.trip_overview.z.class), null, null);
                com.waze.shared_infra.q.e eVar2 = (com.waze.shared_infra.q.e) bVar4.a(new h.g.b.m(com.waze.shared_infra.q.e.class), null, null);
                com.waze.trip_overview.a.d dVar2 = (com.waze.trip_overview.a.d) bVar4.a(new h.g.b.m(com.waze.trip_overview.a.d.class), null, null);
                com.waze.modules.navigation.af afVar = (com.waze.modules.navigation.af) bVar4.a(new h.g.b.m(com.waze.modules.navigation.af.class), null, null);
                dx dxVar = (dx) bVar4.a(new h.g.b.m(dx.class), null, null);
                com.waze.shared_infra.i.e eVarD2 = com.waze.shared_infra.i.a.d("TripOverviewRoutesController");
                h.g.b.x.e(eVarD2, "create(...)");
                break;
            case 7:
                int i11 = com.waze.trip_overview.c.g.f41283a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                break;
            case 8:
                org.a.d.k.b bVar6 = (org.a.d.k.b) obj;
                int i12 = com.waze.trip_overview.c.g.f41283a;
                h.g.b.x.f(bVar6, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i13 = h.g.b.ar.f48106a;
                com.waze.trip_overview.a.a aVar2 = (com.waze.trip_overview.a.a) bVar6.a(new h.g.b.m(com.waze.trip_overview.a.a.class), null, null);
                com.waze.map.c.d dVar3 = (com.waze.map.c.d) bVar6.a(new h.g.b.m(com.waze.map.c.d.class), null, null);
                com.waze.shared_infra.i.e eVarD3 = com.waze.shared_infra.i.a.d("GetVisualImpactMapDataUseCaseImpl");
                h.g.b.x.e(eVarD3, "create(...)");
                break;
            case 9:
                int i14 = com.waze.trip_overview.c.g.f41283a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$factory");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                break;
            case 10:
                int i15 = com.waze.trip_overview.c.g.f41283a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$fragment");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                break;
            case 11:
                org.a.d.k.b bVar7 = (org.a.d.k.b) obj;
                int i16 = com.waze.trip_overview.c.g.f41283a;
                h.g.b.x.f(bVar7, "$this$scoped");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i17 = h.g.b.ar.f48106a;
                break;
            case 12:
                int i18 = com.waze.trip_overview.c.g.f41283a;
                h.g.b.x.f((org.a.d.k.b) obj, "$this$scoped");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                break;
            case 13:
                org.a.d.k.b bVar8 = (org.a.d.k.b) obj;
                int i19 = com.waze.trip_overview.c.g.f41283a;
                h.g.b.x.f(bVar8, "$this$viewModel");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i20 = h.g.b.ar.f48106a;
                break;
            case 14:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i21 = iIntValue & 1;
                boolean z = (iIntValue & 3) != 2;
                int i22 = com.waze.trip_overview.views.b.f41502a;
                if (composer.shouldExecute(z, i21)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2034891419, iIntValue, -1, "com.waze.trip_overview.views.ComposableSingletons$TripOverviewVehicleTypeSelectorKt.lambda$2034891419.<anonymous> (TripOverviewVehicleTypeSelector.kt:196)");
                    }
                    List listI = h.a.i.i(com.waze.modules.c.de.f30054b, com.waze.modules.c.de.f30055c, com.waze.modules.c.de.f30056d);
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new com.waze.trip_overview.cj(11);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    com.waze.trip_overview.views.l.a(listI, 0, (h.g.a.l) objRememberedValue, null, false, false, null, null, composer, DisplayStrings.DS_NONE, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 15:
                org.a.d.k.b bVar9 = (org.a.d.k.b) obj;
                int i23 = com.waze.cb.m.f22100a;
                h.g.b.x.f(bVar9, "$this$single");
                h.g.b.x.f((org.a.d.h.a) obj2, "it");
                int i24 = h.g.b.ar.f48106a;
                Context context = (Context) bVar9.a(new h.g.b.m(Context.class), null, null);
                org.a.d.a.a aVar3 = com.waze.app_nav.hub.c.e.f15298c;
                org.a.d.i.c cVar2 = new org.a.d.i.c(new h.g.b.m(com.waze.app_nav.hub.service.a.class));
                if (aVar3 instanceof org.a.d.a.b) {
                    bVarC = ((org.a.d.a.b) aVar3).l();
                    mVar = new h.g.b.m(com.waze.app_nav.hub.c.e.class);
                } else {
                    bVarC = aVar3.getKoin().a().c();
                    mVar = new h.g.b.m(com.waze.app_nav.hub.c.e.class);
                }
                break;
            case 16:
                boolean z2 = true;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i25 = iIntValue2 & 3;
                int i26 = iIntValue2 & 1;
                int i27 = com.waze.ui.i.f42387a;
                if (i25 == 2) {
                    z2 = false;
                }
                if (composer2.shouldExecute(z2, i26)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1018728423, iIntValue2, -1, "com.waze.ui.ComposableSingletons$StateEventBottomMenuKt.lambda$-1018728423.<anonymous> (StateEventBottomMenu.kt:187)");
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.f23302c.c(com.waze.design_components.b.e.f23313b), composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composer2, 0).G(), 0, 2, null), composer2, Painter.$stable | 48, 60);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 17:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i28 = iIntValue3 & 3;
                int i29 = iIntValue3 & 1;
                int i30 = com.waze.ui.a.w.f41701a;
                if (composer3.shouldExecute(i28 != 2, i29)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835730549, iIntValue3, -1, "com.waze.ui.ads.ComposableSingletons$AdHeaderKt.lambda$-1835730549.<anonymous> (AdHeader.kt:113)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
            case 18:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i31 = iIntValue4 & 3;
                int i32 = iIntValue4 & 1;
                int i33 = com.waze.ui.a.w.f41701a;
                if (composer4.shouldExecute(i31 != 2, i32)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1429192539, iIntValue4, -1, "com.waze.ui.ads.ComposableSingletons$AdHeaderKt.lambda$1429192539.<anonymous> (AdHeader.kt:271)");
                    }
                    BoxKt.Box(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, com.waze.bz.a.d(composer4, 0).h(), null, 2, null), composer4, 0);
                    com.waze.ui.a.l.w(com.waze.ui.a.l.f(), composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
            case 19:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i34 = iIntValue5 & 3;
                int i35 = iIntValue5 & 1;
                int i36 = com.waze.ui.a.w.f41701a;
                if (composer5.shouldExecute(i34 != 2, i35)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-385317972, iIntValue5, -1, "com.waze.ui.ads.ComposableSingletons$AdHeaderKt.lambda$-385317972.<anonymous> (AdHeader.kt:280)");
                    }
                    BoxKt.Box(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, com.waze.bz.a.d(composer5, 0).h(), null, 2, null), composer5, 0);
                    com.waze.ui.a.l.w(com.waze.ui.a.u.i(com.waze.ui.a.l.f(), "Very long title that needs at most two lines", DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_2), composer5, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                break;
            default:
                boolean z3 = true;
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i37 = iIntValue6 & 3;
                int i38 = iIntValue6 & 1;
                int i39 = com.waze.ui.a.w.f41701a;
                if (i37 == 2) {
                    z3 = false;
                }
                if (composer6.shouldExecute(z3, i38)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-315460842, iIntValue6, -1, "com.waze.ui.ads.ComposableSingletons$AdHeaderKt.lambda$-315460842.<anonymous> (AdHeader.kt:289)");
                    }
                    BoxKt.Box(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, com.waze.bz.a.d(composer6, 0).h(), null, 2, null), composer6, 0);
                    com.waze.ui.a.l.w(com.waze.ui.a.u.i(com.waze.ui.a.l.f(), "Very long title that needs more than two lines requiring ellipsis", DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_2), composer6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                break;
        }
        return h.ab.f48028a;
    }
}
