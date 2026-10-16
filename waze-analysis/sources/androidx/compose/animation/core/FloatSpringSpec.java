package androidx.compose.animation.core;

import androidx.compose.animation.core.FloatAnimationSpec;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FloatSpringSpec implements FloatAnimationSpec {
    public static final int $stable = 8;
    private final float dampingRatio;
    private final SpringSimulation spring;
    private final float stiffness;
    private final float visibilityThreshold;

    public FloatSpringSpec(float f2, float f3, float f4) {
        this.dampingRatio = f2;
        this.stiffness = f3;
        this.visibilityThreshold = f4;
        SpringSimulation springSimulation = new SpringSimulation(1.0f);
        springSimulation.setDampingRatio(f2);
        springSimulation.setStiffness(f3);
        this.spring = springSimulation;
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f2, float f3, float f4) {
        float f5 = f2 - f3;
        float f6 = this.visibilityThreshold;
        SpringSimulation springSimulation = this.spring;
        return SpringEstimationKt.estimateAnimationDurationMillis(springSimulation.getStiffness(), springSimulation.getDampingRatio(), f4 / f6, f5 / f6, 1.0f) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getEndVelocity(float f2, float f3, float f4) {
        return 0.0f;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j2, float f2, float f3, float f4) {
        this.spring.setFinalPosition(f3);
        return Float.intBitsToFloat((int) (this.spring.m1907updateValuesIJZedt4$animation_core(f2, f4, j2 / 1000000) >> 32));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j2, float f2, float f3, float f4) {
        this.spring.setFinalPosition(f3);
        return Float.intBitsToFloat((int) (this.spring.m1907updateValuesIJZedt4$animation_core(f2, f4, j2 / 1000000) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public /* bridge */ /* synthetic */ VectorizedAnimationSpec vectorize(TwoWayConverter twoWayConverter) {
        return vectorize(twoWayConverter);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public /* synthetic */ VectorizedFloatAnimationSpec vectorize(TwoWayConverter twoWayConverter) {
        return FloatAnimationSpec.CC.m1892$default$vectorize((FloatAnimationSpec) this, twoWayConverter);
    }

    public FloatSpringSpec() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public /* synthetic */ FloatSpringSpec(float f2, float f3, float f4, int i2, o oVar) {
        this(1 == (i2 & 1) ? 1.0f : f2, (i2 & 2) != 0 ? 1500.0f : f3, (i2 & 4) != 0 ? 0.01f : f4);
    }
}
