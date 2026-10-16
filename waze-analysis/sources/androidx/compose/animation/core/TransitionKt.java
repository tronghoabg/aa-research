package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition.TransitionAnimationState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.c.k;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.v;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;
    private static final float NoReset = -1.0f;
    private static final float ResetAnimationSnap = -3.0f;
    private static final float ResetAnimationSnapCurrent = -4.0f;
    private static final float ResetAnimationSnapTarget = -5.0f;
    private static final float ResetNoSnap = -2.0f;
    private static final l<SeekableTransitionState<?>, ab> SeekableTransitionStateTotalDurationChanged = new l() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda5
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return TransitionKt.SeekableTransitionStateTotalDurationChanged$lambda$0((SeekableTransitionState) obj);
        }
    };

    static final ab SeekableTransitionStateTotalDurationChanged$lambda$0(SeekableTransitionState seekableTransitionState) {
        seekableTransitionState.onTotalDurationChanged$animation_core();
        return ab.f48028a;
    }

    private static final <S, T, V extends AnimationVector> void UpdateInitialAndTargetValues(final Transition<S> transition, final Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, final T t, final T t2, final FiniteAnimationSpec<T> finiteAnimationSpec, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(867041821);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(transition) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(transitionAnimationState) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != ((i2 & 512) == 0 ? composerStartRestartGroup.changed(t) : composerStartRestartGroup.changedInstance(t)) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != ((i2 & 4096) == 0 ? composerStartRestartGroup.changed(t2) : composerStartRestartGroup.changedInstance(t2)) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != ((32768 & i2) == 0 ? composerStartRestartGroup.changed(finiteAnimationSpec) : composerStartRestartGroup.changedInstance(finiteAnimationSpec)) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(867041821, i3, -1, "androidx.compose.animation.core.UpdateInitialAndTargetValues (Transition.kt:2115)");
            }
            if (transition.isSeeking()) {
                transitionAnimationState.updateInitialAndTargetValue$animation_core(t, t2, finiteAnimationSpec);
            } else {
                Transition.TransitionAnimationState.updateTargetValue$animation_core$default(transitionAnimationState, t2, finiteAnimationSpec, null, null, 12, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda8
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TransitionKt.UpdateInitialAndTargetValues$lambda$0(transition, transitionAnimationState, t, t2, finiteAnimationSpec, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab UpdateInitialAndTargetValues$lambda$0(Transition transition, Transition.TransitionAnimationState transitionAnimationState, Object obj, Object obj2, FiniteAnimationSpec finiteAnimationSpec, int i2, Composer composer, int i3) {
        UpdateInitialAndTargetValues(transition, transitionAnimationState, obj, obj2, finiteAnimationSpec, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final <S> State<Dp> animateDp(Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Dp>> qVar, String str, q<? super S, ? super Composer, ? super Integer, Dp> qVar2, Composer composer, int i2, int i3) {
        Object currentState;
        AnonymousClass1 anonymousClass1 = (i3 & 1) != 0 ? new q<Transition.Segment, Composer, Integer, SpringSpec<Dp>>() { // from class: androidx.compose.animation.core.TransitionKt.animateDp.1
            public final SpringSpec<Dp> invoke(Transition.Segment segment, Composer composer2, int i4) {
                composer2.startReplaceGroup(-1953972046);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1953972046, i4, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:2185)");
                }
                int i5 = VisibilityThresholdsKt.f1650a;
                SpringSpec<Dp> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m11162boximpl(0.4f), 3, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return springSpecSpring$default;
            }

            @Override // h.g.a.q
            public /* bridge */ /* synthetic */ SpringSpec<Dp> invoke(Transition.Segment segment, Composer composer2, Integer num) {
                return invoke(segment, composer2, num.intValue());
            }
        } : qVar;
        String str2 = (i3 & 2) != 0 ? "DpAnimation" : str;
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(Dp.Companion);
        int i4 = i2 << 3;
        boolean zIsSeeking = transition.isSeeking();
        int i5 = (i2 & 14) | (i4 & DisplayStrings.DS_TAP_TO_VERIFY) | (i4 & 7168) | (i4 & 57344);
        int i6 = i5 & 14;
        int i7 = i6 ^ 6;
        boolean z = true;
        if (zIsSeeking) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z2 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z2 || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        Integer numValueOf = Integer.valueOf((i5 >> 9) & 112);
        Dp dpInvoke = qVar2.invoke(currentState, composer, numValueOf);
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(objRememberedValue);
        }
        Dp dpInvoke2 = qVar2.invoke((Object) ((State) objRememberedValue).getValue(), composer, numValueOf);
        if ((i7 <= 4 || !composer.changed(transition)) && (i5 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue2 = composer.rememberedValue();
        if (z || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(objRememberedValue2);
        }
        return createTransitionAnimation(transition, dpInvoke, dpInvoke2, anonymousClass1.invoke((Object) ((State) objRememberedValue2).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, i6 | ((i5 << 6) & 458752));
    }

    public static final <S> State<Float> animateFloat(Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> qVar, String str, q<? super S, ? super Composer, ? super Integer, Float> qVar2, Composer composer, int i2, int i3) {
        Object currentState;
        C02121 c02121 = (i3 & 1) != 0 ? new q<Transition.Segment, Composer, Integer, SpringSpec<Float>>() { // from class: androidx.compose.animation.core.TransitionKt.animateFloat.1
            public final SpringSpec<Float> invoke(Transition.Segment segment, Composer composer2, int i4) {
                composer2.startReplaceGroup(-985243360);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-985243360, i4, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:2155)");
                }
                SpringSpec<Float> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return springSpecSpring$default;
            }

            @Override // h.g.a.q
            public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Transition.Segment segment, Composer composer2, Integer num) {
                return invoke(segment, composer2, num.intValue());
            }
        } : qVar;
        String str2 = (i3 & 2) != 0 ? "FloatAnimation" : str;
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(h.g.b.q.f48127a);
        int i4 = i2 << 3;
        boolean zIsSeeking = transition.isSeeking();
        int i5 = (i2 & 14) | (i4 & DisplayStrings.DS_TAP_TO_VERIFY) | (i4 & 7168) | (i4 & 57344);
        int i6 = i5 & 14;
        int i7 = i6 ^ 6;
        boolean z = true;
        if (zIsSeeking) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z2 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z2 || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        Integer numValueOf = Integer.valueOf((i5 >> 9) & 112);
        Float fInvoke = qVar2.invoke(currentState, composer, numValueOf);
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(objRememberedValue);
        }
        Float fInvoke2 = qVar2.invoke((Object) ((State) objRememberedValue).getValue(), composer, numValueOf);
        if ((i7 <= 4 || !composer.changed(transition)) && (i5 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue2 = composer.rememberedValue();
        if (z || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(objRememberedValue2);
        }
        return createTransitionAnimation(transition, fInvoke, fInvoke2, c02121.invoke((Object) ((State) objRememberedValue2).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, i6 | ((i5 << 6) & 458752));
    }

    public static final <S> State<Integer> animateInt(Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Integer>> qVar, String str, q<? super S, ? super Composer, ? super Integer, Integer> qVar2, Composer composer, int i2, int i3) {
        Object currentState;
        C02131 c02131 = (i3 & 1) != 0 ? new q<Transition.Segment, Composer, Integer, SpringSpec<Integer>>() { // from class: androidx.compose.animation.core.TransitionKt.animateInt.1
            public final SpringSpec<Integer> invoke(Transition.Segment segment, Composer composer2, int i4) {
                composer2.startReplaceGroup(2109424115);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2109424115, i4, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:2309)");
                }
                SpringSpec<Integer> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, 1, 3, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return springSpecSpring$default;
            }

            @Override // h.g.a.q
            public /* bridge */ /* synthetic */ SpringSpec<Integer> invoke(Transition.Segment segment, Composer composer2, Integer num) {
                return invoke(segment, composer2, num.intValue());
            }
        } : qVar;
        String str2 = (i3 & 2) != 0 ? "IntAnimation" : str;
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(v.f48128a);
        int i4 = i2 << 3;
        boolean zIsSeeking = transition.isSeeking();
        int i5 = (i2 & 14) | (i4 & DisplayStrings.DS_TAP_TO_VERIFY) | (i4 & 7168) | (i4 & 57344);
        int i6 = i5 & 14;
        int i7 = i6 ^ 6;
        boolean z = true;
        if (zIsSeeking) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z2 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z2 || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        Integer numValueOf = Integer.valueOf((i5 >> 9) & 112);
        Integer numInvoke = qVar2.invoke(currentState, composer, numValueOf);
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(objRememberedValue);
        }
        Integer numInvoke2 = qVar2.invoke((Object) ((State) objRememberedValue).getValue(), composer, numValueOf);
        if ((i7 <= 4 || !composer.changed(transition)) && (i5 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue2 = composer.rememberedValue();
        if (z || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(objRememberedValue2);
        }
        return createTransitionAnimation(transition, numInvoke, numInvoke2, c02131.invoke((Object) ((State) objRememberedValue2).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, i6 | ((i5 << 6) & 458752));
    }

    public static final <S> State<IntOffset> animateIntOffset(Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntOffset>> qVar, String str, q<? super S, ? super Composer, ? super Integer, IntOffset> qVar2, Composer composer, int i2, int i3) {
        Object currentState;
        C02141 c02141 = (i3 & 1) != 0 ? new q<Transition.Segment, Composer, Integer, SpringSpec<IntOffset>>() { // from class: androidx.compose.animation.core.TransitionKt.animateIntOffset.1
            public final SpringSpec<IntOffset> invoke(Transition.Segment segment, Composer composer2, int i4) {
                composer2.startReplaceGroup(-428458074);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-428458074, i4, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:2278)");
                }
                SpringSpec<IntOffset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m11287boximpl(InlineClassHelperKt.Uint64Low32), 3, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return springSpecSpring$default;
            }

            @Override // h.g.a.q
            public /* bridge */ /* synthetic */ SpringSpec<IntOffset> invoke(Transition.Segment segment, Composer composer2, Integer num) {
                return invoke(segment, composer2, num.intValue());
            }
        } : qVar;
        String str2 = (i3 & 2) != 0 ? "IntOffsetAnimation" : str;
        TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
        int i4 = i2 << 3;
        boolean zIsSeeking = transition.isSeeking();
        int i5 = (i2 & 14) | (i4 & DisplayStrings.DS_TAP_TO_VERIFY) | (i4 & 7168) | (i4 & 57344);
        int i6 = i5 & 14;
        int i7 = i6 ^ 6;
        boolean z = true;
        if (zIsSeeking) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z2 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z2 || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        Integer numValueOf = Integer.valueOf((i5 >> 9) & 112);
        IntOffset intOffsetInvoke = qVar2.invoke(currentState, composer, numValueOf);
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(objRememberedValue);
        }
        IntOffset intOffsetInvoke2 = qVar2.invoke((Object) ((State) objRememberedValue).getValue(), composer, numValueOf);
        if ((i7 <= 4 || !composer.changed(transition)) && (i5 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue2 = composer.rememberedValue();
        if (z || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(objRememberedValue2);
        }
        return createTransitionAnimation(transition, intOffsetInvoke, intOffsetInvoke2, c02141.invoke((Object) ((State) objRememberedValue2).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, i6 | ((i5 << 6) & 458752));
    }

    public static final <S> State<IntSize> animateIntSize(Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntSize>> qVar, String str, q<? super S, ? super Composer, ? super Integer, IntSize> qVar2, Composer composer, int i2, int i3) {
        Object currentState;
        C02151 c02151 = (i3 & 1) != 0 ? new q<Transition.Segment, Composer, Integer, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.core.TransitionKt.animateIntSize.1
            public final SpringSpec<IntSize> invoke(Transition.Segment segment, Composer composer2, int i4) {
                composer2.startReplaceGroup(811932052);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(811932052, i4, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:2340)");
                }
                SpringSpec<IntSize> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m11331boximpl(InlineClassHelperKt.Uint64Low32), 3, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return springSpecSpring$default;
            }

            @Override // h.g.a.q
            public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(Transition.Segment segment, Composer composer2, Integer num) {
                return invoke(segment, composer2, num.intValue());
            }
        } : qVar;
        String str2 = (i3 & 2) != 0 ? "IntSizeAnimation" : str;
        TwoWayConverter<IntSize, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntSize.Companion);
        int i4 = i2 << 3;
        boolean zIsSeeking = transition.isSeeking();
        int i5 = (i2 & 14) | (i4 & DisplayStrings.DS_TAP_TO_VERIFY) | (i4 & 7168) | (i4 & 57344);
        int i6 = i5 & 14;
        int i7 = i6 ^ 6;
        boolean z = true;
        if (zIsSeeking) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z2 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z2 || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        Integer numValueOf = Integer.valueOf((i5 >> 9) & 112);
        IntSize intSizeInvoke = qVar2.invoke(currentState, composer, numValueOf);
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(objRememberedValue);
        }
        IntSize intSizeInvoke2 = qVar2.invoke((Object) ((State) objRememberedValue).getValue(), composer, numValueOf);
        if ((i7 <= 4 || !composer.changed(transition)) && (i5 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue2 = composer.rememberedValue();
        if (z || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(objRememberedValue2);
        }
        return createTransitionAnimation(transition, intSizeInvoke, intSizeInvoke2, c02151.invoke((Object) ((State) objRememberedValue2).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, i6 | ((i5 << 6) & 458752));
    }

    public static final <S> State<Offset> animateOffset(Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Offset>> qVar, String str, q<? super S, ? super Composer, ? super Integer, Offset> qVar2, Composer composer, int i2, int i3) {
        Object currentState;
        C02161 c02161 = (i3 & 1) != 0 ? new q<Transition.Segment, Composer, Integer, SpringSpec<Offset>>() { // from class: androidx.compose.animation.core.TransitionKt.animateOffset.1
            public final SpringSpec<Offset> invoke(Transition.Segment segment, Composer composer2, int i4) {
                composer2.startReplaceGroup(-1662821959);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1662821959, i4, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:2215)");
                }
                SpringSpec<Offset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m7969boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return springSpecSpring$default;
            }

            @Override // h.g.a.q
            public /* bridge */ /* synthetic */ SpringSpec<Offset> invoke(Transition.Segment segment, Composer composer2, Integer num) {
                return invoke(segment, composer2, num.intValue());
            }
        } : qVar;
        String str2 = (i3 & 2) != 0 ? "OffsetAnimation" : str;
        TwoWayConverter<Offset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Offset.Companion);
        int i4 = i2 << 3;
        boolean zIsSeeking = transition.isSeeking();
        int i5 = (i2 & 14) | (i4 & DisplayStrings.DS_TAP_TO_VERIFY) | (i4 & 7168) | (i4 & 57344);
        int i6 = i5 & 14;
        int i7 = i6 ^ 6;
        boolean z = true;
        if (zIsSeeking) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z2 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z2 || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        Integer numValueOf = Integer.valueOf((i5 >> 9) & 112);
        Offset offsetInvoke = qVar2.invoke(currentState, composer, numValueOf);
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(objRememberedValue);
        }
        Offset offsetInvoke2 = qVar2.invoke((Object) ((State) objRememberedValue).getValue(), composer, numValueOf);
        if ((i7 <= 4 || !composer.changed(transition)) && (i5 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue2 = composer.rememberedValue();
        if (z || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(objRememberedValue2);
        }
        return createTransitionAnimation(transition, offsetInvoke, offsetInvoke2, c02161.invoke((Object) ((State) objRememberedValue2).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, i6 | ((i5 << 6) & 458752));
    }

    public static final <S> State<Rect> animateRect(Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Rect>> qVar, String str, q<? super S, ? super Composer, ? super Integer, Rect> qVar2, Composer composer, int i2, int i3) {
        Object currentState;
        C02171 c02171 = (i3 & 1) != 0 ? new q<Transition.Segment, Composer, Integer, SpringSpec<Rect>>() { // from class: androidx.compose.animation.core.TransitionKt.animateRect.1
            public final SpringSpec<Rect> invoke(Transition.Segment segment, Composer composer2, int i4) {
                composer2.startReplaceGroup(946173386);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(946173386, i4, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:2370)");
                }
                SpringSpec<Rect> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return springSpecSpring$default;
            }

            @Override // h.g.a.q
            public /* bridge */ /* synthetic */ SpringSpec<Rect> invoke(Transition.Segment segment, Composer composer2, Integer num) {
                return invoke(segment, composer2, num.intValue());
            }
        } : qVar;
        String str2 = (i3 & 2) != 0 ? "RectAnimation" : str;
        TwoWayConverter<Rect, AnimationVector4D> vectorConverter = VectorConvertersKt.getVectorConverter(Rect.Companion);
        int i4 = i2 << 3;
        boolean zIsSeeking = transition.isSeeking();
        int i5 = (i2 & 14) | (i4 & DisplayStrings.DS_TAP_TO_VERIFY) | (i4 & 7168) | (i4 & 57344);
        int i6 = i5 & 14;
        int i7 = i6 ^ 6;
        boolean z = true;
        if (zIsSeeking) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z2 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z2 || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        Integer numValueOf = Integer.valueOf((i5 >> 9) & 112);
        Rect rectInvoke = qVar2.invoke(currentState, composer, numValueOf);
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(objRememberedValue);
        }
        Rect rectInvoke2 = qVar2.invoke((Object) ((State) objRememberedValue).getValue(), composer, numValueOf);
        if ((i7 <= 4 || !composer.changed(transition)) && (i5 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue2 = composer.rememberedValue();
        if (z || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(objRememberedValue2);
        }
        return createTransitionAnimation(transition, rectInvoke, rectInvoke2, c02171.invoke((Object) ((State) objRememberedValue2).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, i6 | ((i5 << 6) & 458752));
    }

    public static final <S> State<Size> animateSize(Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Size>> qVar, String str, q<? super S, ? super Composer, ? super Integer, Size> qVar2, Composer composer, int i2, int i3) {
        Object currentState;
        C02181 c02181 = (i3 & 1) != 0 ? new q<Transition.Segment, Composer, Integer, SpringSpec<Size>>() { // from class: androidx.compose.animation.core.TransitionKt.animateSize.1
            public final SpringSpec<Size> invoke(Transition.Segment segment, Composer composer2, int i4) {
                composer2.startReplaceGroup(493329511);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(493329511, i4, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:2245)");
                }
                SpringSpec<Size> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m8037boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return springSpecSpring$default;
            }

            @Override // h.g.a.q
            public /* bridge */ /* synthetic */ SpringSpec<Size> invoke(Transition.Segment segment, Composer composer2, Integer num) {
                return invoke(segment, composer2, num.intValue());
            }
        } : qVar;
        String str2 = (i3 & 2) != 0 ? "SizeAnimation" : str;
        TwoWayConverter<Size, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Size.Companion);
        int i4 = i2 << 3;
        boolean zIsSeeking = transition.isSeeking();
        int i5 = (i2 & 14) | (i4 & DisplayStrings.DS_TAP_TO_VERIFY) | (i4 & 7168) | (i4 & 57344);
        int i6 = i5 & 14;
        int i7 = i6 ^ 6;
        boolean z = true;
        if (zIsSeeking) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z2 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z2 || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        Integer numValueOf = Integer.valueOf((i5 >> 9) & 112);
        Size sizeInvoke = qVar2.invoke(currentState, composer, numValueOf);
        boolean z3 = (i7 > 4 && composer.changed(transition)) || (i5 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(objRememberedValue);
        }
        Size sizeInvoke2 = qVar2.invoke((Object) ((State) objRememberedValue).getValue(), composer, numValueOf);
        if ((i7 <= 4 || !composer.changed(transition)) && (i5 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue2 = composer.rememberedValue();
        if (z || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(objRememberedValue2);
        }
        return createTransitionAnimation(transition, sizeInvoke, sizeInvoke2, c02181.invoke((Object) ((State) objRememberedValue2).getValue(), composer, Integer.valueOf((i5 >> 3) & 112)), vectorConverter, str2, composer, i6 | ((i5 << 6) & 458752));
    }

    public static final <S, T, V extends AnimationVector> State<T> animateValue(Transition<S> transition, TwoWayConverter<T, V> twoWayConverter, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<T>> qVar, String str, q<? super S, ? super Composer, ? super Integer, ? extends T> qVar2, Composer composer, int i2, int i3) {
        Object currentState;
        C02191 c02191 = (i3 & 2) != 0 ? new q<Transition.Segment, Composer, Integer, SpringSpec>() { // from class: androidx.compose.animation.core.TransitionKt.animateValue.1
            public final SpringSpec invoke(Transition.Segment segment, Composer composer2, int i4) {
                composer2.startReplaceGroup(-2137771706);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2137771706, i4, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:2042)");
                }
                SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                return springSpecSpring$default;
            }

            @Override // h.g.a.q
            public /* bridge */ /* synthetic */ SpringSpec invoke(Transition.Segment segment, Composer composer2, Integer num) {
                return invoke(segment, composer2, num.intValue());
            }
        } : qVar;
        int i4 = i2 & 14;
        String str2 = (i3 & 4) != 0 ? "ValueAnimation" : str;
        int i5 = i4 ^ 6;
        if (transition.isSeeking()) {
            composer.startReplaceGroup(1666827533);
            composer.endReplaceGroup();
            currentState = transition.getCurrentState();
        } else {
            composer.startReplaceGroup(1666573488);
            boolean z = (i5 > 4 && composer.changed(transition)) || (i2 & 6) == 4;
            currentState = composer.rememberedValue();
            if (z || currentState == Composer.Companion.getEmpty()) {
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    S currentState2 = transition.getCurrentState();
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    composer.updateRememberedValue(currentState2);
                    currentState = currentState2;
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            composer.endReplaceGroup();
        }
        Integer numValueOf = Integer.valueOf((i2 >> 9) & 112);
        T tInvoke = qVar2.invoke(currentState, composer, numValueOf);
        boolean z2 = (i5 > 4 && composer.changed(transition)) || (i2 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$targetValue$1$1(transition));
            composer.updateRememberedValue(objRememberedValue);
        }
        T tInvoke2 = qVar2.invoke((Object) ((State) objRememberedValue).getValue(), composer, numValueOf);
        boolean z3 = (i5 > 4 && composer.changed(transition)) || (i2 & 6) == 4;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new TransitionKt$animateValue$animationSpec$1$1(transition));
            composer.updateRememberedValue(objRememberedValue2);
        }
        return createTransitionAnimation(transition, tInvoke, tInvoke2, c02191.invoke((Object) ((State) objRememberedValue2).getValue(), composer, Integer.valueOf((i2 >> 3) & 112)), twoWayConverter, str2, composer, ((i2 << 9) & 57344) | i4 | (458752 & (i2 << 6)));
    }

    public static final <S, T> Transition<T> createChildTransition(Transition<S> transition, String str, q<? super S, ? super Composer, ? super Integer, ? extends T> qVar, Composer composer, int i2, int i3) {
        T tInvoke;
        int i4 = i2 & 14;
        boolean z = ((i4 ^ 6) > 4 && composer.changed(transition)) || (i2 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = transition.getCurrentState();
            composer.updateRememberedValue(objRememberedValue);
        }
        if (transition.isSeeking()) {
            objRememberedValue = transition.getCurrentState();
        }
        if (1 == (i3 & 1)) {
            str = "ChildTransition";
        }
        String str2 = str;
        Integer numValueOf = Integer.valueOf((i2 >> 3) & 112);
        Transition<T> transitionCreateChildTransitionInternal = createChildTransitionInternal(transition, qVar.invoke(objRememberedValue, composer, numValueOf), qVar.invoke(transition.getTargetState(), composer, numValueOf), str2, composer, i4 | ((i2 << 6) & 7168));
        if (transition.isSeeking()) {
            composer.startReplaceGroup(782538635);
            composer.endReplaceGroup();
            return transitionCreateChildTransitionInternal;
        }
        composer.startReplaceGroup(782386797);
        S pendingTargetState = transition.getPendingTargetState();
        if (pendingTargetState == null) {
            composer.startReplaceGroup(782437481);
            composer.endReplaceGroup();
            tInvoke = null;
        } else {
            composer.startReplaceGroup(782437482);
            tInvoke = qVar.invoke(pendingTargetState, composer, numValueOf);
            composer.endReplaceGroup();
        }
        transitionCreateChildTransitionInternal.updatePendingTarget(tInvoke);
        composer.endReplaceGroup();
        return transitionCreateChildTransitionInternal;
    }

    public static final <S, T> Transition<T> createChildTransitionInternal(final Transition<S> transition, T t, T t2, String str, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198307638, i2, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1988)");
        }
        int i3 = (i2 & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && composer.changed(transition)) || (i2 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Transition(new MutableTransitionState(t), transition, transition.getLabel() + " > " + str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<T> transition2 = (Transition) objRememberedValue;
        if ((i3 <= 4 || !composer.changed(transition)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean zChanged = composer.changed(transition2) | z;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new l() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda2
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TransitionKt.createChildTransitionInternal$lambda$1$0(transition, transition2, (DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.DisposableEffect(transition2, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            transition2.seek(t, t2, transition.getLastSeekedTimeNanos$animation_core());
        } else {
            transition2.updateTarget$animation_core(t2);
            transition2.setSeeking$animation_core(false);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult createChildTransitionInternal$lambda$1$0(final Transition transition, final Transition transition2, DisposableEffectScope disposableEffectScope) {
        transition.addTransition$animation_core(transition2);
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                transition.removeTransition$animation_core(transition2);
            }
        };
    }

    public static final <S, T, V extends AnimationVector> Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(final Transition<S> transition, TwoWayConverter<T, V> twoWayConverter, String str, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1714122528, i2, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1941)");
        }
        int i4 = (i2 & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i4 > 4 && composer.changed(transition)) || (i2 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            if ((i3 & 2) != 0) {
                str = "DeferredAnimation";
            }
            objRememberedValue = transition.new DeferredAnimation(twoWayConverter, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<S>.DeferredAnimation<T, V> deferredAnimation = (Transition.DeferredAnimation) objRememberedValue;
        if ((i4 <= 4 || !composer.changed(transition)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean zChangedInstance = composer.changedInstance(deferredAnimation) | z;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new l() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda3
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TransitionKt.createDeferredAnimation$lambda$1$0(transition, deferredAnimation, (DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.DisposableEffect(deferredAnimation, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            deferredAnimation.setupSeeking$animation_core();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return deferredAnimation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult createDeferredAnimation$lambda$1$0(final Transition transition, final Transition.DeferredAnimation deferredAnimation, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                transition.removeAnimation$animation_core(deferredAnimation);
            }
        };
    }

    public static final <S, T, V extends AnimationVector> State<T> createTransitionAnimation(final Transition<S> transition, T t, T t2, FiniteAnimationSpec<T> finiteAnimationSpec, TwoWayConverter<T, V> twoWayConverter, String str, Composer composer, int i2) {
        Snapshot snapshot;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304821198, i2, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:2077)");
        }
        int i3 = i2 & 14;
        int i4 = i3 ^ 6;
        boolean z = (i4 > 4 && composer.changed(transition)) || (i2 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                snapshot = snapshotMakeCurrentNonObservable;
                try {
                    Object transitionAnimationState = transition.new TransitionAnimationState(t, AnimationStateKt.createZeroVectorFrom(twoWayConverter, t2), twoWayConverter, str);
                    companion.restoreNonObservable(currentThreadSnapshot, snapshot, readObserver);
                    composer.updateRememberedValue(transitionAnimationState);
                    objRememberedValue = transitionAnimationState;
                } catch (Throwable th) {
                    th = th;
                    companion.restoreNonObservable(currentThreadSnapshot, snapshot, readObserver);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                snapshot = snapshotMakeCurrentNonObservable;
            }
        }
        int i5 = (i2 >> 3) & 8;
        int i6 = i2 << 3;
        final Transition.TransitionAnimationState transitionAnimationState2 = (Transition.TransitionAnimationState) objRememberedValue;
        UpdateInitialAndTargetValues(transition, transitionAnimationState2, t, t2, finiteAnimationSpec, composer, (i5 << 9) | (i5 << 6) | i3 | (i6 & DisplayStrings.DS_TAP_TO_VERIFY) | (i6 & 7168) | (57344 & i6));
        boolean zChanged = composer.changed(transitionAnimationState2) | ((i4 > 4 && composer.changed(transition)) || (i2 & 6) == 4);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new l() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda6
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TransitionKt.createTransitionAnimation$lambda$1$0(transition, transitionAnimationState2, (DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.DisposableEffect(transitionAnimationState2, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transitionAnimationState2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult createTransitionAnimation$lambda$1$0(final Transition transition, final Transition.TransitionAnimationState transitionAnimationState, DisposableEffectScope disposableEffectScope) {
        transition.addAnimation$animation_core(transitionAnimationState);
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                transition.removeAnimation$animation_core(transitionAnimationState);
            }
        };
    }

    public static final <T> Transition<T> rememberTransition(final TransitionState<T> transitionState, String str, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1643203617, i2, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:923)");
        }
        int i4 = (i2 & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i4 > 4 && composer.changed(transitionState)) || (i2 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            Snapshot.Companion companion = Snapshot.Companion;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                boolean z3 = transitionState instanceof DeferredTransitionState;
                if ((i3 & 2) != 0) {
                    str = null;
                }
                Object transition = z3 ? (Transition) new DeferredTransition((DeferredTransitionState) transitionState, str) : new Transition((TransitionState) transitionState, str);
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                composer.updateRememberedValue(transition);
                objRememberedValue = transition;
            } catch (Throwable th) {
                companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                throw th;
            }
        }
        final DeferredTransition deferredTransition = (Transition<T>) ((Transition) objRememberedValue);
        if (transitionState instanceof SeekableTransitionState) {
            composer.startReplaceGroup(-1357341561);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(k.f48060a, composer);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final af afVar = (af) objRememberedValue2;
            boolean zChangedInstance = composer.changedInstance(afVar) | ((i4 > 4 && composer.changed(transitionState)) || (i2 & 6) == 4);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new l() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return TransitionKt.rememberTransition$lambda$1$0(transitionState, afVar, (DisposableEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.DisposableEffect(afVar, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
            SeekableTransitionState seekableTransitionState = (SeekableTransitionState) transitionState;
            Object currentState = seekableTransitionState.getCurrentState();
            Object targetState = seekableTransitionState.getTargetState();
            if ((i4 <= 4 || !composer.changed(transitionState)) && (i2 & 6) != 4) {
                z = false;
            }
            Object objRememberedValue4 = composer.rememberedValue();
            if (z || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (p) new TransitionKt$rememberTransition$2$1(transitionState, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(currentState, targetState, (p) objRememberedValue4, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1356348972);
            deferredTransition.animateTo$animation_core(transitionState.getTargetState(), composer, 0);
            if (transitionState instanceof DeferredTransitionState) {
                deferredTransition.updatePendingTarget(((DeferredTransitionState) transitionState).getPendingTargetState());
            }
            composer.endReplaceGroup();
        }
        boolean zChanged = composer.changed(deferredTransition);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged || objRememberedValue5 == Composer.Companion.getEmpty()) {
            objRememberedValue5 = new l() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TransitionKt.rememberTransition$lambda$3$0(deferredTransition, (DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        EffectsKt.DisposableEffect(deferredTransition, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return deferredTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult rememberTransition$lambda$1$0(final TransitionState transitionState, final af afVar, DisposableEffectScope disposableEffectScope) {
        final Object currentThread = ActualJvm_jvmAndAndroidKt.getCurrentThread();
        ((SeekableTransitionState) transitionState).setSnapshotStateObserver$animation_core(new SnapshotStateObserver(new l() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TransitionKt.rememberTransition$lambda$1$0$0(currentThread, afVar, (a) obj);
            }
        }));
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ((SeekableTransitionState) transitionState).setSnapshotStateObserver$animation_core(null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab rememberTransition$lambda$1$0$0(Object obj, af afVar, a aVar) {
        if (obj == ActualJvm_jvmAndAndroidKt.getCurrentThread()) {
            aVar.invoke();
        } else {
            aj.z(afVar, null, null, new TransitionKt$rememberTransition$1$1$snapshotStateObserver$1$1(aVar, null), 3);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult rememberTransition$lambda$3$0(final Transition transition, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$lambda$3$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                transition.onDisposed$animation_core();
            }
        };
    }

    public static final <T> Transition<T> updateTransition(T t, String str, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2029166765, i2, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:87)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            if ((i3 & 2) != 0) {
                str = null;
            }
            objRememberedValue = new Transition(t, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        final Transition<T> transition = (Transition) objRememberedValue;
        transition.animateTo$animation_core(t, composer, (i2 & 8) | 48 | (i2 & 14));
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new l() { // from class: androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda7
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TransitionKt.updateTransition$lambda$1$0(transition, (DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.DisposableEffect(transition, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult updateTransition$lambda$1$0(final Transition transition, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                transition.onDisposed$animation_core();
            }
        };
    }

    public static final <T> Transition<T> updateTransition(MutableTransitionState<T> mutableTransitionState, String str, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(882913843, i2, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:1006)");
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        Transition<T> transitionRememberTransition = rememberTransition(mutableTransitionState, str, composer, i2 & 126, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return transitionRememberTransition;
    }

    public static final <T> DeferredTransition<T> rememberTransition(DeferredTransitionState<T> deferredTransitionState, String str, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-129341439, i2, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:208)");
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        x.d(deferredTransitionState, "null cannot be cast to non-null type androidx.compose.animation.core.TransitionState<T of androidx.compose.animation.core.TransitionKt.rememberTransition>");
        Transition transitionRememberTransition = rememberTransition((TransitionState) deferredTransitionState, str, composer, i2 & 126, 0);
        x.d(transitionRememberTransition, "null cannot be cast to non-null type androidx.compose.animation.core.DeferredTransition<T of androidx.compose.animation.core.TransitionKt.rememberTransition>");
        DeferredTransition<T> deferredTransition = (DeferredTransition) transitionRememberTransition;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return deferredTransition;
    }
}
