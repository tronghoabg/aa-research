package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.internal.AnimatedShapeKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.SegmentedMenuTokens;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.window.PopupProperties;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MenuKt {
    public static final float ClosedAlphaTarget = 0.0f;
    public static final float ClosedScaleTarget = 0.8f;
    private static final float DropdownMenuGroupVerticalPadding = 2.0f;
    private static final float DropdownMenuItemHorizontalPadding = 12.0f;
    public static final float ExpandedAlphaTarget = 1.0f;
    public static final float ExpandedScaleTarget = 1.0f;
    private static final String GhostLeadingIconLayoutId = "ghostLeadingIcon";
    private static final String LeadingIconLayoutId = "leadingIcon";
    private static final float MenuHorizontalMargin = 8.0f;
    private static final float MenuListItemContainerHeight = 48.0f;
    private static final float MenuVerticalMargin = 48.0f;
    private static final String TextLayoutId = "text";
    private static final String TrailingIconLayoutId = "trailingIcon";
    private static final PaddingValues DropdownMenuSelectableItemPadding = PaddingKt.m2750PaddingValuesYgX7TsA$default(4.0f, 0.0f, 2, null);
    private static final PaddingValues DropdownMenuSelectableItemWithSupportTexPadding = PaddingKt.m2749PaddingValuesYgX7TsA(4.0f, 2.0f);
    private static final float DropdownMenuVerticalPadding = 8.0f;
    private static final float DropdownMenuItemDefaultMinWidth = 112.0f;
    private static final float DropdownMenuItemDefaultMaxWidth = 280.0f;
    private static final float DropdownMenuGroupDefaultMinHeight = 32.0f;

    /* renamed from: DropdownMenuContent-Qj0Zi0g, reason: not valid java name */
    public static final void m5228DropdownMenuContentQj0Zi0g(final Modifier modifier, final MutableTransitionState<Boolean> mutableTransitionState, final MutableState<TransformOrigin> mutableState, final ScrollState scrollState, final Shape shape, final long j2, final float f2, final float f3, final BorderStroke borderStroke, final q<? super ColumnScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Object currentState;
        Object currentState2;
        boolean z;
        Object obj;
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(848986741);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(mutableTransitionState) : composerStartRestartGroup.changedInstance(mutableTransitionState)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(mutableState) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(scrollState) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(shape) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(j2) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f2) ? 524288 : 1048576;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f3) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(borderStroke) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(qVar) ? 268435456 : 536870912;
        }
        if (composerStartRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(848986741, i3, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:1127)");
            }
            final Transition transitionUpdateTransition = TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, "DropDownMenu", composerStartRestartGroup, MutableTransitionState.$stable | 48 | ((i3 >> 3) & 14), 0);
            final FiniteAnimationSpec finiteAnimationSpecValue = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composerStartRestartGroup, 6);
            final FiniteAnimationSpec finiteAnimationSpecValue2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composerStartRestartGroup, 6);
            q qVar2 = new q() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda29
                @Override // h.g.a.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    FiniteAnimationSpec finiteAnimationSpec = finiteAnimationSpecValue;
                    MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$0(finiteAnimationSpec, (Transition.Segment) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    return finiteAnimationSpec;
                }
            };
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(h.g.b.q.f48127a);
            if (transitionUpdateTransition.isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState = composerStartRestartGroup.rememberedValue();
                if (zChanged || currentState == Composer.Companion.getEmpty()) {
                    Snapshot.Companion companion = Snapshot.Companion;
                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState3 = transitionUpdateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        composerStartRestartGroup.updateRememberedValue(currentState3);
                        currentState = currentState3;
                    } catch (Throwable th) {
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            boolean zBooleanValue = ((Boolean) currentState).booleanValue();
            composerStartRestartGroup.startReplaceGroup(143964305);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(143964305, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1135)");
            }
            float f4 = true != zBooleanValue ? 0.8f : 1.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf = Float.valueOf(f4);
            boolean zChanged2 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new a<Boolean>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent-Qj0Zi0g$$inlined$animateFloat$1
                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // h.g.a.a
                    public final Boolean invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            boolean zBooleanValue2 = ((Boolean) ((State) objRememberedValue).getValue()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(143964305);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(143964305, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1135)");
            }
            float f5 = true != zBooleanValue2 ? 0.8f : 1.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf2 = Float.valueOf(f5);
            boolean zChanged3 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new a<Transition.Segment<Boolean>>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent-Qj0Zi0g$$inlined$animateFloat$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // h.g.a.a
                    public final Transition.Segment<Boolean> invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, fValueOf2, (FiniteAnimationSpec) qVar2.invoke(((State) objRememberedValue2).getValue(), composerStartRestartGroup, 0), vectorConverter, "FloatAnimation", composerStartRestartGroup, 0);
            q qVar3 = new q() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda30
                @Override // h.g.a.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    FiniteAnimationSpec finiteAnimationSpec = finiteAnimationSpecValue2;
                    MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$3(finiteAnimationSpec, (Transition.Segment) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    return finiteAnimationSpec;
                }
            };
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(h.g.b.q.f48127a);
            if (transitionUpdateTransition.isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState2 = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged4 = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState2 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || currentState2 == Composer.Companion.getEmpty()) {
                    Snapshot.Companion companion2 = Snapshot.Companion;
                    Snapshot currentThreadSnapshot2 = companion2.getCurrentThreadSnapshot();
                    l<Object, ab> readObserver2 = currentThreadSnapshot2 != null ? currentThreadSnapshot2.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable2 = companion2.makeCurrentNonObservable(currentThreadSnapshot2);
                    try {
                        Object currentState4 = transitionUpdateTransition.getCurrentState();
                        companion2.restoreNonObservable(currentThreadSnapshot2, snapshotMakeCurrentNonObservable2, readObserver2);
                        composerStartRestartGroup.updateRememberedValue(currentState4);
                        currentState2 = currentState4;
                    } catch (Throwable th2) {
                        companion2.restoreNonObservable(currentThreadSnapshot2, snapshotMakeCurrentNonObservable2, readObserver2);
                        throw th2;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            boolean zBooleanValue3 = ((Boolean) currentState2).booleanValue();
            composerStartRestartGroup.startReplaceGroup(892761509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(892761509, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1140)");
            }
            float f6 = true != zBooleanValue3 ? 0.0f : 1.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf3 = Float.valueOf(f6);
            boolean zChanged5 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new a<Boolean>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent-Qj0Zi0g$$inlined$animateFloat$3
                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // h.g.a.a
                    public final Boolean invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            boolean zBooleanValue4 = ((Boolean) ((State) objRememberedValue3).getValue()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(892761509);
            if (ComposerKt.isTraceInProgress()) {
                z = false;
                ComposerKt.traceEventStart(892761509, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1140)");
            } else {
                z = false;
            }
            float f7 = true != zBooleanValue4 ? 0.0f : 1.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf4 = Float.valueOf(f7);
            boolean zChanged6 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged6 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.derivedStateOf(new a<Transition.Segment<Boolean>>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuContent-Qj0Zi0g$$inlined$animateFloat$4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // h.g.a.a
                    public final Transition.Segment<Boolean> invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            boolean z2 = z;
            final State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf3, fValueOf4, (FiniteAnimationSpec) qVar3.invoke(((State) objRememberedValue4).getValue(), composerStartRestartGroup, 0), vectorConverter2, "FloatAnimation", composerStartRestartGroup, 0);
            final boolean zBooleanValue5 = ((Boolean) composerStartRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            Modifier.Companion companion3 = Modifier.Companion;
            boolean zChanged7 = composerStartRestartGroup.changed(zBooleanValue5) | composerStartRestartGroup.changed(stateCreateTransitionAnimation) | (((i3 & 112) == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(mutableTransitionState))) ? true : z2) | composerStartRestartGroup.changed(stateCreateTransitionAnimation2);
            if ((i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256) {
                z2 = true;
            }
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if ((zChanged7 || z2) || objRememberedValue5 == Composer.Companion.getEmpty()) {
                i4 = i3;
                obj = new l() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda31
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$6$0(zBooleanValue5, mutableTransitionState, mutableState, stateCreateTransitionAnimation, stateCreateTransitionAnimation2, (GraphicsLayerScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                i4 = i3;
                obj = objRememberedValue5;
            }
            int i6 = i4 >> 9;
            int i7 = i4 >> 6;
            SurfaceKt.m5669SurfaceT9BRK9s(GraphicsLayerModifierKt.graphicsLayer(companion3, (l) obj), shape, j2, 0L, f2, f3, borderStroke, ComposableLambdaKt.rememberComposableLambda(-1463404422, true, new p() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda32
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$7(modifier, scrollState, qVar, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i6 & DisplayStrings.DS_TAP_TO_VERIFY) | (i6 & 112) | 12582912 | (57344 & i7) | (458752 & i7) | (3670016 & i7), 8);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda33
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return MenuKt.DropdownMenuContent_Qj0Zi0g$lambda$8(modifier, mutableTransitionState, mutableState, scrollState, shape, j2, f2, f3, borderStroke, qVar, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final FiniteAnimationSpec DropdownMenuContent_Qj0Zi0g$lambda$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(-745957716);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-745957716, i2, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1134)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    private static final float DropdownMenuContent_Qj0Zi0g$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    static final FiniteAnimationSpec DropdownMenuContent_Qj0Zi0g$lambda$3(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(2839488);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2839488, i2, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1139)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    private static final float DropdownMenuContent_Qj0Zi0g$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DropdownMenuContent_Qj0Zi0g$lambda$6$0(boolean z, MutableTransitionState mutableTransitionState, MutableState mutableState, State state, State state2, GraphicsLayerScope graphicsLayerScope) {
        float fDropdownMenuContent_Qj0Zi0g$lambda$2 = 0.8f;
        float fDropdownMenuContent_Qj0Zi0g$lambda$5 = 1.0f;
        graphicsLayerScope.setScaleX(!z ? DropdownMenuContent_Qj0Zi0g$lambda$2(state) : ((Boolean) mutableTransitionState.getTargetState()).booleanValue() ? 1.0f : 0.8f);
        if (!z) {
            fDropdownMenuContent_Qj0Zi0g$lambda$2 = DropdownMenuContent_Qj0Zi0g$lambda$2(state);
        } else if (((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
            fDropdownMenuContent_Qj0Zi0g$lambda$2 = 1.0f;
        }
        graphicsLayerScope.setScaleY(fDropdownMenuContent_Qj0Zi0g$lambda$2);
        if (!z) {
            fDropdownMenuContent_Qj0Zi0g$lambda$5 = DropdownMenuContent_Qj0Zi0g$lambda$5(state2);
        } else if (!((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
            fDropdownMenuContent_Qj0Zi0g$lambda$5 = 0.0f;
        }
        graphicsLayerScope.setAlpha(fDropdownMenuContent_Qj0Zi0g$lambda$5);
        graphicsLayerScope.mo8413setTransformOrigin__ExYCQ(((TransformOrigin) mutableState.getValue()).m8670unboximpl());
        return ab.f48028a;
    }

    static final ab DropdownMenuContent_Qj0Zi0g$lambda$7(Modifier modifier, ScrollState scrollState, q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1463404422, i2, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:1164)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(IntrinsicKt.width(PaddingKt.m2757paddingVpY3zN4$default(modifier, 0.0f, DropdownMenuVerticalPadding, 1, null), IntrinsicSize.Max), scrollState, false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iM = MenuKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierVerticalScroll$default);
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
            Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            qVar.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab DropdownMenuContent_Qj0Zi0g$lambda$8(Modifier modifier, MutableTransitionState mutableTransitionState, MutableState mutableState, ScrollState scrollState, Shape shape, long j2, float f2, float f3, BorderStroke borderStroke, q qVar, int i2, Composer composer, int i3) {
        m5228DropdownMenuContentQj0Zi0g(modifier, mutableTransitionState, mutableState, scrollState, shape, j2, f2, f3, borderStroke, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /* renamed from: DropdownMenuGroup-BfByrIA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5229DropdownMenuGroupBfByrIA(final androidx.compose.material3.MenuGroupShapes r26, androidx.compose.ui.Modifier r27, long r28, float r30, float r31, androidx.compose.foundation.BorderStroke r32, androidx.compose.foundation.layout.PaddingValues r33, androidx.compose.foundation.interaction.MutableInteractionSource r34, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.m5229DropdownMenuGroupBfByrIA(androidx.compose.material3.MenuGroupShapes, androidx.compose.ui.Modifier, long, float, float, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean DropdownMenuGroup_BfByrIA$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean DropdownMenuGroup_BfByrIA$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void DropdownMenuGroup_BfByrIA$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static final ab DropdownMenuGroup_BfByrIA$lambda$5(Modifier modifier, PaddingValues paddingValues, q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-295285640, i2, -1, "androidx.compose.material3.DropdownMenuGroup.<anonymous> (Menu.kt:328)");
            }
            Modifier modifierPadding = PaddingKt.padding(modifier, paddingValues);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iM = MenuKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
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
            Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            qVar.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab DropdownMenuGroup_BfByrIA$lambda$6(MenuGroupShapes menuGroupShapes, Modifier modifier, long j2, float f2, float f3, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, q qVar, int i2, int i3, Composer composer, int i4) {
        m5229DropdownMenuGroupBfByrIA(menuGroupShapes, modifier, j2, f2, f3, borderStroke, paddingValues, mutableInteractionSource, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /* JADX WARN: Type inference failed for: r4v16, types: [h.g.a.p] */
    /* JADX WARN: Type inference failed for: r57v0, types: [h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab>, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DropdownMenuItem(final boolean r45, final h.g.a.l<? super java.lang.Boolean, h.ab> r46, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r47, final androidx.compose.material3.MenuItemShapes r48, androidx.compose.ui.Modifier r49, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r50, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r51, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r52, boolean r53, androidx.compose.material3.MenuItemColors r54, androidx.compose.foundation.layout.PaddingValues r55, androidx.compose.foundation.interaction.MutableInteractionSource r56, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r57, androidx.compose.runtime.Composer r58, final int r59, final int r60, final int r61) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.DropdownMenuItem(boolean, h.g.a.l, h.g.a.p, androidx.compose.material3.MenuItemShapes, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.p, h.g.a.p, boolean, androidx.compose.material3.MenuItemColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab DropdownMenuItem$lambda$0(a aVar, p pVar, Shape shape, Modifier modifier, p pVar2, p pVar3, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, p pVar4, int i2, int i3, int i4, Composer composer, int i5) {
        DropdownMenuItem(aVar, pVar, shape, modifier, pVar2, pVar3, z, menuItemColors, paddingValues, mutableInteractionSource, pVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DropdownMenuItem$lambda$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m10316getButtono7Vup1c());
        return ab.f48028a;
    }

    static final ab DropdownMenuItem$lambda$2(a aVar, p pVar, Shape shape, Modifier modifier, p pVar2, p pVar3, p pVar4, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        DropdownMenuItem((a<ab>) aVar, (p<? super Composer, ? super Integer, ab>) pVar, shape, modifier, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, (p<? super Composer, ? super Integer, ab>) pVar4, z, menuItemColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab DropdownMenuItem$lambda$3(boolean z, l lVar, p pVar, MenuItemShapes menuItemShapes, Modifier modifier, p pVar2, p pVar3, p pVar4, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        DropdownMenuItem(z, lVar, pVar, menuItemShapes, modifier, pVar2, pVar3, pVar4, z2, menuItemColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DropdownMenuItem$lambda$4$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m10318getCheckboxo7Vup1c());
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DropdownMenuItem$lambda$5$0(l lVar, boolean z) {
        lVar.invoke(Boolean.valueOf(!z));
        return ab.f48028a;
    }

    static final ab DropdownMenuItem$lambda$6(boolean z, l lVar, p pVar, MenuItemShapes menuItemShapes, Modifier modifier, p pVar2, p pVar3, p pVar4, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, p pVar5, int i2, int i3, int i4, Composer composer, int i5) {
        DropdownMenuItem(z, (l<? super Boolean, ab>) lVar, (p<? super Composer, ? super Integer, ab>) pVar, menuItemShapes, modifier, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, (p<? super Composer, ? super Integer, ab>) pVar4, z2, menuItemColors, paddingValues, mutableInteractionSource, (p<? super Composer, ? super Integer, ab>) pVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DropdownMenuItem$lambda$7$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m10321getRadioButtono7Vup1c());
        return ab.f48028a;
    }

    static final ab DropdownMenuItem$lambda$8(boolean z, a aVar, p pVar, MenuItemShapes menuItemShapes, Modifier modifier, p pVar2, p pVar3, p pVar4, boolean z2, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, p pVar5, int i2, int i3, int i4, Composer composer, int i5) {
        DropdownMenuItem(z, (a<ab>) aVar, (p<? super Composer, ? super Integer, ab>) pVar, menuItemShapes, modifier, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, (p<? super Composer, ? super Integer, ab>) pVar4, z2, menuItemColors, paddingValues, mutableInteractionSource, (p<? super Composer, ? super Integer, ab>) pVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    public static final void DropdownMenuItemContent(final boolean z, final a<ab> aVar, final p<? super Composer, ? super Integer, ab> pVar, final Modifier modifier, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final p<? super Composer, ? super Integer, ab> pVar4, final p<? super Composer, ? super Integer, ab> pVar5, final boolean z2, final MenuItemColors menuItemColors, final MenuItemShapes menuItemShapes, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource2;
        int i7 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(931419046);
        if (i7 == 0) {
            i4 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i4;
        if ((i2 & 48) == 0) {
            i5 = i8 | (true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32);
        } else {
            i5 = i8;
        }
        if ((i2 & 384) == 0) {
            z3 = true;
            i5 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        } else {
            z3 = true;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 |= z3 != composerStartRestartGroup.changed(modifier) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(pVar3) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(pVar4) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(pVar5) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i5 |= true != composerStartRestartGroup.changed(z2) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i5 |= true != composerStartRestartGroup.changed(menuItemColors) ? 268435456 : 536870912;
        }
        int i9 = i5;
        if ((i3 & 6) == 0) {
            z4 = true;
            i6 = i3 | (true != composerStartRestartGroup.changed(menuItemShapes) ? 2 : 4);
        } else {
            z4 = true;
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= z4 == composerStartRestartGroup.changed(paddingValues) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= z4 == composerStartRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute(((306783379 & i9) == 306783378 && (i6 & 147) == 146) ? false : true, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(931419046, i9, i6, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:1229)");
            }
            if (mutableInteractionSource == null) {
                composerStartRestartGroup.startReplaceGroup(-1878332427);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
            } else {
                composerStartRestartGroup.startReplaceGroup(1740523298);
                composerStartRestartGroup.endReplaceGroup();
                mutableInteractionSource2 = mutableInteractionSource;
            }
            final FiniteAnimationSpec finiteAnimationSpecValue = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composerStartRestartGroup, 6);
            final FiniteAnimationSpec finiteAnimationSpecValue2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composerStartRestartGroup, 6);
            FiniteAnimationSpec finiteAnimationSpecValue3 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composerStartRestartGroup, 6);
            State<Color> stateM1834animateColorAsStateeuL9pac = SingleValueAnimationKt.m1834animateColorAsStateeuL9pac(menuItemColors.m5209containerColorWaAFU9c$material3(z2, z), MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composerStartRestartGroup, 6), null, null, composerStartRestartGroup, 0, 12);
            Shape shapeShapeByInteraction = shapeByInteraction(menuItemShapes, z, finiteAnimationSpecValue3, composerStartRestartGroup, (i6 & 14) | ((i9 << 3) & 112));
            boolean z5 = (pVar3 == null && pVar4 == null) ? false : true;
            composer2 = composerStartRestartGroup;
            final boolean z6 = pVar5 != null;
            final boolean z7 = z5;
            SurfaceKt.m5670Surfaced85dljk(z, aVar, PaddingKt.padding(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), pVar2 != null ? DropdownMenuSelectableItemWithSupportTexPadding : DropdownMenuSelectableItemPadding), z2, shapeShapeByInteraction, DropdownMenuItemContent$lambda$1(stateM1834animateColorAsStateeuL9pac), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(532192956, true, new p() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return MenuKt.DropdownMenuItemContent$lambda$2(paddingValues, pVar3, pVar4, pVar5, z7, menuItemColors, z2, z, z6, finiteAnimationSpecValue, finiteAnimationSpecValue2, pVar2, pVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer2, 54), composer2, (i9 & 126) | ((i9 >> 15) & 7168), 48, 960);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return MenuKt.DropdownMenuItemContent$lambda$3(z, aVar, pVar, modifier, pVar2, pVar3, pVar4, pVar5, z2, menuItemColors, menuItemShapes, paddingValues, mutableInteractionSource, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long DropdownMenuItemContent$lambda$1(State<Color> state) {
        return state.getValue().m8238unboximpl();
    }

    static final ab DropdownMenuItemContent$lambda$2(final PaddingValues paddingValues, final p pVar, final p pVar2, final p pVar3, final boolean z, final MenuItemColors menuItemColors, final boolean z2, final boolean z3, final boolean z4, final FiniteAnimationSpec finiteAnimationSpec, final FiniteAnimationSpec finiteAnimationSpec2, final p pVar4, final p pVar5, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(532192956, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous> (Menu.kt:1266)");
            }
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer, 6).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(1001050475, true, new p() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda22
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return MenuKt.DropdownMenuItemContent$lambda$2$0(paddingValues, pVar, pVar2, pVar3, z, menuItemColors, z2, z3, z4, finiteAnimationSpec, finiteAnimationSpec2, pVar4, pVar5, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DropdownMenuItemContent$lambda$2$0(PaddingValues paddingValues, p pVar, p pVar2, final p pVar3, boolean z, MenuItemColors menuItemColors, boolean z2, final boolean z3, final boolean z4, final FiniteAnimationSpec finiteAnimationSpec, final FiniteAnimationSpec finiteAnimationSpec2, final p pVar4, final p pVar5, Composer composer, int i2) {
        final p pVar6;
        final p pVar7;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1001050475, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:1267)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.m2826sizeInqDBjuR0$default(Modifier.Companion, DropdownMenuItemDefaultMinWidth, SegmentedMenuTokens.INSTANCE.m7050getItemD9Ej5fM(), DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues);
            DropdownMenuItemMeasurePolicy dropdownMenuItemMeasurePolicy = new DropdownMenuItemMeasurePolicy((pVar == null && pVar2 == null) ? false : true, pVar3 != null);
            int iM = MenuKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
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
            Updater.m7351setimpl(composer, dropdownMenuItemMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            if (z) {
                composer.startReplaceGroup(1630732834);
                pVar6 = pVar;
                pVar7 = pVar2;
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(menuItemColors.m5224leadingIconColorWaAFU9c$material3(z2, z3))), ComposableLambdaKt.rememberComposableLambda(1729823385, true, new p() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda5
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return MenuKt.DropdownMenuItemContent$lambda$2$0$0$0(pVar7, pVar6, z3, finiteAnimationSpec, finiteAnimationSpec2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                composer.endReplaceGroup();
            } else {
                pVar6 = pVar;
                pVar7 = pVar2;
                composer.startReplaceGroup(1633081518);
                composer.endReplaceGroup();
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(menuItemColors.m5225textColorWaAFU9c$material3(z2, z3))), ComposableLambdaKt.rememberComposableLambda(-237456556, true, new p() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda6
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return MenuKt.DropdownMenuItemContent$lambda$2$0$0$1(z4, pVar4, pVar5, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            if (z4) {
                composer.startReplaceGroup(1634391609);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(menuItemColors.m5226trailingIconColorWaAFU9c$material3(z2, z3))), ComposableLambdaKt.rememberComposableLambda(-1717686974, true, new p() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda7
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return MenuKt.DropdownMenuItemContent$lambda$2$0$0$2(pVar3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1635057582);
                composer.endReplaceGroup();
            }
            if (z) {
                composer.startReplaceGroup(1635182109);
                Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, GhostLeadingIconLayoutId);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM2 = MenuKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierLayoutId);
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
                WrappedLeadingIcon(ComposableLambdaKt.rememberComposableLambda(15262301, true, new q() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda8
                    @Override // h.g.a.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return MenuKt.DropdownMenuItemContent$lambda$2$0$0$3$0(pVar6, pVar7, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54), composer, 6);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1635628974);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DropdownMenuItemContent$lambda$2$0$0$0(final p pVar, final p pVar2, boolean z, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1729823385, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1280)");
            }
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, LeadingIconLayoutId);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iM = MenuKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierLayoutId);
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
            if (pVar != null) {
                composer.startReplaceGroup(-1776520232);
                if (pVar2 == null) {
                    composer.startReplaceGroup(-1776468989);
                    AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.expandHorizontally$default(finiteAnimationSpec, null, false, null, 14, null).plus(EnterExitTransitionKt.fadeIn$default(finiteAnimationSpec2, 0.0f, 2, null)), EnterExitTransitionKt.shrinkHorizontally$default(finiteAnimationSpec, null, false, null, 14, null).plus(EnterExitTransitionKt.fadeOut$default(finiteAnimationSpec2, 0.0f, 2, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-371859771, true, new q() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda14
                        @Override // h.g.a.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return MenuKt.DropdownMenuItemContent$lambda$2$0$0$0$0$0(pVar, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, composer, 54), composer, 196608, 18);
                    composer.endReplaceGroup();
                } else if (z) {
                    composer.startReplaceGroup(-1775080685);
                    WrappedLeadingIcon(ComposableLambdaKt.rememberComposableLambda(-858426922, true, new q() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda15
                        @Override // h.g.a.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return MenuKt.DropdownMenuItemContent$lambda$2$0$0$0$0$1(pVar, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, composer, 54), composer, 6);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1774951973);
                    WrappedLeadingIcon(ComposableLambdaKt.rememberComposableLambda(-1181060170, true, new q() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda16
                        @Override // h.g.a.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return MenuKt.DropdownMenuItemContent$lambda$2$0$0$0$0$2(pVar2, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, composer, 54), composer, 6);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1774797190);
                WrappedLeadingIcon(ComposableLambdaKt.rememberComposableLambda(-358394575, true, new q() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda17
                    @Override // h.g.a.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return MenuKt.DropdownMenuItemContent$lambda$2$0$0$0$0$3(pVar2, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54), composer, 6);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DropdownMenuItemContent$lambda$2$0$0$0$0$0(final p pVar, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-371859771, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1303)");
        }
        WrappedLeadingIcon(ComposableLambdaKt.rememberComposableLambda(-337993913, true, new q() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda27
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MenuKt.DropdownMenuItemContent$lambda$2$0$0$0$0$0$0(pVar, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }, composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DropdownMenuItemContent$lambda$2$0$0$0$0$0$0(p pVar, BoxScope boxScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-337993913, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1303)");
            }
            pVar.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DropdownMenuItemContent$lambda$2$0$0$0$0$1(p pVar, BoxScope boxScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-858426922, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1306)");
            }
            pVar.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DropdownMenuItemContent$lambda$2$0$0$0$0$2(p pVar, BoxScope boxScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1181060170, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1308)");
            }
            pVar.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DropdownMenuItemContent$lambda$2$0$0$0$0$3(p pVar, BoxScope boxScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-358394575, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1311)");
            }
            x.c(pVar);
            pVar.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DropdownMenuItemContent$lambda$2$0$0$1(boolean z, p pVar, p pVar2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-237456556, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1320)");
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(LayoutIdKt.layoutId(Modifier.Companion, "text"), 0.0f, 0.0f, z ? MenuDefaults.INSTANCE.m5193getDropdownMenuIconTextPaddingD9Ej5fM$material3() : 0.0f, 0.0f, 11, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenterStart(), false);
            int iM = MenuKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
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
            if (pVar != null) {
                composer.startReplaceGroup(705233169);
                LabelWithSupportingText(pVar, LayoutIdKt.layoutId(Modifier.Companion, "text"), pVar2, composer, 48);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(705551694);
                pVar2.invoke(composer, 0);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DropdownMenuItemContent$lambda$2$0$0$2(p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1717686974, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1348)");
            }
            Modifier modifierM2807defaultMinSizeVpY3zN4$default = SizeKt.m2807defaultMinSizeVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TrailingIconLayoutId), SegmentedMenuTokens.INSTANCE.m7056getItemTrailingIconSizeD9Ej5fM(), 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iM = MenuKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM2807defaultMinSizeVpY3zN4$default);
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
    public static final ab DropdownMenuItemContent$lambda$2$0$0$3$0(p pVar, p pVar2, BoxScope boxScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(15262301, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1364)");
            }
            if (pVar != null) {
                composer.startReplaceGroup(-587263120);
                pVar.invoke(composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-587172321);
                x.c(pVar2);
                pVar2.invoke(composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab DropdownMenuItemContent$lambda$3(boolean z, a aVar, p pVar, Modifier modifier, p pVar2, p pVar3, p pVar4, p pVar5, boolean z2, MenuItemColors menuItemColors, MenuItemShapes menuItemShapes, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        DropdownMenuItemContent(z, aVar, pVar, modifier, pVar2, pVar3, pVar4, pVar5, z2, menuItemColors, menuItemShapes, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DropdownMenuItemContent$lambda$4$0(final p pVar, MenuItemColors menuItemColors, boolean z, final p pVar2, final RowScope rowScope, final p pVar3, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(865999929, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:1428)");
            }
            if (pVar != null) {
                composer.startReplaceGroup(-864613344);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(menuItemColors.m5224leadingIconColorWaAFU9c$material3(z, false & ((2 & 2) == 0)))), ComposableLambdaKt.rememberComposableLambda(1241781204, true, new p() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda39
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return MenuKt.DropdownMenuItemContent$lambda$4$0$0(pVar, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-864297175);
                composer.endReplaceGroup();
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(menuItemColors.m5225textColorWaAFU9c$material3(z, false & ((2 & 2) == 0)))), ComposableLambdaKt.rememberComposableLambda(-893579015, true, new p() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda40
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return MenuKt.DropdownMenuItemContent$lambda$4$0$1(rowScope, pVar, pVar2, pVar3, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            if (pVar2 != null) {
                composer.startReplaceGroup(-863399043);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(menuItemColors.m5226trailingIconColorWaAFU9c$material3(z, false & ((2 & 2) == 0)))), ComposableLambdaKt.rememberComposableLambda(-782441013, true, new p() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda41
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return MenuKt.DropdownMenuItemContent$lambda$4$0$2(pVar2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-863079991);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DropdownMenuItemContent$lambda$4$0$0(p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1241781204, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1432)");
            }
            Modifier modifierM2807defaultMinSizeVpY3zN4$default = SizeKt.m2807defaultMinSizeVpY3zN4$default(Modifier.Companion, ListTokens.INSTANCE.m6826getItemLeadingIconSizeD9Ej5fM(), 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = MenuKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM2807defaultMinSizeVpY3zN4$default);
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
    public static final ab DropdownMenuItemContent$lambda$4$0$1(RowScope rowScope, p pVar, p pVar2, p pVar3, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-893579015, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1438)");
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(RowScope.CC.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, null), pVar != null ? DropdownMenuItemHorizontalPadding : 0.0f, 0.0f, pVar2 != null ? DropdownMenuItemHorizontalPadding : 0.0f, 0.0f, 10, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = MenuKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
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
            pVar3.invoke(composer, 0);
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
    public static final ab DropdownMenuItemContent$lambda$4$0$2(p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782441013, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:1462)");
            }
            Modifier modifierM2807defaultMinSizeVpY3zN4$default = SizeKt.m2807defaultMinSizeVpY3zN4$default(Modifier.Companion, ListTokens.INSTANCE.m6837getItemTrailingIconSizeD9Ej5fM(), 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = MenuKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM2807defaultMinSizeVpY3zN4$default);
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

    static final ab DropdownMenuItemContent$lambda$5(p pVar, a aVar, Modifier modifier, p pVar2, p pVar3, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i2, Composer composer, int i3) {
        DropdownMenuItemContent(pVar, aVar, modifier, pVar2, pVar3, z, menuItemColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* renamed from: DropdownMenuPopup-x0xb5LI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5230DropdownMenuPopupx0xb5LI(final boolean r19, final h.g.a.a<h.ab> r20, androidx.compose.ui.Modifier r21, androidx.compose.material3.DropdownMenuPopupPositionProvider r22, long r23, androidx.compose.ui.window.PopupProperties r25, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.m5230DropdownMenuPopupx0xb5LI(boolean, h.g.a.a, androidx.compose.ui.Modifier, androidx.compose.material3.DropdownMenuPopupPositionProvider, long, androidx.compose.ui.window.PopupProperties, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void DropdownMenuPopupContent(final Modifier modifier, final MutableTransitionState<Boolean> mutableTransitionState, final MutableState<TransformOrigin> mutableState, final q<? super ColumnScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i2) {
        int i3;
        Object currentState;
        char c2;
        Object currentState2;
        int i4;
        int i5;
        int i6 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1233250303);
        if (i6 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(mutableTransitionState) : composerStartRestartGroup.changedInstance(mutableTransitionState)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(mutableState) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(qVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1233250303, i3, -1, "androidx.compose.material3.DropdownMenuPopupContent (Menu.kt:1181)");
            }
            final Transition transitionUpdateTransition = TransitionKt.updateTransition((MutableTransitionState) mutableTransitionState, "DropDownMenu", composerStartRestartGroup, MutableTransitionState.$stable | 48 | ((i3 >> 3) & 14), 0);
            final FiniteAnimationSpec finiteAnimationSpecValue = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composerStartRestartGroup, 6);
            final FiniteAnimationSpec finiteAnimationSpecValue2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composerStartRestartGroup, 6);
            q qVar2 = new q() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda18
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec finiteAnimationSpec = finiteAnimationSpecValue;
                    MenuKt.DropdownMenuPopupContent$lambda$0(finiteAnimationSpec, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return finiteAnimationSpec;
                }
            };
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(h.g.b.q.f48127a);
            if (transitionUpdateTransition.isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState = composerStartRestartGroup.rememberedValue();
                if (zChanged || currentState == Composer.Companion.getEmpty()) {
                    Snapshot.Companion companion = Snapshot.Companion;
                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState3 = transitionUpdateTransition.getCurrentState();
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        composerStartRestartGroup.updateRememberedValue(currentState3);
                        currentState = currentState3;
                    } catch (Throwable th) {
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            boolean zBooleanValue = ((Boolean) currentState).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-917941477);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-917941477, 0, -1, "androidx.compose.material3.DropdownMenuPopupContent.<anonymous> (Menu.kt:1189)");
            }
            float f2 = true != zBooleanValue ? 0.8f : 1.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf = Float.valueOf(f2);
            boolean zChanged2 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new a<Boolean>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuPopupContent$$inlined$animateFloat$1
                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // h.g.a.a
                    public final Boolean invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            boolean zBooleanValue2 = ((Boolean) ((State) objRememberedValue).getValue()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-917941477);
            if (ComposerKt.isTraceInProgress()) {
                c2 = 65535;
                ComposerKt.traceEventStart(-917941477, 0, -1, "androidx.compose.material3.DropdownMenuPopupContent.<anonymous> (Menu.kt:1189)");
            } else {
                c2 = 65535;
            }
            float f3 = true != zBooleanValue2 ? 0.8f : 1.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf2 = Float.valueOf(f3);
            boolean zChanged3 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new a<Transition.Segment<Boolean>>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuPopupContent$$inlined$animateFloat$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // h.g.a.a
                    public final Transition.Segment<Boolean> invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, fValueOf2, (FiniteAnimationSpec) qVar2.invoke(((State) objRememberedValue2).getValue(), composerStartRestartGroup, 0), vectorConverter, "FloatAnimation", composerStartRestartGroup, 0);
            q qVar3 = new q() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda19
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    FiniteAnimationSpec finiteAnimationSpec = finiteAnimationSpecValue2;
                    MenuKt.DropdownMenuPopupContent$lambda$3(finiteAnimationSpec, (Transition.Segment) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return finiteAnimationSpec;
                }
            };
            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(h.g.b.q.f48127a);
            if (transitionUpdateTransition.isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(1666827533);
                composerStartRestartGroup.endReplaceGroup();
                currentState2 = transitionUpdateTransition.getCurrentState();
            } else {
                composerStartRestartGroup.startReplaceGroup(1666573488);
                boolean zChanged4 = composerStartRestartGroup.changed(transitionUpdateTransition);
                currentState2 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || currentState2 == Composer.Companion.getEmpty()) {
                    Snapshot.Companion companion2 = Snapshot.Companion;
                    Snapshot currentThreadSnapshot2 = companion2.getCurrentThreadSnapshot();
                    l<Object, ab> readObserver2 = currentThreadSnapshot2 != null ? currentThreadSnapshot2.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable2 = companion2.makeCurrentNonObservable(currentThreadSnapshot2);
                    try {
                        Object currentState4 = transitionUpdateTransition.getCurrentState();
                        companion2.restoreNonObservable(currentThreadSnapshot2, snapshotMakeCurrentNonObservable2, readObserver2);
                        composerStartRestartGroup.updateRememberedValue(currentState4);
                        currentState2 = currentState4;
                    } catch (Throwable th2) {
                        companion2.restoreNonObservable(currentThreadSnapshot2, snapshotMakeCurrentNonObservable2, readObserver2);
                        throw th2;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            boolean zBooleanValue3 = ((Boolean) currentState2).booleanValue();
            composerStartRestartGroup.startReplaceGroup(1892204335);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1892204335, 0, -1, "androidx.compose.material3.DropdownMenuPopupContent.<anonymous> (Menu.kt:1193)");
            }
            float f4 = true != zBooleanValue3 ? 0.0f : 1.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf3 = Float.valueOf(f4);
            boolean zChanged5 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new a<Boolean>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuPopupContent$$inlined$animateFloat$3
                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // h.g.a.a
                    public final Boolean invoke() {
                        return transitionUpdateTransition.getTargetState();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            boolean zBooleanValue4 = ((Boolean) ((State) objRememberedValue3).getValue()).booleanValue();
            composerStartRestartGroup.startReplaceGroup(1892204335);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1892204335, 0, -1, "androidx.compose.material3.DropdownMenuPopupContent.<anonymous> (Menu.kt:1193)");
            }
            float f5 = true != zBooleanValue4 ? 0.0f : 1.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceGroup();
            Float fValueOf4 = Float.valueOf(f5);
            boolean zChanged6 = composerStartRestartGroup.changed(transitionUpdateTransition);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged6 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.derivedStateOf(new a<Transition.Segment<Boolean>>() { // from class: androidx.compose.material3.MenuKt$DropdownMenuPopupContent$$inlined$animateFloat$4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // h.g.a.a
                    public final Transition.Segment<Boolean> invoke() {
                        return transitionUpdateTransition.getSegment();
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf3, fValueOf4, (FiniteAnimationSpec) qVar3.invoke(((State) objRememberedValue4).getValue(), composerStartRestartGroup, 0), vectorConverter2, "FloatAnimation", composerStartRestartGroup, 0);
            final boolean zBooleanValue5 = ((Boolean) composerStartRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            Modifier modifierWidth = IntrinsicKt.width(modifier, IntrinsicSize.Max);
            boolean zChanged7 = composerStartRestartGroup.changed(zBooleanValue5) | composerStartRestartGroup.changed(stateCreateTransitionAnimation) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(mutableTransitionState))) | composerStartRestartGroup.changed(stateCreateTransitionAnimation2);
            boolean z = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if ((z || zChanged7) || objRememberedValue5 == Composer.Companion.getEmpty()) {
                i4 = i3;
                i5 = 0;
                l lVar = new l() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda20
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return MenuKt.DropdownMenuPopupContent$lambda$6$0(zBooleanValue5, mutableTransitionState, mutableState, stateCreateTransitionAnimation, stateCreateTransitionAnimation2, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(lVar);
                objRememberedValue5 = lVar;
            } else {
                i4 = i3;
                i5 = 0;
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierWidth, (l) objRememberedValue5);
            int i7 = i4 & 7168;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, i5);
            int iM = MenuKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i5));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            qVar.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i7 >> 6) & 112) | 6));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda21
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return MenuKt.DropdownMenuPopupContent$lambda$7(modifier, mutableTransitionState, mutableState, qVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final FiniteAnimationSpec DropdownMenuPopupContent$lambda$0(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(-1055797898);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1055797898, i2, -1, "androidx.compose.material3.DropdownMenuPopupContent.<anonymous> (Menu.kt:1188)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    private static final float DropdownMenuPopupContent$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    static final FiniteAnimationSpec DropdownMenuPopupContent$lambda$3(FiniteAnimationSpec finiteAnimationSpec, Transition.Segment segment, Composer composer, int i2) {
        composer.startReplaceGroup(1754347914);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1754347914, i2, -1, "androidx.compose.material3.DropdownMenuPopupContent.<anonymous> (Menu.kt:1192)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return finiteAnimationSpec;
    }

    private static final float DropdownMenuPopupContent$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DropdownMenuPopupContent$lambda$6$0(boolean z, MutableTransitionState mutableTransitionState, MutableState mutableState, State state, State state2, GraphicsLayerScope graphicsLayerScope) {
        float fDropdownMenuPopupContent$lambda$2 = 0.8f;
        float fDropdownMenuPopupContent$lambda$5 = 1.0f;
        graphicsLayerScope.setScaleX(!z ? DropdownMenuPopupContent$lambda$2(state) : ((Boolean) mutableTransitionState.getTargetState()).booleanValue() ? 1.0f : 0.8f);
        if (!z) {
            fDropdownMenuPopupContent$lambda$2 = DropdownMenuPopupContent$lambda$2(state);
        } else if (((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
            fDropdownMenuPopupContent$lambda$2 = 1.0f;
        }
        graphicsLayerScope.setScaleY(fDropdownMenuPopupContent$lambda$2);
        if (!z) {
            fDropdownMenuPopupContent$lambda$5 = DropdownMenuPopupContent$lambda$5(state2);
        } else if (!((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
            fDropdownMenuPopupContent$lambda$5 = 0.0f;
        }
        graphicsLayerScope.setAlpha(fDropdownMenuPopupContent$lambda$5);
        graphicsLayerScope.mo8413setTransformOrigin__ExYCQ(((TransformOrigin) mutableState.getValue()).m8670unboximpl());
        return ab.f48028a;
    }

    static final ab DropdownMenuPopupContent$lambda$7(Modifier modifier, MutableTransitionState mutableTransitionState, MutableState mutableState, q qVar, int i2, Composer composer, int i3) {
        DropdownMenuPopupContent(modifier, mutableTransitionState, mutableState, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab DropdownMenuPopup_x0xb5LI$lambda$1(Modifier modifier, MutableTransitionState mutableTransitionState, DropdownMenuPopupPositionProvider dropdownMenuPopupPositionProvider, q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(851756468, i2, -1, "androidx.compose.material3.DropdownMenuPopup.<anonymous> (Menu.kt:251)");
            }
            DropdownMenuPopupContent(modifier, mutableTransitionState, dropdownMenuPopupPositionProvider.getTransformOriginState(), qVar, composer, MutableTransitionState.$stable << 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab DropdownMenuPopup_x0xb5LI$lambda$2(boolean z, a aVar, Modifier modifier, DropdownMenuPopupPositionProvider dropdownMenuPopupPositionProvider, long j2, PopupProperties popupProperties, q qVar, int i2, int i3, Composer composer, int i4) {
        m5230DropdownMenuPopupx0xb5LI(z, aVar, modifier, dropdownMenuPopupPositionProvider, j2, popupProperties, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final void LabelWithSupportingText(final p<? super Composer, ? super Integer, ab> pVar, final Modifier modifier, final p<? super Composer, ? super Integer, ab> pVar2, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(888023637);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(888023637, i3, -1, "androidx.compose.material3.LabelWithSupportingText (Menu.kt:1511)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iM = MenuKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelLarge(), pVar2, composerStartRestartGroup, (i3 >> 3) & 112);
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyMedium(), pVar, composerStartRestartGroup, (i3 << 3) & 112);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda13
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return MenuKt.LabelWithSupportingText$lambda$1(pVar, modifier, pVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab LabelWithSupportingText$lambda$1(p pVar, Modifier modifier, p pVar2, int i2, Composer composer, int i3) {
        LabelWithSupportingText(pVar, modifier, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final void WrappedLeadingIcon(final q<? super BoxScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1482876964);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(qVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1482876964, i3, -1, "androidx.compose.material3.WrappedLeadingIcon (Menu.kt:1571)");
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(SizeKt.m2807defaultMinSizeVpY3zN4$default(Modifier.Companion, SegmentedMenuTokens.INSTANCE.m7053getItemLeadingIconSizeD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, MenuDefaults.INSTANCE.m5193getDropdownMenuIconTextPaddingD9Ej5fM$material3(), 0.0f, 11, null);
            int i5 = i3 << 9;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = MenuKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
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
            qVar.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf((((i5 & 7168) >> 6) & 112) | 6));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda9
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return MenuKt.WrappedLeadingIcon$lambda$0(qVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab WrappedLeadingIcon$lambda$0(q qVar, int i2, Composer composer, int i3) {
        WrappedLeadingIcon(qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long calculateTransformOrigin(androidx.compose.ui.unit.IntRect r5, androidx.compose.ui.unit.IntRect r6) {
        /*
            int r0 = r6.getLeft()
            int r1 = r5.getRight()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto Lf
        Ld:
            r0 = r3
            goto L49
        Lf:
            int r0 = r6.getRight()
            int r1 = r5.getLeft()
            if (r0 > r1) goto L1b
            r0 = r2
            goto L49
        L1b:
            int r0 = r6.getWidth()
            if (r0 != 0) goto L22
            goto Ld
        L22:
            int r0 = r5.getLeft()
            int r1 = r6.getLeft()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.getRight()
            int r4 = r6.getRight()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.getLeft()
            int r0 = r0 - r1
            int r1 = r6.getWidth()
            float r1 = (float) r1
            float r0 = (float) r0
            float r0 = r0 / r1
        L49:
            int r1 = r6.getTop()
            int r4 = r5.getBottom()
            if (r1 < r4) goto L55
        L53:
            r2 = r3
            goto L8f
        L55:
            int r1 = r6.getBottom()
            int r4 = r5.getTop()
            if (r1 > r4) goto L60
            goto L8f
        L60:
            int r1 = r6.getHeight()
            if (r1 != 0) goto L67
            goto L53
        L67:
            int r1 = r5.getTop()
            int r2 = r6.getTop()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.getBottom()
            int r2 = r6.getBottom()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.getTop()
            int r1 = r1 - r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r6 = (float) r1
            float r2 = r6 / r5
        L8f:
            long r5 = androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.calculateTransformOrigin(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }

    public static final float getDropdownMenuGroupDefaultMinHeight() {
        return DropdownMenuGroupDefaultMinHeight;
    }

    public static final float getDropdownMenuGroupVerticalPadding() {
        return DropdownMenuGroupVerticalPadding;
    }

    public static final float getDropdownMenuItemDefaultMaxWidth() {
        return DropdownMenuItemDefaultMaxWidth;
    }

    public static final float getDropdownMenuItemDefaultMinWidth() {
        return DropdownMenuItemDefaultMinWidth;
    }

    public static final float getDropdownMenuItemHorizontalPadding() {
        return DropdownMenuItemHorizontalPadding;
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    public static final boolean getHasCornerBasedShapes(MenuGroupShapes menuGroupShapes) {
        return (menuGroupShapes.getShape() instanceof CornerBasedShape) && (menuGroupShapes.getInactiveShape() instanceof CornerBasedShape);
    }

    public static final boolean getHasRoundedCornerShapes(MenuGroupShapes menuGroupShapes) {
        return (menuGroupShapes.getShape() instanceof RoundedCornerShape) && (menuGroupShapes.getInactiveShape() instanceof RoundedCornerShape);
    }

    public static final float getMenuHorizontalMargin() {
        return MenuHorizontalMargin;
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }

    private static final Shape shapeByInteraction(MenuGroupShapes menuGroupShapes, boolean z, boolean z2, FiniteAnimationSpec<Float> finiteAnimationSpec, Composer composer, int i2) {
        composer.startReplaceGroup(1230868161);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1230868161, i2, -1, "androidx.compose.material3.shapeByInteraction (Menu.kt:1550)");
        }
        Shape shape = (!z || z2) ? menuGroupShapes.getShape() : menuGroupShapes.getInactiveShape();
        if (getHasRoundedCornerShapes(menuGroupShapes)) {
            composer.startReplaceGroup(-1637034503);
            composer.startMovableGroup(1748307970, composer.joinKey(menuGroupShapes.getShape(), menuGroupShapes.getInactiveShape()));
            x.d(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.RoundedCornerShape");
            shape = AnimatedShapeKt.rememberAnimatedShape((RoundedCornerShape) shape, finiteAnimationSpec, composer, (i2 >> 6) & 112);
            composer.endMovableGroup();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else if (getHasCornerBasedShapes(menuGroupShapes)) {
            composer.startReplaceGroup(-1636849061);
            composer.startMovableGroup(1748313952, composer.joinKey(menuGroupShapes.getShape(), menuGroupShapes.getInactiveShape()));
            x.d(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            shape = AnimatedShapeKt.rememberAnimatedShape((CornerBasedShape) shape, finiteAnimationSpec, composer, (i2 >> 6) & 112);
            composer.endMovableGroup();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.startReplaceGroup(-1636720287);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        composer.endReplaceGroup();
        return shape;
    }

    public static final boolean getHasCornerBasedShapes(MenuItemShapes menuItemShapes) {
        return (menuItemShapes.getShape() instanceof CornerBasedShape) && (menuItemShapes.getSelectedShape() instanceof CornerBasedShape);
    }

    public static final boolean getHasRoundedCornerShapes(MenuItemShapes menuItemShapes) {
        return (menuItemShapes.getShape() instanceof RoundedCornerShape) && (menuItemShapes.getSelectedShape() instanceof RoundedCornerShape);
    }

    private static final Shape shapeByInteraction(MenuItemShapes menuItemShapes, boolean z, FiniteAnimationSpec<Float> finiteAnimationSpec, Composer composer, int i2) {
        Shape shape;
        composer.startReplaceGroup(1804150103);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1804150103, i2, -1, "androidx.compose.material3.shapeByInteraction (Menu.kt:1524)");
        }
        if (z) {
            shape = menuItemShapes.getSelectedShape();
        } else {
            shape = menuItemShapes.getShape();
        }
        if (getHasRoundedCornerShapes(menuItemShapes)) {
            composer.startReplaceGroup(215284099);
            composer.startMovableGroup(-1378528456, composer.joinKey(menuItemShapes.getShape(), menuItemShapes.getSelectedShape()));
            x.d(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.RoundedCornerShape");
            shape = AnimatedShapeKt.rememberAnimatedShape((RoundedCornerShape) shape, finiteAnimationSpec, composer, (i2 >> 3) & 112);
            composer.endMovableGroup();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else if (getHasCornerBasedShapes(menuItemShapes)) {
            composer.startReplaceGroup(215469541);
            composer.startMovableGroup(-1378522474, composer.joinKey(menuItemShapes.getShape(), menuItemShapes.getSelectedShape()));
            x.d(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            shape = AnimatedShapeKt.rememberAnimatedShape((CornerBasedShape) shape, finiteAnimationSpec, composer, (i2 >> 3) & 112);
            composer.endMovableGroup();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.startReplaceGroup(215598315);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        composer.endReplaceGroup();
        return shape;
    }

    public static final void DropdownMenuItemContent(final p<? super Composer, ? super Integer, ab> pVar, final a<ab> aVar, final Modifier modifier, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final boolean z, final MenuItemColors menuItemColors, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i2) {
        p<? super Composer, ? super Integer, ab> pVar4;
        int i3;
        a<ab> aVar2;
        p<? super Composer, ? super Integer, ab> pVar5;
        p<? super Composer, ? super Integer, ab> pVar6;
        MenuItemColors menuItemColors2;
        MutableInteractionSource mutableInteractionSource2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1325192924);
        if (i4 == 0) {
            pVar4 = pVar;
            i3 = (true != composerStartRestartGroup.changedInstance(pVar4) ? 2 : 4) | i2;
        } else {
            pVar4 = pVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            aVar2 = aVar;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 16 : 32;
        } else {
            aVar2 = aVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            pVar5 = pVar2;
            i3 |= true != composerStartRestartGroup.changedInstance(pVar5) ? 1024 : 2048;
        } else {
            pVar5 = pVar2;
        }
        if ((i2 & 24576) == 0) {
            pVar6 = pVar3;
            i3 |= true != composerStartRestartGroup.changedInstance(pVar6) ? 8192 : 16384;
        } else {
            pVar6 = pVar3;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            menuItemColors2 = menuItemColors;
            i3 |= true != composerStartRestartGroup.changed(menuItemColors2) ? 524288 : 1048576;
        } else {
            menuItemColors2 = menuItemColors;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(paddingValues) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            mutableInteractionSource2 = mutableInteractionSource;
            i3 |= true != composerStartRestartGroup.changed(mutableInteractionSource2) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1325192924, i3, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:1406)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.m2826sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m2003clickableO2vRcR0$default(modifier, mutableInteractionSource2, RippleKt.m5414rippleOu1YvPQ$default(true, 0.0f, 0L, null, false, false, false, false, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_2, null), z, null, null, aVar2, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, MenuListItemContainerHeight, DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), paddingValues);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
            int iM = MenuKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            final p<? super Composer, ? super Integer, ab> pVar7 = pVar4;
            final p<? super Composer, ? super Integer, ab> pVar8 = pVar5;
            final p<? super Composer, ? super Integer, ab> pVar9 = pVar6;
            final MenuItemColors menuItemColors3 = menuItemColors2;
            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelLarge(), ComposableLambdaKt.rememberComposableLambda(865999929, true, new p() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda25
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return MenuKt.DropdownMenuItemContent$lambda$4$0(pVar8, menuItemColors3, z, pVar9, rowScopeInstance, pVar7, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda26
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return MenuKt.DropdownMenuItemContent$lambda$5(pVar, aVar, modifier, pVar2, pVar3, z, menuItemColors, paddingValues, mutableInteractionSource, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void DropdownMenuItem(final h.g.a.a r30, final h.g.a.p r31, final androidx.compose.ui.graphics.Shape r32, androidx.compose.ui.Modifier r33, h.g.a.p r34, h.g.a.p r35, boolean r36, androidx.compose.material3.MenuItemColors r37, androidx.compose.foundation.layout.PaddingValues r38, androidx.compose.foundation.interaction.MutableInteractionSource r39, h.g.a.p r40, androidx.compose.runtime.Composer r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.DropdownMenuItem(h.g.a.a, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.p, boolean, androidx.compose.material3.MenuItemColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DropdownMenuItem(final boolean r48, final h.g.a.a<h.ab> r49, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r50, final androidx.compose.material3.MenuItemShapes r51, androidx.compose.ui.Modifier r52, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r53, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r54, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r55, boolean r56, androidx.compose.material3.MenuItemColors r57, androidx.compose.foundation.layout.PaddingValues r58, androidx.compose.foundation.interaction.MutableInteractionSource r59, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r60, androidx.compose.runtime.Composer r61, final int r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.DropdownMenuItem(boolean, h.g.a.a, h.g.a.p, androidx.compose.material3.MenuItemShapes, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.p, h.g.a.p, boolean, androidx.compose.material3.MenuItemColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void DropdownMenuItem(final boolean r46, final h.g.a.l r47, final h.g.a.p r48, final androidx.compose.material3.MenuItemShapes r49, androidx.compose.ui.Modifier r50, h.g.a.p r51, h.g.a.p r52, h.g.a.p r53, boolean r54, androidx.compose.material3.MenuItemColors r55, androidx.compose.foundation.layout.PaddingValues r56, androidx.compose.foundation.interaction.MutableInteractionSource r57, androidx.compose.runtime.Composer r58, final int r59, final int r60, final int r61) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.DropdownMenuItem(boolean, h.g.a.l, h.g.a.p, androidx.compose.material3.MenuItemShapes, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.p, h.g.a.p, boolean, androidx.compose.material3.MenuItemColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DropdownMenuItem(final h.g.a.a<h.ab> r32, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r33, final androidx.compose.ui.graphics.Shape r34, androidx.compose.ui.Modifier r35, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r36, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r37, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r38, boolean r39, androidx.compose.material3.MenuItemColors r40, androidx.compose.foundation.layout.PaddingValues r41, androidx.compose.foundation.interaction.MutableInteractionSource r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MenuKt.DropdownMenuItem(h.g.a.a, h.g.a.p, androidx.compose.ui.graphics.Shape, androidx.compose.ui.Modifier, h.g.a.p, h.g.a.p, h.g.a.p, boolean, androidx.compose.material3.MenuItemColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
