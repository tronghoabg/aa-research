package com.waze.ui.x;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.media3.common.util.WavUtil;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.lm;
import com.waze.sound.gv;
import com.waze.strings.DisplayStrings;
import com.waze.z.a.ag;
import com.waze.z.a.be;
import h.ab;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private static Context f43843a;

    public static void h(boolean z, g gVar, g gVar2, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        x.f(gVar, "tollsSettingState");
        x.f(gVar2, "ferriesSettingState");
        x.f(lVar, "callback");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2123170384);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(gVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(gVar2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2123170384, i3, -1, "com.waze.ui.route_settings.RouteSettingsMenuBottomSheet (RouteSettingsMenu.kt:202)");
            }
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composerStartRestartGroup, (i3 >> 9) & 14);
            ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
            boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            int i5 = 3;
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new p(stateRememberUpdatedState, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(modalBottomSheetValue, null, (h.g.a.l) objRememberedValue, true, composerStartRestartGroup, DisplayStrings.DS_AAOS_SOUND_OFF, 2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(h.c.k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final af afVar = (af) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState = (MutableState) objRememberedValue3;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i6 = i3 & 14;
            boolean zChangedInstance = (i6 == 4) | composerStartRestartGroup.changedInstance(modalBottomSheetStateRememberModalBottomSheetState);
            r rVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || rVarRememberedValue == Composer.Companion.getEmpty()) {
                rVarRememberedValue = new r(z, modalBottomSheetStateRememberModalBottomSheetState, null);
                composerStartRestartGroup.updateRememberedValue(rVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (h.g.a.p<? super af, ? super h.c.e<? super ab>, ? extends Object>) rVarRememberedValue, composerStartRestartGroup, i6);
            ModalBottomSheetValue currentValue = modalBottomSheetStateRememberModalBottomSheetState.getCurrentValue();
            ModalBottomSheetValue targetValue = modalBottomSheetStateRememberModalBottomSheetState.getTargetValue();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(modalBottomSheetStateRememberModalBottomSheetState) | composerStartRestartGroup.changed(stateRememberUpdatedState);
            s sVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || sVarRememberedValue == Composer.Companion.getEmpty()) {
                sVarRememberedValue = new s(modalBottomSheetStateRememberModalBottomSheetState, mutableState, stateRememberUpdatedState, null);
                composerStartRestartGroup.updateRememberedValue(sVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(currentValue, targetValue, (h.g.a.p) sVarRememberedValue, composerStartRestartGroup, 0);
            boolean z2 = (modalBottomSheetStateRememberModalBottomSheetState.getCurrentValue() == ModalBottomSheetValue.Hidden || modalBottomSheetStateRememberModalBottomSheetState.getTargetValue() == ModalBottomSheetValue.Hidden) ? false : true;
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(afVar) | composerStartRestartGroup.changed(stateRememberUpdatedState) | composerStartRestartGroup.changedInstance(modalBottomSheetStateRememberModalBottomSheetState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new h.g.a.a() { // from class: com.waze.ui.x.q
                    @Override // h.g.a.a
                    public final Object invoke() {
                        aj.z(afVar, null, null, new t(modalBottomSheetStateRememberModalBottomSheetState, stateRememberUpdatedState, null, 1, null), 3);
                        return ab.f48028a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            BackHandlerKt.BackHandler(z2, (h.g.a.a) objRememberedValue4, composerStartRestartGroup, 0, 0);
            Modifier modifierConsumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(Modifier.Companion, WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composerStartRestartGroup, 6));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierConsumeWindowInsets);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-560883499, true, new com.waze.z.a.c.l(gVar, gVar2, afVar, stateRememberUpdatedState, modalBottomSheetStateRememberModalBottomSheetState, 7), composerStartRestartGroup, 54);
            int i7 = d.f43811a;
            be.c(null, modalBottomSheetStateRememberModalBottomSheetState, composableLambdaRememberComposableLambda, true, d.g(), composerStartRestartGroup, (ModalBottomSheetState.$stable << 3) | 28032, 1);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.main_screen.c.b.b(z, gVar, gVar2, lVar, i2, 10));
        }
    }

    public static void i(g gVar, g gVar2, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        int i4;
        int i5;
        com.waze.z.a.s sVar;
        int i6;
        x.f(gVar, "tollsSettingState");
        x.f(gVar2, "ferriesSettingState");
        x.f(lVar, "callback");
        int i7 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-873058825);
        if (i7 == 0) {
            i3 = (true != composerStartRestartGroup.changed(gVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(gVar2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        int i8 = i3 | DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS;
        int i9 = 0;
        if (composerStartRestartGroup.shouldExecute((i8 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-873058825, i8, -1, "com.waze.ui.route_settings.RouteSettingsMenuLayout (RouteSettingsMenu.kt:307)");
            }
            Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(com.waze.ui.r.a.d.d.b(Modifier.Companion, null), 0.0f, 1, null), com.waze.bz.a.d(composerStartRestartGroup, 0).h(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1972backgroundbw27NRU$default);
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
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 16.0f, 0.0f, 16.0f, 6.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 54);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.ROUTE_SETTINGS_SHEET_TITLE, composerStartRestartGroup, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).f(), composerStartRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(com.waze.design_components.b.d.n.b(), composerStartRestartGroup, 0);
            ColorFilter colorFilterM8269tintxETnrds$default = ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0, 2, null);
            Modifier modifierA = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.f43318e, null);
            int i10 = i8 & DisplayStrings.DS_TAP_TO_VERIFY;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i10 == 256 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new gv(lVar, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ImageKt.Image(painterPainterResource, (String) null, be.J(modifierA, false, null, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 6, 15), (Alignment) null, (ContentScale) null, 0.0f, colorFilterM8269tintxETnrds$default, composerStartRestartGroup, Painter.$stable | 48, 56);
            composerStartRestartGroup.endNode();
            if (gVar instanceof f) {
                composerStartRestartGroup.startReplaceGroup(-772800094);
                com.waze.z.a.a.a aVar = new com.waze.z.a.a.a(new com.waze.ui.ac.b(com.waze.design_components.b.d.bp.b()), (com.waze.z.a.s) null, 6);
                String strB = com.waze.ui.r.a.c.c.b(R.string.ROUTE_SETTINGS_AVOID_TOLLS_OPTION_TITLE, composerStartRestartGroup, 0);
                boolean zA = ((f) gVar).a();
                Modifier modifierA2 = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.f43314a, null);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i10 != 256) {
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    }
                    int i11 = i10;
                    i5 = 6;
                    sVar = null;
                    com.waze.z.a.a.h.j(strB, zA, (h.g.a.l) objRememberedValue2, modifierA2, true, null, aVar, composerStartRestartGroup, 199680, 80);
                    composerStartRestartGroup.endReplaceGroup();
                    i4 = i11;
                } else {
                    i10 = 256;
                }
                objRememberedValue2 = new p(lVar, i9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                int i112 = i10;
                i5 = 6;
                sVar = null;
                com.waze.z.a.a.h.j(strB, zA, (h.g.a.l) objRememberedValue2, modifierA2, true, null, aVar, composerStartRestartGroup, 199680, 80);
                composerStartRestartGroup.endReplaceGroup();
                i4 = i112;
            } else {
                i4 = i10;
                i5 = 6;
                sVar = null;
                composerStartRestartGroup.startReplaceGroup(-772314603);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (gVar2 instanceof f) {
                composerStartRestartGroup.startReplaceGroup(-772227431);
                com.waze.z.a.a.a aVar2 = new com.waze.z.a.a.a(new com.waze.ui.ac.b(com.waze.design_components.b.d.aX.b()), sVar, i5);
                String strB2 = com.waze.ui.r.a.c.c.b(R.string.ROUTE_SETTINGS_AVOID_FERRIES_OPTION_TITLE, composerStartRestartGroup, 0);
                boolean zA2 = ((f) gVar2).a();
                Modifier modifierA3 = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.f43316c, null);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (i4 == 256 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new p(lVar, 2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                i6 = i4;
                com.waze.z.a.a.h.j(strB2, zA2, (h.g.a.l) objRememberedValue3, modifierA3, true, null, aVar2, composerStartRestartGroup, 199680, 80);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i6 = i4;
                composerStartRestartGroup.startReplaceGroup(-771733291);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierA4 = com.waze.ui.r.a.d.d.a(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, sVar), com.waze.ui.r.a.d.c.f43317d, null);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (i6 == 256 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new gv(lVar, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierJ = be.J(modifierA4, false, null, (h.g.a.a) objRememberedValue4, composerStartRestartGroup, 6, 15);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 54);
            int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierJ);
            h.g.a.a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.ROUTE_SETTINGS_VIEW_ALL_SETTINGS_OPTION_TITLE, composerStartRestartGroup, 0), PaddingKt.m2755padding3ABfNKs(Modifier.Companion, 16.0f), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).m(), composerStartRestartGroup, 48, 0, 65532);
            composerStartRestartGroup = composerStartRestartGroup;
            ImageKt.Image(PainterResources_androidKt.painterResource(com.waze.design_components.b.d.T.b(), composerStartRestartGroup, 0), (String) null, PaddingKt.m2755padding3ABfNKs(RotateKt.rotate(Modifier.Companion, 180.0f), 16.0f), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0, 2, null), composerStartRestartGroup, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 56);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.m2808height3ABfNKs(PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, sVar), 16.0f, 0.0f, 0.0f, 16.0f, 6, null), 1.0f), com.waze.bz.a.d(composerStartRestartGroup, 0).K(), null, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ag(gVar, gVar2, lVar, i2, 14));
        }
    }

    public static void j(Context context, View view) {
        InputMethodManager inputMethodManager;
        if (context == null || view == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return;
        }
        int i2 = lm.f25154a;
        Activity activityS = com.waze.shared_infra.i.h.s(context);
        if (activityS != null && activityS == lm.d().e()) {
            com.waze.view.navbar.o.d().e();
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void k(Context context, View view) {
        InputMethodManager inputMethodManager;
        if (context == null || view == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return;
        }
        int i2 = lm.f25154a;
        Activity activityS = com.waze.shared_infra.i.h.s(context);
        if (activityS != null && activityS == lm.d().e()) {
            NativeManager.getInstance().showTypingWhileDrivingWarningIfNeeded();
        }
        inputMethodManager.showSoftInput(view, 0);
    }

    public static void l(Context context, View view) {
        if (context == null || view == null) {
            return;
        }
        com.waze.t.m(new com.google.firebase.messaging.m(context, view, 10, null), 200L);
    }

    public static void m(Context context) {
        f43843a = context.getApplicationContext();
    }

    public static boolean n() {
        Context context = f43843a;
        return context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.any");
    }

    public List a() {
        throw null;
    }
}
