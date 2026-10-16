package androidx.compose.animation.core;

import androidx.compose.animation.core.FloatAnimationSpec;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FloatTweenSpec implements FloatAnimationSpec {
    public static final int $stable = 0;
    private final int delay;
    private final long delayNanos;
    private final int duration;
    private final long durationNanos;
    private final Easing easing;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FloatTweenSpec(int i2, int i3, Easing easing, int i4, o oVar) {
        easing = (i4 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing;
        int i5 = i4 & 2;
        int i6 = i4 & 1;
        this(1 == i6 ? 300 : i2, i5 != 0 ? 0 : i3, easing);
    }

    private final long clampPlayTimeNanos(long j2) {
        long j3 = j2 - this.delayNanos;
        if (j3 < 0) {
            j3 = 0;
        }
        long j4 = this.durationNanos;
        return j3 > j4 ? j4 : j3;
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f2, float f3, float f4) {
        return this.delayNanos + this.durationNanos;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public /* synthetic */ float getEndVelocity(float f2, float f3, float f4) {
        return FloatAnimationSpec.CC.$default$getEndVelocity(this, f2, f3, f4);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j2, float f2, float f3, float f4) {
        float f5;
        if (this.duration == 0) {
            f5 = 1.0f;
        } else {
            long j3 = j2 - this.delayNanos;
            if (j3 < 0) {
                j3 = 0;
            }
            long j4 = this.durationNanos;
            if (j3 > j4) {
                j3 = j4;
            }
            f5 = j3 / j4;
        }
        float fTransform = this.easing.transform(f5);
        return (f2 * (1.0f - fTransform)) + (f3 * fTransform);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j2, float f2, float f3, float f4) {
        long j3 = j2 - this.delayNanos;
        if (j3 < 0) {
            j3 = 0;
        }
        long j4 = this.durationNanos;
        long j5 = j3 > j4 ? j4 : j3;
        if (j5 == 0) {
            return f4;
        }
        return (getValueFromNanos(j5, f2, f3, f4) - getValueFromNanos((-1000000) + j5, f2, f3, f4)) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public /* bridge */ /* synthetic */ VectorizedAnimationSpec vectorize(TwoWayConverter twoWayConverter) {
        return vectorize(twoWayConverter);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public /* synthetic */ VectorizedFloatAnimationSpec vectorize(TwoWayConverter twoWayConverter) {
        return FloatAnimationSpec.CC.m1892$default$vectorize((FloatAnimationSpec) this, twoWayConverter);
    }

    public FloatTweenSpec(int i2, int i3, Easing easing) {
        this.duration = i2;
        this.delay = i3;
        this.easing = easing;
        this.durationNanos = i2 * 1000000;
        this.delayNanos = i3 * 1000000;
    }

    public FloatTweenSpec() {
        this(0, 0, null, 7, null);
    }
}
