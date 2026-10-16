package androidx.compose.animation.core;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VectorizedAnimationSpecKt {
    private static final int[] EmptyIntArray = new int[0];
    private static final float[] EmptyFloatArray = new float[0];
    private static final ArcSpline EmptyArcSpline = new ArcSpline(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    public static final long clampPlayTime(VectorizedDurationBasedAnimationSpec<?> vectorizedDurationBasedAnimationSpec, long j2) {
        long delayMillis = vectorizedDurationBasedAnimationSpec.getDelayMillis();
        long durationMillis = vectorizedDurationBasedAnimationSpec.getDurationMillis();
        long j3 = j2 - delayMillis;
        if (j3 < 0) {
            j3 = 0;
        }
        return j3 > durationMillis ? durationMillis : j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V extends AnimationVector> Animations createSpringAnimations(V v, float f2, float f3) {
        return v != null ? new Animations(v, f2, f3) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt.createSpringAnimations.1
            private final FloatSpringSpec[] anims;

            {
                int size$animation_core = v.getSize$animation_core();
                FloatSpringSpec[] floatSpringSpecArr = new FloatSpringSpec[size$animation_core];
                for (int i2 = 0; i2 < size$animation_core; i2++) {
                    floatSpringSpecArr[i2] = new FloatSpringSpec(f2, f3, v.get$animation_core(i2));
                }
                this.anims = floatSpringSpecArr;
            }

            @Override // androidx.compose.animation.core.Animations
            public FloatSpringSpec get(int i2) {
                return this.anims[i2];
            }
        } : new Animations(f2, f3) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt.createSpringAnimations.2
            private final FloatSpringSpec anim;

            {
                this.anim = new FloatSpringSpec(f2, f3, 0.0f, 4, null);
            }

            @Override // androidx.compose.animation.core.Animations
            public FloatSpringSpec get(int i2) {
                return this.anim;
            }
        };
    }

    public static final <V extends AnimationVector> long getDurationMillis(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V v, V v2, V v3) {
        return vectorizedAnimationSpec.getDurationNanos(v, v2, v3) / 1000000;
    }

    public static final <V extends AnimationVector> V getValueFromMillis(VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j2, V v, V v2, V v3) {
        return (V) vectorizedAnimationSpec.getValueFromNanos(j2 * 1000000, v, v2, v3);
    }
}
