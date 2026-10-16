package com.waze.ui.a;

import android.content.res.Configuration;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import com.waze.trip_overview.cj;
import com.waze.z.a.be;
import h.ab;
import h.g.b.ar;
import java.util.Arrays;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l {
    public static /* synthetic */ ab a(h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-26702445, i2, -1, "com.waze.ui.ads.AdScreen.<anonymous>.<anonymous> (AdScreen.kt:168)");
            }
            r(aVar, aVar2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static /* synthetic */ ab b(u uVar, h.g.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.l lVar2, h.g.a.a aVar3, h.g.a.a aVar4, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(94473948, i2, -1, "com.waze.ui.ads.AdScreen.<anonymous>.<anonymous> (AdScreen.kt:153)");
            }
            s(uVar, lVar, aVar, aVar2, lVar2, aVar3, aVar4, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab c(h.g.a.a aVar, h.g.a.a aVar2, int i2, Composer composer) {
        r(aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab d(u uVar, h.g.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.l lVar2, h.g.a.a aVar3, h.g.a.a aVar4, int i2, Composer composer) {
        s(uVar, lVar, aVar, aVar2, lVar2, aVar3, aVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final void e(final u uVar, final h.g.a.l lVar, final h.g.a.l lVar2, final h.g.a.a aVar, final h.g.a.a aVar2, final h.g.a.a aVar3, final h.g.a.a aVar4, final h.g.a.a aVar5, final h.g.a.a aVar6, final h.g.a.a aVar7, final h.g.a.a aVar8, final h.g.a.a aVar9, final Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        h.g.b.x.f(uVar, "state");
        h.g.b.x.f(lVar, "onSizeChanged");
        h.g.b.x.f(lVar2, "onAdSheetShown");
        h.g.b.x.f(aVar, "onClosePressed");
        h.g.b.x.f(aVar2, "onBackPressed");
        h.g.b.x.f(aVar3, "onOutsideAdPressed");
        h.g.b.x.f(aVar4, "onOutsideAdInfoPressed");
        h.g.b.x.f(aVar5, "onInfoPressed");
        h.g.b.x.f(aVar6, "onPrimaryCtaPressed");
        h.g.b.x.f(aVar7, "onAdInfoPressed");
        h.g.b.x.f(aVar8, "onAdInfoClosePressed");
        h.g.b.x.f(aVar9, "onMoreAdInfoPressed");
        int i7 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2128512031);
        if (i7 == 0) {
            i4 = (true != composerStartRestartGroup.changed(uVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            z = true;
            i4 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 128 : 256;
        } else {
            z = true;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= z != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            z2 = true;
            i4 |= true != composerStartRestartGroup.changedInstance(aVar4) ? 524288 : 1048576;
        } else {
            z2 = true;
        }
        if ((12582912 & i2) == 0) {
            i4 |= z2 != composerStartRestartGroup.changedInstance(aVar5) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar6) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar7) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            z3 = true;
            i5 = i3 | (true != composerStartRestartGroup.changedInstance(aVar8) ? 2 : 4);
        } else {
            z3 = true;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= z3 == composerStartRestartGroup.changedInstance(aVar9) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 = i5 | (true == composerStartRestartGroup.changed(modifier) ? 256 : 128);
        } else {
            i6 = i5;
        }
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i6 & 147) == 146) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2128512031, i4, i6, "com.waze.ui.ads.AdScreen (AdScreen.kt:97)");
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(modifier, ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2 ? 16.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
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
            ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, true, composerStartRestartGroup, DisplayStrings.DS_AAOS_SOUND_OFF, 6);
            ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState2 = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Expanded, null, null, true, composerStartRestartGroup, DisplayStrings.DS_AAOS_SOUND_OFF, 6);
            Boolean boolValueOf = Boolean.valueOf(uVar.h());
            boolean zChangedInstance = ((i4 & 14) == 4) | composerStartRestartGroup.changedInstance(modalBottomSheetStateRememberModalBottomSheetState) | composerStartRestartGroup.changedInstance(modalBottomSheetStateRememberModalBottomSheetState2);
            j jVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || jVarRememberedValue == Composer.Companion.getEmpty()) {
                jVarRememberedValue = new j(uVar, modalBottomSheetStateRememberModalBottomSheetState, modalBottomSheetStateRememberModalBottomSheetState2, null);
                composerStartRestartGroup.updateRememberedValue(jVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (h.g.a.p<? super af, ? super h.c.e<? super ab>, ? extends Object>) jVarRememberedValue, composerStartRestartGroup, 0);
            ModalBottomSheetValue targetValue = modalBottomSheetStateRememberModalBottomSheetState.getTargetValue();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(modalBottomSheetStateRememberModalBottomSheetState) | ((3670016 & i4) == 1048576);
            k kVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || kVarRememberedValue == Composer.Companion.getEmpty()) {
                kVarRememberedValue = new k(modalBottomSheetStateRememberModalBottomSheetState, aVar4, null);
                composerStartRestartGroup.updateRememberedValue(kVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(targetValue, (h.g.a.p<? super af, ? super h.c.e<? super ab>, ? extends Object>) kVarRememberedValue, composerStartRestartGroup, 0);
            if (modalBottomSheetStateRememberModalBottomSheetState2.getTargetValue() == ModalBottomSheetValue.Hidden && modalBottomSheetStateRememberModalBottomSheetState2.isVisible() && !uVar.h()) {
                composerStartRestartGroup.startReplaceGroup(187197792);
                int i8 = 458752 & i4;
                ab abVar = ab.f48028a;
                f fVarRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i8 == 131072 || fVarRememberedValue == Composer.Companion.getEmpty()) {
                    fVarRememberedValue = new f(aVar3, (h.c.e) null, 2);
                    composerStartRestartGroup.updateRememberedValue(fVarRememberedValue);
                }
                EffectsKt.LaunchedEffect(abVar, (h.g.a.p<? super af, ? super h.c.e<? super ab>, ? extends Object>) fVarRememberedValue, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(187254491);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup = composerStartRestartGroup;
            be.c(null, modalBottomSheetStateRememberModalBottomSheetState2, ComposableLambdaKt.rememberComposableLambda(94473948, true, new com.waze.modules.navigation.s(uVar, lVar, aVar, aVar7, lVar2, aVar5, aVar6, 2), composerStartRestartGroup, 54), false, null, composerStartRestartGroup, (ModalBottomSheetState.$stable << 3) | DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION, 17);
            be.c(null, modalBottomSheetStateRememberModalBottomSheetState, ComposableLambdaKt.rememberComposableLambda(-26702445, true, new com.waze.parking.f(aVar8, aVar9, 14, null), composerStartRestartGroup, 54), false, null, composerStartRestartGroup, (ModalBottomSheetState.$stable << 3) | DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION, 17);
            int i9 = 57344 & i4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i9 == 16384 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.settings.g.a.b(aVar2, 17);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(false, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.a.h
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    u uVar2 = uVar;
                    h.g.a.l lVar3 = lVar;
                    h.g.a.l lVar4 = lVar2;
                    h.g.a.a aVar10 = aVar;
                    h.g.a.a aVar11 = aVar2;
                    h.g.a.a aVar12 = aVar3;
                    h.g.a.a aVar13 = aVar4;
                    h.g.a.a aVar14 = aVar5;
                    h.g.a.a aVar15 = aVar6;
                    h.g.a.a aVar16 = aVar7;
                    h.g.a.a aVar17 = aVar8;
                    h.g.a.a aVar18 = aVar9;
                    int i10 = i2;
                    l.e(uVar2, lVar3, lVar4, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
                    return ab.f48028a;
                }
            });
        }
    }

    public static final /* synthetic */ u f() {
        com.waze.ui.ac.g gVar = new com.waze.ui.ac.g("some url");
        o oVar = o.f41688a;
        h.o.c cVar = h.o.a.f48264a;
        return new u(gVar, oVar, h.o.a.z(h.o.c.i(1, h.o.d.f48273d)));
    }

    public static /* synthetic */ ab g(h.g.a.l lVar, Painter painter, Composer composer, int i2) {
        h.g.b.x.f(painter, "painter");
        if ((i2 & 6) == 0) {
            i2 |= true != ((i2 & 8) == 0 ? composer.changed(painter) : composer.changedInstance(painter)) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2098014060, i2, -1, "com.waze.ui.ads.AdHeaderLayout.<anonymous>.<anonymous>.<anonymous> (AdHeader.kt:110)");
            }
            ab abVar = ab.f48028a;
            boolean zChanged = composer.changed(lVar);
            f fVarRememberedValue = composer.rememberedValue();
            if (zChanged || fVarRememberedValue == Composer.Companion.getEmpty()) {
                fVarRememberedValue = new f(lVar, null, 1, null);
                composer.updateRememberedValue(fVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(abVar, (h.g.a.p<? super af, ? super h.c.e<? super ab>, ? extends Object>) fVarRememberedValue, composer, 6);
            u(painter, composer, (i2 & 14) | Painter.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static final void h(String str, com.waze.ui.ac.i iVar, q qVar, String str2, h.o.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, final h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(aVar2, "onClosePressed");
        h.g.b.x.f(aVar3, "onAdInfoPressed");
        h.g.b.x.f(lVar, "onAdSheetShown");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-457264677);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(iVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(qVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(aVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 4194304 : 8388608;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-457264677, i3, -1, "com.waze.ui.ads.AdHeaderLayout (AdHeader.kt:71)");
            }
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).h(), null, 2, null), null, false, 3, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 48);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            t(aVar3, composerStartRestartGroup, (i3 >> 18) & 14);
            SpacerKt.Spacer(RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            int i5 = i3;
            be.g(com.waze.design_components.b.d.n, be.J(com.waze.ui.r.a.d.d.a(BackgroundKt.m1971backgroundbw27NRU(Modifier.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).h(), RoundedCornerShapeKt.getCircleShape()), com.waze.ui.r.a.d.c.ch, null), false, null, aVar2, composerStartRestartGroup, i3 & 458752, 15), com.waze.design_components.b.e.f23312a, com.waze.bz.a.d(composerStartRestartGroup, 0).o(), composerStartRestartGroup, DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT, 0);
            composerStartRestartGroup.endNode();
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Modifier modifierWeight$default = RowScope.CC.weight$default(RowScopeInstance.INSTANCE, Modifier.Companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iB4 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            h.g.a.a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB4), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            String str3 = str == null ? "" : str;
            TextKt.m4275Text4IGK_g(str3, PaddingKt.m2759paddingqDBjuR0$default(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.cb, null), 0.0f, 0.0f, 0.0f, 4.0f, 7, null), com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m11069getEllipsisgIe3tQ8(), false, 2, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).f(), composerStartRestartGroup, 48, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 55288);
            v(qVar, str2, aVar, composerStartRestartGroup, (i5 >> 6) & 1022);
            composerStartRestartGroup.endNode();
            if (((Boolean) composerStartRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-782458290);
                u(com.waze.ui.r.a.a.t.e(new com.waze.ui.ac.f(R.drawable.wazer_outline_24px), null, composerStartRestartGroup, 0, 6), composerStartRestartGroup, Painter.$stable);
                composerStartRestartGroup.endReplaceGroup();
            } else if (iVar != null) {
                composerStartRestartGroup.startReplaceGroup(-782304127);
                com.waze.ui.r.a.a.g gVarD = com.waze.ui.r.a.a.t.d(iVar, composerStartRestartGroup, (i5 >> 3) & 14);
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-2098014060, true, new com.waze.main_screen.c.b.a(lVar, 16), composerStartRestartGroup, 54);
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1361918858, true, new h.g.a.p() { // from class: com.waze.ui.a.a
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1361918858, iIntValue, -1, "com.waze.ui.ads.AdHeaderLayout.<anonymous>.<anonymous>.<anonymous> (AdHeader.kt:114)");
                            }
                            h.g.a.l lVar2 = lVar;
                            ab abVar = ab.f48028a;
                            boolean zChanged = composer2.changed(lVar2);
                            f fVarRememberedValue = composer2.rememberedValue();
                            if (zChanged || fVarRememberedValue == Composer.Companion.getEmpty()) {
                                fVarRememberedValue = new f(lVar2, (h.c.e) null, 0);
                                composer2.updateRememberedValue(fVarRememberedValue);
                            }
                            EffectsKt.LaunchedEffect(abVar, (h.g.a.p<? super af, ? super h.c.e<? super ab>, ? extends Object>) fVarRememberedValue, composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        return ab.f48028a;
                    }
                }, composerStartRestartGroup, 54);
                int i6 = w.f41701a;
                be.f(gVarD, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, w.a(), composerStartRestartGroup, DisplayStrings.DS_REPORTING_AGENT_CAR_PLAY_IDLE_TITLE, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-781935816);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.notifications.c.e(str, iVar, qVar, str2, aVar, aVar2, aVar3, lVar, i2, 1));
        }
    }

    static final ab i(h.g.a.a aVar, int i2, Composer composer) {
        t(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab j(Painter painter, int i2, Composer composer) {
        u(painter, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab k(int i2, Composer composer) {
        v(null, null, null, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab l(q qVar, String str, h.o.a aVar, int i2, Composer composer) {
        v(qVar, str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab m(u uVar, int i2, Composer composer) {
        w(uVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final String o(com.waze.ui.ac.n nVar, Composer composer, int i2) {
        String strC;
        h.g.b.x.f(nVar, "source");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1682000331, i2, -1, "com.waze.ui.mobile.infra.strings.wazeString (TextSourceImpl.kt:8)");
        }
        if (nVar instanceof com.waze.ui.ac.j) {
            composer.startReplaceGroup(-1494611563);
            strC = com.waze.ui.r.a.c.c.b(((com.waze.ui.ac.j) nVar).a(), composer, 0);
            composer.endReplaceGroup();
        } else if (nVar instanceof com.waze.ui.ac.k) {
            composer.startReplaceGroup(-1494609339);
            com.waze.ui.ac.k kVar = (com.waze.ui.ac.k) nVar;
            int iA = kVar.a();
            Object[] objArrB = kVar.b();
            strC = com.waze.ui.r.a.c.c.d(iA, Arrays.copyOf(objArrB, objArrB.length), composer);
            composer.endReplaceGroup();
        } else if (nVar instanceof com.waze.ui.ac.m) {
            composer.startReplaceGroup(-1494606758);
            composer.endReplaceGroup();
            strC = ((com.waze.ui.ac.m) nVar).a();
        } else {
            if (!(nVar instanceof com.waze.ui.ac.l)) {
                composer.startReplaceGroup(-1494612795);
                composer.endReplaceGroup();
                throw new h.i();
            }
            composer.startReplaceGroup(-1494605452);
            strC = com.waze.ui.r.a.c.c.c(((com.waze.ui.ac.l) nVar).a(), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strC;
    }

    public static final af p(com.waze.ui.r.a.b.a aVar, String str) {
        h.g.b.x.f(aVar, "<this>");
        int i2 = av.f51370a;
        h.c.j jVarPlus = ac.f51860a.c().plus(aj.Q());
        if (str == null) {
            Class<?> cls = aVar.getClass();
            int i3 = ar.f48106a;
            str = new h.g.b.m(cls).c();
            if (str == null) {
                str = String.valueOf(System.identityHashCode(aVar));
            }
        }
        return aj.e(jVarPlus.plus(new ae(str)));
    }

    private static final void r(h.g.a.a aVar, h.g.a.a aVar2, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        final h.g.a.a aVar3;
        final h.g.a.a aVar4;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(115237292);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(115237292, i3, -1, "com.waze.ui.ads.AdInfoLayout (AdScreen.kt:236)");
            }
            Modifier modifierM2755padding3ABfNKs = PaddingKt.m2755padding3ABfNKs(BackgroundKt.m1972backgroundbw27NRU$default(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.ca, null), com.waze.bz.a.d(composerStartRestartGroup, 0).h(), null, 2, null), 16.0f);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 48);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2755padding3ABfNKs);
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
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.AD_ABOUT_TITLE, composerStartRestartGroup, 0), rowScopeInstance.align(RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), Alignment.Companion.getCenterVertically()), com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).f(), composerStartRestartGroup, 0, 0, 65528);
            int i5 = i3;
            be.g(com.waze.design_components.b.d.n, ClickableKt.m2007clickableoSLSa3U$default(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.ch, null), false, null, null, null, aVar, 15, null), com.waze.design_components.b.e.f23312a, com.waze.bz.a.d(composerStartRestartGroup, 0).o(), composerStartRestartGroup, DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT, 0);
            composerStartRestartGroup.endNode();
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.AD_ABOUT_BODY, composerStartRestartGroup, 0), PaddingKt.m2757paddingVpY3zN4$default(columnScopeInstance.align(Modifier.Companion, Alignment.Companion.getStart()), 0.0f, 8.0f, 1, null), com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).b(), composerStartRestartGroup, 0, 0, 65528);
            aVar4 = aVar2;
            aVar3 = aVar;
            be.o(aVar4, PaddingKt.m2759paddingqDBjuR0$default(BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), com.waze.bz.a.d(composerStartRestartGroup, 0).h(), null, 2, null), 0.0f, 16.0f, 0.0f, 0.0f, 13, null), com.waze.ui.r.a.c.c.b(R.string.AD_ABOUT_BUTTON, composerStartRestartGroup, 0), null, com.waze.z.a.b.n.e(com.waze.design_components.button.g.f23359b, null, com.waze.design_components.button.e.f23349a, 2), null, false, false, composerStartRestartGroup, (i5 >> 3) & 14, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_4);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            aVar3 = aVar;
            aVar4 = aVar2;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.a.i
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return l.c(aVar3, aVar4, i2, (Composer) obj);
                }
            });
        }
    }

    private static final void s(final u uVar, final h.g.a.l lVar, final h.g.a.a aVar, final h.g.a.a aVar2, final h.g.a.l lVar2, final h.g.a.a aVar3, final h.g.a.a aVar4, Composer composer, final int i2) {
        u uVar2;
        int i3;
        h.g.a.l lVar3;
        Composer composer2;
        String strB;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(409724466);
        if (i4 == 0) {
            uVar2 = uVar;
            i3 = (true != composerStartRestartGroup.changed(uVar2) ? 2 : 4) | i2;
        } else {
            uVar2 = uVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            lVar3 = lVar2;
            i3 |= true != composerStartRestartGroup.changedInstance(lVar3) ? 8192 : 16384;
        } else {
            lVar3 = lVar2;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar4) ? 524288 : 1048576;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(409724466, i3, -1, "com.waze.ui.ads.AdLayout (AdScreen.kt:188)");
            }
            t tVarB = uVar2.b();
            if (h.g.b.x.n(tVarB, r.f41690a)) {
                composerStartRestartGroup.startReplaceGroup(-1391769013);
                strB = com.waze.ui.r.a.c.c.b(R.string.AD_PREVIEW_ADD_A_STOP_BUTTON, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!h.g.b.x.n(tVarB, s.f41691a)) {
                    composerStartRestartGroup.startReplaceGroup(-1391770945);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                composerStartRestartGroup.startReplaceGroup(-1391765679);
                strB = com.waze.ui.r.a.c.c.b(R.string.AD_PREVIEW_START_NAVIGATION_BUTTON, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.bZ, null), 0.0f, 1, null), null, false, 3, null);
            int i5 = i3 & 112;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.tide.a.c(lVar, 16);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM2755padding3ABfNKs = PaddingKt.m2755padding3ABfNKs(OnRemeasuredModifierKt.onSizeChanged(modifierWrapContentHeight$default, (h.g.a.l) objRememberedValue), 16.0f);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 48);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2755padding3ABfNKs);
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
            h(uVar.f(), uVar.c(), uVar.a(), uVar.e(), uVar.g(), aVar, aVar2, lVar3, composerStartRestartGroup, (i3 << 9) & android.R.attr.shouldUseDefaultUnfoldTransition);
            composer2 = composerStartRestartGroup;
            String strB2 = com.waze.ui.r.a.c.c.b(R.string.AD_PREVIEW_MORE_INFO_BUTTON, composer2, 0);
            com.waze.design_components.button.g gVar = com.waze.design_components.button.g.f23359b;
            com.waze.design_components.button.e eVar = com.waze.design_components.button.e.f23349a;
            com.waze.z.a.ar arVarE = com.waze.z.a.b.n.e(gVar, null, eVar, 2);
            com.waze.z.a.ar arVarE2 = com.waze.z.a.b.n.e(null, null, eVar, 3);
            int i6 = i3 >> 15;
            String str = strB;
            com.waze.design_components.g.b.i(aVar3, aVar4, strB2, str, new com.waze.z.a.d(1.0f, 1.0f), PaddingKt.m2759paddingqDBjuR0$default(BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), com.waze.bz.a.d(composer2, 0).h(), null, 2, null), 0.0f, 16.0f, 0.0f, 0.0f, 13, null), null, arVarE, null, false, null, arVarE2, null, false, composer2, (i6 & 14) | 24576 | (i6 & 112), 0, 14144);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.a.g
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return l.d(uVar, lVar, aVar, aVar2, lVar2, aVar3, aVar4, i2, (Composer) obj);
                }
            });
        }
    }

    private static final void t(h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1944452697);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1944452697, i3, -1, "com.waze.ui.ads.AdInfoButton (AdHeader.kt:184)");
            }
            Modifier modifierClip = ClipKt.clip(BackgroundKt.m1971backgroundbw27NRU(Modifier.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).N(), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(8.0f)), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(8.0f));
            int i6 = i3 & 14;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 4 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.settings.g.a.b(aVar, 16);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(be.J(modifierClip, false, null, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 0, 15), 8.0f, 2.0f, 0.0f, 2.0f, 4, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            i4 = 2;
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.AD_PREVIEW_ABOUT_THIS_AD_BADGE, composerStartRestartGroup, 0), (Modifier) null, com.waze.bz.a.d(composerStartRestartGroup, 0).q(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m11069getEllipsisgIe3tQ8(), false, 1, 0, (h.g.a.l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).j(), composerStartRestartGroup, 0, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 55290);
            ImageKt.Image(com.waze.ui.r.a.a.t.e(new com.waze.ui.ac.f(com.waze.design_components.b.d.N.b()), null, composerStartRestartGroup, 0, 6), (String) null, SizeKt.m2822size3ABfNKs(PaddingKt.m2757paddingVpY3zN4$default(Modifier.Companion, 2.0f, 0.0f, 2, null), 14.0f), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).q(), 0, 2, null), composerStartRestartGroup, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 56);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i4 = 2;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e(aVar, i2, i4));
        }
    }

    private static final void u(Painter painter, Composer composer, int i2) {
        int i3;
        Painter painter2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-296302264);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(painter) : composerStartRestartGroup.changedInstance(painter)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-296302264, i3, -1, "com.waze.ui.ads.AdLogoImage (AdHeader.kt:122)");
            }
            painter2 = painter;
            ImageKt.Image(painter2, (String) null, BackgroundKt.m1971backgroundbw27NRU(ClipKt.clip(SizeKt.m2824sizeVpY3zN4(PaddingKt.m2759paddingqDBjuR0$default(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.cc, null), 12.0f, 0.0f, 0.0f, 0.0f, 14, null), 48.0f, 48.0f), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(4.0f)), com.waze.bz.a.d(composerStartRestartGroup, 0).g(), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(4.0f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48 | (i3 & 14), 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            painter2 = painter;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e(painter2, i2, i5));
        }
    }

    private static final void v(final q qVar, final String str, final h.o.a aVar, Composer composer, final int i2) {
        int i3;
        String strB;
        com.waze.z.a.c cVar;
        int i4;
        int i5;
        int i6;
        String strD;
        int i7 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1104164175);
        if (i7 == 0) {
            i3 = (true != composerStartRestartGroup.changed(qVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(aVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1104164175, i3, -1, "com.waze.ui.ads.Badges (AdHeader.kt:145)");
            }
            if (qVar == null && str == null && aVar == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.a.c
                        @Override // h.g.a.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            return l.k(i2, (Composer) obj);
                        }
                    });
                    return;
                }
                return;
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM2440spacedBy0680j_4 = Arrangement.INSTANCE.m2440spacedBy0680j_4(8.0f);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM2440spacedBy0680j_4, Alignment.Companion.getTop(), composerStartRestartGroup, 6);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (qVar == null) {
                composerStartRestartGroup.startReplaceGroup(28760707);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(28760708);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1867118925, 0, -1, "com.waze.ui.ads.evaluateString (AdHeader.kt:221)");
                }
                o oVar = o.f41688a;
                if (h.g.b.x.n(qVar, oVar)) {
                    composerStartRestartGroup.startReplaceGroup(995046185);
                    strB = com.waze.ui.r.a.c.c.b(R.string.LOCATION_PREVIEW_NOW_OPEN, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (h.g.b.x.n(qVar, p.f41689a)) {
                    composerStartRestartGroup.startReplaceGroup(995049163);
                    strB = com.waze.ui.r.a.c.c.b(R.string.LOCATION_PREVIEW_OPENS_SOON, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (h.g.b.x.n(qVar, n.f41687a)) {
                    composerStartRestartGroup.startReplaceGroup(995052204);
                    strB = com.waze.ui.r.a.c.c.b(R.string.LOCATION_PREVIEW_CLOSES_SOON, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!h.g.b.x.n(qVar, m.f41686a)) {
                        composerStartRestartGroup.startReplaceGroup(995045077);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new h.i();
                    }
                    composerStartRestartGroup.startReplaceGroup(995055117);
                    strB = com.waze.ui.r.a.c.c.b(R.string.LOCATION_PREVIEW_CLOSED_TODAY, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                String str2 = strB;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                h.g.b.x.f(qVar, "<this>");
                if (h.g.b.x.n(qVar, oVar)) {
                    cVar = com.waze.z.a.c.f45819e;
                } else if (h.g.b.x.n(qVar, p.f41689a) || h.g.b.x.n(qVar, n.f41687a)) {
                    cVar = com.waze.z.a.c.f45818d;
                } else {
                    if (!h.g.b.x.n(qVar, m.f41686a)) {
                        throw new h.i();
                    }
                    cVar = com.waze.z.a.c.f45817c;
                }
                com.waze.design_components.g.b.e(str2, cVar, PaddingKt.m2757paddingVpY3zN4$default(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.ce, null), 0.0f, 4.0f, 1, null), null, false, null, null, null, null, null, composerStartRestartGroup, 384, 1016);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(29043799);
                composerStartRestartGroup.endReplaceGroup();
                i4 = -1;
                i5 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(29043800);
                com.waze.design_components.b.d dVar = com.waze.design_components.b.d.aG;
                com.waze.design_components.b.e eVar = com.waze.design_components.b.e.f23313b;
                i4 = -1;
                i5 = 0;
                com.waze.design_components.g.b.e(str, com.waze.z.a.c.f45818d, PaddingKt.m2757paddingVpY3zN4$default(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.cd, null), 0.0f, 4.0f, 1, null), new com.waze.ui.ac.f(dVar.c(eVar)), false, new com.waze.ui.ac.f(com.waze.design_components.b.d.w.c(eVar)), null, null, null, null, composerStartRestartGroup, DisplayStrings.DS_DIRT_ROADS, DisplayStrings.DS_ONBOARDING_ADD_HOME_WORK_SET_HOME_BUTTON);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (aVar == null) {
                composerStartRestartGroup.startReplaceGroup(29497546);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(29497547);
                long jW = aVar.w();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1733907479, i5, i4, "com.waze.ui.ads.formatDetour (AdHeader.kt:231)");
                }
                if (h.o.a.l(jW) >= 1) {
                    composerStartRestartGroup.startReplaceGroup(-733858189);
                    long jN = h.o.a.n(jW) - (h.o.a.l(jW) * 60);
                    if (jN > 0) {
                        composerStartRestartGroup.startReplaceGroup(-733751797);
                        Long lValueOf = Long.valueOf(h.o.a.l(jW));
                        Long lValueOf2 = Long.valueOf(jN);
                        Object[] objArr = new Object[2];
                        objArr[i5] = lValueOf;
                        i6 = 1;
                        objArr[1] = lValueOf2;
                        strD = com.waze.ui.r.a.c.c.d(R.string.AD_PREVIEW_DETOUR_TIME_HOUR_AND_MIN_PD_PD, objArr, composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        i6 = 1;
                        composerStartRestartGroup.startReplaceGroup(-733589295);
                        Object[] objArr2 = new Object[1];
                        objArr2[i5] = Long.valueOf(h.o.a.l(jW));
                        strD = com.waze.ui.r.a.c.c.d(R.string.AD_PREVIEW_DETOUR_TIME_HOUR_PD, objArr2, composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    i6 = 1;
                    if (h.o.a.n(jW) >= 1) {
                        composerStartRestartGroup.startReplaceGroup(-162207136);
                        Object[] objArr3 = new Object[1];
                        objArr3[i5] = Long.valueOf(h.o.a.n(jW));
                        strD = com.waze.ui.r.a.c.c.d(R.string.AD_PREVIEW_DETOUR_TIME_MIN_PD, objArr3, composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-162204404);
                        Object[] objArr4 = new Object[1];
                        objArr4[i5] = 1;
                        strD = com.waze.ui.r.a.c.c.d(R.string.AD_PREVIEW_DETOUR_TIME_MIN_PD, objArr4, composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                String str3 = strD;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                com.waze.design_components.g.b.e(str3, com.waze.z.a.c.f45816b, PaddingKt.m2757paddingVpY3zN4$default(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.cf, null), 0.0f, 4.0f, i6, null), new com.waze.ui.ac.f(com.waze.design_components.b.d.f23301b.c(com.waze.design_components.b.e.f23313b)), false, null, null, null, null, null, composerStartRestartGroup, DisplayStrings.DS_DIRT_ROADS, 1008);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new h.g.a.p() { // from class: com.waze.ui.a.d
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return l.l(qVar, str, aVar, i2, (Composer) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(u uVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2092275882);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(uVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i6 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2092275882, i3, -1, "com.waze.ui.ads.PreviewAdHeader (AdHeader.kt:253)");
            }
            String strF = uVar.f();
            com.waze.ui.ac.i iVarC = uVar.c();
            q qVarA = uVar.a();
            String strE = uVar.e();
            h.o.a aVarG = uVar.g();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new b(i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            h.g.a.a aVar = (h.g.a.a) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new b(i6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            h.g.a.a aVar2 = (h.g.a.a) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new cj(16);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            h(strF, iVarC, qVarA, strE, aVarG, aVar, aVar2, (h.g.a.l) objRememberedValue3, composerStartRestartGroup, 14352384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e(uVar, i2, i5));
        }
    }
}
