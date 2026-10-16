package androidx.compose.animation;

import androidx.compose.animation.core.DeferredTransition;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt {
    public static final <T> void AnimatedEnterExitImpl(Transition<T> transition, l<? super T, Boolean> lVar, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, p<? super EnterExitState, ? super EnterExitState, Boolean> pVar, OnLookaheadMeasured onLookaheadMeasured, MutableTransform mutableTransform, q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, int i2, int i3) {
        int i4;
        MutableTransform mutableTransform2;
        OnLookaheadMeasured onLookaheadMeasured2;
        MutableTransform mutableTransform3;
        MutableTransform mutableTransform4;
        Modifier.Companion companionLayout;
        EnterExitState enterExitStateTargetEnterExit;
        q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, ab> qVar2 = qVar;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1310802509);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(transition) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(enterTransition) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changed(exitTransition) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 65536 : 131072;
        }
        int i6 = i3 & 64;
        if (i6 != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i4 |= true != ((i2 & 2097152) == 0 ? composerStartRestartGroup.changed(onLookaheadMeasured) : composerStartRestartGroup.changedInstance(onLookaheadMeasured)) ? 524288 : 1048576;
        }
        int i7 = i3 & 128;
        if (i7 != 0) {
            i4 |= 12582912;
            mutableTransform2 = mutableTransform;
        } else {
            mutableTransform2 = mutableTransform;
            if ((i2 & 12582912) == 0) {
                i4 |= true != composerStartRestartGroup.changedInstance(mutableTransform2) ? 4194304 : 8388608;
            }
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(qVar2) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        int i8 = i4;
        if (composerStartRestartGroup.shouldExecute((38347923 & i8) != 38347922, i8 & 1)) {
            OnLookaheadMeasured onLookaheadMeasured3 = i6 != 0 ? null : onLookaheadMeasured;
            MutableTransform mutableTransform5 = i7 != 0 ? null : mutableTransform2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1310802509, i8, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:799)");
            }
            T pendingTargetState = transition.getPendingTargetState();
            if (lVar.invoke(transition.getTargetState()).booleanValue() || lVar.invoke(transition.getCurrentState()).booleanValue() || ((pendingTargetState != null && lVar.invoke(pendingTargetState).booleanValue()) || transition.isSeeking() || transition.getHasInitialValueAnimations())) {
                composerStartRestartGroup.startReplaceGroup(-274042349);
                int i9 = i8 & 14;
                int i10 = i9 | 48;
                int i11 = i10 & 14;
                boolean z = ((i11 ^ 6) > 4 && composerStartRestartGroup.changed(transition)) || (i10 & 6) == 4;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = transition.getCurrentState();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                if (transition.isSeeking()) {
                    objRememberedValue = transition.getCurrentState();
                }
                composerStartRestartGroup.startReplaceGroup(-1270450094);
                OnLookaheadMeasured onLookaheadMeasured4 = onLookaheadMeasured3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1270450094, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:810)");
                }
                int i12 = i8 & 126;
                EnterExitState enterExitStateTargetEnterExit2 = targetEnterExit(transition, lVar, objRememberedValue, composerStartRestartGroup, i12);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
                T targetState = transition.getTargetState();
                composerStartRestartGroup.startReplaceGroup(-1270450094);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1270450094, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:810)");
                }
                EnterExitState enterExitStateTargetEnterExit3 = targetEnterExit(transition, lVar, targetState, composerStartRestartGroup, i12);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
                Transition transitionCreateChildTransitionInternal = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, enterExitStateTargetEnterExit2, enterExitStateTargetEnterExit3, "EnterExitTransition", composerStartRestartGroup, i11 | DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS);
                if (transition.isSeeking()) {
                    composerStartRestartGroup.startReplaceGroup(782538635);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(782386797);
                    T pendingTargetState2 = transition.getPendingTargetState();
                    if (pendingTargetState2 == null) {
                        composerStartRestartGroup.startReplaceGroup(782437481);
                        composerStartRestartGroup.endReplaceGroup();
                        enterExitStateTargetEnterExit = null;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(782437482);
                        composerStartRestartGroup.startReplaceGroup(-1270450094);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1270450094, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:810)");
                        }
                        enterExitStateTargetEnterExit = targetEnterExit(transition, lVar, pendingTargetState2, composerStartRestartGroup, i12);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    transitionCreateChildTransitionInternal.updatePendingTarget(enterExitStateTargetEnterExit);
                    composerStartRestartGroup.endReplaceGroup();
                }
                EnterTransition enterTransitionTrackActiveEnter = EnterExitTransitionKt.trackActiveEnter(transitionCreateChildTransitionInternal, enterTransition, composerStartRestartGroup, (i8 >> 6) & 112);
                ExitTransition exitTransitionTrackActiveExit = EnterExitTransitionKt.trackActiveExit(transitionCreateChildTransitionInternal, exitTransition, composerStartRestartGroup, (i8 >> 9) & 112);
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(pVar, composerStartRestartGroup, (i8 >> 15) & 14);
                Boolean boolInvoke = pVar.invoke(transitionCreateChildTransitionInternal.getCurrentState(), transitionCreateChildTransitionInternal.getTargetState());
                boolean zChanged = composerStartRestartGroup.changed(transitionCreateChildTransitionInternal) | composerStartRestartGroup.changed(stateRememberUpdatedState);
                AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1RememberedValue == Composer.Companion.getEmpty()) {
                    animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1RememberedValue = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(transitionCreateChildTransitionInternal, stateRememberUpdatedState, null);
                    composerStartRestartGroup.updateRememberedValue(animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1RememberedValue);
                }
                State stateProduceState = SnapshotStateKt.produceState(boolInvoke, (p) animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1RememberedValue, composerStartRestartGroup, 0);
                if (getExitFinished(transitionCreateChildTransitionInternal) && AnimatedEnterExitImpl$lambda$3(stateProduceState)) {
                    composerStartRestartGroup.startReplaceGroup(-270853937);
                    composerStartRestartGroup.endReplaceGroup();
                    qVar2 = qVar;
                    mutableTransform4 = mutableTransform5;
                    onLookaheadMeasured2 = onLookaheadMeasured4;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-272355980);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (i9 == 4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new AnimatedVisibilityScopeImpl(transitionCreateChildTransitionInternal);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) objRememberedValue2;
                    animatedVisibilityScopeImpl.getSharedMutableTransformState$animation().setMutableData(mutableTransform5);
                    boolean z2 = true;
                    mutableTransform4 = mutableTransform5;
                    Modifier modifierCreateModifier = EnterExitTransitionKt.createModifier(transitionCreateChildTransitionInternal, enterTransitionTrackActiveEnter, exitTransitionTrackActiveExit, false, null, animatedVisibilityScopeImpl.getSharedMutableTransformState$animation(), "Built-in", composerStartRestartGroup, 1575936, 8);
                    onLookaheadMeasured2 = onLookaheadMeasured4;
                    if (onLookaheadMeasured2 != null) {
                        composerStartRestartGroup.startReplaceGroup(-271572424);
                        Modifier.Companion companion = Modifier.Companion;
                        if ((3670016 & i8) != 1048576 && ((i8 & 2097152) == 0 || !composerStartRestartGroup.changedInstance(onLookaheadMeasured2))) {
                            z2 = false;
                        }
                        AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1 animatedVisibilityKt$AnimatedEnterExitImpl$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z2 || animatedVisibilityKt$AnimatedEnterExitImpl$2$1RememberedValue == Composer.Companion.getEmpty()) {
                            animatedVisibilityKt$AnimatedEnterExitImpl$2$1RememberedValue = new AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1(onLookaheadMeasured2);
                            composerStartRestartGroup.updateRememberedValue(animatedVisibilityKt$AnimatedEnterExitImpl$2$1RememberedValue);
                        }
                        companionLayout = LayoutModifierKt.layout(companion, (q) animatedVisibilityKt$AnimatedEnterExitImpl$2$1RememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1255668613);
                        composerStartRestartGroup.endReplaceGroup();
                        companionLayout = Modifier.Companion;
                    }
                    Modifier modifierThen = modifier.then(modifierCreateModifier.then(companionLayout));
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy = (AnimatedEnterExitMeasurePolicy) objRememberedValue3;
                    int iM = AnimatedVisibilityKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
                    Updater.m7351setimpl(composerStartRestartGroup, animatedEnterExitMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7348initimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    qVar2 = qVar;
                    qVar2.invoke(animatedVisibilityScopeImpl, composerStartRestartGroup, Integer.valueOf((i8 >> 21) & 112));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-270847985);
                composerStartRestartGroup.endReplaceGroup();
                onLookaheadMeasured2 = onLookaheadMeasured3;
                mutableTransform4 = mutableTransform5;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableTransform3 = mutableTransform4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            onLookaheadMeasured2 = onLookaheadMeasured;
            mutableTransform3 = mutableTransform2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new AnonymousClass4(transition, lVar, modifier, enterTransition, exitTransition, pVar, onLookaheadMeasured2, mutableTransform3, qVar2, i2, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<EnterExitState, EnterExitState, Boolean> AnimatedEnterExitImpl$lambda$1(State<? extends p<? super EnterExitState, ? super EnterExitState, Boolean>> state) {
        return (p) state.getValue();
    }

    private static final boolean AnimatedEnterExitImpl$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope r24, androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r25, androidx.compose.ui.Modifier r26, androidx.compose.animation.EnterTransition r27, androidx.compose.animation.ExitTransition r28, java.lang.String r29, h.g.a.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope, androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void AnimatedVisibilityImpl(androidx.compose.animation.core.Transition<T> r18, h.g.a.l<? super T, java.lang.Boolean> r19, androidx.compose.ui.Modifier r20, androidx.compose.animation.EnterTransition r21, androidx.compose.animation.ExitTransition r22, androidx.compose.animation.MutableTransform r23, h.g.a.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibilityImpl(androidx.compose.animation.core.Transition, h.g.a.l, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, androidx.compose.animation.MutableTransform, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void DeferredAnimatedVisibility(androidx.compose.animation.core.DeferredTransition<T> r24, h.g.a.l<? super T, java.lang.Boolean> r25, androidx.compose.ui.Modifier r26, androidx.compose.animation.EnterTransition r27, androidx.compose.animation.ExitTransition r28, androidx.compose.animation.MutableTransform r29, h.g.a.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.DeferredAnimatedVisibility(androidx.compose.animation.core.DeferredTransition, h.g.a.l, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, androidx.compose.animation.MutableTransform, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getExitFinished(Transition<EnterExitState> transition) {
        return transition.getCurrentState() == EnterExitState.PostExit && transition.getTargetState() == EnterExitState.PostExit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> EnterExitState targetEnterExit(Transition<T> transition, l<? super T, Boolean> lVar, T t, Composer composer, int i2) {
        EnterExitState enterExitState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(361571134, i2, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:935)");
        }
        composer.startMovableGroup(-422486690, transition);
        if (transition.isSeeking()) {
            composer.startReplaceGroup(-212166497);
            composer.endReplaceGroup();
            enterExitState = lVar.invoke(t).booleanValue() ? EnterExitState.Visible : lVar.invoke(transition.getCurrentState()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        } else {
            composer.startReplaceGroup(-211890659);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            if (lVar.invoke(transition.getCurrentState()).booleanValue()) {
                mutableState.setValue(true);
            }
            T pendingTargetState = transition.getPendingTargetState();
            enterExitState = lVar.invoke(t).booleanValue() ? EnterExitState.Visible : ((pendingTargetState == null || !lVar.invoke(pendingTargetState).booleanValue()) && ((Boolean) mutableState.getValue()).booleanValue()) ? EnterExitState.PostExit : EnterExitState.PreEnter;
            composer.endReplaceGroup();
        }
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return enterExitState;
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13, reason: invalid class name */
    final class AnonymousClass13 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ q<AnimatedVisibilityScope, Composer, Integer, ab> $content;
        final /* synthetic */ EnterTransition $enter;
        final /* synthetic */ ExitTransition $exit;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Transition $this_AnimatedVisibility;
        final /* synthetic */ l $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass13(Transition transition, l lVar, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, ab> qVar, int i2, int i3) {
            super(2);
            this.$this_AnimatedVisibility = transition;
            this.$visible = lVar;
            this.$modifier = modifier;
            this.$enter = enterTransition;
            this.$exit = exitTransition;
            this.$content = qVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AnimatedVisibilityKt.AnimatedVisibility(this.$this_AnimatedVisibility, this.$visible, this.$modifier, this.$enter, this.$exit, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ q<AnimatedVisibilityScope, Composer, Integer, ab> $content;
        final /* synthetic */ EnterTransition $enter;
        final /* synthetic */ ExitTransition $exit;
        final /* synthetic */ String $label;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, ab> qVar, int i2, int i3) {
            super(2);
            this.$visible = z;
            this.$modifier = modifier;
            this.$enter = enterTransition;
            this.$exit = exitTransition;
            this.$label = str;
            this.$content = qVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AnimatedVisibilityKt.AnimatedVisibility(this.$visible, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8, reason: invalid class name */
    final class AnonymousClass8 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ q<AnimatedVisibilityScope, Composer, Integer, ab> $content;
        final /* synthetic */ EnterTransition $enter;
        final /* synthetic */ ExitTransition $exit;
        final /* synthetic */ String $label;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ MutableTransitionState<Boolean> $visibleState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass8(MutableTransitionState<Boolean> mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, ab> qVar, int i2, int i3) {
            super(2);
            this.$visibleState = mutableTransitionState;
            this.$modifier = modifier;
            this.$enter = enterTransition;
            this.$exit = exitTransition;
            this.$label = str;
            this.$content = qVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AnimatedVisibilityKt.AnimatedVisibility(this.$visibleState, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10, reason: invalid class name */
    final class AnonymousClass10 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ q<AnimatedVisibilityScope, Composer, Integer, ab> $content;
        final /* synthetic */ EnterTransition $enter;
        final /* synthetic */ ExitTransition $exit;
        final /* synthetic */ String $label;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ RowScope $this_AnimatedVisibility;
        final /* synthetic */ MutableTransitionState<Boolean> $visibleState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass10(RowScope rowScope, MutableTransitionState<Boolean> mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, ab> qVar, int i2, int i3) {
            super(2);
            this.$this_AnimatedVisibility = rowScope;
            this.$visibleState = mutableTransitionState;
            this.$modifier = modifier;
            this.$enter = enterTransition;
            this.$exit = exitTransition;
            this.$label = str;
            this.$content = qVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AnimatedVisibilityKt.AnimatedVisibility(this.$this_AnimatedVisibility, this.$visibleState, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12, reason: invalid class name */
    final class AnonymousClass12 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ q<AnimatedVisibilityScope, Composer, Integer, ab> $content;
        final /* synthetic */ EnterTransition $enter;
        final /* synthetic */ ExitTransition $exit;
        final /* synthetic */ String $label;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ ColumnScope $this_AnimatedVisibility;
        final /* synthetic */ MutableTransitionState<Boolean> $visibleState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass12(ColumnScope columnScope, MutableTransitionState<Boolean> mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, ab> qVar, int i2, int i3) {
            super(2);
            this.$this_AnimatedVisibility = columnScope;
            this.$visibleState = mutableTransitionState;
            this.$modifier = modifier;
            this.$enter = enterTransition;
            this.$exit = exitTransition;
            this.$label = str;
            this.$content = qVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AnimatedVisibilityKt.AnimatedVisibility(this.$this_AnimatedVisibility, this.$visibleState, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4, reason: invalid class name and case insensitive filesystem */
    final class C01784 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ q<AnimatedVisibilityScope, Composer, Integer, ab> $content;
        final /* synthetic */ EnterTransition $enter;
        final /* synthetic */ ExitTransition $exit;
        final /* synthetic */ String $label;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ RowScope $this_AnimatedVisibility;
        final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01784(RowScope rowScope, boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, ab> qVar, int i2, int i3) {
            super(2);
            this.$this_AnimatedVisibility = rowScope;
            this.$visible = z;
            this.$modifier = modifier;
            this.$enter = enterTransition;
            this.$exit = exitTransition;
            this.$label = str;
            this.$content = qVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AnimatedVisibilityKt.AnimatedVisibility(this.$this_AnimatedVisibility, this.$visible, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6, reason: invalid class name */
    final class AnonymousClass6 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ q<AnimatedVisibilityScope, Composer, Integer, ab> $content;
        final /* synthetic */ EnterTransition $enter;
        final /* synthetic */ ExitTransition $exit;
        final /* synthetic */ String $label;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ ColumnScope $this_AnimatedVisibility;
        final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass6(ColumnScope columnScope, boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, ab> qVar, int i2, int i3) {
            super(2);
            this.$this_AnimatedVisibility = columnScope;
            this.$visible = z;
            this.$modifier = modifier;
            this.$enter = enterTransition;
            this.$exit = exitTransition;
            this.$label = str;
            this.$content = qVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AnimatedVisibilityKt.AnimatedVisibility(this.$this_AnimatedVisibility, this.$visible, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$3, reason: invalid class name */
    final class AnonymousClass3 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ q<AnimatedVisibilityScope, Composer, Integer, ab> $content;
        final /* synthetic */ EnterTransition $enter;
        final /* synthetic */ ExitTransition $exit;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ MutableTransform $mutableTransform;
        final /* synthetic */ Transition $transition;
        final /* synthetic */ l $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Transition transition, l lVar, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, MutableTransform mutableTransform, q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, ab> qVar, int i2, int i3) {
            super(2);
            this.$transition = transition;
            this.$visible = lVar;
            this.$modifier = modifier;
            this.$enter = enterTransition;
            this.$exit = exitTransition;
            this.$mutableTransform = mutableTransform;
            this.$content = qVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AnimatedVisibilityKt.AnimatedVisibilityImpl(this.$transition, this.$visible, this.$modifier, this.$enter, this.$exit, this.$mutableTransform, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$DeferredAnimatedVisibility$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ q<AnimatedVisibilityScope, Composer, Integer, ab> $content;
        final /* synthetic */ EnterTransition $enter;
        final /* synthetic */ ExitTransition $exit;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ MutableTransform $mutableTransform;
        final /* synthetic */ DeferredTransition $this_DeferredAnimatedVisibility;
        final /* synthetic */ l $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(DeferredTransition deferredTransition, l lVar, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, MutableTransform mutableTransform, q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, ab> qVar, int i2, int i3) {
            super(2);
            this.$this_DeferredAnimatedVisibility = deferredTransition;
            this.$visible = lVar;
            this.$modifier = modifier;
            this.$enter = enterTransition;
            this.$exit = exitTransition;
            this.$mutableTransform = mutableTransform;
            this.$content = qVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AnimatedVisibilityKt.DeferredAnimatedVisibility(this.$this_DeferredAnimatedVisibility, this.$visible, this.$modifier, this.$enter, this.$exit, this.$mutableTransform, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4, reason: invalid class name */
    final class AnonymousClass4 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ q<AnimatedVisibilityScope, Composer, Integer, ab> $content;
        final /* synthetic */ EnterTransition $enter;
        final /* synthetic */ ExitTransition $exit;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ MutableTransform $mutableTransformData;
        final /* synthetic */ OnLookaheadMeasured $onLookaheadMeasured;
        final /* synthetic */ p<EnterExitState, EnterExitState, Boolean> $shouldDisposeBlock;
        final /* synthetic */ Transition $transition;
        final /* synthetic */ l $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(Transition transition, l lVar, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, p<? super EnterExitState, ? super EnterExitState, Boolean> pVar, OnLookaheadMeasured onLookaheadMeasured, MutableTransform mutableTransform, q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, ab> qVar, int i2, int i3) {
            super(2);
            this.$transition = transition;
            this.$visible = lVar;
            this.$modifier = modifier;
            this.$enter = enterTransition;
            this.$exit = exitTransition;
            this.$shouldDisposeBlock = pVar;
            this.$onLookaheadMeasured = onLookaheadMeasured;
            this.$mutableTransformData = mutableTransform;
            this.$content = qVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            AnimatedVisibilityKt.AnimatedEnterExitImpl(this.$transition, this.$visible, this.$modifier, this.$enter, this.$exit, this.$shouldDisposeBlock, this.$onLookaheadMeasured, this.$mutableTransformData, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void AnimatedVisibility(androidx.compose.animation.core.Transition<T> r23, h.g.a.l<? super T, java.lang.Boolean> r24, androidx.compose.ui.Modifier r25, androidx.compose.animation.EnterTransition r26, androidx.compose.animation.ExitTransition r27, h.g.a.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.animation.core.Transition, h.g.a.l, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r24, androidx.compose.ui.Modifier r25, androidx.compose.animation.EnterTransition r26, androidx.compose.animation.ExitTransition r27, java.lang.String r28, h.g.a.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope r24, boolean r25, androidx.compose.ui.Modifier r26, androidx.compose.animation.EnterTransition r27, androidx.compose.animation.ExitTransition r28, java.lang.String r29, h.g.a.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(androidx.compose.foundation.layout.RowScope r24, androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> r25, androidx.compose.ui.Modifier r26, androidx.compose.animation.EnterTransition r27, androidx.compose.animation.ExitTransition r28, java.lang.String r29, h.g.a.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope, androidx.compose.animation.core.MutableTransitionState, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(androidx.compose.foundation.layout.RowScope r24, boolean r25, androidx.compose.ui.Modifier r26, androidx.compose.animation.EnterTransition r27, androidx.compose.animation.ExitTransition r28, java.lang.String r29, h.g.a.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AnimatedVisibility(boolean r24, androidx.compose.ui.Modifier r25, androidx.compose.animation.EnterTransition r26, androidx.compose.animation.ExitTransition r27, java.lang.String r28, h.g.a.q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }
}
