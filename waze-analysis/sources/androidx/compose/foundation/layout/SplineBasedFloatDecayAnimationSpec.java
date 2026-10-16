package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.foundation.layout.AndroidFlingSpline;
import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    private final float magicPhysicalCoefficient;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.magicPhysicalCoefficient = density.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    private final double getSplineDeceleration(float f2) {
        return AndroidFlingSpline.INSTANCE.deceleration(f2, WindowInsetsConnection_androidKt.PlatformFlingScrollFriction * this.magicPhysicalCoefficient);
    }

    public final float flingDistance(float f2) {
        return ((float) (WindowInsetsConnection_androidKt.PlatformFlingScrollFriction * this.magicPhysicalCoefficient * Math.exp((WindowInsetsConnection_androidKt.DecelerationRate / WindowInsetsConnection_androidKt.DecelMinusOne) * getSplineDeceleration(f2)))) * Math.signum(f2);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f2, float f3) {
        return (long) (Math.exp(getSplineDeceleration(f3) / WindowInsetsConnection_androidKt.DecelMinusOne) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f2, float f3) {
        return f2 + flingDistance(f3);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j2, float f2, float f3) {
        long durationNanos = getDurationNanos(0.0f, f3);
        return f2 + (flingDistance(f3) * AndroidFlingSpline.FlingResult.m2435getDistanceCoefficientimpl(AndroidFlingSpline.INSTANCE.m2430flingPositionLfoxSSI(durationNanos > 0 ? j2 / durationNanos : 1.0f)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j2, float f2, float f3) {
        long durationNanos = getDurationNanos(0.0f, f3);
        return ((AndroidFlingSpline.FlingResult.m2436getVelocityCoefficientimpl(AndroidFlingSpline.INSTANCE.m2430flingPositionLfoxSSI(durationNanos > 0 ? j2 / durationNanos : 1.0f)) * flingDistance(f3)) / durationNanos) * 1.0E9f;
    }
}
