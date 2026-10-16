package androidx.compose.animation.core;

import androidx.camera.video.AudioStats;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SpringEstimationKt {
    private static final long MAX_LONG_MILLIS = 9223372036854L;

    public static final long estimateAnimationDurationMillis(double d2, double d3, double d4, double d5, double d6, double d7) {
        double dSqrt = Math.sqrt(d2 * d4);
        double d8 = dSqrt + dSqrt;
        double d9 = (d3 * d3) - ((4.0d * d4) * d2);
        double dSqrt2 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double dSqrt3 = d9 < AudioStats.AUDIO_AMPLITUDE_NONE ? 0.0d : Math.sqrt(d9);
        if (d9 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            dSqrt2 = Math.sqrt(Math.abs(d9));
        }
        double d10 = -d3;
        double d11 = 1.0d / (d4 + d4);
        return estimateDurationInternal((d10 + dSqrt3) * d11, dSqrt2 * d11, (d10 - dSqrt3) * d11, d3 / d8, d5, d6, d7);
    }

    private static final double estimateCriticallyDamped(double d2, double d3, double d4, double d5) {
        double d6 = d5;
        double dLog = Math.log(Math.abs(d6 / d3)) / d2;
        double d7 = d2 * d3;
        double d8 = d4 - d7;
        double dLog2 = Math.log(Math.abs(d6 / d8));
        int i2 = 0;
        double dLog3 = dLog2;
        for (int i3 = 0; i3 < 6; i3++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d2));
        }
        double d9 = dLog3 / d2;
        if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
            dLog = d9;
        } else if ((Double.doubleToRawLongBits(d9) & Long.MAX_VALUE) < 9218868437227405312L) {
            dLog = Math.max(dLog, d9);
        }
        double d10 = (-(d7 + d8)) / (d2 * d8);
        double d11 = d2 * d10;
        double dExp = Math.exp(d11) * d3;
        double dExp2 = d8 * d10 * Math.exp(d11);
        if (Double.isNaN(d10) || d10 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            d6 = -d6;
        } else if (d10 <= AudioStats.AUDIO_AMPLITUDE_NONE || (-(dExp + dExp2)) >= d6) {
            dLog = (-(2.0d / d2)) - (d3 / d8);
        } else {
            d6 = -d6;
            if (d8 < AudioStats.AUDIO_AMPLITUDE_NONE && d3 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                dLog = 0.0d;
            }
        }
        double dAbs = Double.MAX_VALUE;
        while (dAbs > 0.001d && i2 < 100) {
            double d12 = d2 * dLog;
            double dExp3 = dLog - ((((d3 + (d8 * dLog)) * Math.exp(d12)) + d6) / ((((1.0d + d12) * d8) + d7) * Math.exp(d12)));
            i2++;
            dAbs = Math.abs(dLog - dExp3);
            dLog = dExp3;
        }
        return dLog;
    }

    private static final long estimateDurationInternal(double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        double d9 = d6;
        if (d7 == AudioStats.AUDIO_AMPLITUDE_NONE && d9 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return 0L;
        }
        if (d7 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d9 = -d9;
        }
        double d10 = d9;
        double dAbs = Math.abs(d7);
        return (long) ((d5 > 1.0d ? estimateOverDamped(d2, d4, dAbs, d10, d8) : d5 < 1.0d ? estimateUnderDamped(d2, d3, dAbs, d10, d8) : estimateCriticallyDamped(d2, dAbs, d10, d8)) * 1000.0d);
    }

    private static final double estimateOverDamped(double d2, double d3, double d4, double d5, double d6) {
        double d7 = d6;
        double d8 = d2 - d3;
        double d9 = ((d2 * d4) - d5) / d8;
        double d10 = d4 - d9;
        double dLog = Math.log(Math.abs(d7 / d10)) / d2;
        double dLog2 = Math.log(Math.abs(d7 / d9)) / d3;
        if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
            dLog = dLog2;
        } else if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
            dLog = Math.max(dLog, dLog2);
        }
        double d11 = d9 * d3;
        double d12 = d10 * d2;
        double dLog3 = Math.log(d12 / ((-d9) * d3)) / (d3 - d2);
        if (Double.isNaN(dLog3) || dLog3 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            d7 = -d7;
        } else if (dLog3 <= AudioStats.AUDIO_AMPLITUDE_NONE || (-estimateOverDamped$xInflection(d10, d2, dLog3, d9, d3)) >= d7) {
            dLog = Math.log((-(d11 * d3)) / (d12 * d2)) / d8;
        } else {
            d7 = -d7;
            if (d9 > AudioStats.AUDIO_AMPLITUDE_NONE && d10 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                dLog = 0.0d;
            }
        }
        if (Math.abs((Math.exp(d2 * dLog) * d12) + (Math.exp(d3 * dLog) * d11)) >= 1.0E-4d) {
            int i2 = 0;
            double dAbs = Double.MAX_VALUE;
            while (dAbs > 0.001d && i2 < 100) {
                double d13 = d2 * dLog;
                double d14 = d3 * dLog;
                double dExp = dLog - ((((Math.exp(d13) * d10) + (Math.exp(d14) * d9)) + d7) / ((Math.exp(d13) * d12) + (Math.exp(d14) * d11)));
                i2++;
                dAbs = Math.abs(dLog - dExp);
                dLog = dExp;
            }
        }
        return dLog;
    }

    private static final double estimateOverDamped$xInflection(double d2, double d3, double d4, double d5, double d6) {
        return (d2 * Math.exp(d3 * d4)) + (d5 * Math.exp(d6 * d4));
    }

    private static final double estimateUnderDamped(double d2, double d3, double d4, double d5, double d6) {
        double d7 = (d5 - (d2 * d4)) / d3;
        return Math.log(d6 / Math.sqrt((d4 * d4) + (d7 * d7))) / d2;
    }

    private static final boolean isNotFinite(double d2) {
        return (Double.doubleToRawLongBits(d2) & Long.MAX_VALUE) >= 9218868437227405312L;
    }

    private static final double iterateNewtonsMethod(double d2, l<? super Double, Double> lVar, l<? super Double, Double> lVar2) {
        Double dValueOf = Double.valueOf(d2);
        return d2 - (lVar.invoke(dValueOf).doubleValue() / lVar2.invoke(dValueOf).doubleValue());
    }

    public static final long estimateAnimationDurationMillis(double d2, double d3, double d4, double d5, double d6) {
        double dSqrt = (d3 + d3) * Math.sqrt(d2);
        double d7 = (dSqrt * dSqrt) - (4.0d * d2);
        double dSqrt2 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double dSqrt3 = d7 < AudioStats.AUDIO_AMPLITUDE_NONE ? 0.0d : Math.sqrt(d7);
        if (d7 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            dSqrt2 = Math.sqrt(Math.abs(d7));
        }
        double d8 = -dSqrt;
        return estimateDurationInternal((d8 + dSqrt3) * 0.5d, dSqrt2 * 0.5d, (d8 - dSqrt3) * 0.5d, d3, d4, d5, d6);
    }

    public static final long estimateAnimationDurationMillis(float f2, float f3, float f4, float f5, float f6) {
        return f3 == 0.0f ? MAX_LONG_MILLIS : estimateAnimationDurationMillis(f2, f3, f4, f5, f6);
    }
}
