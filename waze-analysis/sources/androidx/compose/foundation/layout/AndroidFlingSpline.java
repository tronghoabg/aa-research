package androidx.compose.foundation.layout;

import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidFlingSpline {
    private static final int NbSamples = 100;
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();
    private static final float[] SplinePositions = new float[101];
    private static final float[] SplineTimes = new float[101];

    static {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        int i2 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        while (true) {
            float f14 = 1.0f;
            if (i2 >= 100) {
                SplineTimes[100] = 1.0f;
                SplinePositions[100] = 1.0f;
                return;
            }
            float f15 = i2;
            float f16 = 1.0f;
            while (true) {
                f2 = f15 / 100.0f;
                f3 = ((f16 - f12) / 2.0f) + f12;
                f4 = f14 - f3;
                f5 = f3 * 3.0f * f4;
                f6 = f3 * f3 * f3;
                float f17 = (((f4 * 0.175f) + (f3 * 0.35000002f)) * f5) + f6;
                f7 = f14;
                if (Math.abs(f17 - f2) < 1.0E-5d) {
                    break;
                }
                if (f17 > f2) {
                    f16 = f3;
                } else {
                    f12 = f3;
                }
                f14 = f7;
            }
            SplinePositions[i2] = (f5 * ((f4 * 0.5f) + f3)) + f6;
            float f18 = f7;
            while (true) {
                f8 = ((f18 - f13) / 2.0f) + f13;
                f9 = f7 - f8;
                f10 = f8 * 3.0f * f9;
                f11 = f8 * f8 * f8;
                float f19 = (((f9 * 0.5f) + f8) * f10) + f11;
                if (Math.abs(f19 - f2) >= 1.0E-5d) {
                    if (f19 > f2) {
                        f18 = f8;
                    } else {
                        f13 = f8;
                    }
                }
            }
            SplineTimes[i2] = (f10 * ((f9 * 0.175f) + (f8 * 0.35000002f))) + f11;
            i2++;
        }
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float f2, float f3) {
        return Math.log((Math.abs(f2) * 0.35f) / f3);
    }

    /* renamed from: flingPosition-LfoxSSI, reason: not valid java name */
    public final long m2430flingPositionLfoxSSI(float f2) {
        float f3;
        float f4;
        int i2 = (int) (f2 * 100.0f);
        if (i2 < 100) {
            float f5 = i2 / 100.0f;
            int i3 = i2 + 1;
            float[] fArr = SplinePositions;
            float f6 = fArr[i2];
            f3 = (fArr[i3] - f6) / ((i3 / 100.0f) - f5);
            f4 = f6 + ((f2 - f5) * f3);
        } else {
            f3 = 0.0f;
            f4 = 1.0f;
        }
        return (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f4) << 32);
    }

    /* compiled from: WazeSource */
    @h.g.a
    public final class FlingResult {
        private final long packedValue;

        private /* synthetic */ FlingResult(long j2) {
            this.packedValue = j2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FlingResult m2431boximpl(long j2) {
            return new FlingResult(j2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m2433equalsimpl(long j2, Object obj) {
            return (obj instanceof FlingResult) && j2 == ((FlingResult) obj).m2439unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m2434equalsimpl0(long j2, long j3) {
            return j2 == j3;
        }

        /* renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m2435getDistanceCoefficientimpl(long j2) {
            return Float.intBitsToFloat((int) (j2 >> 32));
        }

        /* renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m2436getVelocityCoefficientimpl(long j2) {
            return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m2437hashCodeimpl(long j2) {
            return AndroidFlingSpline$FlingResult$$ExternalSyntheticBackport0.m(j2);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m2438toStringimpl(long j2) {
            return "FlingResult(packedValue=" + j2 + ')';
        }

        public boolean equals(Object obj) {
            return m2433equalsimpl(this.packedValue, obj);
        }

        public int hashCode() {
            return m2437hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m2438toStringimpl(this.packedValue);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m2439unboximpl() {
            return this.packedValue;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m2432constructorimpl(long j2) {
            return j2;
        }
    }
}
