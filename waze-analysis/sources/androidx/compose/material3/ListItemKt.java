package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableStateKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ListItemKt {
    private static final float InteractiveListBottomPadding;
    private static final float InteractiveListInternalSpacing;
    private static final float InteractiveListTopPadding;
    private static final float InteractiveListVerticalAlignmentBreakpoint;
    private static final float LeadingContentEndPadding = 16.0f;
    private static final float ListItemEndPadding = 16.0f;
    private static final float ListItemStartPadding = 16.0f;
    private static final float ListItemThreeLineVerticalPadding = 12.0f;
    private static final float ListItemVerticalPadding = 8.0f;
    private static final float TrailingContentStartPadding = 16.0f;
    private static final float InteractiveListStartPadding = ListTokens.INSTANCE.m6829getItemLeadingSpaceD9Ej5fM();
    private static final float InteractiveListEndPadding = ListTokens.INSTANCE.m6838getItemTrailingSpaceD9Ej5fM();

    static {
        float fM6835getItemTopSpaceD9Ej5fM = ListTokens.INSTANCE.m6835getItemTopSpaceD9Ej5fM();
        InteractiveListTopPadding = fM6835getItemTopSpaceD9Ej5fM;
        float fM6819getItemBottomSpaceD9Ej5fM = ListTokens.INSTANCE.m6819getItemBottomSpaceD9Ej5fM();
        InteractiveListBottomPadding = fM6819getItemBottomSpaceD9Ej5fM;
        InteractiveListInternalSpacing = ListTokens.INSTANCE.m6818getItemBetweenSpaceD9Ej5fM();
        InteractiveListVerticalAlignmentBreakpoint = (((ListTokens.INSTANCE.m6834getItemThreeLineContainerHeightD9Ej5fM() + ListTokens.INSTANCE.m6839getItemTwoLineContainerHeightD9Ej5fM()) / 2.0f) - fM6835getItemTopSpaceD9Ej5fM) - fM6819getItemBottomSpaceD9Ej5fM;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void CollectInteractionsAsState(androidx.compose.foundation.interaction.InteractionSource r17, androidx.compose.runtime.MutableState<java.lang.Boolean> r18, androidx.compose.runtime.MutableState<java.lang.Boolean> r19, androidx.compose.runtime.MutableState<java.lang.Boolean> r20, androidx.compose.runtime.MutableState<java.lang.Boolean> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.CollectInteractionsAsState(androidx.compose.foundation.interaction.InteractionSource, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab CollectInteractionsAsState$lambda$1(InteractionSource interactionSource, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, int i2, int i3, Composer composer, int i4) {
        CollectInteractionsAsState(interactionSource, mutableState, mutableState2, mutableState3, mutableState4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* renamed from: ContentDecorator-3J-VO9M, reason: not valid java name */
    private static final void m5145ContentDecorator3JVO9M(long j2, final TypographyKeyTokens typographyKeyTokens, p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        long j3;
        final p<? super Composer, ? super Integer, ab> pVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(747020814);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(j2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(typographyKeyTokens.ordinal()) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(747020814, i3, -1, "androidx.compose.material3.ContentDecorator (ListItem.kt:1234)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = ListItemKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            j3 = j2;
            ProvideContentColorTextStyleKt.m6286ProvideContentColorTextStyle3JVO9M(j3, TypographyKt.getValue(typographyKeyTokens, composerStartRestartGroup, (i3 >> 3) & 14), pVar, composerStartRestartGroup, i3 & DisplayStrings.DS_SEND_LOGS);
            pVar2 = pVar;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            j3 = j2;
            pVar2 = pVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j4 = j3;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda18
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.ContentDecorator_3J_VO9M$lambda$1(j4, typographyKeyTokens, pVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab ContentDecorator_3J_VO9M$lambda$1(long j2, TypographyKeyTokens typographyKeyTokens, p pVar, int i2, Composer composer, int i3) {
        m5145ContentDecorator3JVO9M(j2, typographyKeyTokens, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final void InteractiveListItem(final Modifier modifier, final p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final p<? super Composer, ? super Integer, ab> pVar4, final p<? super Composer, ? super Integer, ab> pVar5, final Alignment.Vertical vertical, final boolean z, final boolean z2, final l<? super SemanticsPropertyReceiver, ab> lVar, final a<ab> aVar, final a<ab> aVar2, final String str, final MutableInteractionSource mutableInteractionSource, final ListItemColors listItemColors, final ListItemShapes listItemShapes, final ListItemElevation listItemElevation, final PaddingValues paddingValues, Composer composer, final int i2, final int i3) {
        int i4;
        p<? super Composer, ? super Integer, ab> pVar6;
        int i5;
        int i6;
        String str2;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        MutableState mutableState;
        MutableState mutableState2;
        Shape shape;
        Object currentState;
        State state;
        Object currentState2;
        Object currentState3;
        State state2;
        Object currentState4;
        State state3;
        Object currentState5;
        Object currentState6;
        Snapshot.Companion companion;
        Snapshot currentThreadSnapshot;
        l<Object, ab> readObserver;
        Snapshot snapshotMakeCurrentNonObservable;
        int i7 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1408227475);
        if (i7 == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar3) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar4) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            pVar6 = pVar5;
            i4 |= true != composerStartRestartGroup.changedInstance(pVar6) ? 65536 : 131072;
        } else {
            pVar6 = pVar5;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(vertical) ? 524288 : 1048576;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z) ? 4194304 : 8388608;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z2) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 268435456 : 536870912;
        }
        int i8 = i4;
        if ((i3 & 6) == 0) {
            i5 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 = i5 | (true != composerStartRestartGroup.changedInstance(aVar2) ? 16 : 32);
        } else {
            i6 = i5;
        }
        if ((i3 & 384) == 0) {
            str2 = str;
            i6 |= true != composerStartRestartGroup.changed(str2) ? 128 : 256;
        } else {
            str2 = str;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i6 |= true != composerStartRestartGroup.changed(mutableInteractionSource) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i6 |= true != composerStartRestartGroup.changed(listItemColors) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i6 |= true != composerStartRestartGroup.changed(listItemShapes) ? 65536 : 131072;
        }
        if ((1572864 & i3) == 0) {
            i6 |= true != composerStartRestartGroup.changed(listItemElevation) ? 524288 : 1048576;
        }
        if ((12582912 & i3) == 0) {
            i6 |= true != composerStartRestartGroup.changed(paddingValues) ? 4194304 : 8388608;
        }
        int i9 = i6;
        if (composerStartRestartGroup.shouldExecute(((i8 & 306783379) == 306783378 && (4793491 & i9) == 4793490) ? false : true, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1408227475, i8, i9, "androidx.compose.material3.InteractiveListItem (ListItem.kt:1324)");
            }
            if (mutableInteractionSource == null) {
                composerStartRestartGroup.startReplaceGroup(736607630);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-391881111);
                composerStartRestartGroup.endReplaceGroup();
                mutableInteractionSource2 = mutableInteractionSource;
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue2 = mutableStateMutableStateOf$default;
            }
            MutableState mutableState3 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                mutableInteractionSource3 = mutableInteractionSource2;
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            MutableState mutableState4 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                mutableState = mutableState4;
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                mutableState = mutableState4;
            }
            MutableState mutableState5 = (MutableState) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                mutableState2 = mutableState5;
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                mutableState2 = mutableState5;
            }
            MutableState mutableState6 = (MutableState) objRememberedValue5;
            MutableState mutableState7 = mutableState;
            MutableState mutableState8 = mutableState2;
            CollectInteractionsAsState(mutableInteractionSource3, mutableState3, mutableState7, mutableState8, mutableState6, composerStartRestartGroup, 28080, 0);
            final FiniteAnimationSpec finiteAnimationSpecValue = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composerStartRestartGroup, 6);
            FiniteAnimationSpec finiteAnimationSpecValue2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composerStartRestartGroup, 6);
            FiniteAnimationSpec finiteAnimationSpecValue3 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composerStartRestartGroup, 6);
            Shape shapeShapeForInteraction = ListItemDefaultsKt.shapeForInteraction(listItemShapes, z2, ((Boolean) mutableState3.getValue()).booleanValue(), ((Boolean) mutableState7.getValue()).booleanValue(), ((Boolean) mutableState8.getValue()).booleanValue(), ((Boolean) mutableState6.getValue()).booleanValue(), finiteAnimationSpecValue2, composerStartRestartGroup, ((i9 >> 15) & 14) | ((i8 >> 21) & 112));
            final Transition transitionUpdateTransition = TransitionKt.updateTransition(new InteractiveListColorState(z, z2, ((Boolean) mutableState6.getValue()).booleanValue()), "ListColor", composerStartRestartGroup, 48, 0);
            q qVar = new q() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda37
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec finiteAnimationSpec = finiteAnimationSpecValue;
                    ListItemKt.InteractiveListItem$lambda$5(finiteAnimationSpec, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return finiteAnimationSpec;
                }
            };
            InteractiveListColorState interactiveListColorState = (InteractiveListColorState) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceGroup(519559029);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(519559029, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1360)");
            }
            long jM5088containerColorXeAY9LY = listItemColors.m5088containerColorXeAY9LY(interactiveListColorState.getEnabled(), interactiveListColorState.getSelected(), interactiveListColorState.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            ColorSpace colorSpaceM8232getColorSpaceimpl = Color.m8232getColorSpaceimpl(jM5088containerColorXeAY9LY);
            boolean zChanged = composerStartRestartGroup.changed(colorSpaceM8232getColorSpaceimpl);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpaceM8232getColorSpaceimpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue6;
            if (transitionUpdateTransition.isSeeking()) {
                shape = shapeShapeForInteraction;
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged2 = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || currentState == Composer.Companion.getEmpty()) {
                    companion = Snapshot.Companion;
                    currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    shape = shapeShapeForInteraction;
                    snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState7 = transitionUpdateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        composerStartRestartGroup.updateRememberedValue(currentState7);
                        currentState = currentState7;
                    } finally {
                    }
                } else {
                    shape = shapeShapeForInteraction;
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            InteractiveListColorState interactiveListColorState2 = (InteractiveListColorState) currentState;
            composerStartRestartGroup.startReplaceGroup(519559029);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(519559029, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1360)");
            }
            long jM5088containerColorXeAY9LY2 = listItemColors.m5088containerColorXeAY9LY(interactiveListColorState2.getEnabled(), interactiveListColorState2.getSelected(), interactiveListColorState2.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM8218boximpl = Color.m8218boximpl(jM5088containerColorXeAY9LY2);
            boolean zChanged3 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt.derivedStateOf(new a<InteractiveListColorState>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$1
                    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.material3.InteractiveListColorState, java.lang.Object] */
                    @Override // h.g.a.a
                    public final InteractiveListColorState invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            InteractiveListColorState interactiveListColorState3 = (InteractiveListColorState) ((State) objRememberedValue7).getValue();
            composerStartRestartGroup.startReplaceGroup(519559029);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(519559029, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1360)");
            }
            long jM5088containerColorXeAY9LY3 = listItemColors.m5088containerColorXeAY9LY(interactiveListColorState3.getEnabled(), interactiveListColorState3.getSelected(), interactiveListColorState3.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM8218boximpl2 = Color.m8218boximpl(jM5088containerColorXeAY9LY3);
            boolean zChanged4 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt.derivedStateOf(new a<Transition.Segment<InteractiveListColorState>>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // h.g.a.a
                    public final Transition.Segment<InteractiveListColorState> invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM8218boximpl, colorM8218boximpl2, (FiniteAnimationSpec) qVar.invoke(((State) objRememberedValue8).getValue(), composerStartRestartGroup, 0), twoWayConverter, "ColorAnimation", composerStartRestartGroup, 0);
            q qVar2 = new q() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda38
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec finiteAnimationSpec = finiteAnimationSpecValue;
                    ListItemKt.InteractiveListItem$lambda$8(finiteAnimationSpec, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return finiteAnimationSpec;
                }
            };
            InteractiveListColorState interactiveListColorState4 = (InteractiveListColorState) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceGroup(-154619267);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-154619267, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1368)");
            }
            long jM5089contentColorXeAY9LY = listItemColors.m5089contentColorXeAY9LY(interactiveListColorState4.getEnabled(), interactiveListColorState4.getSelected(), interactiveListColorState4.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            ColorSpace colorSpaceM8232getColorSpaceimpl2 = Color.m8232getColorSpaceimpl(jM5089contentColorXeAY9LY);
            boolean zChanged5 = composerStartRestartGroup.changed(colorSpaceM8232getColorSpaceimpl2);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                objRememberedValue9 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpaceM8232getColorSpaceimpl2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            TwoWayConverter twoWayConverter2 = (TwoWayConverter) objRememberedValue9;
            if (transitionUpdateTransition.isSeeking()) {
                state = stateCreateTransitionAnimation;
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState2 = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged6 = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState2 = composerStartRestartGroup.rememberedValue();
                if (zChanged6 || currentState2 == Composer.Companion.getEmpty()) {
                    companion = Snapshot.Companion;
                    currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    state = stateCreateTransitionAnimation;
                    try {
                        Object currentState8 = transitionUpdateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        composerStartRestartGroup.updateRememberedValue(currentState8);
                        currentState2 = currentState8;
                    } finally {
                    }
                } else {
                    state = stateCreateTransitionAnimation;
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            InteractiveListColorState interactiveListColorState5 = (InteractiveListColorState) currentState2;
            composerStartRestartGroup.startReplaceGroup(-154619267);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-154619267, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1368)");
            }
            long jM5089contentColorXeAY9LY2 = listItemColors.m5089contentColorXeAY9LY(interactiveListColorState5.getEnabled(), interactiveListColorState5.getSelected(), interactiveListColorState5.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM8218boximpl3 = Color.m8218boximpl(jM5089contentColorXeAY9LY2);
            boolean zChanged7 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChanged7 || objRememberedValue10 == Composer.Companion.getEmpty()) {
                objRememberedValue10 = SnapshotStateKt.derivedStateOf(new a<InteractiveListColorState>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$3
                    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.material3.InteractiveListColorState, java.lang.Object] */
                    @Override // h.g.a.a
                    public final InteractiveListColorState invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            InteractiveListColorState interactiveListColorState6 = (InteractiveListColorState) ((State) objRememberedValue10).getValue();
            composerStartRestartGroup.startReplaceGroup(-154619267);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-154619267, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1368)");
            }
            long jM5089contentColorXeAY9LY3 = listItemColors.m5089contentColorXeAY9LY(interactiveListColorState6.getEnabled(), interactiveListColorState6.getSelected(), interactiveListColorState6.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM8218boximpl4 = Color.m8218boximpl(jM5089contentColorXeAY9LY3);
            boolean zChanged8 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zChanged8 || objRememberedValue11 == Composer.Companion.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt.derivedStateOf(new a<Transition.Segment<InteractiveListColorState>>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // h.g.a.a
                    public final Transition.Segment<InteractiveListColorState> invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            final State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM8218boximpl3, colorM8218boximpl4, (FiniteAnimationSpec) qVar2.invoke(((State) objRememberedValue11).getValue(), composerStartRestartGroup, 0), twoWayConverter2, "ColorAnimation", composerStartRestartGroup, 0);
            q qVar3 = new q() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda39
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec finiteAnimationSpec = finiteAnimationSpecValue;
                    ListItemKt.InteractiveListItem$lambda$11(finiteAnimationSpec, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return finiteAnimationSpec;
                }
            };
            InteractiveListColorState interactiveListColorState7 = (InteractiveListColorState) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceGroup(-836285680);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-836285680, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1376)");
            }
            long jM5124leadingContentColorXeAY9LY = listItemColors.m5124leadingContentColorXeAY9LY(interactiveListColorState7.getEnabled(), interactiveListColorState7.getSelected(), interactiveListColorState7.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            ColorSpace colorSpaceM8232getColorSpaceimpl3 = Color.m8232getColorSpaceimpl(jM5124leadingContentColorXeAY9LY);
            boolean zChanged9 = composerStartRestartGroup.changed(colorSpaceM8232getColorSpaceimpl3);
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (zChanged9 || objRememberedValue12 == Composer.Companion.getEmpty()) {
                objRememberedValue12 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpaceM8232getColorSpaceimpl3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            TwoWayConverter twoWayConverter3 = (TwoWayConverter) objRememberedValue12;
            if (transitionUpdateTransition.isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState3 = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged10 = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState3 = composerStartRestartGroup.rememberedValue();
                if (zChanged10 || currentState3 == Composer.Companion.getEmpty()) {
                    companion = Snapshot.Companion;
                    currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState9 = transitionUpdateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        composerStartRestartGroup.updateRememberedValue(currentState9);
                        currentState3 = currentState9;
                    } finally {
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            InteractiveListColorState interactiveListColorState8 = (InteractiveListColorState) currentState3;
            composerStartRestartGroup.startReplaceGroup(-836285680);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-836285680, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1376)");
            }
            long jM5124leadingContentColorXeAY9LY2 = listItemColors.m5124leadingContentColorXeAY9LY(interactiveListColorState8.getEnabled(), interactiveListColorState8.getSelected(), interactiveListColorState8.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM8218boximpl5 = Color.m8218boximpl(jM5124leadingContentColorXeAY9LY2);
            boolean zChanged11 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (zChanged11 || objRememberedValue13 == Composer.Companion.getEmpty()) {
                objRememberedValue13 = SnapshotStateKt.derivedStateOf(new a<InteractiveListColorState>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$5
                    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.material3.InteractiveListColorState, java.lang.Object] */
                    @Override // h.g.a.a
                    public final InteractiveListColorState invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            InteractiveListColorState interactiveListColorState9 = (InteractiveListColorState) ((State) objRememberedValue13).getValue();
            composerStartRestartGroup.startReplaceGroup(-836285680);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-836285680, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1376)");
            }
            long jM5124leadingContentColorXeAY9LY3 = listItemColors.m5124leadingContentColorXeAY9LY(interactiveListColorState9.getEnabled(), interactiveListColorState9.getSelected(), interactiveListColorState9.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM8218boximpl6 = Color.m8218boximpl(jM5124leadingContentColorXeAY9LY3);
            boolean zChanged12 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (zChanged12 || objRememberedValue14 == Composer.Companion.getEmpty()) {
                objRememberedValue14 = SnapshotStateKt.derivedStateOf(new a<Transition.Segment<InteractiveListColorState>>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$6
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // h.g.a.a
                    public final Transition.Segment<InteractiveListColorState> invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            State stateCreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM8218boximpl5, colorM8218boximpl6, (FiniteAnimationSpec) qVar3.invoke(((State) objRememberedValue14).getValue(), composerStartRestartGroup, 0), twoWayConverter3, "ColorAnimation", composerStartRestartGroup, 0);
            q qVar4 = new q() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda40
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec finiteAnimationSpec = finiteAnimationSpecValue;
                    ListItemKt.InteractiveListItem$lambda$14(finiteAnimationSpec, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return finiteAnimationSpec;
                }
            };
            InteractiveListColorState interactiveListColorState10 = (InteractiveListColorState) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceGroup(-1629003078);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1629003078, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1384)");
            }
            long jM5127trailingContentColorXeAY9LY = listItemColors.m5127trailingContentColorXeAY9LY(interactiveListColorState10.getEnabled(), interactiveListColorState10.getSelected(), interactiveListColorState10.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            ColorSpace colorSpaceM8232getColorSpaceimpl4 = Color.m8232getColorSpaceimpl(jM5127trailingContentColorXeAY9LY);
            boolean zChanged13 = composerStartRestartGroup.changed(colorSpaceM8232getColorSpaceimpl4);
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (zChanged13 || objRememberedValue15 == Composer.Companion.getEmpty()) {
                objRememberedValue15 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpaceM8232getColorSpaceimpl4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            TwoWayConverter twoWayConverter4 = (TwoWayConverter) objRememberedValue15;
            if (transitionUpdateTransition.isSeeking()) {
                state2 = stateCreateTransitionAnimation3;
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState4 = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged14 = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState4 = composerStartRestartGroup.rememberedValue();
                if (zChanged14 || currentState4 == Composer.Companion.getEmpty()) {
                    companion = Snapshot.Companion;
                    currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    state2 = stateCreateTransitionAnimation3;
                    try {
                        Object currentState10 = transitionUpdateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        composerStartRestartGroup.updateRememberedValue(currentState10);
                        currentState4 = currentState10;
                    } finally {
                    }
                } else {
                    state2 = stateCreateTransitionAnimation3;
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            InteractiveListColorState interactiveListColorState11 = (InteractiveListColorState) currentState4;
            composerStartRestartGroup.startReplaceGroup(-1629003078);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1629003078, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1384)");
            }
            long jM5127trailingContentColorXeAY9LY2 = listItemColors.m5127trailingContentColorXeAY9LY(interactiveListColorState11.getEnabled(), interactiveListColorState11.getSelected(), interactiveListColorState11.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM8218boximpl7 = Color.m8218boximpl(jM5127trailingContentColorXeAY9LY2);
            boolean zChanged15 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (zChanged15 || objRememberedValue16 == Composer.Companion.getEmpty()) {
                objRememberedValue16 = SnapshotStateKt.derivedStateOf(new a<InteractiveListColorState>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$7
                    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.material3.InteractiveListColorState, java.lang.Object] */
                    @Override // h.g.a.a
                    public final InteractiveListColorState invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            }
            InteractiveListColorState interactiveListColorState12 = (InteractiveListColorState) ((State) objRememberedValue16).getValue();
            composerStartRestartGroup.startReplaceGroup(-1629003078);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1629003078, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1384)");
            }
            long jM5127trailingContentColorXeAY9LY3 = listItemColors.m5127trailingContentColorXeAY9LY(interactiveListColorState12.getEnabled(), interactiveListColorState12.getSelected(), interactiveListColorState12.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM8218boximpl8 = Color.m8218boximpl(jM5127trailingContentColorXeAY9LY3);
            boolean zChanged16 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (zChanged16 || objRememberedValue17 == Composer.Companion.getEmpty()) {
                objRememberedValue17 = SnapshotStateKt.derivedStateOf(new a<Transition.Segment<InteractiveListColorState>>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$8
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // h.g.a.a
                    public final Transition.Segment<InteractiveListColorState> invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            }
            State stateCreateTransitionAnimation4 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM8218boximpl7, colorM8218boximpl8, (FiniteAnimationSpec) qVar4.invoke(((State) objRememberedValue17).getValue(), composerStartRestartGroup, 0), twoWayConverter4, "ColorAnimation", composerStartRestartGroup, 0);
            q qVar5 = new q() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda41
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec finiteAnimationSpec = finiteAnimationSpecValue;
                    ListItemKt.InteractiveListItem$lambda$17(finiteAnimationSpec, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return finiteAnimationSpec;
                }
            };
            InteractiveListColorState interactiveListColorState13 = (InteractiveListColorState) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceGroup(984715150);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(984715150, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1392)");
            }
            long jM5125overlineContentColorXeAY9LY = listItemColors.m5125overlineContentColorXeAY9LY(interactiveListColorState13.getEnabled(), interactiveListColorState13.getSelected(), interactiveListColorState13.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            ColorSpace colorSpaceM8232getColorSpaceimpl5 = Color.m8232getColorSpaceimpl(jM5125overlineContentColorXeAY9LY);
            boolean zChanged17 = composerStartRestartGroup.changed(colorSpaceM8232getColorSpaceimpl5);
            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (zChanged17 || objRememberedValue18 == Composer.Companion.getEmpty()) {
                objRememberedValue18 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpaceM8232getColorSpaceimpl5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
            }
            TwoWayConverter twoWayConverter5 = (TwoWayConverter) objRememberedValue18;
            if (transitionUpdateTransition.isSeeking()) {
                state3 = stateCreateTransitionAnimation4;
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState5 = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged18 = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState5 = composerStartRestartGroup.rememberedValue();
                if (zChanged18 || currentState5 == Composer.Companion.getEmpty()) {
                    companion = Snapshot.Companion;
                    currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    state3 = stateCreateTransitionAnimation4;
                    try {
                        Object currentState11 = transitionUpdateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        composerStartRestartGroup.updateRememberedValue(currentState11);
                        currentState5 = currentState11;
                    } finally {
                    }
                } else {
                    state3 = stateCreateTransitionAnimation4;
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            InteractiveListColorState interactiveListColorState14 = (InteractiveListColorState) currentState5;
            composerStartRestartGroup.startReplaceGroup(984715150);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(984715150, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1392)");
            }
            long jM5125overlineContentColorXeAY9LY2 = listItemColors.m5125overlineContentColorXeAY9LY(interactiveListColorState14.getEnabled(), interactiveListColorState14.getSelected(), interactiveListColorState14.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM8218boximpl9 = Color.m8218boximpl(jM5125overlineContentColorXeAY9LY2);
            boolean zChanged19 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
            if (zChanged19 || objRememberedValue19 == Composer.Companion.getEmpty()) {
                objRememberedValue19 = SnapshotStateKt.derivedStateOf(new a<InteractiveListColorState>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$9
                    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.material3.InteractiveListColorState, java.lang.Object] */
                    @Override // h.g.a.a
                    public final InteractiveListColorState invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
            }
            InteractiveListColorState interactiveListColorState15 = (InteractiveListColorState) ((State) objRememberedValue19).getValue();
            composerStartRestartGroup.startReplaceGroup(984715150);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(984715150, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1392)");
            }
            long jM5125overlineContentColorXeAY9LY3 = listItemColors.m5125overlineContentColorXeAY9LY(interactiveListColorState15.getEnabled(), interactiveListColorState15.getSelected(), interactiveListColorState15.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM8218boximpl10 = Color.m8218boximpl(jM5125overlineContentColorXeAY9LY3);
            boolean zChanged20 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
            if (zChanged20 || objRememberedValue20 == Composer.Companion.getEmpty()) {
                objRememberedValue20 = SnapshotStateKt.derivedStateOf(new a<Transition.Segment<InteractiveListColorState>>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$10
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // h.g.a.a
                    public final Transition.Segment<InteractiveListColorState> invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
            }
            final State stateCreateTransitionAnimation5 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM8218boximpl9, colorM8218boximpl10, (FiniteAnimationSpec) qVar5.invoke(((State) objRememberedValue20).getValue(), composerStartRestartGroup, 0), twoWayConverter5, "ColorAnimation", composerStartRestartGroup, 0);
            q qVar6 = new q() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda42
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec finiteAnimationSpec = finiteAnimationSpecValue;
                    ListItemKt.InteractiveListItem$lambda$20(finiteAnimationSpec, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return finiteAnimationSpec;
                }
            };
            InteractiveListColorState interactiveListColorState16 = (InteractiveListColorState) transitionUpdateTransition.getTargetState();
            composerStartRestartGroup.startReplaceGroup(-1535703933);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1535703933, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1400)");
            }
            long jM5126supportingContentColorXeAY9LY = listItemColors.m5126supportingContentColorXeAY9LY(interactiveListColorState16.getEnabled(), interactiveListColorState16.getSelected(), interactiveListColorState16.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            ColorSpace colorSpaceM8232getColorSpaceimpl6 = Color.m8232getColorSpaceimpl(jM5126supportingContentColorXeAY9LY);
            boolean zChanged21 = composerStartRestartGroup.changed(colorSpaceM8232getColorSpaceimpl6);
            Object objRememberedValue21 = composerStartRestartGroup.rememberedValue();
            if (zChanged21 || objRememberedValue21 == Composer.Companion.getEmpty()) {
                objRememberedValue21 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpaceM8232getColorSpaceimpl6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
            }
            TwoWayConverter twoWayConverter6 = (TwoWayConverter) objRememberedValue21;
            if (transitionUpdateTransition.isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState6 = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged22 = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState6 = composerStartRestartGroup.rememberedValue();
                if (zChanged22 || currentState6 == Composer.Companion.getEmpty()) {
                    companion = Snapshot.Companion;
                    currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState12 = transitionUpdateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        composerStartRestartGroup.updateRememberedValue(currentState12);
                        currentState6 = currentState12;
                    } finally {
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            InteractiveListColorState interactiveListColorState17 = (InteractiveListColorState) currentState6;
            composerStartRestartGroup.startReplaceGroup(-1535703933);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1535703933, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1400)");
            }
            long jM5126supportingContentColorXeAY9LY2 = listItemColors.m5126supportingContentColorXeAY9LY(interactiveListColorState17.getEnabled(), interactiveListColorState17.getSelected(), interactiveListColorState17.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM8218boximpl11 = Color.m8218boximpl(jM5126supportingContentColorXeAY9LY2);
            boolean zChanged23 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (zChanged23 || objRememberedValue22 == Composer.Companion.getEmpty()) {
                objRememberedValue22 = SnapshotStateKt.derivedStateOf(new a<InteractiveListColorState>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$11
                    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.material3.InteractiveListColorState, java.lang.Object] */
                    @Override // h.g.a.a
                    public final InteractiveListColorState invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
            }
            InteractiveListColorState interactiveListColorState18 = (InteractiveListColorState) ((State) objRememberedValue22).getValue();
            composerStartRestartGroup.startReplaceGroup(-1535703933);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1535703933, 0, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1400)");
            }
            long jM5126supportingContentColorXeAY9LY3 = listItemColors.m5126supportingContentColorXeAY9LY(interactiveListColorState18.getEnabled(), interactiveListColorState18.getSelected(), interactiveListColorState18.getDragged());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Color colorM8218boximpl12 = Color.m8218boximpl(jM5126supportingContentColorXeAY9LY3);
            boolean zChanged24 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue23 = composerStartRestartGroup.rememberedValue();
            if (zChanged24 || objRememberedValue23 == Composer.Companion.getEmpty()) {
                objRememberedValue23 = SnapshotStateKt.derivedStateOf(new a<Transition.Segment<InteractiveListColorState>>() { // from class: androidx.compose.material3.ListItemKt$InteractiveListItem$$inlined$animateColor$12
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // h.g.a.a
                    public final Transition.Segment<InteractiveListColorState> invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
            }
            final State stateCreateTransitionAnimation6 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM8218boximpl11, colorM8218boximpl12, (FiniteAnimationSpec) qVar6.invoke(((State) objRememberedValue23).getValue(), composerStartRestartGroup, 0), twoWayConverter6, "ColorAnimation", composerStartRestartGroup, 0);
            final TypographyKeyTokens itemLeadingAvatarLabelFont = ListTokens.INSTANCE.getItemLeadingAvatarLabelFont();
            final TypographyKeyTokens itemTrailingSupportingTextFont = ListTokens.INSTANCE.getItemTrailingSupportingTextFont();
            final TypographyKeyTokens itemOverlineFont = ListTokens.INSTANCE.getItemOverlineFont();
            final TypographyKeyTokens itemSupportingTextFont = ListTokens.INSTANCE.getItemSupportingTextFont();
            final TypographyKeyTokens itemLabelTextFont = ListTokens.INSTANCE.getItemLabelTextFont();
            final State<Dp> stateM1867animateDpAsStateAjpBEmI = AnimateAsStateKt.m1867animateDpAsStateAjpBEmI(((Boolean) mutableState6.getValue()).booleanValue() ? listItemElevation.m5136getDraggedElevationD9Ej5fM() : listItemElevation.m5137getElevationD9Ej5fM(), finiteAnimationSpecValue3, null, null, composerStartRestartGroup, 0, 12);
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            final LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(InteractiveListItem$lambda$10(stateCreateTransitionAnimation2)));
            final State state4 = state;
            final State state5 = state2;
            final State state6 = state3;
            final String str3 = str2;
            final Shape shape2 = shape;
            final p<? super Composer, ? super Integer, ab> pVar7 = pVar6;
            final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
            p pVar8 = new p() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda43
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.InteractiveListItem$lambda$23(modifier, lVar, stateM1867animateDpAsStateAjpBEmI, density, shape2, mutableInteractionSource4, z, str3, aVar2, aVar, paddingValues, vertical, state4, layoutDirection, itemLeadingAvatarLabelFont, pVar2, state5, itemTrailingSupportingTextFont, pVar3, state6, itemOverlineFont, pVar4, stateCreateTransitionAnimation5, itemSupportingTextFont, pVar7, stateCreateTransitionAnimation6, itemLabelTextFont, pVar, stateCreateTransitionAnimation2, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
            composerStartRestartGroup = composerStartRestartGroup;
            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(-1377981779, true, pVar8, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda44
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.InteractiveListItem$lambda$24(modifier, pVar, pVar2, pVar3, pVar4, pVar5, vertical, z, z2, lVar, aVar, aVar2, str, mutableInteractionSource, listItemColors, listItemShapes, listItemElevation, paddingValues, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long InteractiveListItem$lambda$10(State<Color> state) {
        return state.getValue().m8238unboximpl();
    }

    static final FiniteAnimationSpec InteractiveListItem$lambda$11(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(438180226);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(438180226, i2, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1375)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    private static final long InteractiveListItem$lambda$13(State<Color> state) {
        return state.getValue().m8238unboximpl();
    }

    static final FiniteAnimationSpec InteractiveListItem$lambda$14(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(-775265656);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-775265656, i2, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1383)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    private static final long InteractiveListItem$lambda$16(State<Color> state) {
        return state.getValue().m8238unboximpl();
    }

    static final FiniteAnimationSpec InteractiveListItem$lambda$17(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(1838452572);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1838452572, i2, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1391)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    private static final long InteractiveListItem$lambda$19(State<Color> state) {
        return state.getValue().m8238unboximpl();
    }

    static final FiniteAnimationSpec InteractiveListItem$lambda$20(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(-1432794927);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1432794927, i2, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1399)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    private static final long InteractiveListItem$lambda$22(State<Color> state) {
        return state.getValue().m8238unboximpl();
    }

    static final ab InteractiveListItem$lambda$23(Modifier modifier, l lVar, final State state, final Density density, final Shape shape, MutableInteractionSource mutableInteractionSource, boolean z, String str, a aVar, a aVar2, final PaddingValues paddingValues, Alignment.Vertical vertical, State state2, final LayoutDirection layoutDirection, final TypographyKeyTokens typographyKeyTokens, final p pVar, final State state3, final TypographyKeyTokens typographyKeyTokens2, final p pVar2, final State state4, final TypographyKeyTokens typographyKeyTokens3, final p pVar3, final State state5, final TypographyKeyTokens typographyKeyTokens4, final p pVar4, final State state6, final TypographyKeyTokens typographyKeyTokens5, final p pVar5, final State state7, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1377981779, i2, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1419)");
            }
            Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(SizeKt.m2807defaultMinSizeVpY3zN4$default(SemanticsModifierKt.semantics(modifier, true, lVar), 0.0f, ListTokens.INSTANCE.m6831getItemOneLineContainerHeightD9Ej5fM(), 1, null));
            boolean zChanged = composer.changed(state);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new FloatProducer() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda1
                    @Override // androidx.compose.material3.internal.FloatProducer
                    public final float invoke() {
                        return ListItemKt.InteractiveListItem$lambda$23$0$0(state);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierZIndexLambda = zIndexLambda(modifierMinimumInteractiveComponentSize, (FloatProducer) objRememberedValue);
            boolean zChanged2 = composer.changed(density) | composer.changed(state) | composer.changed(shape);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda2
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ListItemKt.InteractiveListItem$lambda$23$1$0(density, shape, state, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            InteractiveListItemLayout(PaddingKt.padding(ClickableKt.m2011combinedClickableauXiCPI$default(ClipKt.clip(BackgroundKt.m1971backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(modifierZIndexLambda, (l) objRememberedValue2), InteractiveListItem$lambda$7(state2), shape), shape), mutableInteractionSource, RippleKt.m5414rippleOu1YvPQ$default(false, 0.0f, 0L, shape, false, false, false, false, 247, null), z, null, null, str, aVar, null, false, aVar2, 408, null), paddingValues), vertical, ComposableLambdaKt.rememberComposableLambda(-334713283, true, new p() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.InteractiveListItem$lambda$23$2(paddingValues, layoutDirection, typographyKeyTokens, pVar, state3, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), ComposableLambdaKt.rememberComposableLambda(-1109808834, true, new p() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.InteractiveListItem$lambda$23$3(paddingValues, layoutDirection, typographyKeyTokens2, pVar2, state4, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), ComposableLambdaKt.rememberComposableLambda(-1884904385, true, new p() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda5
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.InteractiveListItem$lambda$23$4(typographyKeyTokens3, pVar3, state5, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), ComposableLambdaKt.rememberComposableLambda(1634967360, true, new p() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda6
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.InteractiveListItem$lambda$23$5(typographyKeyTokens4, pVar4, state6, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), ComposableLambdaKt.rememberComposableLambda(859871809, true, new p() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda7
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.InteractiveListItem$lambda$23$6(typographyKeyTokens5, pVar5, state7, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 1797504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float InteractiveListItem$lambda$23$0$0(State state) {
        return Dp.m11163compareTo0680j_4(((Dp) state.getValue()).m11178unboximpl(), 0.0f) > 0 ? 1.0f : 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab InteractiveListItem$lambda$23$1$0(Density density, Shape shape, State state, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setShadowElevation(density.mo2127toPx0680j_4(((Dp) state.getValue()).m11178unboximpl()));
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(false);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab InteractiveListItem$lambda$23$2(PaddingValues paddingValues, LayoutDirection layoutDirection, TypographyKeyTokens typographyKeyTokens, p pVar, State state, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-334713283, i2, -1, "androidx.compose.material3.InteractiveListItem.<anonymous>.<anonymous> (ListItem.kt:1445)");
            }
            m5146LeadingDecorator8s8adOk(PaddingKt.calculateStartPadding(paddingValues, layoutDirection), InteractiveListItem$lambda$13(state), typographyKeyTokens, pVar, composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab InteractiveListItem$lambda$23$3(PaddingValues paddingValues, LayoutDirection layoutDirection, TypographyKeyTokens typographyKeyTokens, p pVar, State state, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1109808834, i2, -1, "androidx.compose.material3.InteractiveListItem.<anonymous>.<anonymous> (ListItem.kt:1453)");
            }
            m5151TrailingDecorator8s8adOk(PaddingKt.calculateEndPadding(paddingValues, layoutDirection), InteractiveListItem$lambda$16(state), typographyKeyTokens, pVar, composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab InteractiveListItem$lambda$23$4(TypographyKeyTokens typographyKeyTokens, p pVar, State state, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1884904385, i2, -1, "androidx.compose.material3.InteractiveListItem.<anonymous>.<anonymous> (ListItem.kt:1461)");
            }
            m5148OverlineDecorator3JVO9M(InteractiveListItem$lambda$19(state), typographyKeyTokens, pVar, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab InteractiveListItem$lambda$23$5(TypographyKeyTokens typographyKeyTokens, p pVar, State state, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1634967360, i2, -1, "androidx.compose.material3.InteractiveListItem.<anonymous>.<anonymous> (ListItem.kt:1468)");
            }
            m5150SupportingDecorator3JVO9M(InteractiveListItem$lambda$22(state), typographyKeyTokens, pVar, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab InteractiveListItem$lambda$23$6(TypographyKeyTokens typographyKeyTokens, p pVar, State state, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(859871809, i2, -1, "androidx.compose.material3.InteractiveListItem.<anonymous>.<anonymous> (ListItem.kt:1475)");
            }
            m5145ContentDecorator3JVO9M(InteractiveListItem$lambda$10(state), typographyKeyTokens, pVar, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab InteractiveListItem$lambda$24(Modifier modifier, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, Alignment.Vertical vertical, boolean z, boolean z2, l lVar, a aVar, a aVar2, String str, MutableInteractionSource mutableInteractionSource, ListItemColors listItemColors, ListItemShapes listItemShapes, ListItemElevation listItemElevation, PaddingValues paddingValues, int i2, int i3, Composer composer, int i4) {
        InteractiveListItem(modifier, pVar, pVar2, pVar3, pVar4, pVar5, vertical, z, z2, lVar, aVar, aVar2, str, mutableInteractionSource, listItemColors, listItemShapes, listItemElevation, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return ab.f48028a;
    }

    static final FiniteAnimationSpec InteractiveListItem$lambda$5(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(1215615335);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1215615335, i2, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1359)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    private static final long InteractiveListItem$lambda$7(State<Color> state) {
        return state.getValue().m8238unboximpl();
    }

    static final FiniteAnimationSpec InteractiveListItem$lambda$8(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(1119846639);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1119846639, i2, -1, "androidx.compose.material3.InteractiveListItem.<anonymous> (ListItem.kt:1367)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    private static final void InteractiveListItemLayout(final Modifier modifier, final Alignment.Vertical vertical, final p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final p<? super Composer, ? super Integer, ab> pVar4, final p<? super Composer, ? super Integer, ab> pVar5, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1118275927);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(vertical) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar3) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar4) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar5) ? 524288 : 1048576;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1118275927, i3, -1, "androidx.compose.material3.InteractiveListItemLayout (ListItem.kt:1494)");
            }
            int i5 = i3 & 112;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new InteractiveListItemMeasurePolicy(vertical);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            InteractiveListItemMeasurePolicy interactiveListItemMeasurePolicy = (InteractiveListItemMeasurePolicy) objRememberedValue;
            p<Composer, Integer, ab> pVarCombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(i.i(pVar, pVar2, pVar3, pVar4, pVar5));
            boolean zChanged = composerStartRestartGroup.changed(interactiveListItemMeasurePolicy);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(interactiveListItemMeasurePolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
            int iM = ListItemKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            pVarCombineAsVirtualLayouts.invoke(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda48
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.InteractiveListItemLayout$lambda$1(modifier, vertical, pVar, pVar2, pVar3, pVar4, pVar5, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab InteractiveListItemLayout$lambda$1(Modifier modifier, Alignment.Vertical vertical, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, int i2, Composer composer, int i3) {
        InteractiveListItemLayout(modifier, vertical, pVar, pVar2, pVar3, pVar4, pVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* renamed from: LeadingDecorator-8s8adOk, reason: not valid java name */
    private static final void m5146LeadingDecorator8s8adOk(final float f2, final long j2, final TypographyKeyTokens typographyKeyTokens, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        long j3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(748132977);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(f2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            j3 = j2;
            i3 |= true != composerStartRestartGroup.changed(j3) ? 16 : 32;
        } else {
            j3 = j2;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(typographyKeyTokens.ordinal()) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(748132977, i3, -1, "androidx.compose.material3.LeadingDecorator (ListItem.kt:1151)");
            }
            if (pVar != null) {
                composerStartRestartGroup.startReplaceGroup(1044406198);
                Modifier.Companion companion = Modifier.Companion;
                float f3 = InteractiveListInternalSpacing;
                Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(companion, 0.0f, 0.0f, f3, 0.0f, 11, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM = ListItemKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
                a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
                Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                float f4 = f2 + f3;
                float fM11178unboximpl = ((Dp) composerStartRestartGroup.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m11178unboximpl();
                if (true == Float.isNaN(fM11178unboximpl)) {
                    fM11178unboximpl = 0.0f;
                }
                ProvideContentColorTextStyleKt.m6287ProvideContentColorTextStyleKTwxG1Y(j3, TypographyKt.getValue(typographyKeyTokens, composerStartRestartGroup, (i3 >> 6) & 14), new ProvidedValue[]{InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize().provides(Dp.m11162boximpl(((Dp) n.o(Dp.m11162boximpl(fM11178unboximpl - f4), Dp.m11162boximpl(0.0f))).m11178unboximpl()))}, pVar, composerStartRestartGroup, ((i3 >> 3) & 14) | (ProvidedValue.$stable << 6) | (i3 & 7168));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1045077937);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda16
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.LeadingDecorator_8s8adOk$lambda$1(f2, j2, typographyKeyTokens, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab LeadingDecorator_8s8adOk$lambda$1(float f2, long j2, TypographyKeyTokens typographyKeyTokens, p pVar, int i2, Composer composer, int i3) {
        m5146LeadingDecorator8s8adOk(f2, j2, typographyKeyTokens, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:274:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ListItem(final boolean r34, final h.g.a.l<? super java.lang.Boolean, h.ab> r35, androidx.compose.ui.Modifier r36, boolean r37, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r38, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r40, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r41, androidx.compose.ui.Alignment.Vertical r42, h.g.a.a<h.ab> r43, java.lang.String r44, androidx.compose.material3.ListItemShapes r45, androidx.compose.material3.ListItemColors r46, androidx.compose.material3.ListItemElevation r47, androidx.compose.foundation.layout.PaddingValues r48, androidx.compose.foundation.interaction.MutableInteractionSource r49, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1119
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.ListItem(boolean, h.g.a.l, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.ui.Alignment$Vertical, h.g.a.a, java.lang.String, androidx.compose.material3.ListItemShapes, androidx.compose.material3.ListItemColors, androidx.compose.material3.ListItemElevation, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ListItem$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return ab.f48028a;
    }

    static final ab ListItem$lambda$1(a aVar, Modifier modifier, boolean z, p pVar, p pVar2, p pVar3, p pVar4, Alignment.Vertical vertical, a aVar2, String str, ListItemShapes listItemShapes, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, p pVar5, int i2, int i3, int i4, Composer composer, int i5) {
        ListItem(aVar, modifier, z, pVar, pVar2, pVar3, pVar4, vertical, aVar2, str, listItemShapes, listItemColors, listItemElevation, paddingValues, mutableInteractionSource, pVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ListItem$lambda$2$0(boolean z, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z);
        SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m10321getRadioButtono7Vup1c());
        return ab.f48028a;
    }

    static final ab ListItem$lambda$3(boolean z, a aVar, Modifier modifier, boolean z2, p pVar, p pVar2, p pVar3, p pVar4, Alignment.Vertical vertical, a aVar2, String str, ListItemShapes listItemShapes, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, p pVar5, int i2, int i3, int i4, Composer composer, int i5) {
        ListItem(z, (a<ab>) aVar, modifier, z2, (p<? super Composer, ? super Integer, ab>) pVar, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, (p<? super Composer, ? super Integer, ab>) pVar4, vertical, (a<ab>) aVar2, str, listItemShapes, listItemColors, listItemElevation, paddingValues, mutableInteractionSource, (p<? super Composer, ? super Integer, ab>) pVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ListItem$lambda$4$0(boolean z, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, ToggleableStateKt.ToggleableState(z));
        SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m10318getCheckboxo7Vup1c());
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ListItem$lambda$5$0(l lVar, boolean z) {
        lVar.invoke(Boolean.valueOf(!z));
        return ab.f48028a;
    }

    static final ab ListItem$lambda$6(boolean z, l lVar, Modifier modifier, boolean z2, p pVar, p pVar2, p pVar3, p pVar4, Alignment.Vertical vertical, a aVar, String str, ListItemShapes listItemShapes, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, p pVar5, int i2, int i3, int i4, Composer composer, int i5) {
        ListItem(z, (l<? super Boolean, ab>) lVar, modifier, z2, (p<? super Composer, ? super Integer, ab>) pVar, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, (p<? super Composer, ? super Integer, ab>) pVar4, vertical, (a<ab>) aVar, str, listItemShapes, listItemColors, listItemElevation, paddingValues, mutableInteractionSource, (p<? super Composer, ? super Integer, ab>) pVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /* renamed from: ListItem-HXNGIdc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5147ListItemHXNGIdc(final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r25, androidx.compose.ui.Modifier r26, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r27, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r28, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r29, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r30, androidx.compose.material3.ListItemColors r31, float r32, float r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.m5147ListItemHXNGIdc(h.g.a.p, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.material3.ListItemColors, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void ListItemLayout(final p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final p<? super Composer, ? super Integer, ab> pVar4, final p<? super Composer, ? super Integer, ab> pVar5, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-61277522);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar3) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar4) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar5) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-61277522, i3, -1, "androidx.compose.material3.ListItemLayout (ListItem.kt:729)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new ListItemMeasurePolicy();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ListItemMeasurePolicy listItemMeasurePolicy = (ListItemMeasurePolicy) objRememberedValue;
            p[] pVarArr = new p[5];
            pVarArr[0] = pVar3;
            pVarArr[1] = pVar4 == null ? ComposableSingletons$ListItemKt.INSTANCE.m4626getLambda$489887388$material3() : pVar4;
            pVarArr[2] = pVar5 == null ? ComposableSingletons$ListItemKt.INSTANCE.getLambda$1629163587$material3() : pVar5;
            pVarArr[3] = pVar == null ? ComposableSingletons$ListItemKt.INSTANCE.m4627getLambda$546752734$material3() : pVar;
            pVarArr[4] = pVar2 == null ? ComposableSingletons$ListItemKt.INSTANCE.getLambda$1572298241$material3() : pVar2;
            List listI = i.i(pVarArr);
            ListItemMeasurePolicy listItemMeasurePolicy2 = listItemMeasurePolicy;
            Modifier.Companion companion = Modifier.Companion;
            p<Composer, Integer, ab> pVarCombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listI);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(listItemMeasurePolicy2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
            int iM = ListItemKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            pVarCombineAsVirtualLayouts.invoke(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda17
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.ListItemLayout$lambda$1(pVar, pVar2, pVar3, pVar4, pVar5, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab ListItemLayout$lambda$1(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, int i2, Composer composer, int i3) {
        ListItemLayout(pVar, pVar2, pVar3, pVar4, pVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab ListItem_HXNGIdc$lambda$0(ListItemColors listItemColors, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(629852750, i2, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:142)");
            }
            m5149ProvideTextStyleFromToken3JVO9M(listItemColors.m5089contentColorXeAY9LY(true, false, false), ListTokens.INSTANCE.getItemLabelTextFont(), pVar, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ListItem_HXNGIdc$lambda$1$0(ListItemColors listItemColors, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1291211644, i2, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:151)");
            }
            m5149ProvideTextStyleFromToken3JVO9M(listItemColors.m5126supportingContentColorXeAY9LY(true, false, false), ListTokens.INSTANCE.getItemSupportingTextFont(), pVar, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ListItem_HXNGIdc$lambda$2$0(ListItemColors listItemColors, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(372414991, i2, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:165)");
            }
            m5149ProvideTextStyleFromToken3JVO9M(listItemColors.m5125overlineContentColorXeAY9LY(true, false, false), ListTokens.INSTANCE.getItemOverlineFont(), pVar, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ListItem_HXNGIdc$lambda$3$0(ListItemColors listItemColors, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(449548451, i2, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:175)");
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, LeadingContentEndPadding, 0.0f, 11, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = ListItemKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM2759paddingqDBjuR0$default);
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
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(listItemColors.m5124leadingContentColorXeAY9LY(true, false, false))), (p<? super Composer, ? super Integer, ab>) pVar, composer, ProvidedValue.$stable);
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
    public static final ab ListItem_HXNGIdc$lambda$4$0(ListItemColors listItemColors, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1946411067, i2, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:191)");
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, TrailingContentStartPadding, 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = ListItemKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM2759paddingqDBjuR0$default);
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
            m5149ProvideTextStyleFromToken3JVO9M(listItemColors.m5127trailingContentColorXeAY9LY(true, false, false), ListTokens.INSTANCE.getItemTrailingSupportingTextFont(), pVar, composer, 48);
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
    public static final ab ListItem_HXNGIdc$lambda$5$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return ab.f48028a;
    }

    static final ab ListItem_HXNGIdc$lambda$6(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1192488737, i2, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:213)");
            }
            ListItemLayout(pVar, pVar2, pVar3, pVar4, pVar5, composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab ListItem_HXNGIdc$lambda$7(p pVar, Modifier modifier, p pVar2, p pVar3, p pVar4, p pVar5, ListItemColors listItemColors, float f2, float f3, int i2, int i3, Composer composer, int i4) {
        m5147ListItemHXNGIdc(pVar, modifier, pVar2, pVar3, pVar4, pVar5, listItemColors, f2, f3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* renamed from: OverlineDecorator-3J-VO9M, reason: not valid java name */
    private static final void m5148OverlineDecorator3JVO9M(long j2, final TypographyKeyTokens typographyKeyTokens, p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        long j3;
        final p<? super Composer, ? super Integer, ab> pVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(899793657);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(j2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(typographyKeyTokens.ordinal()) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(899793657, i3, -1, "androidx.compose.material3.OverlineDecorator (ListItem.kt:1200)");
            }
            if (pVar != null) {
                composerStartRestartGroup.startReplaceGroup(862092540);
                Modifier.Companion companion = Modifier.Companion;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM = ListItemKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
                Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                j3 = j2;
                ProvideContentColorTextStyleKt.m6286ProvideContentColorTextStyle3JVO9M(j3, TypographyKt.getValue(typographyKeyTokens, composerStartRestartGroup, (i3 >> 3) & 14), pVar, composerStartRestartGroup, i3 & DisplayStrings.DS_SEND_LOGS);
                pVar2 = pVar;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                j3 = j2;
                pVar2 = pVar;
                composerStartRestartGroup.startReplaceGroup(862289545);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            j3 = j2;
            pVar2 = pVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j4 = j3;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda19
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.OverlineDecorator_3J_VO9M$lambda$1(j4, typographyKeyTokens, pVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab OverlineDecorator_3J_VO9M$lambda$1(long j2, TypographyKeyTokens typographyKeyTokens, p pVar, int i2, Composer composer, int i3) {
        m5148OverlineDecorator3JVO9M(j2, typographyKeyTokens, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* renamed from: ProvideTextStyleFromToken-3J-VO9M, reason: not valid java name */
    private static final void m5149ProvideTextStyleFromToken3JVO9M(long j2, final TypographyKeyTokens typographyKeyTokens, p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        long j3;
        final p<? super Composer, ? super Integer, ab> pVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-285397024);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(j2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(typographyKeyTokens.ordinal()) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-285397024, i3, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:1079)");
            }
            j3 = j2;
            ProvideContentColorTextStyleKt.m6286ProvideContentColorTextStyle3JVO9M(j3, TypographyKt.getValue(typographyKeyTokens, composerStartRestartGroup, (i3 >> 3) & 14), pVar, composerStartRestartGroup, i3 & DisplayStrings.DS_SEND_LOGS);
            pVar2 = pVar;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            j3 = j2;
            pVar2 = pVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j4 = j3;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda49
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.ProvideTextStyleFromToken_3J_VO9M$lambda$0(j4, typographyKeyTokens, pVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab ProvideTextStyleFromToken_3J_VO9M$lambda$0(long j2, TypographyKeyTokens typographyKeyTokens, p pVar, int i2, Composer composer, int i3) {
        m5149ProvideTextStyleFromToken3JVO9M(j2, typographyKeyTokens, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SegmentedListItem(final boolean r34, final h.g.a.l<? super java.lang.Boolean, h.ab> r35, final androidx.compose.material3.ListItemShapes r36, androidx.compose.ui.Modifier r37, boolean r38, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r40, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r41, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r42, androidx.compose.ui.Alignment.Vertical r43, h.g.a.a<h.ab> r44, java.lang.String r45, androidx.compose.material3.ListItemColors r46, androidx.compose.material3.ListItemElevation r47, androidx.compose.foundation.layout.PaddingValues r48, androidx.compose.foundation.interaction.MutableInteractionSource r49, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.SegmentedListItem(boolean, h.g.a.l, androidx.compose.material3.ListItemShapes, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.ui.Alignment$Vertical, h.g.a.a, java.lang.String, androidx.compose.material3.ListItemColors, androidx.compose.material3.ListItemElevation, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SegmentedListItem$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return ab.f48028a;
    }

    static final ab SegmentedListItem$lambda$1(a aVar, ListItemShapes listItemShapes, Modifier modifier, boolean z, p pVar, p pVar2, p pVar3, p pVar4, Alignment.Vertical vertical, a aVar2, String str, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, p pVar5, int i2, int i3, int i4, Composer composer, int i5) {
        SegmentedListItem(aVar, listItemShapes, modifier, z, pVar, pVar2, pVar3, pVar4, vertical, aVar2, str, listItemColors, listItemElevation, paddingValues, mutableInteractionSource, pVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SegmentedListItem$lambda$2$0(boolean z, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z);
        SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m10321getRadioButtono7Vup1c());
        return ab.f48028a;
    }

    static final ab SegmentedListItem$lambda$3(boolean z, a aVar, ListItemShapes listItemShapes, Modifier modifier, boolean z2, p pVar, p pVar2, p pVar3, p pVar4, Alignment.Vertical vertical, a aVar2, String str, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, p pVar5, int i2, int i3, int i4, Composer composer, int i5) {
        SegmentedListItem(z, (a<ab>) aVar, listItemShapes, modifier, z2, (p<? super Composer, ? super Integer, ab>) pVar, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, (p<? super Composer, ? super Integer, ab>) pVar4, vertical, (a<ab>) aVar2, str, listItemColors, listItemElevation, paddingValues, mutableInteractionSource, (p<? super Composer, ? super Integer, ab>) pVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SegmentedListItem$lambda$4$0(boolean z, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, ToggleableStateKt.ToggleableState(z));
        SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m10318getCheckboxo7Vup1c());
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SegmentedListItem$lambda$5$0(l lVar, boolean z) {
        lVar.invoke(Boolean.valueOf(!z));
        return ab.f48028a;
    }

    static final ab SegmentedListItem$lambda$6(boolean z, l lVar, ListItemShapes listItemShapes, Modifier modifier, boolean z2, p pVar, p pVar2, p pVar3, p pVar4, Alignment.Vertical vertical, a aVar, String str, ListItemColors listItemColors, ListItemElevation listItemElevation, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, p pVar5, int i2, int i3, int i4, Composer composer, int i5) {
        SegmentedListItem(z, (l<? super Boolean, ab>) lVar, listItemShapes, modifier, z2, (p<? super Composer, ? super Integer, ab>) pVar, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, (p<? super Composer, ? super Integer, ab>) pVar4, vertical, (a<ab>) aVar, str, listItemColors, listItemElevation, paddingValues, mutableInteractionSource, (p<? super Composer, ? super Integer, ab>) pVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* renamed from: SupportingDecorator-3J-VO9M, reason: not valid java name */
    private static final void m5150SupportingDecorator3JVO9M(long j2, final TypographyKeyTokens typographyKeyTokens, p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        long j3;
        final p<? super Composer, ? super Integer, ab> pVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-3493404);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(j2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(typographyKeyTokens.ordinal()) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-3493404, i3, -1, "androidx.compose.material3.SupportingDecorator (ListItem.kt:1217)");
            }
            if (pVar != null) {
                composerStartRestartGroup.startReplaceGroup(-992630287);
                Modifier.Companion companion = Modifier.Companion;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM = ListItemKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
                Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                j3 = j2;
                ProvideContentColorTextStyleKt.m6286ProvideContentColorTextStyle3JVO9M(j3, TypographyKt.getValue(typographyKeyTokens, composerStartRestartGroup, (i3 >> 3) & 14), pVar, composerStartRestartGroup, i3 & DisplayStrings.DS_SEND_LOGS);
                pVar2 = pVar;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                j3 = j2;
                pVar2 = pVar;
                composerStartRestartGroup.startReplaceGroup(-992433282);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            j3 = j2;
            pVar2 = pVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j4 = j3;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda22
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.SupportingDecorator_3J_VO9M$lambda$1(j4, typographyKeyTokens, pVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab SupportingDecorator_3J_VO9M$lambda$1(long j2, TypographyKeyTokens typographyKeyTokens, p pVar, int i2, Composer composer, int i3) {
        m5150SupportingDecorator3JVO9M(j2, typographyKeyTokens, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* renamed from: TrailingDecorator-8s8adOk, reason: not valid java name */
    private static final void m5151TrailingDecorator8s8adOk(final float f2, final long j2, final TypographyKeyTokens typographyKeyTokens, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        long j3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2086562817);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(f2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            j3 = j2;
            i3 |= true != composerStartRestartGroup.changed(j3) ? 16 : 32;
        } else {
            j3 = j2;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(typographyKeyTokens.ordinal()) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2086562817, i3, -1, "androidx.compose.material3.TrailingDecorator (ListItem.kt:1176)");
            }
            if (pVar != null) {
                composerStartRestartGroup.startReplaceGroup(268980104);
                Modifier.Companion companion = Modifier.Companion;
                float f3 = InteractiveListInternalSpacing;
                Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(companion, f3, 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM = ListItemKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
                a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
                Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                float f4 = f2 + f3;
                float fM11178unboximpl = ((Dp) composerStartRestartGroup.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m11178unboximpl();
                if (true == Float.isNaN(fM11178unboximpl)) {
                    fM11178unboximpl = 0.0f;
                }
                ProvideContentColorTextStyleKt.m6287ProvideContentColorTextStyleKTwxG1Y(j3, TypographyKt.getValue(typographyKeyTokens, composerStartRestartGroup, (i3 >> 6) & 14), new ProvidedValue[]{InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize().provides(Dp.m11162boximpl(((Dp) n.o(Dp.m11162boximpl(fM11178unboximpl - f4), Dp.m11162boximpl(0.0f))).m11178unboximpl()))}, pVar, composerStartRestartGroup, ((i3 >> 3) & 14) | (ProvidedValue.$stable << 6) | (i3 & 7168));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(269651843);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda32
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.TrailingDecorator_8s8adOk$lambda$1(f2, j2, typographyKeyTokens, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab TrailingDecorator_8s8adOk$lambda$1(float f2, long j2, TypographyKeyTokens typographyKeyTokens, p pVar, int i2, Composer composer, int i3) {
        m5151TrailingDecorator8s8adOk(f2, j2, typographyKeyTokens, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-N4Jib3Y, reason: not valid java name */
    public static final int m5155calculateHeightN4Jib3Y(IntrinsicMeasureScope intrinsicMeasureScope, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2) {
        return n.i(Math.max(Math.max(Constraints.m11108getMinHeightimpl(j2), intrinsicMeasureScope.mo2121roundToPx0680j_4(ListItemType.m5162equalsimpl0(i7, ListItemType.Companion.m5167getOneLineAlXitO8()) ? ListTokens.INSTANCE.m6831getItemOneLineContainerHeightD9Ej5fM() : ListItemType.m5162equalsimpl0(i7, ListItemType.Companion.m5169getTwoLineAlXitO8()) ? ListTokens.INSTANCE.m6839getItemTwoLineContainerHeightD9Ej5fM() : ListTokens.INSTANCE.m6834getItemThreeLineContainerHeightD9Ej5fM())), i8 + Math.max(i2, Math.max(i4 + i5 + i6, i3))), Constraints.m11106getMaxHeightimpl(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    public static final int m5156calculateWidthyeHjK3Y(IntrinsicMeasureScope intrinsicMeasureScope, int i2, int i3, int i4, int i5, int i6, int i7, long j2) {
        if (Constraints.m11103getHasBoundedWidthimpl(j2)) {
            return Constraints.m11107getMaxWidthimpl(j2);
        }
        return i7 + i2 + Math.max(i4, Math.max(i5, i6)) + i3;
    }

    public static final float getInteractiveListBottomPadding() {
        return InteractiveListBottomPadding;
    }

    public static final float getInteractiveListEndPadding() {
        return InteractiveListEndPadding;
    }

    public static final float getInteractiveListInternalSpacing() {
        return InteractiveListInternalSpacing;
    }

    public static final float getInteractiveListStartPadding() {
        return InteractiveListStartPadding;
    }

    public static final float getInteractiveListTopPadding() {
        return InteractiveListTopPadding;
    }

    public static final float getInteractiveListVerticalAlignmentBreakpoint() {
        return InteractiveListVerticalAlignmentBreakpoint;
    }

    public static final float getLeadingContentEndPadding() {
        return LeadingContentEndPadding;
    }

    public static final float getListItemEndPadding() {
        return ListItemEndPadding;
    }

    public static final float getListItemStartPadding() {
        return ListItemStartPadding;
    }

    public static final float getListItemThreeLineVerticalPadding() {
        return ListItemThreeLineVerticalPadding;
    }

    public static final float getListItemVerticalPadding() {
        return ListItemVerticalPadding;
    }

    public static final float getTrailingContentStartPadding() {
        return TrailingContentStartPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSupportingMultilineHeuristic(Density density, int i2) {
        return i2 > density.mo2120roundToPxR2X_6o(TextUnitKt.getSp(30));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult place(MeasureScope measureScope, final int i2, final int i3, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, final Placeable placeable5, final boolean z, final int i4, final int i5, final int i6) {
        return MeasureScope.CC.layout$default(measureScope, i2, i3, null, new l() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda8
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ListItemKt.place$lambda$0(placeable, i4, z, i6, placeable3, placeable4, placeable5, i3, placeable2, i2, i5, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    static final ab place$lambda$0(Placeable placeable, int i2, boolean z, int i3, Placeable placeable2, Placeable placeable3, Placeable placeable4, int i4, Placeable placeable5, int i5, int i6, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i2, z ? i3 : Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i4), 0.0f, 4, null);
        }
        int widthOrZero = i2 + LayoutUtilKt.getWidthOrZero(placeable);
        int iAlign = z ? i3 : Alignment.Companion.getCenterVertically().align(LayoutUtilKt.getHeightOrZero(placeable2) + LayoutUtilKt.getHeightOrZero(placeable3) + LayoutUtilKt.getHeightOrZero(placeable4), i4);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, widthOrZero, iAlign, 0.0f, 4, null);
        }
        int heightOrZero = iAlign + LayoutUtilKt.getHeightOrZero(placeable3);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, widthOrZero, heightOrZero, 0.0f, 4, null);
        }
        int heightOrZero2 = heightOrZero + LayoutUtilKt.getHeightOrZero(placeable2);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, widthOrZero, heightOrZero2, 0.0f, 4, null);
        }
        if (placeable5 != null) {
            int width = (i5 - i6) - placeable5.getWidth();
            if (!z) {
                i3 = Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i4);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, width, i3, 0.0f, 4, null);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verticalPadding-yh95HIg, reason: not valid java name */
    public static final float m5157verticalPaddingyh95HIg(int i2) {
        return ListItemType.m5162equalsimpl0(i2, ListItemType.Companion.m5168getThreeLineAlXitO8()) ? ListItemThreeLineVerticalPadding : ListItemVerticalPadding;
    }

    private static final Modifier zIndexLambda(Modifier modifier, final FloatProducer floatProducer) {
        return LayoutModifierKt.layout(modifier, new q() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda36
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ListItemKt.zIndexLambda$lambda$0(floatProducer, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            }
        });
    }

    static final MeasureResult zIndexLambda$lambda$0(final FloatProducer floatProducer, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(constraints.m11113unboximpl());
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.material3.ListItemKt$$ExternalSyntheticLambda23
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ListItemKt.zIndexLambda$lambda$0$0(placeableMo9741measureBRTryo0, floatProducer, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab zIndexLambda$lambda$0$0(Placeable placeable, FloatProducer floatProducer, Placeable.PlacementScope placementScope) {
        placementScope.place(placeable, 0, 0, floatProducer.invoke());
        return ab.f48028a;
    }

    public static /* synthetic */ void getLeadingContentEndPadding$annotations() {
    }

    public static /* synthetic */ void getListItemEndPadding$annotations() {
    }

    public static /* synthetic */ void getListItemStartPadding$annotations() {
    }

    public static /* synthetic */ void getListItemThreeLineVerticalPadding$annotations() {
    }

    public static /* synthetic */ void getListItemVerticalPadding$annotations() {
    }

    public static /* synthetic */ void getTrailingContentStartPadding$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SegmentedListItem(final boolean r33, final h.g.a.a<h.ab> r34, final androidx.compose.material3.ListItemShapes r35, androidx.compose.ui.Modifier r36, boolean r37, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r38, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r40, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r41, androidx.compose.ui.Alignment.Vertical r42, h.g.a.a<h.ab> r43, java.lang.String r44, androidx.compose.material3.ListItemColors r45, androidx.compose.material3.ListItemElevation r46, androidx.compose.foundation.layout.PaddingValues r47, androidx.compose.foundation.interaction.MutableInteractionSource r48, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r49, androidx.compose.runtime.Composer r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.SegmentedListItem(boolean, h.g.a.a, androidx.compose.material3.ListItemShapes, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.ui.Alignment$Vertical, h.g.a.a, java.lang.String, androidx.compose.material3.ListItemColors, androidx.compose.material3.ListItemElevation, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ListItem(final boolean r35, final h.g.a.a<h.ab> r36, androidx.compose.ui.Modifier r37, boolean r38, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r40, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r41, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r42, androidx.compose.ui.Alignment.Vertical r43, h.g.a.a<h.ab> r44, java.lang.String r45, androidx.compose.material3.ListItemShapes r46, androidx.compose.material3.ListItemColors r47, androidx.compose.material3.ListItemElevation r48, androidx.compose.foundation.layout.PaddingValues r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r51, androidx.compose.runtime.Composer r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.ListItem(boolean, h.g.a.a, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.ui.Alignment$Vertical, h.g.a.a, java.lang.String, androidx.compose.material3.ListItemShapes, androidx.compose.material3.ListItemColors, androidx.compose.material3.ListItemElevation, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SegmentedListItem(final h.g.a.a<h.ab> r32, final androidx.compose.material3.ListItemShapes r33, androidx.compose.ui.Modifier r34, boolean r35, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r36, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r37, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r38, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, androidx.compose.ui.Alignment.Vertical r40, h.g.a.a<h.ab> r41, java.lang.String r42, androidx.compose.material3.ListItemColors r43, androidx.compose.material3.ListItemElevation r44, androidx.compose.foundation.layout.PaddingValues r45, androidx.compose.foundation.interaction.MutableInteractionSource r46, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.SegmentedListItem(h.g.a.a, androidx.compose.material3.ListItemShapes, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.ui.Alignment$Vertical, h.g.a.a, java.lang.String, androidx.compose.material3.ListItemColors, androidx.compose.material3.ListItemElevation, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ListItem(final h.g.a.a<h.ab> r33, androidx.compose.ui.Modifier r34, boolean r35, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r36, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r37, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r38, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, androidx.compose.ui.Alignment.Vertical r40, h.g.a.a<h.ab> r41, java.lang.String r42, androidx.compose.material3.ListItemShapes r43, androidx.compose.material3.ListItemColors r44, androidx.compose.material3.ListItemElevation r45, androidx.compose.foundation.layout.PaddingValues r46, androidx.compose.foundation.interaction.MutableInteractionSource r47, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r48, androidx.compose.runtime.Composer r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ListItemKt.ListItem(h.g.a.a, androidx.compose.ui.Modifier, boolean, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.ui.Alignment$Vertical, h.g.a.a, java.lang.String, androidx.compose.material3.ListItemShapes, androidx.compose.material3.ListItemColors, androidx.compose.material3.ListItemElevation, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.p, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
