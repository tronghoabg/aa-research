package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VectorizedSpringSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final /* synthetic */ VectorizedFloatAnimationSpec<V> $$delegate_0;
    private final float dampingRatio;
    private final float stiffness;

    public /* synthetic */ VectorizedSpringSpec(float f2, float f3, AnimationVector animationVector, int i2, o oVar) {
        this(1 == (i2 & 1) ? 1.0f : f2, (i2 & 2) != 0 ? 1500.0f : f3, (i2 & 4) != 0 ? null : animationVector);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v, V v2, V v3) {
        return this.$$delegate_0.getDurationNanos(v, v2, v3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getEndVelocity(V v, V v2, V v3) {
        return (V) this.$$delegate_0.getEndVelocity(v, v2, v3);
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j2, V v, V v2, V v3) {
        return (V) this.$$delegate_0.getValueFromNanos(j2, v, v2, v3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j2, V v, V v2, V v3) {
        return (V) this.$$delegate_0.getVelocityFromNanos(j2, v, v2, v3);
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        this.$$delegate_0.isInfinite();
        return false;
    }

    public VectorizedSpringSpec(float f2, float f3, V v) {
        this(f2, f3, VectorizedAnimationSpecKt.createSpringAnimations(v, f2, f3));
    }

    private VectorizedSpringSpec(float f2, float f3, Animations animations) {
        this.$$delegate_0 = new VectorizedFloatAnimationSpec<>(animations);
        this.dampingRatio = f2;
        this.stiffness = f3;
    }
}
