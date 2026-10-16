package androidx.compose.ui.graphics;

import androidx.camera.video.AudioStats;
import androidx.collection.FloatFloatPair;
import androidx.compose.ui.graphics.PathSegment;
import androidx.compose.ui.util.MathHelpersKt;
import h.a.c;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BezierKt {
    private static final double Epsilon = 1.0E-7d;
    private static final float FloatEpsilon = 1.05E-6f;
    private static final double Tau = 6.283185307179586d;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.Conic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PathSegment.Type.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final float clampValidRootInUnitRange(float f2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > FloatEpsilon) {
            return Float.NaN;
        }
        return f3;
    }

    public static final boolean closeTo(double d2, double d3) {
        return Math.abs(d2 - d3) < Epsilon;
    }

    public static final long computeCubicVerticalBounds(float f2, float f3, float f4, float f5, float[] fArr, int i2) {
        float f6 = (f3 - f2) * 3.0f;
        float f7 = (f4 - f3) * 3.0f;
        float f8 = (f5 - f4) * 3.0f;
        int iFindQuadraticRoots = findQuadraticRoots(f6, f7, f8, fArr, i2);
        float f9 = f8 - f7;
        float f10 = f7 - f6;
        float f11 = f10 + f10;
        int iWriteValidRootInUnitRange = iFindQuadraticRoots + writeValidRootInUnitRange((-f11) / ((f9 + f9) - f11), fArr, i2 + iFindQuadraticRoots);
        float fMin = Math.min(f2, f5);
        float fMax = Math.max(f2, f5);
        for (int i3 = 0; i3 < iWriteValidRootInUnitRange; i3++) {
            float fEvaluateCubic = evaluateCubic(f2, f3, f4, f5, fArr[i3]);
            fMin = Math.min(fMin, fEvaluateCubic);
            fMax = Math.max(fMax, fEvaluateCubic);
        }
        return FloatFloatPair.m1675constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeCubicVerticalBounds$default(float f2, float f3, float f4, float f5, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = 0;
        }
        return computeCubicVerticalBounds(f2, f3, f4, f5, fArr, i2);
    }

    public static final long computeHorizontalBounds(PathSegment pathSegment, float[] fArr, int i2) {
        int iFindDerivativeRoots = findDerivativeRoots(pathSegment, true, fArr, i2);
        float fMin = Math.min(pathSegment.getPoints()[0], getEndX(pathSegment));
        float fMax = Math.max(pathSegment.getPoints()[0], getEndX(pathSegment));
        for (int i3 = 0; i3 < iFindDerivativeRoots; i3++) {
            float fEvaluateX = evaluateX(pathSegment, fArr[i3]);
            fMin = Math.min(fMin, fEvaluateX);
            fMax = Math.max(fMax, fEvaluateX);
        }
        return FloatFloatPair.m1675constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeHorizontalBounds$default(PathSegment pathSegment, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return computeHorizontalBounds(pathSegment, fArr, i2);
    }

    public static final long computeVerticalBounds(PathSegment pathSegment, float[] fArr, int i2) {
        int iFindDerivativeRoots = findDerivativeRoots(pathSegment, false, fArr, i2);
        float fMin = Math.min(pathSegment.getPoints()[1], getEndY(pathSegment));
        float fMax = Math.max(pathSegment.getPoints()[1], getEndY(pathSegment));
        for (int i3 = 0; i3 < iFindDerivativeRoots; i3++) {
            float fEvaluateY = evaluateY(pathSegment, fArr[i3]);
            fMin = Math.min(fMin, fEvaluateY);
            fMax = Math.max(fMax, fEvaluateY);
        }
        return FloatFloatPair.m1675constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeVerticalBounds$default(PathSegment pathSegment, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return computeVerticalBounds(pathSegment, fArr, i2);
    }

    public static final float cubicArea(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        return ((((((((f9 - f3) * (f6 + f4)) - ((f8 - f2) * (f7 + f5))) + (f5 * (f2 - f6))) - (f4 * (f3 - f7))) + (f9 * ((f2 / 3.0f) + f6))) - (f8 * ((f3 / 3.0f) + f7))) * 3.0f) / 20.0f;
    }

    private static final int cubicToMonotonicCubics(float[] fArr, float[] fArr2, float[] fArr3) {
        int iFindCubicExtremaY = findCubicExtremaY(fArr, fArr3);
        int i2 = 0;
        if (iFindCubicExtremaY == 0) {
            if (fArr2.length < 8) {
                return 0;
            }
            c.aq(fArr, fArr2, 0, 0, 8);
            return 0;
        }
        int i3 = 0;
        float f2 = 0.0f;
        while (i2 < iFindCubicExtremaY) {
            float f3 = (fArr3[i2] - f2) / (1.0f - f2);
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            f2 = f3 > 1.0f ? 1.0f : f3;
            splitCubicAt(fArr, i3, fArr2, i3, f2);
            i3 += 6;
            i2++;
            fArr = fArr2;
        }
        return iFindCubicExtremaY;
    }

    public static final int cubicWinding(float[] fArr, float f2, float f3, float[] fArr2, float[] fArr3) {
        int iCubicToMonotonicCubics = cubicToMonotonicCubics(fArr, fArr2, fArr3);
        int iMonotonicCubicWinding = 0;
        int i2 = 0;
        while (true) {
            iMonotonicCubicWinding += monotonicCubicWinding(fArr2, i2 * 6, f2, f3);
            if (i2 == iCubicToMonotonicCubics) {
                return iMonotonicCubicWinding;
            }
            i2++;
        }
    }

    private static final float evaluateCubic(float f2, float f3, float f4, float f5, float f6) {
        return (((((((f5 + ((f3 - f4) * 3.0f)) - f2) * f6) + (((f4 - (f3 + f3)) + f2) * 3.0f)) * f6) + ((f3 - f2) * 3.0f)) * f6) + f2;
    }

    private static final float evaluateLine(float f2, float f3, float f4) {
        return ((f3 - f2) * f4) + f2;
    }

    private static final float evaluateQuadratic(float f2, float f3, float f4, float f5) {
        float f6 = ((f4 - (f3 + f3)) + f2) * f5;
        float f7 = f3 - f2;
        return ((f6 + f7 + f7) * f5) + f2;
    }

    private static final float evaluateX(PathSegment pathSegment, float f2) {
        float[] points = pathSegment.getPoints();
        PathSegment.Type type = pathSegment.getType();
        PathSegment.Type type2 = PathSegment.Type.Move;
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            return points[0];
        }
        if (iOrdinal == 1) {
            return evaluateLine(points[0], points[2], f2);
        }
        if (iOrdinal == 2) {
            return evaluateQuadratic(points[0], points[2], points[4], f2);
        }
        if (iOrdinal != 4) {
            return Float.NaN;
        }
        return evaluateCubic(points[0], points[2], points[4], points[6], f2);
    }

    public static final float evaluateY(PathSegment pathSegment, float f2) {
        float[] points = pathSegment.getPoints();
        PathSegment.Type type = pathSegment.getType();
        PathSegment.Type type2 = PathSegment.Type.Move;
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            return points[1];
        }
        if (iOrdinal == 1) {
            return evaluateLine(points[1], points[3], f2);
        }
        if (iOrdinal == 2) {
            return evaluateQuadratic(points[1], points[3], points[5], f2);
        }
        if (iOrdinal != 4) {
            return Float.NaN;
        }
        return evaluateCubic(points[1], points[3], points[5], points[7], f2);
    }

    private static final int findCubicExtremaY(float[] fArr, float[] fArr2) {
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[5];
        float f5 = ((f2 - f3) - f3) - f4;
        return findQuadraticRoots((fArr[7] - f2) + ((f3 - f4) * 3.0f), f5 + f5, f3 - f2, fArr2, 0);
    }

    private static final int findDerivativeRoots(PathSegment pathSegment, boolean z, float[] fArr, int i2) {
        float[] points = pathSegment.getPoints();
        PathSegment.Type type = pathSegment.getType();
        PathSegment.Type type2 = PathSegment.Type.Move;
        int iOrdinal = type.ordinal();
        int i3 = !z ? 1 : 0;
        if (iOrdinal == 2) {
            int i4 = i3 + 4;
            float f2 = points[i3 + 2];
            float f3 = f2 - points[i3];
            float f4 = points[i4] - f2;
            float f5 = f3 + f3;
            return writeValidRootInUnitRange((-f5) / ((f4 + f4) - f5), fArr, i2);
        }
        if (iOrdinal != 4) {
            return 0;
        }
        float f6 = points[i3 + 2];
        float f7 = f6 - points[i3];
        float f8 = points[i3 + 4];
        float f9 = f7 * 3.0f;
        float f10 = (f8 - f6) * 3.0f;
        float f11 = (points[i3 + 6] - f8) * 3.0f;
        int iFindQuadraticRoots = findQuadraticRoots(f9, f10, f11, fArr, i2);
        float f12 = f11 - f10;
        float f13 = f10 - f9;
        float f14 = f13 + f13;
        return iFindQuadraticRoots + writeValidRootInUnitRange((-f14) / ((f12 + f12) - f14), fArr, i2 + iFindQuadraticRoots);
    }

    public static final float findFirstCubicRoot(float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        double d2 = (-f2) + ((f3 - f4) * 3.0d) + f5;
        double d3 = f2;
        double d4 = (f3 - f2) * 3.0d;
        double d5 = f3;
        double d6 = ((d3 - (d5 + d5)) + f4) * 3.0d;
        if (Math.abs(d2 + AudioStats.AUDIO_AMPLITUDE_NONE) < Epsilon) {
            if (Math.abs(d6 + AudioStats.AUDIO_AMPLITUDE_NONE) < Epsilon) {
                if (Math.abs(d4 + AudioStats.AUDIO_AMPLITUDE_NONE) < Epsilon) {
                    return Float.NaN;
                }
                float f8 = (float) ((-d3) / d4);
                f6 = f8 >= 0.0f ? f8 : 0.0f;
                f7 = f6 <= 1.0f ? f6 : 1.0f;
                if (Math.abs(f7 - f8) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f7;
            }
            double d7 = 4.0d * d6 * d3;
            double d8 = d6 + d6;
            double dSqrt = Math.sqrt((d4 * d4) - d7);
            float f9 = (float) ((dSqrt - d4) / d8);
            float f10 = f9 < 0.0f ? 0.0f : f9;
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (Math.abs(f10 - f9) > FloatEpsilon) {
                f10 = Float.NaN;
            }
            if (!Float.isNaN(f10)) {
                return f10;
            }
            float f11 = (float) (((-d4) - dSqrt) / d8);
            f6 = f11 >= 0.0f ? f11 : 0.0f;
            f7 = f6 <= 1.0f ? f6 : 1.0f;
            if (Math.abs(f7 - f11) > FloatEpsilon) {
                return Float.NaN;
            }
            return f7;
        }
        double d9 = d6 / d2;
        double d10 = d4 / d2;
        double d11 = d3 / d2;
        double d12 = d9 / 3.0d;
        double d13 = ((d10 * 3.0d) - (d9 * d9)) / 9.0d;
        double d14 = (((((d9 + d9) * d9) * d9) - ((d9 * 9.0d) * d10)) + (d11 * 27.0d)) / 54.0d;
        double d15 = d13 * d13 * d13;
        double d16 = (d14 * d14) + d15;
        if (d16 >= AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (d16 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                double dSqrt2 = Math.sqrt(d16);
                float fFastCbrt = (float) ((MathHelpersKt.fastCbrt((float) ((-d14) + dSqrt2)) - MathHelpersKt.fastCbrt((float) (d14 + dSqrt2))) - d12);
                f6 = fFastCbrt >= 0.0f ? fFastCbrt : 0.0f;
                f7 = f6 <= 1.0f ? f6 : 1.0f;
                if (Math.abs(f7 - fFastCbrt) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f7;
            }
            float f12 = -MathHelpersKt.fastCbrt((float) d14);
            float f13 = (float) d12;
            float f14 = (f12 + f12) - f13;
            float f15 = f14 < 0.0f ? 0.0f : f14;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            if (Math.abs(f15 - f14) > FloatEpsilon) {
                f15 = Float.NaN;
            }
            if (!Float.isNaN(f15)) {
                return f15;
            }
            float f16 = (-f12) - f13;
            f6 = f16 >= 0.0f ? f16 : 0.0f;
            f7 = f6 <= 1.0f ? f6 : 1.0f;
            if (Math.abs(f7 - f16) > FloatEpsilon) {
                return Float.NaN;
            }
            return f7;
        }
        double dSqrt3 = Math.sqrt(-d15);
        double d17 = (-d14) / dSqrt3;
        if (d17 < -1.0d) {
            d17 = -1.0d;
        }
        if (d17 > 1.0d) {
            d17 = 1.0d;
        }
        double dAcos = Math.acos(d17);
        float fFastCbrt2 = MathHelpersKt.fastCbrt((float) dSqrt3);
        double d18 = fFastCbrt2 + fFastCbrt2;
        float fCos = (float) ((Math.cos(dAcos / 3.0d) * d18) - d12);
        float f17 = fCos < 0.0f ? 0.0f : fCos;
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (Math.abs(f17 - fCos) > FloatEpsilon) {
            f17 = Float.NaN;
        }
        if (!Float.isNaN(f17)) {
            return f17;
        }
        float fCos2 = (float) ((Math.cos((Tau + dAcos) / 3.0d) * d18) - d12);
        float f18 = fCos2 < 0.0f ? 0.0f : fCos2;
        if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        if (Math.abs(f18 - fCos2) > FloatEpsilon) {
            f18 = Float.NaN;
        }
        if (!Float.isNaN(f18)) {
            return f18;
        }
        float fCos3 = (float) ((d18 * Math.cos((dAcos + 12.566370614359172d) / 3.0d)) - d12);
        f6 = fCos3 >= 0.0f ? fCos3 : 0.0f;
        f7 = f6 <= 1.0f ? f6 : 1.0f;
        if (Math.abs(f7 - fCos3) > FloatEpsilon) {
            return Float.NaN;
        }
        return f7;
    }

    private static final float findFirstLineRoot(float f2, float f3) {
        float f4 = (-f2) / (f3 - f2);
        float f5 = f4 >= 0.0f ? f4 : 0.0f;
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (Math.abs(f5 - f4) > FloatEpsilon) {
            return Float.NaN;
        }
        return f5;
    }

    private static final float findFirstQuadraticRoot(float f2, float f3, float f4) {
        float f5;
        float f6;
        double d2 = f3;
        double d3 = f2;
        double d4 = d2 + d2;
        double d5 = f4;
        double d6 = (d3 - d4) + d5;
        if (d6 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (d2 == d5) {
                return Float.NaN;
            }
            float f7 = (float) ((d4 - d5) / (d4 - (d5 + d5)));
            f5 = f7 >= 0.0f ? f7 : 0.0f;
            f6 = f5 <= 1.0f ? f5 : 1.0f;
            if (Math.abs(f6 - f7) > FloatEpsilon) {
                return Float.NaN;
            }
            return f6;
        }
        double d7 = -Math.sqrt((d2 * d2) - (d5 * d3));
        double d8 = (-d3) + d2;
        float f8 = (float) ((-(d7 + d8)) / d6);
        float f9 = f8 < 0.0f ? 0.0f : f8;
        if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        if (Math.abs(f9 - f8) > FloatEpsilon) {
            f9 = Float.NaN;
        }
        if (!Float.isNaN(f9)) {
            return f9;
        }
        float f10 = (float) ((d7 - d8) / d6);
        f5 = f10 >= 0.0f ? f10 : 0.0f;
        f6 = f5 <= 1.0f ? f5 : 1.0f;
        if (Math.abs(f6 - f10) > FloatEpsilon) {
            return Float.NaN;
        }
        return f6;
    }

    public static final float findFirstRoot(PathSegment pathSegment, float f2) {
        float[] points = pathSegment.getPoints();
        PathSegment.Type type = pathSegment.getType();
        PathSegment.Type type2 = PathSegment.Type.Move;
        switch (type.ordinal()) {
            case 0:
            case 3:
            case 5:
            case 6:
                return Float.NaN;
            case 1:
                float f3 = points[0] - f2;
                float f4 = (-f3) / ((points[2] - f2) - f3);
                float f5 = f4 >= 0.0f ? f4 : 0.0f;
                if (f5 > 1.0f) {
                    f5 = 1.0f;
                }
                if (Math.abs(f5 - f4) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f5;
            case 2:
                return findFirstQuadraticRoot(points[0] - f2, points[2] - f2, points[4] - f2);
            case 4:
                return findFirstCubicRoot(points[0] - f2, points[2] - f2, points[4] - f2, points[6] - f2);
            default:
                throw new i();
        }
    }

    private static final int findLineRoot(float f2, float f3, float[] fArr, int i2) {
        return writeValidRootInUnitRange((-f2) / (f3 - f2), fArr, i2);
    }

    static /* synthetic */ int findLineRoot$default(float f2, float f3, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return writeValidRootInUnitRange((-f2) / (f3 - f2), fArr, i2);
    }

    private static final int findQuadraticRoots(float f2, float f3, float f4, float[] fArr, int i2) {
        double d2 = f3;
        double d3 = f2;
        double d4 = d2 + d2;
        double d5 = f4;
        double d6 = (d3 - d4) + d5;
        if (d6 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (d2 == d5) {
                return 0;
            }
            return writeValidRootInUnitRange((float) ((d4 - d5) / (d4 - (d5 + d5))), fArr, i2);
        }
        double d7 = -Math.sqrt((d2 * d2) - (d5 * d3));
        double d8 = (-d3) + d2;
        int iWriteValidRootInUnitRange = writeValidRootInUnitRange((float) ((-(d7 + d8)) / d6), fArr, i2);
        int iWriteValidRootInUnitRange2 = iWriteValidRootInUnitRange + writeValidRootInUnitRange((float) ((d7 - d8) / d6), fArr, i2 + iWriteValidRootInUnitRange);
        if (iWriteValidRootInUnitRange2 > 1) {
            float f5 = fArr[i2];
            int i3 = i2 + 1;
            float f6 = fArr[i3];
            if (f5 > f6) {
                fArr[i2] = f6;
                fArr[i3] = f5;
                return iWriteValidRootInUnitRange2;
            }
            if (f5 == f6) {
                return 1;
            }
        }
        return iWriteValidRootInUnitRange2;
    }

    static /* synthetic */ int findQuadraticRoots$default(float f2, float f3, float f4, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            i2 = 0;
        }
        return findQuadraticRoots(f2, f3, f4, fArr, i2);
    }

    private static final float getEndX(PathSegment pathSegment) {
        float[] points = pathSegment.getPoints();
        PathSegment.Type type = pathSegment.getType();
        PathSegment.Type type2 = PathSegment.Type.Move;
        int iOrdinal = type.ordinal();
        return points[iOrdinal != 1 ? (iOrdinal == 2 || iOrdinal == 3) ? (char) 4 : iOrdinal != 4 ? (char) 0 : (char) 6 : (char) 2];
    }

    private static final float getEndY(PathSegment pathSegment) {
        float[] points = pathSegment.getPoints();
        PathSegment.Type type = pathSegment.getType();
        PathSegment.Type type2 = PathSegment.Type.Move;
        int iOrdinal = type.ordinal();
        return points[iOrdinal != 1 ? (iOrdinal == 2 || iOrdinal == 3) ? (char) 5 : iOrdinal != 4 ? (char) 0 : (char) 7 : (char) 3];
    }

    private static final float getStartX(PathSegment pathSegment) {
        return pathSegment.getPoints()[0];
    }

    private static final float getStartY(PathSegment pathSegment) {
        return pathSegment.getPoints()[1];
    }

    private static final boolean isQuadraticMonotonic(float f2, float f3, float f4) {
        return Math.signum(f2 - f3) + Math.signum(f3 - f4) != 0.0f;
    }

    public static final int lineWinding(float[] fArr, float f2, float f3) {
        if (fArr.length < 4) {
            return 0;
        }
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[3];
        float f8 = f7 - f5;
        int i2 = f5 > f7 ? -1 : 1;
        float f9 = f5 > f7 ? f5 : f7;
        if (f5 <= f7) {
            f7 = f5;
        }
        if (f3 < f7 || f3 >= f9) {
            return 0;
        }
        float f10 = ((f6 - f4) * (f3 - f5)) - (f8 * (f2 - f4));
        if (f10 == 0.0f || ((int) Math.signum(f10)) == i2) {
            return 0;
        }
        return i2;
    }

    private static final int monotonicCubicWinding(float[] fArr, int i2, float f2, float f3) {
        int i3 = i2 + 7;
        int i4 = i2 + 1;
        float f4 = fArr[i4];
        float f5 = fArr[i3];
        float f6 = f4 > f5 ? f4 : f5;
        if (f4 > f5) {
            f4 = f5;
        }
        if (f3 >= f4 && f3 < f6) {
            float f7 = fArr[i2];
            float f8 = fArr[i2 + 2];
            float f9 = fArr[i2 + 4];
            float f10 = fArr[i2 + 6];
            if (f2 < Math.min(f7, Math.min(f8, Math.min(f9, f10)))) {
                return 0;
            }
            int i5 = f4 > f5 ? -1 : 1;
            if (f2 <= Math.max(f7, Math.max(f8, Math.max(f9, f10)))) {
                float f11 = fArr[i4];
                float f12 = fArr[i2 + 3];
                float f13 = fArr[i2 + 5];
                float f14 = fArr[i3];
                float fFindFirstCubicRoot = findFirstCubicRoot(f11 - f3, f12 - f3, f13 - f3, f14 - f3);
                if (Float.isNaN(fFindFirstCubicRoot)) {
                    return 0;
                }
                float fEvaluateCubic = evaluateCubic(f7, f8, f9, f10, fFindFirstCubicRoot);
                if ((Math.abs(fEvaluateCubic - f2) >= FloatEpsilon || (f2 == f10 && f3 == f14)) && fEvaluateCubic < f2) {
                }
            }
            return i5;
        }
        return 0;
    }

    private static final int monotonicQuadraticWinding(float[] fArr, int i2, float f2, float f3, float[] fArr2) {
        float fEvaluateQuadratic;
        float f4 = fArr[i2 + 1];
        float f5 = fArr[i2 + 5];
        float f6 = f4 > f5 ? f4 : f5;
        if (f3 >= (f4 > f5 ? f5 : f4) && f3 < f6) {
            int i3 = f4 > f5 ? -1 : 1;
            float f7 = fArr[i2 + 3];
            float f8 = (f4 - (f7 + f7)) + f5;
            float f9 = f7 - f4;
            if (findQuadraticRoots$default(f8, f9 + f9, f4 - f3, fArr2, 0, 16, null) == 0) {
                int i4 = 1 - i3;
                fEvaluateQuadratic = fArr[i4 + i4];
            } else {
                fEvaluateQuadratic = evaluateQuadratic(fArr[0], fArr[2], fArr[4], fArr2[0]);
            }
            if ((Math.abs(fEvaluateQuadratic - f2) >= FloatEpsilon || (f2 == fArr[4] && f3 == f5)) && fEvaluateQuadratic < f2) {
                return i3;
            }
        }
        return 0;
    }

    private static final int quadraticToMonotonicQuadratics(float[] fArr, float[] fArr2) {
        if (fArr.length >= 6 && fArr2.length >= 6) {
            float f2 = fArr[1];
            float f3 = fArr[3];
            float f4 = fArr[5];
            if (isQuadraticMonotonic(f2, f3, f4)) {
                f2 = f3;
            } else {
                float f5 = f2 - f3;
                float fUnitDivide = unitDivide(f5, (f5 - f3) + f4);
                if (!Float.isNaN(fUnitDivide)) {
                    splitQuadraticAt(fArr, fArr2, fUnitDivide);
                    return 1;
                }
                if (Math.abs(f5) >= Math.abs(f3 - f4)) {
                    f2 = f4;
                }
            }
            c.aq(fArr, fArr2, 0, 0, 6);
            fArr2[3] = f2;
        }
        return 0;
    }

    public static final int quadraticWinding(float[] fArr, float f2, float f3, float[] fArr2, float[] fArr3) {
        if (isQuadraticMonotonic(fArr[1], fArr[3], fArr[5])) {
            return monotonicQuadraticWinding(fArr, 0, f2, f3, fArr3);
        }
        int iQuadraticToMonotonicQuadratics = quadraticToMonotonicQuadratics(fArr, fArr2);
        int iMonotonicQuadraticWinding = monotonicQuadraticWinding(fArr2, 0, f2, f3, fArr3);
        return iQuadraticToMonotonicQuadratics > 0 ? iMonotonicQuadraticWinding + monotonicQuadraticWinding(fArr2, 4, f2, f3, fArr3) : iMonotonicQuadraticWinding;
    }

    private static final void splitCubicAt(float[] fArr, int i2, float[] fArr2, int i3, float f2) {
        if (fArr.length >= i2 + 8 && fArr2.length >= i3 + 14) {
            int i4 = i3 + 13;
            int i5 = i3 + 12;
            int i6 = i3 + 11;
            int i7 = i3 + 10;
            int i8 = i3 + 9;
            int i9 = i3 + 8;
            int i10 = i2 + 7;
            int i11 = i2 + 6;
            if (f2 >= 1.0f) {
                c.aq(fArr, fArr2, i3, i2, 8);
                float f3 = fArr[i11];
                float f4 = fArr[i10];
                fArr2[i9] = f3;
                fArr2[i8] = f4;
                fArr2[i7] = f3;
                fArr2[i6] = f4;
                fArr2[i5] = f3;
                fArr2[i4] = f4;
                return;
            }
            float f5 = fArr[i2];
            float f6 = fArr[i2 + 1];
            fArr2[i3] = f5;
            fArr2[i3 + 1] = f6;
            float f7 = fArr[i2 + 2];
            float f8 = fArr[i2 + 3];
            float fLerp = MathHelpersKt.lerp(f5, f7, f2);
            float fLerp2 = MathHelpersKt.lerp(f6, f8, f2);
            fArr2[i3 + 2] = fLerp;
            fArr2[i3 + 3] = fLerp2;
            float f9 = fArr[i2 + 4];
            float f10 = fArr[i2 + 5];
            float fLerp3 = MathHelpersKt.lerp(f7, f9, f2);
            float fLerp4 = MathHelpersKt.lerp(f8, f10, f2);
            float fLerp5 = MathHelpersKt.lerp(fLerp, fLerp3, f2);
            float fLerp6 = MathHelpersKt.lerp(fLerp2, fLerp4, f2);
            fArr2[i3 + 4] = fLerp5;
            fArr2[i3 + 5] = fLerp6;
            float f11 = fArr[i11];
            float f12 = fArr[i10];
            float fLerp7 = MathHelpersKt.lerp(f9, f11, f2);
            float fLerp8 = MathHelpersKt.lerp(f10, f12, f2);
            float fLerp9 = MathHelpersKt.lerp(fLerp3, fLerp7, f2);
            float fLerp10 = MathHelpersKt.lerp(fLerp4, fLerp8, f2);
            float fLerp11 = MathHelpersKt.lerp(fLerp5, fLerp9, f2);
            float fLerp12 = MathHelpersKt.lerp(fLerp6, fLerp10, f2);
            fArr2[i3 + 6] = fLerp11;
            fArr2[i3 + 7] = fLerp12;
            fArr2[i9] = fLerp9;
            fArr2[i8] = fLerp10;
            fArr2[i7] = fLerp7;
            fArr2[i6] = fLerp8;
            fArr2[i5] = f11;
            fArr2[i4] = f12;
        }
    }

    private static final void splitQuadraticAt(float[] fArr, float[] fArr2, float f2) {
        if (fArr.length >= 6 && fArr2.length >= 10) {
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[2];
            float f6 = fArr[3];
            float f7 = fArr[4];
            float f8 = fArr[5];
            float fLerp = MathHelpersKt.lerp(f3, f5, f2);
            float fLerp2 = MathHelpersKt.lerp(f4, f6, f2);
            fArr2[0] = f3;
            fArr2[1] = f4;
            fArr2[2] = fLerp;
            fArr2[3] = fLerp2;
            float fLerp3 = MathHelpersKt.lerp(f5, f7, f2);
            float fLerp4 = MathHelpersKt.lerp(f6, f8, f2);
            float fLerp5 = MathHelpersKt.lerp(fLerp, fLerp3, f2);
            float fLerp6 = MathHelpersKt.lerp(fLerp2, fLerp4, f2);
            fArr2[4] = fLerp5;
            fArr2[5] = fLerp6;
            fArr2[6] = fLerp3;
            fArr2[7] = fLerp4;
            fArr2[8] = f7;
            fArr2[9] = f8;
        }
    }

    private static final float unitDivide(float f2, float f3) {
        if (f2 < 0.0f) {
            f2 = -f2;
            f3 = -f3;
        }
        if (f3 == 0.0f || f2 == 0.0f || f2 >= f3) {
            return Float.NaN;
        }
        float f4 = f2 / f3;
        if (f4 == 0.0f) {
            return Float.NaN;
        }
        return f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int writeValidRootInUnitRange(float f2, float[] fArr, int i2) {
        float f3 = f2 >= 0.0f ? f2 : 0.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > FloatEpsilon) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return Float.isNaN(f3) ? 0 : 1;
    }

    public static final boolean closeTo(float f2, float f3) {
        return Math.abs(f2 - f3) < FloatEpsilon;
    }

    public static final float evaluateCubic(float f2, float f3, float f4) {
        return ((((((f2 - f3) + 0.33333334f) * f4) + (f3 - (f2 + f2))) * f4) + f2) * 3.0f * f4;
    }
}
