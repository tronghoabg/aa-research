package androidx.compose.animation.core;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface FloatAnimationSpec extends AnimationSpec<Float> {

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static float getEndVelocity(FloatAnimationSpec floatAnimationSpec, float f2, float f3, float f4) {
            return CC.$default$getEndVelocity(floatAnimationSpec, f2, f3, f4);
        }

        @Deprecated
        public static <V extends AnimationVector> VectorizedFloatAnimationSpec<V> vectorize(FloatAnimationSpec floatAnimationSpec, TwoWayConverter<Float, V> twoWayConverter) {
            return CC.m1892$default$vectorize(floatAnimationSpec, (TwoWayConverter) twoWayConverter);
        }
    }

    long getDurationNanos(float f2, float f3, float f4);

    float getEndVelocity(float f2, float f3, float f4);

    float getValueFromNanos(long j2, float f2, float f3, float f4);

    float getVelocityFromNanos(long j2, float f2, float f3, float f4);

    @Override // androidx.compose.animation.core.AnimationSpec
    <V extends AnimationVector> VectorizedFloatAnimationSpec<V> vectorize(TwoWayConverter<Float, V> twoWayConverter);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.core.FloatAnimationSpec$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static float $default$getEndVelocity(FloatAnimationSpec floatAnimationSpec, float f2, float f3, float f4) {
            return floatAnimationSpec.getVelocityFromNanos(floatAnimationSpec.getDurationNanos(f2, f3, f4), f2, f3, f4);
        }

        /* renamed from: $default$vectorize, reason: collision with other method in class */
        public static VectorizedFloatAnimationSpec m1892$default$vectorize(FloatAnimationSpec floatAnimationSpec, TwoWayConverter twoWayConverter) {
            return new VectorizedFloatAnimationSpec(floatAnimationSpec);
        }
    }
}
