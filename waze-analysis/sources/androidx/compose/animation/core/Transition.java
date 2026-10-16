package androidx.compose.animation.core;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import h.ab;
import h.c.k;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.h.a;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class Transition<S> {
    public static final int $stable = 0;
    private final SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> _animations;
    private final MutableLongState _playTimeNanos$delegate;
    private final SnapshotStateList<Transition<?>> _transitions;
    private final MutableState isSeeking$delegate;
    private final String label;
    private long lastSeekedTimeNanos;
    private final Transition<?> parentTransition;
    private final MutableState pendingTargetState$delegate;
    private final MutableState segment$delegate;
    private final MutableLongState startTimeNanos$delegate;
    private final MutableState targetState$delegate;
    private final State totalDurationNanos$delegate;
    private final TransitionState<S> transitionState;
    private final MutableState updateChildrenNeeded$delegate;

    /* compiled from: WazeSource */
    public interface Segment<S> {

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.animation.core.Transition$Segment$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static boolean $default$isTransitioningTo(Segment segment, Object obj, Object obj2) {
                return x.n(obj, segment.getInitialState()) && x.n(obj2, segment.getTargetState());
            }
        }

        /* compiled from: WazeSource */
        public final class DefaultImpls {
            @Deprecated
            public static <S> boolean isTransitioningTo(Segment<S> segment, S s, S s2) {
                return CC.$default$isTransitioningTo(segment, s, s2);
            }
        }

        S getInitialState();

        S getTargetState();

        boolean isTransitioningTo(S s, S s2);
    }

    /* compiled from: WazeSource */
    final class SegmentImpl<S> implements Segment<S> {
        private final S initialState;
        private final S targetState;

        public SegmentImpl(S s, S s2) {
            this.initialState = s;
            this.targetState = s2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Segment)) {
                return false;
            }
            Segment segment = (Segment) obj;
            return x.n(getInitialState(), segment.getInitialState()) && x.n(getTargetState(), segment.getTargetState());
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getInitialState() {
            return this.initialState;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getTargetState() {
            return this.targetState;
        }

        public int hashCode() {
            S initialState = getInitialState();
            int iHashCode = initialState != null ? initialState.hashCode() : 0;
            S targetState = getTargetState();
            return (iHashCode * 31) + (targetState != null ? targetState.hashCode() : 0);
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public /* synthetic */ boolean isTransitioningTo(Object obj, Object obj2) {
            return Segment.CC.$default$isTransitioningTo(this, obj, obj2);
        }
    }

    /* compiled from: WazeSource */
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        private final MutableState animation$delegate;
        private final MutableState animationSpec$delegate;
        private final SpringSpec<T> defaultSpring;
        private final MutableLongState durationNanos$delegate;
        private TargetBasedAnimation<T, V> initialValueAnimation;
        private SeekableTransitionState.SeekingAnimationState initialValueState;
        private final FiniteAnimationSpec<T> interruptionSpec;
        private final MutableState isFinished$delegate;
        private boolean isSeeking;
        private final String label;
        private final MutableFloatState resetSnapValue$delegate;
        private final MutableState targetValue$delegate;
        private final TwoWayConverter<T, V> typeConverter;
        private boolean useOnlyInitialValue;
        private final MutableState value$delegate;
        private V velocityVector;

        public TransitionAnimationState(T t, V v, TwoWayConverter<T, V> twoWayConverter, String str) {
            T tInvoke;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.targetValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            SpringSpec<T> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            this.defaultSpring = springSpecSpring$default;
            this.animationSpec$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(springSpecSpring$default, null, 2, null);
            this.animation$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TargetBasedAnimation(getAnimationSpec(), twoWayConverter, t, getTargetValue(), v), null, 2, null);
            this.isFinished$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
            this.resetSnapValue$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(-1.0f);
            this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            this.velocityVector = v;
            this.durationNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(getAnimation().getDurationNanos());
            Float f2 = VisibilityThresholdsKt.getVisibilityThresholdMap().get(twoWayConverter);
            if (f2 != null) {
                float fFloatValue = f2.floatValue();
                V vInvoke = twoWayConverter.getConvertToVector().invoke(t);
                int size$animation_core = vInvoke.getSize$animation_core();
                for (int i2 = 0; i2 < size$animation_core; i2++) {
                    vInvoke.set$animation_core(i2, fFloatValue);
                }
                tInvoke = this.typeConverter.getConvertFromVector().invoke(vInvoke);
            } else {
                tInvoke = null;
            }
            this.interruptionSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, tInvoke, 3, null);
        }

        private final T getTargetValue() {
            return this.targetValue$delegate.getValue();
        }

        private final void setAnimation(TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation$delegate.setValue(targetBasedAnimation);
        }

        private final void setAnimationSpec(FiniteAnimationSpec<T> finiteAnimationSpec) {
            this.animationSpec$delegate.setValue(finiteAnimationSpec);
        }

        private final void setTargetValue(T t) {
            this.targetValue$delegate.setValue(t);
        }

        private final void updateAnimation(T t, boolean z) {
            TargetBasedAnimation<T, V> targetBasedAnimation = this.initialValueAnimation;
            if (x.n(targetBasedAnimation != null ? targetBasedAnimation.getTargetValue() : null, getTargetValue())) {
                setAnimation(new TargetBasedAnimation<>(this.interruptionSpec, this.typeConverter, t, t, AnimationVectorsKt.newInstance(this.velocityVector)));
                this.useOnlyInitialValue = true;
                setDurationNanos$animation_core(getAnimation().getDurationNanos());
            } else {
                FiniteAnimationSpec<T> animationSpec = (!z || this.isSeeking || (getAnimationSpec() instanceof SpringSpec)) ? getAnimationSpec() : this.interruptionSpec;
                setAnimation(new TargetBasedAnimation<>(Transition.this.getPlayTimeNanos() <= 0 ? animationSpec : AnimationSpecKt.delayed(animationSpec, Transition.this.getPlayTimeNanos()), this.typeConverter, t, getTargetValue(), this.velocityVector));
                setDurationNanos$animation_core(getAnimation().getDurationNanos());
                this.useOnlyInitialValue = false;
                Transition.this.onChildAnimationUpdated();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void updateAnimation$default(TransitionAnimationState transitionAnimationState, Object obj, boolean z, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                obj = transitionAnimationState.getValue();
            }
            transitionAnimationState.updateAnimation(obj, z & ((i2 & 2) == 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void updateTargetValue$animation_core$default(TransitionAnimationState transitionAnimationState, Object obj, FiniteAnimationSpec finiteAnimationSpec, Object obj2, AnimationVector animationVector, int i2, Object obj3) {
            if ((i2 & 4) != 0) {
                obj2 = null;
            }
            if ((i2 & 8) != 0) {
                animationVector = null;
            }
            transitionAnimationState.updateTargetValue$animation_core(obj, finiteAnimationSpec, obj2, animationVector);
        }

        public final void clearInitialAnimation$animation_core() {
            this.initialValueAnimation = null;
            this.initialValueState = null;
            this.useOnlyInitialValue = false;
        }

        public final TargetBasedAnimation<T, V> getAnimation() {
            return (TargetBasedAnimation) this.animation$delegate.getValue();
        }

        public final FiniteAnimationSpec<T> getAnimationSpec() {
            return (FiniteAnimationSpec) this.animationSpec$delegate.getValue();
        }

        public final long getDurationNanos$animation_core() {
            return this.durationNanos$delegate.getLongValue();
        }

        public final SeekableTransitionState.SeekingAnimationState getInitialValueState$animation_core() {
            return this.initialValueState;
        }

        public final String getLabel() {
            return this.label;
        }

        public final float getResetSnapValue$animation_core() {
            return this.resetSnapValue$delegate.getFloatValue();
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value$delegate.getValue();
        }

        public final boolean isFinished$animation_core() {
            return ((Boolean) this.isFinished$delegate.getValue()).booleanValue();
        }

        public final void onPlayTimeChanged$animation_core(long j2, boolean z) {
            if (z) {
                j2 = getAnimation().getDurationNanos();
            }
            setValue$animation_core(getAnimation().getValueFromNanos(j2));
            this.velocityVector = (V) getAnimation().getVelocityVectorFromNanos(j2);
            if (getAnimation().isFinishedFromNanos(j2)) {
                setFinished$animation_core(true);
            }
        }

        public final void resetAnimation$animation_core() {
            setResetSnapValue$animation_core(-2.0f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void resetAnimationValue$animation_core(float f2) {
            if (f2 != -4.0f && f2 != -5.0f) {
                setResetSnapValue$animation_core(f2);
                return;
            }
            TargetBasedAnimation<T, V> targetBasedAnimation = this.initialValueAnimation;
            if (targetBasedAnimation != null) {
                getAnimation().setMutableInitialValue$animation_core(targetBasedAnimation.getTargetValue());
                this.initialValueState = null;
                this.initialValueAnimation = null;
            }
            Object initialValue = f2 == -4.0f ? getAnimation().getInitialValue() : getAnimation().getTargetValue();
            getAnimation().setMutableInitialValue$animation_core(initialValue);
            getAnimation().setMutableTargetValue$animation_core(initialValue);
            setValue$animation_core(initialValue);
            setDurationNanos$animation_core(getAnimation().getDurationNanos());
        }

        public final void seekTo$animation_core(long j2) {
            if (getResetSnapValue$animation_core() == -1.0f) {
                this.isSeeking = true;
                if (x.n(getAnimation().getTargetValue(), getAnimation().getInitialValue())) {
                    setValue$animation_core(getAnimation().getTargetValue());
                } else {
                    setValue$animation_core(getAnimation().getValueFromNanos(j2));
                    this.velocityVector = (V) getAnimation().getVelocityVectorFromNanos(j2);
                }
            }
        }

        public final void setDurationNanos$animation_core(long j2) {
            this.durationNanos$delegate.setLongValue(j2);
        }

        public final void setFinished$animation_core(boolean z) {
            this.isFinished$delegate.setValue(Boolean.valueOf(z));
        }

        public final void setInitialValueAnimation$animation_core(SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
            if (!x.n(getAnimation().getTargetValue(), getAnimation().getInitialValue())) {
                this.initialValueAnimation = getAnimation();
                this.initialValueState = seekingAnimationState;
            }
            setAnimation(new TargetBasedAnimation<>(this.interruptionSpec, this.typeConverter, getValue(), getValue(), AnimationVectorsKt.newInstance(this.velocityVector)));
            setDurationNanos$animation_core(getAnimation().getDurationNanos());
            this.useOnlyInitialValue = true;
        }

        public final void setInitialValueState$animation_core(SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
            this.initialValueState = seekingAnimationState;
        }

        public final void setResetSnapValue$animation_core(float f2) {
            this.resetSnapValue$delegate.setFloatValue(f2);
        }

        public void setValue$animation_core(T t) {
            this.value$delegate.setValue(t);
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + getTargetValue() + ", spec: " + getAnimationSpec();
        }

        public final void updateInitialAndTargetValue$animation_core(T t, T t2, FiniteAnimationSpec<T> finiteAnimationSpec) {
            setTargetValue(t2);
            setAnimationSpec(finiteAnimationSpec);
            if (x.n(getAnimation().getInitialValue(), t) && x.n(getAnimation().getTargetValue(), t2)) {
                return;
            }
            updateAnimation$default(this, t, false, 2, null);
        }

        public final void updateInitialValue$animation_core() {
            TargetBasedAnimation<T, V> targetBasedAnimation;
            SeekableTransitionState.SeekingAnimationState seekingAnimationState = this.initialValueState;
            if (seekingAnimationState == null || (targetBasedAnimation = this.initialValueAnimation) == null) {
                return;
            }
            long jC = a.c(seekingAnimationState.getDurationNanos() * seekingAnimationState.getValue());
            T valueFromNanos = targetBasedAnimation.getValueFromNanos(jC);
            if (this.useOnlyInitialValue) {
                getAnimation().setMutableTargetValue$animation_core(valueFromNanos);
            }
            getAnimation().setMutableInitialValue$animation_core(valueFromNanos);
            setDurationNanos$animation_core(getAnimation().getDurationNanos());
            if (getResetSnapValue$animation_core() == -2.0f || this.useOnlyInitialValue) {
                setValue$animation_core(valueFromNanos);
            } else {
                seekTo$animation_core(Transition.this.getPlayTimeNanos());
            }
            if (jC < seekingAnimationState.getDurationNanos()) {
                seekingAnimationState.setComplete(false);
            } else {
                this.initialValueState = null;
                this.initialValueAnimation = null;
            }
        }

        public final void updateTargetValue$animation_core(T t, FiniteAnimationSpec<T> finiteAnimationSpec, T t2, V v) {
            if (this.useOnlyInitialValue) {
                TargetBasedAnimation<T, V> targetBasedAnimation = this.initialValueAnimation;
                if (x.n(t, targetBasedAnimation != null ? targetBasedAnimation.getTargetValue() : null)) {
                    return;
                }
            }
            if (x.n(getTargetValue(), t) && getResetSnapValue$animation_core() == -1.0f && (t2 == null || x.n(t2, getAnimation().getInitialValue()))) {
                return;
            }
            setTargetValue(t);
            setAnimationSpec(finiteAnimationSpec);
            T value = t2 == null ? getResetSnapValue$animation_core() == -3.0f ? t : getValue() : t2;
            if (t2 != null) {
                setValue$animation_core(value);
                if (v != null) {
                    this.velocityVector = v;
                }
            }
            updateAnimation(value, !isFinished$animation_core());
            setFinished$animation_core(getResetSnapValue$animation_core() == -3.0f);
            if (getResetSnapValue$animation_core() >= 0.0f) {
                setValue$animation_core(getAnimation().getValueFromNanos((long) (getAnimation().getDurationNanos() * getResetSnapValue$animation_core())));
            } else if (getResetSnapValue$animation_core() == -3.0f) {
                setValue$animation_core(t);
            }
            this.useOnlyInitialValue = false;
            setResetSnapValue$animation_core(-1.0f);
        }
    }

    public Transition(TransitionState<S> transitionState, Transition<?> transition, String str) {
        this.transitionState = transitionState;
        this.parentTransition = transition;
        this.label = str;
        this.targetState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getCurrentState(), null, 2, null);
        this.pendingTargetState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.segment$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SegmentImpl(getCurrentState(), getCurrentState()), null, 2, null);
        this._playTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(0L);
        this.startTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(Long.MIN_VALUE);
        this.updateChildrenNeeded$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this._animations = SnapshotStateKt.mutableStateListOf();
        this._transitions = SnapshotStateKt.mutableStateListOf();
        this.isSeeking$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.totalDurationNanos$delegate = SnapshotStateKt.derivedStateOf(new h.g.a.a() { // from class: androidx.compose.animation.core.Transition$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return Long.valueOf(this.f$0.calculateTotalDurationNanos());
            }
        });
        transitionState.transitionConfigured$animation_core(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean animateTo$lambda$0$0(Transition transition) {
        return !x.n(transition.getTargetState(), transition.getCurrentState()) || transition.isRunning() || transition.getUpdateChildrenNeeded();
    }

    private static final boolean animateTo$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult animateTo$lambda$2$0(af afVar, Transition transition, DisposableEffectScope disposableEffectScope) {
        aj.z(afVar, null, ag.f51345d, new Transition$animateTo$1$1$1(transition, null), 1);
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.Transition$animateTo$lambda$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }

    static final ab animateTo$lambda$3(Transition transition, Object obj, int i2, Composer composer, int i3) {
        transition.animateTo$animation_core(obj, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long calculateTotalDurationNanos() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, snapshotStateList.get(i2).getDurationNanos$animation_core());
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            jMax = Math.max(jMax, snapshotStateList2.get(i3).calculateTotalDurationNanos());
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getUpdateChildrenNeeded() {
        return ((Boolean) this.updateChildrenNeeded$delegate.getValue()).booleanValue();
    }

    private final long get_playTimeNanos() {
        return this._playTimeNanos$delegate.getLongValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChildAnimationUpdated() {
        setUpdateChildrenNeeded(true);
        if (isSeeking()) {
            SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
            int size = snapshotStateList.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState = snapshotStateList.get(i2);
                jMax = Math.max(jMax, transitionAnimationState.getDurationNanos$animation_core());
                transitionAnimationState.seekTo$animation_core(this.lastSeekedTimeNanos);
            }
            setUpdateChildrenNeeded(false);
        }
    }

    private final void setPendingTargetState(S s) {
        this.pendingTargetState$delegate.setValue(s);
    }

    private final void setSegment(Segment<S> segment) {
        this.segment$delegate.setValue(segment);
    }

    private final void setUpdateChildrenNeeded(boolean z) {
        this.updateChildrenNeeded$delegate.setValue(Boolean.valueOf(z));
    }

    private final void set_playTimeNanos(long j2) {
        this._playTimeNanos$delegate.setLongValue(j2);
    }

    public final boolean addAnimation$animation_core(Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState) {
        return this._animations.add(transitionAnimationState);
    }

    public final boolean addTransition$animation_core(Transition<?> transition) {
        return this._transitions.add(transition);
    }

    public final void animateTo$animation_core(final S s, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1493585151);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(s) : composerStartRestartGroup.changedInstance(s)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(this) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1493585151, i3, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1342)");
            }
            if (isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(467722849);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(466062241);
                updateTarget$animation_core(s);
                int i5 = i3 & 112;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i5 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new h.g.a.a() { // from class: androidx.compose.animation.core.Transition$$ExternalSyntheticLambda0
                        @Override // h.g.a.a
                        public final Object invoke() {
                            return Boolean.valueOf(Transition.animateTo$lambda$0$0(this.f$0));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                if (animateTo$lambda$1((State) objRememberedValue)) {
                    composerStartRestartGroup.startReplaceGroup(466470356);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(k.f48060a, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final af afVar = (af) objRememberedValue2;
                    boolean zChangedInstance = (i5 == 32) | composerStartRestartGroup.changedInstance(afVar);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new l() { // from class: androidx.compose.animation.core.Transition$$ExternalSyntheticLambda1
                            @Override // h.g.a.l
                            public final Object invoke(Object obj) {
                                return Transition.animateTo$lambda$2$0(afVar, this, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    EffectsKt.DisposableEffect(afVar, this, (l) objRememberedValue3, composerStartRestartGroup, i5);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(467712929);
                    composerStartRestartGroup.endReplaceGroup();
                }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.animation.core.Transition$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return Transition.animateTo$lambda$3(this.f$0, s, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void clearInitialAnimations$animation_core() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            snapshotStateList.get(i2).clearInitialAnimation$animation_core();
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            snapshotStateList2.get(i3).clearInitialAnimations$animation_core();
        }
    }

    public final List<Transition<S>.TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations;
    }

    public final S getCurrentState() {
        return this.transitionState.getCurrentState();
    }

    public final boolean getHasInitialValueAnimations() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (snapshotStateList.get(i2).getInitialValueState$animation_core() != null) {
                return true;
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (snapshotStateList2.get(i3).getHasInitialValueAnimations()) {
                return true;
            }
        }
        return false;
    }

    public final String getLabel() {
        return this.label;
    }

    public final long getLastSeekedTimeNanos$animation_core() {
        return this.lastSeekedTimeNanos;
    }

    public final Transition<?> getParentTransition() {
        return this.parentTransition;
    }

    public final S getPendingTargetState() {
        return (S) this.pendingTargetState$delegate.getValue();
    }

    public final long getPlayTimeNanos() {
        Transition<?> transition = this.parentTransition;
        return transition != null ? transition.getPlayTimeNanos() : get_playTimeNanos();
    }

    public final Segment<S> getSegment() {
        return (Segment) this.segment$delegate.getValue();
    }

    public final long getStartTimeNanos$animation_core() {
        return this.startTimeNanos$delegate.getLongValue();
    }

    public final S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final long getTotalDurationNanos() {
        return ((Number) this.totalDurationNanos$delegate.getValue()).longValue();
    }

    public final List<Transition<?>> getTransitions() {
        return this._transitions;
    }

    public final boolean isRunning() {
        return getStartTimeNanos$animation_core() != Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSeeking() {
        return ((Boolean) this.isSeeking$delegate.getValue()).booleanValue();
    }

    public final void onDisposed$animation_core() {
        onTransitionEnd$animation_core();
        this.transitionState.transitionRemoved$animation_core();
    }

    public final void onFrame$animation_core(long j2, boolean z) {
        boolean zN = true;
        if (getStartTimeNanos$animation_core() == Long.MIN_VALUE) {
            onTransitionStart$animation_core(j2);
        } else if (!this.transitionState.isRunning$animation_core()) {
            this.transitionState.setRunning$animation_core(true);
        }
        setUpdateChildrenNeeded(false);
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState = snapshotStateList.get(i2);
            if (!transitionAnimationState.isFinished$animation_core()) {
                transitionAnimationState.onPlayTimeChanged$animation_core(j2, z);
            }
            zN &= transitionAnimationState.isFinished$animation_core();
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Transition<?> transition = snapshotStateList2.get(i3);
            if (!x.n(transition.getTargetState(), transition.getCurrentState())) {
                transition.onFrame$animation_core(j2, z);
            }
            zN &= x.n(transition.getTargetState(), transition.getCurrentState());
        }
        if (zN) {
            onTransitionEnd$animation_core();
        }
    }

    public final void onTransitionEnd$animation_core() {
        setStartTimeNanos$animation_core(Long.MIN_VALUE);
        TransitionState<S> transitionState = this.transitionState;
        if ((transitionState instanceof MutableTransitionState) || (transitionState instanceof DeferredTransitionState)) {
            transitionState.setCurrentState$animation_core(getTargetState());
        }
        setPlayTimeNanos(0L);
        this.transitionState.setRunning$animation_core(false);
        SnapshotStateList<Transition<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            snapshotStateList.get(i2).onTransitionEnd$animation_core();
        }
    }

    public final void onTransitionStart$animation_core(long j2) {
        setStartTimeNanos$animation_core(j2);
        this.transitionState.setRunning$animation_core(true);
    }

    public final void removeAnimation$animation_core(Transition<S>.DeferredAnimation<?, ?> deferredAnimation) {
        Transition<S>.TransitionAnimationState<?, ?> animation;
        Transition<S>.DeferredAnimationData<?, ?>.DeferredAnimationData<?, V> data$animation_core = deferredAnimation.getData$animation_core();
        if (data$animation_core == 0 || (animation = data$animation_core.getAnimation()) == null) {
            return;
        }
        removeAnimation$animation_core(animation);
    }

    public final boolean removeTransition$animation_core(Transition<?> transition) {
        return this._transitions.remove(transition);
    }

    public final void resetAnimationFraction$animation_core(float f2) {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            snapshotStateList.get(i2).resetAnimationValue$animation_core(f2);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            snapshotStateList2.get(i3).resetAnimationFraction$animation_core(f2);
        }
    }

    public final void seek(S s, S s2, long j2) {
        setStartTimeNanos$animation_core(Long.MIN_VALUE);
        this.transitionState.setRunning$animation_core(false);
        if (!isSeeking() || !x.n(getCurrentState(), s) || !x.n(getTargetState(), s2)) {
            if (!x.n(getCurrentState(), s)) {
                TransitionState<S> transitionState = this.transitionState;
                if ((transitionState instanceof MutableTransitionState) || (transitionState instanceof DeferredTransitionState)) {
                    transitionState.setCurrentState$animation_core(s);
                }
            }
            setTargetState$animation_core(s2);
            setSeeking$animation_core(true);
            setSegment(new SegmentImpl(s, s2));
        }
        SnapshotStateList<Transition<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Transition<?> transition = snapshotStateList.get(i2);
            x.d(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.isSeeking()) {
                transition.seek(transition.getCurrentState(), transition.getTargetState(), j2);
            }
        }
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList2 = this._animations;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            snapshotStateList2.get(i3).seekTo$animation_core(j2);
        }
        this.lastSeekedTimeNanos = j2;
    }

    public final void seekAnimations$animation_core(long j2) {
        if (getStartTimeNanos$animation_core() == Long.MIN_VALUE) {
            setStartTimeNanos$animation_core(j2);
        }
        setPlayTimeNanos(j2);
        setUpdateChildrenNeeded(false);
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            snapshotStateList.get(i2).seekTo$animation_core(j2);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Transition<?> transition = snapshotStateList2.get(i3);
            if (!x.n(transition.getTargetState(), transition.getCurrentState())) {
                transition.seekAnimations$animation_core(j2);
            }
        }
    }

    public final void setInitialAnimations$animation_core(SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            snapshotStateList.get(i2).setInitialValueAnimation$animation_core(seekingAnimationState);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            snapshotStateList2.get(i3).setInitialAnimations$animation_core(seekingAnimationState);
        }
    }

    public final void setLastSeekedTimeNanos$animation_core(long j2) {
        this.lastSeekedTimeNanos = j2;
    }

    public final void setPlayTimeNanos(long j2) {
        if (this.parentTransition == null) {
            set_playTimeNanos(j2);
        }
    }

    public final void setSeeking$animation_core(boolean z) {
        this.isSeeking$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setStartTimeNanos$animation_core(long j2) {
        this.startTimeNanos$delegate.setLongValue(j2);
    }

    public final void setTargetState$animation_core(S s) {
        this.targetState$delegate.setValue(s);
    }

    public String toString() {
        List<Transition<S>.TransitionAnimationState<?, ?>> animations = getAnimations();
        int size = animations.size();
        String str = "Transition animation values: ";
        for (int i2 = 0; i2 < size; i2++) {
            str = str + animations.get(i2) + ", ";
        }
        return str;
    }

    public final void updateInitialValues$animation_core() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            snapshotStateList.get(i2).updateInitialValue$animation_core();
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            snapshotStateList2.get(i3).updateInitialValues$animation_core();
        }
    }

    public final void updatePendingTarget(S s) {
        setPendingTargetState(s);
    }

    public final void updateTarget$animation_core(S s) {
        if (x.n(getTargetState(), s)) {
            return;
        }
        setSegment(new SegmentImpl(getTargetState(), s));
        if (!x.n(getCurrentState(), getTargetState())) {
            this.transitionState.setCurrentState$animation_core(getTargetState());
        }
        setTargetState$animation_core(s);
        if (!isRunning()) {
            setUpdateChildrenNeeded(true);
        }
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            snapshotStateList.get(i2).resetAnimation$animation_core();
        }
    }

    public static /* synthetic */ void getHasInitialValueAnimations$annotations() {
    }

    public final void removeAnimation$animation_core(Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState) {
        this._animations.remove(transitionAnimationState);
    }

    /* compiled from: WazeSource */
    public final class DeferredAnimation<T, V extends AnimationVector> {
        private final MutableState data$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        private final String label;
        private final TwoWayConverter<T, V> typeConverter;

        /* compiled from: WazeSource */
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {
            private final Transition<S>.TransitionAnimationState<T, V> animation;
            private l<? super S, ? extends T> targetValueByState;
            private l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec;

            public DeferredAnimationData(Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> lVar, l<? super S, ? extends T> lVar2) {
                this.animation = transitionAnimationState;
                this.transitionSpec = lVar;
                this.targetValueByState = lVar2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ void updateAnimationStates$default(DeferredAnimationData deferredAnimationData, Segment segment, Object obj, AnimationVector animationVector, int i2, Object obj2) {
                if ((i2 & 2) != 0) {
                    obj = null;
                }
                if ((i2 & 4) != 0) {
                    animationVector = null;
                }
                deferredAnimationData.updateAnimationStates(segment, obj, animationVector);
            }

            public final Transition<S>.TransitionAnimationState<T, V> getAnimation() {
                return this.animation;
            }

            public final l<S, T> getTargetValueByState() {
                return this.targetValueByState;
            }

            public final l<Segment<S>, FiniteAnimationSpec<T>> getTransitionSpec() {
                return this.transitionSpec;
            }

            @Override // androidx.compose.runtime.State
            public T getValue() {
                updateAnimationStates$default(this, Transition.this.getSegment(), null, null, 6, null);
                return this.animation.getValue();
            }

            public final void setTargetValueByState(l<? super S, ? extends T> lVar) {
                this.targetValueByState = lVar;
            }

            public final void setTransitionSpec(l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> lVar) {
                this.transitionSpec = lVar;
            }

            public final void updateAnimationStates(Segment<S> segment, T t, V v) {
                T tInvoke = this.targetValueByState.invoke(segment.getTargetState());
                if (!Transition.this.isSeeking()) {
                    this.animation.updateTargetValue$animation_core(tInvoke, this.transitionSpec.invoke(segment), t, v);
                } else {
                    this.animation.updateInitialAndTargetValue$animation_core(this.targetValueByState.invoke(segment.getInitialState()), tInvoke, this.transitionSpec.invoke(segment));
                }
            }
        }

        public DeferredAnimation(TwoWayConverter<T, V> twoWayConverter, String str) {
            this.typeConverter = twoWayConverter;
            this.label = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State animate$default(DeferredAnimation deferredAnimation, l lVar, Object obj, AnimationVector animationVector, l lVar2, int i2, Object obj2) {
            if ((i2 & 2) != 0) {
                obj = null;
            }
            if ((i2 & 4) != 0) {
                animationVector = null;
            }
            return deferredAnimation.animate(lVar, obj, animationVector, lVar2);
        }

        public final State<T> animate(l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> lVar, T t, V v, l<? super S, ? extends T> lVar2) {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core = getData$animation_core();
            if (data$animation_core == null) {
                Transition<S> transition = Transition.this;
                data$animation_core = new DeferredAnimationData<>(transition.new TransitionAnimationState(lVar2.invoke(transition.getCurrentState()), AnimationStateKt.createZeroVectorFrom(this.typeConverter, lVar2.invoke(Transition.this.getCurrentState())), this.typeConverter, this.label), lVar, lVar2);
                Transition<S> transition2 = Transition.this;
                setData$animation_core(data$animation_core);
                transition2.addAnimation$animation_core(data$animation_core.getAnimation());
            }
            Transition<S> transition3 = Transition.this;
            data$animation_core.setTargetValueByState(lVar2);
            data$animation_core.setTransitionSpec(lVar);
            data$animation_core.updateAnimationStates(transition3.getSegment(), t, v);
            return data$animation_core;
        }

        public final Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> getData$animation_core() {
            return (DeferredAnimationData) this.data$delegate.getValue();
        }

        public final String getLabel() {
            return this.label;
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final void setData$animation_core(Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData) {
            this.data$delegate.setValue(deferredAnimationData);
        }

        public final void setupSeeking$animation_core() {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core = getData$animation_core();
            if (data$animation_core != null) {
                Transition<S> transition = Transition.this;
                data$animation_core.getAnimation().updateInitialAndTargetValue$animation_core(data$animation_core.getTargetValueByState().invoke(transition.getSegment().getInitialState()), data$animation_core.getTargetValueByState().invoke(transition.getSegment().getTargetState()), data$animation_core.getTransitionSpec().invoke(transition.getSegment()));
            }
        }

        public final State<T> animate(l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> lVar, l<? super S, ? extends T> lVar2) {
            return animate(lVar, null, null, lVar2);
        }
    }

    public /* synthetic */ Transition(MutableTransitionState mutableTransitionState, String str, int i2, o oVar) {
        this(mutableTransitionState, (i2 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Transition(MutableTransitionState<S> mutableTransitionState, String str) {
        this(mutableTransitionState, null, str);
        x.d(mutableTransitionState, "null cannot be cast to non-null type androidx.compose.animation.core.TransitionState<S of androidx.compose.animation.core.Transition>");
    }

    public /* synthetic */ Transition(TransitionState transitionState, Transition transition, String str, int i2, o oVar) {
        this(transitionState, transition, (i2 & 4) != 0 ? null : str);
    }

    public Transition(TransitionState<S> transitionState, String str) {
        this(transitionState, null, str);
    }

    public /* synthetic */ Transition(TransitionState transitionState, String str, int i2, o oVar) {
        this(transitionState, (i2 & 2) != 0 ? null : str);
    }

    public Transition(S s, String str) {
        this(new MutableTransitionState(s), null, str);
    }

    public final void onFrame$animation_core(long j2, float f2) {
        if (getStartTimeNanos$animation_core() == Long.MIN_VALUE) {
            onTransitionStart$animation_core(j2);
        }
        long startTimeNanos$animation_core = j2 - getStartTimeNanos$animation_core();
        boolean z = f2 != 0.0f;
        if (f2 != 0.0f) {
            startTimeNanos$animation_core = a.c(startTimeNanos$animation_core / f2);
        }
        setPlayTimeNanos(startTimeNanos$animation_core);
        onFrame$animation_core(startTimeNanos$animation_core, !z);
    }
}
