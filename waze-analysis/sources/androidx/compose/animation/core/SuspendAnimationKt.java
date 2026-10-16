package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.c.j;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.aq;
import h.g.b.q;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SuspendAnimationKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$4, reason: invalid class name */
    final class AnonymousClass4<T, V extends AnimationVector> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass4(e<? super AnonymousClass4> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SuspendAnimationKt.animate(null, null, 0L, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animate(final androidx.compose.animation.core.AnimationState<T, V> r23, final androidx.compose.animation.core.Animation<T, V> r24, long r25, final h.g.a.l<? super androidx.compose.animation.core.AnimationScope<T, V>, h.ab> r27, h.c.e<? super h.ab> r28) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.animate(androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.Animation, long, h.g.a.l, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ Object animate$default(TwoWayConverter twoWayConverter, Object obj, Object obj2, Object obj3, AnimationSpec animationSpec, p pVar, e eVar, int i2, Object obj4) {
        if ((i2 & 16) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(twoWayConverter, obj, obj2, (i2 & 8) != 0 ? null : obj3, animationSpec, pVar, eVar);
    }

    static final ab animate$lambda$1(p pVar, TwoWayConverter twoWayConverter, AnimationScope animationScope) {
        pVar.invoke(animationScope.getValue(), twoWayConverter.getConvertFromVector().invoke(animationScope.getVelocityVector()));
        return ab.f48028a;
    }

    static final ab animate$lambda$3(aq aqVar, Object obj, Animation animation, AnimationVector animationVector, final AnimationState animationState, float f2, l lVar, long j2) {
        AnimationScope animationScope = new AnimationScope(obj, animation.getTypeConverter(), animationVector, j2, animation.getTargetValue(), j2, true, new a() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return SuspendAnimationKt.animate$lambda$3$0(animationState);
            }
        });
        doAnimationFrameWithScale(animationScope, j2, f2, animation, animationState, lVar);
        aqVar.f48105a = animationScope;
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab animate$lambda$3$0(AnimationState animationState) {
        animationState.setRunning$animation_core(false);
        return ab.f48028a;
    }

    static final ab animate$lambda$4(AnimationState animationState) {
        animationState.setRunning$animation_core(false);
        return ab.f48028a;
    }

    static final ab animate$lambda$6(aq aqVar, float f2, Animation animation, AnimationState animationState, l lVar, long j2) {
        Object obj = aqVar.f48105a;
        if (obj == null) {
            x.g();
        }
        doAnimationFrameWithScale((AnimationScope) obj, j2, f2, animation, animationState, lVar);
        return ab.f48028a;
    }

    public static final Object animateDecay(float f2, float f3, FloatDecayAnimationSpec floatDecayAnimationSpec, final p<? super Float, ? super Float, ab> pVar, e<? super ab> eVar) {
        Object objAnimate$default = animate$default(AnimationStateKt.AnimationState$default(f2, f3, 0L, 0L, false, 28, null), AnimationKt.DecayAnimation(floatDecayAnimationSpec, f2, f3), 0L, new l() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda6
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SuspendAnimationKt.animateDecay$lambda$0(pVar, (AnimationScope) obj);
            }
        }, eVar, 2, null);
        return objAnimate$default == h.c.a.a.f48038a ? objAnimate$default : ab.f48028a;
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z, l lVar, e eVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            lVar = new l() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda3
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return ab.f48028a;
                }
            };
        }
        return animateDecay(animationState, decayAnimationSpec, z & ((i2 & 2) == 0), lVar, (e<? super ab>) eVar);
    }

    static final ab animateDecay$lambda$0(p pVar, AnimationScope animationScope) {
        pVar.invoke(animationScope.getValue(), Float.valueOf(((AnimationVector1D) animationScope.getVelocityVector()).getValue()));
        return ab.f48028a;
    }

    public static final <T, V extends AnimationVector> Object animateTo(AnimationState<T, V> animationState, T t, AnimationSpec<T> animationSpec, boolean z, l<? super AnimationScope<T, V>, ab> lVar, e<? super ab> eVar) {
        Object objAnimate = animate(animationState, new TargetBasedAnimation(animationSpec, animationState.getTypeConverter(), animationState.getValue(), t, animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, eVar);
        return objAnimate == h.c.a.a.f48038a ? objAnimate : ab.f48028a;
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z, l lVar, e eVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        boolean z2 = ((i2 & 4) == 0) & z;
        if ((i2 & 8) != 0) {
            lVar = new l() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda9
                @Override // h.g.a.l
                public final Object invoke(Object obj3) {
                    return ab.f48028a;
                }
            };
        }
        return animateTo(animationState, obj, animationSpec2, z2, lVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R, T, V extends AnimationVector> Object callWithFrameNanos(Animation<T, V> animation, final l<? super Long, ? extends R> lVar, e<? super R> eVar) {
        return animation.isInfinite() ? InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(lVar, eVar) : MonotonicFrameClockKt.withFrameNanos(new l() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda7
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return lVar.invoke(Long.valueOf(((Long) obj).longValue()));
            }
        }, eVar);
    }

    private static final <T, V extends AnimationVector> void doAnimationFrame(AnimationScope<T, V> animationScope, long j2, long j3, Animation<T, V> animation, AnimationState<T, V> animationState, l<? super AnimationScope<T, V>, ab> lVar) {
        animationScope.setLastFrameTimeNanos$animation_core(j2);
        animationScope.setValue$animation_core(animation.getValueFromNanos(j3));
        animationScope.setVelocityVector$animation_core(animation.getVelocityVectorFromNanos(j3));
        if (animation.isFinishedFromNanos(j3)) {
            animationScope.setFinishedTimeNanos$animation_core(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core(false);
        }
        updateState(animationScope, animationState);
        lVar.invoke(animationScope);
    }

    private static final <T, V extends AnimationVector> void doAnimationFrameWithScale(AnimationScope<T, V> animationScope, long j2, float f2, Animation<T, V> animation, AnimationState<T, V> animationState, l<? super AnimationScope<T, V>, ab> lVar) {
        doAnimationFrame(animationScope, j2, f2 == 0.0f ? animation.getDurationNanos() : (long) ((j2 - animationScope.getStartTimeNanos()) / f2), animation, animationState, lVar);
    }

    public static final float getDurationScale(j jVar) {
        MotionDurationScale motionDurationScale = (MotionDurationScale) jVar.get(MotionDurationScale.Key);
        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
        if (scaleFactor < 0.0f) {
            PreconditionsKt.throwIllegalStateException("negative scale factor");
        }
        return scaleFactor;
    }

    public static final <T, V extends AnimationVector> void updateState(AnimationScope<T, V> animationScope, AnimationState<T, V> animationState) {
        animationState.setValue$animation_core(animationScope.getValue());
        AnimationVectorsKt.copyFrom(animationState.getVelocityVector(), animationScope.getVelocityVector());
        animationState.setFinishedTimeNanos$animation_core(animationScope.getFinishedTimeNanos());
        animationState.setLastFrameTimeNanos$animation_core(animationScope.getLastFrameTimeNanos());
        animationState.setRunning$animation_core(animationScope.isRunning());
    }

    public static /* synthetic */ Object animate$default(AnimationState animationState, Animation animation, long j2, l lVar, e eVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            lVar = new l() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda8
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return ab.f48028a;
                }
            };
        }
        l lVar2 = lVar;
        if ((i2 & 2) != 0) {
            j2 = Long.MIN_VALUE;
        }
        return animate(animationState, animation, j2, lVar2, eVar);
    }

    public static /* synthetic */ Object animate$default(float f2, float f3, float f4, AnimationSpec animationSpec, p pVar, e eVar, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f2, f3, (i2 & 4) != 0 ? 0.0f : f4, animationSpec, pVar, eVar);
    }

    public static final <T, V extends AnimationVector> Object animateDecay(AnimationState<T, V> animationState, DecayAnimationSpec<T> decayAnimationSpec, boolean z, l<? super AnimationScope<T, V>, ab> lVar, e<? super ab> eVar) {
        Object objAnimate = animate(animationState, new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter<T, AnimationVector>) animationState.getTypeConverter(), (Object) animationState.getValue(), animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, eVar);
        return objAnimate == h.c.a.a.f48038a ? objAnimate : ab.f48028a;
    }

    public static final Object animate(float f2, float f3, float f4, AnimationSpec<Float> animationSpec, p<? super Float, ? super Float, ab> pVar, e<? super ab> eVar) {
        Object objAnimate = animate(VectorConvertersKt.getVectorConverter(q.f48127a), new Float(f2), new Float(f3), new Float(f4), animationSpec, pVar, eVar);
        return objAnimate == h.c.a.a.f48038a ? objAnimate : ab.f48028a;
    }

    public static final <T, V extends AnimationVector> Object animate(final TwoWayConverter<T, V> twoWayConverter, T t, T t2, T t3, AnimationSpec<T> animationSpec, final p<? super T, ? super T, ab> pVar, e<? super ab> eVar) {
        V vNewInstance;
        if (t3 == null || (vNewInstance = twoWayConverter.getConvertToVector().invoke(t3)) == null) {
            vNewInstance = AnimationVectorsKt.newInstance(twoWayConverter.getConvertToVector().invoke(t));
        }
        AnimationVector animationVector = vNewInstance;
        Object objAnimate$default = animate$default(new AnimationState(twoWayConverter, t, animationVector, 0L, 0L, false, 56, null), new TargetBasedAnimation(animationSpec, twoWayConverter, t, t2, animationVector), 0L, new l() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda5
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SuspendAnimationKt.animate$lambda$1(pVar, twoWayConverter, (AnimationScope) obj);
            }
        }, eVar, 2, null);
        return objAnimate$default == h.c.a.a.f48038a ? objAnimate$default : ab.f48028a;
    }
}
