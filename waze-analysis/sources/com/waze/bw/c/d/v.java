package com.waze.bw.c.d;

import android.content.res.Configuration;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.DragInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class v {
    public /* synthetic */ v(byte[] bArr) {
    }

    public static void A(bo boVar, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(boVar, "state");
        h.g.b.x.f(lVar, "callback");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1781084665);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(boVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1781084665, i3, -1, "com.waze.startstate.mobile.ui.FavoritesCarousel (FavoritesCarousel.kt:50)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            State<Boolean> stateCollectIsDraggedAsState = DragInteractionKt.collectIsDraggedAsState(lazyListStateRememberLazyListState.getInteractionSource(), composerStartRestartGroup, 0);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierA = com.waze.ui.r.a.d.d.a(SizeKt.m2808height3ABfNKs(Modifier.Companion, 64.0f), com.waze.ui.r.a.d.c.an, null);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            boolean z = (i3 & 14) == 4;
            boolean z2 = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.bw.a.b.l(boVar, lVar, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            boolean z3 = z2;
            LazyDslKt.LazyRow(modifierA, lazyListStateRememberLazyListState, null, false, null, centerVertically, null, false, null, (h.g.a.l) objRememberedValue, composerStartRestartGroup, 196614, DisplayStrings.DS_GAS_PRICE_UPDATE_LAST_UPDATE_TODAY);
            if (lazyListStateRememberLazyListState.getCanScrollBackward()) {
                composerStartRestartGroup.startReplaceGroup(-484385548);
                N(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenterStart()), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-484311551);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (lazyListStateRememberLazyListState.getCanScrollForward()) {
                composerStartRestartGroup.startReplaceGroup(-484268616);
                K(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenterEnd()), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-484198463);
                composerStartRestartGroup.endReplaceGroup();
            }
            Boolean boolValueOf = Boolean.valueOf(((Boolean) stateCollectIsDraggedAsState.getValue()).booleanValue());
            boolean zChanged = composerStartRestartGroup.changed(stateCollectIsDraggedAsState) | z3;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (h.g.a.p) new p(lVar, stateCollectIsDraggedAsState, (h.c.e) null, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.copilot.presentation.c(boVar, lVar, i2, 11));
        }
    }

    static h.ab B(Modifier modifier, int i2, Composer composer) {
        K(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab C(h.g.a.a aVar, int i2, Composer composer) {
        L(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab D(h.g.a.a aVar, int i2, Composer composer) {
        M(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab E(Modifier modifier, int i2, Composer composer) {
        N(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    private static void F(l lVar, com.waze.z.a.b.ab abVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1297395676);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(lVar) : composerStartRestartGroup.changedInstance(lVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(abVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1297395676, i3, -1, "com.waze.startstate.mobile.ui.ConsumeReturnFromSearchSignalLaunchedEffect (StartStateBottomSheet.kt:307)");
            }
            Integer numD = lVar.d();
            boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(lVar));
            boolean z2 = (i3 & 112) == 32;
            o oVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || oVarRememberedValue == Composer.Companion.getEmpty()) {
                oVarRememberedValue = new o(lVar, abVar, (h.c.e) null, 2, (char[]) null);
                composerStartRestartGroup.updateRememberedValue(oVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(numD, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) oVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new m(lVar, abVar, i2, i5));
        }
    }

    private static void G(final l lVar, final ModalBottomSheetState modalBottomSheetState, final com.waze.z.a.b.ab abVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1505006736);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(lVar) : composerStartRestartGroup.changedInstance(lVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(modalBottomSheetState) : composerStartRestartGroup.changedInstance(modalBottomSheetState)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(abVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1505006736, i3, -1, "com.waze.startstate.mobile.ui.ConsumeSheetCollapseSignalLaunchedEffect (StartStateBottomSheet.kt:326)");
            }
            Integer numE = lVar.e();
            boolean z = ((i3 & 14) == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(lVar))) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(modalBottomSheetState)));
            boolean z2 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            ci ciVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || ciVarRememberedValue == Composer.Companion.getEmpty()) {
                ciVarRememberedValue = new ci(lVar, modalBottomSheetState, abVar, (h.c.e) null, 1);
                composerStartRestartGroup.updateRememberedValue(ciVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(numE, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) ciVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.bw.c.d.n
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return v.i(lVar, modalBottomSheetState, abVar, i2, (Composer) obj);
                }
            });
        }
    }

    private static void H(ModalBottomSheetState modalBottomSheetState, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1890056186);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(modalBottomSheetState) : composerStartRestartGroup.changedInstance(modalBottomSheetState)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1890056186, i3, -1, "com.waze.startstate.mobile.ui.NotifyOptionsMenuClosedLaunchedEffect (StartStateBottomSheet.kt:384)");
            }
            ModalBottomSheetValue currentValue = modalBottomSheetState.getCurrentValue();
            ModalBottomSheetValue targetValue = modalBottomSheetState.getTargetValue();
            boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(modalBottomSheetState));
            boolean z2 = (i3 & 112) == 32;
            p pVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || pVarRememberedValue == Composer.Companion.getEmpty()) {
                pVarRememberedValue = new p(modalBottomSheetState, lVar, (h.c.e) null, 0);
                composerStartRestartGroup.updateRememberedValue(pVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(currentValue, targetValue, (h.g.a.p) pVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new m((Object) modalBottomSheetState, lVar, i2, 5));
        }
    }

    private static void I(com.waze.z.a.b.ab abVar, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1905283977);
        int i5 = 4;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(abVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1905283977, i3, -1, "com.waze.startstate.mobile.ui.NotifySheetExpansionChangedLaunchedEffect (StartStateBottomSheet.kt:345)");
            }
            boolean z = ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1;
            com.waze.z.a.b.ad adVarG = abVar.g();
            com.waze.z.a.b.ad adVarI = abVar.i();
            boolean zChanged = composerStartRestartGroup.changed(z) | ((i3 & 112) == 32) | ((i3 & 14) == 4);
            q qVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || qVarRememberedValue == Composer.Companion.getEmpty()) {
                qVarRememberedValue = new q(abVar, lVar, z, null);
                composerStartRestartGroup.updateRememberedValue(qVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(adVarG, adVarI, (h.g.a.p) qVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new m((Object) abVar, lVar, i2, i5));
        }
    }

    private static void J(l lVar, ModalBottomSheetState modalBottomSheetState, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-401388275);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(lVar) : composerStartRestartGroup.changedInstance(lVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(modalBottomSheetState) : composerStartRestartGroup.changedInstance(modalBottomSheetState)) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-401388275, i3, -1, "com.waze.startstate.mobile.ui.ToggleOptionsMenuDisplayLaunchedEffect (StartStateBottomSheet.kt:367)");
            }
            com.waze.tide.s sVarG = lVar.g();
            boolean z = ((i3 & 112) == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(modalBottomSheetState))) | ((i3 & 14) == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(lVar)));
            o oVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || oVarRememberedValue == Composer.Companion.getEmpty()) {
                oVarRememberedValue = new o(lVar, modalBottomSheetState, (h.c.e) null, 5);
                composerStartRestartGroup.updateRememberedValue(oVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(sVarG, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) oVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new m(lVar, modalBottomSheetState, i2, i5));
        }
    }

    private static void K(Modifier modifier, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(298406378);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(298406378, i3, -1, "com.waze.startstate.mobile.ui.EndGradient (FavoritesCarousel.kt:192)");
            }
            BoxKt.Box(com.waze.ui.r.a.d.d.a(BackgroundKt.background$default(SizeKt.m2827width3ABfNKs(SizeKt.m2808height3ABfNKs(Modifier.Companion, 64.0f), 24.0f), Brush.Companion.m8176horizontalGradient8A3gB4$default(Brush.Companion, new h.k[]{new h.k(Float.valueOf(0.0f), Color.m8218boximpl(Color.Companion.m8263getTransparent0d7_KjU())), new h.k(Float.valueOf(0.66f), Color.m8218boximpl(com.waze.bz.a.d(composerStartRestartGroup, 0).h()))}, 0.0f, Float.POSITIVE_INFINITY, 0, 8, (Object) null), null, 0.0f, 6, null), com.waze.ui.r.a.d.c.au, null).then(modifier), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h(modifier, i2, i5));
        }
    }

    private static void L(h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        h.g.a.a aVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1054486059);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1054486059, i3, -1, "com.waze.startstate.mobile.ui.MoreFavoriteDestinationCell (FavoritesCarousel.kt:237)");
            }
            Modifier modifierA = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.as, null);
            int i6 = b.f17977a;
            aVar2 = aVar;
            com.waze.z.a.be.F(aVar2, modifierA, null, b.a(), composerStartRestartGroup, (i3 & 14) | DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            aVar2 = aVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h(aVar2, i2, i5));
        }
    }

    private static void M(h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        h.g.a.a aVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-215766118);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-215766118, i3, -1, "com.waze.startstate.mobile.ui.NewFavoriteDestinationCell (FavoritesCarousel.kt:211)");
            }
            Modifier modifierA = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.ar, null);
            int i6 = b.f17977a;
            aVar2 = aVar;
            com.waze.z.a.be.F(aVar2, modifierA, null, b.b(), composerStartRestartGroup, (i3 & 14) | DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            aVar2 = aVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h(aVar2, i2, i5));
        }
    }

    private static void N(Modifier modifier, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1820236495);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1820236495, i3, -1, "com.waze.startstate.mobile.ui.StartGradient (FavoritesCarousel.kt:173)");
            }
            BoxKt.Box(com.waze.ui.r.a.d.d.a(BackgroundKt.background$default(SizeKt.m2827width3ABfNKs(SizeKt.m2808height3ABfNKs(Modifier.Companion, 64.0f), 24.0f), Brush.Companion.m8176horizontalGradient8A3gB4$default(Brush.Companion, new h.k[]{new h.k(Float.valueOf(0.33f), Color.m8218boximpl(com.waze.bz.a.d(composerStartRestartGroup, 0).h())), new h.k(Float.valueOf(1.0f), Color.m8218boximpl(Color.Companion.m8263getTransparent0d7_KjU()))}, 0.0f, Float.POSITIVE_INFINITY, 0, 8, (Object) null), null, 0.0f, 6, null), com.waze.ui.r.a.d.c.at, null).then(modifier), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h(modifier, i2, 3));
        }
    }

    private static float a(boolean z) {
        return z ? 110.0f : 80.0f;
    }

    private static void b(l lVar, com.waze.z.a.b.ab abVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(851052103);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(lVar) : composerStartRestartGroup.changedInstance(lVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(abVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(851052103, i3, -1, "com.waze.startstate.mobile.ui.CollapseSheetWhenRoamingLaunchedEffect (StartStateBottomSheet.kt:275)");
            }
            Boolean boolValueOf = Boolean.valueOf(lVar.f());
            com.waze.z.a.b.ad adVarH = abVar.h();
            boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(lVar));
            boolean z2 = (i3 & 112) == 32;
            o oVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || oVarRememberedValue == Composer.Companion.getEmpty()) {
                oVarRememberedValue = new o(lVar, abVar, (h.c.e) null, 1, (byte[]) null);
                composerStartRestartGroup.updateRememberedValue(oVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(boolValueOf, adVarH, (h.g.a.p) oVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new m(lVar, abVar, i2, 3));
        }
    }

    private static void c(l lVar, com.waze.z.a.b.ab abVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1387651199);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(lVar) : composerStartRestartGroup.changedInstance(lVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(abVar) ? 16 : 32;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1387651199, i3, -1, "com.waze.startstate.mobile.ui.ConsumeCenterOnMeClickedSignalLaunchedEffect (StartStateBottomSheet.kt:292)");
            }
            Integer numC = lVar.c();
            boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(lVar));
            boolean z2 = (i3 & 112) == 32;
            o oVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || oVarRememberedValue == Composer.Companion.getEmpty()) {
                oVarRememberedValue = new o(lVar, abVar, (h.c.e) null, 0);
                composerStartRestartGroup.updateRememberedValue(oVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(numC, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) oVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new m(lVar, abVar, i2, i5));
        }
    }

    public static /* synthetic */ com.waze.z.a.b.m d(Density density, boolean z) {
        return new com.waze.z.a.b.m(com.waze.z.a.b.c.f45740a, com.waze.z.a.b.g.f45743a, new com.waze.z.a.b.a(density.mo2121roundToPx0680j_4(a(z))));
    }

    public static /* synthetic */ com.waze.z.a.b.m e(Density density, float f2, boolean z) {
        return new com.waze.z.a.b.m(com.waze.z.a.b.c.f45740a, new com.waze.z.a.b.e(0.4f), new com.waze.z.a.b.a(density.mo2121roundToPx0680j_4(a(z)) + density.mo2121roundToPx0680j_4(f2)));
    }

    static h.ab f(l lVar, com.waze.z.a.b.ab abVar, int i2, Composer composer) {
        b(lVar, abVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab g(l lVar, com.waze.z.a.b.ab abVar, int i2, Composer composer) {
        c(lVar, abVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab h(l lVar, com.waze.z.a.b.ab abVar, int i2, Composer composer) {
        F(lVar, abVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab i(l lVar, ModalBottomSheetState modalBottomSheetState, com.waze.z.a.b.ab abVar, int i2, Composer composer) {
        G(lVar, modalBottomSheetState, abVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab j(ModalBottomSheetState modalBottomSheetState, h.g.a.l lVar, int i2, Composer composer) {
        H(modalBottomSheetState, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab k(com.waze.z.a.b.ab abVar, h.g.a.l lVar, int i2, Composer composer) {
        I(abVar, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(l lVar, com.waze.z.a.b.ab abVar, h.g.a.l lVar2, h.g.a.l lVar3, Composer composer, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        Object[] objArr;
        int i8;
        o oVar;
        com.waze.z.a.b.ab abVar2 = abVar;
        h.g.b.x.f(lVar, "state");
        h.g.b.x.f(lVar2, "callback");
        h.g.b.x.f(lVar3, "optionsMenuCallback");
        int i9 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1822733274);
        if (i9 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(lVar) : composerStartRestartGroup.changedInstance(lVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(abVar2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar3) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1822733274, i3, -1, "com.waze.startstate.mobile.ui.StartStateBottomSheet (StartStateBottomSheet.kt:94)");
            }
            if (((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2) {
                i4 = i3;
                z = true;
            } else {
                i4 = i3;
                z = false;
            }
            ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, true, composerStartRestartGroup, DisplayStrings.DS_AAOS_SOUND_OFF, 6);
            H(modalBottomSheetStateRememberModalBottomSheetState, lVar3, composerStartRestartGroup, ((i4 >> 6) & 112) | ModalBottomSheetState.$stable);
            int i10 = i4 & 14;
            J(lVar, modalBottomSheetStateRememberModalBottomSheetState, composerStartRestartGroup, (ModalBottomSheetState.$stable << 3) | i10);
            int i11 = i4 >> 3;
            int i12 = i11 & 14;
            I(abVar2, lVar2, composerStartRestartGroup, i11 & 126);
            G(lVar, modalBottomSheetStateRememberModalBottomSheetState, abVar2, composerStartRestartGroup, ((i4 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | i10 | (ModalBottomSheetState.$stable << 3));
            int i13 = i4 & 126;
            F(lVar, abVar2, composerStartRestartGroup, i13);
            c(lVar, abVar2, composerStartRestartGroup, i13);
            b(lVar, abVar2, composerStartRestartGroup, i13);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            float fMo2704calculateBottomPaddingD9Ej5fM = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composerStartRestartGroup, 6), composerStartRestartGroup, 0).mo2704calculateBottomPaddingD9Ej5fM();
            boolean zG = lVar.b().g();
            Object[] objArr2 = {Boolean.valueOf(z), density, Dp.m11162boximpl(fMo2704calculateBottomPaddingD9Ej5fM), Boolean.valueOf(zG)};
            int i14 = (i4 & 112) ^ 48;
            boolean zChanged = composerStartRestartGroup.changed(z) | composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(zG) | composerStartRestartGroup.changed(fMo2704calculateBottomPaddingD9Ej5fM) | ((i14 > 32 && composerStartRestartGroup.changed(abVar2)) || (i4 & 48) == 32);
            r rVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || rVarRememberedValue == Composer.Companion.getEmpty()) {
                i5 = i14;
                i6 = 0;
                i7 = i4;
                objArr = objArr2;
                abVar2 = abVar;
                rVarRememberedValue = new r(z, density, zG, fMo2704calculateBottomPaddingD9Ej5fM, abVar, null);
                composerStartRestartGroup.updateRememberedValue(rVarRememberedValue);
            } else {
                i7 = i4;
                i5 = i14;
                i6 = 0;
                objArr = objArr2;
            }
            EffectsKt.LaunchedEffect(objArr, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) rVarRememberedValue, composerStartRestartGroup, i6);
            boolean z2 = lVar.g() != null ? 1 : i6;
            int i15 = i7 & 7168;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i15 == 2048 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.search.v2.bv(lVar3, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(z2, (h.g.a.a) objRememberedValue, composerStartRestartGroup, i6, i6);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Ref ref = (Ref) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                u uVar = new u(InteractionSourceKt.MutableInteractionSource(), lVar2);
                composerStartRestartGroup.updateRememberedValue(uVar);
                objRememberedValue3 = uVar;
            }
            u uVar2 = (u) objRememberedValue3;
            com.waze.tide.s sVarG = lVar.g();
            if (sVarG == null) {
                sVarG = (com.waze.tide.s) ref.getValue();
            }
            ref.setValue(sVarG);
            h.ab abVar3 = h.ab.f48028a;
            int i16 = (composerStartRestartGroup.changedInstance(modalBottomSheetStateRememberModalBottomSheetState) ? 1 : 0) | (((i5 <= 32 || !composerStartRestartGroup.changed(abVar2)) && (i7 & 48) != 32) ? i6 : 1);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            byte[] bArr = null;
            if (i16 != 0 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                i8 = 3;
                oVar = new o(abVar2, modalBottomSheetStateRememberModalBottomSheetState, (h.c.e) null, 3);
                composerStartRestartGroup.updateRememberedValue(oVar);
            } else {
                oVar = objRememberedValue4;
                i8 = 3;
            }
            EffectsKt.LaunchedEffect(abVar3, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) oVar, composerStartRestartGroup, 6);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(i6, i6, composerStartRestartGroup, i6, i8);
            com.waze.z.a.b.x xVarA = com.waze.z.a.b.y.a(abVar2, lazyListStateRememberLazyListState, composerStartRestartGroup, i12);
            int i17 = (composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 1 : 0) | (((i5 <= 32 || !composerStartRestartGroup.changed(abVar2)) && (i7 & 48) != 32) ? i6 : 1);
            o oVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i17 != 0 || oVarRememberedValue == Composer.Companion.getEmpty()) {
                oVarRememberedValue = new o(abVar2, lazyListStateRememberLazyListState, (h.c.e) null, 4);
                composerStartRestartGroup.updateRememberedValue(oVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(abVar2, lazyListStateRememberLazyListState, (h.g.a.p) oVarRememberedValue, composerStartRestartGroup, i12);
            com.waze.z.a.be.c(null, modalBottomSheetStateRememberModalBottomSheetState, ComposableLambdaKt.rememberComposableLambda(-1238825765, true, new com.waze.parking.f(ref, lVar3, 10, bArr), composerStartRestartGroup, 54), ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1 ? 1 : i6, ComposableLambdaKt.rememberComposableLambda(-1219284643, true, new com.waze.ui.t.a(abVar2, uVar2, lVar, lVar2, xVarA, lazyListStateRememberLazyListState, 1), composerStartRestartGroup, 54), composerStartRestartGroup, (ModalBottomSheetState.$stable << 3) | 24960, 1);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b(lVar, abVar, lVar2, lVar3, i2, 12, null));
        }
    }

    static h.ab m(l lVar, ModalBottomSheetState modalBottomSheetState, int i2, Composer composer) {
        J(lVar, modalBottomSheetState, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static void n(Modifier modifier, ce ceVar, boolean z, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        Composer composer2;
        com.waze.z.a.d.aj ajVar;
        com.waze.z.a.d.al alVar;
        h.g.b.x.f(ceVar, "searchHeaderType");
        h.g.b.x.f(lVar, "onEvent");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-327062274);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(ceVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-327062274, i3, -1, "com.waze.startstate.mobile.ui.SearchHeader (SearchHeader.kt:55)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 48);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            int i5 = e.f18097a;
            int i6 = i3 >> 3;
            composer2 = composerStartRestartGroup;
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, (h.g.a.q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, h.ab>) e.l(), composer2, (i6 & 112) | 1572870, 30);
            int i7 = i6 & 14;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(51262584, i7, -1, "com.waze.startstate.mobile.ui.rememberSearchFieldState (SearchHeader.kt:120)");
            }
            boolean z2 = (((i6 & 14) ^ 6) > 4 && composer2.changed(ceVar)) || (i6 & 6) == 4;
            com.waze.z.a.d.am amVarRememberedValue = composer2.rememberedValue();
            if (z2 || amVarRememberedValue == Composer.Companion.getEmpty()) {
                if (ceVar instanceof cd) {
                    cc ccVarA = ((cd) ceVar).a();
                    if (h.g.b.x.n(ccVarA, bx.f18005a)) {
                        alVar = com.waze.z.a.d.al.f45928a;
                    } else if (h.g.b.x.n(ccVarA, by.f18006a)) {
                        alVar = com.waze.z.a.d.al.f45929b;
                    } else if (h.g.b.x.n(ccVarA, bz.f18007a)) {
                        alVar = com.waze.z.a.d.al.f45930c;
                    } else if (h.g.b.x.n(ccVarA, cb.f18011a)) {
                        alVar = com.waze.z.a.d.al.f45931d;
                    } else if (h.g.b.x.n(ccVarA, ca.f18010a)) {
                        alVar = com.waze.z.a.d.al.f45932e;
                    } else if (ccVarA instanceof bw) {
                        alVar = com.waze.z.a.d.al.f45933f;
                    } else {
                        if (!(ccVarA instanceof bv)) {
                            throw new h.i();
                        }
                        alVar = com.waze.z.a.d.al.f45934g;
                    }
                    amVarRememberedValue = new com.waze.z.a.d.am(alVar);
                } else {
                    if (!(ceVar instanceof bu)) {
                        throw new h.i();
                    }
                    bt btVarA = ((bu) ceVar).a();
                    bt btVar = bt.f17999a;
                    int iOrdinal = btVarA.ordinal();
                    if (iOrdinal == 0) {
                        ajVar = com.waze.z.a.d.aj.f45922c;
                    } else if (iOrdinal == 1) {
                        ajVar = com.waze.z.a.d.aj.f45921b;
                    } else {
                        if (iOrdinal != 2) {
                            throw new h.i();
                        }
                        ajVar = com.waze.z.a.d.aj.f45923d;
                    }
                    amVarRememberedValue = new com.waze.z.a.d.ak("", true, ajVar);
                }
                composer2.updateRememberedValue(amVarRememberedValue);
            }
            com.waze.z.a.d.an anVar = (com.waze.z.a.d.an) amVarRememberedValue;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean z3 = (i3 & 7168) == 2048;
            boolean z4 = (i3 & 112) == 32;
            Object objRememberedValue = composer2.rememberedValue();
            byte[] bArr = null;
            if ((z4 | z3) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.bw.a.b.l(lVar, ceVar, 3, bArr);
                composer2.updateRememberedValue(objRememberedValue);
            }
            com.waze.z.a.d.ai.h(anVar, (h.g.a.l) objRememberedValue, SizeKt.fillMaxWidth$default(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.ac, null), 0.0f, 1, null), com.waze.ui.r.a.c.c.b(R.string.SEARCH_FIELD_PLACEHOLDER, composer2, 0), e.k(), composer2, 24960);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.main_screen.c.b.b(modifier, ceVar, z, lVar, i2, 6));
        }
    }

    public static com.waze.av.b.j o(com.waze.av.b.aa aaVar, com.waze.av.b.c cVar) {
        h.g.b.x.f(aaVar, "<this>");
        h.g.b.x.f(cVar, "eventInfo");
        int iA = (int) cVar.a();
        com.waze.av.a.p pVarA = aaVar.a();
        String strC = cVar.c();
        com.waze.av.b.d dVar = com.waze.av.b.d.f15944c;
        String strD = cVar.d();
        h.o.c cVar2 = h.o.a.f48264a;
        return new com.waze.av.b.j(pVarA, strC, dVar, strD, h.o.a.p(h.o.c.j(cVar.b(), h.o.d.f48272c)), false, iA, 8160);
    }

    public static com.waze.av.b.j p(com.waze.av.b.aa aaVar, com.waze.av.b.c cVar) {
        h.g.b.x.f(aaVar, "<this>");
        h.g.b.x.f(cVar, "eventInfo");
        int iA = (int) cVar.a();
        com.waze.av.a.p pVarA = aaVar.a();
        String strC = cVar.c();
        com.waze.av.b.d dVar = com.waze.av.b.d.f15945d;
        String strD = cVar.d();
        h.o.c cVar2 = h.o.a.f48264a;
        return new com.waze.av.b.j(pVarA, strC, dVar, strD, h.o.a.p(h.o.c.j(cVar.b(), h.o.d.f48272c)), false, iA, 8160);
    }

    public static com.waze.av.b.k q(com.waze.av.b.aa aaVar, com.waze.av.b.h hVar) {
        Object next;
        com.waze.av.b.i iVar;
        h.g.b.x.f(aaVar, "<this>");
        h.g.b.x.f(hVar, "favoriteInfo");
        Iterator it = aaVar.d().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long jA = ((com.waze.av.b.y) next).a();
                do {
                    Object next2 = it.next();
                    long jA2 = ((com.waze.av.b.y) next2).a();
                    if (jA < jA2) {
                        jA = jA2;
                    }
                    if (jA < jA2) {
                        next = next2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        com.waze.av.b.y yVar = (com.waze.av.b.y) next;
        com.waze.av.a.p pVarA = aaVar.a();
        boolean z = hVar instanceof com.waze.av.b.e;
        String strD = "";
        if (!z && !(hVar instanceof com.waze.av.b.g)) {
            if (!(hVar instanceof com.waze.av.b.f)) {
                throw new h.i();
            }
            strD = ((com.waze.av.b.f) hVar).d();
        }
        String str = strD;
        if (z) {
            iVar = com.waze.av.b.i.f15956b;
        } else if (hVar instanceof com.waze.av.b.g) {
            iVar = com.waze.av.b.i.f15957c;
        } else {
            if (!(hVar instanceof com.waze.av.b.f)) {
                throw new h.i();
            }
            iVar = com.waze.av.b.i.f15958d;
        }
        return new com.waze.av.b.k(pVarA, str, iVar, yVar != null ? com.waze.settings.h.c.f(yVar.a()) : 0L, hVar.b(), (int) hVar.a(), yVar != null ? Integer.valueOf((int) yVar.b()) : null, hVar instanceof com.waze.av.b.f ? ((com.waze.av.b.f) hVar).c() : 0);
    }

    public static com.waze.av.b.k r(com.waze.av.b.aa aaVar, com.waze.av.b.e eVar) {
        h.g.b.x.f(aaVar, "<this>");
        h.g.b.x.f(eVar, "favoriteInfo");
        return q(aaVar, eVar);
    }

    public static com.waze.av.b.k s(com.waze.av.b.aa aaVar, com.waze.av.b.f fVar) {
        h.g.b.x.f(aaVar, "<this>");
        h.g.b.x.f(fVar, "favoriteInfo");
        return q(aaVar, fVar);
    }

    public static com.waze.av.b.k t(com.waze.av.b.aa aaVar, com.waze.av.b.g gVar) {
        h.g.b.x.f(aaVar, "<this>");
        h.g.b.x.f(gVar, "favoriteInfo");
        return q(aaVar, gVar);
    }

    public static com.waze.av.b.l u(com.waze.av.b.aa aaVar, com.waze.shared_infra.o.a aVar, com.waze.av.b.y yVar) {
        h.g.b.x.f(aaVar, "<this>");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(yVar, "historicDriveInfo");
        com.waze.av.a.p pVarA = aaVar.a();
        com.waze.av.b.z zVar = com.waze.av.b.z.f16013a;
        String strL = com.waze.nightmode.e.l(aaVar.a(), aVar);
        if (strL == null) {
            strL = "";
        }
        return new com.waze.av.b.l(pVarA, zVar, strL, null, com.waze.settings.h.c.f(yVar.a()), (int) yVar.b(), false, 72);
    }

    public static /* synthetic */ com.waze.av.b.n v(com.waze.av.b.aa aaVar, com.waze.shared_infra.o.a aVar, com.waze.av.b.c cVar, com.waze.av.b.h hVar, com.waze.av.b.y yVar, int i2) {
        com.waze.av.b.k kVarS;
        com.waze.av.b.j jVarP;
        if ((i2 & 1) != 0) {
            aVar = com.waze.shared_infra.o.b.a();
        }
        if ((i2 & 2) != 0) {
            cVar = null;
        }
        if ((i2 & 4) != 0) {
            hVar = null;
        }
        if ((i2 & 8) != 0) {
            yVar = null;
        }
        h.g.b.x.f(aaVar, "<this>");
        h.g.b.x.f(aVar, "stringProvider");
        if (cVar != null) {
            if (cVar instanceof com.waze.av.b.a) {
                jVarP = o(aaVar, cVar);
            } else {
                if (!(cVar instanceof com.waze.av.b.b)) {
                    throw new h.i();
                }
                jVarP = p(aaVar, cVar);
            }
            return jVarP;
        }
        if (hVar == null) {
            return yVar != null ? u(aaVar, aVar, yVar) : new com.waze.av.b.m(aaVar.a());
        }
        if (hVar instanceof com.waze.av.b.e) {
            kVarS = r(aaVar, (com.waze.av.b.e) hVar);
        } else if (hVar instanceof com.waze.av.b.g) {
            kVarS = t(aaVar, (com.waze.av.b.g) hVar);
        } else {
            if (!(hVar instanceof com.waze.av.b.f)) {
                throw new h.i();
            }
            kVarS = s(aaVar, (com.waze.av.b.f) hVar);
        }
        return kVarS;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void x(com.waze.bw.c.d.cv r19, androidx.compose.ui.Modifier r20, h.g.a.a r21, h.g.a.a r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bw.c.d.v.x(com.waze.bw.c.d.cv, androidx.compose.ui.Modifier, h.g.a.a, h.g.a.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static /* synthetic */ h.ab y(h.g.a.l lVar, LazyItemScope lazyItemScope, Composer composer, int i2) {
        h.g.b.x.f(lazyItemScope, "$this$item");
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-82100353, i2, -1, "com.waze.startstate.mobile.ui.FavoritesCarousel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FavoritesCarousel.kt:140)");
            }
            SpacerKt.Spacer(SizeKt.m2822size3ABfNKs(Modifier.Companion, 8.0f), composer, 6);
            boolean zChanged = composer.changed(lVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.search.v2.bv(lVar, 13);
                composer.updateRememberedValue(objRememberedValue);
            }
            M((h.g.a.a) objRememberedValue, composer, 0);
            SpacerKt.Spacer(SizeKt.m2822size3ABfNKs(Modifier.Companion, 16.0f), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab z(h.g.a.l lVar, LazyItemScope lazyItemScope, Composer composer, int i2) {
        h.g.b.x.f(lazyItemScope, "$this$item");
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1412626120, i2, -1, "com.waze.startstate.mobile.ui.FavoritesCarousel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FavoritesCarousel.kt:146)");
            }
            SpacerKt.Spacer(SizeKt.m2822size3ABfNKs(Modifier.Companion, 8.0f), composer, 6);
            boolean zChanged = composer.changed(lVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.search.v2.bv(lVar, 12);
                composer.updateRememberedValue(objRememberedValue);
            }
            L((h.g.a.a) objRememberedValue, composer, 0);
            SpacerKt.Spacer(SizeKt.m2822size3ABfNKs(Modifier.Companion, 16.0f), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    private v() {
        throw null;
    }
}
