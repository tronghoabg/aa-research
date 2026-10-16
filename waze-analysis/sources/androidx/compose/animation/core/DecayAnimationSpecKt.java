package androidx.compose.animation.core;

import h.g.b.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DecayAnimationSpecKt {
    public static final <T, V extends AnimationVector> T calculateTargetValue(DecayAnimationSpec<T> decayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t, T t2) {
        return (T) twoWayConverter.getConvertFromVector().invoke(decayAnimationSpec.vectorize(twoWayConverter).getTargetValue(twoWayConverter.getConvertToVector().invoke(t), twoWayConverter.getConvertToVector().invoke(t2)));
    }

    public static final <T> DecayAnimationSpec<T> exponentialDecay(float f2, float f3) {
        return generateDecayAnimationSpec(new FloatExponentialDecaySpec(f2, f3));
    }

    public static /* synthetic */ DecayAnimationSpec exponentialDecay$default(float f2, float f3, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.1f;
        }
        return exponentialDecay(f2, f3);
    }

    public static final <T> DecayAnimationSpec<T> generateDecayAnimationSpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        return new DecayAnimationSpecImpl(floatDecayAnimationSpec);
    }

    public static final float calculateTargetValue(DecayAnimationSpec<Float> decayAnimationSpec, float f2, float f3) {
        return ((AnimationVector1D) decayAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(q.f48127a)).getTargetValue(AnimationVectorsKt.AnimationVector(f2), AnimationVectorsKt.AnimationVector(f3))).getValue();
    }
}
