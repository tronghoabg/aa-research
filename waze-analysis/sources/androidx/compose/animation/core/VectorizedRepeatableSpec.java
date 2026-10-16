package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VectorizedRepeatableSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final VectorizedDurationBasedAnimationSpec<V> animation;
    private final long durationNanos;
    private final long initialOffsetNanos;
    private final int iterations;
    private final RepeatMode repeatMode;

    private VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        this.iterations = i2;
        this.animation = vectorizedDurationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        if (i2 <= 0) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.durationNanos = (vectorizedDurationBasedAnimationSpec.getDelayMillis() + vectorizedDurationBasedAnimationSpec.getDurationMillis()) * 1000000;
        this.initialOffsetNanos = j2 * 1000000;
    }

    private final long repetitionPlayTimeNanos(long j2) {
        long j3 = j2 + this.initialOffsetNanos;
        if (j3 <= 0) {
            return 0L;
        }
        long jMin = Math.min(j3 / this.durationNanos, this.iterations - 1);
        return (this.repeatMode == RepeatMode.Restart || jMin % 2 == 0) ? j3 - (jMin * this.durationNanos) : ((jMin + 1) * this.durationNanos) - j3;
    }

    private final V repetitionStartVelocity(long j2, V v, V v2, V v3) {
        long j3 = this.initialOffsetNanos;
        long j4 = j2 + j3;
        long j5 = this.durationNanos;
        return j4 > j5 ? (V) getVelocityFromNanos(j5 - j3, v, v2, v3) : v2;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v, V v2, V v3) {
        return (this.iterations * this.durationNanos) - this.initialOffsetNanos;
    }

    public final long getDurationNanos$animation_core() {
        return this.durationNanos;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ AnimationVector getEndVelocity(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return VectorizedAnimationSpec.CC.$default$getEndVelocity(this, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j2, V v, V v2, V v3) {
        return this.animation.getValueFromNanos(repetitionPlayTimeNanos(j2), v, v2, repetitionStartVelocity(j2, v, v3, v2));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j2, V v, V v2, V v3) {
        return this.animation.getVelocityFromNanos(repetitionPlayTimeNanos(j2), v, v2, repetitionStartVelocity(j2, v, v3, v2));
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public /* synthetic */ boolean isInfinite() {
        return false;
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode) {
        this(i2, vectorizedDurationBasedAnimationSpec, repeatMode, StartOffset.m1911constructorimpl$default(0, 0, 2, null), (o) null);
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, int i3, o oVar) {
        this(i2, vectorizedDurationBasedAnimationSpec, (i3 & 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2, o oVar) {
        this(i2, vectorizedDurationBasedAnimationSpec, repeatMode, j2);
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2, int i3, o oVar) {
        this(i2, vectorizedDurationBasedAnimationSpec, (i3 & 4) != 0 ? RepeatMode.Restart : repeatMode, (i3 & 8) != 0 ? StartOffset.m1911constructorimpl$default(0, 0, 2, null) : j2, (o) null);
    }
}
