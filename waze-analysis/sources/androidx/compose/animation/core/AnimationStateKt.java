package androidx.compose.animation.core;

import h.g.b.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AnimationStateKt {
    public static final AnimationState<Float, AnimationVector1D> AnimationState(float f2, float f3, long j2, long j3, boolean z) {
        return new AnimationState<>(VectorConvertersKt.getVectorConverter(q.f48127a), Float.valueOf(f2), AnimationVectorsKt.AnimationVector(f3), j2, j3, z);
    }

    public static /* synthetic */ AnimationState AnimationState$default(float f2, float f3, long j2, long j3, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            j2 = Long.MIN_VALUE;
        }
        if ((i2 & 8) != 0) {
            j3 = Long.MIN_VALUE;
        }
        return AnimationState(f2, f3, j2, j3, ((i2 & 16) == 0) & z);
    }

    public static final AnimationState<Float, AnimationVector1D> copy(AnimationState<Float, AnimationVector1D> animationState, float f2, float f3, long j2, long j3, boolean z) {
        return new AnimationState<>(animationState.getTypeConverter(), Float.valueOf(f2), AnimationVectorsKt.AnimationVector(f3), j2, j3, z);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, float f2, float f3, long j2, long j3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) animationState.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((AnimationVector1D) animationState.getVelocityVector()).getValue();
        }
        if ((i2 & 4) != 0) {
            j2 = animationState.getLastFrameTimeNanos();
        }
        if ((i2 & 8) != 0) {
            j3 = animationState.getFinishedTimeNanos();
        }
        if ((i2 & 16) != 0) {
            z = animationState.isRunning();
        }
        boolean z2 = z;
        long j4 = j3;
        return copy((AnimationState<Float, AnimationVector1D>) animationState, f2, f3, j2, j4, z2);
    }

    public static final <T, V extends AnimationVector> V createZeroVectorFrom(TwoWayConverter<T, V> twoWayConverter, T t) {
        V vInvoke = twoWayConverter.getConvertToVector().invoke(t);
        vInvoke.reset$animation_core();
        return vInvoke;
    }

    public static final boolean isFinished(AnimationState<?, ?> animationState) {
        return animationState.getFinishedTimeNanos() != Long.MIN_VALUE;
    }

    public static final <T, V extends AnimationVector> AnimationState<T, V> copy(AnimationState<T, V> animationState, T t, V v, long j2, long j3, boolean z) {
        return new AnimationState<>(animationState.getTypeConverter(), t, v, j2, j3, z);
    }

    public static final <T, V extends AnimationVector> AnimationState<T, V> AnimationState(TwoWayConverter<T, V> twoWayConverter, T t, T t2, long j2, long j3, boolean z) {
        return new AnimationState<>(twoWayConverter, t, twoWayConverter.getConvertToVector().invoke(t2), j2, j3, z);
    }

    public static /* synthetic */ AnimationState AnimationState$default(TwoWayConverter twoWayConverter, Object obj, Object obj2, long j2, long j3, boolean z, int i2, Object obj3) {
        if ((i2 & 8) != 0) {
            j2 = Long.MIN_VALUE;
        }
        if ((i2 & 16) != 0) {
            j3 = Long.MIN_VALUE;
        }
        return AnimationState(twoWayConverter, obj, obj2, j2, j3, z & ((i2 & 32) == 0));
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, Object obj, AnimationVector animationVector, long j2, long j3, boolean z, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = animationState.getValue();
        }
        if ((i2 & 2) != 0) {
            animationVector = AnimationVectorsKt.copy(animationState.getVelocityVector());
        }
        if ((i2 & 4) != 0) {
            j2 = animationState.getLastFrameTimeNanos();
        }
        if ((i2 & 8) != 0) {
            j3 = animationState.getFinishedTimeNanos();
        }
        if ((i2 & 16) != 0) {
            z = animationState.isRunning();
        }
        boolean z2 = z;
        long j4 = j3;
        return copy((AnimationState<Object, AnimationVector>) animationState, obj, animationVector, j2, j4, z2);
    }
}
