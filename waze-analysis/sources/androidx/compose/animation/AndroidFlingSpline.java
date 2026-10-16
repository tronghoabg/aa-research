package androidx.compose.animation;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidFlingSpline {
    public static final int $stable;
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();
    private static final int NbSamples = 100;
    private static final float[] SplinePositions;
    private static final float[] SplineTimes;

    /* compiled from: WazeSource */
    public final class FlingResult {
        public static final int $stable = 0;
        private final float distanceCoefficient;
        private final float velocityCoefficient;

        public FlingResult(float f2, float f3) {
            this.distanceCoefficient = f2;
            this.velocityCoefficient = f3;
        }

        public static /* synthetic */ FlingResult copy$default(FlingResult flingResult, float f2, float f3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f2 = flingResult.distanceCoefficient;
            }
            if ((i2 & 2) != 0) {
                f3 = flingResult.velocityCoefficient;
            }
            return flingResult.copy(f2, f3);
        }

        public final float component1() {
            return this.distanceCoefficient;
        }

        public final float component2() {
            return this.velocityCoefficient;
        }

        public final FlingResult copy(float f2, float f3) {
            return new FlingResult(f2, f3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingResult)) {
                return false;
            }
            FlingResult flingResult = (FlingResult) obj;
            return Float.compare(this.distanceCoefficient, flingResult.distanceCoefficient) == 0 && Float.compare(this.velocityCoefficient, flingResult.velocityCoefficient) == 0;
        }

        public final float getDistanceCoefficient() {
            return this.distanceCoefficient;
        }

        public final float getVelocityCoefficient() {
            return this.velocityCoefficient;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.distanceCoefficient) * 31) + Float.floatToIntBits(this.velocityCoefficient);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.distanceCoefficient + ", velocityCoefficient=" + this.velocityCoefficient + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        SplinePositions = fArr;
        float[] fArr2 = new float[101];
        SplineTimes = fArr2;
        SplineBasedDecayKt.computeSplineInfo(fArr, fArr2, 100);
        $stable = 8;
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float f2, float f3) {
        return Math.log((Math.abs(f2) * 0.35f) / f3);
    }

    public final FlingResult flingPosition(float f2) {
        float f3 = 0.0f;
        float f4 = 1.0f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        int i2 = (int) (f2 * 100.0f);
        if (i2 < 100) {
            float f5 = i2 / 100.0f;
            int i3 = i2 + 1;
            float[] fArr = SplinePositions;
            float f6 = fArr[i2];
            float f7 = f2 - f5;
            f3 = (fArr[i3] - f6) / ((i3 / 100.0f) - f5);
            f4 = f6 + (f7 * f3);
        }
        return new FlingResult(f4, f3);
    }
}
