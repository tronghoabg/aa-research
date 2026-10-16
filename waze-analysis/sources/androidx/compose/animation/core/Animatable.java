package androidx.compose.animation.core;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.b.am;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import java.util.concurrent.CancellationException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Animatable<T, V extends AnimationVector> {
    public static final int $stable = 8;
    private final SpringSpec<T> defaultSpringSpec;
    private final AnimationState<T, V> internalState;
    private final MutableState isRunning$delegate;
    private final String label;
    private T lowerBound;
    private V lowerBoundVector;
    private final MutatorMutex mutatorMutex;
    private final V negativeInfinityBounds;
    private final V positiveInfinityBounds;
    private final MutableState targetValue$delegate;
    private final TwoWayConverter<T, V> typeConverter;
    private T upperBound;
    private V upperBoundVector;
    private final T visibilityThreshold;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.core.Animatable$runAnimation$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements l<e<? super AnimationResult<T, V>>, Object> {
        final /* synthetic */ Animation<T, V> $animation;
        final /* synthetic */ l<Animatable<T, V>, ab> $block;
        final /* synthetic */ T $initialVelocity;
        final /* synthetic */ long $startTime;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Animatable<T, V> animatable, T t, Animation<T, V> animation, long j2, l<? super Animatable<T, V>, ab> lVar, e<? super AnonymousClass2> eVar) {
            super(1, eVar);
            this.this$0 = animatable;
            this.$initialVelocity = t;
            this.$animation = animation;
            this.$startTime = j2;
            this.$block = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        static final ab invokeSuspend$lambda$0(Animatable animatable, AnimationState animationState, l lVar, am amVar, AnimationScope animationScope) {
            SuspendAnimationKt.updateState(animationScope, animatable.getInternalState$animation_core());
            Object objClampToBounds = animatable.clampToBounds(animationScope.getValue());
            if (!x.n(objClampToBounds, animationScope.getValue())) {
                animatable.getInternalState$animation_core().setValue$animation_core(objClampToBounds);
                animationState.setValue$animation_core(objClampToBounds);
                if (lVar != null) {
                    lVar.invoke(animatable);
                }
                animationScope.cancelAnimation();
                amVar.f48101a = true;
            } else if (lVar != null) {
                lVar.invoke(animatable);
            }
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super AnimationResult<T, V>> eVar) {
            return ((AnonymousClass2) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            am amVar;
            AnimationState animationState;
            a aVar = a.f48038a;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    c.b(obj);
                    this.this$0.getInternalState$animation_core().setVelocityVector$animation_core(this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
                    this.this$0.setTargetValue(this.$animation.getTargetValue());
                    this.this$0.setRunning(true);
                    final AnimationState animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) this.this$0.getInternalState$animation_core(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                    final am amVar2 = new am();
                    Animation<T, V> animation = this.$animation;
                    long j2 = this.$startTime;
                    final Animatable<T, V> animatable = this.this$0;
                    final l<Animatable<T, V>, ab> lVar = this.$block;
                    this.L$0 = animationStateCopy$default;
                    this.L$1 = amVar2;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(animationStateCopy$default, animation, j2, new l() { // from class: androidx.compose.animation.core.Animatable$runAnimation$2$$ExternalSyntheticLambda0
                        @Override // h.g.a.l
                        public final Object invoke(Object obj2) {
                            return Animatable.AnonymousClass2.invokeSuspend$lambda$0(animatable, animationStateCopy$default, lVar, amVar2, (AnimationScope) obj2);
                        }
                    }, this) == aVar) {
                        return aVar;
                    }
                    amVar = amVar2;
                    animationState = animationStateCopy$default;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    amVar = (am) this.L$1;
                    animationState = (AnimationState) this.L$0;
                    c.b(obj);
                }
                AnimationEndReason animationEndReason = amVar.f48101a ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
                this.this$0.endAnimation();
                return new AnimationResult(animationState, animationEndReason);
            } catch (CancellationException e2) {
                this.this$0.endAnimation();
                throw e2;
            }
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.core.Animatable$snapTo$2, reason: invalid class name and case insensitive filesystem */
    final class C02052 extends g implements l<e<? super ab>, Object> {
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02052(Animatable<T, V> animatable, T t, e<? super C02052> eVar) {
            super(1, eVar);
            this.this$0 = animatable;
            this.$targetValue = t;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new C02052(this.this$0, this.$targetValue, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super ab> eVar) {
            return ((C02052) create(eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            this.this$0.endAnimation();
            Animatable<T, V> animatable = this.this$0;
            Object objClampToBounds = animatable.clampToBounds(this.$targetValue);
            animatable.getInternalState$animation_core().setValue$animation_core(objClampToBounds);
            this.this$0.setTargetValue(objClampToBounds);
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.core.Animatable$stop$2, reason: invalid class name and case insensitive filesystem */
    final class C02062 extends g implements l<e<? super ab>, Object> {
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02062(Animatable<T, V> animatable, e<? super C02062> eVar) {
            super(1, eVar);
            this.this$0 = animatable;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new C02062(this.this$0, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(e<? super ab> eVar) {
            return ((C02062) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            this.this$0.endAnimation();
            return ab.f48028a;
        }
    }

    public Animatable(T t, TwoWayConverter<T, V> twoWayConverter, T t2, String str) {
        this.typeConverter = twoWayConverter;
        this.visibilityThreshold = t2;
        this.label = str;
        this.internalState = new AnimationState<>(twoWayConverter, t, null, 0L, 0L, false, 60, null);
        this.isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.targetValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec<>(0.0f, 0.0f, t2, 3, null);
        AnimationVector velocityVector = getVelocityVector();
        AnimationVector4D animationVector4D = velocityVector instanceof AnimationVector1D ? AnimatableKt.negativeInfinityBounds1D : velocityVector instanceof AnimationVector2D ? AnimatableKt.negativeInfinityBounds2D : velocityVector instanceof AnimationVector3D ? AnimatableKt.negativeInfinityBounds3D : AnimatableKt.negativeInfinityBounds4D;
        x.d(animationVector4D, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.negativeInfinityBounds = animationVector4D;
        AnimationVector velocityVector2 = getVelocityVector();
        AnimationVector4D animationVector4D2 = velocityVector2 instanceof AnimationVector1D ? AnimatableKt.positiveInfinityBounds1D : velocityVector2 instanceof AnimationVector2D ? AnimatableKt.positiveInfinityBounds2D : velocityVector2 instanceof AnimationVector3D ? AnimatableKt.positiveInfinityBounds3D : AnimatableKt.positiveInfinityBounds4D;
        x.d(animationVector4D2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.positiveInfinityBounds = animationVector4D2;
        this.lowerBoundVector = animationVector4D;
        this.upperBoundVector = animationVector4D2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateDecay$default(Animatable animatable, Object obj, DecayAnimationSpec decayAnimationSpec, l lVar, e eVar, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, lVar, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, l lVar, e eVar, int i2, Object obj3) {
        if ((i2 & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        T velocity = obj2;
        if ((i2 & 4) != 0) {
            velocity = animatable.getVelocity();
        }
        T t = velocity;
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        return animatable.animateTo(obj, animationSpec2, t, lVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T clampToBounds(T t) {
        if (!x.n(this.lowerBoundVector, this.negativeInfinityBounds) || !x.n(this.upperBoundVector, this.positiveInfinityBounds)) {
            V vInvoke = this.typeConverter.getConvertToVector().invoke(t);
            int size$animation_core = vInvoke.getSize$animation_core();
            boolean z = false;
            for (int i2 = 0; i2 < size$animation_core; i2++) {
                if (vInvoke.get$animation_core(i2) < this.lowerBoundVector.get$animation_core(i2) || vInvoke.get$animation_core(i2) > this.upperBoundVector.get$animation_core(i2)) {
                    vInvoke.set$animation_core(i2, n.g(vInvoke.get$animation_core(i2), this.lowerBoundVector.get$animation_core(i2), this.upperBoundVector.get$animation_core(i2)));
                    z = true;
                }
            }
            if (z) {
                return this.typeConverter.getConvertFromVector().invoke(vInvoke);
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAnimation() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core();
        animationState.setLastFrameTimeNanos$animation_core(Long.MIN_VALUE);
        setRunning(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(Animation<T, V> animation, T t, l<? super Animatable<T, V>, ab> lVar, e<? super AnimationResult<T, V>> eVar) {
        return MutatorMutex.mutate$default(this.mutatorMutex, null, new AnonymousClass2(this, t, animation, this.internalState.getLastFrameTimeNanos(), lVar, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRunning(boolean z) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetValue(T t) {
        this.targetValue$delegate.setValue(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(Animatable animatable, Object obj, Object obj2, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = animatable.lowerBound;
        }
        if ((i2 & 2) != 0) {
            obj2 = animatable.upperBound;
        }
        animatable.updateBounds(obj, obj2);
    }

    public final Object animateDecay(T t, DecayAnimationSpec<T> decayAnimationSpec, l<? super Animatable<T, V>, ab> lVar, e<? super AnimationResult<T, V>> eVar) {
        TwoWayConverter<T, V> twoWayConverter = this.typeConverter;
        return runAnimation(new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter) this.typeConverter, (Object) getValue(), (AnimationVector) twoWayConverter.getConvertToVector().invoke(t)), t, lVar, eVar);
    }

    public final Object animateTo(T t, AnimationSpec<T> animationSpec, T t2, l<? super Animatable<T, V>, ab> lVar, e<? super AnimationResult<T, V>> eVar) {
        return runAnimation(AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t, t2), t2, lVar, eVar);
    }

    public final State<T> asState() {
        return this.internalState;
    }

    public final SpringSpec<T> getDefaultSpringSpec$animation_core() {
        return this.defaultSpringSpec;
    }

    public final AnimationState<T, V> getInternalState$animation_core() {
        return this.internalState;
    }

    public final String getLabel() {
        return this.label;
    }

    public final T getLowerBound() {
        return this.lowerBound;
    }

    public final T getTargetValue() {
        return this.targetValue$delegate.getValue();
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getUpperBound() {
        return this.upperBound;
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final T getVelocity() {
        return (T) this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    public final V getVelocityVector() {
        return (V) this.internalState.getVelocityVector();
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final Object snapTo(T t, e<? super ab> eVar) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C02052(this, t, null), eVar, 1, null);
        return objMutate$default == a.f48038a ? objMutate$default : ab.f48028a;
    }

    public final Object stop(e<? super ab> eVar) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C02062(this, null), eVar, 1, null);
        return objMutate$default == a.f48038a ? objMutate$default : ab.f48028a;
    }

    public final void updateBounds(T t, T t2) {
        V vInvoke;
        V vInvoke2;
        if (t == null || (vInvoke = this.typeConverter.getConvertToVector().invoke(t)) == null) {
            vInvoke = this.negativeInfinityBounds;
        }
        if (t2 == null || (vInvoke2 = this.typeConverter.getConvertToVector().invoke(t2)) == null) {
            vInvoke2 = this.positiveInfinityBounds;
        }
        int size$animation_core = vInvoke.getSize$animation_core();
        for (int i2 = 0; i2 < size$animation_core; i2++) {
            if (vInvoke.get$animation_core(i2) > vInvoke2.get$animation_core(i2)) {
                PreconditionsKt.throwIllegalStateException("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + vInvoke + " is greater than upper bound " + vInvoke2 + " on index " + i2);
            }
        }
        this.lowerBoundVector = vInvoke;
        this.upperBoundVector = vInvoke2;
        this.upperBound = t2;
        this.lowerBound = t;
        if (isRunning()) {
            return;
        }
        T tClampToBounds = clampToBounds(getValue());
        if (x.n(tClampToBounds, getValue())) {
            return;
        }
        this.internalState.setValue$animation_core(tClampToBounds);
    }

    private static /* synthetic */ void getNegativeInfinityBounds$annotations() {
    }

    private static /* synthetic */ void getPositiveInfinityBounds$annotations() {
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i2, o oVar) {
        this(obj, twoWayConverter, (i2 & 4) != 0 ? null : obj2);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2) {
        this(obj, twoWayConverter, obj2, "Animatable");
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i2, o oVar) {
        this(obj, twoWayConverter, (i2 & 4) != 0 ? null : obj2, (i2 & 8) != 0 ? "Animatable" : str);
    }
}
