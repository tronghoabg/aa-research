package com.waze.location;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.util.WavUtil;
import com.waze.R;
import com.waze.car_lib.r.cq;
import com.waze.strings.DisplayStrings;
import com.waze.ui.m.cf;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class af implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f25249a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f25250b;

    public /* synthetic */ af(Object obj, int i2) {
        this.f25250b = i2;
        this.f25249a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v88, types: [h.g.a.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [h.g.a.p, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = 18;
        int i3 = 6;
        int i4 = 2;
        switch (this.f25250b) {
            case 0:
                return LocationPermissionActivity.o((LocationPermissionActivity) this.f25249a, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i5 = iIntValue & 3;
                int i6 = iIntValue & 1;
                int i7 = com.waze.trip_overview.views.i.f41517b;
                if (composer.shouldExecute(i5 != 2, i6)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2010561163, iIntValue, -1, "com.waze.trip_overview.views.TripOverviewRouteCard.createHOVComposeBadgeView.<anonymous>.<anonymous> (TripOverviewRouteCard.kt:336)");
                    }
                    cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-117233615, true, new af(this.f25249a, 5), composer, 54), composer, 196608);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 2:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i8 = iIntValue2 & 3;
                int i9 = iIntValue2 & 1;
                int i10 = com.waze.trip_overview.views.i.f41517b;
                if (composer2.shouldExecute(i8 != 2, i9)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-583700533, iIntValue2, -1, "com.waze.trip_overview.views.TripOverviewRouteCard.createTollComposeBadgeView.<anonymous>.<anonymous>.<anonymous> (TripOverviewRouteCard.kt:365)");
                    }
                    com.waze.design_components.g.b.e((String) this.f25249a, com.waze.z.a.c.f45822h, com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.J, null), null, false, null, null, null, null, null, composer2, DisplayStrings.DS_DIRT_ROADS, 1016);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 3:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i11 = iIntValue3 & 3;
                int i12 = iIntValue3 & 1;
                int i13 = com.waze.trip_overview.views.i.f41517b;
                if (composer3.shouldExecute(i11 != 2, i12)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(994659343, iIntValue3, -1, "com.waze.trip_overview.views.TripOverviewRouteCard.createTollComposeBadgeView.<anonymous>.<anonymous> (TripOverviewRouteCard.kt:364)");
                    }
                    cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-583700533, true, new af(this.f25249a, i4), composer3, 54), composer3, 196608);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 4:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i14 = iIntValue4 & 3;
                int i15 = iIntValue4 & 1;
                int i16 = com.waze.trip_overview.views.i.f41517b;
                if (composer4.shouldExecute(i14 != 2, i15)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1230442893, iIntValue4, -1, "com.waze.trip_overview.views.TripOverviewRouteCard.updateEventsOnRoute.<anonymous> (TripOverviewRouteCard.kt:252)");
                    }
                    cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1362623663, true, new af(this.f25249a, i3), composer4, 54), composer4, 196608);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 5:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i17 = iIntValue5 & 3;
                int i18 = iIntValue5 & 1;
                int i19 = com.waze.trip_overview.views.i.f41517b;
                if (composer5.shouldExecute(i17 != 2, i18)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-117233615, iIntValue5, -1, "com.waze.trip_overview.views.TripOverviewRouteCard.createHOVComposeBadgeView.<anonymous>.<anonymous>.<anonymous> (TripOverviewRouteCard.kt:337)");
                    }
                    com.waze.design_components.g.b.e((String) this.f25249a, com.waze.z.a.c.f45822h, com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.K, null), new com.waze.ui.ac.f(com.waze.design_components.b.d.v.b()), false, null, null, null, null, null, composer5, DisplayStrings.DS_DIRT_ROADS, 1008);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 6:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i20 = iIntValue6 & 3;
                int i21 = iIntValue6 & 1;
                int i22 = com.waze.trip_overview.views.i.f41517b;
                if (composer6.shouldExecute(i20 != 2, i21)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1362623663, iIntValue6, -1, "com.waze.trip_overview.views.TripOverviewRouteCard.updateEventsOnRoute.<anonymous>.<anonymous> (TripOverviewRouteCard.kt:253)");
                    }
                    FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Arrangement.INSTANCE.m2440spacedBy0680j_4(4.0f), Arrangement.INSTANCE.m2440spacedBy0680j_4(4.0f), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-1282260938, true, new com.waze.main_screen.c.b.a(this.f25249a, 15), composer6, 54), composer6, 1573302, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 7:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (composer7.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1630698206, iIntValue7, -1, "com.waze.trip_overview.views.route_card_options.HovRouteOptions.addBadge.<anonymous>.<anonymous> (HovRouteOptions.kt:53)");
                    }
                    cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(84466074, true, new af(this.f25249a, 8), composer7, 54), composer7, 196608);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 8:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (composer8.shouldExecute((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(84466074, iIntValue8, -1, "com.waze.trip_overview.views.route_card_options.HovRouteOptions.addBadge.<anonymous>.<anonymous>.<anonymous> (HovRouteOptions.kt:54)");
                    }
                    com.waze.design_components.g.b.e((String) this.f25249a, com.waze.z.a.c.f45821g, null, new com.waze.ui.ac.f(com.waze.design_components.b.d.v.b()), false, null, null, null, null, null, composer8, 48, 1012);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 9:
                Composer composer9 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (composer9.shouldExecute((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-106465924, iIntValue9, -1, "com.waze.u16.U16AppBlockFragment.onCreateView.<anonymous>.<anonymous> (U16AppBlockFragment.kt:31)");
                    }
                    com.waze.cb.i.c((com.waze.cb.k) this.f25249a, composer9, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 10:
                com.waze.z.a.c.c cVar = (com.waze.z.a.c.c) obj;
                com.waze.z.a.c.d dVar = (com.waze.z.a.c.d) obj2;
                h.g.b.x.f(cVar, "actions");
                h.g.b.x.f(dVar, "cta");
                boolean z = cVar instanceof com.waze.z.a.c.b;
                Object obj3 = this.f25249a;
                if (z) {
                    ((com.waze.ui.c.a) obj3).f().invoke();
                } else {
                    if (!(cVar instanceof com.waze.z.a.c.a)) {
                        throw new h.i();
                    }
                    com.waze.ui.c.a aVar = (com.waze.ui.c.a) obj3;
                    if (h.g.b.x.n(dVar, ((com.waze.z.a.c.a) cVar).a())) {
                        aVar.f().invoke();
                    } else {
                        aVar.g().invoke();
                    }
                }
                return h.ab.f48028a;
            case 11:
                Composer composer10 = (Composer) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (composer10.shouldExecute((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(35674140, iIntValue10, -1, "com.waze.ui.app_launch_dialog.AppLaunchDialogLayout.<anonymous> (AppLaunchDialogLayout.kt:149)");
                    }
                    com.waze.ui.c.a aVar2 = (com.waze.ui.c.a) this.f25249a;
                    String strB = aVar2.b();
                    if (strB == null || strB.length() == 0) {
                        composer10.startReplaceGroup(1911493734);
                        composer10.endReplaceGroup();
                    } else {
                        composer10.startReplaceGroup(1911423581);
                        TextKt.m4275Text4IGK_g(aVar2.b(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer10).a(), composer10, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                        composer10.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 12:
                Composer composer11 = (Composer) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (composer11.shouldExecute((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1112955995, iIntValue11, -1, "com.waze.ui.copilot.CarsSettingsScreen.<anonymous> (CarsSettingsScreen.kt:116)");
                    }
                    Object obj4 = this.f25249a;
                    String strB2 = com.waze.ui.r.a.c.c.b(R.string.CAR_ICON, composer11, 0);
                    boolean zChanged = composer11.changed(obj4);
                    Object objRememberedValue = composer11.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new com.waze.sharedrive.c.r(obj4, 4);
                        composer11.updateRememberedValue(objRememberedValue);
                    }
                    com.waze.z.a.be.h(strB2, null, (h.g.a.a) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-1218832598, true, new com.waze.main_screen.c.b.a(obj4, i2), composer11, 54), null, composer11, 24576, 42);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 13:
                Composer composer12 = (Composer) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (composer12.shouldExecute((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1694619808, iIntValue12, -1, "com.waze.ui.hnc.HncSettingsScreen.<anonymous> (HncSettingsScreen.kt:111)");
                    }
                    Object obj5 = this.f25249a;
                    String strB3 = com.waze.ui.r.a.c.c.b(R.string.HNC_HOY_NO_CIRCULA, composer12, 0);
                    boolean zChanged2 = composer12.changed(obj5);
                    Object objRememberedValue2 = composer12.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new com.waze.sharedrive.c.r(obj5, 10);
                        composer12.updateRememberedValue(objRememberedValue2);
                    }
                    com.waze.z.a.be.h(strB3, null, (h.g.a.a) objRememberedValue2, null, ComposableLambdaKt.rememberComposableLambda(477490917, true, new com.waze.main_screen.c.b.a(obj5, 19), composer12, 54), null, composer12, 24576, 42);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 14:
                Composer composer13 = (Composer) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (composer13.shouldExecute((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-286522324, iIntValue13, -1, "com.waze.ui.location_preview.NameFavoriteDialog.<anonymous>.<anonymous> (LocationPreviewDialogs.kt:92)");
                    }
                    Object objRememberedValue3 = composer13.rememberedValue();
                    if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new com.waze.sharedrive.c.r(this.f25249a, 16);
                        composer13.updateRememberedValue(objRememberedValue3);
                    }
                    int i23 = com.waze.ui.m.m.f43018a;
                    IconButtonKt.IconButton((h.g.a.a) objRememberedValue3, null, false, null, com.waze.ui.m.m.a(), composer13, 24582, 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 15:
                Composer composer14 = (Composer) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                int i24 = iIntValue14 & 1;
                boolean z2 = (iIntValue14 & 3) != 2;
                int i25 = com.waze.ui.m.af.f42782a;
                if (composer14.shouldExecute(z2, i24)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1295276013, iIntValue14, -1, "com.waze.ui.location_preview.EVPlugsLayout.<anonymous>.<anonymous>.<anonymous> (LocationPreviewEVPlugs.kt:61)");
                    }
                    Object obj6 = this.f25249a;
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(com.waze.design_components.b.d.ag.b(), composer14, 0);
                    ColorFilter colorFilterM8269tintxETnrds$default = ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composer14, 0).o(), 0, 2, null);
                    Modifier modifierM2758paddingqDBjuR0 = PaddingKt.m2758paddingqDBjuR0(SizeKt.m2822size3ABfNKs(Modifier.Companion, 30.0f), 4.0f, 8.0f, 4.0f, 4.0f);
                    boolean zChanged3 = composer14.changed(obj6);
                    Object objRememberedValue4 = composer14.rememberedValue();
                    if (zChanged3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new com.waze.sharedrive.c.r(obj6, 17);
                        composer14.updateRememberedValue(objRememberedValue4);
                    }
                    ImageKt.Image(painterPainterResource, (String) null, com.waze.z.a.be.J(modifierM2758paddingqDBjuR0, false, null, (h.g.a.a) objRememberedValue4, composer14, 48, 14), (Alignment) null, (ContentScale) null, 0.0f, colorFilterM8269tintxETnrds$default, composer14, Painter.$stable | 48, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 16:
                Composer composer15 = (Composer) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                int i26 = iIntValue15 & 3;
                int i27 = iIntValue15 & 1;
                int i28 = cf.f42851a;
                if (composer15.shouldExecute(i26 != 2, i27)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1920658559, iIntValue15, -1, "com.waze.ui.location_preview.GasPricesLayout.<anonymous>.<anonymous>.<anonymous> (LocationPreviewGas.kt:40)");
                    }
                    com.waze.ui.m.t tVar = (com.waze.ui.m.t) this.f25249a;
                    if (tVar.b() != null) {
                        composer15.startReplaceGroup(784860731);
                        com.waze.ui.l.bh.g(composer15, 0);
                        TextKt.m4275Text4IGK_g(tVar.b(), (Modifier) null, com.waze.bz.a.d(composer15, 0).r(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer15).c(), composer15, 0, 0, 65530);
                        composer15.endReplaceGroup();
                    } else {
                        composer15.startReplaceGroup(785052931);
                        composer15.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 17:
                Composer composer16 = (Composer) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (composer16.shouldExecute((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1893052902, iIntValue16, -1, "com.waze.ui.location_preview.SilkyBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LocationPreview.kt:320)");
                    }
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>) com.waze.ui.h.a().provides(Dp.m11162boximpl(com.waze.ui.h.e(composer16))), ComposableLambdaKt.rememberComposableLambda(-437344602, true, new af(this.f25249a, i2), composer16, 54), composer16, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 18:
                Composer composer17 = (Composer) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (composer17.shouldExecute((iIntValue17 & 3) != 2, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-437344602, iIntValue17, -1, "com.waze.ui.location_preview.SilkyBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LocationPreview.kt:323)");
                    }
                    Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(ScrollKt.verticalScroll$default(NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxHeight$default(com.waze.ui.h.b(Modifier.Companion), 0.0f, 1, null), NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composer17, 0, 1), null, 2, null), ScrollKt.rememberScrollState(0, composer17, 0, 1), false, null, false, 14, null), com.waze.bz.a.d(composer17, 0).h(), null, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer17, 0);
                    int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer17, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer17.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer17, modifierM1972backgroundbw27NRU$default);
                    h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    if (!(composer17.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer17.startReusableNode();
                    if (composer17.getInserting()) {
                        composer17.createNode(constructor);
                    } else {
                        composer17.useNode();
                    }
                    ?? r0 = this.f25249a;
                    Updater.m7351setimpl(composer17, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer17, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer17, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer17, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer17, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    r0.invoke(ColumnScopeInstance.INSTANCE, composer17, 6);
                    composer17.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return h.ab.f48028a;
            case 19:
                Composer composer18 = (Composer) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                int i29 = iIntValue18 & 3;
                int i30 = iIntValue18 & 1;
                int i31 = com.waze.ui.r.a.e.e.f43379a;
                if (composer18.shouldExecute(i29 != 2, i30)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1308766647, iIntValue18, -1, "com.waze.ui.mobile.infra.theme.WazeTheme.<anonymous>.<anonymous> (WazeTheme.kt:65)");
                    }
                    this.f25249a.invoke(composer18, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return h.ab.f48028a;
            default:
                Composer composer19 = (Composer) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (composer19.shouldExecute((iIntValue19 & 3) != 2, iIntValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1435198064, iIntValue19, -1, "com.waze.ui.nav_popup.RoutingPopupDialog.<anonymous> (RoutingPopupDialogUi.kt:73)");
                    }
                    TextKt.m4275Text4IGK_g(((com.waze.ui.t.b) this.f25249a).e(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer19).a(), composer19, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                return h.ab.f48028a;
        }
    }
}
