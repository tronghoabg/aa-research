package com.waze.ui.d;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import com.waze.ui.w.b.bj;
import com.waze.z.a.ag;
import com.waze.z.a.be;
import h.ab;
import h.g.b.x;
import j$.time.Instant;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class s {
    public /* synthetic */ s(byte[] bArr) {
    }

    public static /* synthetic */ ab c(MutableIntState mutableIntState, t tVar, h.g.a.l lVar, PaddingValues paddingValues, MutableFloatState mutableFloatState, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-760215485, i2, -1, "com.waze.ui.asks.WazeAsksEnrichAlertLayout.<anonymous>.<anonymous> (WazeAsksLayouts.kt:114)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.tide.a.c(mutableIntState, 20);
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(companion, (h.g.a.l) objRememberedValue);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierOnSizeChanged);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ProgressIndicatorKt.m4156LinearProgressIndicator_5eSRE(l(mutableFloatState), SizeKt.fillMaxWidth$default(SizeKt.m2808height3ABfNKs(Modifier.Companion, 8.0f), 0.0f, 1, null), com.waze.bz.a.d(composer, 0).E(), com.waze.bz.a.d(composer, 0).y(), StrokeCap.Companion.m8633getRoundKaPHkGw(), composer, 48, 0);
            SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 8.0f), composer, 6);
            String strO = com.waze.ui.a.l.o(tVar.b().a(), composer, 0);
            boolean zChanged = composer.changed(lVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.shared_infra.q.h(lVar, 18);
                composer.updateRememberedValue(objRememberedValue2);
            }
            o(strO, (h.g.a.a) objRememberedValue2, composer, 0);
            e(tVar.b(), lVar, composer, 0);
            SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, Math.max(24.0f, paddingValues.mo2704calculateBottomPaddingD9Ej5fM())), composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static void d(List list, LazyGridState lazyGridState, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        x.f(list, "items");
        x.f(lazyGridState, "gridState");
        x.f(lVar, "onClick");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1285795530);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(list) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 16;
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(lazyGridState) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1285795530, i3, -1, "com.waze.ui.asks.EnrichAlertAnswersGrid (WazeAsksLayouts.kt:179)");
            }
            GridCells.Fixed fixed = new GridCells.Fixed(3);
            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            boolean zChangedInstance = ((i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256) | composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.bw.a.b.l(list, lVar, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyGridDslKt.LazyVerticalGrid(fixed, null, lazyGridState, null, false, null, spaceEvenly, null, false, null, (h.g.a.l) objRememberedValue, composerStartRestartGroup, ((i3 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | 1572864, 0, 954);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ag(list, (Object) lazyGridState, lVar, i2, 2));
        }
    }

    public static void e(f fVar, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        x.f(fVar, "question");
        x.f(lVar, "actions");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-501694154);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(fVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        int i5 = 19;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-501694154, i3, -1, "com.waze.ui.asks.EnrichAlertAnswersLayout (WazeAsksLayouts.kt:163)");
            }
            List listB = fVar.b();
            LazyGridState lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
            int i6 = i3 & 112;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.tide.a.c(lVar, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            d(listB, lazyGridStateRememberLazyGridState, (h.g.a.l) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.copilot.presentation.c(fVar, lVar, i2, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(com.waze.ui.d.t r17, h.g.a.l r18, androidx.compose.foundation.layout.PaddingValues r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.d.s.f(com.waze.ui.d.t, h.g.a.l, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int):void");
    }

    static ab h(b bVar, int i2, h.g.a.l lVar, int i3, Composer composer) {
        n(bVar, i2, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return ab.f48028a;
    }

    static ab i(String str, h.g.a.a aVar, int i2, Composer composer) {
        o(str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(h.g.a.a r20, androidx.compose.ui.Modifier r21, long r22, h.g.a.a r24, h.g.a.q r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.d.s.j(h.g.a.a, androidx.compose.ui.Modifier, long, h.g.a.a, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    public static Integer k(bj bjVar) {
        x.f(bjVar, "<this>");
        bj bjVar2 = bj.f43679a;
        switch (bjVar.ordinal()) {
            case 0:
            case 1:
            case 32:
            case 33:
                return Integer.valueOf(R.string.REPORT_MENU_V2_TRAFFIC_DEFAULT_LABEL);
            case 2:
            case 3:
            case 4:
            case 5:
                return Integer.valueOf(R.string.REPORT_MENU_V2_POLICE_DEFAULT_LABEL);
            case 6:
            case 7:
            case 8:
            case 30:
            case 31:
                return Integer.valueOf(R.string.REPORT_MENU_V2_CRASH_DEFAULT_LABEL);
            case 9:
                return Integer.valueOf(R.string.REPORT_MENU_V2_HAZARD_DEFAULT_LABEL);
            case 10:
                return Integer.valueOf(R.string.REPORT_MENU_V2_HAZARD_BROKEN_TRAFFIC_LIGHT_LABEL);
            case 11:
                return Integer.valueOf(R.string.REPORT_MENU_V2_HAZARD_POTHOLE_LABEL);
            case 12:
                return Integer.valueOf(R.string.REPORT_MENU_V2_HAZARD_OBJECT_LABEL);
            case 13:
                return Integer.valueOf(R.string.REPORT_MENU_V2_HAZARD_VEHICLE_STOPPED_LABEL);
            case 14:
                return Integer.valueOf(R.string.REPORT_MENU_V2_HAZARD_CONSTRUCTION_LABEL);
            case 15:
                return Integer.valueOf(R.string.REPORT_MENU_V2_WEATHER_BAD_WEATHER_LABEL);
            case 16:
                return Integer.valueOf(R.string.REPORT_MENU_V2_WEATHER_FLOOD_LABEL);
            case 17:
                return Integer.valueOf(R.string.REPORT_MENU_V2_WEATHER_SLIPPERY_ROAD_LABEL);
            case 18:
                return Integer.valueOf(R.string.REPORT_MENU_V2_WEATHER_UNPLOWED_ROAD_LABEL);
            case 19:
                return Integer.valueOf(R.string.REPORT_MENU_V2_WEATHER_ICY_ROAD_LABEL);
            case 20:
                return Integer.valueOf(R.string.REPORT_MENU_V2_WEATHER_FOG_LABEL);
            case 21:
            case 22:
            case 23:
            case 24:
                return Integer.valueOf(R.string.REPORT_MENU_V2_BLOCKED_LANES_REPORT_LABEL);
            case 25:
                return Integer.valueOf(R.string.REPORT_MENU_V2_WEATHER_HAIL_LABEL);
            case 26:
                return Integer.valueOf(R.string.REPORT_MENU_V2_HAZARD_ANIMALS_LABEL);
            case 27:
                return Integer.valueOf(R.string.REPORT_MENU_V2_HAZARD_MISSING_SIGN_LABEL);
            case 28:
                return Integer.valueOf(R.string.REPORT_MENU_V2_HAZARD_ROADKILL_LABEL);
            case 29:
                return Integer.valueOf(R.string.REPORT_MENU_V2_HAZARD_SHOULDER_VEHICLE_STOPPED_LABEL);
            case 34:
                return Integer.valueOf(R.string.REPORT_MENU_V2_MAP_ISSUE_GENERAL_LABEL);
            case 35:
                return Integer.valueOf(R.string.REPORT_MENU_V2_MAP_ISSUE_WRONG_TURN_LABEL);
            case 36:
                return Integer.valueOf(R.string.REPORT_MENU_V2_MAP_ISSUE_WRONG_ADDRESS_LABEL);
            case 37:
                return Integer.valueOf(R.string.REPORT_MENU_V2_MAP_ISSUE_WRONG_ROUTE_LABEL);
            case 38:
                return Integer.valueOf(R.string.REPORT_MENU_V2_MAP_ISSUE_NO_ROUNDABOUT_LABEL);
            case 39:
                return Integer.valueOf(R.string.REPORT_MENU_V2_MAP_ISSUE_NO_ROAD_LABEL);
            case 40:
                return Integer.valueOf(R.string.REPORT_MENU_V2_MAP_ISSUE_TURN_NOT_ALLOWED_LABEL);
            case 41:
                return Integer.valueOf(R.string.REPORT_MENU_V2_MAP_ISSUE_INCORRECT_JUNCTION_LABEL);
            case 42:
                return Integer.valueOf(R.string.REPORT_MENU_V2_MAP_ISSUE_MISSING_BRIDGE_OVERPASS_LABEL);
            case 43:
                return Integer.valueOf(R.string.REPORT_MENU_V2_MAP_ISSUE_WRONG_DRIVING_DIRECTIONS_LABEL);
            case 44:
                return Integer.valueOf(R.string.REPORT_MENU_V2_MAP_ISSUE_MISSING_EXIT_LABEL);
            case 45:
                return Integer.valueOf(R.string.REPORT_MENU_V2_MAP_ISSUE_MISPLACED_GAS_STATION_LABEL);
            case 46:
                return Integer.valueOf(R.string.REPORT_MENU_V2_MAP_ISSUE_MISSING_LANDMARK_LABEL);
            case 47:
                return Integer.valueOf(R.string.REPORT_MENU_V2_MAP_ISSUE_BLOCKED_ROAD_LABEL);
            case 48:
            case 49:
            case 50:
                return Integer.valueOf(R.string.REPORT_MENU_V2_ANIMAL_DEFAULT_LABEL);
            default:
                throw new h.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float l(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float m(Instant instant, long j2) {
        return Instant.now().minusMillis(instant.toEpochMilli()).toEpochMilli() / h.o.a.m(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(b bVar, int i2, h.g.a.l lVar, Composer composer, int i3) {
        int i4;
        int i5 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1752757100);
        int i6 = 2;
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(bVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(i2) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1752757100, i4, -1, "com.waze.ui.asks.EnrichAlertAnswerLayout (WazeAsksLayouts.kt:197)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(Modifier.Companion, 0.0f, 12.0f, 1, null);
            boolean z = (i4 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            boolean z2 = (i4 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.ui.t(lVar, bVar, i6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierA = com.waze.ui.r.a.d.d.a(SizeKt.wrapContentHeight$default(be.J(modifierM2757paddingVpY3zN4$default, false, null, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 6, 15), null, false, 3, null), com.waze.ui.r.a.d.c.bR, Integer.valueOf(i2));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(bVar.b().b(), composerStartRestartGroup, 0), (String) null, com.waze.ui.r.a.d.d.a(PaddingKt.m2755padding3ABfNKs(BackgroundKt.m1971backgroundbw27NRU(SizeKt.m2822size3ABfNKs(Modifier.Companion, 80.0f), com.waze.bz.a.d(composerStartRestartGroup, 0).M(), RoundedCornerShapeKt.getCircleShape()), 8.0f), com.waze.ui.r.a.d.c.bT, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(bVar.b().c(), composerStartRestartGroup, 0), com.waze.ui.r.a.d.d.a(PaddingKt.m2758paddingqDBjuR0(Modifier.Companion, 0.0f, 8.0f, 0.0f, 0.0f), com.waze.ui.r.a.d.c.bS, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(TextAlign.Companion.m11011getCentere0LSkKk()), 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).n(), composerStartRestartGroup, 48, 0, 65020);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l(bVar, i2, lVar, i3, 0));
        }
    }

    private static void o(final String str, h.g.a.a aVar, Composer composer, final int i2) {
        int i3;
        final h.g.a.a aVar2;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-756874872);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changed(str) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-756874872, i3, -1, "com.waze.ui.asks.SheetTitle (WazeAsksLayouts.kt:137)");
            }
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(Modifier.Companion, null, false, 3, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            TextKt.m4275Text4IGK_g(str, com.waze.ui.r.a.d.d.a(RowScope.CC.weight$default(RowScopeInstance.INSTANCE, PaddingKt.m2756paddingVpY3zN4(Modifier.Companion, 16.0f, 8.0f), 1.0f, false, 2, null), com.waze.ui.r.a.d.c.bP, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, TextStyle.m10559copyp1EtxEg$default(com.waze.bz.a.h(composerStartRestartGroup).f(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 16252927, null), composerStartRestartGroup, i3 & 14, 0, 65532);
            Modifier modifierM2822size3ABfNKs = SizeKt.m2822size3ABfNKs(Modifier.Companion, 48.0f);
            int i5 = i3 & 112;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                aVar2 = aVar;
                objRememberedValue = new com.waze.shared_infra.q.h(aVar2, 19);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                aVar2 = aVar;
            }
            Modifier modifierJ = be.J(modifierM2822size3ABfNKs, false, null, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 6, 15);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierJ);
            h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            composer2 = composerStartRestartGroup;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.close_outline_24px, composerStartRestartGroup, 0), (String) null, com.waze.ui.r.a.d.d.a(BoxScopeInstance.INSTANCE.align(Modifier.Companion, Alignment.Companion.getCenter()), com.waze.ui.r.a.d.c.bQ, null), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0, 2, null), composer2, Painter.$stable | 48, 56);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            aVar2 = aVar;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.d.m
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return s.i(str, aVar2, i2, (Composer) obj);
                }
            });
        }
    }

    private s() {
        throw null;
    }
}
