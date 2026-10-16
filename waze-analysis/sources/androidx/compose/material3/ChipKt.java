package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ChipKt {
    private static final float HorizontalElementsPadding = 8.0f;
    private static final ChipArrangement DefaultHorizontalArrangement = new ChipArrangement(SuggestionChipDefaults.INSTANCE.m5660getHorizontalSpacingD9Ej5fM(), (o) null);
    private static final float maxChipWidth = 1000.0f;

    /* renamed from: AnimatingChipContent-lRyMtFw, reason: not valid java name */
    private static final void m4520AnimatingChipContentlRyMtFw(final p<? super Composer, ? super Integer, ab> pVar, final TextStyle textStyle, final long j2, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final p<? super Composer, ? super Integer, ab> pVar4, final long j3, final long j4, final float f2, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, final FiniteAnimationSpec<Float> finiteAnimationSpec, final FiniteAnimationSpec<Float> finiteAnimationSpec2, final FiniteAnimationSpec<IntSize> finiteAnimationSpec3, final FiniteAnimationSpec<IntSize> finiteAnimationSpec4, Composer composer, final int i2, final int i3) {
        int i4;
        p<? super Composer, ? super Integer, ab> pVar5;
        p<? super Composer, ? super Integer, ab> pVar6;
        p<? super Composer, ? super Integer, ab> pVar7;
        float f3;
        Arrangement.Horizontal horizontal2;
        int i5;
        FiniteAnimationSpec<Float> finiteAnimationSpec5;
        int i6;
        int i7 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1255048750);
        if (i7 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(textStyle) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(j2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            pVar5 = pVar2;
            i4 |= true != composerStartRestartGroup.changedInstance(pVar5) ? 1024 : 2048;
        } else {
            pVar5 = pVar2;
        }
        if ((i2 & 24576) == 0) {
            pVar6 = pVar3;
            i4 |= true != composerStartRestartGroup.changedInstance(pVar6) ? 8192 : 16384;
        } else {
            pVar6 = pVar3;
        }
        if ((196608 & i2) == 0) {
            pVar7 = pVar4;
            i4 |= true != composerStartRestartGroup.changedInstance(pVar7) ? 65536 : 131072;
        } else {
            pVar7 = pVar4;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(j3) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(j4) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            f3 = f2;
            i4 |= true != composerStartRestartGroup.changed(f3) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        } else {
            f3 = f2;
        }
        if ((805306368 & i2) == 0) {
            horizontal2 = horizontal;
            i4 |= true != composerStartRestartGroup.changed(horizontal2) ? 268435456 : 536870912;
        } else {
            horizontal2 = horizontal;
        }
        if ((i3 & 6) == 0) {
            i5 = (true != composerStartRestartGroup.changed(paddingValues) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        int i8 = i5;
        if ((i3 & 48) == 0) {
            i5 = i8 | (true != composerStartRestartGroup.changedInstance(finiteAnimationSpec) ? 16 : 32);
        }
        if ((i3 & 384) == 0) {
            finiteAnimationSpec5 = finiteAnimationSpec2;
            i6 = i5 | (true != composerStartRestartGroup.changedInstance(finiteAnimationSpec5) ? 128 : 256);
        } else {
            finiteAnimationSpec5 = finiteAnimationSpec2;
            i6 = i5;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i6 |= true == composerStartRestartGroup.changedInstance(finiteAnimationSpec3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= true == composerStartRestartGroup.changedInstance(finiteAnimationSpec4) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute(((306783379 & i4) == 306783378 && (i6 & 9363) == 9362) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1255048750, i4, i6, "androidx.compose.material3.AnimatingChipContent (Chip.kt:3430)");
            }
            final FiniteAnimationSpec<Float> finiteAnimationSpec6 = finiteAnimationSpec5;
            final p<? super Composer, ? super Integer, ab> pVar8 = pVar7;
            final p<? super Composer, ? super Integer, ab> pVar9 = pVar5;
            final p<? super Composer, ? super Integer, ab> pVar10 = pVar6;
            final float f4 = f3;
            final Arrangement.Horizontal horizontal3 = horizontal2;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j2)), TextKt.getLocalTextStyle().provides(textStyle)}, ComposableLambdaKt.rememberComposableLambda(-881676654, true, new p() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda16
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ChipKt.AnimatingChipContent_lRyMtFw$lambda$0(f4, paddingValues, horizontal3, pVar10, pVar9, finiteAnimationSpec3, finiteAnimationSpec, finiteAnimationSpec4, finiteAnimationSpec6, j3, pVar, pVar8, j4, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda17
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ChipKt.AnimatingChipContent_lRyMtFw$lambda$1(pVar, textStyle, j2, pVar2, pVar3, pVar4, j3, j4, f2, horizontal, paddingValues, finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3, finiteAnimationSpec4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab AnimatingChipContent_lRyMtFw$lambda$0(float f2, PaddingValues paddingValues, Arrangement.Horizontal horizontal, final p pVar, final p pVar2, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, FiniteAnimationSpec finiteAnimationSpec4, final long j2, p pVar3, final p pVar4, final long j3, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-881676654, i2, -1, "androidx.compose.material3.AnimatingChipContent.<anonymous> (Chip.kt:3435)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.m2807defaultMinSizeVpY3zN4$default(SizeKt.m2829widthInVpY3zN4$default(Modifier.Companion, 0.0f, maxChipWidth, 1, null), 0.0f, f2, 1, null), paddingValues);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, Alignment.Companion.getCenterVertically(), composer, 48);
            int iM = ChipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierPadding);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM2 = ChipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
            a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, (pVar == null && pVar2 == null) ? false : true, (Modifier) null, EnterExitTransitionKt.expandHorizontally$default(finiteAnimationSpec, Alignment.Companion.getStart(), false, null, 12, null).plus(EnterExitTransitionKt.fadeIn$default(finiteAnimationSpec2, 0.0f, 2, null)), EnterExitTransitionKt.shrinkHorizontally$default(finiteAnimationSpec3, Alignment.Companion.getStart(), false, null, 12, null).plus(EnterExitTransitionKt.fadeOut$default(finiteAnimationSpec4, 0.0f, 2, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-181659180, true, new q() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda28
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ChipKt.AnimatingChipContent_lRyMtFw$lambda$0$0$0$0(pVar, pVar2, j2, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 1572870, 18);
            if (pVar == null && pVar2 == null) {
                composer.startReplaceGroup(-37113233);
                SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 0.0f), composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-37029626);
                composer.endReplaceGroup();
            }
            composer.endNode();
            Modifier modifierWeight = rowScopeInstance.weight(Modifier.Companion, 1.0f, false);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer, 54);
            int iM3 = ChipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierWeight);
            a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            pVar3.invoke(composer, 0);
            composer.endNode();
            Modifier.Companion companion2 = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM4 = ChipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion2);
            a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM4), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, pVar4 != null, (Modifier) null, EnterExitTransitionKt.expandHorizontally$default(finiteAnimationSpec, Alignment.Companion.getEnd(), false, null, 12, null).plus(EnterExitTransitionKt.fadeIn$default(finiteAnimationSpec2, 0.0f, 2, null)), EnterExitTransitionKt.shrinkHorizontally$default(finiteAnimationSpec3, Alignment.Companion.getEnd(), false, null, 12, null).plus(EnterExitTransitionKt.fadeOut$default(finiteAnimationSpec4, 0.0f, 2, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1090690805, true, new q() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda29
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ChipKt.AnimatingChipContent_lRyMtFw$lambda$0$0$2$0(pVar4, j3, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 1572870, 18);
            if (pVar4 == null) {
                composer.startReplaceGroup(-1514776840);
                SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 0.0f), composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1514693233);
                composer.endReplaceGroup();
            }
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab AnimatingChipContent_lRyMtFw$lambda$0$0$0$0(p pVar, p pVar2, long j2, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-181659180, i2, -1, "androidx.compose.material3.AnimatingChipContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Chip.kt:3457)");
        }
        State stateRememberRetainedState = rememberRetainedState(m4525leadingContentXOJAsU(pVar, pVar2, j2, composer, 0), composer, 0);
        Alignment center = Alignment.Companion.getCenter();
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
        int iM = ChipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
        a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
        Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
        Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        p pVar3 = (p) stateRememberRetainedState.getValue();
        if (pVar3 == null) {
            composer.startReplaceGroup(2094511935);
        } else {
            composer.startReplaceGroup(1037396226);
            pVar3.invoke(composer, 0);
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab AnimatingChipContent_lRyMtFw$lambda$0$0$2$0(p pVar, long j2, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1090690805, i2, -1, "androidx.compose.material3.AnimatingChipContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Chip.kt:3491)");
        }
        State stateRememberRetainedState = rememberRetainedState(m4526trailingContentRPmYEkk(pVar, j2, composer, 0), composer, 0);
        Alignment center = Alignment.Companion.getCenter();
        Modifier.Companion companion = Modifier.Companion;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
        int iM = ChipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
        a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
        Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
        Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        p pVar2 = (p) stateRememberRetainedState.getValue();
        if (pVar2 == null) {
            composer.startReplaceGroup(-657207800);
        } else {
            composer.startReplaceGroup(671536409);
            pVar2.invoke(composer, 0);
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab AnimatingChipContent_lRyMtFw$lambda$1(p pVar, TextStyle textStyle, long j2, p pVar2, p pVar3, p pVar4, long j3, long j4, float f2, Arrangement.Horizontal horizontal, PaddingValues paddingValues, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, FiniteAnimationSpec finiteAnimationSpec4, int i2, int i3, Composer composer, int i4) {
        m4520AnimatingChipContentlRyMtFw(pVar, textStyle, j2, pVar2, pVar3, pVar4, j3, j4, f2, horizontal, paddingValues, finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3, finiteAnimationSpec4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AssistChip(final h.g.a.a<h.ab> r38, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, androidx.compose.ui.Modifier r40, boolean r41, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r42, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r43, androidx.compose.ui.graphics.Shape r44, androidx.compose.material3.ChipColors r45, androidx.compose.material3.ChipElevation r46, androidx.compose.foundation.BorderStroke r47, androidx.compose.foundation.layout.Arrangement.Horizontal r48, androidx.compose.foundation.layout.PaddingValues r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.AssistChip(h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab AssistChip$lambda$0(a aVar, p pVar, Modifier modifier, boolean z, p pVar2, p pVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        AssistChip(aVar, pVar, modifier, z, pVar2, pVar3, shape, chipColors, chipElevation, borderStroke, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab AssistChip$lambda$1(a aVar, p pVar, Modifier modifier, boolean z, p pVar2, p pVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        AssistChip(aVar, pVar, modifier, z, pVar2, pVar3, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab AssistChip$lambda$3(a aVar, p pVar, Modifier modifier, boolean z, p pVar2, p pVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        AssistChip(aVar, pVar, modifier, z, pVar2, pVar3, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* renamed from: Chip-EosBjUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m4521ChipEosBjUw(final androidx.compose.ui.Modifier r30, final h.g.a.a<h.ab> r31, final boolean r32, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r33, final androidx.compose.ui.text.TextStyle r34, final long r35, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r37, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r38, final androidx.compose.ui.graphics.Shape r39, final androidx.compose.material3.ChipColors r40, final androidx.compose.material3.ChipElevation r41, final androidx.compose.foundation.BorderStroke r42, final float r43, androidx.compose.foundation.layout.Arrangement.Horizontal r44, final androidx.compose.foundation.layout.PaddingValues r45, final androidx.compose.foundation.interaction.MutableInteractionSource r46, androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.m4521ChipEosBjUw(androidx.compose.ui.Modifier, h.g.a.a, boolean, h.g.a.p, androidx.compose.ui.text.TextStyle, long, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: ChipContent-CmOm80E, reason: not valid java name */
    private static final void m4522ChipContentCmOm80E(final p<? super Composer, ? super Integer, ab> pVar, TextStyle textStyle, long j2, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final p<? super Composer, ? super Integer, ab> pVar4, final long j3, final long j4, final float f2, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, final int i2, final int i3) {
        int i4;
        long j5;
        p<? super Composer, ? super Integer, ab> pVar5;
        p<? super Composer, ? super Integer, ab> pVar6;
        p<? super Composer, ? super Integer, ab> pVar7;
        long j6;
        float f3;
        Arrangement.Horizontal horizontal2;
        PaddingValues paddingValues2;
        int i5;
        TextStyle textStyle2;
        int i6 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(897958272);
        if (i6 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(textStyle) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            j5 = j2;
            i4 |= true != composerStartRestartGroup.changed(j5) ? 128 : 256;
        } else {
            j5 = j2;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            pVar5 = pVar2;
            i4 |= true != composerStartRestartGroup.changedInstance(pVar5) ? 1024 : 2048;
        } else {
            pVar5 = pVar2;
        }
        if ((i2 & 24576) == 0) {
            pVar6 = pVar3;
            i4 |= true != composerStartRestartGroup.changedInstance(pVar6) ? 8192 : 16384;
        } else {
            pVar6 = pVar3;
        }
        if ((196608 & i2) == 0) {
            pVar7 = pVar4;
            i4 |= true != composerStartRestartGroup.changedInstance(pVar7) ? 65536 : 131072;
        } else {
            pVar7 = pVar4;
        }
        if ((1572864 & i2) == 0) {
            j6 = j3;
            i4 |= true != composerStartRestartGroup.changed(j6) ? 524288 : 1048576;
        } else {
            j6 = j3;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(j4) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            f3 = f2;
            i4 |= true != composerStartRestartGroup.changed(f3) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        } else {
            f3 = f2;
        }
        if ((805306368 & i2) == 0) {
            horizontal2 = horizontal;
            i4 |= true != composerStartRestartGroup.changed(horizontal2) ? 268435456 : 536870912;
        } else {
            horizontal2 = horizontal;
        }
        if ((i3 & 6) == 0) {
            paddingValues2 = paddingValues;
            i5 = i3 | (true != composerStartRestartGroup.changed(paddingValues2) ? 2 : 4);
        } else {
            paddingValues2 = paddingValues;
            i5 = i3;
        }
        if (composerStartRestartGroup.shouldExecute(((306783379 & i4) == 306783378 && (i5 & 3) == 2) ? false : true, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(897958272, i4, i5, "androidx.compose.material3.ChipContent (Chip.kt:3358)");
            }
            textStyle2 = textStyle;
            final PaddingValues paddingValues3 = paddingValues2;
            final float f4 = f3;
            final Arrangement.Horizontal horizontal3 = horizontal2;
            final p<? super Composer, ? super Integer, ab> pVar8 = pVar5;
            final p<? super Composer, ? super Integer, ab> pVar9 = pVar6;
            final p<? super Composer, ? super Integer, ab> pVar10 = pVar7;
            final long j7 = j6;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j5)), TextKt.getLocalTextStyle().provides(textStyle2)}, ComposableLambdaKt.rememberComposableLambda(100316352, true, new p() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda43
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ChipKt.ChipContent_CmOm80E$lambda$0(f4, paddingValues3, horizontal3, pVar9, pVar8, pVar10, j7, pVar, j4, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            textStyle2 = textStyle;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final TextStyle textStyle3 = textStyle2;
            final long j8 = j5;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda44
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ChipKt.ChipContent_CmOm80E$lambda$1(pVar, textStyle3, j8, pVar2, pVar3, pVar4, j3, j4, f2, horizontal, paddingValues, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab ChipContent_CmOm80E$lambda$0(float f2, PaddingValues paddingValues, Arrangement.Horizontal horizontal, p pVar, p pVar2, p pVar3, long j2, p pVar4, long j3, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(100316352, i2, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:3363)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.m2807defaultMinSizeVpY3zN4$default(IntrinsicKt.width(Modifier.Companion, IntrinsicSize.Max), 0.0f, f2, 1, null), paddingValues);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, Alignment.Companion.getCenterVertically(), composer, 48);
            int iM = ChipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierPadding);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (pVar == null && pVar2 == null) {
                composer.startReplaceGroup(1940381975);
                SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 0.0f), composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1939929592);
                Alignment center = Alignment.Companion.getCenter();
                Modifier.Companion companion = Modifier.Companion;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                int iM2 = ChipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
                a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composer, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composer, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                p<Composer, Integer, ab> pVarM4525leadingContentXOJAsU = m4525leadingContentXOJAsU(pVar, pVar2, j2, composer, 0);
                if (pVarM4525leadingContentXOJAsU != null) {
                    composer.startReplaceGroup(1511530583);
                    pVarM4525leadingContentXOJAsU.invoke(composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1511607463);
                    composer.endReplaceGroup();
                }
                composer.endNode();
                composer.endReplaceGroup();
            }
            Modifier modifierWeight$default = RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer, 54);
            int iM3 = ChipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
            a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            pVar4.invoke(composer, 0);
            composer.endNode();
            if (pVar3 != null) {
                composer.startReplaceGroup(1940776698);
                Alignment center2 = Alignment.Companion.getCenter();
                Modifier.Companion companion2 = Modifier.Companion;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                int iM4 = ChipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion2);
                a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composer, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composer, Integer.valueOf(iM4), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                p<Composer, Integer, ab> pVarM4526trailingContentRPmYEkk = m4526trailingContentRPmYEkk(pVar3, j3, composer, 0);
                if (pVarM4526trailingContentRPmYEkk != null) {
                    composer.startReplaceGroup(-1684490611);
                    pVarM4526trailingContentRPmYEkk.invoke(composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1684412770);
                    composer.endReplaceGroup();
                }
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1941196407);
                SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 0.0f), composer, 6);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab ChipContent_CmOm80E$lambda$1(p pVar, TextStyle textStyle, long j2, p pVar2, p pVar3, p pVar4, long j3, long j4, float f2, Arrangement.Horizontal horizontal, PaddingValues paddingValues, int i2, int i3, Composer composer, int i4) {
        m4522ChipContentCmOm80E(pVar, textStyle, j2, pVar2, pVar3, pVar4, j3, j4, f2, horizontal, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Chip_EosBjUw$lambda$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m10316getButtono7Vup1c());
        return ab.f48028a;
    }

    static final ab Chip_EosBjUw$lambda$2(p pVar, TextStyle textStyle, long j2, p pVar2, p pVar3, ChipColors chipColors, boolean z, float f2, Arrangement.Horizontal horizontal, PaddingValues paddingValues, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1333593699, i2, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:3208)");
            }
            m4522ChipContentCmOm80E(pVar, textStyle, j2, pVar2, null, pVar3, chipColors.m4508leadingIconContentColorvNxB06k$material3(z), chipColors.m4509trailingIconContentColorvNxB06k$material3(z), f2, horizontal, paddingValues, composer, 24576, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Chip_EosBjUw$lambda$3(Modifier modifier, a aVar, boolean z, p pVar, TextStyle textStyle, long j2, p pVar2, p pVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, float f2, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        m4521ChipEosBjUw(modifier, aVar, z, pVar, textStyle, j2, pVar2, pVar3, shape, chipColors, chipElevation, borderStroke, f2, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ElevatedAssistChip(final h.g.a.a<h.ab> r38, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, androidx.compose.ui.Modifier r40, boolean r41, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r42, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r43, androidx.compose.ui.graphics.Shape r44, androidx.compose.material3.ChipColors r45, androidx.compose.material3.ChipElevation r46, androidx.compose.foundation.BorderStroke r47, androidx.compose.foundation.layout.Arrangement.Horizontal r48, androidx.compose.foundation.layout.PaddingValues r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedAssistChip(h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab ElevatedAssistChip$lambda$0(a aVar, p pVar, Modifier modifier, boolean z, p pVar2, p pVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        ElevatedAssistChip(aVar, pVar, modifier, z, pVar2, pVar3, shape, chipColors, chipElevation, borderStroke, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab ElevatedAssistChip$lambda$1(a aVar, p pVar, Modifier modifier, boolean z, p pVar2, p pVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        ElevatedAssistChip(aVar, pVar, modifier, z, pVar2, pVar3, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab ElevatedAssistChip$lambda$3(a aVar, p pVar, Modifier modifier, boolean z, p pVar2, p pVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        ElevatedAssistChip(aVar, pVar, modifier, z, pVar2, pVar3, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ElevatedFilterChip(final boolean r38, final h.g.a.a<h.ab> r39, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r40, androidx.compose.ui.Modifier r41, boolean r42, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r43, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r44, androidx.compose.ui.graphics.Shape r45, androidx.compose.material3.SelectableChipColors r46, androidx.compose.material3.SelectableChipElevation r47, androidx.compose.foundation.BorderStroke r48, androidx.compose.foundation.layout.Arrangement.Horizontal r49, androidx.compose.foundation.layout.PaddingValues r50, androidx.compose.foundation.interaction.MutableInteractionSource r51, androidx.compose.runtime.Composer r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedFilterChip(boolean, h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab ElevatedFilterChip$lambda$0(boolean z, a aVar, p pVar, Modifier modifier, boolean z2, p pVar2, p pVar3, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        ElevatedFilterChip(z, (a<ab>) aVar, (p<? super Composer, ? super Integer, ab>) pVar, modifier, z2, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, shape, selectableChipColors, selectableChipElevation, borderStroke, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab ElevatedFilterChip$lambda$1(boolean z, a aVar, p pVar, ChipShapes chipShapes, Modifier modifier, boolean z2, p pVar2, p pVar3, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        ElevatedFilterChip(z, (a<ab>) aVar, (p<? super Composer, ? super Integer, ab>) pVar, chipShapes, modifier, z2, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, selectableChipColors, selectableChipElevation, borderStroke, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab ElevatedFilterChip$lambda$2(boolean z, a aVar, p pVar, Modifier modifier, boolean z2, p pVar2, p pVar3, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        ElevatedFilterChip(z, aVar, pVar, modifier, z2, pVar2, pVar3, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ElevatedSuggestionChip(final h.g.a.a<h.ab> r39, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r40, androidx.compose.ui.Modifier r41, boolean r42, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r43, androidx.compose.ui.graphics.Shape r44, androidx.compose.material3.ChipColors r45, androidx.compose.material3.ChipElevation r46, androidx.compose.foundation.BorderStroke r47, androidx.compose.foundation.layout.Arrangement.Horizontal r48, androidx.compose.foundation.layout.PaddingValues r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedSuggestionChip(h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab ElevatedSuggestionChip$lambda$0(a aVar, p pVar, Modifier modifier, boolean z, p pVar2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        ElevatedSuggestionChip(aVar, pVar, modifier, z, pVar2, shape, chipColors, chipElevation, borderStroke, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab ElevatedSuggestionChip$lambda$1(a aVar, p pVar, Modifier modifier, boolean z, p pVar2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        ElevatedSuggestionChip(aVar, pVar, modifier, z, pVar2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab ElevatedSuggestionChip$lambda$3(a aVar, p pVar, Modifier modifier, boolean z, p pVar2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        ElevatedSuggestionChip(aVar, pVar, modifier, z, pVar2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FilterChip(final boolean r40, final h.g.a.a<h.ab> r41, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r42, androidx.compose.ui.Modifier r43, boolean r44, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r45, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r46, androidx.compose.ui.graphics.Shape r47, androidx.compose.material3.SelectableChipColors r48, androidx.compose.material3.SelectableChipElevation r49, androidx.compose.foundation.BorderStroke r50, androidx.compose.foundation.layout.Arrangement.Horizontal r51, androidx.compose.foundation.layout.PaddingValues r52, androidx.compose.foundation.interaction.MutableInteractionSource r53, androidx.compose.runtime.Composer r54, final int r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 973
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.FilterChip(boolean, h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab FilterChip$lambda$0(boolean z, a aVar, p pVar, Modifier modifier, boolean z2, p pVar2, p pVar3, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        FilterChip(z, (a<ab>) aVar, (p<? super Composer, ? super Integer, ab>) pVar, modifier, z2, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, shape, selectableChipColors, selectableChipElevation, borderStroke, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab FilterChip$lambda$1(boolean z, a aVar, p pVar, ChipShapes chipShapes, Modifier modifier, boolean z2, p pVar2, p pVar3, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        FilterChip(z, (a<ab>) aVar, (p<? super Composer, ? super Integer, ab>) pVar, chipShapes, modifier, z2, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, selectableChipColors, selectableChipElevation, borderStroke, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab FilterChip$lambda$2(boolean z, a aVar, p pVar, Modifier modifier, boolean z2, p pVar2, p pVar3, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        FilterChip(z, aVar, pVar, modifier, z2, pVar2, pVar3, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void InputChip(final boolean r35, final h.g.a.a<h.ab> r36, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r37, androidx.compose.ui.Modifier r38, boolean r39, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r40, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r41, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r42, androidx.compose.ui.graphics.Shape r43, androidx.compose.material3.SelectableChipColors r44, androidx.compose.material3.SelectableChipElevation r45, androidx.compose.foundation.BorderStroke r46, androidx.compose.foundation.layout.Arrangement.Horizontal r47, androidx.compose.foundation.layout.PaddingValues r48, androidx.compose.foundation.interaction.MutableInteractionSource r49, androidx.compose.runtime.Composer r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.InputChip(boolean, h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab InputChip$lambda$0(final float f2, final Shape shape, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(445150766, i2, -1, "androidx.compose.material3.InputChip.<anonymous> (Chip.kt:1205)");
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean zChanged = composer.changed(f2) | composer.changed(shape);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda20
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ChipKt.InputChip$lambda$0$0$0(f2, shape, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (l) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iM = ChipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierGraphicsLayer);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab InputChip$lambda$0$0$0(float f2, Shape shape, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(f2);
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(true);
        return ab.f48028a;
    }

    static final ab InputChip$lambda$1(boolean z, a aVar, p pVar, Modifier modifier, boolean z2, p pVar2, p pVar3, p pVar4, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        InputChip(z, (a<ab>) aVar, (p<? super Composer, ? super Integer, ab>) pVar, modifier, z2, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, (p<? super Composer, ? super Integer, ab>) pVar4, shape, selectableChipColors, selectableChipElevation, borderStroke, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab InputChip$lambda$2(final float f2, final Shape shape, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2057906151, i2, -1, "androidx.compose.material3.InputChip.<anonymous> (Chip.kt:1322)");
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean zChanged = composer.changed(f2) | composer.changed(shape);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda14
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ChipKt.InputChip$lambda$2$0$0(f2, shape, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (l) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iM = ChipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierGraphicsLayer);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab InputChip$lambda$2$0$0(float f2, Shape shape, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(f2);
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(true);
        return ab.f48028a;
    }

    static final ab InputChip$lambda$3(boolean z, a aVar, p pVar, ChipShapes chipShapes, Modifier modifier, boolean z2, p pVar2, p pVar3, p pVar4, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        InputChip(z, (a<ab>) aVar, (p<? super Composer, ? super Integer, ab>) pVar, chipShapes, modifier, z2, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, (p<? super Composer, ? super Integer, ab>) pVar4, selectableChipColors, selectableChipElevation, borderStroke, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab InputChip$lambda$4(final float f2, final Shape shape, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-570452295, i2, -1, "androidx.compose.material3.InputChip.<anonymous> (Chip.kt:1436)");
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean zChanged = composer.changed(f2) | composer.changed(shape);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda32
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ChipKt.InputChip$lambda$4$0$0(f2, shape, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (l) objRememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iM = ChipKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierGraphicsLayer);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab InputChip$lambda$4$0$0(float f2, Shape shape, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(f2);
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(true);
        return ab.f48028a;
    }

    static final ab InputChip$lambda$5(boolean z, a aVar, p pVar, Modifier modifier, boolean z2, p pVar2, p pVar3, p pVar4, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        InputChip(z, aVar, pVar, modifier, z2, pVar2, pVar3, pVar4, shape, selectableChipColors, selectableChipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0319  */
    /* renamed from: SelectableChip-9rhh4-4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m4523SelectableChip9rhh44(final boolean r29, final androidx.compose.ui.Modifier r30, final h.g.a.a<h.ab> r31, final androidx.compose.material3.ChipShapes r32, final boolean r33, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r34, final androidx.compose.ui.text.TextStyle r35, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r36, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r37, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r38, final androidx.compose.material3.SelectableChipColors r39, final androidx.compose.material3.SelectableChipElevation r40, final androidx.compose.foundation.BorderStroke r41, final float r42, androidx.compose.foundation.layout.Arrangement.Horizontal r43, final androidx.compose.foundation.layout.PaddingValues r44, final androidx.compose.foundation.interaction.MutableInteractionSource r45, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.m4523SelectableChip9rhh44(boolean, androidx.compose.ui.Modifier, h.g.a.a, androidx.compose.material3.ChipShapes, boolean, h.g.a.p, androidx.compose.ui.text.TextStyle, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SelectableChip_9rhh4_4$lambda$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m10318getCheckboxo7Vup1c());
        return ab.f48028a;
    }

    static final ab SelectableChip_9rhh4_4$lambda$2(SelectableChipColors selectableChipColors, boolean z, boolean z2, p pVar, TextStyle textStyle, p pVar2, p pVar3, p pVar4, float f2, Arrangement.Horizontal horizontal, PaddingValues paddingValues, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1320468520, i2, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:3259)");
            }
            m4520AnimatingChipContentlRyMtFw(pVar, textStyle, selectableChipColors.m5527labelColorWaAFU9c$material3(z, z2), pVar2, pVar3, pVar4, selectableChipColors.m5528leadingIconContentColorWaAFU9c$material3(z, z2), selectableChipColors.m5529trailingIconContentColorWaAFU9c$material3(z, z2), f2, horizontal, paddingValues, MotionSchemeKt.value(MotionSchemeKeyTokens.SlowEffects, composer, 6), MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer, 6), MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6), MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab SelectableChip_9rhh4_4$lambda$3(boolean z, Modifier modifier, a aVar, boolean z2, p pVar, TextStyle textStyle, p pVar2, p pVar3, p pVar4, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, float f2, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        m4524SelectableChip9rhh44(z, modifier, (a<ab>) aVar, z2, (p<? super Composer, ? super Integer, ab>) pVar, textStyle, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, (p<? super Composer, ? super Integer, ab>) pVar4, shape, selectableChipColors, selectableChipElevation, borderStroke, f2, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    private static final boolean SelectableChip_9rhh4_4$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SelectableChip_9rhh4_4$lambda$6$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m10318getCheckboxo7Vup1c());
        return ab.f48028a;
    }

    static final ab SelectableChip_9rhh4_4$lambda$7(SelectableChipColors selectableChipColors, boolean z, boolean z2, p pVar, TextStyle textStyle, p pVar2, p pVar3, p pVar4, float f2, Arrangement.Horizontal horizontal, PaddingValues paddingValues, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1112578107, i2, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:3318)");
            }
            m4520AnimatingChipContentlRyMtFw(pVar, textStyle, selectableChipColors.m5527labelColorWaAFU9c$material3(z, z2), pVar2, pVar3, pVar4, selectableChipColors.m5528leadingIconContentColorWaAFU9c$material3(z, z2), selectableChipColors.m5529trailingIconContentColorWaAFU9c$material3(z, z2), f2, horizontal, paddingValues, MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer, 6), MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6), MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composer, 6), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab SelectableChip_9rhh4_4$lambda$8(boolean z, Modifier modifier, a aVar, ChipShapes chipShapes, boolean z2, p pVar, TextStyle textStyle, p pVar2, p pVar3, p pVar4, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, float f2, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        m4523SelectableChip9rhh44(z, modifier, (a<ab>) aVar, chipShapes, z2, (p<? super Composer, ? super Integer, ab>) pVar, textStyle, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, (p<? super Composer, ? super Integer, ab>) pVar4, selectableChipColors, selectableChipElevation, borderStroke, f2, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SuggestionChip(final h.g.a.a<h.ab> r38, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, androidx.compose.ui.Modifier r40, boolean r41, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r42, androidx.compose.ui.graphics.Shape r43, androidx.compose.material3.ChipColors r44, androidx.compose.material3.ChipElevation r45, androidx.compose.foundation.BorderStroke r46, androidx.compose.foundation.layout.Arrangement.Horizontal r47, androidx.compose.foundation.layout.PaddingValues r48, androidx.compose.foundation.interaction.MutableInteractionSource r49, androidx.compose.runtime.Composer r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.SuggestionChip(h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab SuggestionChip$lambda$0(a aVar, p pVar, Modifier modifier, boolean z, p pVar2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, Arrangement.Horizontal horizontal, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        SuggestionChip(aVar, pVar, modifier, z, pVar2, shape, chipColors, chipElevation, borderStroke, horizontal, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab SuggestionChip$lambda$1(a aVar, p pVar, Modifier modifier, boolean z, p pVar2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        SuggestionChip(aVar, pVar, modifier, z, pVar2, shape, chipColors, chipElevation, borderStroke, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab SuggestionChip$lambda$3(a aVar, p pVar, Modifier modifier, boolean z, p pVar2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        SuggestionChip(aVar, pVar, modifier, z, pVar2, shape, chipColors, chipElevation, chipBorder, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final ChipColors getDefaultSuggestionChipColors(ColorScheme colorScheme) {
        ChipColors defaultSuggestionChipColorsCached$material3 = colorScheme.getDefaultSuggestionChipColorsCached$material3();
        if (defaultSuggestionChipColorsCached$material3 != null) {
            return defaultSuggestionChipColorsCached$material3;
        }
        ChipColors chipColors = new ChipColors(Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getLeadingIconColor()), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8263getTransparent0d7_KjU(), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor()), SuggestionChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getDisabledLeadingIconColor()), SuggestionChipTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m8264getUnspecified0d7_KjU(), null);
        colorScheme.setDefaultSuggestionChipColorsCached$material3(chipColors);
        return chipColors;
    }

    public static final boolean getHasCornerBasedShapes(ChipShapes chipShapes) {
        return (chipShapes.getShape() instanceof CornerBasedShape) && (chipShapes.getSelectedShape() instanceof CornerBasedShape) && (chipShapes.getPressedShape() instanceof CornerBasedShape);
    }

    public static final boolean getHasRoundedCornerShapes(ChipShapes chipShapes) {
        return (chipShapes.getShape() instanceof RoundedCornerShape) && (chipShapes.getSelectedShape() instanceof RoundedCornerShape) && (chipShapes.getPressedShape() instanceof RoundedCornerShape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaddingValues inputChipPadding(boolean z, boolean z2, boolean z3) {
        return PaddingKt.m2752PaddingValuesa9UjIt4$default((z || !z2) ? 4.0f : 8.0f, 0.0f, true != z3 ? 4.0f : 8.0f, 0.0f, 10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: leadingContent-XO-JAsU, reason: not valid java name */
    private static final p<Composer, Integer, ab> m4525leadingContentXOJAsU(p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, final long j2, Composer composer, int i2) {
        p pVar3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1330309098, i2, -1, "androidx.compose.material3.leadingContent (Chip.kt:3518)");
        }
        if (pVar != null) {
            composer.startReplaceGroup(-1473204624);
            composer.endReplaceGroup();
            pVar3 = pVar;
        } else if (pVar2 != null) {
            composer.startReplaceGroup(1575370973);
            p pVarRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-237350650, true, new p() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda26
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ChipKt.leadingContent_XO_JAsU$lambda$0(j2, pVar2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54);
            composer.endReplaceGroup();
            pVar3 = pVarRememberComposableLambda;
        } else {
            composer.startReplaceGroup(1575598419);
            composer.endReplaceGroup();
            pVar3 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return pVar3;
    }

    static final ab leadingContent_XO_JAsU$lambda$0(long j2, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-237350650, i2, -1, "androidx.compose.material3.leadingContent.<anonymous> (Chip.kt:3522)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j2)), (p<? super Composer, ? super Integer, ab>) pVar, composer, ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    private static final <T> State<T> rememberRetainedState(T t, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-618198444, i2, -1, "androidx.compose.material3.rememberRetainedState (Chip.kt:3554)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        if (t != null) {
            mutableState.setValue(t);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[PHI: r4
  0x0082: PHI (r4v4 androidx.compose.ui.graphics.Shape) = (r4v3 androidx.compose.ui.graphics.Shape), (r4v6 androidx.compose.ui.graphics.Shape) binds: [B:21:0x0093, B:18:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.ui.graphics.Shape shapeByInteraction(androidx.compose.material3.ChipShapes r3, boolean r4, boolean r5, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r6, androidx.compose.runtime.Composer r7, int r8) {
        /*
            r0 = 409896160(0x186e84e0, float:3.0827864E-24)
            r7.startReplaceGroup(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L12
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.shapeByInteraction (Chip.kt:4254)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r8, r1, r2)
        L12:
            if (r5 == 0) goto L19
            androidx.compose.ui.graphics.Shape r4 = r3.getPressedShape()
            goto L24
        L19:
            if (r4 == 0) goto L20
            androidx.compose.ui.graphics.Shape r4 = r3.getSelectedShape()
            goto L24
        L20:
            androidx.compose.ui.graphics.Shape r4 = r3.getShape()
        L24:
            boolean r5 = getHasRoundedCornerShapes(r3)
            if (r5 == 0) goto L55
            int r5 = r8 >> 6
            r5 = r5 & 112(0x70, float:1.57E-43)
            r8 = 624864682(0x253eadaa, float:1.6538713E-16)
            r7.startReplaceGroup(r8)
            r8 = -1226768847(0xffffffffb6e0fe31, float:-6.705312E-6)
            r7.startMovableGroup(r8, r3)
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.foundation.shape.RoundedCornerShape"
            h.g.b.x.d(r4, r3)
            androidx.compose.foundation.shape.RoundedCornerShape r4 = (androidx.compose.foundation.shape.RoundedCornerShape) r4
            androidx.compose.ui.graphics.Shape r4 = androidx.compose.material3.internal.AnimatedShapeKt.rememberAnimatedShape(r4, r6, r7, r5)
            r7.endMovableGroup()
            r7.endReplaceGroup()
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L96
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L96
        L55:
            boolean r5 = getHasCornerBasedShapes(r3)
            if (r5 == 0) goto L86
            int r5 = r8 >> 6
            r5 = r5 & 112(0x70, float:1.57E-43)
            r8 = 625002508(0x2540c80c, float:1.6721124E-16)
            r7.startReplaceGroup(r8)
            r8 = -1226764401(0xffffffffb6e10f8f, float:-6.707334E-6)
            r7.startMovableGroup(r8, r3)
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape"
            h.g.b.x.d(r4, r3)
            androidx.compose.foundation.shape.CornerBasedShape r4 = (androidx.compose.foundation.shape.CornerBasedShape) r4
            androidx.compose.ui.graphics.Shape r4 = androidx.compose.material3.internal.AnimatedShapeKt.rememberAnimatedShape(r4, r6, r7, r5)
            r7.endMovableGroup()
            r7.endReplaceGroup()
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L96
        L82:
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L96
        L86:
            r3 = 625085154(0x25420ae2, float:1.6830505E-16)
            r7.startReplaceGroup(r3)
            r7.endReplaceGroup()
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L96
            goto L82
        L96:
            r7.endReplaceGroup()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.shapeByInteraction(androidx.compose.material3.ChipShapes, boolean, boolean, androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.runtime.Composer, int):androidx.compose.ui.graphics.Shape");
    }

    /* renamed from: trailingContent-RPmYEkk, reason: not valid java name */
    private static final p<Composer, Integer, ab> m4526trailingContentRPmYEkk(final p<? super Composer, ? super Integer, ab> pVar, final long j2, Composer composer, int i2) {
        ComposableLambda composableLambdaRememberComposableLambda;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-165980551, i2, -1, "androidx.compose.material3.trailingContent (Chip.kt:3537)");
        }
        if (pVar != null) {
            composer.startReplaceGroup(-1219075416);
            composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-566924201, true, new p() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda10
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ChipKt.trailingContent_RPmYEkk$lambda$0(j2, pVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1218883371);
            composer.endReplaceGroup();
            composableLambdaRememberComposableLambda = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return composableLambdaRememberComposableLambda;
    }

    static final ab trailingContent_RPmYEkk$lambda$0(long j2, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-566924201, i2, -1, "androidx.compose.material3.trailingContent.<anonymous> (Chip.kt:3539)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j2)), (p<? super Composer, ? super Integer, ab>) pVar, composer, ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void InputChip(final boolean r43, final h.g.a.a r44, final h.g.a.p r45, androidx.compose.ui.Modifier r46, boolean r47, h.g.a.p r48, h.g.a.p r49, h.g.a.p r50, androidx.compose.ui.graphics.Shape r51, androidx.compose.material3.SelectableChipColors r52, androidx.compose.material3.SelectableChipElevation r53, androidx.compose.foundation.BorderStroke r54, androidx.compose.foundation.interaction.MutableInteractionSource r55, androidx.compose.runtime.Composer r56, final int r57, final int r58, final int r59) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.InputChip(boolean, h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: SelectableChip-9rhh4-4, reason: not valid java name */
    private static final void m4524SelectableChip9rhh44(final boolean z, final Modifier modifier, final a<ab> aVar, final boolean z2, final p<? super Composer, ? super Integer, ab> pVar, final TextStyle textStyle, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final p<? super Composer, ? super Integer, ab> pVar4, final Shape shape, final SelectableChipColors selectableChipColors, final SelectableChipElevation selectableChipElevation, final BorderStroke borderStroke, final float f2, Arrangement.Horizontal horizontal, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        TextStyle textStyle2;
        int i7;
        int i8;
        int i9;
        Arrangement.Horizontal chipArrangement;
        boolean z3;
        Composer composer2;
        final Arrangement.Horizontal horizontal2;
        int i10;
        int i11;
        MutableInteractionSource mutableInteractionSource2;
        State<Dp> stateShadowElevation$material3;
        int i12 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(400616238);
        if (i12 == 0) {
            i5 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 |= true != composerStartRestartGroup.changed(z2) ? 1024 : 2048;
        }
        int i13 = 8192;
        if ((i2 & 24576) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(pVar) ? 8192 : 16384;
        }
        if ((i2 & 196608) == 0) {
            i6 = 196608;
            textStyle2 = textStyle;
            i5 |= true != composerStartRestartGroup.changed(textStyle2) ? 65536 : 131072;
        } else {
            i6 = 196608;
            textStyle2 = textStyle;
        }
        int i14 = i5;
        if ((i2 & 1572864) == 0) {
            i7 = 1572864;
            i5 = i14 | (true != composerStartRestartGroup.changedInstance(pVar2) ? 524288 : 1048576);
        } else {
            i7 = 1572864;
        }
        if ((i2 & 12582912) == 0) {
            i8 = i5 | (true != composerStartRestartGroup.changedInstance(pVar3) ? 4194304 : 8388608);
        } else {
            i8 = i5;
        }
        if ((100663296 & i2) == 0) {
            i8 |= true != composerStartRestartGroup.changedInstance(pVar4) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i8 |= true != composerStartRestartGroup.changed(shape) ? 268435456 : 536870912;
        }
        int i15 = i8;
        if ((i3 & 6) == 0) {
            i9 = i3 | (true != composerStartRestartGroup.changed(selectableChipColors) ? 2 : 4);
        } else {
            i9 = i3;
        }
        int i16 = i9;
        if ((i3 & 48) == 0) {
            i9 = i16 | (true == composerStartRestartGroup.changed(selectableChipElevation) ? 32 : 16);
        }
        if ((i3 & 384) == 0) {
            i9 |= true == composerStartRestartGroup.changed(borderStroke) ? 256 : 128;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i9 |= true == composerStartRestartGroup.changed(f2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            if ((i4 & 16384) == 0) {
                chipArrangement = horizontal;
                if (composerStartRestartGroup.changed(chipArrangement)) {
                    i13 = 16384;
                }
            } else {
                chipArrangement = horizontal;
            }
            i9 |= i13;
        } else {
            chipArrangement = horizontal;
        }
        if ((i3 & i6) == 0) {
            z3 = true;
            i9 |= true == composerStartRestartGroup.changed(paddingValues) ? 131072 : 65536;
        } else {
            z3 = true;
        }
        if ((i3 & i7) == 0) {
            i9 |= z3 != composerStartRestartGroup.changed(mutableInteractionSource) ? 524288 : 1048576;
        }
        int i17 = i9;
        if (composerStartRestartGroup.shouldExecute(((306783379 & i15) == 306783378 && (i17 & 599187) == 599186) ? false : true, i15 & 1)) {
            int i18 = i4 & 16384;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i18 != 0) {
                    i10 = i17 & (-57345);
                    chipArrangement = new ChipArrangement(HorizontalElementsPadding, (o) null);
                    i11 = i10;
                }
                i11 = i17;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if (i18 != 0) {
                    i10 = i17 & (-57345);
                    i11 = i10;
                }
                i11 = i17;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(400616238, i15, i11, "androidx.compose.material3.SelectableChip (Chip.kt:3243)");
            }
            if (mutableInteractionSource == null) {
                composerStartRestartGroup.startReplaceGroup(-955061811);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1554829750);
                composerStartRestartGroup.endReplaceGroup();
                mutableInteractionSource2 = mutableInteractionSource;
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda22
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ChipKt.SelectableChip_9rhh4_4$lambda$1$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int i19 = i11;
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue2);
            long jM5525containerColorWaAFU9c$material3 = selectableChipColors.m5525containerColorWaAFU9c$material3(z2, z);
            if (selectableChipElevation == null) {
                composerStartRestartGroup.startReplaceGroup(-954746232);
                composerStartRestartGroup.endReplaceGroup();
                stateShadowElevation$material3 = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1554818919);
                stateShadowElevation$material3 = selectableChipElevation.shadowElevation$material3(z2, mutableInteractionSource2, composerStartRestartGroup, ((i15 >> 9) & 14) | ((i19 << 3) & DisplayStrings.DS_TAP_TO_VERIFY));
                composerStartRestartGroup.endReplaceGroup();
            }
            composer2 = composerStartRestartGroup;
            final Arrangement.Horizontal horizontal3 = chipArrangement;
            final TextStyle textStyle3 = textStyle2;
            SurfaceKt.m5670Surfaced85dljk(z, aVar, modifierSemantics, z2, shape, jM5525containerColorWaAFU9c$material3, 0L, 0.0f, stateShadowElevation$material3 != null ? stateShadowElevation$material3.getValue().m11178unboximpl() : 0.0f, borderStroke, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-1320468520, true, new p() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda23
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ChipKt.SelectableChip_9rhh4_4$lambda$2(selectableChipColors, z2, z, pVar, textStyle3, pVar2, pVar3, pVar4, f2, horizontal3, paddingValues, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer2, 54), composer2, (i15 & 14) | ((i15 >> 3) & 112) | (i15 & 7168) | (57344 & (i15 >> 15)) | (1879048192 & (i19 << 21)), 48, 192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            horizontal2 = horizontal3;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            horizontal2 = chipArrangement;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ChipKt$$ExternalSyntheticLambda24
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ChipKt.SelectableChip_9rhh4_4$lambda$3(z, modifier, aVar, z2, pVar, textStyle, pVar2, pVar3, pVar4, shape, selectableChipColors, selectableChipElevation, borderStroke, f2, horizontal2, paddingValues, mutableInteractionSource, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void InputChip(final boolean r34, final h.g.a.a<h.ab> r35, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r36, final androidx.compose.material3.ChipShapes r37, androidx.compose.ui.Modifier r38, boolean r39, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r40, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r41, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r42, androidx.compose.material3.SelectableChipColors r43, androidx.compose.material3.SelectableChipElevation r44, androidx.compose.foundation.BorderStroke r45, androidx.compose.foundation.layout.Arrangement.Horizontal r46, androidx.compose.foundation.layout.PaddingValues r47, androidx.compose.foundation.interaction.MutableInteractionSource r48, androidx.compose.runtime.Composer r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.InputChip(boolean, h.g.a.a, h.g.a.p, androidx.compose.material3.ChipShapes, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void ElevatedSuggestionChip(final h.g.a.a r30, final h.g.a.p r31, androidx.compose.ui.Modifier r32, boolean r33, h.g.a.p r34, androidx.compose.ui.graphics.Shape r35, androidx.compose.material3.ChipColors r36, androidx.compose.material3.ChipElevation r37, androidx.compose.foundation.BorderStroke r38, androidx.compose.foundation.interaction.MutableInteractionSource r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedSuggestionChip(h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void ElevatedSuggestionChip(final h.g.a.a r35, final h.g.a.p r36, androidx.compose.ui.Modifier r37, boolean r38, h.g.a.p r39, androidx.compose.ui.graphics.Shape r40, androidx.compose.material3.ChipColors r41, androidx.compose.material3.ChipElevation r42, androidx.compose.material3.ChipBorder r43, androidx.compose.foundation.interaction.MutableInteractionSource r44, androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedSuggestionChip(h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void SuggestionChip(final h.g.a.a r30, final h.g.a.p r31, androidx.compose.ui.Modifier r32, boolean r33, h.g.a.p r34, androidx.compose.ui.graphics.Shape r35, androidx.compose.material3.ChipColors r36, androidx.compose.material3.ChipElevation r37, androidx.compose.foundation.BorderStroke r38, androidx.compose.foundation.interaction.MutableInteractionSource r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.SuggestionChip(h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void ElevatedAssistChip(final h.g.a.a r32, final h.g.a.p r33, androidx.compose.ui.Modifier r34, boolean r35, h.g.a.p r36, h.g.a.p r37, androidx.compose.ui.graphics.Shape r38, androidx.compose.material3.ChipColors r39, androidx.compose.material3.ChipElevation r40, androidx.compose.foundation.BorderStroke r41, androidx.compose.foundation.interaction.MutableInteractionSource r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedAssistChip(h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void SuggestionChip(final h.g.a.a r35, final h.g.a.p r36, androidx.compose.ui.Modifier r37, boolean r38, h.g.a.p r39, androidx.compose.ui.graphics.Shape r40, androidx.compose.material3.ChipColors r41, androidx.compose.material3.ChipElevation r42, androidx.compose.material3.ChipBorder r43, androidx.compose.foundation.interaction.MutableInteractionSource r44, androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.SuggestionChip(h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void ElevatedAssistChip(final h.g.a.a r36, final h.g.a.p r37, androidx.compose.ui.Modifier r38, boolean r39, h.g.a.p r40, h.g.a.p r41, androidx.compose.ui.graphics.Shape r42, androidx.compose.material3.ChipColors r43, androidx.compose.material3.ChipElevation r44, androidx.compose.material3.ChipBorder r45, androidx.compose.foundation.interaction.MutableInteractionSource r46, androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedAssistChip(h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void ElevatedFilterChip(final boolean r35, final h.g.a.a r36, final h.g.a.p r37, androidx.compose.ui.Modifier r38, boolean r39, h.g.a.p r40, h.g.a.p r41, androidx.compose.ui.graphics.Shape r42, androidx.compose.material3.SelectableChipColors r43, androidx.compose.material3.SelectableChipElevation r44, androidx.compose.foundation.BorderStroke r45, androidx.compose.foundation.interaction.MutableInteractionSource r46, androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedFilterChip(boolean, h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ElevatedFilterChip(final boolean r38, final h.g.a.a<h.ab> r39, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r40, final androidx.compose.material3.ChipShapes r41, androidx.compose.ui.Modifier r42, boolean r43, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r44, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r45, androidx.compose.material3.SelectableChipColors r46, androidx.compose.material3.SelectableChipElevation r47, androidx.compose.foundation.BorderStroke r48, androidx.compose.foundation.layout.Arrangement.Horizontal r49, androidx.compose.foundation.layout.PaddingValues r50, androidx.compose.foundation.interaction.MutableInteractionSource r51, androidx.compose.runtime.Composer r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.ElevatedFilterChip(boolean, h.g.a.a, h.g.a.p, androidx.compose.material3.ChipShapes, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void AssistChip(final h.g.a.a r32, final h.g.a.p r33, androidx.compose.ui.Modifier r34, boolean r35, h.g.a.p r36, h.g.a.p r37, androidx.compose.ui.graphics.Shape r38, androidx.compose.material3.ChipColors r39, androidx.compose.material3.ChipElevation r40, androidx.compose.foundation.BorderStroke r41, androidx.compose.foundation.interaction.MutableInteractionSource r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.AssistChip(h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void AssistChip(final h.g.a.a r36, final h.g.a.p r37, androidx.compose.ui.Modifier r38, boolean r39, h.g.a.p r40, h.g.a.p r41, androidx.compose.ui.graphics.Shape r42, androidx.compose.material3.ChipColors r43, androidx.compose.material3.ChipElevation r44, androidx.compose.material3.ChipBorder r45, androidx.compose.foundation.interaction.MutableInteractionSource r46, androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.AssistChip(h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ChipColors, androidx.compose.material3.ChipElevation, androidx.compose.material3.ChipBorder, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void FilterChip(final boolean r39, final h.g.a.a r40, final h.g.a.p r41, androidx.compose.ui.Modifier r42, boolean r43, h.g.a.p r44, h.g.a.p r45, androidx.compose.ui.graphics.Shape r46, androidx.compose.material3.SelectableChipColors r47, androidx.compose.material3.SelectableChipElevation r48, androidx.compose.foundation.BorderStroke r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.FilterChip(boolean, h.g.a.a, h.g.a.p, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FilterChip(final boolean r42, final h.g.a.a<h.ab> r43, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r44, final androidx.compose.material3.ChipShapes r45, androidx.compose.ui.Modifier r46, boolean r47, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r48, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r49, androidx.compose.material3.SelectableChipColors r50, androidx.compose.material3.SelectableChipElevation r51, androidx.compose.foundation.BorderStroke r52, androidx.compose.foundation.layout.Arrangement.Horizontal r53, androidx.compose.foundation.layout.PaddingValues r54, androidx.compose.foundation.interaction.MutableInteractionSource r55, androidx.compose.runtime.Composer r56, final int r57, final int r58, final int r59) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipKt.FilterChip(boolean, h.g.a.a, h.g.a.p, androidx.compose.material3.ChipShapes, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, androidx.compose.material3.SelectableChipColors, androidx.compose.material3.SelectableChipElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
