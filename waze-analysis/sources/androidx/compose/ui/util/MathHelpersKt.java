package androidx.compose.ui.util;

import h.h.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MathHelpersKt {
    public static final float fastCbrt(float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f2) & 8589934591L) / 3)) + 709952852);
        float f3 = fIntBitsToFloat - ((fIntBitsToFloat - (f2 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static final double fastCoerceAtLeast(double d2, double d3) {
        return d2 < d3 ? d3 : d2;
    }

    public static final double fastCoerceAtMost(double d2, double d3) {
        return d2 > d3 ? d3 : d2;
    }

    public static final float fastCoerceIn(float f2, float f3, float f4) {
        if (f2 < f3) {
            f2 = f3;
        }
        return f2 > f4 ? f4 : f2;
    }

    public static final boolean fastIsFinite(double d2) {
        return (Double.doubleToRawLongBits(d2) & Long.MAX_VALUE) < 9218868437227405312L;
    }

    public static final float fastMaxOf(float f2, float f3, float f4, float f5) {
        return Math.max(f2, Math.max(f3, Math.max(f4, f5)));
    }

    public static final float fastMinOf(float f2, float f3, float f4, float f5) {
        return Math.min(f2, Math.min(f3, Math.min(f4, f5)));
    }

    public static final int lerp(int i2, int i3, float f2) {
        return i2 + ((int) Math.round((i3 - i2) * f2));
    }

    public static final float normalizedAngleCos(float f2) {
        float fFloor = (f2 + 0.25f) - ((float) Math.floor(0.5f + r2));
        float fAbs = Math.abs(fFloor);
        float f3 = fAbs + fAbs;
        float f4 = 1.0f - f3;
        return ((fFloor * 8.0f) * f4) / (1.25f - (f3 * f4));
    }

    public static final float normalizedAngleSin(float f2) {
        float fFloor = f2 - ((float) Math.floor(0.5f + f2));
        float fAbs = Math.abs(fFloor);
        float f3 = fAbs + fAbs;
        float f4 = 1.0f - f3;
        return ((fFloor * 8.0f) * f4) / (1.25f - (f3 * f4));
    }

    public static final float fastCoerceAtLeast(float f2, float f3) {
        return f2 < f3 ? f3 : f2;
    }

    public static final float fastCoerceAtMost(float f2, float f3) {
        return f2 > f3 ? f3 : f2;
    }

    public static final int fastCoerceAtLeast(int i2, int i3) {
        return i2 < i3 ? i3 : i2;
    }

    public static final int fastCoerceAtMost(int i2, int i3) {
        return i2 > i3 ? i3 : i2;
    }

    public static final long fastCoerceAtLeast(long j2, long j3) {
        return j2 < j3 ? j3 : j2;
    }

    public static final long fastCoerceAtMost(long j2, long j3) {
        return j2 > j3 ? j3 : j2;
    }

    public static final float lerp(float f2, float f3, float f4) {
        return ((1.0f - f4) * f2) + (f4 * f3);
    }

    public static final double fastCoerceIn(double d2, double d3, double d4) {
        if (d2 < d3) {
            d2 = d3;
        }
        return d2 > d4 ? d4 : d2;
    }

    public static final long lerp(long j2, long j3, float f2) {
        return j2 + a.c((j3 - j2) * f2);
    }

    public static final int fastCoerceIn(int i2, int i3, int i4) {
        if (i2 < i3) {
            i2 = i3;
        }
        return i2 > i4 ? i4 : i2;
    }

    public static final long fastCoerceIn(long j2, long j3, long j4) {
        if (j2 < j3) {
            j2 = j3;
        }
        return j2 > j4 ? j4 : j2;
    }

    public static final boolean fastIsFinite(float f2) {
        return (Float.floatToRawIntBits(f2) & Integer.MAX_VALUE) < 2139095040;
    }
}
