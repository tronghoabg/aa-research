package androidx.compose.animation;

import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FlingCalculator {
    public static final int $stable = 0;
    private final Density density;
    private final float friction;
    private final float magicPhysicalCoefficient;

    /* compiled from: WazeSource */
    public final class FlingInfo {
        public static final int $stable = 0;
        private final float distance;
        private final long duration;
        private final float initialVelocity;

        public FlingInfo(float f2, float f3, long j2) {
            this.initialVelocity = f2;
            this.distance = f3;
            this.duration = j2;
        }

        public static /* synthetic */ FlingInfo copy$default(FlingInfo flingInfo, float f2, float f3, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f2 = flingInfo.initialVelocity;
            }
            if ((i2 & 2) != 0) {
                f3 = flingInfo.distance;
            }
            if ((i2 & 4) != 0) {
                j2 = flingInfo.duration;
            }
            return flingInfo.copy(f2, f3, j2);
        }

        public final float component1() {
            return this.initialVelocity;
        }

        public final float component2() {
            return this.distance;
        }

        public final long component3() {
            return this.duration;
        }

        public final FlingInfo copy(float f2, float f3, long j2) {
            return new FlingInfo(f2, f3, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) obj;
            return Float.compare(this.initialVelocity, flingInfo.initialVelocity) == 0 && Float.compare(this.distance, flingInfo.distance) == 0 && this.duration == flingInfo.duration;
        }

        public final float getDistance() {
            return this.distance;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final float getInitialVelocity() {
            return this.initialVelocity;
        }

        public int hashCode() {
            return (((Float.floatToIntBits(this.initialVelocity) * 31) + Float.floatToIntBits(this.distance)) * 31) + FlingCalculator$FlingInfo$$ExternalSyntheticBackport0.m(this.duration);
        }

        public final float position(long j2) {
            long j3 = this.duration;
            return this.distance * Math.signum(this.initialVelocity) * AndroidFlingSpline.INSTANCE.flingPosition(j3 > 0 ? j2 / j3 : 1.0f).getDistanceCoefficient();
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.initialVelocity + ", distance=" + this.distance + ", duration=" + this.duration + ')';
        }

        public final float velocity(long j2) {
            long j3 = this.duration;
            return (((AndroidFlingSpline.INSTANCE.flingPosition(j3 > 0 ? j2 / j3 : 1.0f).getVelocityCoefficient() * Math.signum(this.initialVelocity)) * this.distance) / this.duration) * 1000.0f;
        }
    }

    public FlingCalculator(float f2, Density density) {
        this.friction = f2;
        this.density = density;
        this.magicPhysicalCoefficient = computeDeceleration(density);
    }

    private final float computeDeceleration(Density density) {
        return FlingCalculatorKt.computeDeceleration(0.84f, density.getDensity());
    }

    private final double getSplineDeceleration(float f2) {
        return AndroidFlingSpline.INSTANCE.deceleration(f2, this.friction * this.magicPhysicalCoefficient);
    }

    public final float flingDistance(float f2) {
        return (float) (this.friction * this.magicPhysicalCoefficient * Math.exp((FlingCalculatorKt.DecelerationRate / (FlingCalculatorKt.DecelerationRate - 1.0d)) * getSplineDeceleration(f2)));
    }

    public final long flingDuration(float f2) {
        return (long) (Math.exp(getSplineDeceleration(f2) / (FlingCalculatorKt.DecelerationRate - 1.0d)) * 1000.0d);
    }

    public final FlingInfo flingInfo(float f2) {
        double splineDeceleration = getSplineDeceleration(f2);
        double d2 = FlingCalculatorKt.DecelerationRate - 1.0d;
        return new FlingInfo(f2, (float) (this.friction * this.magicPhysicalCoefficient * Math.exp((FlingCalculatorKt.DecelerationRate / d2) * splineDeceleration)), (long) (Math.exp(splineDeceleration / d2) * 1000.0d));
    }

    public final Density getDensity() {
        return this.density;
    }
}
