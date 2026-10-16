package com.waze.c.e;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsetsSizeKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SnackbarData;
import androidx.compose.material.SnackbarKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import com.waze.R;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class bv implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f18634a;

    public /* synthetic */ bv(int i2) {
        this.f18634a = i2;
    }

    @Override // h.g.a.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f18634a) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i2 = bw.f18635a;
                h.g.b.x.f((LazyItemScope) obj, "$this$item");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1534660952, iIntValue, -1, "com.waze.alternate_routes.presentation.ComposableSingletons$AlternateRoutesScreenV2Kt.lambda$1534660952.<anonymous> (AlternateRoutesScreenV2.kt:471)");
                    }
                    SpacerKt.Spacer(WindowInsetsSizeKt.windowInsetsBottomHeight(Modifier.Companion, WindowInsetsKt.m2850onlybOOhFvg(WindowInsets_androidKt.getSystemBars(WindowInsets.Companion, composer, 6), WindowInsetsSides.Companion.m2868getBottomJoeWqyM())), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i3 = bu.f18632a;
                h.g.b.x.f((BoxScope) obj, "$this$WazeTooltipPopup");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1770052051, iIntValue2, -1, "com.waze.alternate_routes.presentation.ComposableSingletons$AlternateRoutesFTETooltipKt.lambda$-1770052051.<anonymous> (AlternateRoutesFTETooltip.kt:40)");
                    }
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.ALT_ROUTES_V2_FTE_TEXT, composer2, 0), (Modifier) null, com.waze.bz.a.d(composer2, 0).D(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer2).m(), composer2, 0, 0, 65530);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i4 = bx.f18637a;
                h.g.b.x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(731297283, iIntValue3, -1, "com.waze.alternate_routes.presentation.ComposableSingletons$SlideInAlternateRoutesLoaderKt.lambda$731297283.<anonymous> (SlideInAlternateRoutesLoader.kt:87)");
                }
                com.waze.cb.i.i(new com.waze.ui.ac.j(R.string.ALT_ROUTES_V2_CALCULATING_ROUTES), null, composer3, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            case 3:
                com.waze.ui.f.ai aiVar = (com.waze.ui.f.ai) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                h.g.b.x.f(aiVar, "it");
                composer4.startReplaceGroup(-650345684);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-650345684, iIntValue4, -1, "com.waze.companinio.ui.mobile.overlay.CompaninioLayout.<anonymous>.<anonymous>.<anonymous> (CompaninioLayout.kt:96)");
                }
                com.waze.ui.f.am amVarD = com.waze.ui.f.am.d(com.waze.tide.s.k(aiVar, composer4, iIntValue4 & 14), "");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer4.endReplaceGroup();
                break;
            case 4:
                SnackbarData snackbarData = (SnackbarData) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i5 = com.waze.copilot.presentation.b.f23105a;
                h.g.b.x.f(snackbarData, "data");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-975487618, iIntValue5, -1, "com.waze.copilot.presentation.ComposableSingletons$CopilotMarketplaceFragmentKt.lambda$-975487618.<anonymous> (CopilotMarketplaceFragment.kt:122)");
                }
                SnackbarKt.m4199SnackbarsPrSdHI(snackbarData, null, false, null, 0L, 0L, com.waze.bz.a.d(composer5, 0).F(), 0.0f, composer5, iIntValue5 & 14, DisplayStrings.DS_TRIP_OVERVIEW_REQUIRED_RESTRICTED_AREA_LABEL);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            case 5:
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i6 = com.waze.z.a.i.f46137a;
                h.g.b.x.f((RowScope) obj, "$this$Button");
                if (composer6.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1420209997, iIntValue6, -1, "com.waze.design_components_compose.components.ComposableSingletons$RecenterMapButtonKt.lambda$-1420209997.<anonymous> (RecenterMapButton.kt:48)");
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.bt.c(com.waze.design_components.b.e.f23312a), composer6, 0), (String) null, SizeKt.m2827width3ABfNKs(SizeKt.m2808height3ABfNKs(Modifier.Companion, 32.0f), 32.0f), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composer6, 0).o(), 0, 2, null), composer6, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                break;
            case 6:
                RowScope rowScope = (RowScope) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i7 = com.waze.z.a.k.f46140a;
                h.g.b.x.f(rowScope, "$this$WazeHeader");
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= true == composer7.changed(rowScope) ? 4 : 2;
                }
                if (composer7.shouldExecute((iIntValue7 & 19) != 18, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1201974959, iIntValue7, -1, "com.waze.design_components_compose.components.ComposableSingletons$WazeHeaderKt.lambda$-1201974959.<anonymous> (WazeHeader.kt:53)");
                    }
                    int i8 = iIntValue7;
                    com.waze.design_components.b.d dVar = com.waze.design_components.b.d.n;
                    Object objRememberedValue = composer7.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new com.waze.car_lib.o.a(11);
                        composer7.updateRememberedValue(objRememberedValue);
                    }
                    int i9 = (i8 & 14) | DisplayStrings.DS_DIRT_ROADS;
                    com.waze.z.a.be.i(rowScope, dVar, (h.g.a.a) objRememberedValue, null, null, 0L, composer7, i9, 28);
                    com.waze.design_components.b.d dVar2 = com.waze.design_components.b.d.s;
                    Object objRememberedValue2 = composer7.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new com.waze.car_lib.o.a(12);
                        composer7.updateRememberedValue(objRememberedValue2);
                    }
                    com.waze.z.a.be.i(rowScope, dVar2, (h.g.a.a) objRememberedValue2, null, null, 0L, composer7, i9, 28);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                break;
            case 7:
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i10 = com.waze.z.a.k.f46140a;
                h.g.b.x.f((RowScope) obj, "<this>");
                if (composer8.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1000485386, iIntValue8, -1, "com.waze.design_components_compose.components.ComposableSingletons$WazeHeaderKt.lambda$1000485386.<anonymous> (WazeHeader.kt:98)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                break;
            case 8:
                SnackbarData snackbarData2 = (SnackbarData) obj;
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                int i11 = com.waze.z.a.f.c.f46038a;
                h.g.b.x.f(snackbarData2, "snackbarData");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-308088390, iIntValue9, -1, "com.waze.design_components_compose.components.snackbar.ComposableSingletons$WazeSnackbarKt.lambda$-308088390.<anonymous> (WazeSnackbar.kt:37)");
                }
                SnackbarKt.m4199SnackbarsPrSdHI(snackbarData2, null, false, null, com.waze.bz.a.d(composer9, 0).i(), com.waze.bz.a.d(composer9, 0).D(), 0L, 0.0f, composer9, iIntValue9 & 14, 206);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            case 9:
                Composer composer10 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                int i12 = com.waze.z.a.f.c.f46038a;
                h.g.b.x.f((RowScope) obj, "$this$Button");
                if (composer10.shouldExecute((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1191347189, iIntValue10, -1, "com.waze.design_components_compose.components.snackbar.ComposableSingletons$WazeSnackbarKt.lambda$1191347189.<anonymous> (WazeSnackbar.kt:71)");
                    }
                    TextKt.m4275Text4IGK_g("Show Snackbar", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, (TextStyle) null, composer10, 6, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                break;
            case 10:
                Composer composer11 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                int i13 = com.waze.ab.a.a.f13673a;
                h.g.b.x.f((Modifier) obj, "it");
                if (composer11.shouldExecute((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1138078056, iIntValue11, -1, "com.waze.dialog.userImage.ComposableSingletons$UserImageComposablesKt.lambda$-1138078056.<anonymous> (UserImageComposables.kt:172)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                break;
            case 11:
                BoxScope boxScope = (BoxScope) obj;
                Composer composer12 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                int i14 = com.waze.main_screen.c.a.a.f26078a;
                h.g.b.x.f(boxScope, "$this$ButtonPackItem");
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= true == composer12.changed(boxScope) ? 4 : 2;
                }
                if (composer12.shouldExecute((iIntValue12 & 19) != 18, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-409432706, iIntValue12, -1, "com.waze.main_screen.button_pack.assistant_button.ComposableSingletons$GoogleAssistantButtonV1Kt.lambda$-409432706.<anonymous> (GoogleAssistantButtonV1.kt:56)");
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.cc.b(), composer12, 0), (String) null, boxScope.align(ClipKt.clip(SizeKt.m2822size3ABfNKs(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.dd, null), 32.0f), RoundedCornerShapeKt.getCircleShape()), Alignment.Companion.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer12, Painter.$stable | 48, 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                break;
            case 12:
                BoxScope boxScope2 = (BoxScope) obj;
                Composer composer13 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                int i15 = com.waze.main_screen.c.e.m.f26217a;
                h.g.b.x.f(boxScope2, "$this$ButtonPackItem");
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= true == composer13.changed(boxScope2) ? 4 : 2;
                }
                if (composer13.shouldExecute((iIntValue13 & 19) != 18, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1244382893, iIntValue13, -1, "com.waze.main_screen.button_pack.share_drive_button.ComposableSingletons$ButtonPackShareDriveButtonKt.lambda$-1244382893.<anonymous> (ButtonPackShareDriveButton.kt:52)");
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.t1_shared_drive_outline_24, composer13, 0), (String) null, boxScope2.align(SizeKt.m2822size3ABfNKs(Modifier.Companion, 32.0f), Alignment.Companion.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composer13, 0).o(), 0, 2, null), composer13, Painter.$stable | 48, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer14 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                int i16 = com.waze.menus.a.a.f.f29666a;
                h.g.b.x.f((LazyItemScope) obj, "$this$item");
                if (composer14.shouldExecute((iIntValue14 & 17) != 16, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-949222823, iIntValue14, -1, "com.waze.menus.destination.bottomsheet.ComposableSingletons$BottomSheetColumnContentKt.lambda$-949222823.<anonymous> (BottomSheetColumnContent.kt:112)");
                    }
                    SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 40.0f), composer14, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                break;
            case 14:
                Composer composer15 = (Composer) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                int i17 = com.waze.navigate.location_preview.b.f31606a;
                h.g.b.x.f((ColumnScope) obj, "$this$EmptyMapLayout");
                if (composer15.shouldExecute((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1799203161, iIntValue15, -1, "com.waze.navigate.location_preview.ComposableSingletons$LocationPreviewActivityKt.lambda$1799203161.<anonymous> (LocationPreviewActivity.kt:169)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                break;
            case 15:
                Composer composer16 = (Composer) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                int i18 = com.waze.navigate.location_preview.b.f31606a;
                h.g.b.x.f((ColumnScope) obj, "$this$EmptyMapLayout");
                if (composer16.shouldExecute((iIntValue16 & 17) != 16, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(73869735, iIntValue16, -1, "com.waze.navigate.location_preview.ComposableSingletons$LocationPreviewActivityKt.lambda$73869735.<anonymous> (LocationPreviewActivity.kt:195)");
                    }
                    ImageKt.Image(com.waze.ui.r.a.a.t.e(new com.waze.ui.ac.f(R.drawable.no_search_results), null, composer16, 0, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer16, Painter.$stable | 48, 124);
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.LOCATION_PREVIEW_MISSING_ADDRESS, composer16, 0), PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 16.0f, 0.0f, 0.0f, 13, null), com.waze.bz.a.d(composer16, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer16).j(), composer16, 48, 0, 65528);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                break;
            case 16:
                Path path = (Path) obj;
                Size size = (Size) obj2;
                h.g.b.x.f(path, "$this$GenericShape");
                h.g.b.x.f((LayoutDirection) obj3, "<unused var>");
                Path.CC.addOval$default(path, new Rect(0.0f, 0.0f, Float.intBitsToFloat((int) (size.m8054unboximpl() >> 32)), Float.intBitsToFloat((int) (size.m8054unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))), null, 2, null);
                break;
            case 17:
                Composer composer17 = (Composer) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                int i19 = com.waze.reports_v2.presentation.b.f34838a;
                h.g.b.x.f((BoxScope) obj, "$this$WazeTooltipPopup");
                if (composer17.shouldExecute((iIntValue17 & 17) != 16, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1066570829, iIntValue17, -1, "com.waze.reports_v2.presentation.ComposableSingletons$ConversationalReportingFteTooltipKt.lambda$-1066570829.<anonymous> (ConversationalReportingFteTooltip.kt:51)");
                    }
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.CONVERSATIONAL_REPORTING_FTE_TOOLTIP_TEXT, composer17, 0), (Modifier) null, com.waze.bz.a.d(composer17, 0).D(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer17).m(), composer17, 0, 0, 65530);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                break;
            case 18:
                SnackbarData snackbarData3 = (SnackbarData) obj;
                Composer composer18 = (Composer) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                int i20 = com.waze.sharedui.web.i.f39354a;
                h.g.b.x.f(snackbarData3, "data");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(633481642, iIntValue18, -1, "com.waze.sharedui.web.ComposableSingletons$WazeWebViewPageKt.lambda$633481642.<anonymous> (WazeWebViewPage.kt:65)");
                }
                SnackbarKt.m4199SnackbarsPrSdHI(snackbarData3, null, false, null, 0L, 0L, com.waze.bz.a.d(composer18, 0).F(), 0.0f, composer18, iIntValue18 & 14, DisplayStrings.DS_TRIP_OVERVIEW_REQUIRED_RESTRICTED_AREA_LABEL);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            case 19:
                RowScope rowScope2 = (RowScope) obj;
                Composer composer19 = (Composer) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                int i21 = com.waze.bw.c.d.b.f17977a;
                h.g.b.x.f(rowScope2, "$this$DestinationCardFrame");
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= true == composer19.changed(rowScope2) ? 4 : 2;
                }
                if (composer19.shouldExecute((iIntValue19 & 19) != 18, iIntValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1542079455, iIntValue19, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$FavoritesCarouselKt.lambda$-1542079455.<anonymous> (FavoritesCarousel.kt:217)");
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.q.c(com.waze.design_components.b.e.f23314c), composer19, 0), (String) null, rowScope2.align(SizeKt.m2822size3ABfNKs(Modifier.Companion, 24.0f), Alignment.Companion.getCenterVertically()), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composer19, 0).G(), 0, 2, null), composer19, Painter.$stable | 48, 56);
                    SpacerKt.Spacer(SizeKt.m2822size3ABfNKs(Modifier.Companion, 8.0f), composer19, 6);
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.START_STATE_FAVORITE_CAROUSEL_NEW_ITEM_TITLE, composer19, 0), rowScope2.align(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.bD, null), Alignment.Companion.getCenterVertically()), com.waze.bz.a.d(composer19, 0).G(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m11069getEllipsisgIe3tQ8(), false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer19).h(), composer19, 0, 48, 63480);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                break;
            default:
                RowScope rowScope3 = (RowScope) obj;
                Composer composer20 = (Composer) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                int i22 = com.waze.bw.c.d.b.f17977a;
                h.g.b.x.f(rowScope3, "$this$DestinationCardFrame");
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= true == composer20.changed(rowScope3) ? 4 : 2;
                }
                if (composer20.shouldExecute((iIntValue20 & 19) != 18, iIntValue20 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1406521724, iIntValue20, -1, "com.waze.startstate.mobile.ui.ComposableSingletons$FavoritesCarouselKt.lambda$-1406521724.<anonymous> (FavoritesCarousel.kt:243)");
                    }
                    TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.START_STATE_FAVORITE_CAROUSEL_MORE_ITEM_TITLE, composer20, 0), rowScope3.align(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.bD, null), Alignment.Companion.getCenterVertically()), com.waze.bz.a.d(composer20, 0).q(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m11069getEllipsisgIe3tQ8(), false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer20).h(), composer20, 0, 48, 63480);
                    SpacerKt.Spacer(SizeKt.m2822size3ABfNKs(Modifier.Companion, 8.0f), composer20, 6);
                    ImageKt.Image(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.bC.c(com.waze.design_components.b.e.f23312a), composer20, 0), (String) null, rowScope3.align(SizeKt.m2822size3ABfNKs(Modifier.Companion, 24.0f), Alignment.Companion.getCenterVertically()), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composer20, 0).q(), 0, 2, null), composer20, Painter.$stable | 48, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer20.skipToGroupEnd();
                }
                break;
        }
        return h.ab.f48028a;
    }
}
