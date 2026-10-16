package androidx.compose.animation.core;

import h.g.a.l;
import h.g.b.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnimationKt {
    public static final long MillisToNanos = 1000000;
    public static final long SecondsToMillis = 1000;

    public static final DecayAnimation<Float, AnimationVector1D> DecayAnimation(FloatDecayAnimationSpec floatDecayAnimationSpec, float f2, float f3) {
        return new DecayAnimation<>((DecayAnimationSpec<Float>) DecayAnimationSpecKt.generateDecayAnimationSpec(floatDecayAnimationSpec), VectorConvertersKt.getVectorConverter(q.f48127a), Float.valueOf(f2), AnimationVectorsKt.AnimationVector(f3));
    }

    public static /* synthetic */ DecayAnimation DecayAnimation$default(FloatDecayAnimationSpec floatDecayAnimationSpec, float f2, float f3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        return DecayAnimation(floatDecayAnimationSpec, f2, f3);
    }

    public static final <T, V extends AnimationVector> TargetBasedAnimation<T, V> TargetBasedAnimation(AnimationSpec<T> animationSpec, TwoWayConverter<T, V> twoWayConverter, T t, T t2, T t3) {
        return new TargetBasedAnimation<>(animationSpec, twoWayConverter, t, t2, twoWayConverter.getConvertToVector().invoke(t3));
    }

    public static final <V extends AnimationVector> TargetBasedAnimation<V, V> createAnimation(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V v, V v2, V v3) {
        return new TargetBasedAnimation<>(vectorizedAnimationSpec, (TwoWayConverter<V, V>) VectorConvertersKt.TwoWayConverter(new l() { // from class: androidx.compose.animation.core.AnimationKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return (AnimationVector) obj;
            }
        }, new l() { // from class: androidx.compose.animation.core.AnimationKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return (AnimationVector) obj;
            }
        }), v, v2, v3);
    }

    public static final long getDurationMillis(Animation<?, ?> animation) {
        return animation.getDurationNanos() / 1000000;
    }

    public static final <T, V extends AnimationVector> T getVelocityFromNanos(Animation<T, V> animation, long j2) {
        return (T) animation.getTypeConverter().getConvertFromVector().invoke(animation.getVelocityVectorFromNanos(j2));
    }

    static final AnimationVector createAnimation$lambda$0(AnimationVector animationVector) {
        return animationVector;
    }

    static final AnimationVector createAnimation$lambda$1(AnimationVector animationVector) {
        return animationVector;
    }
}
